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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class r8 extends FrameLayout {
    public static final hh.g G = new hh.g("animationProgress", 2);
    public int B;
    public final org.telegram.ui.ActionBar.f6 C;
    public jj0 D;
    public boolean E;
    public boolean F;
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

    public r8(Context context) {
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
        r22.O = lastTouchX;
        r22.P = measuredHeight;
        r22.Q = f11;
        r22.invalidate();
    }

    public final void b(int i10, boolean z4) {
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
        this.e.setOverrideColor(z4 ? 1 : 2);
        this.r = i10;
        this.v.setColor(i10);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, G, 0.0f, 1.0f);
        this.x = ofFloat;
        ofFloat.addListener(new p8(this, i10, 0));
        this.x.setInterpolator(mr.g);
        this.x.setDuration(240L).start();
    }

    public final void c(int i10, int i11) {
        if (this.D == null) {
            jj0 jj0Var = new jj0(getContext());
            this.D = jj0Var;
            jj0Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.D, k7.b6.d(29, 29.0f, (LocaleController.isRTL ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.B = AndroidUtilities.dp(65.0f);
            TextView textView = this.c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = LocaleController.isRTL ? 70 : this.B;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = LocaleController.isRTL ? this.B : 70;
        }
        this.D.setVisibility(0);
        this.D.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.D.setImageResource(i11);
        this.D.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.D.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(9.0f), i10));
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.C);
        TextView textView = this.c;
        textView.setTextColor(v02);
        this.e.d(i11, i12, i13, i14);
        textView.setTag(Integer.valueOf(i10));
    }

    public final void e(ArrayList arrayList, boolean z4) {
        super.setEnabled(z4);
        Switch r02 = this.e;
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (arrayList == null) {
            textView.setAlpha(z4 ? 1.0f : 0.5f);
            r02.setAlpha(z4 ? 1.0f : 0.5f);
            if (textView2.getVisibility() == 0) {
                textView2.setAlpha(z4 ? 1.0f : 0.5f);
                return;
            }
            return;
        }
        float[] fArr = {z4 ? 1.0f : 0.5f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(r02, (Property<Switch, Float>) property, z4 ? 1.0f : 0.5f));
        if (textView2.getVisibility() == 0) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, z4 ? 1.0f : 0.5f));
        }
    }

    public final void f(CharSequence charSequence, boolean z4, boolean z10) {
        org.telegram.ui.k5.a(charSequence, this);
        TextView textView = this.c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.e;
        r12.setVisibility(0);
        r12.c(z4, this.F);
        this.f = z10;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void g(String str, String str2, boolean z4, boolean z10, boolean z11) {
        org.telegram.ui.k5.a(str, this);
        TextView textView = this.c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.e;
        r42.setVisibility(0);
        r42.c(z4, false);
        this.f = z11;
        textView2.setVisibility(0);
        this.h = z10;
        if (z10) {
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
        setWillNotDraw(!z11);
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.s, this.v);
        }
        if (this.f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.C;
            Paint G2 = f6Var != null ? f6Var.G("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (G2 != null) {
                if (this.D != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : this.B, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? this.B : 0), getMeasuredHeight() - 1, G2);
                } else {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, G2);
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append('\n');
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
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

    public void setAnimatingToThumbInsteadOfTouch(boolean z4) {
        this.a = z4;
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
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, G, 1.0f, 0.0f).setDuration(240L);
        this.x = duration;
        duration.addListener(new p8(this, i10, 1));
        this.x.setInterpolator(mr.g);
        this.x.start();
    }

    public void setCheckBoxIcon(int i10) {
        this.e.setIcon(i10);
    }

    public void setChecked(boolean z4) {
        this.e.c(z4, true);
    }

    public void setDivider(boolean z4) {
        this.f = z4;
        setWillNotDraw(!z4);
    }

    public void setDrawCheckRipple(boolean z4) {
        this.y = z4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.e.setEnabled(z4);
    }

    public void setHeight(int i10) {
        this.n = i10;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.y) {
            this.e.setDrawRipple(z4);
        }
        super.setPressed(z4);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    public r8(Context context, int i10) {
        this(i10, context, null, false);
    }

    public r8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(21, context, f6Var, false);
    }

    public r8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.n = 50;
        this.C = f6Var;
        this.B = i10;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.l(z4 ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = LocaleController.isRTL;
        addView(textView, k7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 70.0f : i10, 0.0f, z10 ? i10 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.b.l(z4 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, k7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i10, 35.0f, z11 ? i10 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, f6Var);
        this.e = r12;
        int i11 = org.telegram.ui.ActionBar.j6.M6;
        int i12 = org.telegram.ui.ActionBar.j6.N6;
        int i13 = org.telegram.ui.ActionBar.j6.d6;
        r12.d(i11, i12, i13, i13);
        addView(r12, k7.b6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.E = LocaleController.isRTL;
    }
}
