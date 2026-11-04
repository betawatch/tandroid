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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class q8 extends FrameLayout {
    public static final n8 K = new n8("animationProgress", 0);
    public boolean E;
    public int F;
    public final org.telegram.ui.ActionBar.e6 G;
    public fh0 H;
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

    public q8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        if (this.a) {
            return bd.a0 ? org.telegram.messenger.g0.L(22.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
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

    public final void b(int i3, boolean z10) {
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
        this.r = i3;
        this.w.setColor(i3);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, K, 0.0f, 1.0f);
        this.y = ofFloat;
        ofFloat.addListener(new o8(this, i3, 0));
        this.y.setInterpolator(xq.g);
        this.y.setDuration(240L).start();
    }

    public final void c(int i3, int i10) {
        if (this.H == null) {
            fh0 fh0Var = new fh0(getContext());
            this.H = fh0Var;
            fh0Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.H, mf.d(29, 29.0f, (bd.a0 ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.F = org.telegram.messenger.g0.L(65.0f);
            TextView textView = this.c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = bd.a0 ? 70 : this.F;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = bd.a0 ? this.F : 70;
        }
        this.H.setVisibility(0);
        this.H.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.H.setImageResource(i10);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.H.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), i3));
    }

    public final void d(int i3, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.e6 e6Var = this.G;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        this.e.d(i10, i11, i12, i13);
        textView.setTag(Integer.valueOf(i3));
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
        org.telegram.ui.h5.a(charSequence, this);
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
        org.telegram.ui.h5.a(str, this);
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
            org.telegram.ui.ActionBar.e6 e6Var = this.G;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (d != null) {
                if (this.H != null) {
                    canvas.drawLine(bd.a0 ? 0.0f : this.F, getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? this.F : 0), getMeasuredHeight() - 1, d);
                    return;
                }
                int i3 = 0;
                float L = bd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f);
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (bd.a0) {
                    i3 = org.telegram.messenger.g0.L(20.0f);
                }
                canvas.drawLine(L, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, d);
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
    public final void onMeasure(int i3, int i10) {
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.d.getVisibility() == 0 ? 64.0f : this.n) + (this.f ? 1 : 0), TLObject.FLAG_30));
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
    public void setBackgroundColor(int i3) {
        if (this.r != i3) {
            clearAnimation();
            this.r = 0;
            super.setBackgroundColor(i3);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i3) {
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
        setBackgroundColor(i3);
        this.e.setOverrideColor(1);
        this.r = i3;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, K, 1.0f, 0.0f).setDuration(240L);
        this.y = duration;
        duration.addListener(new o8(this, i3, 1));
        this.y.setInterpolator(xq.g);
        this.y.start();
    }

    public void setCheckBoxIcon(int i3) {
        this.e.setIcon(i3);
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

    public void setHeight(int i3) {
        this.n = i3;
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

    public q8(Context context, int i3) {
        this(i3, context, null, false);
    }

    public q8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(21, context, e6Var, false);
    }

    public q8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.n = 50;
        this.G = e6Var;
        this.F = i3;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, z10 ? org.telegram.ui.ActionBar.k6.j5 : org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((bd.a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = bd.a0;
        addView(textView, mf.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i3, 0.0f, z11 ? i3 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, z10 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.z6, e6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(bd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = bd.a0;
        addView(textView2, mf.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i3, 35.0f, z12 ? i3 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, e6Var);
        this.e = r12;
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        r12.d(i10, i11, i12, i12);
        addView(r12, mf.d(37, 20.0f, (bd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.I = bd.a0;
    }
}
