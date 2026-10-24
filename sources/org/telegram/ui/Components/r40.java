package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class r40 extends FrameLayout {
    public long E;
    public final org.telegram.ui.ActionBar.g6 F;
    public boolean G;
    public boolean H;
    public final ai.wd a;
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

    public r40(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        this.a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.b.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.u(this.b, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.pf, 125), this.F, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.b;
        boolean z10 = this.r;
        addView(imageView2, w7.z5.d(34, 34.0f, 21, 0.0f, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f));
        setOnClickListener(new f0(this, 25));
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
        boolean z11 = this.G;
        int i10 = 2;
        Property property = View.ALPHA;
        if (z11) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<r40, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<r40, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<r40, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.f.setDuration(150L);
            this.f.setInterpolator(bs.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<r40, Float>) property, 0.0f));
            this.f.setDuration(300L);
        }
        this.f.addListener(new p40(this, i10));
        this.f.start();
    }

    public int c() {
        return 0;
    }

    public final void d() {
        ai.wd wdVar = this.a;
        org.telegram.ui.ActionBar.r6.r(wdVar);
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.r6.r(imageView);
        wdVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.n;
        wdVar.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp((i10 == 7 || i10 == 8) ? 6.0f : 3.0f), -366530760));
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
    public final boolean e(org.telegram.ui.Cells.t1 t1Var, Integer num, int i10, int i11, boolean z10) {
        float f7;
        int i12;
        int dp;
        int forwardNameCenterX;
        int left;
        AnimatorSet animatorSet;
        int i13 = 0;
        int i14 = this.n;
        if ((i14 != 5 || i11 != this.v || this.d != t1Var) && (i14 == 5 || ((i14 != 0 || getTag() == null) && this.d != t1Var))) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            int[] iArr = new int[2];
            t1Var.getLocationInWindow(iArr);
            int i15 = iArr[1];
            ((View) getParent()).getLocationInWindow(iArr);
            int i16 = i15 - iArr[1];
            View view = (View) t1Var.getParent();
            boolean z11 = this.r;
            if (i14 == 0) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                i12 = (int) (photoImage.getImageY() + i16);
                int imageHeight = (int) photoImage.getImageHeight();
                int i17 = i12 + imageHeight;
                int measuredHeight = view.getMeasuredHeight();
                f7 = 10.0f;
                if (i12 > AndroidUtilities.dp(10.0f) + getMeasuredHeight() && i17 <= (imageHeight / 4) + measuredHeight) {
                    forwardNameCenterX = t1Var.getNoSoundIconCenterX();
                    measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                    int measuredWidth = view.getMeasuredWidth();
                    if (z11) {
                        float f10 = this.x;
                        float dp2 = AndroidUtilities.dp(44.0f);
                        this.w = dp2;
                        setTranslationY(f10 + dp2);
                    } else {
                        float f11 = this.x;
                        float measuredHeight2 = i12 - getMeasuredHeight();
                        this.w = measuredHeight2;
                        setTranslationY(f11 + measuredHeight2);
                    }
                    left = t1Var.getLeft() + forwardNameCenterX;
                    int dp3 = AndroidUtilities.dp(19.0f);
                    if (i14 == 5) {
                        int g10 = i2.o1.g(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                        setTranslationX(g10);
                        dp3 += g10;
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
                        if (measuredWidth3 < AndroidUtilities.dp(f7)) {
                            float dp4 = measuredWidth3 - AndroidUtilities.dp(f7);
                            setTranslationX(getTranslationX() + dp4);
                            imageView.setTranslationX(measuredWidth3 - dp4);
                        }
                    } else if (measuredWidth3 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                        float measuredWidth4 = (measuredWidth3 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                        setTranslationX(measuredWidth4);
                        imageView.setTranslationX(measuredWidth3 - measuredWidth4);
                    } else if (measuredWidth3 < AndroidUtilities.dp(f7)) {
                        float dp5 = measuredWidth3 - AndroidUtilities.dp(f7);
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
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<r40, Float>) View.ALPHA, 0.0f, 1.0f));
                    this.f.addListener(new p40(this, i13));
                    this.f.setDuration(300L);
                    this.f.start();
                    return true;
                }
            } else {
                f7 = 10.0f;
                ai.wd wdVar = this.a;
                if (i14 == 5) {
                    i12 = i16 + i11;
                    this.v = i11;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(messageObject);
                        if (MessageObject.isVoted(tL_messageMediaPoll) && !MessageObject.isVoteResultsIsNotEmpty(tL_messageMediaPoll)) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            if (!poll.closed && poll.hide_results_until_close) {
                                wdVar.setText(LocaleController.getString(R.string.PollResultsWillLater));
                                measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                forwardNameCenterX = i10;
                                int measuredWidth5 = view.getMeasuredWidth();
                                if (z11) {
                                }
                                left = t1Var.getLeft() + forwardNameCenterX;
                                int dp32 = AndroidUtilities.dp(19.0f);
                                if (i14 == 5) {
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
                        wdVar.setText(LocaleController.getString(R.string.PollSelectOption));
                        measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                        forwardNameCenterX = i10;
                        int measuredWidth52 = view.getMeasuredWidth();
                        if (z11) {
                        }
                        left = t1Var.getLeft() + forwardNameCenterX;
                        int dp322 = AndroidUtilities.dp(19.0f);
                        if (i14 == 5) {
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
                        wdVar.setText(LocaleController.getString(R.string.HidAccount));
                    } else {
                        wdVar.setText(str);
                    }
                    measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                    TLRPC.User currentUser = t1Var.getCurrentUser();
                    if (currentUser == null || currentUser.id != 0) {
                        int dp6 = AndroidUtilities.dp(22.0f) + i16;
                        if (messageObject2.isOutOwner() || !t1Var.Za || t1Var.Ka == null) {
                            i12 = dp6;
                            if (!z11 || i12 > AndroidUtilities.dp(10.0f) + getMeasuredHeight()) {
                                forwardNameCenterX = t1Var.getForwardNameCenterX();
                                int measuredWidth522 = view.getMeasuredWidth();
                                if (z11) {
                                }
                                left = t1Var.getLeft() + forwardNameCenterX;
                                int dp3222 = AndroidUtilities.dp(19.0f);
                                if (i14 == 5) {
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
                        dp = org.telegram.messenger.sl.D(50.0f, t1Var.getMeasuredHeight() - Math.max(0, t1Var.getBottom() - view.getMeasuredHeight()), i16);
                    }
                    i12 = dp;
                    if (!z11) {
                    }
                    forwardNameCenterX = t1Var.getForwardNameCenterX();
                    int measuredWidth5222 = view.getMeasuredWidth();
                    if (z11) {
                    }
                    left = t1Var.getLeft() + forwardNameCenterX;
                    int dp32222 = AndroidUtilities.dp(19.0f);
                    if (i14 == 5) {
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
        int i10 = 1;
        setTag(1);
        setVisibility(0);
        if (!z10) {
            setAlpha(1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        boolean z11 = this.G;
        Property property = View.ALPHA;
        if (z11) {
            ImageView imageView = this.c;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.f.playTogether(ObjectAnimator.ofFloat(this, (Property<r40, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<r40, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<r40, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.f.setDuration(350L);
            this.f.setInterpolator(bs.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<r40, Float>) property, 0.0f, 1.0f));
            this.f.setDuration(300L);
        }
        this.f.addListener(new p40(this, i10));
        this.f.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0140, code lost:
    
        if (r4 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015c, code lost:
    
        if (r4 >= 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view) {
        int measuredWidth;
        int i10;
        int i11;
        int measuredWidth2;
        measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int dp = iArr[1] - AndroidUtilities.dp(4.0f);
        boolean z10 = this.r;
        int i12 = this.n;
        if (i12 == 4) {
            dp += AndroidUtilities.dp(4.0f);
        } else if (i12 == 6 && z10) {
            dp = org.telegram.messenger.v0.C(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), dp);
        } else if (i12 == 7 || (i12 == 8 && z10)) {
            dp = org.telegram.messenger.v0.C(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), dp);
        } else if (i12 == 8) {
            dp -= AndroidUtilities.dp(10.0f);
        }
        int i13 = 0;
        if (i12 != 8 || !z10) {
            measuredWidth = i12 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof org.telegram.ui.ActionBar.n5) {
            org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) view;
            Drawable rightDrawable = n5Var.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : n5Var.getTextWidth() / 2)) - AndroidUtilities.dp(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - AndroidUtilities.dp(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i14 = measuredWidth - iArr[0];
        int i15 = (dp - iArr[1]) - this.y;
        int c10 = c() + i14;
        int measuredWidth3 = view2.getMeasuredWidth();
        if (!z10 || i12 == 6 || i12 == 7 || i12 == 8) {
            float f7 = this.x;
            float measuredHeight = i15 - getMeasuredHeight();
            this.w = measuredHeight;
            setTranslationY(f7 + measuredHeight);
        } else {
            float f10 = this.x;
            float dp2 = AndroidUtilities.dp(44.0f);
            this.w = dp2;
            setTranslationY(f10 + dp2);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i10 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i10 = 0;
            i11 = 0;
        }
        ImageView imageView = this.c;
        if (i12 == 8 && !z10) {
            i13 = (((measuredWidth3 - i10) - i11) - getMeasuredWidth()) / 2;
        } else if (c10 > view2.getMeasuredWidth() / 2) {
            if (i12 == 3) {
                measuredWidth2 = (int) (measuredWidth3 - (getMeasuredWidth() * 1.5f));
            } else {
                i13 = (measuredWidth3 - getMeasuredWidth()) - (i11 + i10);
            }
        } else if (i12 == 3) {
            measuredWidth2 = (c10 - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth();
        }
        setTranslationX(i13);
        float measuredWidth4 = (c10 - (i10 + i13)) - (imageView.getMeasuredWidth() / 2.0f);
        if (i12 == 7) {
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.y = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.x = f7;
        setTranslationY(f7 + this.w);
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
        this.E = j10;
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public r40(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        this(2, activity, g6Var, false);
    }

    public r40(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = g6Var;
        this.n = i10;
        this.r = z10;
        ai.wd wdVar = new ai.wd(context, 22);
        this.a = wdVar;
        int i11 = org.telegram.ui.ActionBar.k6.pf;
        org.telegram.ui.ActionBar.r6.W(wdVar, i11, g6Var);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            wdVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            wdVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            wdVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            wdVar.setGravity(19);
            int dp = AndroidUtilities.dp(5.0f);
            int i12 = org.telegram.ui.ActionBar.k6.qf;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            wdVar.setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(wdVar, c02, O, null, g6Var);
            wdVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(wdVar, w7.z5.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            wdVar.setGravity(51);
            int dp2 = AndroidUtilities.dp(10.0f);
            int i13 = org.telegram.ui.ActionBar.k6.qf;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
            wdVar.setBackground(c03);
            org.telegram.ui.ActionBar.r6.k(wdVar, c03, O2, null, g6Var);
            wdVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(wdVar, w7.z5.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            wdVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.b.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(this.b, i11, g6Var, PorterDuff.Mode.MULTIPLY);
            addView(this.b, w7.z5.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.qf, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, w7.z5.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(q40 q40Var) {
    }
}
