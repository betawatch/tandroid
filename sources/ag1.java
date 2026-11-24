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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ag1 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new ag1());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        Object obj = c4cVar.H;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                bg1 bg1Var = (bg1) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z2 = c4cVar.s;
                TLRPC.User V1 = na7.q1(bg1Var.a).V1(Long.valueOf(starrefprogram.bot_id));
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.q(V1);
                bg1Var.c.f(V1, pb0Var);
                bg1Var.h.setText(l7c.r(V1));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    nd4 nd4Var = new nd4();
                    int i = bkb.kk;
                    nd4Var.f = bkb.v0(i, null);
                    nd4Var.r = i;
                    nd4Var.s = null;
                    nd4Var.n = true;
                    nd4Var.w = bc.I0(starrefprogram.commission_permille);
                    if (nd4Var.c != null) {
                        nd4Var.c = null;
                        nd4Var.a();
                    }
                    spannableStringBuilder.setSpan(nd4Var, 1, 2, 33);
                }
                int i2 = starrefprogram.duration_months;
                if (i2 == 0) {
                    spannableStringBuilder.append((CharSequence) k96.M0(2131748794, null));
                } else if (i2 < 12 || i2 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) k96.G(i2, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) k96.G(i2 / 12, "Years", new Object[0]));
                }
                bg1Var.n.setText(spannableStringBuilder);
                bg1Var.r.setVisibility(z2 ? 0 : 8);
                bg1Var.d.setVisibility(8);
                bg1Var.f.setVisibility(8);
                bg1Var.e.setVisibility(8);
                bg1Var.s = z;
                bg1Var.setWillNotDraw(!z);
                return;
            }
            return;
        }
        bg1 bg1Var2 = (bg1) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z3 = c4cVar.s;
        wjb wjbVar = bg1Var2.b;
        View view2 = bg1Var2.e;
        ImageView imageView = bg1Var2.f;
        TLRPC.User V12 = na7.q1(bg1Var2.a).V1(Long.valueOf(connectedbotstarref.bot_id));
        pb0 pb0Var2 = new pb0((wjb) null);
        pb0Var2.q(V12);
        bg1Var2.c.f(V12, pb0Var2);
        TextView textView = bg1Var2.h;
        textView.setText(vu3.m(l7c.r(V12), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            nd4 nd4Var2 = new nd4();
            int i3 = bkb.kk;
            nd4Var2.f = bkb.v0(i3, null);
            nd4Var2.r = i3;
            nd4Var2.s = null;
            nd4Var2.n = true;
            nd4Var2.w = bc.I0(connectedbotstarref.commission_permille);
            if (nd4Var2.c != null) {
                nd4Var2.c = null;
                nd4Var2.a();
            }
            spannableStringBuilder2.setSpan(nd4Var2, 1, 2, 33);
        }
        int i4 = connectedbotstarref.duration_months;
        if (i4 == 0) {
            spannableStringBuilder2.append((CharSequence) k96.M0(2131748794, null));
        } else if (i4 < 12 || i4 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) k96.G(i4, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) k96.G(i4 / 12, "Years", new Object[0]));
        }
        bg1Var2.n.setText(spannableStringBuilder2);
        bg1Var2.r.setVisibility(z3 ? 0 : 8);
        bg1Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable K = bkb.K(gl.L(9.665f), bkb.v0(connectedbotstarref.revoked ? bkb.mk : bkb.kk, wjbVar));
        vkb M = zkb.M(connectedbotstarref.revoked ? bkb.mk : bkb.kk);
        view2.setBackground(K);
        zkb.j(view2, K, M, null, wjbVar);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        bg1Var2.s = z;
        bg1Var2.setWillNotDraw(!z);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new bg1(i, wjbVar, context);
    }
}
