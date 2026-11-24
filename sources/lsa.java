// default package

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lsa extends x51 {
    public final ylb Q;
    public String R;
    public int S;

    public lsa(Context context, ylb ylbVar) {
        super(context);
        this.Q = ylbVar;
        anb.X(this, cmb.F6, ylbVar);
        setTextSize(1, 14.0f);
        setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
    }

    public final void e(String str, int i, spa spaVar) {
        if (str == this.R && this.S == i) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gw3.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) y51.b(bc.J0(i), spaVar != null ? new v99(this, spaVar, i, (byte) 12) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i;
    }
}
