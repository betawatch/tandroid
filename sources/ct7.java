// default package

import java.util.List;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ct7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;

    public /* synthetic */ ct7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                zt7 zt7Var = wt7Var.T0;
                if (zt7Var != null) {
                    zt7Var.invalidate();
                    break;
                }
                break;
            case 1:
                new jh8((d) new hu0(wt7Var, (byte) 8), 14, true).show();
                break;
            case 2:
                zt7 zt7Var2 = wt7Var.T0;
                if (zt7Var2 != null) {
                    zt7Var2.invalidate();
                    break;
                }
                break;
            case 3:
                wt7Var.y0(false);
                break;
            default:
                boolean z = k38.e(wt7Var.v1).k;
                int i = 0;
                while (true) {
                    List list = l01.c;
                    if (i >= list.size()) {
                        break;
                    } else {
                        l01 l01Var = (l01) list.get(i);
                        int l = z ? l01Var.l() : l01Var.d();
                        String m = l01Var.m();
                        j45 j45Var = new j45(wt7Var, l01Var, l, (byte) 19);
                        ut7 ut7Var = new ut7(wt7Var, wt7Var.getContext());
                        ut7Var.setIcon(l);
                        ut7Var.setText(m);
                        ut7Var.setSelected(false);
                        ut7Var.setOnClickListener(new fr7(j45Var, (byte) 1));
                        ut7Var.setOnLongClickListener(new zs(wt7Var, (byte) 6));
                        wt7Var.y1.a(ut7Var, nme.o(-1, 48));
                        i++;
                    }
                }
        }
    }
}
