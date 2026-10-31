package kg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.l9;
import org.telegram.messenger.v2;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fp;
import org.telegram.ui.fu0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class a2 extends ViewGroup {
    public final Paint D;
    public a2 E;
    public int F;
    public int G;
    public final Matrix H;
    public long I;
    public int J;
    public float K;
    public boolean L;
    public boolean M;
    public final ep a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final int h;
    public fu0 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public a2(Context context) {
        super(context);
        this.f = 12;
        this.h = 8;
        this.s = t6.d6;
        this.w = t6.a7;
        this.D = new Paint();
        this.H = new Matrix();
        ep epVar = new ep(24, context, null);
        this.a = epVar;
        epVar.setDrawBackgroundAsArc(10);
        int i10 = t6.g7;
        epVar.b(i10, i10, t6.k7);
        addView(epVar);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.G6, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setSingleLine();
        addView(textView, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        addView(textView2, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i11 = t6.y6;
        a7.V(textView3, i11, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        a7.V(textView4, i11, null);
        textView4.setSingleLine();
        addView(textView4, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        a7.V(textView5, i11, null);
        textView5.setSingleLine();
        addView(textView5, b6.e(-2, -2, 8388613));
        setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r17.g == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fu0 fu0Var, boolean z10) {
        boolean z11;
        String f7;
        this.n = fu0Var;
        this.M = z10;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = fu0Var.a;
        int i10 = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i10 == 1) {
            textView.setText(cd.L0(2131746939, null));
        } else if (i10 == 6) {
            textView.setText(cd.L0(2131746938, null));
        } else if (i10 != 12) {
            textView.setText((i10 <= 12 || i10 % 12 != 0) ? cd.G(i10, "Months", new Object[0]) : cd.G(i10 / 12, "PremiumTierAnnualYears", new Object[0]));
        } else {
            textView.setText(cd.L0(2131746943, null));
        }
        if (!v2.b()) {
            if (org.telegram.messenger.u1.i().k()) {
                fu0Var.a();
            }
            z11 = true;
            this.L = z11;
            TextView textView2 = this.c;
            TextView textView3 = this.d;
            TextView textView4 = this.r;
            TextView textView5 = this.e;
            if (z11) {
                if (fu0Var.c() <= 0) {
                    textView4.setVisibility(8);
                    textView3.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView4.setText(cd.a0(null, null, 2131749673, Integer.valueOf(fu0Var.c())));
                    textView4.setVisibility(0);
                    textView3.setVisibility(0);
                    textView5.setVisibility(0);
                }
                if (v2.b() || tL_premiumSubscriptionOption.store_product == null) {
                    f7 = org.telegram.messenger.u1.i().f(fu0Var.e, fu0Var.b());
                } else if (fu0Var.f == null) {
                    f7 = "";
                } else {
                    org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
                    long j10 = fu0Var.e;
                    String b10 = fu0Var.b();
                    i11.getClass();
                    f7 = org.telegram.messenger.u1.g(b10, 6, j10, false);
                }
                textView3.setText(f7);
                textView5.setText(cd.a0(null, null, 2131746887, fu0Var.f()));
                textView2.setText(cd.a0(null, null, 2131746888, fu0Var.e()));
                if (tL_premiumSubscriptionOption.current) {
                    textView5.setVisibility(0);
                    textView5.setText(cd.L0(2131742849, null));
                }
            } else {
                textView4.setText(cd.a0(null, null, 2131749673, 10));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
                textView3.setText("USD00.00");
                textView5.setText(cd.a0(null, null, 2131746887, 1000));
                textView2.setText(cd.a0(null, null, 2131746888, 100));
            }
            requestLayout();
        }
        z11 = false;
        this.L = z11;
        TextView textView22 = this.c;
        TextView textView32 = this.d;
        TextView textView42 = this.r;
        TextView textView52 = this.e;
        if (z11) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = org.telegram.messenger.i0.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (cd.X) {
            int i10 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i10;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.a.a(z10, z11);
    }

    public final void d() {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.d();
            return;
        }
        int x02 = t6.x0(null, this.s, false);
        int x03 = t6.x0(null, this.w, false);
        if (this.G == x03 && this.F == x02) {
            return;
        }
        this.F = x02;
        this.G = x03;
        int L = org.telegram.messenger.i0.L(200.0f);
        this.x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.y = linearGradient;
        this.D.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.L) {
            super.dispatchDraw(canvas);
            return;
        }
        a2 a2Var = this.E;
        Paint paint = a2Var != null ? a2Var.D : this.D;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = org.telegram.messenger.i0.P;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), org.telegram.messenger.i0.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - org.telegram.messenger.i0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), org.telegram.messenger.i0.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - org.telegram.messenger.i0.L(3.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), org.telegram.messenger.i0.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - org.telegram.messenger.i0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        invalidate();
    }

    public final void e() {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.I - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.I = elapsedRealtime;
        int i10 = (int) (((abs * measuredWidth) / 400.0f) + this.J);
        this.J = i10;
        if (i10 >= measuredWidth * 4) {
            this.J = (-this.x) * 2;
        }
        float f7 = this.J + this.K;
        Matrix matrix = this.H;
        matrix.setTranslate(f7, 0.0f);
        LinearGradient linearGradient = this.y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public fu0 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.M) {
            boolean z10 = cd.X;
            TextView textView = this.b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, t6.k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, t6.k0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Rect rect = org.telegram.messenger.i0.Q;
        int i14 = this.h;
        int paddingLeft = getPaddingLeft() + org.telegram.messenger.i0.L(i14);
        int measuredHeight = getMeasuredHeight();
        ep epVar = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - epVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(epVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i15 = i14 + this.f;
        int measuredWidth = epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(i15 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + org.telegram.messenger.i0.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f7 = i15;
        int paddingLeft3 = getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(f7);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(i15 + 6), org.telegram.messenger.i0.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(f7), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(f7) + (textView2.getVisibility() == 0 ? org.telegram.messenger.i0.L(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28.0f), TLObject.FLAG_30);
        ep epVar = this.a;
        epVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - epVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - epVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - epVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - epVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int c10 = z20.c(6.0f, (size - epVar.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= org.telegram.messenger.i0.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(l9 l9Var) {
        this.a.setCirclePaintProvider(l9Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setAlpha(z10 ? 1.0f : 0.6f);
        this.c.setAlpha(z10 ? 1.0f : 0.6f);
        this.a.setAlpha(z10 ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(a2 a2Var) {
        this.E = a2Var;
    }

    public void setParentXOffset(float f7) {
        this.K = f7;
    }

    public void setProgressDelegate(fp fpVar) {
        this.a.setProgressDelegate(fpVar);
    }
}
