// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mx8 extends y59 {
    public final /* synthetic */ gy8 c;

    public mx8(gy8 gy8Var) {
        this.c = gy8Var;
    }

    @Override // y59
    public final int b() {
        return this.c.s;
    }

    @Override // y59
    public final int d(int i) {
        gy8 gy8Var = this.c;
        qx8 qx8Var = (qx8) gy8Var.n.get(gy8Var.f(i));
        return (qx8Var.b == null || i != qx8Var.d) ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        gy8 gy8Var = this.c;
        qx8 qx8Var = (qx8) gy8Var.n.get(gy8Var.f(i));
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            ((nx8) view).set((TLRPC.Document) qx8Var.c.get((i - qx8Var.d) - (qx8Var.b == null ? 0 : 1)));
            return;
        }
        px8 px8Var = (px8) view;
        String str = qx8Var.b;
        int i3 = (gy8Var.x || qx8Var.a != 2) ? 0 : 1;
        TextView textView = px8Var.b;
        TextView textView2 = px8Var.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(px8Var.c.y);
        textView.setVisibility(i3 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L = gm.L(15.0f) + (i3 != 0 ? gm.L(6.0f) + gm.L(20.0f) + gm.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View nx8Var;
        gy8 gy8Var = this.c;
        if (i == 0) {
            nx8Var = new px8(gy8Var, viewGroup.getContext());
            nx8Var.setLayoutParams(new g69(-1, gm.L(44.0f)));
        } else {
            nx8Var = new nx8(viewGroup.getContext(), gy8Var.a);
            nx8Var.setLayoutParams(new g69(-1, -2));
        }
        return new lx8(nx8Var);
    }
}
