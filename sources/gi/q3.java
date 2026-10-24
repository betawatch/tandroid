package gi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class q3 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new q3());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        Object obj = m61Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                r3 r3Var = (r3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = m61Var.r;
                TLRPC.User user = MessagesController.getInstance(r3Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                h9 h9Var = new h9((g6) null);
                h9Var.r(user);
                r3Var.c.e(user, h9Var);
                r3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    o00 o00Var = new o00();
                    int i10 = k6.uj;
                    o00Var.f = k6.w0(i10, null);
                    o00Var.r = i10;
                    o00Var.s = null;
                    o00Var.n = true;
                    o00Var.v = l.H0(starrefprogram.commission_permille);
                    if (o00Var.c != null) {
                        o00Var.c = null;
                        o00Var.a();
                    }
                    spannableStringBuilder.setSpan(o00Var, 1, 2, 33);
                }
                int i11 = starrefprogram.duration_months;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i11 < 12 || i11 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i11, new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i11 / 12, new Object[0]));
                }
                r3Var.n.setText(spannableStringBuilder);
                r3Var.r.setVisibility(z11 ? 0 : 8);
                r3Var.d.setVisibility(8);
                r3Var.f.setVisibility(8);
                r3Var.e.setVisibility(8);
                r3Var.s = z10;
                r3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        r3 r3Var2 = (r3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = m61Var.r;
        g6 g6Var = r3Var2.b;
        View view2 = r3Var2.e;
        ImageView imageView = r3Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(r3Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        h9 h9Var2 = new h9((g6) null);
        h9Var2.r(user2);
        r3Var2.c.e(user2, h9Var2);
        TextView textView = r3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            o00 o00Var2 = new o00();
            int i12 = k6.uj;
            o00Var2.f = k6.w0(i12, null);
            o00Var2.r = i12;
            o00Var2.s = null;
            o00Var2.n = true;
            o00Var2.v = l.H0(connectedbotstarref.commission_permille);
            if (o00Var2.c != null) {
                o00Var2.c = null;
                o00Var2.a();
            }
            spannableStringBuilder2.setSpan(o00Var2, 1, 2, 33);
        }
        int i13 = connectedbotstarref.duration_months;
        if (i13 == 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
        } else if (i13 < 12 || i13 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i13, new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i13 / 12, new Object[0]));
        }
        r3Var2.n.setText(spannableStringBuilder2);
        r3Var2.r.setVisibility(z12 ? 0 : 8);
        r3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable K = k6.K(AndroidUtilities.dp(9.665f), k6.w0(connectedbotstarref.revoked ? k6.wj : k6.uj, g6Var));
        n6 O = r6.O(connectedbotstarref.revoked ? k6.wj : k6.uj);
        view2.setBackground(K);
        r6.k(view2, K, O, null, g6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        r3Var2.s = z10;
        r3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new r3(context, i10, g6Var);
    }
}
