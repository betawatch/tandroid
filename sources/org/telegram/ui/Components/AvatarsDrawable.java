package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import java.util.Random;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Stories.StoriesGradientTools;

/* loaded from: classes5.dex */
public class AvatarsDrawable {
    private boolean attached;
    boolean centered;
    public int count;
    int currentStyle;
    public boolean drawStoriesCircle;
    public int height;
    private boolean isInCall;
    public float maxX;
    private int overrideSize;
    View parent;
    private boolean showSavedMessages;
    StoriesGradientTools storiesTools;
    private boolean transitionInProgress;
    ValueAnimator transitionProgressAnimator;
    boolean updateAfterTransition;
    Runnable updateDelegate;
    boolean wasDraw;
    public int width;
    public DrawingState[] currentStates = new DrawingState[3];
    public DrawingState[] animatingStates = new DrawingState[3];
    float transitionProgress = 1.0f;
    private Paint paint = new Paint(1);
    private Paint xRefP = new Paint(1);
    public int strokeWidth = AndroidUtilities.dp(1.67f);
    private float overrideSizeStepFactor = 0.8f;
    private float overrideAlpha = 1.0f;
    public long transitionDuration = 220;
    public Interpolator transitionInterpolator = CubicBezierInterpolator.DEFAULT;
    Random random = new Random();

    public static class DrawingState {
        private int animationType;
        public AvatarDrawable avatarDrawable;
        private long id;
        private ImageReceiver imageReceiver;
        private long lastSpeakTime;
        private long lastUpdateTime;
        private int moveFromIndex;
        private TLObject object;
        TLRPC.TL_groupCallParticipant participant;
        private GroupCallUserCell.AvatarWavesDrawable wavesDrawable;
    }

