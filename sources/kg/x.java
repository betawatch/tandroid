package kg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.m5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.a21;
import org.telegram.ui.ay;
import org.telegram.ui.pf0;
import org.telegram.ui.t5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ int a = 5;
    public boolean b;
    public Object c;
    public final Object d;

    public x(Context context) {
        super(context);
        LinearLayout f7 = m5.f(context, 1);
        addView(f7, b6.e(-2, -2, 17));
        g9 g9Var = new g9(context);
        this.c = g9Var;
        f7.addView(g9Var, b6.r(zs.O1, zs.O1, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131748832, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(textView, b6.t(-2, -2, 1, 0, 8, 0, 0));
        vh.d dVar = new vh.d(context, null, true);
        this.d = dVar;
        dVar.i(cd.L0(2131748831, null), false, true);
        f7.addView(dVar, b6.t((int) ((dVar.d.e() + org.telegram.messenger.i0.L(24.0f)) / org.telegram.messenger.i0.p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bh.c(26));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.c;
                if (this.b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
                    paint.setColor(((ay) obj).getThemedColor(t6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
                    paint2.setColor(((pf0) obj).getThemedColor(t6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                a21 a21Var = (a21) obj;
                if (!this.b && a21Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zs.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (a21Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(18.0f), getMeasuredHeight(), (Paint) this.c);
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                float f7 = limitPreviewView.a;
                boolean z11 = false;
                boolean z12 = f7 != 0.0f && f7 <= 1.0f && z10;
                if (f7 == 1.0f && !z10) {
                    z11 = true;
                }
                if ((!z12 && !z11) || limitPreviewView.e0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((t5) ((org.telegram.ui.y0) limitPreviewView.e0).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.c;
                int L = org.telegram.messenger.i0.L(13.0f);
                tf0 tf0Var = (tf0) this.d;
                Drawable drawable = tf0Var.k1;
                int i10 = (tf0Var.v1 - tf0Var.s0) - L;
                if (tf0Var.A0 == 1) {
                    i10 = (int) (tf0Var.i1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.i0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
                int i11 = tf0Var.s0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.i0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - i10) - tf0Var.s0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i13 = org.telegram.messenger.i0.m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    t6.t0.setColor(t6.x0(null, t6.h5, false));
                    rectF.set(tf0Var.t0, tf0Var.s0 + r4, getMeasuredWidth() - tf0Var.t0, org.telegram.messenger.i0.L(24.0f) + tf0Var.s0 + r4);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, t6.t0);
                }
                if (f7 != 0.0f) {
                    int L5 = org.telegram.messenger.i0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.i0.L(4.0f) + i14);
                    int x02 = t6.x0(null, t6.wj, false);
                    int alpha = Color.alpha(x02);
                    t6.t0.setColor(x02);
                    t6.t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), t6.t0);
                }
                int x03 = t6.x0(null, t6.h5, false);
                t6.t0.setColor(Color.argb((int) (tf0Var.m1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(tf0Var.t0, 0.0f, getMeasuredWidth() - tf0Var.t0, org.telegram.messenger.i0.m, t6.t0);
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
                tf0 tf0Var = (tf0) this.d;
                if (motionEvent.getAction() == 0 && tf0Var.v1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.i0.L(12.0f) + tf0Var.v1 && tf0Var.m1.getAlpha() == 0.0f) {
                        tf0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                tf0.I0((tf0) this.d);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int M;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                tf0 tf0Var = (tf0) this.d;
                n5 n5Var = tf0Var.u1;
                org.telegram.ui.Components.pf0 pf0Var = tf0Var.j1;
                nf0 nf0Var = tf0Var.i1;
                if (!tf0Var.V) {
                    this.b = true;
                    int i12 = tf0Var.t0;
                    setPadding(i12, org.telegram.messenger.i0.m, i12, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) nf0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) tf0Var.l1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L = org.telegram.messenger.i0.L(15.0f) + tf0Var.s0 + org.telegram.messenger.i0.m;
                int R = pf0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        n5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (tf0Var.t0 * 2)), TLObject.FLAG_30), i11);
                        M = n5Var.getMeasuredHeight();
                    } else {
                        M = ((pf0Var.M(i13) - 1) * org.telegram.messenger.i0.L(50.0f)) + org.telegram.messenger.i0.L(32.0f);
                    }
                    L = M + L;
                }
                int L2 = org.telegram.messenger.i0.L(8.0f) + (L < paddingTop ? paddingTop - L : paddingTop - ((paddingTop / 5) * 3));
                if (nf0Var.getPaddingTop() != L2) {
                    this.b = true;
                    nf0Var.setPinnedSectionOffsetY(-L2);
                    nf0Var.setPadding(0, L2, 0, org.telegram.messenger.i0.n);
                    this.b = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((tf0) this.d).I && super.onTouchEvent(motionEvent);
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
    public void setVisibility(int i10) {
        switch (this.a) {
            case 5:
                super.setVisibility(i10);
                if (i10 == 0 && !this.b) {
                    ((g9) this.c).setImageDrawable(new bi0(R.raw.utyan_empty2, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
                    this.b = true;
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pf0 pf0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = pf0Var;
        this.b = z10;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(tf0 tf0Var, Context context) {
        super(context);
        this.d = tf0Var;
        this.b = false;
        this.c = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a21 a21Var, Context context, boolean z10) {
        super(context);
        this.d = a21Var;
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ay ayVar, Activity activity, boolean z10) {
        super(activity);
        this.d = ayVar;
        this.b = z10;
        this.c = new Paint(1);
    }
}
