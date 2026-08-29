package d7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends c7.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 4);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 4);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // c7.a
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    Status status = (Status) d.a(parcel, Status.CREATOR);
                    Location location = (Location) d.a(parcel, Location.CREATOR);
                    d.b(parcel);
                    o5.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    s7.g gVar = (s7.g) d.a(parcel, s7.g.CREATOR);
                    d.b(parcel);
                    Status status2 = gVar.a;
                    s7.f fVar = new s7.f();
                    fVar.a = gVar;
                    o5.a(status2, fVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
