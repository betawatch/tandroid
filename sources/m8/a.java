package m8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends h0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ gf.a n;

    public a(gf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = aVar;
    }

    @Override // m8.h0
    public final void b() {
        c cVar = (c) this.n.b;
        cVar.n = (IInterface) cVar.i.a(this.h);
        g0 g0Var = cVar.b;
        int i10 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.n.asBinder().linkToDeath(cVar.k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
