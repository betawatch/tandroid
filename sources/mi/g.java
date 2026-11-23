package mi;

import ai.n;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
import v4.q0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class g extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new g());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        h hVar = (h) view;
        f fVar = (f) o41Var.H;
        TLRPC.User user = fVar.b;
        long j3 = fVar.a;
        e eVar = (e) o41Var.I;
        boolean z11 = fVar.c;
        boolean z12 = !o41Var.j;
        q9 q9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.F = eVar;
        hVar.G = j3;
        hVar.H = user.id;
        int i7 = hVar.b;
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
        TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(j3));
        hVar.f.setText(n5.l(k10.t0, j3));
        hVar.h.setText(g0.Q2(hd.a0(null, null, c22 != null ? 2131751886 : v3.V(O0) ? 2131751885 : 2131751884, n5.u(user)), m6.Zl, null, new n(23), false));
        if (c22 != null) {
            textView2.setVisibility(8);
        } else if (O0 == null || O0.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            long j10 = O0.participants_count;
            spannableStringBuilder.append((CharSequence) (j10 < 1000000 ? hd.E(j10, ',') : g0.o0((int) j10, 1000000)));
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
            q9Var.f(c22, new b9(0, c22));
        } else {
            q9Var.f(O0, new b9(O0));
        }
        hVar.e.f(user, new b9(0, user));
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        h hVar = new h(i7, context, h6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        f fVar = (f) o41Var.H;
        f fVar2 = (f) o41Var2.H;
        return fVar.a == fVar2.a && n5.d(fVar.b) == n5.d(fVar2.b);
    }
}
