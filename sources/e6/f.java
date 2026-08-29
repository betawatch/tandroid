package e6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends c7.a implements d {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 10);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // c7.a
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) w6.a.a(parcel, Status.CREATOR);
            d6.a aVar = (d6.a) w6.a.a(parcel, d6.a.CREATOR);
            w6.a.b(parcel);
            f0(status, aVar);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) w6.a.a(parcel, Status.CREATOR);
            d6.c cVar = (d6.c) w6.a.a(parcel, d6.c.CREATOR);
            w6.a.b(parcel);
            u(status2, cVar);
            return true;
        }
        if (i10 == 3) {
            w6.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        w6.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // e6.d
    public void f0(Status status, d6.a aVar) {
        switch (this.b) {
            case 0:
                o5.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // e6.d
    public void u(Status status, d6.c cVar) {
        switch (this.b) {
            case 1:
                o5.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
