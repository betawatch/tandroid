// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fzc extends s0d {
    public final /* synthetic */ IBinder h;
    public final /* synthetic */ b5a n;

    public fzc(b5a b5aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = b5aVar;
    }

    @Override // s0d
    public final void b() {
        hzc hzcVar = (hzc) this.n.b;
        hzcVar.n = (IInterface) hzcVar.i.a(this.h);
        q0d q0dVar = hzcVar.b;
        int i = 0;
        q0dVar.b("linkToDeath", new Object[0]);
        try {
            hzcVar.n.asBinder().linkToDeath(hzcVar.k, 0);
        } catch (RemoteException e) {
            q0dVar.a(e, "linkToDeath failed", new Object[0]);
        }
        hzcVar.g = false;
        ArrayList arrayList = hzcVar.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        hzcVar.d.clear();
    }
}
