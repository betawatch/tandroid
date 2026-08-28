package b7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ Object b;
    public final /* synthetic */ TaskCompletionSource c;

    public g(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void D(Status status) {
        h5.a(status, this.b, this.c);
    }
}
