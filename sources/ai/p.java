package ai;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p extends v4.g0 {
    public final /* synthetic */ q0 c;

    public p(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.s;
    }

    @Override // v4.g0
    public final int d(int i7) {
        q0 q0Var = this.c;
        t tVar = (t) q0Var.n.get(q0Var.f(i7));
        return (tVar.b == null || i7 != tVar.d) ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        q0 q0Var = this.c;
        t tVar = (t) q0Var.n.get(q0Var.f(i7));
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            ((q) view).set((TLRPC.Document) tVar.c.get((i7 - tVar.d) - (tVar.b == null ? 0 : 1)));
            return;
        }
        s sVar = (s) view;
        String str = tVar.b;
        int i11 = (q0Var.x || tVar.a != 2) ? 0 : 1;
        TextView textView = sVar.b;
        TextView textView2 = sVar.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(sVar.c.y);
        textView.setVisibility(i11 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L = org.telegram.messenger.g0.L(15.0f) + (i11 != 0 ? org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View qVar;
        q0 q0Var = this.c;
        if (i7 == 0) {
            qVar = new s(q0Var, viewGroup.getContext());
            qVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            qVar = new q(viewGroup.getContext(), q0Var.a);
            qVar.setLayoutParams(new v4.o0(-1, -2));
        }
        return new o(qVar);
    }
}
