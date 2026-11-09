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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class z20 extends FrameLayout {
    public final bi.md a;
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

    public z20(Context context, int i7) {
        this(i7, context, null, false);
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
        boolean z9 = this.x;
        int i7 = 1;
        Property property = View.ALPHA;
        if (z9) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<z20, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<z20, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<z20, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(xq.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<z20, Float>) property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new x20(this, i7));
        this.d.start();
    }

    public final void b() {
        bi.md mdVar = this.a;
        org.telegram.ui.ActionBar.s6.q(mdVar);
        ImageView imageView = this.b;
        org.telegram.ui.ActionBar.s6.q(imageView);
        mdVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i7 = this.f;
        mdVar.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L((i7 == 7 || i7 == 8) ? 6.0f : 3.0f), -366530760));
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
        int i7 = 0;
        setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z9 = this.x;
        Property property = View.ALPHA;
        if (z9) {
            ImageView imageView = this.b;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.d.playTogether(ObjectAnimator.ofFloat(this, (Property<z20, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<z20, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<z20, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.d.setDuration(350L);
            this.d.setInterpolator(xq.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<z20, Float>) property, 0.0f, 1.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new x20(this, i7));
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
        int i7;
        int i10;
        int measuredWidth2;
        Point point = org.telegram.messenger.g0.q;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int L = iArr[1] - org.telegram.messenger.g0.L(4.0f);
        boolean z9 = this.h;
        int i11 = this.f;
        if (i11 == 4) {
            L += org.telegram.messenger.g0.L(4.0f);
        } else if (i11 == 6 && z9) {
            L = org.telegram.messenger.k5.C(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else if (i11 == 7 || (i11 == 8 && z9)) {
            L = org.telegram.messenger.k5.C(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else if (i11 == 8) {
            L -= org.telegram.messenger.g0.L(10.0f);
        }
        int i12 = 0;
        if (i11 != 8 || !z9) {
            measuredWidth = i11 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof org.telegram.ui.ActionBar.l5) {
            org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
            Drawable rightDrawable = l5Var.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : l5Var.getTextWidth() / 2)) - org.telegram.messenger.g0.L(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - org.telegram.messenger.g0.L(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i13 = measuredWidth - iArr[0];
        int i14 = (L - iArr[1]) - this.s;
        int measuredWidth3 = view2.getMeasuredWidth();
        if (!z9 || i11 == 6 || i11 == 7 || i11 == 8) {
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
            i7 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i10 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i7 = 0;
            i10 = 0;
        }
        ImageView imageView = this.b;
        if (i11 == 8 && !z9) {
            i12 = (((measuredWidth3 - i7) - i10) - getMeasuredWidth()) / 2;
        } else if (i13 > view2.getMeasuredWidth() / 2) {
            if (i11 == 3) {
                measuredWidth2 = (int) (measuredWidth3 - (getMeasuredWidth() * 1.5f));
            } else {
                i12 = (measuredWidth3 - getMeasuredWidth()) - (i10 + i7);
            }
        } else if (i11 == 3) {
            measuredWidth2 = (i13 - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth();
        }
        setTranslationX(i12);
        float measuredWidth4 = (i13 - (i7 + i12)) - (imageView.getMeasuredWidth() / 2.0f);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setBottomOffset(int i7) {
        this.s = i7;
    }

    public void setExtraTranslationY(float f10) {
        this.r = f10;
        setTranslationY(f10 + this.n);
    }

    public void setOverrideText(String str) {
        this.a.setText(str);
    }

    public void setShowingDuration(long j3) {
        this.w = j3;
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setUseScale(boolean z9) {
        this.x = z9;
    }

    public z20(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        this.w = 2000L;
        this.f = i7;
        this.h = z9;
        bi.md mdVar = new bi.md(context, 24);
        this.a = mdVar;
        int i10 = org.telegram.ui.ActionBar.l6.dg;
        org.telegram.ui.ActionBar.s6.U(mdVar, i10, g6Var);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setMaxLines(2);
        if (i7 == 7 || i7 == 8 || i7 == 9) {
            mdVar.setMaxWidth(org.telegram.messenger.g0.L(310.0f));
        } else if (i7 == 4) {
            mdVar.setMaxWidth(org.telegram.messenger.g0.L(280.0f));
        } else {
            mdVar.setMaxWidth(org.telegram.messenger.g0.L(250.0f));
        }
        if (i7 == 3) {
            mdVar.setGravity(19);
            int L = org.telegram.messenger.g0.L(5.0f);
            int i11 = org.telegram.ui.ActionBar.l6.eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
            mdVar.setBackground(d02);
            org.telegram.ui.ActionBar.s6.j(mdVar, d02, M, null, g6Var);
            mdVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(mdVar, c8.ha.d(-2, 30.0f, 51, 0.0f, z9 ? 6.0f : 0.0f, 0.0f, z9 ? 0.0f : 6.0f));
        } else {
            mdVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.l6.eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(L2, org.telegram.ui.ActionBar.l6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i12);
            mdVar.setBackground(d03);
            org.telegram.ui.ActionBar.s6.j(mdVar, d03, M2, null, g6Var);
            mdVar.setPadding(org.telegram.messenger.g0.L(i7 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(mdVar, c8.ha.d(-2, -2.0f, 51, 0.0f, z9 ? 6.0f : 0.0f, 0.0f, z9 ? 0.0f : 6.0f));
        }
        if (i7 == 0) {
            mdVar.setText(org.telegram.messenger.id.M0(2131753762, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.tooltip_sound);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.ha.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        imageView2.setImageResource(z9 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.eg, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ha.d(14, 6.0f, (z9 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(y20 y20Var) {
    }
}
