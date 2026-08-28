package k5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends a7.a implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i9) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 9);
        this.b = i9;
        this.c = gVar;
    }

    @Override // a7.a
    public final boolean G0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 101:
                s6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) s6.f.a(parcel, Status.CREATOR);
                s6.f.b(parcel);
                e0(status);
                break;
            case 103:
                Status status2 = (Status) s6.f.a(parcel, Status.CREATOR);
                s6.f.b(parcel);
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
    public void e0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
