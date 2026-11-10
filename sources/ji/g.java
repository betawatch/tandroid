package ji;

import ai.m0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import v4.o0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class g extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new g());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        h hVar = (h) view;
        f fVar = (f) x31Var.G;
        TLRPC.User user = fVar.b;
        long j3 = fVar.a;
        e eVar = (e) x31Var.H;
        boolean z10 = fVar.c;
        boolean z11 = !x31Var.j;
        k9 k9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.E = eVar;
        hVar.F = j3;
        hVar.G = user.id;
        int i7 = hVar.b;
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
        hVar.f.setText(m5.l(p10.s0, j3));
        hVar.h.setText(g0.Q2(id.a0(null, null, a22 != null ? 2131751898 : t3.V(M0) ? 2131751897 : 2131751896, m5.u(user)), m6.Wl, null, new m0(16), false));
        if (a22 != null) {
            textView2.setVisibility(8);
        } else if (M0 == null || M0.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            long j10 = M0.participants_count;
            spannableStringBuilder.append((CharSequence) (j10 < 1000000 ? id.E(j10, ',') : g0.o0((int) j10, 1000000)));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.y = z11;
        if (a22 != null) {
            k9Var.e(a22, new v8(0, a22));
        } else {
            k9Var.e(M0, new v8(M0));
        }
        hVar.e.e(user, new v8(0, user));
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        h hVar = new h(i7, context, h6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        f fVar = (f) x31Var.G;
        f fVar2 = (f) x31Var2.G;
        return fVar.a == fVar2.a && m5.d(fVar.b) == m5.d(fVar2.b);
    }
}
