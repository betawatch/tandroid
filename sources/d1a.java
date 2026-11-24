// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d1a extends gg0 {
    public final jh2 s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final c0a y;

    public d1a(Context context, ylb ylbVar) {
        super(context, ylbVar);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new c0a(this, (byte) 1);
        textPaint.setTextSize(gm.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.s = jh2Var;
        jh2Var.b(cmb.A5, cmb.i7, cmb.B5);
        jh2Var.setDrawUnchecked(true);
        jh2Var.setDrawBackgroundAsArc(10);
        addView(jh2Var);
        jh2Var.a(false, false);
        jh2Var.setLayoutParams(qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // gg0
    public final int a() {
        return 22;
    }

    @Override // gg0
    public final boolean b() {
        return true;
    }

    @Override // gg0
    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.s;
        if (jh2Var.getVisibility() == 0) {
            jh2Var.a(z, z2);
        }
    }

    @Override // gg0
    public final void d() {
        boolean z = jb6.a0;
        this.d.setLayoutParams(qoe.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 52.0f, 0.0f, z ? 52.0f : 20.0f, 0.0f));
        boolean z2 = jb6.a0;
        this.e.setLayoutParams(qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 52.0f, 0.0f, z2 ? 52.0f : 20.0f, 0.0f));
        boolean z3 = jb6.a0;
        this.f.setLayoutParams(qoe.d(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o = gw3.o(jb6.E0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o != null) {
            spannableStringBuilder.append(o).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new c1a(16), o.length(), o.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new c1a(34), 0, 1, 0);
        }
        String i0 = jb6.i0(2131750453, tL_help_country.iso2);
        if (TextUtils.isEmpty(i0)) {
            i0 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i0);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override // gg0
    public int getFullHeight() {
        return 44;
    }
}
