// default package

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hkd extends dzc {
    public final /* synthetic */ byte b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkd(TaskCompletionSource taskCompletionSource, byte b) {
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

    @Override // dzc
    public final boolean e(Parcel parcel, int i) {
        byte b = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        switch (b) {
            case 0:
                if (i == 1) {
                    Status status = (Status) rgd.a(parcel, Status.CREATOR);
                    Location location = (Location) rgd.a(parcel, Location.CREATOR);
                    rgd.b(parcel);
                    dve.a(status, location, taskCompletionSource);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    lb6 lb6Var = (lb6) rgd.a(parcel, lb6.CREATOR);
                    rgd.b(parcel);
                    Status status2 = lb6Var.a;
                    kb6 kb6Var = new kb6();
                    kb6Var.a = lb6Var;
                    dve.a(status2, kb6Var, taskCompletionSource);
                    break;
                }
                break;
        }
        return true;
    }
}
