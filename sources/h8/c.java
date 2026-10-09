package h8;

import ae.x;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import n6.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c {
    public final i8.f a;
    public h b;

    public c(i8.f fVar) {
        new HashMap();
        l.h(fVar);
        this.a = fVar;
    }

    public final void a(int i10) {
        try {
            i8.f fVar = this.a;
            Parcel N0 = fVar.N0();
            N0.writeInt(i10);
            fVar.R0(N0, 16);
        } catch (RemoteException e7) {
            throw new x(e7);
        }
    }
}
