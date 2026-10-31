package a6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                i7.f.b(parcel);
                throw new UnsupportedOperationException();
            case zs.n1 /* 102 */:
                Status status = (Status) i7.f.a(parcel, Status.CREATOR);
                i7.f.b(parcel);
                j0(status);
                break;
            case zs.o1 /* 103 */:
                Status status2 = (Status) i7.f.a(parcel, Status.CREATOR);
                i7.f.b(parcel);
                a0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // a6.j
    public void a0(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // a6.j
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
