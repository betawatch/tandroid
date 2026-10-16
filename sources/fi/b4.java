package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.i10;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b4 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new b4());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        Object obj = m61Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                c4 c4Var = (c4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = m61Var.r;
                TLRPC.User user = MessagesController.getInstance(c4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                k9 k9Var = new k9((c6) null);
                k9Var.r(user);
                c4Var.c.e(user, k9Var);
                c4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    i10 i10Var = new i10();
                    i10Var.f = g6.x0(null, g6.uj, false);
                    i10Var.n = l.H0(starrefprogram.commission_permille);
                    if (i10Var.c != null) {
                        i10Var.c = null;
                        i10Var.a();
                    }
                    spannableStringBuilder.setSpan(i10Var, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i10, new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i10 / 12, new Object[0]));
                }
                c4Var.n.setText(spannableStringBuilder);
                c4Var.r.setVisibility(z11 ? 0 : 8);
                c4Var.d.setVisibility(8);
                c4Var.f.setVisibility(8);
                c4Var.e.setVisibility(8);
                c4Var.s = z10;
                c4Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        c4 c4Var2 = (c4) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = m61Var.r;
        View view2 = c4Var2.e;
        ImageView imageView = c4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(c4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        k9 k9Var2 = new k9((c6) null);
        k9Var2.r(user2);
        c4Var2.c.e(user2, k9Var2);
        TextView textView = c4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            i10 i10Var2 = new i10();
            i10Var2.f = g6.x0(null, g6.uj, false);
            i10Var2.n = l.H0(connectedbotstarref.commission_permille);
            if (i10Var2.c != null) {
                i10Var2.c = null;
                i10Var2.a();
            }
            spannableStringBuilder2.setSpan(i10Var2, 1, 2, 33);
        }
        int i11 = connectedbotstarref.duration_months;
        if (i11 == 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
        } else if (i11 < 12 || i11 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i11, new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i11 / 12, new Object[0]));
        }
        c4Var2.n.setText(spannableStringBuilder2);
        c4Var2.r.setVisibility(z12 ? 0 : 8);
        c4Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(g6.K(AndroidUtilities.dp(9.665f), g6.w0(connectedbotstarref.revoked ? g6.wj : g6.uj, c4Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        c4Var2.s = z10;
        c4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new c4(context, i10, c6Var);
    }
}
