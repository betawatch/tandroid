// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g8d extends gl5 {
    public final /* synthetic */ TaskCompletionSource b;

    public g8d(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // gl5
    public final void T(Status status) {
        vze.a(status, null, this.b);
    }
}
