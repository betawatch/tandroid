package i6;

import android.os.RemoteException;
import s7.j;
import t7.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // i6.e
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // i6.e
    public final void b() {
        switch (this.a) {
            case 0:
                j9.a aVar = this.b.a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            default:
                j9.a aVar2 = this.b.a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new a7.c(e10);
                }
        }
    }
}
