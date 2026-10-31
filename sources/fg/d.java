package fg;

import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ d(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s6 s6Var = this.b;
        switch (i10) {
            case 0:
                zs.e().k(zs.t4, s6Var, Boolean.TRUE, null, -1);
                break;
            default:
                s6Var.s();
                break;
        }
    }
}
