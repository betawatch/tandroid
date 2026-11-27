// default package

import java.util.List;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class iw7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx7 b;

    public /* synthetic */ iw7(dx7 dx7Var, byte b) {
        this.a = b;
        this.b = dx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                gx7 gx7Var = dx7Var.N0;
                if (gx7Var != null) {
                    gx7Var.invalidate();
                    break;
                }
                break;
            case 1:
                new xk8((e) new qu0(dx7Var, (byte) 8), 14, true).show();
                break;
            case 2:
                gx7 gx7Var2 = dx7Var.N0;
                if (gx7Var2 != null) {
                    gx7Var2.invalidate();
                    break;
                }
                break;
            case 3:
                dx7Var.y0(false);
                break;
            default:
                boolean z = a78.e(dx7Var.p1).k;
                int i = 0;
                while (true) {
                    List list = u01.c;
                    if (i >= list.size()) {
                        break;
                    } else {
                        u01 u01Var = (u01) list.get(i);
                        int l = z ? u01Var.l() : u01Var.d();
                        String m = u01Var.m();
                        l65 l65Var = new l65(dx7Var, u01Var, l, (byte) 20);
                        bx7 bx7Var = new bx7(dx7Var, dx7Var.getContext());
                        bx7Var.setIcon(l);
                        bx7Var.setText(m);
                        bx7Var.setSelected(false);
                        bx7Var.setOnClickListener(new am7(l65Var, (byte) 3));
                        bx7Var.setOnLongClickListener(new zs(dx7Var, (byte) 6));
                        dx7Var.s1.a(bx7Var, tre.o(-1, 48));
                        i++;
                    }
                }
        }
    }
}
