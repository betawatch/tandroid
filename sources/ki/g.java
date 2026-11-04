package ki;

import ai.y1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import u4.p0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new g());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        h hVar = (h) view;
        f fVar = (f) r31Var.G;
        TLRPC.User user = fVar.b;
        long j10 = fVar.a;
        e eVar = (e) r31Var.H;
        boolean z11 = fVar.c;
        boolean z12 = !r31Var.j;
        k9 k9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.F = eVar;
        hVar.G = j10;
        hVar.H = user.id;
        int i3 = hVar.b;
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
        hVar.f.setText(m5.l(h10.t0, j10));
        hVar.h.setText(g0.Q2(bd.a0(null, null, a22 != null ? 2131751898 : t3.V(M0) ? 2131751897 : 2131751896, m5.u(user)), k6.Wl, null, new y1(20), false));
        if (a22 != null) {
            textView2.setVisibility(8);
        } else if (M0 == null || M0.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            long j11 = M0.participants_count;
            spannableStringBuilder.append((CharSequence) (j11 < 1000000 ? bd.E(j11, ',') : g0.o0((int) j11, 1000000)));
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
            k9Var.e(a22, new u8(0, a22));
        } else {
            k9Var.e(M0, new u8(M0));
        }
        hVar.e.e(user, new u8(0, user));
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        h hVar = new h(i3, context, e6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        f fVar = (f) r31Var.G;
        f fVar2 = (f) r31Var2.G;
        return fVar.a == fVar2.a && m5.d(fVar.b) == m5.d(fVar2.b);
    }
}
