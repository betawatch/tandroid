package ei;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a4 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new a4());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        Object obj = p61Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                b4 b4Var = (b4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = p61Var.r;
                TLRPC.User user = MessagesController.getInstance(b4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                j9 j9Var = new j9((e6) null);
                j9Var.r(user);
                b4Var.c.e(user, j9Var);
                b4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    d10 d10Var = new d10();
                    d10Var.f = i6.x0(null, i6.uj, false);
                    d10Var.n = l.H0(starrefprogram.commission_permille);
                    if (d10Var.c != null) {
                        d10Var.c = null;
                        d10Var.a();
                    }
                    spannableStringBuilder.setSpan(d10Var, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i10, new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i10 / 12, new Object[0]));
                }
                b4Var.n.setText(spannableStringBuilder);
                b4Var.r.setVisibility(z11 ? 0 : 8);
                b4Var.d.setVisibility(8);
                b4Var.f.setVisibility(8);
                b4Var.e.setVisibility(8);
                b4Var.s = z10;
                b4Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        b4 b4Var2 = (b4) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = p61Var.r;
        View view2 = b4Var2.e;
        ImageView imageView = b4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(b4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        j9 j9Var2 = new j9((e6) null);
        j9Var2.r(user2);
        b4Var2.c.e(user2, j9Var2);
        TextView textView = b4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            d10 d10Var2 = new d10();
            d10Var2.f = i6.x0(null, i6.uj, false);
            d10Var2.n = l.H0(connectedbotstarref.commission_permille);
            if (d10Var2.c != null) {
                d10Var2.c = null;
                d10Var2.a();
            }
            spannableStringBuilder2.setSpan(d10Var2, 1, 2, 33);
        }
        int i11 = connectedbotstarref.duration_months;
        if (i11 == 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
        } else if (i11 < 12 || i11 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i11, new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i11 / 12, new Object[0]));
        }
        b4Var2.n.setText(spannableStringBuilder2);
        b4Var2.r.setVisibility(z12 ? 0 : 8);
        b4Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(i6.K(AndroidUtilities.dp(9.665f), i6.w0(connectedbotstarref.revoked ? i6.wj : i6.uj, b4Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        b4Var2.s = z10;
        b4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new b4(context, i10, e6Var);
    }
}
