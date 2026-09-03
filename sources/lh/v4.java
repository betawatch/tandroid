package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v4 extends sc {
    public final org.telegram.ui.ActionBar.f6 K;
    public String L;
    public int M;

    public v4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.K = f6Var;
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, o1 o1Var) {
        if (str == this.L && this.M == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b(rh.j.G0(i10), o1Var != null ? new ah.a(this, o1Var, i10, 8) : null, this.K, null));
        setText(spannableStringBuilder);
        this.L = str;
        this.M = i10;
    }
}
