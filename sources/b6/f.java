package b6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f extends c8.b implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.b = i10;
        this.c = gVar;
    }

    @Override // c8.b
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                j7.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) j7.f.a(parcel, Status.CREATOR);
                j7.f.b(parcel);
                g0(status);
                break;
            case 103:
                Status status2 = (Status) j7.f.a(parcel, Status.CREATOR);
                j7.f.b(parcel);
                X(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // b6.j
    public void X(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // b6.j
    public void g0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
