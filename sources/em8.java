// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class em8 extends ViewGroup {
    public final Paint E;
    public em8 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final og2 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final byte f;
    public final byte h;
    public tl8 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public em8(Context context) {
        super(context);
        this.f = (byte) 12;
        this.h = (byte) 8;
        this.s = aob.d6;
        this.w = aob.a7;
        this.E = new Paint();
        this.I = new Matrix();
        og2 og2Var = new og2(24, null, context);
        this.a = og2Var;
        og2Var.setDrawBackgroundAsArc(10);
        int i = aob.g7;
        og2Var.b(i, i, aob.k7);
        addView(og2Var);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, null);
        textView.setTypeface(hl.o());
        textView.setSingleLine();
        addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        textView2.setTypeface(hl.o());
        addView(textView2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i2 = aob.y6;
        yob.X(textView3, i2, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        yob.X(textView4, i2, null);
        textView4.setSingleLine();
        addView(textView4, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        yob.X(textView5, i2, null);
        textView5.setSingleLine();
        addView(textView5, tre.e(-2, -2, 8388613));
        setPadding(hl.L(4.0f), hl.L(8.0f), hl.L(4.0f), hl.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r14.g == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(tl8 tl8Var, boolean z) {
        boolean z2;
        String e;
        this.n = tl8Var;
        this.N = z;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = tl8Var.a;
        int i = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i == 1) {
            textView.setText(ob6.M0(2131746653, null));
        } else if (i == 6) {
            textView.setText(ob6.M0(2131746652, null));
        } else if (i != 12) {
            textView.setText((i <= 12 || i % 12 != 0) ? ob6.G(i, "Months", new Object[0]) : ob6.G(i / 12, "PremiumTierAnnualYears", new Object[0]));
        } else {
            textView.setText(ob6.M0(2131746657, null));
        }
        if (!f11.b()) {
            if (di0.h().j()) {
                tl8Var.a();
            }
            z2 = true;
            this.M = z2;
            TextView textView2 = this.c;
            TextView textView3 = this.r;
            TextView textView4 = this.d;
            TextView textView5 = this.e;
            if (z2) {
                if (tl8Var.c() <= 0) {
                    textView3.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView3.setText(ob6.a0(null, null, 2131749453, Integer.valueOf(tl8Var.c())));
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                    textView5.setVisibility(0);
                }
                if (f11.b() || tL_premiumSubscriptionOption.store_product == null) {
                    e = di0.h().e(tl8Var.e, tl8Var.b());
                } else if (tl8Var.f == null) {
                    e = "";
                } else {
                    di0.h();
                    e = di0.f(tl8Var.b(), 6, tl8Var.e, false);
                }
                textView4.setText(e);
                textView5.setText(ob6.a0(null, null, 2131746601, tl8Var.f()));
                textView2.setText(ob6.a0(null, null, 2131746602, tl8Var.e()));
                if (tL_premiumSubscriptionOption.current) {
                    textView5.setVisibility(0);
                    textView5.setText(ob6.M0(2131742455, null));
                }
            } else {
                textView3.setText(ob6.a0(null, null, 2131749453, 10));
                textView3.setVisibility(0);
                textView4.setVisibility(0);
                textView5.setVisibility(0);
                textView4.setText("USD00.00");
                textView5.setText(ob6.a0(null, null, 2131746601, 1000));
                textView2.setText(ob6.a0(null, null, 2131746602, 100));
            }
            requestLayout();
        }
        z2 = false;
        this.M = z2;
        TextView textView22 = this.c;
        TextView textView32 = this.r;
        TextView textView42 = this.d;
        TextView textView52 = this.e;
        if (z2) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = hl.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (ob6.a0) {
            int i = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void d() {
        em8 em8Var = this.F;
        if (em8Var != null) {
            em8Var.d();
            return;
        }
        int w0 = aob.w0(null, this.s, false);
        int w02 = aob.w0(null, this.w, false);
        if (this.H == w02 && this.G == w0) {
            return;
        }
        this.G = w0;
        this.H = w02;
        int L = hl.L(200.0f);
        this.x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w0, w0, w02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.y = linearGradient;
        this.E.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            super.dispatchDraw(canvas);
            return;
        }
        em8 em8Var = this.F;
        Paint paint = em8Var != null ? em8Var.E : this.E;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = hl.P;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), hl.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - hl.L(4.0f));
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), hl.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - hl.L(3.0f));
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), hl.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - hl.L(4.0f));
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
        invalidate();
    }

    public final void e() {
        em8 em8Var = this.F;
        if (em8Var != null) {
            em8Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.J - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.J = elapsedRealtime;
        int i = (int) (((abs * measuredWidth) / 400.0f) + this.K);
        this.K = i;
        if (i >= (measuredWidth << 2)) {
            i = (-this.x) << 1;
            this.K = i;
        }
        float f = i + this.L;
        Matrix matrix = this.I;
        matrix.setTranslate(f, 0.0f);
        LinearGradient linearGradient = this.y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public tl8 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z = ob6.a0;
            TextView textView = this.b;
            if (z) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, aob.j0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, aob.j0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = hl.Q;
        byte b = this.h;
        int paddingLeft = getPaddingLeft() + hl.L(b);
        int measuredHeight = getMeasuredHeight();
        og2 og2Var = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - og2Var.getMeasuredHeight()) / 2.0f), 0, 0);
        b(og2Var);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i5 = b + this.f;
        int measuredWidth = og2Var.getMeasuredWidth() + hl.L(i5 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + hl.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - hl.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f = i5;
        int paddingLeft3 = getPaddingLeft() + og2Var.getMeasuredWidth() + hl.L(f);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + og2Var.getMeasuredWidth() + hl.L(i5 + 6), hl.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + og2Var.getMeasuredWidth() + hl.L(f), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + og2Var.getMeasuredWidth() + hl.L(f) + (textView2.getVisibility() == 0 ? hl.L(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30);
        og2 og2Var = this.a;
        og2Var.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - og2Var.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - og2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - og2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        } else {
            textView2.measure(TLObject.FLAG_30, TLObject.FLAG_30);
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - og2Var.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int f = ik8.f(6.0f, (size - og2Var.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(f, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= hl.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(nu4 nu4Var) {
        this.a.setCirclePaintProvider(nu4Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setAlpha(z ? 1.0f : 0.6f);
        this.c.setAlpha(z ? 1.0f : 0.6f);
        this.a.setAlpha(z ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(em8 em8Var) {
        this.F = em8Var;
    }

    public void setParentXOffset(float f) {
        this.L = f;
    }

    public void setProgressDelegate(pg2 pg2Var) {
        this.a.setProgressDelegate(pg2Var);
    }
}
