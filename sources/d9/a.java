package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
