package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.l00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q3 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new q3());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        Object obj = l41Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                r3 r3Var = (r3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = l41Var.r;
                TLRPC.User user = MessagesController.getInstance(r3Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                z8 z8Var = new z8((b6) null);
                z8Var.r(user);
                r3Var.c.e(user, z8Var);
                r3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    l00 l00Var = new l00();
                    l00Var.f = f6.w0(null, f6.uj, false);
                    l00Var.n = l.F0(starrefprogram.commission_permille);
                    if (l00Var.c != null) {
                        l00Var.c = null;
                        l00Var.a();
                    }
                    spannableStringBuilder.setSpan(l00Var, 1, 2, 33);
                }
                int i9 = starrefprogram.duration_months;
                if (i9 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i9 < 12 || i9 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i9, new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i9 / 12, new Object[0]));
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
        boolean z12 = l41Var.r;
        View view2 = r3Var2.e;
        ImageView imageView = r3Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(r3Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        z8 z8Var2 = new z8((b6) null);
        z8Var2.r(user2);
        r3Var2.c.e(user2, z8Var2);
        TextView textView = r3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            l00 l00Var2 = new l00();
            l00Var2.f = f6.w0(null, f6.uj, false);
            l00Var2.n = l.F0(connectedbotstarref.commission_permille);
            if (l00Var2.c != null) {
                l00Var2.c = null;
                l00Var2.a();
            }
            spannableStringBuilder2.setSpan(l00Var2, 1, 2, 33);
        }
        int i10 = connectedbotstarref.duration_months;
        if (i10 == 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
        } else if (i10 < 12 || i10 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i10, new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i10 / 12, new Object[0]));
        }
        r3Var2.n.setText(spannableStringBuilder2);
        r3Var2.r.setVisibility(z12 ? 0 : 8);
        r3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(f6.K(AndroidUtilities.dp(9.665f), f6.v0(connectedbotstarref.revoked ? f6.wj : f6.uj, r3Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        r3Var2.s = z10;
        r3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new r3(context, i9, b6Var);
    }
}