    public AvatarsDrawable(View view, boolean z) {
        this.parent = view;
        for (int i = 0; i < 3; i++) {
            this.currentStates[i] = new DrawingState();
            this.currentStates[i].imageReceiver = new ImageReceiver(view);
            this.currentStates[i].imageReceiver.setInvalidateAll(true);
            this.currentStates[i].imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.currentStates[i].avatarDrawable = new AvatarDrawable();
            this.currentStates[i].avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            this.animatingStates[i] = new DrawingState();
            this.animatingStates[i].imageReceiver = new ImageReceiver(view);
            this.animatingStates[i].imageReceiver.setInvalidateAll(true);
            this.animatingStates[i].imageReceiver.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.animatingStates[i].avatarDrawable = new AvatarDrawable();
            this.animatingStates[i].avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.isInCall = z;
        this.xRefP.setColor(0);
        this.xRefP.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidate() {
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$commitTransition$0(ValueAnimator valueAnimator) {
        this.transitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void swapStates() {
        for (int i = 0; i < 3; i++) {
            DrawingState[] drawingStateArr = this.currentStates;
            DrawingState drawingState = drawingStateArr[i];
            DrawingState[] drawingStateArr2 = this.animatingStates;
            drawingStateArr[i] = drawingStateArr2[i];
            drawingStateArr2[i] = drawingState;
        }
    }

    public void animateFromState(AvatarsDrawable avatarsDrawable, int i, boolean z) {
        if (avatarsDrawable == null) {
            return;
        }
        ValueAnimator valueAnimator = avatarsDrawable.transitionProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.transitionInProgress) {
                this.transitionInProgress = false;
                swapStates();
            }
        }
        TLObject[] tLObjectArr = new TLObject[3];
        for (int i2 = 0; i2 < 3; i2++) {
            tLObjectArr[i2] = this.currentStates[i2].object;
            setObject(i2, i, avatarsDrawable.currentStates[i2].object);
        }
        commitTransition(false);
        for (int i3 = 0; i3 < 3; i3++) {
            setObject(i3, i, tLObjectArr[i3]);
        }
        this.wasDraw = true;
        commitTransition(true, z);
    }

    public void commitTransition(boolean z) {
        commitTransition(z, true);
    }

    public void commitTransition(boolean z, boolean z2) {
        if (!this.wasDraw || !z) {
            this.transitionProgress = 1.0f;
            swapStates();
            return;
        }
        DrawingState[] drawingStateArr = new DrawingState[3];
        boolean z3 = false;
        for (int i = 0; i < 3; i++) {
            DrawingState[] drawingStateArr2 = this.currentStates;
            drawingStateArr[i] = drawingStateArr2[i];
            if (drawingStateArr2[i].id != this.animatingStates[i].id) {
                z3 = true;
            } else {
                this.currentStates[i].lastSpeakTime = this.animatingStates[i].lastSpeakTime;
            }
        }
        if (!z3) {
            this.transitionProgress = 1.0f;
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    this.animatingStates[i2].animationType = 0;
                    break;
                }
                if (this.currentStates[i3].id == this.animatingStates[i2].id) {
                    drawingStateArr[i3] = null;
                    if (i2 == i3) {
                        this.animatingStates[i2].animationType = -1;
                        GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable = this.animatingStates[i2].wavesDrawable;
                        this.animatingStates[i2].wavesDrawable = this.currentStates[i2].wavesDrawable;
                        this.currentStates[i2].wavesDrawable = avatarWavesDrawable;
                    } else {
                        this.animatingStates[i2].animationType = 2;
                        this.animatingStates[i2].moveFromIndex = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            DrawingState drawingState = drawingStateArr[i4];
            if (drawingState != null) {
                drawingState.animationType = 1;
            }
        }
        ValueAnimator valueAnimator = this.transitionProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.transitionProgressAnimator.cancel();
            if (this.transitionInProgress) {
                swapStates();
                this.transitionInProgress = false;
            }
        }
        this.transitionProgress = 0.0f;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.transitionProgressAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.AvatarsDrawable$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AvatarsDrawable.this.lambda$commitTransition$0(valueAnimator2);
                }
            });
            this.transitionProgressAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.AvatarsDrawable.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AvatarsDrawable avatarsDrawable = AvatarsDrawable.this;
                    if (avatarsDrawable.transitionProgressAnimator != null) {
                        avatarsDrawable.transitionProgress = 1.0f;
                        avatarsDrawable.swapStates();
                        AvatarsDrawable avatarsDrawable2 = AvatarsDrawable.this;
                        if (avatarsDrawable2.updateAfterTransition) {
                            avatarsDrawable2.updateAfterTransition = false;
                            Runnable runnable = avatarsDrawable2.updateDelegate;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                        AvatarsDrawable.this.invalidate();
                    }
                    AvatarsDrawable.this.transitionProgressAnimator = null;
                }
            });
            this.transitionProgressAnimator.setDuration(this.transitionDuration);
            this.transitionProgressAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.transitionProgressAnimator.start();
        } else {
            this.transitionInProgress = true;
        }
        invalidate();
    }

    public float getMaxX() {
        return this.maxX;
    }

    public int getSize() {
        int i = this.overrideSize;
        if (i != 0) {
            return i;
        }
        int i2 = this.currentStyle;
        return AndroidUtilities.dp((i2 == 4 || i2 == 10) ? 32.0f : 24.0f);
    }

    public void onAttachedToWindow() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        for (int i = 0; i < 3; i++) {
            this.currentStates[i].imageReceiver.onAttachedToWindow();
            this.animatingStates[i].imageReceiver.onAttachedToWindow();
        }
    }

    public void onDetachedFromWindow() {
        if (this.attached) {
            this.attached = false;
            this.wasDraw = false;
            for (int i = 0; i < 3; i++) {
                this.currentStates[i].imageReceiver.onDetachedFromWindow();
                this.animatingStates[i].imageReceiver.onDetachedFromWindow();
            }
            if (this.currentStyle == 3) {
                Theme.getFragmentContextViewWavesDrawable().setAmplitude(0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        float f2;
        int i5;
        int i6;
        int i7;
        float f3;
        boolean z2;
        float f4;
        int i8;
        int i9;
        DrawingState drawingState;
        float avatarScale;
        DrawingState drawingState2;
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant;
        DrawingState drawingState3;
        GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable;
        GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable2;
        int i10;
        GroupCallUserCell.AvatarWavesDrawable avatarWavesDrawable3;
        double d;
        float f5;
        int i11;
        float f6;
        boolean z3;
        int i12;
        int i13 = 1;
        this.wasDraw = true;
        int i14 = this.currentStyle;
        int i15 = 10;
        boolean z4 = i14 == 4 || i14 == 10;
        int size = getSize();
        int i16 = 11;
        if (this.currentStyle == 11) {
            f = 12.0f;
        } else {
            int i17 = this.overrideSize;
            if (i17 != 0) {
                i = (int) (i17 * this.overrideSizeStepFactor);
                int i18 = i;
                int i19 = 0;
                for (i2 = 0; i2 < 3; i2++) {
                    if (this.currentStates[i2].id != 0) {
                        i19++;
                    }
                }
                int i20 = this.currentStyle;
                int dp = (i20 != 0 || i20 == 10 || i20 == 11) ? 0 : AndroidUtilities.dp(10.0f);
                int dp2 = this.centered ? dp : ((this.width - (i19 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / 2;
                boolean z5 = VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().isMicMute();
                i3 = this.currentStyle;
                if (i3 != 4) {
                    this.paint.setColor(Theme.getColor(Theme.key_inappPlayerBackground));
                } else if (i3 != 3) {
                    this.paint.setColor(Theme.getColor(z5 ? Theme.key_returnToCallMutedBackground : Theme.key_returnToCallBackground));
                }
                int i21 = 0;
                for (i4 = 0; i4 < 3; i4++) {
                    if (this.animatingStates[i4].id != 0) {
                        i21++;
                    }
                }
                int i22 = this.currentStyle;
                z = i22 != 0 || i22 == 1 || i22 == 3 || i22 == 4 || i22 == 5 || i22 == 10 || i22 == 11;
                if (z) {
                    f2 = 0.0f;
                    i5 = 2;
                } else {
                    float dp3 = i22 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
                    if (this.drawStoriesCircle) {
                        dp3 += AndroidUtilities.dp(20.0f);
                    }
                    float f7 = -dp3;
                    f2 = 0.0f;
                    i5 = 2;
                    canvas.saveLayerAlpha(f7, f7, this.width + dp3, this.height + dp3, NotificationCenter.proxyCheckDone, 31);
                }
                this.maxX = f2;
                int i23 = -1;
                float f8 = 2.0f;
                float f9 = 1.0f;
                if (this.drawStoriesCircle) {
                    int i24 = 2;
                    while (i24 >= 0) {
                        int i25 = 0;
                        while (i25 < i5) {
                            if (i25 != 0 || this.transitionProgress != 1.0f) {
                                DrawingState[] drawingStateArr = i25 == 0 ? this.animatingStates : this.currentStates;
                                if (i25 != i13 || this.transitionProgress == 1.0f || drawingStateArr[i24].animationType == i13) {
                                    ImageReceiver imageReceiver = drawingStateArr[i24].imageReceiver;
                                    if (imageReceiver.hasImageSet()) {
                                        if (i25 == 0) {
                                            i11 = (this.centered ? ((this.width - (i21 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / i5 : dp) + (i18 * i24);
                                        } else {
                                            i11 = dp2 + (i18 * i24);
                                        }
                                        imageReceiver.setImageX(i11);
                                        int i26 = this.currentStyle;
                                        imageReceiver.setImageY((i26 == 0 || i26 == i15 || i26 == i16) ? (this.height - size) / f8 : AndroidUtilities.dp(i26 == 4 ? 8.0f : 6.0f));
                                        if (this.transitionProgress != 1.0f) {
                                            if (drawingStateArr[i24].animationType == i13) {
                                                canvas.save();
                                                float f10 = 1.0f - this.transitionProgress;
                                                canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                                f6 = 1.0f - this.transitionProgress;
                                            } else if (drawingStateArr[i24].animationType == 0) {
                                                canvas.save();
                                                float f11 = this.transitionProgress;
                                                canvas.scale(f11, f11, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                                f6 = this.transitionProgress;
                                            } else {
                                                if (drawingStateArr[i24].animationType == i5) {
                                                    int dp4 = this.centered ? ((this.width - (i21 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / i5 : dp;
                                                    int i27 = dp2 + (drawingStateArr[i24].moveFromIndex * i18);
                                                    float f12 = this.transitionProgress;
                                                    i12 = (int) (((dp4 + (i18 * i24)) * f12) + (i27 * (1.0f - f12)));
                                                } else if (drawingStateArr[i24].animationType == i23 && this.centered) {
                                                    int dp5 = ((this.width - (i21 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / i5;
                                                    int i28 = i18 * i24;
                                                    float f13 = this.transitionProgress;
                                                    i12 = (int) (((dp5 + i28) * f13) + ((dp2 + i28) * (1.0f - f13)));
                                                }
                                                imageReceiver.setImageX(i12);
                                            }
                                            z3 = true;
                                            float f14 = f6 * this.overrideAlpha;
                                            float size2 = (getSize() / f8) + AndroidUtilities.dp(4.0f);
                                            if (this.storiesTools == null) {
                                                this.storiesTools = new StoriesGradientTools();
                                            }
                                            this.storiesTools.setBounds(0.0f, 0.0f, this.parent.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                            this.storiesTools.paint.setAlpha((int) (f14 * 255.0f));
                                            canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), size2, this.storiesTools.paint);
                                            if (!z3) {
                                                canvas.restore();
                                            }
                                        }
                                        f6 = 1.0f;
                                        z3 = false;
                                        float f142 = f6 * this.overrideAlpha;
                                        float size22 = (getSize() / f8) + AndroidUtilities.dp(4.0f);
                                        if (this.storiesTools == null) {
                                        }
                                        this.storiesTools.setBounds(0.0f, 0.0f, this.parent.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                        this.storiesTools.paint.setAlpha((int) (f142 * 255.0f));
                                        canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), size22, this.storiesTools.paint);
                                        if (!z3) {
                                        }
                                    }
                                }
                            }
                            i25++;
                            i23 = -1;
                            f8 = 2.0f;
                            i13 = 1;
                            i15 = 10;
                            i16 = 11;
                        }
                        i24--;
                        i23 = -1;
                        f8 = 2.0f;
                        i13 = 1;
                        i15 = 10;
                        i16 = 11;
                    }
                }
                i6 = 2;
                while (i6 >= 0) {
                    int i29 = 0;
                    while (i29 < i5) {
                        if (i29 != 0 || this.transitionProgress != f9) {
                            DrawingState[] drawingStateArr2 = i29 == 0 ? this.animatingStates : this.currentStates;
                            if (i29 != 1 || this.transitionProgress == f9 || drawingStateArr2[i6].animationType == 1) {
                                ImageReceiver imageReceiver2 = drawingStateArr2[i6].imageReceiver;
                                if (imageReceiver2.hasImageSet()) {
                                    if (i29 == 0) {
                                        i7 = (this.centered ? ((this.width - (i21 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / i5 : dp) + (i18 * i6);
                                    } else {
                                        i7 = dp2 + (i18 * i6);
                                    }
                                    imageReceiver2.setImageX(i7);
                                    int i30 = this.currentStyle;
                                    if (i30 != 0 && i30 != 10) {
                                        if (i30 != 11) {
                                            f3 = AndroidUtilities.dp(i30 == 4 ? 8.0f : 6.0f);
                                            imageReceiver2.setImageY(f3);
                                            if (this.transitionProgress != f9) {
                                                if (drawingStateArr2[i6].animationType == 1) {
                                                    canvas.save();
                                                    float f15 = f9 - this.transitionProgress;
                                                    canvas.scale(f15, f15, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                                    f5 = f9 - this.transitionProgress;
                                                } else if (drawingStateArr2[i6].animationType == 0) {
                                                    canvas.save();
                                                    float f16 = this.transitionProgress;
                                                    canvas.scale(f16, f16, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                                    f5 = this.transitionProgress;
                                                } else if (drawingStateArr2[i6].animationType == i5) {
                                                    int dp6 = this.centered ? ((this.width - (i21 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / i5 : dp;
                                                    int i31 = dp2 + (drawingStateArr2[i6].moveFromIndex * i18);
                                                    float f17 = this.transitionProgress;
                                                    imageReceiver2.setImageX((int) (((dp6 + (i18 * i6)) * f17) + (i31 * (f9 - f17))));
                                                } else {
                                                    if (drawingStateArr2[i6].animationType == -1 && this.centered) {
                                                        int dp7 = ((this.width - (i21 * i18)) - AndroidUtilities.dp(z4 ? 8.0f : 4.0f)) / i5;
                                                        int i32 = i18 * i6;
                                                        float f18 = this.transitionProgress;
                                                        imageReceiver2.setImageX((int) (((dp7 + i32) * f18) + ((dp2 + i32) * (f9 - f18))));
                                                    }
                                                    z2 = false;
                                                    f4 = 1.0f;
                                                    float f19 = f4 * this.overrideAlpha;
                                                    if (i6 == drawingStateArr2.length - 1 || this.drawStoriesCircle) {
                                                        i8 = this.currentStyle;
                                                        if (i8 != 1 || i8 == 3) {
                                                            i9 = 5;
                                                        } else {
                                                            i9 = 5;
                                                            if (i8 != 5) {
                                                                if (i8 == 4 || i8 == 10) {
                                                                    canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), this.xRefP);
                                                                    if (drawingStateArr2[i6].wavesDrawable == null) {
                                                                        drawingStateArr2[i6].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                                    }
                                                                    if (this.currentStyle == 10) {
                                                                        avatarWavesDrawable2 = drawingStateArr2[i6].wavesDrawable;
                                                                        i10 = Theme.key_voipgroup_speakingText;
                                                                    } else {
                                                                        avatarWavesDrawable2 = drawingStateArr2[i6].wavesDrawable;
                                                                        i10 = Theme.key_voipgroup_listeningText;
                                                                    }
                                                                    avatarWavesDrawable2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i10), (int) (f19 * 76.5f)));
                                                                    long currentTimeMillis = System.currentTimeMillis();
                                                                    if (currentTimeMillis - drawingStateArr2[i6].lastUpdateTime > 100) {
                                                                        drawingStateArr2[i6].lastUpdateTime = currentTimeMillis;
                                                                        if (this.currentStyle == 10) {
                                                                            DrawingState drawingState4 = drawingStateArr2[i6];
                                                                            TLRPC.TL_groupCallParticipant tL_groupCallParticipant2 = drawingState4.participant;
                                                                            if (tL_groupCallParticipant2 == null || tL_groupCallParticipant2.amplitude <= 0.0f) {
                                                                                drawingState4.wavesDrawable.setShowWaves(false, this.parent);
                                                                            } else {
                                                                                drawingState4.wavesDrawable.setShowWaves(true, this.parent);
                                                                                DrawingState drawingState5 = drawingStateArr2[i6];
                                                                                float f20 = drawingState5.participant.amplitude * 15.0f;
                                                                                avatarWavesDrawable3 = drawingState5.wavesDrawable;
                                                                                d = f20;
                                                                            }
                                                                        } else if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - drawingStateArr2[i6].lastSpeakTime <= 5) {
                                                                            drawingStateArr2[i6].wavesDrawable.setShowWaves(true, this.parent);
                                                                            avatarWavesDrawable3 = drawingStateArr2[i6].wavesDrawable;
                                                                            d = this.random.nextInt() % 100;
                                                                        } else {
                                                                            drawingStateArr2[i6].wavesDrawable.setShowWaves(false, this.parent);
                                                                            avatarWavesDrawable3 = drawingStateArr2[i6].wavesDrawable;
                                                                            d = 0.0d;
                                                                        }
                                                                        avatarWavesDrawable3.setAmplitude(d);
                                                                    }
                                                                    drawingStateArr2[i6].wavesDrawable.update();
                                                                    drawingStateArr2[i6].wavesDrawable.draw(canvas, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), this.parent);
                                                                    drawingState = drawingStateArr2[i6];
                                                                    avatarScale = drawingState.wavesDrawable.getAvatarScale();
                                                                    imageReceiver2.setAlpha(f19);
                                                                    f9 = 1.0f;
                                                                    if (avatarScale == 1.0f) {
                                                                        canvas.save();
                                                                        canvas.scale(avatarScale, avatarScale, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                                                        imageReceiver2.draw(canvas);
                                                                        canvas.restore();
                                                                    } else {
                                                                        imageReceiver2.draw(canvas);
                                                                    }
                                                                    this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                                    if (!z2) {
                                                                        canvas.restore();
                                                                    }
                                                                    i29++;
                                                                    i5 = 2;
                                                                } else {
                                                                    float size3 = (getSize() / 2.0f) + this.strokeWidth;
                                                                    if (z) {
                                                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, this.xRefP);
                                                                    } else {
                                                                        int alpha = this.paint.getAlpha();
                                                                        if (f19 != f9) {
                                                                            this.paint.setAlpha((int) (alpha * f19));
                                                                        }
                                                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, this.paint);
                                                                        if (f19 != f9) {
                                                                            this.paint.setAlpha(alpha);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                                        if (drawingStateArr2[i6].wavesDrawable == null) {
                                                            if (this.currentStyle == i9) {
                                                                drawingState3 = drawingStateArr2[i6];
                                                                avatarWavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                                            } else {
                                                                drawingState3 = drawingStateArr2[i6];
                                                                avatarWavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                            }
                                                            drawingState3.wavesDrawable = avatarWavesDrawable;
                                                        }
                                                        if (this.currentStyle == i9) {
                                                            drawingStateArr2[i6].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_speakingText), (int) (f19 * 76.5f)));
                                                        }
                                                        drawingState2 = drawingStateArr2[i6];
                                                        tL_groupCallParticipant = drawingState2.participant;
                                                        if (tL_groupCallParticipant != null || tL_groupCallParticipant.amplitude <= 0.0f) {
                                                            drawingState2.wavesDrawable.setShowWaves(false, this.parent);
                                                        } else {
                                                            drawingState2.wavesDrawable.setShowWaves(true, this.parent);
                                                            drawingStateArr2[i6].wavesDrawable.setAmplitude(r5.participant.amplitude * 15.0f);
                                                        }
                                                        if (this.currentStyle == i9 && SystemClock.uptimeMillis() - drawingStateArr2[i6].participant.lastSpeakTime > 500) {
                                                            this.updateDelegate.run();
                                                        }
                                                        drawingStateArr2[i6].wavesDrawable.update();
                                                        if (this.currentStyle == i9) {
                                                            drawingStateArr2[i6].wavesDrawable.draw(canvas, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), this.parent);
                                                            invalidate();
                                                        }
                                                        drawingState = drawingStateArr2[i6];
                                                        avatarScale = drawingState.wavesDrawable.getAvatarScale();
                                                        imageReceiver2.setAlpha(f19);
                                                        f9 = 1.0f;
                                                        if (avatarScale == 1.0f) {
                                                        }
                                                        this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                        if (!z2) {
                                                        }
                                                        i29++;
                                                        i5 = 2;
                                                    }
                                                    avatarScale = 1.0f;
                                                    imageReceiver2.setAlpha(f19);
                                                    f9 = 1.0f;
                                                    if (avatarScale == 1.0f) {
                                                    }
                                                    this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                    if (!z2) {
                                                    }
                                                    i29++;
                                                    i5 = 2;
                                                }
                                                f4 = f5;
                                                z2 = true;
                                                float f192 = f4 * this.overrideAlpha;
                                                if (i6 == drawingStateArr2.length - 1) {
                                                }
                                                i8 = this.currentStyle;
                                                if (i8 != 1) {
                                                }
                                                i9 = 5;
                                                canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                                if (drawingStateArr2[i6].wavesDrawable == null) {
                                                }
                                                if (this.currentStyle == i9) {
                                                }
                                                drawingState2 = drawingStateArr2[i6];
                                                tL_groupCallParticipant = drawingState2.participant;
                                                if (tL_groupCallParticipant != null) {
                                                }
                                                drawingState2.wavesDrawable.setShowWaves(false, this.parent);
                                                if (this.currentStyle == i9) {
                                                    this.updateDelegate.run();
                                                }
                                                drawingStateArr2[i6].wavesDrawable.update();
                                                if (this.currentStyle == i9) {
                                                }
                                                drawingState = drawingStateArr2[i6];
                                                avatarScale = drawingState.wavesDrawable.getAvatarScale();
                                                imageReceiver2.setAlpha(f192);
                                                f9 = 1.0f;
                                                if (avatarScale == 1.0f) {
                                                }
                                                this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                if (!z2) {
                                                }
                                                i29++;
                                                i5 = 2;
                                            }
                                            z2 = false;
                                            f4 = 1.0f;
                                            float f1922 = f4 * this.overrideAlpha;
                                            if (i6 == drawingStateArr2.length - 1) {
                                            }
                                            i8 = this.currentStyle;
                                            if (i8 != 1) {
                                            }
                                            i9 = 5;
                                            canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                            if (drawingStateArr2[i6].wavesDrawable == null) {
                                            }
                                            if (this.currentStyle == i9) {
                                            }
                                            drawingState2 = drawingStateArr2[i6];
                                            tL_groupCallParticipant = drawingState2.participant;
                                            if (tL_groupCallParticipant != null) {
                                            }
                                            drawingState2.wavesDrawable.setShowWaves(false, this.parent);
                                            if (this.currentStyle == i9) {
                                            }
                                            drawingStateArr2[i6].wavesDrawable.update();
                                            if (this.currentStyle == i9) {
                                            }
                                            drawingState = drawingStateArr2[i6];
                                            avatarScale = drawingState.wavesDrawable.getAvatarScale();
                                            imageReceiver2.setAlpha(f1922);
                                            f9 = 1.0f;
                                            if (avatarScale == 1.0f) {
                                            }
                                            this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                            if (!z2) {
                                            }
                                            i29++;
                                            i5 = 2;
                                        }
                                    }
                                    f3 = (this.height - size) / 2.0f;
                                    imageReceiver2.setImageY(f3);
                                    if (this.transitionProgress != f9) {
                                    }
                                    z2 = false;
                                    f4 = 1.0f;
                                    float f19222 = f4 * this.overrideAlpha;
                                    if (i6 == drawingStateArr2.length - 1) {
                                    }
                                    i8 = this.currentStyle;
                                    if (i8 != 1) {
                                    }
                                    i9 = 5;
                                    canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                    if (drawingStateArr2[i6].wavesDrawable == null) {
                                    }
                                    if (this.currentStyle == i9) {
                                    }
                                    drawingState2 = drawingStateArr2[i6];
                                    tL_groupCallParticipant = drawingState2.participant;
                                    if (tL_groupCallParticipant != null) {
                                    }
                                    drawingState2.wavesDrawable.setShowWaves(false, this.parent);
                                    if (this.currentStyle == i9) {
                                    }
                                    drawingStateArr2[i6].wavesDrawable.update();
                                    if (this.currentStyle == i9) {
                                    }
                                    drawingState = drawingStateArr2[i6];
                                    avatarScale = drawingState.wavesDrawable.getAvatarScale();
                                    imageReceiver2.setAlpha(f19222);
                                    f9 = 1.0f;
                                    if (avatarScale == 1.0f) {
                                    }
                                    this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                    if (!z2) {
                                    }
                                    i29++;
                                    i5 = 2;
                                }
                            }
                        }
                        i29++;
                        i5 = 2;
                    }
                    i6--;
                    i5 = 2;
                }
                if (z) {
                    return;
                }
                canvas.restore();
                return;
            }
            f = z4 ? 24.0f : 20.0f;
        }
        i = AndroidUtilities.dp(f);
        int i182 = i;
        int i192 = 0;
        while (i2 < 3) {
        }
        int i202 = this.currentStyle;
        if (i202 != 0) {
        }
        if (this.centered) {
        }
        if (VoIPService.getSharedInstance() == null) {
        }
        i3 = this.currentStyle;
        if (i3 != 4) {
        }
        int i212 = 0;
        while (i4 < 3) {
        }
        int i222 = this.currentStyle;
        if (i222 != 0) {
        }
        if (z) {
        }
        this.maxX = f2;
        int i232 = -1;
        float f82 = 2.0f;
        float f92 = 1.0f;
        if (this.drawStoriesCircle) {
        }
        i6 = 2;
        while (i6 >= 0) {
        }
        if (z) {
        }
    }

    public void reset() {
        for (int i = 0; i < this.animatingStates.length; i++) {
            setObject(0, 0, null);
        }
    }

    public void setAlpha(float f) {
        this.overrideAlpha = f;
    }

    public void setAvatarsTextSize(int i) {
        AvatarDrawable avatarDrawable;
        AvatarDrawable avatarDrawable2;
        for (int i2 = 0; i2 < 3; i2++) {
            DrawingState drawingState = this.currentStates[i2];
            if (drawingState != null && (avatarDrawable2 = drawingState.avatarDrawable) != null) {
                avatarDrawable2.setTextSize(i);
            }
            DrawingState drawingState2 = this.animatingStates[i2];
            if (drawingState2 != null && (avatarDrawable = drawingState2.avatarDrawable) != null) {
                avatarDrawable.setTextSize(i);
            }
        }
    }

    public void setCentered(boolean z) {
        this.centered = z;
    }

    public void setCount(int i) {
        this.count = i;
        View view = this.parent;
        if (view != null) {
            view.requestLayout();
        }
    }

    public void setDelegate(Runnable runnable) {
        this.updateDelegate = runnable;
    }

    public void setObject(int i, int i2, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        ImageLocation forPhoto;
        String str;
        ImageLocation forPhoto2;
        StringBuilder sb;
        DrawingState drawingState;
        long j;
        this.animatingStates[i].id = 0L;
        DrawingState drawingState2 = this.animatingStates[i];
        drawingState2.participant = null;
        if (tLObject == null) {
            drawingState2.imageReceiver.setImageBitmap((Drawable) null);
        } else {
            drawingState2.lastSpeakTime = -1L;
            this.animatingStates[i].object = tLObject;
            if (tLObject instanceof TLRPC.TL_groupCallParticipant) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = (TLRPC.TL_groupCallParticipant) tLObject;
                this.animatingStates[i].participant = tL_groupCallParticipant;
                long peerId = MessageObject.getPeerId(tL_groupCallParticipant.peer);
                if (DialogObject.isUserDialog(peerId)) {
                    user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerId));
                    this.animatingStates[i].avatarDrawable.setInfo(i2, user);
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerId));
                    this.animatingStates[i].avatarDrawable.setInfo(i2, chat2);
                    chat = chat2;
                    user = null;
                }
                if (this.currentStyle != 4) {
                    drawingState = this.animatingStates[i];
                } else if (peerId == AccountInstance.getInstance(i2).getUserConfig().getClientUserId()) {
                    this.animatingStates[i].lastSpeakTime = 0L;
                    this.animatingStates[i].id = peerId;
                } else if (this.isInCall) {
                    drawingState = this.animatingStates[i];
                    j = tL_groupCallParticipant.lastActiveDate;
                    drawingState.lastSpeakTime = j;
                    this.animatingStates[i].id = peerId;
                } else {
                    drawingState = this.animatingStates[i];
                }
                j = tL_groupCallParticipant.active_date;
                drawingState.lastSpeakTime = j;
                this.animatingStates[i].id = peerId;
            } else if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
                if (user.self && this.showSavedMessages) {
                    this.animatingStates[i].avatarDrawable.setAvatarType(1);
                    this.animatingStates[i].avatarDrawable.setScaleSize(0.6f);
                } else {
                    this.animatingStates[i].avatarDrawable.setAvatarType(0);
                    this.animatingStates[i].avatarDrawable.setScaleSize(1.0f);
                    this.animatingStates[i].avatarDrawable.setInfo(i2, user);
                }
                this.animatingStates[i].id = user.id;
                chat = null;
            } else if (tLObject instanceof TLRPC.Chat) {
                chat = (TLRPC.Chat) tLObject;
                this.animatingStates[i].avatarDrawable.setAvatarType(0);
                this.animatingStates[i].avatarDrawable.setScaleSize(1.0f);
                this.animatingStates[i].avatarDrawable.setInfo(i2, chat);
                this.animatingStates[i].id = -chat.id;
                user = null;
            } else {
                user = null;
                chat = null;
            }
            int size = getSize();
            if (tLObject instanceof TL_stories.StoryItem) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
                this.animatingStates[i].id = storyItem.id;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true);
                    imageReceiver = this.animatingStates[i].imageReceiver;
                    forPhoto = ImageLocation.getForDocument(closestPhotoSizeWithSize2, storyItem.media.document);
                    str = size + "_" + size;
                    forPhoto2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document);
                    sb = new StringBuilder();
                } else {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize3, true);
                        imageReceiver = this.animatingStates[i].imageReceiver;
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize4, storyItem.media.photo);
                        str = size + "_" + size;
                        forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize3, storyItem.media.photo);
                        sb = new StringBuilder();
                    }
                }
                sb.append(size);
                sb.append("_");
                sb.append(size);
                imageReceiver.setImage(forPhoto, str, forPhoto2, sb.toString(), 0L, null, storyItem, 0);
            } else if (user == null) {
                this.animatingStates[i].imageReceiver.setForUserOrChat(chat, this.animatingStates[i].avatarDrawable);
            } else if (user.self && this.showSavedMessages) {
                this.animatingStates[i].imageReceiver.setImageBitmap(this.animatingStates[i].avatarDrawable);
            } else {
                this.animatingStates[i].imageReceiver.setForUserOrChat(user, this.animatingStates[i].avatarDrawable);
            }
            this.animatingStates[i].imageReceiver.setRoundRadius(size / 2);
            float f = size;
            this.animatingStates[i].imageReceiver.setImageCoords(0.0f, 0.0f, f, f);
        }
        invalidate();
    }

    public void setShowSavedMessages(boolean z) {
        this.showSavedMessages = z;
    }

    public void setSize(int i) {
        this.overrideSize = i;
    }

    public void setStepFactor(float f) {
        this.overrideSizeStepFactor = f;
    }

    public void setStyle(int i) {
        this.currentStyle = i;
        invalidate();
    }

    public void setTransitionProgress(float f) {
        if (!this.transitionInProgress || this.transitionProgress == f) {
            return;
        }
        this.transitionProgress = f;
        if (f == 1.0f) {
            swapStates();
            this.transitionInProgress = false;
        }
    }

    public void updateAfterTransitionEnd() {
        this.updateAfterTransition = true;
    }
}
