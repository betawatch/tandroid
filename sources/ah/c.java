package ah;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c extends yg.c {
    public final wo s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final a3.f y;

    public c(Context context, f6 f6Var) {
        super(context, f6Var);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new a3.f(this, 3);
        textPaint.setTextSize(g0.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        wo woVar = new wo(21, context, f6Var);
        this.s = woVar;
        woVar.b(k6.B5, k6.j7, k6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        woVar.setLayoutParams(ha.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // yg.c
    public final int a() {
        return 22;
    }

    @Override // yg.c
    public final boolean b() {
        return true;
    }

    @Override // yg.c
    public final void c(boolean z9, boolean z10) {
        wo woVar = this.s;
        if (woVar.getVisibility() == 0) {
            woVar.a(z9, z10);
        }
    }

    @Override // yg.c
    public final void d() {
        boolean z9 = hd.a0;
        this.d.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 20.0f : 52.0f, 0.0f, z9 ? 52.0f : 20.0f, 0.0f));
        boolean z10 = hd.a0;
        this.e.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = hd.a0;
        this.f.setLayoutParams(ha.d(22, 22.0f, (z11 ? 5 : 3) | 16, z11 ? 15.0f : 20.0f, 0.0f, z11 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o4 = i6.o(hd.F0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o4 != null) {
            spannableStringBuilder.append(o4).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), o4.length(), o4.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String i02 = hd.i0(2131750520, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override // yg.c
    public int getFullHeight() {
        return 44;
    }
}
