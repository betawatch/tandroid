package bh;

import ai.s;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends zg.c {
    public final wo s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final s y;

    public c(Context context, e6 e6Var) {
        super(context, e6Var);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new s(this, 16);
        textPaint.setTextSize(g0.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        wo woVar = new wo(21, context, e6Var);
        this.s = woVar;
        woVar.b(k6.B5, k6.j7, k6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        woVar.setLayoutParams(mf.d(24, 24.0f, (bd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // zg.c
    public final int a() {
        return 22;
    }

    @Override // zg.c
    public final boolean b() {
        return true;
    }

    @Override // zg.c
    public final void c(boolean z10, boolean z11) {
        wo woVar = this.s;
        if (woVar.getVisibility() == 0) {
            woVar.a(z10, z11);
        }
    }

    @Override // zg.c
    public final void d() {
        boolean z10 = bd.a0;
        this.d.setLayoutParams(mf.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = bd.a0;
        this.e.setLayoutParams(mf.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = bd.a0;
        this.f.setLayoutParams(mf.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o10 = i6.o(bd.F0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o10 != null) {
            spannableStringBuilder.append(o10).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), o10.length(), o10.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String i02 = bd.i0(2131750529, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override // zg.c
    public int getFullHeight() {
        return 44;
    }
}
