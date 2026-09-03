package l6;

import android.os.RemoteException;
import s5.m;
import v7.j;
import w7.g;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // l6.e
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // l6.e
    public final void b() {
        switch (this.a) {
            case 0:
                m mVar = this.b.a;
                mVar.getClass();
                try {
                    g gVar = (g) mVar.c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            default:
                m mVar2 = this.b.a;
                mVar2.getClass();
                try {
                    g gVar2 = (g) mVar2.c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new a7.b(e10);
                }
        }
    }
}
