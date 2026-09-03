package f7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends a7.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // a7.c
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    Status status = (Status) e.a(parcel, Status.CREATOR);
                    Location location = (Location) e.a(parcel, Location.CREATOR);
                    e.b(parcel);
                    r5.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    u7.g gVar = (u7.g) e.a(parcel, u7.g.CREATOR);
                    e.b(parcel);
                    Status status2 = gVar.a;
                    u7.f fVar = new u7.f();
                    fVar.a = gVar;
                    r5.a(status2, fVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
