package b9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends i0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ c n;

    public a(c cVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = cVar;
    }

    @Override // b9.i0
    public final void b() {
        d dVar = (d) this.n.b;
        dVar.n = (IInterface) dVar.i.a(this.h);
        h0 h0Var = dVar.b;
        int i10 = 0;
        h0Var.b("linkToDeath", new Object[0]);
        try {
            dVar.n.asBinder().linkToDeath(dVar.k, 0);
        } catch (RemoteException e) {
            h0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        dVar.g = false;
        ArrayList arrayList = dVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        dVar.d.clear();
    }
}
