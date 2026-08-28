package c6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends a7.a implements d {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i9, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 10);
        this.b = i9;
        this.c = taskCompletionSource;
    }

    @Override // a7.a
    public final boolean F0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 1) {
            Status status = (Status) u6.a.a(parcel, Status.CREATOR);
            b6.a aVar = (b6.a) u6.a.a(parcel, b6.a.CREATOR);
            u6.a.b(parcel);
            z(status, aVar);
            return true;
        }
        if (i9 == 2) {
            Status status2 = (Status) u6.a.a(parcel, Status.CREATOR);
            b6.c cVar = (b6.c) u6.a.a(parcel, b6.c.CREATOR);
            u6.a.b(parcel);
            i(status2, cVar);
            return true;
        }
        if (i9 == 3) {
            u6.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i9 != 4) {
            return false;
        }
        u6.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // c6.d
    public void i(Status status, b6.c cVar) {
        switch (this.b) {
            case 1:
                h5.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // c6.d
    public void z(Status status, b6.a aVar) {
        switch (this.b) {
            case 0:
                h5.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
