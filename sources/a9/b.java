package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b extends j0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ d n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = dVar;
    }

    @Override // a9.j0
    public final void b() {
        e eVar = (e) this.n.b;
        eVar.n = (IInterface) eVar.i.a(this.h);
        i0 i0Var = eVar.b;
        int i10 = 0;
        i0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.n.asBinder().linkToDeath(eVar.k, 0);
        } catch (RemoteException e7) {
            i0Var.a(e7, "linkToDeath failed", new Object[0]);
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
