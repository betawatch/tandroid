package ii;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.cz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m3 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new m3());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        Object obj = r31Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                n3 n3Var = (n3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = r31Var.r;
                TLRPC.User a22 = hp.s1(n3Var.a).a2(Long.valueOf(starrefprogram.bot_id));
                u8 u8Var = new u8((e6) null);
                u8Var.r(a22);
                n3Var.c.e(a22, u8Var);
                n3Var.h.setText(l10.p(a22));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    cz czVar = new cz();
                    int i3 = k6.ik;
                    czVar.f = k6.w0(i3, null);
                    czVar.r = i3;
                    czVar.s = null;
                    czVar.n = true;
                    czVar.w = k.J0(starrefprogram.commission_permille);
                    if (czVar.c != null) {
                        czVar.c = null;
                        czVar.a();
                    }
                    spannableStringBuilder.setSpan(czVar, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) bd.M0(2131748994, null));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) bd.G(i10, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) bd.G(i10 / 12, "Years", new Object[0]));
                }
                n3Var.n.setText(spannableStringBuilder);
                n3Var.r.setVisibility(z11 ? 0 : 8);
                n3Var.d.setVisibility(8);
                n3Var.f.setVisibility(8);
                n3Var.e.setVisibility(8);
                n3Var.s = z10;
                n3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        n3 n3Var2 = (n3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = r31Var.r;
        e6 e6Var = n3Var2.b;
        View view2 = n3Var2.e;
        ImageView imageView = n3Var2.f;
        TLRPC.User a23 = hp.s1(n3Var2.a).a2(Long.valueOf(connectedbotstarref.bot_id));
        u8 u8Var2 = new u8((e6) null);
        u8Var2.r(a23);
        n3Var2.c.e(a23, u8Var2);
        TextView textView = n3Var2.h;
        textView.setText(i6.m(l10.p(a23), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            cz czVar2 = new cz();
            int i11 = k6.ik;
            czVar2.f = k6.w0(i11, null);
            czVar2.r = i11;
            czVar2.s = null;
            czVar2.n = true;
            czVar2.w = k.J0(connectedbotstarref.commission_permille);
            if (czVar2.c != null) {
                czVar2.c = null;
                czVar2.a();
            }
            spannableStringBuilder2.setSpan(czVar2, 1, 2, 33);
        }
        int i12 = connectedbotstarref.duration_months;
        if (i12 == 0) {
            spannableStringBuilder2.append((CharSequence) bd.M0(2131748994, null));
        } else if (i12 < 12 || i12 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) bd.G(i12, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) bd.G(i12 / 12, "Years", new Object[0]));
        }
        n3Var2.n.setText(spannableStringBuilder2);
        n3Var2.r.setVisibility(z12 ? 0 : 8);
        n3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = k6.L(org.telegram.messenger.g0.L(9.665f), k6.w0(connectedbotstarref.revoked ? k6.kk : k6.ik, e6Var));
        n6 N = r6.N(connectedbotstarref.revoked ? k6.kk : k6.ik);
        view2.setBackground(L);
        r6.k(view2, L, N, null, e6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        n3Var2.s = z10;
        n3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new n3(i3, context, e6Var);
    }
}
