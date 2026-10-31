package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class q30 extends FrameLayout {
    public int D;
    public long E;
    public final org.telegram.ui.ActionBar.p6 F;
    public boolean G;
    public boolean H;
    public final ag.j3 a;
    public ImageView b;
    public final ImageView c;
    public org.telegram.ui.Cells.q1 d;
    public View e;
    public AnimatorSet f;
    public Runnable h;
    public final int n;
    public final boolean r;
    public String s;
    public int w;
    public float x;
    public float y;

    public q30(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        this.a.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.b.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.b;
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.dg, org.telegram.messenger.zs.J1);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i10 = h.a;
        float f7 = h.d;
        org.telegram.ui.ActionBar.p6 p6Var = this.F;
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, -1, 1, f7, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.a7.O(imageView2, 5, i10, -1, 1, f7, p6Var, Q, porterDuffColorFilter).h = mode;
        ImageView imageView3 = this.b;
        boolean z10 = this.r;
        addView(imageView3, w7.b6.d(34, 34.0f, 21, 0.0f, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f));
        setOnClickListener(new h0(this, 24));
    }

    public final void b(boolean z10) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.h;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q30, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<q30, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<q30, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.f.setDuration(150L);
            this.f.setInterpolator(gr.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q30, Float>) property, 0.0f));
            this.f.setDuration(300L);
        }
        this.f.addListener(new o30(this, i10));
        this.f.start();
    }

    public int c() {
        return 0;
    }

    public final void d() {
        ag.j3 j3Var = this.a;
        org.telegram.ui.ActionBar.a7.r(j3Var);
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.a7.r(imageView);
        j3Var.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.n;
        j3Var.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L((i10 == 7 || i10 == 8) ? 6.0f : 3.0f), -366530760));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(org.telegram.ui.Cells.q1 q1Var, Integer num, int i10, int i11, boolean z10) {
        float f7;
        int i12;
        int L;
        int forwardNameCenterX;
        int left;
        AnimatorSet animatorSet;
        int i13 = 0;
        int i14 = this.n;
        if ((i14 != 5 || i11 != this.w || this.d != q1Var) && (i14 == 5 || ((i14 != 0 || getTag() == null) && this.d != q1Var))) {
            Runnable runnable = this.h;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                this.h = null;
            }
            int[] iArr = new int[2];
            q1Var.getLocationInWindow(iArr);
            int i15 = iArr[1];
            ((View) getParent()).getLocationInWindow(iArr);
            int i16 = i15 - iArr[1];
            View view = (View) q1Var.getParent();
            boolean z11 = this.r;
            if (i14 == 0) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                i12 = (int) (i16 + photoImage.L0);
                int i17 = (int) photoImage.N0;
                int i18 = i12 + i17;
                int measuredHeight = view.getMeasuredHeight();
                f7 = 10.0f;
                if (i12 > org.telegram.messenger.i0.L(10.0f) + getMeasuredHeight() && i18 <= (i17 / 4) + measuredHeight) {
                    forwardNameCenterX = q1Var.getNoSoundIconCenterX();
                    measure(View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31));
                    int measuredWidth = view.getMeasuredWidth();
                    if (z11) {
                        float f10 = this.y;
                        float L2 = org.telegram.messenger.i0.L(44.0f);
                        this.x = L2;
                        setTranslationY(f10 + L2);
                    } else {
                        float f11 = this.y;
                        float measuredHeight2 = i12 - getMeasuredHeight();
                        this.x = measuredHeight2;
                        setTranslationY(f11 + measuredHeight2);
                    }
                    left = q1Var.getLeft() + forwardNameCenterX;
                    int L3 = org.telegram.messenger.i0.L(19.0f);
                    if (i14 == 5) {
                        int d = i0.a.d(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                        setTranslationX(d);
                        L3 += d;
                    } else if (left > view.getMeasuredWidth() / 2) {
                        int measuredWidth2 = (measuredWidth - getMeasuredWidth()) - org.telegram.messenger.i0.L(38.0f);
                        setTranslationX(measuredWidth2);
                        L3 += measuredWidth2;
                    } else {
                        setTranslationX(0.0f);
                    }
                    int left2 = (q1Var.getLeft() + forwardNameCenterX) - L3;
                    ImageView imageView = this.c;
                    float measuredWidth3 = left2 - (imageView.getMeasuredWidth() / 2);
                    imageView.setTranslationX(measuredWidth3);
                    if (left > view.getMeasuredWidth() / 2) {
                        if (measuredWidth3 < org.telegram.messenger.i0.L(f7)) {
                            float L4 = measuredWidth3 - org.telegram.messenger.i0.L(f7);
                            setTranslationX(getTranslationX() + L4);
                            imageView.setTranslationX(measuredWidth3 - L4);
                        }
                    } else if (measuredWidth3 > getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f)) {
                        float measuredWidth4 = (measuredWidth3 - getMeasuredWidth()) + org.telegram.messenger.i0.L(24.0f);
                        setTranslationX(measuredWidth4);
                        imageView.setTranslationX(measuredWidth3 - measuredWidth4);
                    } else if (measuredWidth3 < org.telegram.messenger.i0.L(f7)) {
                        float L5 = measuredWidth3 - org.telegram.messenger.i0.L(f7);
                        setTranslationX(getTranslationX() + L5);
                        imageView.setTranslationX(measuredWidth3 - L5);
                    }
                    this.d = q1Var;
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
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q30, Float>) View.ALPHA, 0.0f, 1.0f));
                    this.f.addListener(new o30(this, i13));
                    this.f.setDuration(300L);
                    this.f.start();
                    return true;
                }
            } else {
                f7 = 10.0f;
                ag.j3 j3Var = this.a;
                if (i14 == 5) {
                    i12 = i16 + i11;
                    this.w = i11;
                    org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                    if (messageObject != null && (org.telegram.messenger.jj.n1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.jj.n1(messageObject);
                        if (org.telegram.messenger.jj.W4(tL_messageMediaPoll) && !org.telegram.messenger.jj.U4(tL_messageMediaPoll)) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            if (!poll.closed && poll.hide_results_until_close) {
                                j3Var.setText(org.telegram.messenger.cd.L0(2131747174, null));
                                measure(View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31));
                                forwardNameCenterX = i10;
                                int measuredWidth5 = view.getMeasuredWidth();
                                if (z11) {
                                }
                                left = q1Var.getLeft() + forwardNameCenterX;
                                int L32 = org.telegram.messenger.i0.L(19.0f);
                                if (i14 == 5) {
                                }
                                int left22 = (q1Var.getLeft() + forwardNameCenterX) - L32;
                                ImageView imageView2 = this.c;
                                float measuredWidth32 = left22 - (imageView2.getMeasuredWidth() / 2);
                                imageView2.setTranslationX(measuredWidth32);
                                if (left > view.getMeasuredWidth() / 2) {
                                }
                                this.d = q1Var;
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
                        j3Var.setText(org.telegram.messenger.cd.L0(2131747173, null));
                        measure(View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31));
                        forwardNameCenterX = i10;
                        int measuredWidth52 = view.getMeasuredWidth();
                        if (z11) {
                        }
                        left = q1Var.getLeft() + forwardNameCenterX;
                        int L322 = org.telegram.messenger.i0.L(19.0f);
                        if (i14 == 5) {
                        }
                        int left222 = (q1Var.getLeft() + forwardNameCenterX) - L322;
                        ImageView imageView22 = this.c;
                        float measuredWidth322 = left222 - (imageView22.getMeasuredWidth() / 2);
                        imageView22.setTranslationX(measuredWidth322);
                        if (left > view.getMeasuredWidth() / 2) {
                        }
                        this.d = q1Var;
                        animatorSet = this.f;
                        if (animatorSet != null) {
                        }
                        setTag(1);
                        setVisibility(0);
                        if (!z10) {
                        }
                    }
                } else {
                    org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
                    String str = this.s;
                    if (str == null) {
                        j3Var.setText(org.telegram.messenger.cd.L0(2131749338, null));
                    } else {
                        j3Var.setText(str);
                    }
                    measure(View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31));
                    TLRPC.User currentUser = q1Var.getCurrentUser();
                    if (currentUser == null || currentUser.id != 0) {
                        int L6 = org.telegram.messenger.i0.L(22.0f) + i16;
                        if (messageObject2.P3() || !q1Var.i9 || q1Var.T8 == null) {
                            i12 = L6;
                            if (!z11 || i12 > org.telegram.messenger.i0.L(10.0f) + getMeasuredHeight()) {
                                forwardNameCenterX = q1Var.getForwardNameCenterX();
                                int measuredWidth522 = view.getMeasuredWidth();
                                if (z11) {
                                }
                                left = q1Var.getLeft() + forwardNameCenterX;
                                int L3222 = org.telegram.messenger.i0.L(19.0f);
                                if (i14 == 5) {
                                }
                                int left2222 = (q1Var.getLeft() + forwardNameCenterX) - L3222;
                                ImageView imageView222 = this.c;
                                float measuredWidth3222 = left2222 - (imageView222.getMeasuredWidth() / 2);
                                imageView222.setTranslationX(measuredWidth3222);
                                if (left > view.getMeasuredWidth() / 2) {
                                }
                                this.d = q1Var;
                                animatorSet = this.f;
                                if (animatorSet != null) {
                                }
                                setTag(1);
                                setVisibility(0);
                                if (!z10) {
                                }
                            }
                        } else {
                            L = org.telegram.messenger.i0.L(20.0f) + L6;
                        }
                    } else {
                        L = org.telegram.messenger.z20.D(50.0f, q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - view.getMeasuredHeight()), i16);
                    }
                    i12 = L;
                    if (!z11) {
                    }
                    forwardNameCenterX = q1Var.getForwardNameCenterX();
                    int measuredWidth5222 = view.getMeasuredWidth();
                    if (z11) {
                    }
                    left = q1Var.getLeft() + forwardNameCenterX;
                    int L32222 = org.telegram.messenger.i0.L(19.0f);
                    if (i14 == 5) {
                    }
                    int left22222 = (q1Var.getLeft() + forwardNameCenterX) - L32222;
                    ImageView imageView2222 = this.c;
                    float measuredWidth32222 = left22222 - (imageView2222.getMeasuredWidth() / 2);
                    imageView2222.setTranslationX(measuredWidth32222);
                    if (left > view.getMeasuredWidth() / 2) {
                    }
                    this.d = q1Var;
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
            org.telegram.messenger.i0.r(runnable);
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
            this.f.playTogether(ObjectAnimator.ofFloat(this, (Property<q30, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q30, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q30, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.f.setDuration(350L);
            this.f.setInterpolator(gr.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q30, Float>) property, 0.0f, 1.0f));
            this.f.setDuration(300L);
        }
        this.f.addListener(new o30(this, i10));
        this.f.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        if (r4 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0141, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015a, code lost:
    
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
        Point point = org.telegram.messenger.i0.q;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int L = iArr[1] - org.telegram.messenger.i0.L(4.0f);
        boolean z10 = this.r;
        int i12 = this.n;
        if (i12 == 4) {
            L += org.telegram.messenger.i0.L(4.0f);
        } else if (i12 == 6 && z10) {
            L = org.telegram.messenger.m5.C(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else if (i12 == 7 || (i12 == 8 && z10)) {
            L = org.telegram.messenger.m5.C(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else if (i12 == 8) {
            L -= org.telegram.messenger.i0.L(10.0f);
        }
        int i13 = 0;
        if (i12 != 8 || !z10) {
            measuredWidth = i12 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof org.telegram.ui.ActionBar.u5) {
            org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) view;
            Drawable rightDrawable = u5Var.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : u5Var.getTextWidth() / 2)) - org.telegram.messenger.i0.L(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - org.telegram.messenger.i0.L(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i14 = measuredWidth - iArr[0];
        int i15 = (L - iArr[1]) - this.D;
        int c10 = c() + i14;
        int measuredWidth3 = view2.getMeasuredWidth();
        if (!z10 || i12 == 6 || i12 == 7 || i12 == 8) {
            float f7 = this.y;
            float measuredHeight = i15 - getMeasuredHeight();
            this.x = measuredHeight;
            setTranslationY(f7 + measuredHeight);
        } else {
            float f10 = this.y;
            float L2 = org.telegram.messenger.i0.L(44.0f);
            this.x = L2;
            setTranslationY(f10 + L2);
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
            measuredWidth4 += org.telegram.messenger.i0.L(2.0f);
        }
        imageView.setTranslationX(measuredWidth4);
        if (c10 > view2.getMeasuredWidth() / 2) {
            if (measuredWidth4 < org.telegram.messenger.i0.L(10.0f)) {
                float L3 = measuredWidth4 - org.telegram.messenger.i0.L(10.0f);
                setTranslationX(getTranslationX() + L3);
                imageView.setTranslationX(measuredWidth4 - L3);
                return;
            }
            return;
        }
        if (measuredWidth4 > getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f)) {
            float measuredWidth5 = (measuredWidth4 - getMeasuredWidth()) + org.telegram.messenger.i0.L(24.0f);
            setTranslationX(measuredWidth5);
            imageView.setTranslationX(measuredWidth4 - measuredWidth5);
        } else if (measuredWidth4 < org.telegram.messenger.i0.L(10.0f)) {
            float L4 = measuredWidth4 - org.telegram.messenger.i0.L(10.0f);
            setTranslationX(getTranslationX() + L4);
            imageView.setTranslationX(measuredWidth4 - L4);
        }
    }

    public float getBaseTranslationY() {
        return this.x;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.D = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.y = f7;
        setTranslationY(f7 + this.x);
    }

    public void setOverrideText(String str) {
        this.s = str;
        this.a.setText(str);
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null) {
            this.d = null;
            e(q1Var, null, 0, 0, false);
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

    public q30(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        this(2, activity, p6Var, false);
    }

    public q30(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = p6Var;
        this.n = i10;
        this.r = z10;
        ag.j3 j3Var = new ag.j3(context, 21);
        this.a = j3Var;
        int i11 = org.telegram.ui.ActionBar.t6.dg;
        org.telegram.ui.ActionBar.a7.V(j3Var, i11, p6Var);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            j3Var.setMaxWidth(org.telegram.messenger.i0.L(310.0f));
        } else if (i10 == 4) {
            j3Var.setMaxWidth(org.telegram.messenger.i0.L(280.0f));
        } else {
            j3Var.setMaxWidth(org.telegram.messenger.i0.L(250.0f));
        }
        if (i10 == 3) {
            j3Var.setGravity(19);
            int L = org.telegram.messenger.i0.L(5.0f);
            int i12 = org.telegram.ui.ActionBar.t6.eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            j3Var.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(j3Var, d02, N, null, p6Var);
            j3Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            addView(j3Var, w7.b6.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            j3Var.setGravity(51);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            int i13 = org.telegram.ui.ActionBar.t6.eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
            j3Var.setBackground(d03);
            org.telegram.ui.ActionBar.a7.k(j3Var, d03, N2, null, p6Var);
            j3Var.setPadding(org.telegram.messenger.i0.L(i10 == 0 ? 54.0f : 12.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(10.0f));
            addView(j3Var, w7.b6.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            j3Var.setText(org.telegram.messenger.cd.L0(2131753762, null));
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.b.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.a7.t(this.b, i11, p6Var, PorterDuff.Mode.MULTIPLY);
            addView(this.b, w7.b6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.eg, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, w7.b6.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(p30 p30Var) {
    }
}
