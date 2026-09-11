package a6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f extends b8.b implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.b = i10;
        this.c = gVar;
    }

    @Override // b8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                i7.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) i7.f.a(parcel, Status.CREATOR);
                i7.f.b(parcel);
                h0(status);
                break;
            case 103:
                Status status2 = (Status) i7.f.a(parcel, Status.CREATOR);
                i7.f.b(parcel);
                Z(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // a6.j
    public void Z(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // a6.j
    public void h0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
