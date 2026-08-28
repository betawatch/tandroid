package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class s30 extends FrameLayout {
    public long A;
    public final org.telegram.ui.ActionBar.b6 B;
    public boolean C;
    public boolean D;
    public final bg.t a;
    public ImageView b;
    public final ImageView c;
    public org.telegram.ui.Cells.t1 d;
    public View e;
    public AnimatorSet f;
    public Runnable h;
    public final int n;
    public final boolean r;
    public String s;
    public int v;
    public float w;
    public float x;
    public int y;

    public s30(Context context, int i9) {
        this(i9, context, null, false);
    }

    public final void a() {
        this.a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.D = true;
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.b.setScaleType(ImageView.ScaleType.CENTER);
        this.b.setColorFilter(new PorterDuffColorFilter(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pf, this.B), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.b;
        boolean z10 = this.r;
        addView(imageView2, g7.e6.d(34, 34.0f, 21, 0.0f, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f));
        setOnClickListener(new f0(this, 26));
    }

    public final void b(boolean z10) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.h;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.h = null;
        }
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (!z10) {
            setVisibility(4);
            this.e = null;
            this.d = null;
            this.f = null;
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        boolean z11 = this.C;
        int i9 = 2;
        Property property = View.ALPHA;
        if (z11) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<s30, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<s30, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<s30, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.f.setDuration(150L);
            this.f.setInterpolator(gr.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<s30, Float>) property, 0.0f));
            this.f.setDuration(300L);
        }
        this.f.addListener(new q30(this, i9));
        this.f.start();
    }

    public int c() {
        return 0;
    }

    public final void d() {
        bg.t tVar = this.a;
        tVar.setTextColor(-1);
        this.c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i9 = this.n;
        tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp((i9 == 7 || i9 == 8) ? 6.0f : 3.0f), -366530760));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(org.telegram.ui.Cells.t1 t1Var, Integer num, int i9, int i10, boolean z10) {
        float f10;
        int i11;
        int dp;
        int forwardNameCenterX;
        int left;
        AnimatorSet animatorSet;
        int i12 = 0;
        int i13 = this.n;
        if ((i13 != 5 || i10 != this.v || this.d != t1Var) && (i13 == 5 || ((i13 != 0 || getTag() == null) && this.d != t1Var))) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            int[] iArr = new int[2];
            t1Var.getLocationInWindow(iArr);
            int i14 = iArr[1];
            ((View) getParent()).getLocationInWindow(iArr);
            int i15 = i14 - iArr[1];
            View view = (View) t1Var.getParent();
            boolean z11 = this.r;
            if (i13 == 0) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                i11 = (int) (photoImage.getImageY() + i15);
                int imageHeight = (int) photoImage.getImageHeight();
                int i16 = i11 + imageHeight;
                int measuredHeight = view.getMeasuredHeight();
                f10 = 10.0f;
                if (i11 > AndroidUtilities.dp(10.0f) + getMeasuredHeight() && i16 <= (imageHeight / 4) + measuredHeight) {
                    forwardNameCenterX = t1Var.getNoSoundIconCenterX();
                    measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                    int measuredWidth = view.getMeasuredWidth();
                    if (z11) {
                        float f11 = this.x;
                        float dp2 = AndroidUtilities.dp(44.0f);
                        this.w = dp2;
                        setTranslationY(f11 + dp2);
                    } else {
                        float f12 = this.x;
                        float measuredHeight2 = i11 - getMeasuredHeight();
                        this.w = measuredHeight2;
                        setTranslationY(f12 + measuredHeight2);
                    }
                    left = t1Var.getLeft() + forwardNameCenterX;
                    int dp3 = AndroidUtilities.dp(19.0f);
                    if (i13 == 5) {
                        int b10 = org.telegram.messenger.l0.b(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                        setTranslationX(b10);
                        dp3 += b10;
                    } else if (left > view.getMeasuredWidth() / 2) {
                        int measuredWidth2 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                        setTranslationX(measuredWidth2);
                        dp3 += measuredWidth2;
                    } else {
                        setTranslationX(0.0f);
                    }
                    int left2 = (t1Var.getLeft() + forwardNameCenterX) - dp3;
                    ImageView imageView = this.c;
                    float measuredWidth3 = left2 - (imageView.getMeasuredWidth() / 2);
                    imageView.setTranslationX(measuredWidth3);
                    if (left > view.getMeasuredWidth() / 2) {
                        if (measuredWidth3 < AndroidUtilities.dp(f10)) {
                            float dp4 = measuredWidth3 - AndroidUtilities.dp(f10);
                            setTranslationX(getTranslationX() + dp4);
                            imageView.setTranslationX(measuredWidth3 - dp4);
                        }
                    } else if (measuredWidth3 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                        float measuredWidth4 = (measuredWidth3 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                        setTranslationX(measuredWidth4);
                        imageView.setTranslationX(measuredWidth3 - measuredWidth4);
                    } else if (measuredWidth3 < AndroidUtilities.dp(f10)) {
                        float dp5 = measuredWidth3 - AndroidUtilities.dp(f10);
                        setTranslationX(getTranslationX() + dp5);
                        imageView.setTranslationX(measuredWidth3 - dp5);
                    }
                    this.d = t1Var;
                    animatorSet = this.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f = null;
                    }
                    setTag(1);
                    setVisibility(0);
                    if (!z10) {
                        setAlpha(1.0f);
                        return true;
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.f = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<s30, Float>) View.ALPHA, 0.0f, 1.0f));
                    this.f.addListener(new q30(this, i12));
                    this.f.setDuration(300L);
                    this.f.start();
                    return true;
                }
            } else {
                f10 = 10.0f;
                bg.t tVar = this.a;
                if (i13 == 5) {
                    i11 = i15 + i10;
                    this.v = i10;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(messageObject);
                        if (MessageObject.isVoted(tL_messageMediaPoll) && !MessageObject.isVoteResultsIsNotEmpty(tL_messageMediaPoll)) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            if (!poll.closed && poll.hide_results_until_close) {
                                tVar.setText(LocaleController.getString(R.string.PollResultsWillLater));
                                measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                forwardNameCenterX = i9;
                                int measuredWidth5 = view.getMeasuredWidth();
                                if (z11) {
                                }
                                left = t1Var.getLeft() + forwardNameCenterX;
                                int dp32 = AndroidUtilities.dp(19.0f);
                                if (i13 == 5) {
                                }
                                int left22 = (t1Var.getLeft() + forwardNameCenterX) - dp32;
                                ImageView imageView2 = this.c;
                                float measuredWidth32 = left22 - (imageView2.getMeasuredWidth() / 2);
                                imageView2.setTranslationX(measuredWidth32);
                                if (left > view.getMeasuredWidth() / 2) {
                                }
                                this.d = t1Var;
                                animatorSet = this.f;
                                if (animatorSet != null) {
                                }
                                setTag(1);
                                setVisibility(0);
                                if (!z10) {
                                }
                            }
                        }
                    }
                    if (num.intValue() == -1) {
                        tVar.setText(LocaleController.getString(R.string.PollSelectOption));
                        measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                        forwardNameCenterX = i9;
                        int measuredWidth52 = view.getMeasuredWidth();
                        if (z11) {
                        }
                        left = t1Var.getLeft() + forwardNameCenterX;
                        int dp322 = AndroidUtilities.dp(19.0f);
                        if (i13 == 5) {
                        }
                        int left222 = (t1Var.getLeft() + forwardNameCenterX) - dp322;
                        ImageView imageView22 = this.c;
                        float measuredWidth322 = left222 - (imageView22.getMeasuredWidth() / 2);
                        imageView22.setTranslationX(measuredWidth322);
                        if (left > view.getMeasuredWidth() / 2) {
                        }
                        this.d = t1Var;
                        animatorSet = this.f;
                        if (animatorSet != null) {
                        }
                        setTag(1);
                        setVisibility(0);
                        if (!z10) {
                        }
                    }
                } else {
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    String str = this.s;
                    if (str == null) {
                        tVar.setText(LocaleController.getString(R.string.HidAccount));
                    } else {
                        tVar.setText(str);
                    }
                    measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                    TLRPC.User currentUser = t1Var.getCurrentUser();
                    if (currentUser == null || currentUser.id != 0) {
                        int dp6 = AndroidUtilities.dp(22.0f) + i15;
                        if (messageObject2.isOutOwner() || !t1Var.Va || t1Var.Ga == null) {
                            i11 = dp6;
                            if (!z11 || i11 > AndroidUtilities.dp(10.0f) + getMeasuredHeight()) {
                                forwardNameCenterX = t1Var.getForwardNameCenterX();
                                int measuredWidth522 = view.getMeasuredWidth();
                                if (z11) {
                                }
                                left = t1Var.getLeft() + forwardNameCenterX;
                                int dp3222 = AndroidUtilities.dp(19.0f);
                                if (i13 == 5) {
                                }
                                int left2222 = (t1Var.getLeft() + forwardNameCenterX) - dp3222;
                                ImageView imageView222 = this.c;
                                float measuredWidth3222 = left2222 - (imageView222.getMeasuredWidth() / 2);
                                imageView222.setTranslationX(measuredWidth3222);
                                if (left > view.getMeasuredWidth() / 2) {
                                }
                                this.d = t1Var;
                                animatorSet = this.f;
                                if (animatorSet != null) {
                                }
                                setTag(1);
                                setVisibility(0);
                                if (!z10) {
                                }
                            }
                        } else {
                            dp = AndroidUtilities.dp(20.0f) + dp6;
                        }
                    } else {
                        dp = org.telegram.messenger.ll.D(50.0f, t1Var.getMeasuredHeight() - Math.max(0, t1Var.getBottom() - view.getMeasuredHeight()), i15);
                    }
                    i11 = dp;
                    if (!z11) {
                    }
                    forwardNameCenterX = t1Var.getForwardNameCenterX();
                    int measuredWidth5222 = view.getMeasuredWidth();
                    if (z11) {
                    }
                    left = t1Var.getLeft() + forwardNameCenterX;
                    int dp32222 = AndroidUtilities.dp(19.0f);
                    if (i13 == 5) {
                    }
                    int left22222 = (t1Var.getLeft() + forwardNameCenterX) - dp32222;
                    ImageView imageView2222 = this.c;
                    float measuredWidth32222 = left22222 - (imageView2222.getMeasuredWidth() / 2);
                    imageView2222.setTranslationX(measuredWidth32222);
                    if (left > view.getMeasuredWidth() / 2) {
                    }
                    this.d = t1Var;
                    animatorSet = this.f;
                    if (animatorSet != null) {
                    }
                    setTag(1);
                    setVisibility(0);
                    if (!z10) {
                    }
                }
            }
        }
        return false;
    }

    public final void f(View view, boolean z10) {
        if (this.e == view || getTag() != null) {
            if (getTag() != null) {
                g(view);
                return;
            }
            return;
        }
        Runnable runnable = this.h;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.h = null;
        }
        g(view);
        this.e = view;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        int i9 = 1;
        setTag(1);
        setVisibility(0);
        if (!z10) {
            setAlpha(1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        boolean z11 = this.C;
        Property property = View.ALPHA;
        if (z11) {
            ImageView imageView = this.c;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.f.playTogether(ObjectAnimator.ofFloat(this, (Property<s30, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<s30, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<s30, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.f.setDuration(350L);
            this.f.setInterpolator(gr.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<s30, Float>) property, 0.0f, 1.0f));
            this.f.setDuration(300L);
        }
        this.f.addListener(new q30(this, i9));
        this.f.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
    
        if (r4 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
    
        if (r4 >= 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view) {
        int measuredWidth;
        int i9;
        int i10;
        int measuredWidth2;
        measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int dp = iArr[1] - AndroidUtilities.dp(4.0f);
        boolean z10 = this.r;
        int i11 = this.n;
        if (i11 == 4) {
            dp += AndroidUtilities.dp(4.0f);
        } else if (i11 == 6 && z10) {
            dp = org.telegram.messenger.l0.C(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), dp);
        } else if (i11 == 7 || (i11 == 8 && z10)) {
            dp = org.telegram.messenger.l0.C(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), dp);
        } else if (i11 == 8) {
            dp -= AndroidUtilities.dp(10.0f);
        }
        int i12 = 0;
        if (i11 != 8 || !z10) {
            measuredWidth = i11 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof org.telegram.ui.ActionBar.h5) {
            org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
            Drawable rightDrawable = h5Var.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : h5Var.getTextWidth() / 2)) - AndroidUtilities.dp(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - AndroidUtilities.dp(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i13 = measuredWidth - iArr[0];
        int i14 = (dp - iArr[1]) - this.y;
        int c10 = c() + i13;
        int measuredWidth3 = view2.getMeasuredWidth();
        if (!z10 || i11 == 6 || i11 == 7 || i11 == 8) {
            float f10 = this.x;
            float measuredHeight = i14 - getMeasuredHeight();
            this.w = measuredHeight;
            setTranslationY(f10 + measuredHeight);
        } else {
            float f11 = this.x;
            float dp2 = AndroidUtilities.dp(44.0f);
            this.w = dp2;
            setTranslationY(f11 + dp2);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i9 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i10 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i9 = 0;
            i10 = 0;
        }
        ImageView imageView = this.c;
        if (i11 == 8 && !z10) {
            i12 = (((measuredWidth3 - i9) - i10) - getMeasuredWidth()) / 2;
        } else if (c10 > view2.getMeasuredWidth() / 2) {
            if (i11 == 3) {
                measuredWidth2 = (int) (measuredWidth3 - (getMeasuredWidth() * 1.5f));
            } else {
                i12 = (measuredWidth3 - getMeasuredWidth()) - (i10 + i9);
            }
        } else if (i11 == 3) {
            measuredWidth2 = (c10 - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth();
        }
        setTranslationX(i12);
        float measuredWidth4 = (c10 - (i9 + i12)) - (imageView.getMeasuredWidth() / 2.0f);
        if (i11 == 7) {
            measuredWidth4 += AndroidUtilities.dp(2.0f);
        }
        imageView.setTranslationX(measuredWidth4);
        if (c10 > view2.getMeasuredWidth() / 2) {
            if (measuredWidth4 < AndroidUtilities.dp(10.0f)) {
                float dp3 = measuredWidth4 - AndroidUtilities.dp(10.0f);
                setTranslationX(getTranslationX() + dp3);
                imageView.setTranslationX(measuredWidth4 - dp3);
                return;
            }
            return;
        }
        if (measuredWidth4 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
            float measuredWidth5 = (measuredWidth4 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
            setTranslationX(measuredWidth5);
            imageView.setTranslationX(measuredWidth4 - measuredWidth5);
        } else if (measuredWidth4 < AndroidUtilities.dp(10.0f)) {
            float dp4 = measuredWidth4 - AndroidUtilities.dp(10.0f);
            setTranslationX(getTranslationX() + dp4);
            imageView.setTranslationX(measuredWidth4 - dp4);
        }
    }

    public float getBaseTranslationY() {
        return this.w;
    }

    public org.telegram.ui.Cells.t1 getMessageCell() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    public void setBottomOffset(int i9) {
        this.y = i9;
    }

    public void setExtraTranslationY(float f10) {
        this.x = f10;
        setTranslationY(f10 + this.w);
    }

    public void setOverrideText(String str) {
        this.s = str;
        this.a.setText(str);
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null) {
            this.d = null;
            e(t1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.A = j10;
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.C = z10;
    }

    public s30(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        this(2, activity, b6Var, false);
    }

    public s30(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.A = 2000L;
        this.B = b6Var;
        this.n = i9;
        this.r = z10;
        bg.t tVar = new bg.t(context, 23);
        this.a = tVar;
        int i10 = org.telegram.ui.ActionBar.f6.pf;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        tVar.setTextSize(1, 14.0f);
        tVar.setMaxLines(2);
        if (i9 == 7 || i9 == 8 || i9 == 9) {
            tVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i9 == 4) {
            tVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            tVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i9 == 3) {
            tVar.setGravity(19);
            tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.qf, b6Var)));
            tVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(tVar, g7.e6.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            tVar.setGravity(51);
            tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.qf, b6Var)));
            tVar.setPadding(AndroidUtilities.dp(i9 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(tVar, g7.e6.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i9 == 0) {
            tVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.b.setScaleType(ImageView.ScaleType.CENTER);
            this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.b, g7.e6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.qf, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, g7.e6.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(r30 r30Var) {
    }
}
