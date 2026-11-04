package k2;

import android.os.Bundle;
import org.telegram.messenger.e9;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ee0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements g2.p, g2.k, p.a, e9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x(int i3, boolean z10) {
        this.a = i3;
        this.b = z10;
    }

    @Override // p.a
    public ac a(fc fcVar) {
        return fcVar.k(this.b);
    }

    @Override // g2.k
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((o4.l1) obj).V(this.b);
                break;
            case 3:
                ((o4.l1) obj).o0(this.b);
                break;
            default:
                ((o4.l1) obj).x(this.b);
                break;
        }
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d2.c1) obj).y(this.b);
                break;
            default:
                ((d2.c1) obj).e(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        Bundle k10 = a1.g.k("afterSignup", this.b);
        ee0 ee0Var = new ee0();
        ee0Var.r0(k10);
        return ee0Var;
    }
}
