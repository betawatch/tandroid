package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import di.lb;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.r9;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final hi.d a;
    public final org.telegram.ui.Components.h6 b;
    public final org.telegram.ui.Components.h6 c;
    public final r9 d;
    public final Paint e;
    public final bg.q f;
    public final eq h;
    public final eq[] n;

    public f(Context context, r9 r9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new bg.q(new a1.c(this, 11));
        this.h = new eq(R.drawable.filled_gift_sell_24, 0);
        this.n = new eq[1];
        this.d = r9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
        hi.d dVar = new hi.d(context, null, true);
        this.a = dVar;
        org.telegram.ui.Components.g6 g6Var = dVar.d;
        g6Var.E = false;
        g6Var.F = true;
        g6Var.G = true;
        g6Var.H = true;
        g6Var.I = false;
        fh0 fh0Var = new fh0(context);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.b = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.c = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = r9Var.d.sticker;
        if (document != null) {
            fh0Var.g(44, 44, document);
        }
        addView(h6Var, ja.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(h6Var2, ja.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(fh0Var, ja.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, ja.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z10) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) hd.M0(2131750415, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        r9 r9Var = this.d;
        if (r9Var.f != null) {
            this.b.c(hd.a0(null, null, 2131750414, hd.E(r1.current_round, ','), hd.E(r9Var.f.total_rounds, ',')), z10, true);
        }
        String l10 = i5.c.l(r9Var.e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = r9Var.d();
        eq[] eqVarArr = this.n;
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (d == 2 || d == 3) {
            h6Var.c(lb.a1(false, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750416, l10)), 0.66f, eqVarArr), z10, true);
            org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.q7, null);
        } else {
            h6Var.c(lb.a1(false, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750417, l10, Integer.valueOf(r9Var.i))), 0.66f, eqVarArr), z10, true);
            org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
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
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(ns.c2), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
