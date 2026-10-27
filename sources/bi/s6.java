package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s6 extends org.telegram.ui.Components.yc {
    public final org.telegram.ui.ActionBar.u6 P;
    public String Q;
    public int R;

    public s6(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.P = u6Var;
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.G6, u6Var);
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, j2 j2Var) {
        if (str == this.Q && this.R == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.zc.b(hi.k.F0(i10), j2Var != null ? new ai.h0(this, j2Var, i10, 3) : null, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i10;
    }
}
