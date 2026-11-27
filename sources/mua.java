// default package

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mua extends y41 {
    public final vnb Q;
    public String R;
    public int S;

    public mua(Context context, vnb vnbVar) {
        super(context);
        this.Q = vnbVar;
        yob.X(this, aob.G6, vnbVar);
        setTextSize(1, 14.0f);
        setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
    }

    public final void e(String str, int i, ora oraVar) {
        if (str == this.R && this.S == i) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pv3.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) z41.b(cc.J0(i), oraVar != null ? new a39(this, oraVar, i, (byte) 13) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i;
    }
}
