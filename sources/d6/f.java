package d6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends b7.a implements d {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 10);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // b7.a
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) v6.a.a(parcel, Status.CREATOR);
            c6.a aVar = (c6.a) v6.a.a(parcel, c6.a.CREATOR);
            v6.a.b(parcel);
            J(status, aVar);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) v6.a.a(parcel, Status.CREATOR);
            c6.c cVar = (c6.c) v6.a.a(parcel, c6.c.CREATOR);
            v6.a.b(parcel);
            d0(status2, cVar);
            return true;
        }
        if (i10 == 3) {
            v6.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        v6.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // d6.d
    public void J(Status status, c6.a aVar) {
        switch (this.b) {
            case 0:
                g5.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // d6.d
    public void d0(Status status, c6.c cVar) {
        switch (this.b) {
            case 1:
                g5.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
