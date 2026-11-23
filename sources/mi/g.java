package mi;

import ai.k;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
import v4.q0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new g());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        h hVar = (h) view;
        f fVar = (f) n41Var.H;
        TLRPC.User user = fVar.b;
        long j3 = fVar.a;
        e eVar = (e) n41Var.I;
        boolean z11 = fVar.c;
        boolean z12 = !n41Var.j;
        p9 p9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.F = eVar;
        hVar.G = j3;
        hVar.H = user.id;
        int i7 = hVar.b;
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
        hVar.f.setText(n5.l(i10.t0, j3));
        hVar.h.setText(g0.Q2(gd.a0(null, null, c22 != null ? 2131751886 : v3.V(O0) ? 2131751885 : 2131751884, n5.u(user)), n6.Zl, null, new k(23), false));
        if (c22 != null) {
            textView2.setVisibility(8);
        } else if (O0 == null || O0.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            long j10 = O0.participants_count;
            spannableStringBuilder.append((CharSequence) (j10 < 1000000 ? gd.E(j10, ',') : g0.o0((int) j10, 1000000)));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.y = z12;
        if (c22 != null) {
            p9Var.f(c22, new a9(0, c22));
        } else {
            p9Var.f(O0, new a9(O0));
        }
        hVar.e.f(user, new a9(0, user));
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        h hVar = new h(i7, context, i6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        f fVar = (f) n41Var.H;
        f fVar2 = (f) n41Var2.H;
        return fVar.a == fVar2.a && n5.d(fVar.b) == n5.d(fVar2.b);
    }
}
