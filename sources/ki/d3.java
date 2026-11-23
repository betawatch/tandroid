package ki;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.iz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class d3 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new d3());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        Object obj = o41Var.H;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                e3 e3Var = (e3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = o41Var.s;
                TLRPC.User c22 = np.u1(e3Var.a).c2(Long.valueOf(starrefprogram.bot_id));
                b9 b9Var = new b9((h6) null);
                b9Var.r(c22);
                e3Var.c.f(c22, b9Var);
                e3Var.h.setText(p10.q(c22));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    iz izVar = new iz();
                    int i7 = m6.lk;
                    izVar.f = m6.w0(i7, null);
                    izVar.r = i7;
                    izVar.s = null;
                    izVar.n = true;
                    izVar.w = j.J0(starrefprogram.commission_permille);
                    if (izVar.c != null) {
                        izVar.c = null;
                        izVar.a();
                    }
                    spannableStringBuilder.setSpan(izVar, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) hd.N0(2131748793, null));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) hd.G(i10, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) hd.G(i10 / 12, "Years", new Object[0]));
                }
                e3Var.n.setText(spannableStringBuilder);
                e3Var.r.setVisibility(z11 ? 0 : 8);
                e3Var.d.setVisibility(8);
                e3Var.f.setVisibility(8);
                e3Var.e.setVisibility(8);
                e3Var.s = z10;
                e3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        e3 e3Var2 = (e3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = o41Var.s;
        h6 h6Var = e3Var2.b;
        View view2 = e3Var2.e;
        ImageView imageView = e3Var2.f;
        TLRPC.User c23 = np.u1(e3Var2.a).c2(Long.valueOf(connectedbotstarref.bot_id));
        b9 b9Var2 = new b9((h6) null);
        b9Var2.r(c23);
        e3Var2.c.f(c23, b9Var2);
        TextView textView = e3Var2.h;
        textView.setText(j6.m(p10.q(c23), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            iz izVar2 = new iz();
            int i11 = m6.lk;
            izVar2.f = m6.w0(i11, null);
            izVar2.r = i11;
            izVar2.s = null;
            izVar2.n = true;
            izVar2.w = j.J0(connectedbotstarref.commission_permille);
            if (izVar2.c != null) {
                izVar2.c = null;
                izVar2.a();
            }
            spannableStringBuilder2.setSpan(izVar2, 1, 2, 33);
        }
        int i12 = connectedbotstarref.duration_months;
        if (i12 == 0) {
            spannableStringBuilder2.append((CharSequence) hd.N0(2131748793, null));
        } else if (i12 < 12 || i12 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) hd.G(i12, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) hd.G(i12 / 12, "Years", new Object[0]));
        }
        e3Var2.n.setText(spannableStringBuilder2);
        e3Var2.r.setVisibility(z12 ? 0 : 8);
        e3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = m6.L(org.telegram.messenger.g0.L(9.665f), m6.w0(connectedbotstarref.revoked ? m6.nk : m6.lk, h6Var));
        p6 M = t6.M(connectedbotstarref.revoked ? m6.nk : m6.lk);
        view2.setBackground(L);
        t6.j(view2, L, M, null, h6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        e3Var2.s = z10;
        e3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new e3(i7, context, h6Var);
    }
}
