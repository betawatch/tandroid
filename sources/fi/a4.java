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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class a4 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new a4());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        Object obj = h51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                b4 b4Var = (b4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = h51Var.r;
                TLRPC.User user = MessagesController.getInstance(b4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                i9 i9Var = new i9((f6) null);
                i9Var.r(user);
                b4Var.c.e(user, i9Var);
                b4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    d10 d10Var = new d10();
                    d10Var.f = j6.w0(null, j6.uj, false);
                    d10Var.n = m.G0(starrefprogram.commission_permille);
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
        boolean z12 = h51Var.r;
        View view2 = b4Var2.e;
        ImageView imageView = b4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(b4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        i9 i9Var2 = new i9((f6) null);
        i9Var2.r(user2);
        b4Var2.c.e(user2, i9Var2);
        TextView textView = b4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            d10 d10Var2 = new d10();
            d10Var2.f = j6.w0(null, j6.uj, false);
            d10Var2.n = m.G0(connectedbotstarref.commission_permille);
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
        view2.setBackground(j6.K(AndroidUtilities.dp(9.665f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.uj, b4Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        b4Var2.s = z10;
        b4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new b4(context, i10, f6Var);
    }
}
