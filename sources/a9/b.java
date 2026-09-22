package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
