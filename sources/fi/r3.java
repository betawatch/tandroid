package fi;

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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.i01;
import org.telegram.ui.je0;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r3 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;
    public final Object d;

    public r3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.c = l9Var;
        f10.addView(l9Var, c8.ha.r(qs.O1, qs.O1, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(id.M0(2131748823, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(id.M0(2131748822, null), false, true);
        f10.addView(dVar, c8.ha.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bi.l1(2));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.c;
                if (this.b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((ww) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((je0) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                i01 i01Var = (i01) obj;
                if (!this.b && i01Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qs.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (i01Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.c);
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 5:
                boolean z9 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j3);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                float f10 = limitPreviewView.a;
                boolean z10 = false;
                boolean z11 = f10 != 0.0f && f10 <= 1.0f && z9;
                if (f10 == 1.0f && !z9) {
                    z10 = true;
                }
                if ((!z11 && !z10) || limitPreviewView.e0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) limitPreviewView.e0).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.c;
                int L = org.telegram.messenger.g0.L(13.0f);
                qe0 qe0Var = (qe0) this.d;
                Drawable drawable = qe0Var.k1;
                int i7 = (qe0Var.v1 - qe0Var.s0) - L;
                if (qe0Var.A0 == 1) {
                    i7 = (int) (qe0Var.i1.getTranslationY() + i7);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i7;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i10 = qe0Var.s0;
                int i11 = L3 + i10;
                if (i10 + i7 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i7) - qe0Var.s0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i7 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i11 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i12 = org.telegram.messenger.g0.m;
                int i13 = L2 + i12;
                drawable.setBounds(0, i7 + i12, getMeasuredWidth(), i11);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    rectF.set(qe0Var.t0, qe0Var.s0 + r4, getMeasuredWidth() - qe0Var.t0, org.telegram.messenger.g0.L(24.0f) + qe0Var.s0 + r4);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i13);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.k6.t0.setColor(x02);
                    org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
                }
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                org.telegram.ui.ActionBar.k6.t0.setColor(Color.argb((int) (qe0Var.m1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(qe0Var.t0, 0.0f, getMeasuredWidth() - qe0Var.t0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.k6.t0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                qe0 qe0Var = (qe0) this.d;
                if (motionEvent.getAction() == 0 && qe0Var.v1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + qe0Var.v1 && qe0Var.m1.getAlpha() == 0.0f) {
                        qe0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                qe0.I0((qe0) this.d);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int M;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                qe0 qe0Var = (qe0) this.d;
                org.telegram.ui.Components.q5 q5Var = qe0Var.u1;
                me0 me0Var = qe0Var.j1;
                ke0 ke0Var = qe0Var.i1;
                if (!qe0Var.V) {
                    this.b = true;
                    int i11 = qe0Var.t0;
                    setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ke0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) qe0Var.l1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + qe0Var.s0 + org.telegram.messenger.g0.m;
                int R = me0Var.R();
                for (int i12 = 0; i12 < R; i12++) {
                    if (i12 == 0) {
                        q5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (qe0Var.t0 * 2)), TLObject.FLAG_30), i10);
                        M = q5Var.getMeasuredHeight();
                    } else {
                        M = ((me0Var.M(i12) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + (L < paddingTop ? paddingTop - L : paddingTop - ((paddingTop / 5) * 3));
                if (ke0Var.getPaddingTop() != L2) {
                    this.b = true;
                    ke0Var.setPinnedSectionOffsetY(-L2);
                    ke0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.n);
                    this.b = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((qe0) this.d).I && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 1:
                if (!this.b) {
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
    public void setVisibility(int i7) {
        switch (this.a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.b) {
                    ((org.telegram.ui.Components.l9) this.c).setImageDrawable(new zg0(R.raw.utyan_empty2, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.b = true;
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(qe0 qe0Var, Context context) {
        super(context);
        this.d = qe0Var;
        this.b = false;
        this.c = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(je0 je0Var, Activity activity, boolean z9) {
        super(activity);
        this.d = je0Var;
        this.b = z9;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(LimitPreviewView limitPreviewView, Context context, boolean z9) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(i01 i01Var, Context context, boolean z9) {
        super(context);
        this.d = i01Var;
        this.b = z9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(ww wwVar, Activity activity, boolean z9) {
        super(activity);
        this.d = wwVar;
        this.b = z9;
        this.c = new Paint(1);
    }
}
