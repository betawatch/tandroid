package l6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import s5.m;
import v7.j;
import w7.g;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements e {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j b;

    public c(j jVar, Bundle bundle) {
        this.b = jVar;
        this.a = bundle;
    }

    @Override // l6.e
    public final int a() {
        return 1;
    }

    @Override // l6.e
    public final void b() {
        m mVar = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) mVar.b;
        g gVar = (g) mVar.c;
        try {
            Bundle bundle2 = new Bundle();
            w7.d.b(bundle, bundle2);
            Parcel M0 = gVar.M0();
            g7.b.b(M0, bundle2);
            gVar.Q0(M0, 2);
            w7.d.b(bundle2, bundle);
            Parcel L0 = gVar.L0(gVar.M0(), 8);
            a J0 = b.J0(L0.readStrongBinder());
            L0.recycle();
            mVar.d = (View) b.K0(J0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) mVar.d);
        } catch (RemoteException e) {
            throw new a7.b(e);
        }
    }
}
