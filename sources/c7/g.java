package c7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends b7.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 1);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 1);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // b7.a
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    Status status = (Status) e.a(parcel, Status.CREATOR);
                    Location location = (Location) e.a(parcel, Location.CREATOR);
                    e.b(parcel);
                    g5.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    r7.g gVar = (r7.g) e.a(parcel, r7.g.CREATOR);
                    e.b(parcel);
                    Status status2 = gVar.a;
                    r7.f fVar = new r7.f();
                    fVar.a = gVar;
                    g5.a(status2, fVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
