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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class b4 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new b4());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        Object obj = h61Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                c4 c4Var = (c4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = h61Var.r;
                TLRPC.User user = MessagesController.getInstance(c4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                h9 h9Var = new h9((d6) null);
                h9Var.r(user);
                c4Var.c.e(user, h9Var);
                c4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    d10 d10Var = new d10();
                    d10Var.f = i6.w0(null, i6.uj, false);
                    d10Var.n = m.L0(starrefprogram.commission_permille);
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
        boolean z12 = h61Var.r;
        View view2 = c4Var2.e;
        ImageView imageView = c4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(c4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        h9 h9Var2 = new h9((d6) null);
        h9Var2.r(user2);
        c4Var2.c.e(user2, h9Var2);
        TextView textView = c4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            d10 d10Var2 = new d10();
            d10Var2.f = i6.w0(null, i6.uj, false);
            d10Var2.n = m.L0(connectedbotstarref.commission_permille);
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
        c4Var2.n.setText(spannableStringBuilder2);
        c4Var2.r.setVisibility(z12 ? 0 : 8);
        c4Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(i6.K(AndroidUtilities.dp(9.665f), i6.v0(connectedbotstarref.revoked ? i6.wj : i6.uj, c4Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        c4Var2.s = z10;
        c4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new c4(context, i10, d6Var);
    }
}
