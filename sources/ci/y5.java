package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y5 extends org.telegram.ui.Components.hc {
    public final org.telegram.ui.ActionBar.e6 Q;
    public String R;
    public int S;

    public y5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.Q = e6Var;
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, e6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i3, y1 y1Var) {
        if (str == this.R && this.S == i3) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.ic.b(ii.k.J0(i3), y1Var != null ? new ai.e3(this, y1Var, i3, 3) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i3;
    }
}
