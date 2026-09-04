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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class w8 extends FrameLayout {
    public static final t8 J = new t8("animationProgress", 0);
    public int E;
    public final org.telegram.ui.ActionBar.f6 F;
    public aj0 G;
    public boolean H;
    public boolean I;
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
    public Paint v;
    public float w;
    public ObjectAnimator x;
    public boolean y;

    public w8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        if (this.a) {
            return LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f7) {
        this.s = f7;
        float lastTouchX = getLastTouchX();
        float max = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f10 = max * this.s;
        Switch r22 = this.e;
        r22.R = lastTouchX;
        r22.S = measuredHeight;
        r22.T = f10;
        r22.invalidate();
    }

    public final void b(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.x = null;
        }
        int i11 = this.r;
        if (i11 != 0) {
            setBackgroundColor(i11);
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.e.setOverrideColor(z10 ? 1 : 2);
        this.r = i10;
        this.v.setColor(i10);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, J, 0.0f, 1.0f);
        this.x = ofFloat;
        ofFloat.addListener(new u8(this, i10, 0));
        this.x.setInterpolator(pr.g);
        this.x.setDuration(240L).start();
    }

    public final void c(int i10, int i11) {
        if (this.G == null) {
            aj0 aj0Var = new aj0(getContext());
            this.G = aj0Var;
            aj0Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.G, w7.x5.d(29, 29.0f, (LocaleController.isRTL ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.E = AndroidUtilities.dp(65.0f);
            TextView textView = this.c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = LocaleController.isRTL ? 70 : this.E;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = LocaleController.isRTL ? this.E : 70;
        }
        this.G.setVisibility(0);
        this.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.G.setImageResource(i11);
        this.G.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.G.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(9.0f), i10));
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.F);
        TextView textView = this.c;
        textView.setTextColor(v02);
        this.e.d(i11, i12, i13, i14);
        textView.setTag(Integer.valueOf(i10));
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
        org.telegram.ui.g5.a(charSequence, this);
        TextView textView = this.c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.e;
        r12.setVisibility(0);
        r12.c(z10, this.I);
        this.f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.g5.a(str, this);
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
            textView2.setPadding(0, 0, 0, AndroidUtilities.dp(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z12);
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.s, this.v);
        }
        if (this.f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.F;
            Paint G = f6Var != null ? f6Var.G("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (G != null) {
                if (this.G != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : this.E, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? this.E : 0), getMeasuredHeight() - 1, G);
                } else {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, G);
                }
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
    public final void onMeasure(int i10, int i11) {
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.d.getVisibility() == 0 ? 64.0f : this.n) + (this.f ? 1 : 0), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.w = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.a = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.r != i10) {
            clearAnimation();
            this.r = 0;
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i10) {
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.x = null;
        }
        int i11 = this.r;
        if (i11 == 0) {
            i11 = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.v.setColor(i11);
        setBackgroundColor(i10);
        this.e.setOverrideColor(1);
        this.r = i10;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, J, 1.0f, 0.0f).setDuration(240L);
        this.x = duration;
        duration.addListener(new u8(this, i10, 1));
        this.x.setInterpolator(pr.g);
        this.x.start();
    }

    public void setCheckBoxIcon(int i10) {
        this.e.setIcon(i10);
    }

    public void setChecked(boolean z10) {
        this.e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.y = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setEnabled(z10);
    }

    public void setHeight(int i10) {
        this.n = i10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.y) {
            this.e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    public w8(Context context, int i10) {
        this(i10, context, null, false);
    }

    public w8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(21, context, f6Var, false);
    }

    public w8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.n = 50;
        this.F = f6Var;
        this.E = i10;
        TextView textView = new TextView(context);
        this.c = textView;
        wl.n(z10 ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.x5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i10, 0.0f, z11 ? i10 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        wl.n(z10 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, w7.x5.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i10, 35.0f, z12 ? i10 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, f6Var);
        this.e = r12;
        int i11 = org.telegram.ui.ActionBar.j6.M6;
        int i12 = org.telegram.ui.ActionBar.j6.N6;
        int i13 = org.telegram.ui.ActionBar.j6.d6;
        r12.d(i11, i12, i13, i13);
        addView(r12, w7.x5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.H = LocaleController.isRTL;
    }
}
