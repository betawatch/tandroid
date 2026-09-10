package di;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.f10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d4 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new d4());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        Object obj = v51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                e4 e4Var = (e4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = v51Var.r;
                TLRPC.User user = MessagesController.getInstance(e4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                g9 g9Var = new g9((f6) null);
                g9Var.r(user);
                e4Var.c.e(user, g9Var);
                e4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    f10 f10Var = new f10();
                    f10Var.f = j6.w0(null, j6.uj, false);
                    f10Var.n = m.G0(starrefprogram.commission_permille);
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
                e4Var.n.setText(spannableStringBuilder);
                e4Var.r.setVisibility(z11 ? 0 : 8);
                e4Var.d.setVisibility(8);
                e4Var.f.setVisibility(8);
                e4Var.e.setVisibility(8);
                e4Var.s = z10;
                e4Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        e4 e4Var2 = (e4) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = v51Var.r;
        View view2 = e4Var2.e;
        ImageView imageView = e4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(e4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        g9 g9Var2 = new g9((f6) null);
        g9Var2.r(user2);
        e4Var2.c.e(user2, g9Var2);
        TextView textView = e4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            f10 f10Var2 = new f10();
            f10Var2.f = j6.w0(null, j6.uj, false);
            f10Var2.n = m.G0(connectedbotstarref.commission_permille);
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
        e4Var2.n.setText(spannableStringBuilder2);
        e4Var2.r.setVisibility(z12 ? 0 : 8);
        e4Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(j6.K(AndroidUtilities.dp(9.665f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.uj, e4Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        e4Var2.s = z10;
        e4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new e4(context, i10, f6Var);
    }
}
