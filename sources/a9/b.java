package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class b extends k0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ d n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = dVar;
    }

    @Override // a9.k0
    public final void b() {
        e eVar = (e) this.n.b;
        eVar.n = (IInterface) eVar.i.a(this.h);
        j0 j0Var = eVar.b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.n.asBinder().linkToDeath(eVar.k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.g = false;
        ArrayList arrayList = eVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        eVar.d.clear();
    }
}
