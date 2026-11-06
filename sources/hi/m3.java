package hi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.w8;
import org.telegram.ui.ez;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class m3 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new m3());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        Object obj = r31Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                n3 n3Var = (n3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z10 = r31Var.r;
                TLRPC.User a22 = qp.s1(n3Var.a).a2(Long.valueOf(starrefprogram.bot_id));
                w8 w8Var = new w8((f6) null);
                w8Var.r(a22);
                n3Var.c.e(a22, w8Var);
                n3Var.h.setText(t10.p(a22));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    ez ezVar = new ez();
                    int i7 = k6.ik;
                    ezVar.f = k6.w0(i7, null);
                    ezVar.r = i7;
                    ezVar.s = null;
                    ezVar.n = true;
                    ezVar.w = j.J0(starrefprogram.commission_permille);
                    if (ezVar.c != null) {
                        ezVar.c = null;
                        ezVar.a();
                    }
                    spannableStringBuilder.setSpan(ezVar, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) hd.M0(2131748985, null));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) hd.G(i10, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) hd.G(i10 / 12, "Years", new Object[0]));
                }
                n3Var.n.setText(spannableStringBuilder);
                n3Var.r.setVisibility(z10 ? 0 : 8);
                n3Var.d.setVisibility(8);
                n3Var.f.setVisibility(8);
                n3Var.e.setVisibility(8);
                n3Var.s = z9;
                n3Var.setWillNotDraw(!z9);
                return;
            }
            return;
        }
        n3 n3Var2 = (n3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z11 = r31Var.r;
        f6 f6Var = n3Var2.b;
        View view2 = n3Var2.e;
        ImageView imageView = n3Var2.f;
        TLRPC.User a23 = qp.s1(n3Var2.a).a2(Long.valueOf(connectedbotstarref.bot_id));
        w8 w8Var2 = new w8((f6) null);
        w8Var2.r(a23);
        n3Var2.c.e(a23, w8Var2);
        TextView textView = n3Var2.h;
        textView.setText(i6.m(t10.p(a23), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            ez ezVar2 = new ez();
            int i11 = k6.ik;
            ezVar2.f = k6.w0(i11, null);
            ezVar2.r = i11;
            ezVar2.s = null;
            ezVar2.n = true;
            ezVar2.w = j.J0(connectedbotstarref.commission_permille);
            if (ezVar2.c != null) {
                ezVar2.c = null;
                ezVar2.a();
            }
            spannableStringBuilder2.setSpan(ezVar2, 1, 2, 33);
        }
        int i12 = connectedbotstarref.duration_months;
        if (i12 == 0) {
            spannableStringBuilder2.append((CharSequence) hd.M0(2131748985, null));
        } else if (i12 < 12 || i12 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) hd.G(i12, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) hd.G(i12 / 12, "Years", new Object[0]));
        }
        n3Var2.n.setText(spannableStringBuilder2);
        n3Var2.r.setVisibility(z11 ? 0 : 8);
        n3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = k6.L(org.telegram.messenger.g0.L(9.665f), k6.w0(connectedbotstarref.revoked ? k6.kk : k6.ik, f6Var));
        n6 N = r6.N(connectedbotstarref.revoked ? k6.kk : k6.ik);
        view2.setBackground(L);
        r6.k(view2, L, N, null, f6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        n3Var2.s = z9;
        n3Var2.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new n3(i7, context, f6Var);
    }
}
