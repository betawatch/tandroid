package jh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w4 extends vc {
    public final org.telegram.ui.ActionBar.c6 J;
    public String K;
    public int L;

    public w4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.J = c6Var;
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, o1 o1Var) {
        if (str == this.K && this.L == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) wc.b(ph.j.G0(i10), o1Var != null ? new ag.v0(this, o1Var, i10, 6) : null, this.J, null));
        setText(spannableStringBuilder);
        this.K = str;
        this.L = i10;
    }
}
