package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class x6 extends org.telegram.ui.Components.zc {
    public final org.telegram.ui.ActionBar.g6 P;
    public String Q;
    public int R;

    public x6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.P = g6Var;
        org.telegram.ui.ActionBar.r6.W(this, org.telegram.ui.ActionBar.k6.G6, g6Var);
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, l2 l2Var) {
        if (str == this.Q && this.R == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.ad.b(gi.l.H0(i10), l2Var != null ? new ah.o(this, l2Var, i10, 2) : null, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i10;
    }
}
