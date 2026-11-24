// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bkd extends ej5 {
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public bkd(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.b = bool;
        this.c = taskCompletionSource;
    }

    @Override // ej5
    public final void T(Status status) {
        dve.a(status, this.b, this.c);
    }
}
