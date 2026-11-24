// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bz9 extends gf0 {
    public final wf2 s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final zk9 y;

    public bz9(Context context, wjb wjbVar) {
        super(context, wjbVar);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new zk9(this, (byte) 23);
        textPaint.setTextSize(gl.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.s = wf2Var;
        wf2Var.b(bkb.A5, bkb.i7, bkb.B5);
        wf2Var.setDrawUnchecked(true);
        wf2Var.setDrawBackgroundAsArc(10);
        addView(wf2Var);
        wf2Var.a(false, false);
        wf2Var.setLayoutParams(nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // gf0
    public final int a() {
        return 22;
    }

    @Override // gf0
    public final boolean b() {
        return true;
    }

    @Override // gf0
    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.s;
        if (wf2Var.getVisibility() == 0) {
            wf2Var.a(z, z2);
        }
    }

    @Override // gf0
    public final void d() {
        boolean z = k96.a0;
        this.d.setLayoutParams(nme.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 52.0f, 0.0f, z ? 52.0f : 20.0f, 0.0f));
        boolean z2 = k96.a0;
        this.e.setLayoutParams(nme.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 52.0f, 0.0f, z2 ? 52.0f : 20.0f, 0.0f));
        boolean z3 = k96.a0;
        this.f.setLayoutParams(nme.d(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o = vu3.o(k96.E0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o != null) {
            spannableStringBuilder.append(o).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new az9(16), o.length(), o.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new az9(34), 0, 1, 0);
        }
        String i0 = k96.i0(2131750504, tL_help_country.iso2);
        if (TextUtils.isEmpty(i0)) {
            i0 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i0);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override // gf0
    public int getFullHeight() {
        return 44;
    }
}
