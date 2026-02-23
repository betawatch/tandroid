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

    public void commitTransition(boolean z) {
        commitTransition(z, true);
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

    public void updateAfterTransitionEnd() {
        this.updateAfterTransition = true;
    }

    public void setDelegate(Runnable runnable) {
        this.updateDelegate = runnable;
    }

    public void setStyle(int i) {
        this.currentStyle = i;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidate() {
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setSize(int i) {
        this.overrideSize = i;
    }

    public void setStepFactor(float f) {
        this.overrideSizeStepFactor = f;
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

    public void setAlpha(float f) {
        this.overrideAlpha = f;
    }

    public static class DrawingState {
        private int animationType;
        public AvatarDrawable avatarDrawable;
        private long id;
        private ImageReceiver imageReceiver;
        private long lastSpeakTime;
        private long lastUpdateTime;
        private int moveFromIndex;
        private TLObject object;
        TLRPC.GroupCallParticipant participant;
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

    public void setObject(int i, int i2, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        this.animatingStates[i].id = 0L;
        DrawingState drawingState = this.animatingStates[i];
        drawingState.participant = null;
        if (tLObject == null) {
            drawingState.imageReceiver.setImageBitmap((Drawable) null);
            invalidate();
            return;
        }
        drawingState.lastSpeakTime = -1L;
        this.animatingStates[i].object = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            this.animatingStates[i].participant = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
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
                this.animatingStates[i].lastSpeakTime = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i2).getUserConfig().getClientUserId()) {
                this.animatingStates[i].lastSpeakTime = 0L;
            } else if (this.isInCall) {
                this.animatingStates[i].lastSpeakTime = groupCallParticipant.lastActiveDate;
            } else {
                this.animatingStates[i].lastSpeakTime = groupCallParticipant.active_date;
            }
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
                this.animatingStates[i].imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, storyItem.media.document), size + "_" + size, ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), size + "_" + size, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize3, true);
                    this.animatingStates[i].imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, storyItem.media.photo), size + "_" + size, ImageLocation.getForPhoto(closestPhotoSizeWithSize3, storyItem.media.photo), size + "_" + size, 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            this.animatingStates[i].imageReceiver.setForUserOrChat(chat, this.animatingStates[i].avatarDrawable);
        } else if (!user.self || !this.showSavedMessages) {
            this.animatingStates[i].imageReceiver.setForUserOrChat(user, this.animatingStates[i].avatarDrawable);
        } else {
            this.animatingStates[i].imageReceiver.setImageBitmap(this.animatingStates[i].avatarDrawable);
        }
        this.animatingStates[i].imageReceiver.setRoundRadius(size / 2);
        float f = size;
        this.animatingStates[i].imageReceiver.setImageCoords(0.0f, 0.0f, f, f);
        invalidate();
    }

    public float getUsedWidth() {
        int dp;
        int i = this.currentStyle;
        boolean z = i == 4 || i == 10;
        if (i == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i2 = this.overrideSize;
            if (i2 != 0) {
                dp = (int) (i2 * this.overrideSizeStepFactor);
            } else {
                dp = AndroidUtilities.dp(z ? 24.0f : 20.0f);
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (this.currentStates[i4].id != 0) {
                i3++;
            }
        }
        return (Math.max(0, i3 - 1) * dp) + (i3 > 0 ? getSize() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0674  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int dp;
        float f;
        int i;
        boolean z;
        float f2;
        int i2;
        int i3;
        DrawingState drawingState;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float avatarScale;
        float f3;
        float f4;
        boolean z2;
        int i4 = 1;
        this.wasDraw = true;
        int i5 = this.currentStyle;
        int i6 = 10;
        boolean z3 = i5 == 4 || i5 == 10;
        int size = getSize();
        int i7 = 11;
        if (this.currentStyle == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i8 = this.overrideSize;
            if (i8 != 0) {
                dp = (int) (i8 * this.overrideSizeStepFactor);
            } else {
                dp = AndroidUtilities.dp(z3 ? 24.0f : 20.0f);
            }
        }
        int i9 = dp;
        for (int i10 = 0; i10 < 3; i10++) {
            long unused = this.currentStates[i10].id;
        }
        int i11 = this.currentStyle;
        int dp2 = (i11 == 0 || i11 == 10 || i11 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int usedWidth = this.centered ? (this.width - ((int) getUsedWidth())) / 2 : dp2;
        boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i12 = this.currentStyle;
        if (i12 == 4) {
            this.paint.setColor(Theme.getColor(Theme.key_inappPlayerBackground));
        } else if (i12 != 3) {
            this.paint.setColor(Theme.getColor(z4 ? Theme.key_returnToCallMutedBackground : Theme.key_returnToCallBackground));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            if (this.animatingStates[i14].id != 0) {
                i13++;
            }
        }
        int i15 = this.currentStyle;
        boolean z5 = i15 == 0 || i15 == 1 || i15 == 3 || i15 == 4 || i15 == 5 || i15 == 10 || i15 == 11;
        if (z5) {
            float dp3 = i15 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.drawStoriesCircle) {
                dp3 += AndroidUtilities.dp(20.0f);
            }
            float f5 = -dp3;
            f = 0.0f;
            i = 2;
            canvas.saveLayerAlpha(f5, f5, this.width + dp3, this.height + dp3, NotificationCenter.invalidateMotionBackground, 31);
        } else {
            f = 0.0f;
            i = 2;
        }
        this.maxX = f;
        int i16 = -1;
        float f6 = 2.0f;
        float f7 = 1.0f;
        if (this.drawStoriesCircle) {
            int i17 = 2;
            while (i17 >= 0) {
                int i18 = 0;
                while (i18 < i) {
                    if (i18 != 0 || this.transitionProgress != 1.0f) {
                        DrawingState[] drawingStateArr = i18 == 0 ? this.animatingStates : this.currentStates;
                        if (i18 != i4 || this.transitionProgress == 1.0f || drawingStateArr[i17].animationType == i4) {
                            ImageReceiver imageReceiver = drawingStateArr[i17].imageReceiver;
                            if (imageReceiver.hasImageSet()) {
                                if (i18 == 0) {
                                    int dp4 = this.centered ? ((this.width - (i13 * i9)) - AndroidUtilities.dp(z3 ? 8.0f : 4.0f)) / i : dp2;
                                    imageReceiver.setImageX(dp4 + (i9 * i17));
                                } else {
                                    imageReceiver.setImageX(usedWidth + (i9 * i17));
                                }
                                int i19 = this.currentStyle;
                                if (i19 == 0 || i19 == i6 || i19 == i7) {
                                    imageReceiver.setImageY((this.height - size) / f6);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i19 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.transitionProgress != 1.0f) {
                                    if (drawingStateArr[i17].animationType != i4) {
                                        if (drawingStateArr[i17].animationType != 0) {
                                            if (drawingStateArr[i17].animationType != i) {
                                                if (drawingStateArr[i17].animationType == i16 && this.centered) {
                                                    int dp5 = ((this.width - (i13 * i9)) - AndroidUtilities.dp(z3 ? 8.0f : 4.0f)) / i;
                                                    int i20 = i9 * i17;
                                                    float f8 = this.transitionProgress;
                                                    imageReceiver.setImageX((int) (((dp5 + i20) * f8) + ((usedWidth + i20) * (1.0f - f8))));
                                                }
                                            } else {
                                                int dp6 = this.centered ? ((this.width - (i13 * i9)) - AndroidUtilities.dp(z3 ? 8.0f : 4.0f)) / i : dp2;
                                                int i21 = usedWidth + (drawingStateArr[i17].moveFromIndex * i9);
                                                float f9 = this.transitionProgress;
                                                imageReceiver.setImageX((int) (((dp6 + (i9 * i17)) * f9) + (i21 * (1.0f - f9))));
                                            }
                                        } else {
                                            canvas.save();
                                            float f10 = this.transitionProgress;
                                            canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                            f4 = this.transitionProgress;
                                        }
                                    } else {
                                        canvas.save();
                                        float f11 = 1.0f - this.transitionProgress;
                                        canvas.scale(f11, f11, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f4 = 1.0f - this.transitionProgress;
                                    }
                                    z2 = true;
                                    float f12 = f4 * this.overrideAlpha;
                                    float size2 = (getSize() / f6) + AndroidUtilities.dp(4.0f);
                                    if (this.storiesTools == null) {
                                        this.storiesTools = new StoriesGradientTools();
                                    }
                                    this.storiesTools.setBounds(0.0f, 0.0f, this.parent.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                    this.storiesTools.paint.setAlpha((int) (f12 * 255.0f));
                                    canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), size2, this.storiesTools.paint);
                                    if (!z2) {
                                        canvas.restore();
                                    }
                                    i18++;
                                    i16 = -1;
                                    f6 = 2.0f;
                                    i4 = 1;
                                    i6 = 10;
                                    i7 = 11;
                                }
                                f4 = 1.0f;
                                z2 = false;
                                float f122 = f4 * this.overrideAlpha;
                                float size22 = (getSize() / f6) + AndroidUtilities.dp(4.0f);
                                if (this.storiesTools == null) {
                                }
                                this.storiesTools.setBounds(0.0f, 0.0f, this.parent.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                this.storiesTools.paint.setAlpha((int) (f122 * 255.0f));
                                canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), size22, this.storiesTools.paint);
                                if (!z2) {
                                }
                                i18++;
                                i16 = -1;
                                f6 = 2.0f;
                                i4 = 1;
                                i6 = 10;
                                i7 = 11;
                            }
                        }
                    }
                    i18++;
                    i16 = -1;
                    f6 = 2.0f;
                    i4 = 1;
                    i6 = 10;
                    i7 = 11;
                }
                i17--;
                i16 = -1;
                f6 = 2.0f;
                i4 = 1;
                i6 = 10;
                i7 = 11;
            }
        }
        int i22 = 2;
        while (i22 >= 0) {
            int i23 = 0;
            while (i23 < i) {
                if (i23 != 0 || this.transitionProgress != f7) {
                    DrawingState[] drawingStateArr2 = i23 == 0 ? this.animatingStates : this.currentStates;
                    if (i23 != 1 || this.transitionProgress == f7 || drawingStateArr2[i22].animationType == 1) {
                        ImageReceiver imageReceiver2 = drawingStateArr2[i22].imageReceiver;
                        if (imageReceiver2.hasImageSet()) {
                            if (i23 == 0) {
                                int dp7 = this.centered ? ((this.width - (i13 * i9)) - AndroidUtilities.dp(z3 ? 8.0f : 4.0f)) / i : dp2;
                                imageReceiver2.setImageX(dp7 + (i9 * i22));
                            } else {
                                imageReceiver2.setImageX(usedWidth + (i9 * i22));
                            }
                            int i24 = this.currentStyle;
                            if (i24 != 0 && i24 != 10) {
                                if (i24 != 11) {
                                    imageReceiver2.setImageY(AndroidUtilities.dp(i24 == 4 ? 8.0f : 6.0f));
                                    if (this.transitionProgress != f7) {
                                        if (drawingStateArr2[i22].animationType != 1) {
                                            if (drawingStateArr2[i22].animationType != 0) {
                                                if (drawingStateArr2[i22].animationType != i) {
                                                    if (drawingStateArr2[i22].animationType == -1 && this.centered) {
                                                        int dp8 = ((this.width - (i13 * i9)) - AndroidUtilities.dp(z3 ? 8.0f : 4.0f)) / i;
                                                        int i25 = i9 * i22;
                                                        float f13 = this.transitionProgress;
                                                        imageReceiver2.setImageX((int) (((dp8 + i25) * f13) + ((usedWidth + i25) * (f7 - f13))));
                                                    }
                                                    z = false;
                                                    f2 = 1.0f;
                                                    float f14 = f2 * this.overrideAlpha;
                                                    if (i22 == drawingStateArr2.length - 1 || this.drawStoriesCircle) {
                                                        i2 = this.currentStyle;
                                                        if (i2 != 1 || i2 == 3) {
                                                            i3 = 5;
                                                        } else {
                                                            i3 = 5;
                                                            if (i2 != 5) {
                                                                if (i2 == 4 || i2 == 10) {
                                                                    canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), this.xRefP);
                                                                    if (drawingStateArr2[i22].wavesDrawable == null) {
                                                                        drawingStateArr2[i22].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                                    }
                                                                    if (this.currentStyle == 10) {
                                                                        drawingStateArr2[i22].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_speakingText), (int) (f14 * 76.5f)));
                                                                    } else {
                                                                        drawingStateArr2[i22].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_listeningText), (int) (f14 * 76.5f)));
                                                                    }
                                                                    long currentTimeMillis = System.currentTimeMillis();
                                                                    if (currentTimeMillis - drawingStateArr2[i22].lastUpdateTime > 100) {
                                                                        drawingStateArr2[i22].lastUpdateTime = currentTimeMillis;
                                                                        if (this.currentStyle == 10) {
                                                                            DrawingState drawingState2 = drawingStateArr2[i22];
                                                                            TLRPC.GroupCallParticipant groupCallParticipant2 = drawingState2.participant;
                                                                            if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                                                drawingState2.wavesDrawable.setShowWaves(false, this.parent);
                                                                            } else {
                                                                                drawingState2.wavesDrawable.setShowWaves(true, this.parent);
                                                                                drawingStateArr2[i22].wavesDrawable.setAmplitude(r7.participant.amplitude * 15.0f);
                                                                            }
                                                                        } else if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - drawingStateArr2[i22].lastSpeakTime <= 5) {
                                                                            drawingStateArr2[i22].wavesDrawable.setShowWaves(true, this.parent);
                                                                            drawingStateArr2[i22].wavesDrawable.setAmplitude(this.random.nextInt() % 100);
                                                                        } else {
                                                                            drawingStateArr2[i22].wavesDrawable.setShowWaves(false, this.parent);
                                                                            drawingStateArr2[i22].wavesDrawable.setAmplitude(0.0d);
                                                                        }
                                                                    }
                                                                    drawingStateArr2[i22].wavesDrawable.update();
                                                                    drawingStateArr2[i22].wavesDrawable.draw(canvas, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), this.parent);
                                                                    avatarScale = drawingStateArr2[i22].wavesDrawable.getAvatarScale();
                                                                    imageReceiver2.setAlpha(f14);
                                                                    f7 = 1.0f;
                                                                    if (avatarScale == 1.0f) {
                                                                        canvas.save();
                                                                        canvas.scale(avatarScale, avatarScale, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                                                        imageReceiver2.draw(canvas);
                                                                        canvas.restore();
                                                                    } else {
                                                                        imageReceiver2.draw(canvas);
                                                                    }
                                                                    this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                                    if (!z) {
                                                                        canvas.restore();
                                                                    }
                                                                    i23++;
                                                                    i = 2;
                                                                } else {
                                                                    float size3 = (getSize() / 2.0f) + this.strokeWidth;
                                                                    if (z5) {
                                                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, this.xRefP);
                                                                    } else {
                                                                        int alpha = this.paint.getAlpha();
                                                                        if (f14 != f7) {
                                                                            this.paint.setAlpha((int) (alpha * f14));
                                                                        }
                                                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), size3, this.paint);
                                                                        if (f14 != f7) {
                                                                            this.paint.setAlpha(alpha);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                                        if (drawingStateArr2[i22].wavesDrawable == null) {
                                                            if (this.currentStyle == i3) {
                                                                drawingStateArr2[i22].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                                            } else {
                                                                drawingStateArr2[i22].wavesDrawable = new GroupCallUserCell.AvatarWavesDrawable(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                                            }
                                                        }
                                                        if (this.currentStyle == i3) {
                                                            drawingStateArr2[i22].wavesDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_speakingText), (int) (f14 * 76.5f)));
                                                        }
                                                        drawingState = drawingStateArr2[i22];
                                                        groupCallParticipant = drawingState.participant;
                                                        if (groupCallParticipant != null || groupCallParticipant.amplitude <= 0.0f) {
                                                            drawingState.wavesDrawable.setShowWaves(false, this.parent);
                                                        } else {
                                                            drawingState.wavesDrawable.setShowWaves(true, this.parent);
                                                            drawingStateArr2[i22].wavesDrawable.setAmplitude(r7.participant.amplitude * 15.0f);
                                                        }
                                                        if (this.currentStyle == i3 && SystemClock.uptimeMillis() - drawingStateArr2[i22].participant.lastSpeakTime > 500) {
                                                            this.updateDelegate.run();
                                                        }
                                                        drawingStateArr2[i22].wavesDrawable.update();
                                                        if (this.currentStyle == i3) {
                                                            drawingStateArr2[i22].wavesDrawable.draw(canvas, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), this.parent);
                                                            invalidate();
                                                        }
                                                        avatarScale = drawingStateArr2[i22].wavesDrawable.getAvatarScale();
                                                        imageReceiver2.setAlpha(f14);
                                                        f7 = 1.0f;
                                                        if (avatarScale == 1.0f) {
                                                        }
                                                        this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                        if (!z) {
                                                        }
                                                        i23++;
                                                        i = 2;
                                                    }
                                                    avatarScale = 1.0f;
                                                    imageReceiver2.setAlpha(f14);
                                                    f7 = 1.0f;
                                                    if (avatarScale == 1.0f) {
                                                    }
                                                    this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                                    if (!z) {
                                                    }
                                                    i23++;
                                                    i = 2;
                                                } else {
                                                    int dp9 = this.centered ? ((this.width - (i13 * i9)) - AndroidUtilities.dp(z3 ? 8.0f : 4.0f)) / i : dp2;
                                                    int i26 = usedWidth + (drawingStateArr2[i22].moveFromIndex * i9);
                                                    float f15 = this.transitionProgress;
                                                    imageReceiver2.setImageX((int) (((dp9 + (i9 * i22)) * f15) + (i26 * (f7 - f15))));
                                                }
                                            } else {
                                                canvas.save();
                                                float f16 = this.transitionProgress;
                                                canvas.scale(f16, f16, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                                f3 = this.transitionProgress;
                                            }
                                        } else {
                                            canvas.save();
                                            float f17 = f7 - this.transitionProgress;
                                            canvas.scale(f17, f17, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                            f3 = f7 - this.transitionProgress;
                                        }
                                        f2 = f3;
                                        z = true;
                                        float f142 = f2 * this.overrideAlpha;
                                        if (i22 == drawingStateArr2.length - 1) {
                                        }
                                        i2 = this.currentStyle;
                                        if (i2 != 1) {
                                        }
                                        i3 = 5;
                                        canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                        if (drawingStateArr2[i22].wavesDrawable == null) {
                                        }
                                        if (this.currentStyle == i3) {
                                        }
                                        drawingState = drawingStateArr2[i22];
                                        groupCallParticipant = drawingState.participant;
                                        if (groupCallParticipant != null) {
                                        }
                                        drawingState.wavesDrawable.setShowWaves(false, this.parent);
                                        if (this.currentStyle == i3) {
                                            this.updateDelegate.run();
                                        }
                                        drawingStateArr2[i22].wavesDrawable.update();
                                        if (this.currentStyle == i3) {
                                        }
                                        avatarScale = drawingStateArr2[i22].wavesDrawable.getAvatarScale();
                                        imageReceiver2.setAlpha(f142);
                                        f7 = 1.0f;
                                        if (avatarScale == 1.0f) {
                                        }
                                        this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                        if (!z) {
                                        }
                                        i23++;
                                        i = 2;
                                    }
                                    z = false;
                                    f2 = 1.0f;
                                    float f1422 = f2 * this.overrideAlpha;
                                    if (i22 == drawingStateArr2.length - 1) {
                                    }
                                    i2 = this.currentStyle;
                                    if (i2 != 1) {
                                    }
                                    i3 = 5;
                                    canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                                    if (drawingStateArr2[i22].wavesDrawable == null) {
                                    }
                                    if (this.currentStyle == i3) {
                                    }
                                    drawingState = drawingStateArr2[i22];
                                    groupCallParticipant = drawingState.participant;
                                    if (groupCallParticipant != null) {
                                    }
                                    drawingState.wavesDrawable.setShowWaves(false, this.parent);
                                    if (this.currentStyle == i3) {
                                    }
                                    drawingStateArr2[i22].wavesDrawable.update();
                                    if (this.currentStyle == i3) {
                                    }
                                    avatarScale = drawingStateArr2[i22].wavesDrawable.getAvatarScale();
                                    imageReceiver2.setAlpha(f1422);
                                    f7 = 1.0f;
                                    if (avatarScale == 1.0f) {
                                    }
                                    this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                                    if (!z) {
                                    }
                                    i23++;
                                    i = 2;
                                }
                            }
                            imageReceiver2.setImageY((this.height - size) / 2.0f);
                            if (this.transitionProgress != f7) {
                            }
                            z = false;
                            f2 = 1.0f;
                            float f14222 = f2 * this.overrideAlpha;
                            if (i22 == drawingStateArr2.length - 1) {
                            }
                            i2 = this.currentStyle;
                            if (i2 != 1) {
                            }
                            i3 = 5;
                            canvas.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), this.xRefP);
                            if (drawingStateArr2[i22].wavesDrawable == null) {
                            }
                            if (this.currentStyle == i3) {
                            }
                            drawingState = drawingStateArr2[i22];
                            groupCallParticipant = drawingState.participant;
                            if (groupCallParticipant != null) {
                            }
                            drawingState.wavesDrawable.setShowWaves(false, this.parent);
                            if (this.currentStyle == i3) {
                            }
                            drawingStateArr2[i22].wavesDrawable.update();
                            if (this.currentStyle == i3) {
                            }
                            avatarScale = drawingStateArr2[i22].wavesDrawable.getAvatarScale();
                            imageReceiver2.setAlpha(f14222);
                            f7 = 1.0f;
                            if (avatarScale == 1.0f) {
                            }
                            this.maxX = Math.max(this.maxX, imageReceiver2.getCenterX() + ((imageReceiver2.getImageWidth() / 2.0f) * avatarScale));
                            if (!z) {
                            }
                            i23++;
                            i = 2;
                        }
                    }
                }
                i23++;
                i = 2;
            }
            i22--;
            i = 2;
        }
        if (z5) {
            canvas.restore();
        }
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

    public void reset() {
        for (int i = 0; i < this.animatingStates.length; i++) {
            setObject(0, 0, null);
        }
    }

    public void setShowSavedMessages(boolean z) {
        this.showSavedMessages = z;
    }
}
