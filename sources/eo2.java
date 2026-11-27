// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class eo2 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new eo2());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        fo2 fo2Var = (fo2) view;
        do2 do2Var = (do2) b8cVar.H;
        TLRPC.User user = do2Var.b;
        long j = do2Var.a;
        co2 co2Var = (co2) b8cVar.I;
        boolean z2 = do2Var.c;
        boolean z3 = !b8cVar.j;
        int i = fo2.I;
        TextView textView = fo2Var.d;
        fo2Var.F = co2Var;
        fo2Var.G = j;
        fo2Var.H = user.id;
        int i2 = fo2Var.b;
        TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
        fo2Var.f.setText(wf3.k(yac.t0, j));
        fo2Var.h.setText(hl.M2(ob6.a0(null, null, X1 != null ? 2131751863 : xc2.V(M0) ? 2131751862 : 2131751861, wf3.t(user)), aob.Zl, null, new kc((byte) 10), false));
        if (X1 != null) {
            textView.setVisibility(8);
        } else if (M0 == null || M0.participants_count <= 0) {
            textView.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(fo2Var.s, 0, 1, 33);
            long j2 = M0.participants_count;
            spannableStringBuilder.append((CharSequence) (j2 < 1000000 ? ob6.E(j2, ',') : hl.o0((int) j2, 1000000)));
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
        }
        TextView textView2 = fo2Var.n;
        if (z2) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        fo2Var.y = z3;
        de0 de0Var = fo2Var.c;
        if (X1 != null) {
            de0Var.f(X1, new rb0(0, X1));
        } else {
            de0Var.f(M0, new rb0(M0));
        }
        fo2Var.e.f(user, new rb0(0, user));
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        fo2 fo2Var = new fo2(i, vnbVar, context);
        fo2Var.setLayoutParams(new r79(-1, -2));
        fo2Var.setClickable(false);
        return fo2Var;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        do2 do2Var = (do2) b8cVar.H;
        do2 do2Var2 = (do2) b8cVar2.H;
        return do2Var.a == do2Var2.a && wf3.d(do2Var.b) == wf3.d(do2Var2.b);
    }
}
