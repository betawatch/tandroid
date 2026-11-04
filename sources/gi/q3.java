package gi;

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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.se0;
import org.telegram.ui.ee0;
import org.telegram.ui.uw;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        addView(f10, mf.e(-2, -2, 17));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        f10.addView(k9Var, mf.r(hs.O1, hs.O1, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131748830, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, mf.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(bd.M0(2131748829, null), false, true);
        f10.addView(dVar, mf.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ai.t(6));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i3 = this.a;
        Object obj = this.d;
        switch (i3) {
            case 2:
                Paint paint = (Paint) this.c;
                if (this.b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((uw) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((ee0) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                yz0 yz0Var = (yz0) obj;
                if (!this.b && yz0Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), hs.e4, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (yz0Var.r * 255.0f));
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 5:
                boolean z10 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
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
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.x0) limitPreviewView.f0).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.c;
                int L = org.telegram.messenger.g0.L(13.0f);
                se0 se0Var = (se0) this.d;
                Drawable drawable = se0Var.l1;
                int i3 = (se0Var.w1 - se0Var.t0) - L;
                if (se0Var.B0 == 1) {
                    i3 = (int) (se0Var.j1.getTranslationY() + i3);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i3;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i10 = se0Var.t0;
                int i11 = L3 + i10;
                if (i10 + i3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i3) - se0Var.t0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i3 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i11 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i12 = org.telegram.messenger.g0.m;
                int i13 = L2 + i12;
                drawable.setBounds(0, i3 + i12, getMeasuredWidth(), i11);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    rectF.set(se0Var.u0, se0Var.t0 + r4, getMeasuredWidth() - se0Var.u0, org.telegram.messenger.g0.L(24.0f) + se0Var.t0 + r4);
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
                org.telegram.ui.ActionBar.k6.t0.setColor(Color.argb((int) (se0Var.n1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(se0Var.u0, 0.0f, getMeasuredWidth() - se0Var.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.k6.t0);
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
                se0 se0Var = (se0) this.d;
                if (motionEvent.getAction() == 0 && se0Var.w1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + se0Var.w1 && se0Var.n1.getAlpha() == 0.0f) {
                        se0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                se0.I0((se0) this.d);
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        int M;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                se0 se0Var = (se0) this.d;
                org.telegram.ui.Components.o5 o5Var = se0Var.v1;
                oe0 oe0Var = se0Var.k1;
                me0 me0Var = se0Var.j1;
                if (!se0Var.W) {
                    this.b = true;
                    int i11 = se0Var.u0;
                    setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) me0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) se0Var.m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + se0Var.t0 + org.telegram.messenger.g0.m;
                int R = oe0Var.R();
                for (int i12 = 0; i12 < R; i12++) {
                    if (i12 == 0) {
                        o5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3 - (se0Var.u0 * 2)), TLObject.FLAG_30), i10);
                        M = o5Var.getMeasuredHeight();
                    } else {
                        M = ((oe0Var.M(i12) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + (L < paddingTop ? paddingTop - L : paddingTop - ((paddingTop / 5) * 3));
                if (me0Var.getPaddingTop() != L2) {
                    this.b = true;
                    me0Var.setPinnedSectionOffsetY(-L2);
                    me0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.n);
                    this.b = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((se0) this.d).J && super.onTouchEvent(motionEvent);
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
    public void setVisibility(int i3) {
        switch (this.a) {
            case 0:
                super.setVisibility(i3);
                if (i3 == 0 && !this.b) {
                    ((org.telegram.ui.Components.k9) this.c).setImageDrawable(new ch0(R.raw.utyan_empty2, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.b = true;
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(se0 se0Var, Context context) {
        super(context);
        this.d = se0Var;
        this.b = false;
        this.c = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(ee0 ee0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ee0Var;
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
    public q3(yz0 yz0Var, Context context, boolean z10) {
        super(context);
        this.d = yz0Var;
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(uw uwVar, Activity activity, boolean z10) {
        super(activity);
        this.d = uwVar;
        this.b = z10;
        this.c = new Paint(1);
    }
}
