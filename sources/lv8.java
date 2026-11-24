// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lv8 extends w39 {
    public final /* synthetic */ ew8 c;

    public lv8(ew8 ew8Var) {
        this.c = ew8Var;
    }

    @Override // w39
    public final int b() {
        return this.c.s;
    }

    @Override // w39
    public final int d(int i) {
        ew8 ew8Var = this.c;
        pv8 pv8Var = (pv8) ew8Var.n.get(ew8Var.f(i));
        return (pv8Var.b == null || i != pv8Var.d) ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ew8 ew8Var = this.c;
        pv8 pv8Var = (pv8) ew8Var.n.get(ew8Var.f(i));
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            ((mv8) view).set((TLRPC.Document) pv8Var.c.get((i - pv8Var.d) - (pv8Var.b == null ? 0 : 1)));
            return;
        }
        ov8 ov8Var = (ov8) view;
        String str = pv8Var.b;
        int i3 = (ew8Var.x || pv8Var.a != 2) ? 0 : 1;
        TextView textView = ov8Var.b;
        TextView textView2 = ov8Var.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(ov8Var.c.y);
        textView.setVisibility(i3 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L = gl.L(15.0f) + (i3 != 0 ? gl.L(6.0f) + gl.L(20.0f) + gl.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View mv8Var;
        ew8 ew8Var = this.c;
        if (i == 0) {
            mv8Var = new ov8(ew8Var, viewGroup.getContext());
            mv8Var.setLayoutParams(new e49(-1, gl.L(44.0f)));
        } else {
            mv8Var = new mv8(viewGroup.getContext(), ew8Var.a);
            mv8Var.setLayoutParams(new e49(-1, -2));
        }
        return new kv8(mv8Var);
    }
}
