// default package

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
