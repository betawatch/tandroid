// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class bjb extends FrameLayout {
    public static final pn K = new pn("animationProgress", 16);
    public boolean E;
    public int F;
    public final ylb G;
    public s09 H;
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

    public bjb(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        this.n = 50;
        this.G = ylbVar;
        this.F = i;
        TextView textView = new TextView(context);
        this.c = textView;
        anb.X(textView, z ? cmb.i5 : cmb.F6, ylbVar);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z2 = jb6.a0;
        addView(textView, qoe.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 70.0f : i, 0.0f, z2 ? i : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        anb.X(textView2, z ? cmb.I5 : cmb.y6, ylbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z3 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 70.0f : i, 35.0f, z3 ? i : 70.0f, 0.0f));
        Switch r1 = new Switch(context, ylbVar);
        this.e = r1;
        int i2 = cmb.L6;
        int i3 = cmb.M6;
        int i4 = cmb.c6;
        r1.d(i2, i3, i4, i4);
        addView(r1, qoe.d(37, 20.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.I = jb6.a0;
    }

    private float getLastTouchX() {
        if (this.a) {
            return jb6.a0 ? gm.L(22.0f) : getMeasuredWidth() - gm.L(42.0f);
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        this.s = f;
        float lastTouchX = getLastTouchX();
        float max = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + gm.L(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f2 = max * this.s;
        Switch r3 = this.e;
        r3.R = lastTouchX;
        r3.S = measuredHeight;
        r3.T = f2;
        r3.invalidate();
    }

    public final void b(int i, boolean z) {
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.y = null;
        }
        int i2 = this.r;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        if (this.w == null) {
            this.w = new Paint(1);
        }
        this.e.setOverrideColor(z ? 1 : 2);
        this.r = i;
        this.w.setColor(i);
        this.s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, K, 0.0f, 1.0f);
        this.y = ofFloat;
        ofFloat.addListener(new zib(this, i, (byte) 0));
        this.y.setInterpolator(d53.g);
        this.y.setDuration(240L).start();
    }

    public final void c(int i, int i2) {
        if (this.H == null) {
            s09 s09Var = new s09(getContext());
            this.H = s09Var;
            s09Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.H, qoe.d(29, 29.0f, (jb6.a0 ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.F = gm.L(65.0f);
            TextView textView = this.c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = jb6.a0 ? 70 : this.F;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = jb6.a0 ? this.F : 70;
        }
        this.H.setVisibility(0);
        this.H.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        this.H.setImageResource(i2);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.H.setBackground(cmb.b0(gm.L(9.0f), i));
    }

    public final void d(int i, int i2, int i3, int i4, int i5) {
        ylb ylbVar = this.G;
        TextView textView = this.c;
        anb.X(textView, i, ylbVar);
        this.e.d(i2, i3, i4, i5);
        textView.setTag(Integer.valueOf(i));
    }

    public final void e(ArrayList arrayList, boolean z) {
        super.setEnabled(z);
        Switch r0 = this.e;
        TextView textView = this.d;
        TextView textView2 = this.c;
        if (arrayList == null) {
            textView2.setAlpha(z ? 1.0f : 0.5f);
            r0.setAlpha(z ? 1.0f : 0.5f);
            if (textView.getVisibility() == 0) {
                textView.setAlpha(z ? 1.0f : 0.5f);
                return;
            }
            return;
        }
        float[] fArr = {z ? 1.0f : 0.5f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(r0, (Property<Switch, Float>) property, z ? 1.0f : 0.5f));
        if (textView.getVisibility() == 0) {
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z ? 1.0f : 0.5f));
        }
    }

    public final void f(CharSequence charSequence, boolean z, boolean z2) {
        ed0.a(charSequence, this);
        TextView textView = this.c;
        textView.setText(charSequence);
        this.h = false;
        Switch r1 = this.e;
        r1.setVisibility(0);
        r1.c(z, this.J);
        this.f = z2;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public final void g(String str, String str2, boolean z, boolean z2, boolean z3) {
        ed0.a(str, this);
        TextView textView = this.c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r4 = this.e;
        r4.setVisibility(0);
        r4.c(z, false);
        this.f = z3;
        textView2.setVisibility(0);
        this.h = z2;
        if (z2) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, gm.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = gm.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z3);
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
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + gm.L(40.0f)) * this.s, this.w);
        }
        if (this.f) {
            ylb ylbVar = this.G;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : cmb.j0;
            if (d != null) {
                s09 s09Var = this.H;
                boolean z = jb6.a0;
                if (s09Var != null) {
                    canvas.drawLine(z ? 0.0f : this.F, getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? this.F : 0), getMeasuredHeight() - 1, d);
                } else {
                    canvas.drawLine(z ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, d);
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
    public void onMeasure(int i, int i2) {
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.d.getVisibility() == 0 ? 64.0f : this.n) + (this.f ? 1 : 0), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.x = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z) {
        this.a = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.r != i) {
            clearAnimation();
            this.r = 0;
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i) {
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.y = null;
        }
        int i2 = this.r;
        if (i2 == 0) {
            i2 = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        Paint paint = this.w;
        if (paint == null) {
            paint = new Paint(1);
            this.w = paint;
        }
        paint.setColor(i2);
        setBackgroundColor(i);
        this.e.setOverrideColor(1);
        this.r = i;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, K, 1.0f, 0.0f).setDuration(240L);
        this.y = duration;
        duration.addListener(new zib(this, i, (byte) 1));
        this.y.setInterpolator(d53.g);
        this.y.start();
    }

    public void setCheckBoxIcon(int i) {
        this.e.setIcon(i);
    }

    public void setChecked(boolean z) {
        this.e.c(z, true);
    }

    public void setDivider(boolean z) {
        this.f = z;
        setWillNotDraw(!z);
    }

    public void setDrawCheckRipple(boolean z) {
        this.E = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e.setEnabled(z);
    }

    public void setHeight(int i) {
        this.n = i;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.E) {
            this.e.setDrawRipple(z);
        }
        super.setPressed(z);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    public bjb(Context context, int i) {
        this(i, null, context, false);
    }

    public bjb(Context context, ylb ylbVar) {
        this(21, ylbVar, context, false);
    }

    public bjb(Context context) {
        this(context, 21);
    }
}
