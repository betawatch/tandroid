package k8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends h0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ df.a n;

    public a(df.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = aVar;
    }

    @Override // k8.h0
    public final void b() {
        c cVar = (c) this.n.b;
        cVar.n = (IInterface) cVar.i.a(this.h);
        g0 g0Var = cVar.b;
        int i9 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.n.asBinder().linkToDeath(cVar.k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
