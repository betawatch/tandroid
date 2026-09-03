package f7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
