package o5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends a7.c implements j {
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 10);
        this.b = i10;
        this.c = gVar;
    }

    @Override // a7.c
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                w6.f.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) w6.f.a(parcel, Status.CREATOR);
                w6.f.b(parcel);
                f0(status);
                break;
            case 103:
                Status status2 = (Status) w6.f.a(parcel, Status.CREATOR);
                w6.f.b(parcel);
                X(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // o5.j
    public void X(Status status) {
        switch (this.b) {
            case 1:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // o5.j
    public void f0(Status status) {
        switch (this.b) {
            case 0:
                this.c.a(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
