// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hsd extends d05 {
    public final vla F;
    public final vla G;
    public final vla H;

    public hsd(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(23, k05Var, l05Var, oxbVar, context, looper);
        this.F = new vla(0);
        this.G = new vla(0);
        this.H = new vla(0);
    }

    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof q7f ? (q7f) queryLocalInterface : new q7f(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", (byte) 5);
    }

    @Override // hg0
    public final a94[] f() {
        return cpd.a;
    }

    @Override // hg0
    public final int i() {
        return 11717000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // hg0
    public final void t(int i) {
        super.t(i);
        synchronized (this.F) {
            this.F.clear();
        }
        synchronized (this.G) {
            this.G.clear();
        }
        synchronized (this.H) {
            this.H.clear();
        }
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
