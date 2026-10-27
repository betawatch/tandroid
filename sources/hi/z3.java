package hi;

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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z3 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new z3());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        Object obj = u61Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                a4 a4Var = (a4) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = u61Var.r;
                TLRPC.User user = MessagesController.getInstance(a4Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                j9 j9Var = new j9((u6) null);
                j9Var.r(user);
                a4Var.c.f(user, j9Var);
                a4Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    o00 o00Var = new o00();
                    int i10 = y6.uj;
                    o00Var.f = y6.w0(i10, null);
                    o00Var.r = i10;
                    o00Var.s = null;
                    o00Var.n = true;
                    o00Var.v = k.F0(starrefprogram.commission_permille);
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
                a4Var.n.setText(spannableStringBuilder);
                a4Var.r.setVisibility(z11 ? 0 : 8);
                a4Var.d.setVisibility(8);
                a4Var.f.setVisibility(8);
                a4Var.e.setVisibility(8);
                a4Var.s = z10;
                a4Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        a4 a4Var2 = (a4) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = u61Var.r;
        u6 u6Var = a4Var2.b;
        View view2 = a4Var2.e;
        ImageView imageView = a4Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(a4Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        j9 j9Var2 = new j9((u6) null);
        j9Var2.r(user2);
        a4Var2.c.f(user2, j9Var2);
        TextView textView = a4Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            o00 o00Var2 = new o00();
            int i12 = y6.uj;
            o00Var2.f = y6.w0(i12, null);
            o00Var2.r = i12;
            o00Var2.s = null;
            o00Var2.n = true;
            o00Var2.v = k.F0(connectedbotstarref.commission_permille);
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
        a4Var2.n.setText(spannableStringBuilder2);
        a4Var2.r.setVisibility(z12 ? 0 : 8);
        a4Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable K = y6.K(AndroidUtilities.dp(9.665f), y6.w0(connectedbotstarref.revoked ? y6.wj : y6.uj, u6Var));
        b7 N = f7.N(connectedbotstarref.revoked ? y6.wj : y6.uj);
        view2.setBackground(K);
        f7.k(view2, K, N, null, u6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        a4Var2.s = z10;
        a4Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new a4(context, i10, u6Var);
    }
}
