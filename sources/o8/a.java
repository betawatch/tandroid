package o8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends g0 {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ jf.a n;

    public a(jf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = aVar;
    }

    @Override // o8.g0
    public final void b() {
        c cVar = (c) this.n.b;
        cVar.n = (IInterface) cVar.i.a(this.h);
        f0 f0Var = cVar.b;
        int i10 = 0;
        f0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.n.asBinder().linkToDeath(cVar.k, 0);
        } catch (RemoteException e) {
            f0Var.a(e, "linkToDeath failed", new Object[0]);
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
