// default package

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jmd extends e1d {
    public final /* synthetic */ byte b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmd(TaskCompletionSource taskCompletionSource, byte b) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", (byte) 8);
        this.b = b;
        switch (b) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", (byte) 8);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // e1d
    public final boolean e(Parcel parcel, int i) {
        byte b = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        switch (b) {
            case 0:
                if (i == 1) {
                    Status status = (Status) sid.a(parcel, Status.CREATOR);
                    Location location = (Location) sid.a(parcel, Location.CREATOR);
                    sid.b(parcel);
                    fxe.a(status, location, taskCompletionSource);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    kd6 kd6Var = (kd6) sid.a(parcel, kd6.CREATOR);
                    sid.b(parcel);
                    Status status2 = kd6Var.a;
                    jd6 jd6Var = new jd6();
                    jd6Var.a = kd6Var;
                    fxe.a(status2, jd6Var, taskCompletionSource);
                    break;
                }
                break;
        }
        return true;
    }
}
