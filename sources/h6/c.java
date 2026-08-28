package h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import r7.j;
import s7.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements e {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j b;

    public c(j jVar, Bundle bundle) {
        this.b = jVar;
        this.a = bundle;
    }

    @Override // h6.e
    public final int a() {
        return 1;
    }

    @Override // h6.e
    public final void b() {
        j4.c cVar = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) cVar.b;
        g gVar = (g) cVar.c;
        try {
            Bundle bundle2 = new Bundle();
            s7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            c7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            s7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            cVar.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) cVar.d);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
