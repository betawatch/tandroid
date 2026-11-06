package j6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q extends a8.q implements e {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.b = i7;
        this.c = taskCompletionSource;
    }

    @Override // a8.q
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.t.b(parcel);
        h0(bundle);
        return true;
    }

    @Override // j6.e
    public final void h0(Bundle bundle) {
        switch (this.b) {
            case 0:
                this.c.setResult(bundle);
                break;
            case 1:
                this.c.setResult(bundle);
                break;
            default:
                this.c.setResult(bundle);
                break;
        }
    }
}
