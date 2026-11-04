package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class u20 extends FrameLayout {
    public final ci.ec a;
    public final ImageView b;
    public View c;
    public AnimatorSet d;
    public Runnable e;
    public final int f;
    public final boolean h;
    public float n;
    public float r;
    public int s;
    public long w;
    public boolean x;

    public u20(Context context, int i3) {
        this(i3, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z10 = this.x;
        int i3 = 1;
        Property property = View.ALPHA;
        if (z10) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<u20, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<u20, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<u20, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(xq.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<u20, Float>) property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new s20(this, i3));
        this.d.start();
    }

    public final void b() {
        ci.ec ecVar = this.a;
        org.telegram.ui.ActionBar.r6.r(ecVar);
        ImageView imageView = this.b;
        org.telegram.ui.ActionBar.r6.r(imageView);
        ecVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i3 = this.f;
        ecVar.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L((i3 == 7 || i3 == 8) ? 6.0f : 3.0f), -366530760));
    }

    public final void c(View view) {
        if (this.c == view || getTag() != null) {
            if (getTag() != null) {
                d(view);
                return;
            }
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.e = null;
        }
        d(view);
        this.c = view;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        setTag(1);
        int i3 = 0;
        setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z10 = this.x;
        Property property = View.ALPHA;
        if (z10) {
            ImageView imageView = this.b;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.d.playTogether(ObjectAnimator.ofFloat(this, (Property<u20, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<u20, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<u20, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.d.setDuration(350L);
            this.d.setInterpolator(xq.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<u20, Float>) property, 0.0f, 1.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new s20(this, i3));
        this.d.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r3 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
    
        if (r3 >= 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view) {
        int measuredWidth;
        int i3;
        int i10;
        int measuredWidth2;
        Point point = org.telegram.messenger.g0.q;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int L = iArr[1] - org.telegram.messenger.g0.L(4.0f);
        boolean z10 = this.h;
        int i11 = this.f;
        if (i11 == 4) {
            L += org.telegram.messenger.g0.L(4.0f);
        } else if (i11 == 6 && z10) {
            L = org.telegram.messenger.k5.C(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else if (i11 == 7 || (i11 == 8 && z10)) {
            L = org.telegram.messenger.k5.C(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else if (i11 == 8) {
            L -= org.telegram.messenger.g0.L(10.0f);
        }
        int i12 = 0;
        if (i11 != 8 || !z10) {
            measuredWidth = i11 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof org.telegram.ui.ActionBar.k5) {
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
            Drawable rightDrawable = k5Var.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : k5Var.getTextWidth() / 2)) - org.telegram.messenger.g0.L(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - org.telegram.messenger.g0.L(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i13 = measuredWidth - iArr[0];
        int i14 = (L - iArr[1]) - this.s;
        int measuredWidth3 = view2.getMeasuredWidth();
        if (!z10 || i11 == 6 || i11 == 7 || i11 == 8) {
            float f10 = this.r;
            float measuredHeight = i14 - getMeasuredHeight();
            this.n = measuredHeight;
            setTranslationY(f10 + measuredHeight);
        } else {
            float f11 = this.r;
            float L2 = org.telegram.messenger.g0.L(44.0f);
            this.n = L2;
            setTranslationY(f11 + L2);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i3 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i10 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i3 = 0;
            i10 = 0;
        }
        ImageView imageView = this.b;
        if (i11 == 8 && !z10) {
            i12 = (((measuredWidth3 - i3) - i10) - getMeasuredWidth()) / 2;
        } else if (i13 > view2.getMeasuredWidth() / 2) {
            if (i11 == 3) {
                measuredWidth2 = (int) (measuredWidth3 - (getMeasuredWidth() * 1.5f));
            } else {
                i12 = (measuredWidth3 - getMeasuredWidth()) - (i10 + i3);
            }
        } else if (i11 == 3) {
            measuredWidth2 = (i13 - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth();
        }
        setTranslationX(i12);
        float measuredWidth4 = (i13 - (i3 + i12)) - (imageView.getMeasuredWidth() / 2.0f);
        if (i11 == 7) {
            measuredWidth4 += org.telegram.messenger.g0.L(2.0f);
        }
        imageView.setTranslationX(measuredWidth4);
        if (i13 > view2.getMeasuredWidth() / 2) {
            if (measuredWidth4 < org.telegram.messenger.g0.L(10.0f)) {
                float L3 = measuredWidth4 - org.telegram.messenger.g0.L(10.0f);
                setTranslationX(getTranslationX() + L3);
                imageView.setTranslationX(measuredWidth4 - L3);
                return;
            }
            return;
        }
        if (measuredWidth4 > getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f)) {
            float measuredWidth5 = (measuredWidth4 - getMeasuredWidth()) + org.telegram.messenger.g0.L(24.0f);
            setTranslationX(measuredWidth5);
            imageView.setTranslationX(measuredWidth4 - measuredWidth5);
        } else if (measuredWidth4 < org.telegram.messenger.g0.L(10.0f)) {
            float L4 = measuredWidth4 - org.telegram.messenger.g0.L(10.0f);
            setTranslationX(getTranslationX() + L4);
            imageView.setTranslationX(measuredWidth4 - L4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.n;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
    }

    public void setBottomOffset(int i3) {
        this.s = i3;
    }

    public void setExtraTranslationY(float f10) {
        this.r = f10;
        setTranslationY(f10 + this.n);
    }

    public void setOverrideText(String str) {
        this.a.setText(str);
    }

    public void setShowingDuration(long j10) {
        this.w = j10;
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.x = z10;
    }

    public u20(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.w = 2000L;
        this.f = i3;
        this.h = z10;
        ci.ec ecVar = new ci.ec(context, 24);
        this.a = ecVar;
        int i10 = org.telegram.ui.ActionBar.k6.dg;
        org.telegram.ui.ActionBar.r6.V(ecVar, i10, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setMaxLines(2);
        if (i3 == 7 || i3 == 8 || i3 == 9) {
            ecVar.setMaxWidth(org.telegram.messenger.g0.L(310.0f));
        } else if (i3 == 4) {
            ecVar.setMaxWidth(org.telegram.messenger.g0.L(280.0f));
        } else {
            ecVar.setMaxWidth(org.telegram.messenger.g0.L(250.0f));
        }
        if (i3 == 3) {
            ecVar.setGravity(19);
            int L = org.telegram.messenger.g0.L(5.0f);
            int i11 = org.telegram.ui.ActionBar.k6.eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            ecVar.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(ecVar, d02, N, null, e6Var);
            ecVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(ecVar, b8.mf.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            ecVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.k6.eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            ecVar.setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(ecVar, d03, N2, null, e6Var);
            ecVar.setPadding(org.telegram.messenger.g0.L(i3 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(ecVar, b8.mf.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i3 == 0) {
            ecVar.setText(org.telegram.messenger.bd.M0(2131753762, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.tooltip_sound);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, b8.mf.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.eg, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, b8.mf.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(t20 t20Var) {
    }
}
