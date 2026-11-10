package hi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.hz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class m3 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new m3());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        Object obj = x31Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                n3 n3Var = (n3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z10 = x31Var.r;
                TLRPC.User a22 = qp.s1(n3Var.a).a2(Long.valueOf(starrefprogram.bot_id));
                v8 v8Var = new v8((h6) null);
                v8Var.r(a22);
                n3Var.c.e(a22, v8Var);
                n3Var.h.setText(t10.p(a22));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    hz hzVar = new hz();
                    int i7 = m6.ik;
                    hzVar.f = m6.w0(i7, null);
                    hzVar.r = i7;
                    hzVar.s = null;
                    hzVar.n = true;
                    hzVar.w = j.J0(starrefprogram.commission_permille);
                    if (hzVar.c != null) {
                        hzVar.c = null;
                        hzVar.a();
                    }
                    spannableStringBuilder.setSpan(hzVar, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) id.M0(2131748986, null));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) id.G(i10, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) id.G(i10 / 12, "Years", new Object[0]));
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
        boolean z11 = x31Var.r;
        h6 h6Var = n3Var2.b;
        View view2 = n3Var2.e;
        ImageView imageView = n3Var2.f;
        TLRPC.User a23 = qp.s1(n3Var2.a).a2(Long.valueOf(connectedbotstarref.bot_id));
        v8 v8Var2 = new v8((h6) null);
        v8Var2.r(a23);
        n3Var2.c.e(a23, v8Var2);
        TextView textView = n3Var2.h;
        textView.setText(i6.m(t10.p(a23), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            hz hzVar2 = new hz();
            int i11 = m6.ik;
            hzVar2.f = m6.w0(i11, null);
            hzVar2.r = i11;
            hzVar2.s = null;
            hzVar2.n = true;
            hzVar2.w = j.J0(connectedbotstarref.commission_permille);
            if (hzVar2.c != null) {
                hzVar2.c = null;
                hzVar2.a();
            }
            spannableStringBuilder2.setSpan(hzVar2, 1, 2, 33);
        }
        int i12 = connectedbotstarref.duration_months;
        if (i12 == 0) {
            spannableStringBuilder2.append((CharSequence) id.M0(2131748986, null));
        } else if (i12 < 12 || i12 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) id.G(i12, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) id.G(i12 / 12, "Years", new Object[0]));
        }
        n3Var2.n.setText(spannableStringBuilder2);
        n3Var2.r.setVisibility(z11 ? 0 : 8);
        n3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = m6.L(org.telegram.messenger.g0.L(9.665f), m6.w0(connectedbotstarref.revoked ? m6.kk : m6.ik, h6Var));
        p6 M = t6.M(connectedbotstarref.revoked ? m6.kk : m6.ik);
        view2.setBackground(L);
        t6.j(view2, L, M, null, h6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        n3Var2.s = z9;
        n3Var2.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new n3(i7, context, h6Var);
    }
}
