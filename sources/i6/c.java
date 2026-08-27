package i6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import s7.j;
import t7.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements e {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j b;

    public c(j jVar, Bundle bundle) {
        this.b = jVar;
        this.a = bundle;
    }

    @Override // i6.e
    public final int a() {
        return 1;
    }

    @Override // i6.e
    public final void b() {
        j9.a aVar = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) aVar.b;
        g gVar = (g) aVar.c;
        try {
            Bundle bundle2 = new Bundle();
            t7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            d7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            t7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            aVar.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) aVar.d);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
