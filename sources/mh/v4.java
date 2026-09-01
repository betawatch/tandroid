package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class v4 extends sc {
    public final org.telegram.ui.ActionBar.g6 K;
    public String L;
    public int M;

    public v4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.K = g6Var;
        setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, n1 n1Var) {
        if (str == this.L && this.M == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b(sh.j.G0(i10), n1Var != null ? new bh.a(this, n1Var, i10, 8) : null, this.K, null));
        setText(spannableStringBuilder);
        this.L = str;
        this.M = i10;
    }
}
