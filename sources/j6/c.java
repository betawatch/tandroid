package j6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import l3.g0;
import t7.j;
import u7.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements e {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j b;

    public c(j jVar, Bundle bundle) {
        this.b = jVar;
        this.a = bundle;
    }

    @Override // j6.e
    public final int a() {
        return 1;
    }

    @Override // j6.e
    public final void b() {
        g0 g0Var = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) g0Var.b;
        g gVar = (g) g0Var.c;
        try {
            Bundle bundle2 = new Bundle();
            u7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            e7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            u7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            g0Var.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) g0Var.d);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }
}
