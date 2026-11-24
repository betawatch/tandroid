// default package

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class l7f implements IInterface {
    public final IBinder a;

    public l7f(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
