package d6;

import a8.q;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    @Override // d6.j
    public void g0(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // a8.q
    public final boolean j1(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 101:
                l7.f.b(parcel);
                throw new UnsupportedOperationException();
            case ks.n1 /* 102 */:
                Status status = (Status) l7.f.a(parcel, Status.CREATOR);
                l7.f.b(parcel);
                r0(status);
                break;
            case ks.o1 /* 103 */:
                Status status2 = (Status) l7.f.a(parcel, Status.CREATOR);
                l7.f.b(parcel);
                g0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // d6.j
    public void r0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
