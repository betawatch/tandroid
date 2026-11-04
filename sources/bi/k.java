package bi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k extends u4.h0 {
    public final /* synthetic */ h0 c;

    public k(h0 h0Var) {
        this.c = h0Var;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.s;
    }

    @Override // u4.h0
    public final int d(int i3) {
        h0 h0Var = this.c;
        o oVar = (o) h0Var.n.get(h0Var.f(i3));
        return (oVar.b == null || i3 != oVar.d) ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        h0 h0Var = this.c;
        o oVar = (o) h0Var.n.get(h0Var.f(i3));
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            ((l) view).set((TLRPC.Document) oVar.c.get((i3 - oVar.d) - (oVar.b == null ? 0 : 1)));
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

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View lVar;
        h0 h0Var = this.c;
        if (i3 == 0) {
            lVar = new n(h0Var, viewGroup.getContext());
            lVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), h0Var.a);
            lVar.setLayoutParams(new u4.p0(-1, -2));
        }
        return new j(lVar);
    }
}
