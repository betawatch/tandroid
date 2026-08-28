package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z4 extends qc {
    public final org.telegram.ui.ActionBar.b6 J;
    public String K;
    public int L;

    public z4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null);
        this.J = b6Var;
        setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i9, q1 q1Var) {
        if (str == this.K && this.L == i9) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) rc.b(mh.l.F0(i9), q1Var != null ? new d5.i(this, q1Var, i9, 4) : null, this.J, null));
        setText(spannableStringBuilder);
        this.K = str;
        this.L = i9;
    }
}
