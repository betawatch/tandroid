package b7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends a7.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i9, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 1);
        this.b = i9;
        switch (i9) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 1);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // a7.a
    public final boolean I0(Parcel parcel, int i9) {
        switch (this.b) {
            case 0:
                if (i9 == 1) {
                    Status status = (Status) f.a(parcel, Status.CREATOR);
                    Location location = (Location) f.a(parcel, Location.CREATOR);
                    f.b(parcel);
                    h5.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i9 == 1) {
                    q7.g gVar = (q7.g) f.a(parcel, q7.g.CREATOR);
                    f.b(parcel);
                    Status status2 = gVar.a;
                    q7.f fVar = new q7.f();
                    fVar.a = gVar;
                    h5.a(status2, fVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
