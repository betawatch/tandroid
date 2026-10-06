package n7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class n1 implements IInterface {
    public final IBinder a;
    public final String b;

    public n1(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
