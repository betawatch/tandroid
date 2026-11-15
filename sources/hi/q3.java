package hi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.f01;
import org.telegram.ui.je0;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q3 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;
    public final Object d;

    public q3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ja.e(-2, -2, 17));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.c = i9Var;
        f10.addView(i9Var, c8.ja.r(ns.O1, ns.O1, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131748822, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, c8.ja.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(hd.M0(2131748821, null), false, true);
        f10.addView(dVar, c8.ja.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bi.o(5));
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
                    paint.setColor(((yw) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((je0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                f01 f01Var = (f01) obj;
                if (!this.b && f01Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ns.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (f01Var.r * 255.0f));
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
                boolean z10 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j3);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                float f10 = limitPreviewView.a;
                boolean z11 = false;
                boolean z12 = f10 != 0.0f && f10 <= 1.0f && z10;
                if (f10 == 1.0f && !z10) {
                    z11 = true;
                }
                if ((!z12 && !z11) || limitPreviewView.f0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) limitPreviewView.f0).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
                te0 te0Var = (te0) this.d;
                Drawable drawable = te0Var.o1;
                int i7 = (te0Var.z1 - te0Var.t0) - L;
                if (te0Var.B0 == 1) {
                    i7 = (int) (te0Var.m1.getTranslationY() + i7);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i7;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i10 = te0Var.t0;
                int i11 = L3 + i10;
                if (i10 + i7 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i7) - te0Var.t0) / L4);
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
                    org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    rectF.set(te0Var.u0, te0Var.t0 + r4, getMeasuredWidth() - te0Var.u0, org.telegram.messenger.g0.L(24.0f) + te0Var.t0 + r4);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i13);
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.zj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.j6.t0.setColor(x02);
                    org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
                }
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
                org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) (te0Var.q1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(te0Var.u0, 0.0f, getMeasuredWidth() - te0Var.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.j6.t0);
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
                te0 te0Var = (te0) this.d;
                if (motionEvent.getAction() == 0 && te0Var.z1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + te0Var.z1 && te0Var.q1.getAlpha() == 0.0f) {
                        te0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                te0.I0((te0) this.d);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int M;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                te0 te0Var = (te0) this.d;
                org.telegram.ui.Components.o5 o5Var = te0Var.y1;
                pe0 pe0Var = te0Var.n1;
                ne0 ne0Var = te0Var.m1;
                if (!te0Var.W) {
                    this.b = true;
                    int i11 = te0Var.u0;
                    setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ne0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) te0Var.p1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + te0Var.t0 + org.telegram.messenger.g0.m;
                int R = pe0Var.R();
                for (int i12 = 0; i12 < R; i12++) {
                    if (i12 == 0) {
                        o5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (te0Var.u0 * 2)), TLObject.FLAG_30), i10);
                        M = o5Var.getMeasuredHeight();
                    } else {
                        M = ((pe0Var.M(i12) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + (L < paddingTop ? paddingTop - L : paddingTop - ((paddingTop / 5) * 3));
                if (ne0Var.getPaddingTop() != L2) {
                    this.b = true;
                    ne0Var.setPinnedSectionOffsetY(-L2);
                    ne0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.n);
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
                return !((te0) this.d).J && super.onTouchEvent(motionEvent);
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
                    ((org.telegram.ui.Components.i9) this.c).setImageDrawable(new ch0(R.raw.utyan_empty2, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
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
    public q3(te0 te0Var, Context context) {
        super(context);
        this.d = te0Var;
        this.b = false;
        this.c = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(je0 je0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = je0Var;
        this.b = z10;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(f01 f01Var, Context context, boolean z10) {
        super(context);
        this.d = f01Var;
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(yw ywVar, Activity activity, boolean z10) {
        super(activity);
        this.d = ywVar;
        this.b = z10;
        this.c = new Paint(1);
    }
}
