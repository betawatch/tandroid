// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j9 extends FrameLayout implements snb {
    public final c51 a;
    public final in b;
    public final in c;
    public final kv4 d;
    public final Paint e;
    public final by2 f;
    public final wm2 h;
    public final wm2[] n;

    public j9(Context context, kv4 kv4Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new by2(new m0(this, (byte) 3));
        this.h = new wm2(R.drawable.filled_gift_sell_24, 0);
        this.n = new wm2[1];
        this.d = kv4Var;
        setPadding(hl.L(14.0f), hl.L(9.0f), hl.L(14.0f), hl.L(9.0f));
        paint.setShadowLayer(hl.L(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(aob.w0(null, aob.d6, false));
        c51 c51Var = new c51(null, context, true);
        this.a = c51Var;
        hn hnVar = c51Var.d;
        hnVar.E = false;
        hnVar.F = true;
        hnVar.G = true;
        hnVar.H = true;
        hnVar.I = false;
        e29 e29Var = new e29(context);
        in inVar = new in(context, false, false, false);
        this.b = inVar;
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        yob.U(inVar, aob.G6, null);
        in inVar2 = new in(context, false, false, false);
        this.c = inVar2;
        inVar2.setTextSize(hl.L(12.0f));
        TLRPC.Document document = kv4Var.d.sticker;
        if (document != null) {
            e29Var.g(44, 44, document);
        }
        addView(inVar, tre.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(inVar2, tre.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(e29Var, tre.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(c51Var, tre.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j, boolean z) {
        String h0 = hl.h0((int) j, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) ob6.M0(2131750376, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h0);
        this.a.i(spannableStringBuilder, z, true);
    }

    public final void b(boolean z) {
        kv4 kv4Var = this.d;
        if (kv4Var.f != null) {
            this.b.c(ob6.a0(null, null, 2131750375, ob6.E(r1.current_round, ','), ob6.E(kv4Var.f.total_rounds, ',')), z, true);
        }
        String concat = "⭐️".concat(ob6.E(kv4Var.e.bid_amount, ','));
        int d = kv4Var.d();
        wm2[] wm2VarArr = this.n;
        in inVar = this.c;
        if (d == 2 || d == 3) {
            inVar.c(nza.b1(false, hl.S2(ob6.a0(null, null, 2131750377, concat)), 0.66f, wm2VarArr), z, true);
            yob.U(inVar, aob.q7, null);
        } else {
            inVar.c(nza.b1(false, hl.S2(ob6.a0(null, null, 2131750378, concat, Integer.valueOf(kv4Var.i))), 0.66f, wm2VarArr), z, true);
            yob.U(inVar, aob.G6, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(hl.L(14.0f), hl.L(9.0f), getMeasuredWidth() - hl.L(14.0f), getMeasuredHeight() - hl.L(9.0f), hl.L(8.0f), hl.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(146.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.e.setColor(aob.w0(null, aob.d6, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
