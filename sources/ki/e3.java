package ki;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.iz;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e3 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new e3());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        Object obj = l41Var.H;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                f3 f3Var = (f3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = l41Var.s;
                TLRPC.User c22 = mp.u1(f3Var.a).c2(Long.valueOf(starrefprogram.bot_id));
                b9 b9Var = new b9((i6) null);
                b9Var.r(c22);
                f3Var.c.f(c22, b9Var);
                f3Var.h.setText(o10.q(c22));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    iz izVar = new iz();
                    int i7 = n6.lk;
                    izVar.f = n6.w0(i7, null);
                    izVar.r = i7;
                    izVar.s = null;
                    izVar.n = true;
                    izVar.w = k.J0(starrefprogram.commission_permille);
                    if (izVar.c != null) {
                        izVar.c = null;
                        izVar.a();
                    }
                    spannableStringBuilder.setSpan(izVar, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) gd.M0(2131748794, null));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) gd.G(i10, "Months", new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) gd.G(i10 / 12, "Years", new Object[0]));
                }
                f3Var.n.setText(spannableStringBuilder);
                f3Var.r.setVisibility(z11 ? 0 : 8);
                f3Var.d.setVisibility(8);
                f3Var.f.setVisibility(8);
                f3Var.e.setVisibility(8);
                f3Var.s = z10;
                f3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        f3 f3Var2 = (f3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = l41Var.s;
        i6 i6Var = f3Var2.b;
        View view2 = f3Var2.e;
        ImageView imageView = f3Var2.f;
        TLRPC.User c23 = mp.u1(f3Var2.a).c2(Long.valueOf(connectedbotstarref.bot_id));
        b9 b9Var2 = new b9((i6) null);
        b9Var2.r(c23);
        f3Var2.c.f(c23, b9Var2);
        TextView textView = f3Var2.h;
        textView.setText(j6.m(o10.q(c23), textView.getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            iz izVar2 = new iz();
            int i11 = n6.lk;
            izVar2.f = n6.w0(i11, null);
            izVar2.r = i11;
            izVar2.s = null;
            izVar2.n = true;
            izVar2.w = k.J0(connectedbotstarref.commission_permille);
            if (izVar2.c != null) {
                izVar2.c = null;
                izVar2.a();
            }
            spannableStringBuilder2.setSpan(izVar2, 1, 2, 33);
        }
        int i12 = connectedbotstarref.duration_months;
        if (i12 == 0) {
            spannableStringBuilder2.append((CharSequence) gd.M0(2131748794, null));
        } else if (i12 < 12 || i12 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) gd.G(i12, "Months", new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) gd.G(i12 / 12, "Years", new Object[0]));
        }
        f3Var2.n.setText(spannableStringBuilder2);
        f3Var2.r.setVisibility(z12 ? 0 : 8);
        f3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        ShapeDrawable L = n6.L(org.telegram.messenger.g0.L(9.665f), n6.w0(connectedbotstarref.revoked ? n6.nk : n6.lk, i6Var));
        q6 M = u6.M(connectedbotstarref.revoked ? n6.nk : n6.lk);
        view2.setBackground(L);
        u6.j(view2, L, M, null, i6Var);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        f3Var2.s = z10;
        f3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new f3(i7, context, i6Var);
    }
}
