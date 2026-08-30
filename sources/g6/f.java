package g6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends a7.c implements d {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 11);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // a7.c
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) y6.a.a(parcel, Status.CREATOR);
            f6.a aVar = (f6.a) y6.a.a(parcel, f6.a.CREATOR);
            y6.a.b(parcel);
            Q(status, aVar);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) y6.a.a(parcel, Status.CREATOR);
            f6.c cVar = (f6.c) y6.a.a(parcel, f6.c.CREATOR);
            y6.a.b(parcel);
            S(status2, cVar);
            return true;
        }
        if (i10 == 3) {
            y6.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        y6.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // g6.d
    public void Q(Status status, f6.a aVar) {
        switch (this.b) {
            case 0:
                r5.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // g6.d
    public void S(Status status, f6.c cVar) {
        switch (this.b) {
            case 1:
                r5.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
