package c6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends o implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i3) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.b = i3;
        this.c = gVar;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean J0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 101:
                k7.f.b(parcel);
                throw new UnsupportedOperationException();
            case hs.n1 /* 102 */:
                Status status = (Status) k7.f.a(parcel, Status.CREATOR);
                k7.f.b(parcel);
                j0(status);
                break;
            case hs.o1 /* 103 */:
                Status status2 = (Status) k7.f.a(parcel, Status.CREATOR);
                k7.f.b(parcel);
                W(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // c6.j
    public void W(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // c6.j
    public void j0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
