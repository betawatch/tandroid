// default package

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jg1 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new jg1());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        Object obj = b8cVar.H;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                kg1 kg1Var = (kg1) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z2 = b8cVar.s;
                TLRPC.User X1 = uc7.s1(kg1Var.a).X1(Long.valueOf(starrefprogram.bot_id));
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.q(X1);
                kg1Var.c.f(X1, rb0Var);
                kg1Var.h.setText(lbc.r(X1));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    lf4 lf4Var = new lf4();
                    int i = aob.lk;
                    lf4Var.f = aob.v0(i, null);
                    lf4Var.r = i;
                    lf4Var.s = null;
                    lf4Var.n = true;
                    lf4Var.w = cc.J0(starrefprogram.commission_permille);
                    if (lf4Var.c != null) {
                        lf4Var.c = null;
                        lf4Var.a();
                    }
                    spannableStringBuilder.setSpan(lf4Var, 1, 2, 33);
                }
                int i2 = starrefprogram.duration_months;
                if (i2 == 0) {
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131748740, null));
                } else if (i2 < 12 || i2 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) ob6.G(i2, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) ob6.G(i2 / 12, "Years", new Object[0]));
                }
                kg1Var.n.setText(spannableStringBuilder);
                kg1Var.r.setVisibility(z2 ? 0 : 8);
                kg1Var.d.setVisibility(8);
                kg1Var.f.setVisibility(8);
                kg1Var.e.setVisibility(8);
                kg1Var.s = z;
                kg1Var.setWillNotDraw(!z);
                return;
            }
            return;
        }
        kg1 kg1Var2 = (kg1) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z3 = b8cVar.s;
        vnb vnbVar = kg1Var2.b;
        View view2 = kg1Var2.e;
        ImageView imageView = kg1Var2.f;
        TLRPC.User X12 = uc7.s1(kg1Var2.a).X1(Long.valueOf(connectedbotstarref.bot_id));
        rb0 rb0Var2 = new rb0((vnb) null);
        rb0Var2.q(X12);
        kg1Var2.c.f(X12, rb0Var2);
        TextView textView = kg1Var2.h;
        textView.setText(pv3.m(lbc.r(X12), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            lf4 lf4Var2 = new lf4();
            int i3 = aob.lk;
            lf4Var2.f = aob.v0(i3, null);
            lf4Var2.r = i3;
            lf4Var2.s = null;
            lf4Var2.n = true;
            lf4Var2.w = cc.J0(connectedbotstarref.commission_permille);
            if (lf4Var2.c != null) {
                lf4Var2.c = null;
                lf4Var2.a();
            }
            spannableStringBuilder2.setSpan(lf4Var2, 1, 2, 33);
        }
        int i4 = connectedbotstarref.duration_months;
        if (i4 == 0) {
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131748740, null));
        } else if (i4 < 12 || i4 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) ob6.G(i4, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) ob6.G(i4 / 12, "Years", new Object[0]));
        }
        kg1Var2.n.setText(spannableStringBuilder2);
        kg1Var2.r.setVisibility(z3 ? 0 : 8);
        kg1Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable K = aob.K(hl.L(9.665f), aob.v0(connectedbotstarref.revoked ? aob.nk : aob.lk, vnbVar));
        uob M = yob.M(connectedbotstarref.revoked ? aob.nk : aob.lk);
        view2.setBackground(K);
        yob.j(view2, K, M, null, vnbVar);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        kg1Var2.s = z;
        kg1Var2.setWillNotDraw(!z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new kg1(i, vnbVar, context);
    }
}
