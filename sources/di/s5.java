package di;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s5 extends org.telegram.ui.Components.nc {
    public final org.telegram.ui.ActionBar.i6 Q;
    public String R;
    public int S;

    public s5(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.Q = i6Var;
        org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i7, q1 q1Var) {
        if (str == this.R && this.S == i7) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.oc.b(ki.k.J0(i7), q1Var != null ? new ai.a1(this, q1Var, i7, 7) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i7;
    }
}
