// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oi3 extends FrameLayout {
    public final /* synthetic */ byte a = 3;
    public Object b;
    public boolean c;
    public final Object d;

    public oi3(Context context) {
        super(context);
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.e(-2, -2, 17));
        be0 be0Var = new be0(context);
        this.b = be0Var;
        j.addView(be0Var, nme.r(kk7.N1, kk7.N1, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131748630, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        j.addView(textView, nme.t(-2, -2, 1, 0, 8, 0, 0));
        u41 u41Var = new u41(null, context, true);
        this.d = u41Var;
        u41Var.i(k96.M0(2131748629, null), false, true);
        j.addView(u41Var, nme.t((int) ((u41Var.d.e() + gl.L(24.0f)) / gl.p), 38, 1, 0, 18, 0, 0));
        u41Var.setOnClickListener(new x00((byte) 1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                Paint paint = (Paint) this.b;
                if (this.c) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(gl.L(1.33f));
                    paint.setColor(((cj3) obj).getThemedColor(bkb.Ei));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                if (this.c) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(gl.L(1.33f));
                    paint2.setColor(((ah6) obj).getThemedColor(bkb.Ei));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 5:
                lw9 lw9Var = (lw9) obj;
                if (!this.c && lw9Var.r > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint3 = new Paint();
                        this.b = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, gl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), kk7.d4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (lw9Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, gl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                boolean z = this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j);
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                float f = limitPreviewView.a;
                boolean z2 = false;
                boolean z3 = f != 0.0f && f <= 1.0f && z;
                if (f == 1.0f && !z) {
                    z2 = true;
                }
                if ((!z3 && !z2) || !limitPreviewView.e()) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.b, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((lo0) ((sg0) limitPreviewView.f0).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                int L = gl.L(13.0f);
                gf8 gf8Var = (gf8) this.d;
                Drawable drawable = gf8Var.n1;
                int i = (gf8Var.y1 - gf8Var.t0) - L;
                if (gf8Var.B0 == 1) {
                    i = (int) (gf8Var.l1.getTranslationY() + i);
                }
                int L2 = gl.L(20.0f) + i;
                int L3 = gl.L(15.0f) + getMeasuredHeight();
                int i2 = gf8Var.t0;
                int i3 = L3 + i2;
                if (i2 + i < a.getCurrentActionBarHeight()) {
                    float L4 = gl.L(4.0f) + L;
                    float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - i) - gf8Var.t0) / L4);
                    int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * min);
                    i -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i3 += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                int i4 = gl.m;
                int i5 = L2 + i4;
                drawable.setBounds(0, i + i4, getMeasuredWidth(), i3);
                drawable.draw(canvas);
                if (f != 1.0f) {
                    bkb.s0.setColor(bkb.w0(null, bkb.g5, false));
                    rectF.set(gf8Var.u0, gf8Var.t0 + r4, getMeasuredWidth() - gf8Var.u0, gl.L(24.0f) + gf8Var.t0 + r4);
                    canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
                }
                if (f != 0.0f) {
                    int L5 = gl.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, gl.L(4.0f) + i5);
                    int w0 = bkb.w0(null, bkb.yj, false);
                    int alpha = Color.alpha(w0);
                    bkb.s0.setColor(w0);
                    bkb.s0.setAlpha((int) (alpha * 1.0f * f));
                    canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
                }
                int w02 = bkb.w0(null, bkb.g5, false);
                bkb.s0.setColor(Color.argb((int) (gf8Var.p1.getAlpha() * 255.0f), Color.red(w02), Color.green(w02), Color.blue(w02)));
                canvas.drawRect(gf8Var.u0, 0.0f, getMeasuredWidth() - gf8Var.u0, gl.m, bkb.s0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                gf8 gf8Var = (gf8) this.d;
                if (motionEvent.getAction() == 0 && gf8Var.y1 != 0) {
                    if (motionEvent.getY() < gl.L(12.0f) + gf8Var.y1 && gf8Var.p1.getAlpha() == 0.0f) {
                        gf8Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                ((gf8) this.d).G0();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int M;
        switch (this.a) {
            case 4:
                int size = View.MeasureSpec.getSize(i2);
                gf8 gf8Var = (gf8) this.d;
                fm fmVar = gf8Var.x1;
                cf8 cf8Var = gf8Var.m1;
                af8 af8Var = gf8Var.l1;
                if (!gf8Var.W) {
                    this.c = true;
                    int i3 = gf8Var.u0;
                    setPadding(i3, gl.m, i3, 0);
                    this.c = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) af8Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) gf8Var.o1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                int L = gl.L(15.0f) + gf8Var.t0 + gl.m;
                int R = cf8Var.R();
                for (int i4 = 0; i4 < R; i4++) {
                    if (i4 == 0) {
                        fmVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - (gf8Var.u0 << 1)), TLObject.FLAG_30), i2);
                        M = fmVar.getMeasuredHeight();
                    } else {
                        M = ((cf8Var.M(i4) - 1) * gl.L(50.0f)) + gl.L(32.0f);
                    }
                    L = M + L;
                }
                int L2 = gl.L(8.0f) + (L < paddingTop ? paddingTop - L : paddingTop - ((paddingTop / 5) * 3));
                if (af8Var.getPaddingTop() != L2) {
                    this.c = true;
                    af8Var.setPinnedSectionOffsetY(-L2);
                    af8Var.setPadding(0, L2, 0, gl.n);
                    this.c = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                return !((gf8) this.d).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 4:
                if (!this.c) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                super.setVisibility(i);
                if (i == 0 && !this.c) {
                    ((be0) this.b).setImageDrawable(new oy8(R.raw.utyan_empty2, gl.L(130.0f), gl.L(130.0f)));
                    this.c = true;
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(gf8 gf8Var, Context context) {
        super(context);
        this.d = gf8Var;
        this.c = false;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(ah6 ah6Var, Activity activity, boolean z) {
        super(activity);
        this.d = ah6Var;
        this.c = z;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(LimitPreviewView limitPreviewView, Context context, boolean z) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.b = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(lw9 lw9Var, Context context, boolean z) {
        super(context);
        this.d = lw9Var;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(cj3 cj3Var, Activity activity, boolean z) {
        super(activity);
        this.d = cj3Var;
        this.c = z;
        this.b = new Paint(1);
    }
}
