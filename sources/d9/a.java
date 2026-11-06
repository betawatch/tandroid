package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends h0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ ag.a n;

    public a(ag.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = aVar;
    }

    @Override // d9.h0
    public final void b() {
        c cVar = (c) this.n.b;
        cVar.n = (IInterface) cVar.i.a(this.h);
        g0 g0Var = cVar.b;
        int i7 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.n.asBinder().linkToDeath(cVar.k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
