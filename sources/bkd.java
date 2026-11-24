// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
