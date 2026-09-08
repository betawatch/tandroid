package g6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q extends b8.b implements e {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // b8.b
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.v.b(parcel);
        k0(bundle);
        return true;
    }

    @Override // g6.e
    public final void k0(Bundle bundle) {
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
