package k5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends b7.a implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 9);
        this.b = i10;
        this.c = gVar;
    }

    @Override // b7.a
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                t6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) t6.f.a(parcel, Status.CREATOR);
                t6.f.b(parcel);
                i0(status);
                break;
            case 103:
                Status status2 = (Status) t6.f.a(parcel, Status.CREATOR);
                t6.f.b(parcel);
                W(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // k5.j
    public void W(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // k5.j
    public void i0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
