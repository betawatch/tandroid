package h8;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import n6.l;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
