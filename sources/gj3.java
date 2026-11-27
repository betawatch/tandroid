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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gj3 extends FrameLayout {
    public final /* synthetic */ byte a = 2;
    public Object b;
    public boolean c;
    public final Object d;

    public gj3(Context context) {
        super(context);
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.e(-2, -2, 17));
        de0 de0Var = new de0(context);
        this.b = de0Var;
        j.addView(de0Var, tre.r(jn7.N1, jn7.N1, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131748576, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        j.addView(textView, tre.t(-2, -2, 1, 0, 8, 0, 0));
        c51 c51Var = new c51(null, context, true);
        this.d = c51Var;
        c51Var.i(ob6.M0(2131748575, null), false, true);
        j.addView(c51Var, tre.t((int) ((c51Var.d.e() + hl.L(24.0f)) / hl.p), 38, 1, 0, 18, 0, 0));
        c51Var.setOnClickListener(new y00((byte) 1));
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
                    paint.setStrokeWidth(hl.L(1.33f));
                    paint.setColor(((uj3) obj).getThemedColor(aob.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, hl.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                if (this.c) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(hl.L(1.33f));
                    paint2.setColor(((fj6) obj).getThemedColor(aob.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, hl.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 5:
                e0a e0aVar = (e0a) obj;
                if (!this.c && e0aVar.r > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint3 = new Paint();
                        this.b = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, hl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (e0aVar.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, hl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
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
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((lo0) ((tg0) limitPreviewView.f0).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
                int L = hl.L(13.0f);
                ui8 ui8Var = (ui8) this.d;
                Drawable drawable = ui8Var.n1;
                int i = (ui8Var.y1 - ui8Var.t0) - L;
                if (ui8Var.B0 == 1) {
                    i = (int) (ui8Var.l1.getTranslationY() + i);
                }
                int L2 = hl.L(20.0f) + i;
                int L3 = hl.L(15.0f) + getMeasuredHeight();
                int i2 = ui8Var.t0;
                int i3 = L3 + i2;
                if (i2 + i < a.getCurrentActionBarHeight()) {
                    float L4 = hl.L(4.0f) + L;
                    float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - i) - ui8Var.t0) / L4);
                    int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * min);
                    i -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i3 += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                int i4 = hl.m;
                int i5 = L2 + i4;
                drawable.setBounds(0, i + i4, getMeasuredWidth(), i3);
                drawable.draw(canvas);
                if (f != 1.0f) {
                    aob.s0.setColor(aob.w0(null, aob.h5, false));
                    rectF.set(ui8Var.u0, ui8Var.t0 + r4, getMeasuredWidth() - ui8Var.u0, hl.L(24.0f) + ui8Var.t0 + r4);
                    canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
                }
                if (f != 0.0f) {
                    int L5 = hl.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, hl.L(4.0f) + i5);
                    int w0 = aob.w0(null, aob.zj, false);
                    int alpha = Color.alpha(w0);
                    aob.s0.setColor(w0);
                    aob.s0.setAlpha((int) (alpha * 1.0f * f));
                    canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
                }
                int w02 = aob.w0(null, aob.h5, false);
                aob.s0.setColor(Color.argb((int) (ui8Var.p1.getAlpha() * 255.0f), Color.red(w02), Color.green(w02), Color.blue(w02)));
                canvas.drawRect(ui8Var.u0, 0.0f, getMeasuredWidth() - ui8Var.u0, hl.m, aob.s0);
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
                ui8 ui8Var = (ui8) this.d;
                if (motionEvent.getAction() == 0 && ui8Var.y1 != 0) {
                    if (motionEvent.getY() < hl.L(12.0f) + ui8Var.y1 && ui8Var.p1.getAlpha() == 0.0f) {
                        ui8Var.dismiss();
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
                ((ui8) this.d).H0();
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
                ui8 ui8Var = (ui8) this.d;
                gm gmVar = ui8Var.x1;
                qi8 qi8Var = ui8Var.m1;
                oi8 oi8Var = ui8Var.l1;
                if (!ui8Var.W) {
                    this.c = true;
                    int i3 = ui8Var.u0;
                    setPadding(i3, hl.m, i3, 0);
                    this.c = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) oi8Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ui8Var.o1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                int L = hl.L(15.0f) + ui8Var.t0 + hl.m;
                int R = qi8Var.R();
                for (int i4 = 0; i4 < R; i4++) {
                    if (i4 == 0) {
                        gmVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - (ui8Var.u0 << 1)), TLObject.FLAG_30), i2);
                        M = gmVar.getMeasuredHeight();
                    } else {
                        M = ((qi8Var.M(i4) - 1) * hl.L(50.0f)) + hl.L(32.0f);
                    }
                    L = M + L;
                }
                int L2 = hl.L(8.0f) + (L < paddingTop ? paddingTop - L : paddingTop - ((paddingTop / 5) * 3));
                if (oi8Var.getPaddingTop() != L2) {
                    this.c = true;
                    oi8Var.setPinnedSectionOffsetY(-L2);
                    oi8Var.setPadding(0, L2, 0, hl.n);
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
                return !((ui8) this.d).J && super.onTouchEvent(motionEvent);
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
                    ((de0) this.b).setImageDrawable(new b29(R.raw.utyan_empty2, hl.L(130.0f), hl.L(130.0f)));
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
    public gj3(ui8 ui8Var, Context context) {
        super(context);
        this.d = ui8Var;
        this.c = false;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(fj6 fj6Var, Activity activity, boolean z) {
        super(activity);
        this.d = fj6Var;
        this.c = z;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(LimitPreviewView limitPreviewView, Context context, boolean z) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.b = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(e0a e0aVar, Context context, boolean z) {
        super(context);
        this.d = e0aVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(uj3 uj3Var, Activity activity, boolean z) {
        super(activity);
        this.d = uj3Var;
        this.c = z;
        this.b = new Paint(1);
    }
}
