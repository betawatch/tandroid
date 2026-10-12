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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.j10;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b4 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new b4());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        Object obj = l61Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                c4 c4Var = (c4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = l61Var.r;
                TLRPC.User user = MessagesController.getInstance(c4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                k9 k9Var = new k9((c6) null);
                k9Var.r(user);
                c4Var.c.e(user, k9Var);
                c4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    j10 j10Var = new j10();
                    j10Var.f = g6.x0(null, g6.uj, false);
                    j10Var.n = l.H0(starrefprogram.commission_permille);
                    if (j10Var.c != null) {
                        j10Var.c = null;
                        j10Var.a();
                    }
                    spannableStringBuilder.setSpan(j10Var, 1, 2, 33);
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
        boolean z12 = l61Var.r;
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
            j10 j10Var2 = new j10();
            j10Var2.f = g6.x0(null, g6.uj, false);
            j10Var2.n = l.H0(connectedbotstarref.commission_permille);
            if (j10Var2.c != null) {
                j10Var2.c = null;
                j10Var2.a();
            }
            spannableStringBuilder2.setSpan(j10Var2, 1, 2, 33);
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

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new c4(context, i10, c6Var);
    }
}
