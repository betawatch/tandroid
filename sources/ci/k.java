package ci;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import v4.f1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k extends v4.i0 {
    public final /* synthetic */ h0 c;

    public k(h0 h0Var) {
        this.c = h0Var;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.s;
    }

    @Override // v4.i0
    public final int d(int i7) {
        h0 h0Var = this.c;
        o oVar = (o) h0Var.n.get(h0Var.f(i7));
        return (oVar.b == null || i7 != oVar.d) ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(f1 f1Var, int i7) {
        h0 h0Var = this.c;
        o oVar = (o) h0Var.n.get(h0Var.f(i7));
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            ((l) view).set((TLRPC.Document) oVar.c.get((i7 - oVar.d) - (oVar.b == null ? 0 : 1)));
            return;
        }
        n nVar = (n) view;
        String str = oVar.b;
        int i11 = (h0Var.x || oVar.a != 2) ? 0 : 1;
        TextView textView = nVar.b;
        TextView textView2 = nVar.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(nVar.c.y);
        textView.setVisibility(i11 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L = org.telegram.messenger.g0.L(15.0f) + (i11 != 0 ? org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        View lVar;
        h0 h0Var = this.c;
        if (i7 == 0) {
            lVar = new n(h0Var, viewGroup.getContext());
            lVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), h0Var.a);
            lVar.setLayoutParams(new v4.q0(-1, -2));
        }
        return new j(lVar);
    }
}
