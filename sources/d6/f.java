package d6;

import a8.q;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends q implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 7);
        this.b = i7;
        this.c = gVar;
    }

    @Override // a8.q
    public final boolean J0(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 101:
                l7.f.b(parcel);
                throw new UnsupportedOperationException();
            case qs.n1 /* 102 */:
                Status status = (Status) l7.f.a(parcel, Status.CREATOR);
                l7.f.b(parcel);
                d0(status);
                break;
            case qs.o1 /* 103 */:
                Status status2 = (Status) l7.f.a(parcel, Status.CREATOR);
                l7.f.b(parcel);
                V(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // d6.j
    public void V(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // d6.j
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
