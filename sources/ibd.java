// default package

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ibd extends u3d {
    public static final he6 d = new he6("AppVisibilityProxy", null);
    public static final boolean e = true;
    public final Set b;
    public byte c;

    public ibd() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 4);
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.c = e ? (byte) 1 : (byte) 0;
    }

    @Override // u3d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            br7 br7Var = new br7(this);
            parcel2.writeNoException();
            ald.d(parcel2, br7Var);
            return true;
        }
        Set set = this.b;
        he6 he6Var = d;
        byte b = 0;
        if (i == 2) {
            Log.i(he6Var.a, he6Var.d("onAppEnteredForeground", new Object[0]));
            this.c = (byte) 1;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((hfd) it.next()).a.m();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        Log.i(he6Var.a, he6Var.d("onAppEnteredBackground", new Object[0]));
        this.c = (byte) 2;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            kfd kfdVar = ((hfd) it2.next()).a;
            kfd.f.b("Stopping RouteDiscovery.", new Object[0]);
            kfdVar.c.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                k7b k7bVar = kfdVar.e;
                lw6 lw6Var = (lw6) k7bVar.c;
                if (lw6Var == null) {
                    lw6Var = lw6.d((Context) k7bVar.b);
                    k7bVar.c = lw6Var;
                }
                lw6Var.h(kfdVar);
            } else {
                new b99(Looper.getMainLooper(), (byte) 3).post(new oed(kfdVar, b));
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
