package di;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p5 extends org.telegram.ui.Components.ec {
    public final org.telegram.ui.ActionBar.e6 Q;
    public String R;
    public int S;

    public p5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.Q = e6Var;
        org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, e6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
    }

    public final void f(String str, int i7, s1 s1Var) {
        if (str == this.R && this.S == i7) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.fc.b(ki.k.J0(i7), s1Var != null ? new ai.a1(this, s1Var, i7, 6) : null, this.Q, null));
        setText(spannableStringBuilder);
        this.R = str;
        this.S = i7;
    }
}
