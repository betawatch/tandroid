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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class t8 extends FrameLayout {
    public static final ch.g F = new ch.g("animationProgress", 2);
    public int A;
    public final org.telegram.ui.ActionBar.b6 B;
    public pi0 C;
    public boolean D;
    public boolean E;
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

    public t8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        if (this.a) {
            return LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f10) {
        this.s = f10;
        float lastTouchX = getLastTouchX();
        float max = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f11 = max * this.s;
        Switch r22 = this.e;
        r22.N = lastTouchX;
        r22.O = measuredHeight;
        r22.P = f11;
        r22.invalidate();
    }

    public final void b(int i9, boolean z10) {
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.x = null;
        }
        int i10 = this.r;
        if (i10 != 0) {
            setBackgroundColor(i10);
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.e.setOverrideColor(z10 ? 1 : 2);
        this.r = i9;
        this.v.setColor(i9);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, F, 0.0f, 1.0f);
        this.x = ofFloat;
        ofFloat.addListener(new r8(this, i9, 0));
        this.x.setInterpolator(gr.g);
        this.x.setDuration(240L).start();
    }

    public final void c(int i9, int i10) {
        if (this.C == null) {
            pi0 pi0Var = new pi0(getContext());
            this.C = pi0Var;
            pi0Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.C, g7.e6.d(29, 29.0f, (LocaleController.isRTL ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.A = AndroidUtilities.dp(65.0f);
            TextView textView = this.c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = LocaleController.isRTL ? 70 : this.A;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = LocaleController.isRTL ? this.A : 70;
        }
        this.C.setVisibility(0);
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.C.setImageResource(i10);
        this.C.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.C.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(9.0f), i9));
    }

    public final void d(int i9, int i10, int i11, int i12, int i13) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.B);
        TextView textView = this.c;
        textView.setTextColor(v02);
        this.e.d(i10, i11, i12, i13);
        textView.setTag(Integer.valueOf(i9));
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
        r12.c(z10, this.E);
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
        this.E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.s, this.v);
        }
        if (this.f) {
            org.telegram.ui.ActionBar.b6 b6Var = this.B;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : org.telegram.ui.ActionBar.f6.k0;
            if (O != null) {
                if (this.C != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : this.A, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? this.A : 0), getMeasuredHeight() - 1, O);
                } else {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, O);
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
    public final void onMeasure(int i9, int i10) {
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.d.getVisibility() == 0 ? 64.0f : this.n) + (this.f ? 1 : 0), TLObject.FLAG_30));
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
    public void setBackgroundColor(int i9) {
        if (this.r != i9) {
            clearAnimation();
            this.r = 0;
            super.setBackgroundColor(i9);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i9) {
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.x = null;
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.v.setColor(i10);
        setBackgroundColor(i9);
        this.e.setOverrideColor(1);
        this.r = i9;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, F, 1.0f, 0.0f).setDuration(240L);
        this.x = duration;
        duration.addListener(new r8(this, i9, 1));
        this.x.setInterpolator(gr.g);
        this.x.start();
    }

    public void setCheckBoxIcon(int i9) {
        this.e.setIcon(i9);
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

    public void setHeight(int i9) {
        this.n = i9;
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

    public t8(Context context, int i9) {
        this(i9, context, null, false);
    }

    public t8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(21, context, b6Var, false);
    }

    public t8(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.n = 50;
        this.B = b6Var;
        this.A = i9;
        TextView textView = new TextView(context);
        this.c = textView;
        ll.n(z10 ? org.telegram.ui.ActionBar.f6.j5 : org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i9, 0.0f, z11 ? i9 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        ll.n(z10 ? org.telegram.ui.ActionBar.f6.J5 : org.telegram.ui.ActionBar.f6.z6, b6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i9, 35.0f, z12 ? i9 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, b6Var);
        this.e = r12;
        int i10 = org.telegram.ui.ActionBar.f6.M6;
        int i11 = org.telegram.ui.ActionBar.f6.N6;
        int i12 = org.telegram.ui.ActionBar.f6.d6;
        r12.d(i10, i11, i12, i12);
        addView(r12, g7.e6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.D = LocaleController.isRTL;
    }
}
