package h6;

import android.os.RemoteException;
import r7.j;
import s7.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i9) {
        this.a = i9;
        this.b = jVar;
    }

    @Override // h6.e
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // h6.e
    public final void b() {
        switch (this.a) {
            case 0:
                j4.c cVar = this.b.a;
                cVar.getClass();
                try {
                    g gVar = (g) cVar.c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            default:
                j4.c cVar2 = this.b.a;
                cVar2.getClass();
                try {
                    g gVar2 = (g) cVar2.c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new androidx.car.app.j(e11);
                }
        }
    }
}
