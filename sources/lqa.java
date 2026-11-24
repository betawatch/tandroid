// default package

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lqa extends q41 {
    public final wjb Q;
    public String R;
    public int S;

    public lqa(Context context, wjb wjbVar) {
        super(context);
        this.Q = wjbVar;
        zkb.X(this, bkb.F6, wjbVar);
        setTextSize(1, 14.0f);
        setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
    }

    public final void e(String str, int i, sna snaVar) {
        if (str == this.R && this.S == i) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vu3.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) r41.b(bc.I0(i), snaVar != null ? new t79(this, snaVar, i, (byte) 12) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i;
    }
}
