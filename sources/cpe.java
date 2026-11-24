// default package

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class cpe extends zz4 {
    @Override // hh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof l7f ? (l7f) queryLocalInterface : new l7f(iBinder);
    }

    @Override // hh0
    public final int i() {
        return 11925000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
