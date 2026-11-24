// default package

import java.util.List;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;

    public /* synthetic */ dv7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                aw7 aw7Var = xv7Var.T0;
                if (aw7Var != null) {
                    aw7Var.invalidate();
                    break;
                }
                break;
            case 1:
                new kj8((d) new qv0(xv7Var, (byte) 8), 14, true).show();
                break;
            case 2:
                aw7 aw7Var2 = xv7Var.T0;
                if (aw7Var2 != null) {
                    aw7Var2.invalidate();
                    break;
                }
                break;
            case 3:
                xv7Var.y0(false);
                break;
            default:
                boolean z = m58.e(xv7Var.v1).k;
                int i = 0;
                while (true) {
                    List list = t11.c;
                    if (i >= list.size()) {
                        break;
                    } else {
                        t11 t11Var = (t11) list.get(i);
                        int l = z ? t11Var.l() : t11Var.d();
                        String m = t11Var.m();
                        h65 h65Var = new h65(xv7Var, t11Var, l, (byte) 19);
                        vv7 vv7Var = new vv7(xv7Var, xv7Var.getContext());
                        vv7Var.setIcon(l);
                        vv7Var.setText(m);
                        vv7Var.setSelected(false);
                        vv7Var.setOnClickListener(new m67(h65Var, (byte) 4));
                        vv7Var.setOnLongClickListener(new au(xv7Var, (byte) 6));
                        xv7Var.y1.a(vv7Var, qoe.o(-1, 48));
                        i++;
                    }
                }
        }
    }
}
