package ki;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.fz;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class j3 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new j3());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        Object obj = b41Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                k3 k3Var = (k3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = b41Var.r;
                TLRPC.User a22 = np.s1(k3Var.a).a2(Long.valueOf(starrefprogram.bot_id));
                t8 t8Var = new t8((e6) null);
                t8Var.r(a22);
                k3Var.c.f(a22, t8Var);
                k3Var.h.setText(q10.p(a22));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    fz fzVar = new fz();
                    int i7 = j6.lk;
                    fzVar.f = j6.w0(i7, null);
                    fzVar.r = i7;
                    fzVar.s = null;
                    fzVar.n = true;
                    fzVar.w = k.J0(starrefprogram.commission_permille);
                    if (fzVar.c != null) {
                        fzVar.c = null;
                        fzVar.a();
                    }
                    spannableStringBuilder.setSpan(fzVar, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) hd.M0(2131748986, null));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) hd.G(i10, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) hd.G(i10 / 12, "Years", new Object[0]));
                }
                k3Var.n.setText(spannableStringBuilder);
                k3Var.r.setVisibility(z11 ? 0 : 8);
                k3Var.d.setVisibility(8);
                k3Var.f.setVisibility(8);
                k3Var.e.setVisibility(8);
                k3Var.s = z10;
                k3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        k3 k3Var2 = (k3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = b41Var.r;
        e6 e6Var = k3Var2.b;
        View view2 = k3Var2.e;
        ImageView imageView = k3Var2.f;
        TLRPC.User a23 = np.s1(k3Var2.a).a2(Long.valueOf(connectedbotstarref.bot_id));
        t8 t8Var2 = new t8((e6) null);
        t8Var2.r(a23);
        k3Var2.c.f(a23, t8Var2);
        TextView textView = k3Var2.h;
        textView.setText(org.telegram.messenger.j6.m(q10.p(a23), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            fz fzVar2 = new fz();
            int i11 = j6.lk;
            fzVar2.f = j6.w0(i11, null);
            fzVar2.r = i11;
            fzVar2.s = null;
            fzVar2.n = true;
            fzVar2.w = k.J0(connectedbotstarref.commission_permille);
            if (fzVar2.c != null) {
                fzVar2.c = null;
                fzVar2.a();
            }
            spannableStringBuilder2.setSpan(fzVar2, 1, 2, 33);
        }
        int i12 = connectedbotstarref.duration_months;
        if (i12 == 0) {
            spannableStringBuilder2.append((CharSequence) hd.M0(2131748986, null));
        } else if (i12 < 12 || i12 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) hd.G(i12, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) hd.G(i12 / 12, "Years", new Object[0]));
        }
        k3Var2.n.setText(spannableStringBuilder2);
        k3Var2.r.setVisibility(z12 ? 0 : 8);
        k3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = j6.L(org.telegram.messenger.g0.L(9.665f), j6.w0(connectedbotstarref.revoked ? j6.nk : j6.lk, e6Var));
        m6 M = q6.M(connectedbotstarref.revoked ? j6.nk : j6.lk);
        view2.setBackground(L);
        q6.j(view2, L, M, null, e6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        k3Var2.s = z10;
        k3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new k3(i7, context, e6Var);
    }
}
