package ai;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p extends s4.h0 {
    public final /* synthetic */ x0 c;

    public p(x0 x0Var) {
        this.c = x0Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.s;
    }

    @Override // s4.h0
    public final int j(int i10) {
        x0 x0Var = this.c;
        u uVar = (u) x0Var.n.get(x0Var.f(i10));
        return (uVar.b == null || i10 != uVar.d) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        x0 x0Var = this.c;
        u uVar = (u) x0Var.n.get(x0Var.f(i10));
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            ((q) view).set((TLRPC.Document) uVar.c.get((i10 - uVar.d) - (uVar.b == null ? 0 : 1)));
            return;
        }
        t tVar = (t) view;
        String str = uVar.b;
        int i12 = (x0Var.w || uVar.a != 2) ? 0 : 1;
        TextView textView = tVar.b;
        TextView textView2 = tVar.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(tVar.c.x);
        textView.setVisibility(i12 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int dp = AndroidUtilities.dp(15.0f) + (i12 != 0 ? AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != dp) {
            layoutParams.rightMargin = dp;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View qVar;
        x0 x0Var = this.c;
        if (i10 == 0) {
            qVar = new t(x0Var, viewGroup.getContext());
            qVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            qVar = new q(viewGroup.getContext(), x0Var.a);
            qVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new o(qVar);
    }
}
