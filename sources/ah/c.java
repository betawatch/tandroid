package ah;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.mp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c extends yg.c {
    public final mp s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final a3.f y;

    public c(Context context, i6 i6Var) {
        super(context, i6Var);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new a3.f(this, 3);
        textPaint.setTextSize(g0.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        mp mpVar = new mp(21, context, i6Var);
        this.s = mpVar;
        mpVar.b(n6.B5, n6.j7, n6.C5);
        mpVar.setDrawUnchecked(true);
        mpVar.setDrawBackgroundAsArc(10);
        addView(mpVar);
        mpVar.a(false, false);
        mpVar.setLayoutParams(ma.d(24, 24.0f, (gd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
    public final void c(boolean z10, boolean z11) {
        mp mpVar = this.s;
        if (mpVar.getVisibility() == 0) {
            mpVar.a(z10, z11);
        }
    }

    @Override // yg.c
    public final void d() {
        boolean z10 = gd.a0;
        this.d.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = gd.a0;
        this.e.setLayoutParams(ma.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = gd.a0;
        this.f.setLayoutParams(ma.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o4 = j6.o(gd.F0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o4 != null) {
            spannableStringBuilder.append(o4).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), o4.length(), o4.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String i02 = gd.i0(2131750505, tL_help_country.iso2);
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
