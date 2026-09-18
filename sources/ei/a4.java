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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.f10;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class a4 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new a4());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        Object obj = j51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                b4 b4Var = (b4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = j51Var.r;
                TLRPC.User user = MessagesController.getInstance(b4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                f9 f9Var = new f9((f6) null);
                f9Var.r(user);
                b4Var.c.e(user, f9Var);
                b4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    f10 f10Var = new f10();
                    f10Var.f = j6.w0(null, j6.uj, false);
                    f10Var.n = l.G0(starrefprogram.commission_permille);
                    if (f10Var.c != null) {
                        f10Var.c = null;
                        f10Var.a();
                    }
                    spannableStringBuilder.setSpan(f10Var, 1, 2, 33);
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
        boolean z12 = j51Var.r;
        View view2 = b4Var2.e;
        ImageView imageView = b4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(b4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        f9 f9Var2 = new f9((f6) null);
        f9Var2.r(user2);
        b4Var2.c.e(user2, f9Var2);
        TextView textView = b4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            f10 f10Var2 = new f10();
            f10Var2.f = j6.w0(null, j6.uj, false);
            f10Var2.n = l.G0(connectedbotstarref.commission_permille);
            if (f10Var2.c != null) {
                f10Var2.c = null;
                f10Var2.a();
            }
            spannableStringBuilder2.setSpan(f10Var2, 1, 2, 33);
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

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new b4(context, i10, f6Var);
    }
}
