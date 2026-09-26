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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class a4 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new a4());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        Object obj = v51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                b4 b4Var = (b4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = v51Var.r;
                TLRPC.User user = MessagesController.getInstance(b4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                h9 h9Var = new h9((d6) null);
                h9Var.r(user);
                b4Var.c.e(user, h9Var);
                b4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    z00 z00Var = new z00();
                    z00Var.f = h6.w0(null, h6.uj, false);
                    z00Var.n = l.G0(starrefprogram.commission_permille);
                    if (z00Var.c != null) {
                        z00Var.c = null;
                        z00Var.a();
                    }
                    spannableStringBuilder.setSpan(z00Var, 1, 2, 33);
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
        boolean z12 = v51Var.r;
        View view2 = b4Var2.e;
        ImageView imageView = b4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(b4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        h9 h9Var2 = new h9((d6) null);
        h9Var2.r(user2);
        b4Var2.c.e(user2, h9Var2);
        TextView textView = b4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            z00 z00Var2 = new z00();
            z00Var2.f = h6.w0(null, h6.uj, false);
            z00Var2.n = l.G0(connectedbotstarref.commission_permille);
            if (z00Var2.c != null) {
                z00Var2.c = null;
                z00Var2.a();
            }
            spannableStringBuilder2.setSpan(z00Var2, 1, 2, 33);
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
        view2.setBackground(h6.K(AndroidUtilities.dp(9.665f), h6.v0(connectedbotstarref.revoked ? h6.wj : h6.uj, b4Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        b4Var2.s = z10;
        b4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new b4(context, i10, d6Var);
    }
}
