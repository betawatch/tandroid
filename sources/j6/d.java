package j6;

import android.os.RemoteException;
import l3.g0;
import t7.j;
import u7.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // j6.e
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // j6.e
    public final void b() {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b.a;
                g0Var.getClass();
                try {
                    g gVar = (g) g0Var.c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e10) {
                    throw new a6.b(e10);
                }
            default:
                g0 g0Var2 = this.b.a;
                g0Var2.getClass();
                try {
                    g gVar2 = (g) g0Var2.c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new a6.b(e11);
                }
        }
    }
}
