package cg;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ip;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class l2 extends ViewGroup {
    public l2 A;
    public int B;
    public int C;
    public final Matrix D;
    public long E;
    public int F;
    public float G;
    public boolean H;
    public boolean I;
    public final hp a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final int h;
    public gw0 n;
    public final TextView r;
    public final int s;
    public final int v;
    public int w;
    public LinearGradient x;
    public final Paint y;

    public l2(Context context) {
        super(context);
        this.f = 12;
        this.h = 8;
        this.s = g6.d6;
        this.v = g6.a7;
        this.y = new Paint();
        this.D = new Matrix();
        hp hpVar = new hp(context, 24, null);
        this.a = hpVar;
        hpVar.setDrawBackgroundAsArc(10);
        int i10 = g6.g7;
        hpVar.b(i10, i10, g6.k7);
        addView(hpVar);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        addView(textView, f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        addView(textView2, f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i11 = g6.y6;
        textView3.setTextColor(g6.w0(null, i11, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(g6.w0(null, i11, false));
        textView4.setSingleLine();
        addView(textView4, f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(g6.w0(null, i11, false));
        textView5.setSingleLine();
        addView(textView5, f6.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r11.g == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gw0 gw0Var, boolean z10) {
        boolean z11;
        this.n = gw0Var;
        this.I = z10;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = gw0Var.a;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = gw0Var.a;
        int i10 = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i10 == 1) {
            textView.setText(LocaleController.getString(R.string.PremiumTierMonthly));
        } else if (i10 == 6) {
            textView.setText(LocaleController.getString(R.string.PremiumTierSemiannual));
        } else if (i10 != 12) {
            textView.setText((i10 <= 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("PremiumTierAnnualYears", i10 / 12, new Object[0]));
        } else {
            textView.setText(LocaleController.getString(R.string.PremiumTierAnnual));
        }
        if (!BuildVars.useInvoiceBilling()) {
            if (BillingController.getInstance().isReady()) {
                gw0Var.a();
            }
            z11 = true;
            this.H = z11;
            TextView textView2 = this.c;
            TextView textView3 = this.d;
            TextView textView4 = this.r;
            TextView textView5 = this.e;
            if (z11) {
                if (gw0Var.c() <= 0) {
                    textView4.setVisibility(8);
                    textView3.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(gw0Var.c())));
                    textView4.setVisibility(0);
                    textView3.setVisibility(0);
                    textView5.setVisibility(0);
                }
                textView3.setText((BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption2.store_product == null) ? BillingController.getInstance().formatCurrency(gw0Var.e, gw0Var.b()) : gw0Var.f == null ? "" : BillingController.getInstance().formatCurrency(gw0Var.e, gw0Var.b(), 6));
                textView5.setText(LocaleController.formatString(R.string.PricePerYear, gw0Var.f()));
                textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, gw0Var.e()));
                if (tL_premiumSubscriptionOption2.current) {
                    textView5.setVisibility(0);
                    textView5.setText(LocaleController.getString(R.string.YourCurrentPlan));
                }
            } else {
                textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, 10));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
                textView3.setText("USD00.00");
                textView5.setText(LocaleController.formatString(R.string.PricePerYear, Integer.valueOf(MediaDataController.MAX_STYLE_RUNS_COUNT)));
                textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, 100));
            }
            requestLayout();
        }
        z11 = false;
        this.H = z11;
        TextView textView22 = this.c;
        TextView textView32 = this.d;
        TextView textView42 = this.r;
        TextView textView52 = this.e;
        if (z11) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (LocaleController.isRTL) {
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
        l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.d();
            return;
        }
        int w02 = g6.w0(null, this.s, false);
        int w03 = g6.w0(null, this.v, false);
        if (this.C == w03 && this.B == w02) {
            return;
        }
        this.B = w02;
        this.C = w03;
        int dp = AndroidUtilities.dp(200.0f);
        this.w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.x = linearGradient;
        this.y.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.H) {
            super.dispatchDraw(canvas);
            return;
        }
        l2 l2Var = this.A;
        Paint paint = l2Var != null ? l2Var.y : this.y;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = AndroidUtilities.rectTmp;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        invalidate();
    }

    public final void e() {
        l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.E - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.E = elapsedRealtime;
        int i10 = (int) (((abs * measuredWidth) / 400.0f) + this.F);
        this.F = i10;
        if (i10 >= measuredWidth * 4) {
            this.F = (-this.w) * 2;
        }
        float f9 = this.F + this.G;
        Matrix matrix = this.D;
        matrix.setTranslate(f9, 0.0f);
        LinearGradient linearGradient = this.x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public gw0 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.I) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, g6.k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, g6.k0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Rect rect = AndroidUtilities.rectTmp2;
        int i14 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i14);
        int measuredHeight = getMeasuredHeight();
        hp hpVar = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - hpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(hpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i15 = i14 + this.f;
        int measuredWidth = hpVar.getMeasuredWidth() + AndroidUtilities.dp(i15 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f9 = i15;
        int paddingLeft3 = getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(f9);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(i15 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(f9), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(f9) + (textView2.getVisibility() == 0 ? AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30);
        hp hpVar = this.a;
        hpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - hpVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - hpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - hpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - hpVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int d = org.telegram.ui.b.d(6.0f, (size - hpVar.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(d, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.a.setCirclePaintProvider(genericProvider);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setAlpha(z10 ? 1.0f : 0.6f);
        this.c.setAlpha(z10 ? 1.0f : 0.6f);
        this.a.setAlpha(z10 ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(l2 l2Var) {
        this.A = l2Var;
    }

    public void setParentXOffset(float f9) {
        this.G = f9;
    }

    public void setProgressDelegate(ip ipVar) {
        this.a.setProgressDelegate(ipVar);
    }
}
