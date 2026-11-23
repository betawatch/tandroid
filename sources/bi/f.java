package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import di.pb;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.r9;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final hi.e a;
    public final org.telegram.ui.Components.o6 b;
    public final org.telegram.ui.Components.o6 c;
    public final r9 d;
    public final Paint e;
    public final bg.r f;
    public final nq h;
    public final nq[] n;

    public f(Context context, r9 r9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new bg.r(new a1.c(this, 12));
        this.h = new nq(R.drawable.filled_gift_sell_24, 0);
        this.n = new nq[1];
        this.d = r9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
        hi.e eVar = new hi.e(context, null, true);
        this.a = eVar;
        org.telegram.ui.Components.n6 n6Var = eVar.d;
        n6Var.E = false;
        n6Var.F = true;
        n6Var.G = true;
        n6Var.H = true;
        n6Var.I = false;
        rh0 rh0Var = new rh0(context);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.b = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.c = o6Var2;
        o6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = r9Var.d.sticker;
        if (document != null) {
            rh0Var.g(44, 44, document);
        }
        addView(o6Var, ma.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(o6Var2, ma.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(rh0Var, ma.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(eVar, ma.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z10) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) hd.N0(2131750398, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        r9 r9Var = this.d;
        if (r9Var.f != null) {
            this.b.c(hd.a0(null, null, 2131750397, hd.E(r1.current_round, ','), hd.E(r9Var.f.total_rounds, ',')), z10, true);
        }
        String l10 = i5.c.l(r9Var.e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = r9Var.d();
        nq[] nqVarArr = this.n;
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (d == 2 || d == 3) {
            o6Var.c(pb.b1(false, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131750399, l10)), 0.66f, nqVarArr), z10, true);
            org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.q7, null);
        } else {
            o6Var.c(pb.b1(false, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131750400, l10, Integer.valueOf(r9Var.i))), 0.66f, nqVarArr), z10, true);
            org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(ls.c2), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
