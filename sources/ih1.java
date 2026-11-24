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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ih1 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ih1());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        Object obj = c6cVar.H;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                jh1 jh1Var = (jh1) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z2 = c6cVar.s;
                TLRPC.User W1 = oc7.r1(jh1Var.a).W1(Long.valueOf(starrefprogram.bot_id));
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.q(W1);
                jh1Var.c.f(W1, pc0Var);
                jh1Var.h.setText(m9c.r(W1));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    of4 of4Var = new of4();
                    int i = cmb.kk;
                    of4Var.f = cmb.v0(i, null);
                    of4Var.r = i;
                    of4Var.s = null;
                    of4Var.n = true;
                    of4Var.w = bc.J0(starrefprogram.commission_permille);
                    if (of4Var.c != null) {
                        of4Var.c = null;
                        of4Var.a();
                    }
                    spannableStringBuilder.setSpan(of4Var, 1, 2, 33);
                }
                int i2 = starrefprogram.duration_months;
                if (i2 == 0) {
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131748743, null));
                } else if (i2 < 12 || i2 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) jb6.G(i2, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) jb6.G(i2 / 12, "Years", new Object[0]));
                }
                jh1Var.n.setText(spannableStringBuilder);
                jh1Var.r.setVisibility(z2 ? 0 : 8);
                jh1Var.d.setVisibility(8);
                jh1Var.f.setVisibility(8);
                jh1Var.e.setVisibility(8);
                jh1Var.s = z;
                jh1Var.setWillNotDraw(!z);
                return;
            }
            return;
        }
        jh1 jh1Var2 = (jh1) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z3 = c6cVar.s;
        ylb ylbVar = jh1Var2.b;
        View view2 = jh1Var2.e;
        ImageView imageView = jh1Var2.f;
        TLRPC.User W12 = oc7.r1(jh1Var2.a).W1(Long.valueOf(connectedbotstarref.bot_id));
        pc0 pc0Var2 = new pc0((ylb) null);
        pc0Var2.q(W12);
        jh1Var2.c.f(W12, pc0Var2);
        TextView textView = jh1Var2.h;
        textView.setText(gw3.m(m9c.r(W12), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            of4 of4Var2 = new of4();
            int i3 = cmb.kk;
            of4Var2.f = cmb.v0(i3, null);
            of4Var2.r = i3;
            of4Var2.s = null;
            of4Var2.n = true;
            of4Var2.w = bc.J0(connectedbotstarref.commission_permille);
            if (of4Var2.c != null) {
                of4Var2.c = null;
                of4Var2.a();
            }
            spannableStringBuilder2.setSpan(of4Var2, 1, 2, 33);
        }
        int i4 = connectedbotstarref.duration_months;
        if (i4 == 0) {
            spannableStringBuilder2.append((CharSequence) jb6.M0(2131748743, null));
        } else if (i4 < 12 || i4 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) jb6.G(i4, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) jb6.G(i4 / 12, "Years", new Object[0]));
        }
        jh1Var2.n.setText(spannableStringBuilder2);
        jh1Var2.r.setVisibility(z3 ? 0 : 8);
        jh1Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable K = cmb.K(gm.L(9.665f), cmb.v0(connectedbotstarref.revoked ? cmb.mk : cmb.kk, ylbVar));
        wmb M = anb.M(connectedbotstarref.revoked ? cmb.mk : cmb.kk);
        view2.setBackground(K);
        anb.j(view2, K, M, null, ylbVar);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        jh1Var2.s = z;
        jh1Var2.setWillNotDraw(!z);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new jh1(i, ylbVar, context);
    }
}
