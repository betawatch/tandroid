package di;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class s5 extends org.telegram.ui.Components.nc {
    public final org.telegram.ui.ActionBar.h6 Q;
    public String R;
    public int S;

    public s5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.Q = h6Var;
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, h6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i7, q1 q1Var) {
        if (str == this.R && this.S == i7) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.oc.b(ki.j.J0(i7), q1Var != null ? new ai.j1(this, q1Var, i7, 6) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i7;
    }
}
