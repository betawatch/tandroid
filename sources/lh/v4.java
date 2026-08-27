package lh;

import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ v4(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zf.w1 w1Var = this.b.Z0;
                if (w1Var != null) {
                    w1Var.invalidate();
                    break;
                }
                break;
            case 1:
                new ag.g2((org.telegram.ui.ActionBar.n2) new ag.r2(this.b, 7), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                f6 f6Var = this.b;
                boolean z10 = yf.r0.e(f6Var.B1).k;
                int i10 = 0;
                while (true) {
                    List list = yf.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        yf.l lVar = (yf.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        d5.i iVar = new d5.i(f6Var, lVar, m10, 13);
                        c6 c6Var = new c6(f6Var, f6Var.getContext());
                        c6Var.setIcon(m10);
                        c6Var.setText(n10);
                        c6Var.setSelected(false);
                        int i11 = 0;
                        c6Var.setOnClickListener(new c5(iVar, i11));
                        c6Var.setOnLongClickListener(new b5(f6Var, i11));
                        f6Var.E1.a(c6Var, h7.z5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
