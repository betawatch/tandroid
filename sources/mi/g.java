package mi;

import ai.o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import v4.p0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class g extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new g());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        h hVar = (h) view;
        f fVar = (f) b41Var.G;
        TLRPC.User user = fVar.b;
        long j3 = fVar.a;
        e eVar = (e) b41Var.H;
        boolean z11 = fVar.c;
        boolean z12 = !b41Var.j;
        i9 i9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.F = eVar;
        hVar.G = j3;
        hVar.H = user.id;
        int i7 = hVar.b;
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
        hVar.f.setText(m5.l(m10.t0, j3));
        hVar.h.setText(g0.Q2(hd.a0(null, null, a22 != null ? 2131751898 : t3.V(M0) ? 2131751897 : 2131751896, m5.u(user)), j6.Zl, null, new o(21), false));
        if (a22 != null) {
            textView2.setVisibility(8);
        } else if (M0 == null || M0.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            long j10 = M0.participants_count;
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
        if (a22 != null) {
            i9Var.f(a22, new t8(0, a22));
        } else {
            i9Var.f(M0, new t8(M0));
        }
        hVar.e.f(user, new t8(0, user));
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        h hVar = new h(i7, context, e6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        f fVar = (f) b41Var.G;
        f fVar2 = (f) b41Var2.G;
        return fVar.a == fVar2.a && m5.d(fVar.b) == m5.d(fVar2.b);
    }
}
