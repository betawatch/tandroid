// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gbd extends d05 {
    public final Context F;

    public gbd(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(45, k05Var, l05Var, oxbVar, context, looper);
        this.F = context;
    }

    @Override // hg0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof xge ? (xge) queryLocalInterface : new xge(iBinder);
    }

    @Override // hg0
    public final int i() {
        return 12200000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
