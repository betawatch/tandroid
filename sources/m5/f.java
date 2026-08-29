package m5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends c7.a implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 9);
        this.b = i10;
        this.c = gVar;
    }

    @Override // c7.a
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                u6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) u6.f.a(parcel, Status.CREATOR);
                u6.f.b(parcel);
                d0(status);
                break;
            case 103:
                Status status2 = (Status) u6.f.a(parcel, Status.CREATOR);
                u6.f.b(parcel);
                V(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // m5.j
    public void V(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // m5.j
    public void d0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
