package f7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.api.internal.i {
    public final /* synthetic */ Object b;
    public final /* synthetic */ TaskCompletionSource c;

    public f(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void z(Status status) {
        r5.a(status, this.b, this.c);
    }
}
