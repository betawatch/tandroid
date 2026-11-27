// default package

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class aaf implements IInterface {
    public final IBinder a;

    public aaf(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
