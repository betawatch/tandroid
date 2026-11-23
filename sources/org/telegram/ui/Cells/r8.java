package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class r8 extends FrameLayout {
    public static final o8 K = new o8("animationProgress", 0);
    public boolean E;
    public int F;
    public final org.telegram.ui.ActionBar.i6 G;
    public qh0 H;
    public boolean I;
    public boolean J;
    public boolean a;
    public int b;
    public final TextView c;
    public final TextView d;
    public final Switch e;
    public boolean f;
    public boolean h;
    public int n;
    public int r;
    public float s;
    public Paint w;
    public float x;
    public ObjectAnimator y;

    public r8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        if (this.a) {
            return gd.a0 ? org.telegram.messenger.g0.L(22.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f10) {
        this.s = f10;
        float lastTouchX = getLastTouchX();
        float max = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + org.telegram.messenger.g0.L(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f11 = max * this.s;
        Switch r22 = this.e;
        r22.R = lastTouchX;
        r22.S = measuredHeight;
        r22.T = f11;
        r22.invalidate();
    }

    public final void b(int i7, boolean z10) {
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.y = null;
        }
        int i10 = this.r;
        if (i10 != 0) {
            setBackgroundColor(i10);
        }
        if (this.w == null) {
            this.w = new Paint(1);
        }
        this.e.setOverrideColor(z10 ? 1 : 2);
        this.r = i7;
        this.w.setColor(i7);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, K, 0.0f, 1.0f);
        this.y = ofFloat;
        ofFloat.addListener(new p8(this, i7, 0));
        this.y.setInterpolator(kr.g);
        this.y.setDuration(240L).start();
    }

    public final void c(int i7, int i10) {
        if (this.H == null) {
            qh0 qh0Var = new qh0(getContext());
            this.H = qh0Var;
            qh0Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.H, c8.na.d(29, 29.0f, (gd.a0 ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.F = org.telegram.messenger.g0.L(65.0f);
            TextView textView = this.c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = gd.a0 ? 70 : this.F;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = gd.a0 ? this.F : 70;
        }
        this.H.setVisibility(0);
        this.H.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.H.setImageResource(i10);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.H.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(9.0f), i7));
    }

    public final void d(int i7, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.i6 i6Var = this.G;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        this.e.d(i10, i11, i12, i13);
        textView.setTag(Integer.valueOf(i7));
    }

    public final void e(ArrayList arrayList, boolean z10) {
        super.setEnabled(z10);
        Switch r02 = this.e;
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (arrayList == null) {
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            r02.setAlpha(z10 ? 1.0f : 0.5f);
            if (textView2.getVisibility() == 0) {
                textView2.setAlpha(z10 ? 1.0f : 0.5f);
                return;
            }
            return;
        }
        float[] fArr = {z10 ? 1.0f : 0.5f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(r02, (Property<Switch, Float>) property, z10 ? 1.0f : 0.5f));
        if (textView2.getVisibility() == 0) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, z10 ? 1.0f : 0.5f));
        }
    }

    public final void f(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.f5.a(charSequence, this);
        TextView textView = this.c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.e;
        r12.setVisibility(0);
        r12.c(z10, this.J);
        this.f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.f5.a(str, this);
        TextView textView = this.c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.e;
        r42.setVisibility(0);
        r42.c(z10, false);
        this.f = z12;
        textView2.setVisibility(0);
        this.h = z11;
        if (z11) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z12);
    }

    public Switch getCheckBox() {
        return this.e;
    }

    public TextView getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + org.telegram.messenger.g0.L(40.0f)) * this.s, this.w);
        }
        if (this.f) {
            org.telegram.ui.ActionBar.i6 i6Var = this.G;
            Paint e10 = i6Var != null ? i6Var.e("paintDivider") : org.telegram.ui.ActionBar.n6.k0;
            if (e10 != null) {
                if (this.H != null) {
                    canvas.drawLine(gd.a0 ? 0.0f : this.F, getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? this.F : 0), getMeasuredHeight() - 1, e10);
                    return;
                }
                int i7 = 0;
                float L = gd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f);
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (gd.a0) {
                    i7 = org.telegram.messenger.g0.L(20.0f);
                }
                canvas.drawLine(L, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, e10);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append('\n');
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.d.getVisibility() == 0 ? 64.0f : this.n) + (this.f ? 1 : 0), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.x = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.a = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (this.r != i7) {
            clearAnimation();
            this.r = 0;
            super.setBackgroundColor(i7);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i7) {
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.y = null;
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        if (this.w == null) {
            this.w = new Paint(1);
        }
        this.w.setColor(i10);
        setBackgroundColor(i7);
        this.e.setOverrideColor(1);
        this.r = i7;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, K, 1.0f, 0.0f).setDuration(240L);
        this.y = duration;
        duration.addListener(new p8(this, i7, 1));
        this.y.setInterpolator(kr.g);
        this.y.start();
    }

    public void setCheckBoxIcon(int i7) {
        this.e.setIcon(i7);
    }

    public void setChecked(boolean z10) {
        this.e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.E = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setEnabled(z10);
    }

    public void setHeight(int i7) {
        this.n = i7;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.E) {
            this.e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    public r8(Context context, int i7) {
        this(i7, context, null, false);
    }

    public r8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(21, context, i6Var, false);
    }

    public r8(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.n = 50;
        this.G = i6Var;
        this.F = i7;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, z10 ? org.telegram.ui.ActionBar.n6.j5 : org.telegram.ui.ActionBar.n6.G6, i6Var);
        m10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((gd.a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = gd.a0;
        addView(textView, c8.na.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i7, 0.0f, z11 ? i7 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, z10 ? org.telegram.ui.ActionBar.n6.J5 : org.telegram.ui.ActionBar.n6.z6, i6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(gd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = gd.a0;
        addView(textView2, c8.na.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i7, 35.0f, z12 ? i7 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, i6Var);
        this.e = r12;
        int i10 = org.telegram.ui.ActionBar.n6.M6;
        int i11 = org.telegram.ui.ActionBar.n6.N6;
        int i12 = org.telegram.ui.ActionBar.n6.d6;
        r12.d(i10, i11, i12, i12);
        addView(r12, c8.na.d(37, 20.0f, (gd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.I = gd.a0;
    }
}
