// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l5d extends dzc {
    public final /* synthetic */ byte b;
    public final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5d(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 14);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override // dzc
    public final void Q(Status status, boolean z) {
        switch (this.b) {
            case 1:
                dve.a(status, Boolean.valueOf(z), this.c);
                break;
        }
    }

    @Override // dzc
    public final void R(Status status, oy7 oy7Var) {
        switch (this.b) {
            case 0:
                int i = l70.b;
                boolean b = status.b();
                TaskCompletionSource taskCompletionSource = this.c;
                if (!b) {
                    taskCompletionSource.setException(bmd.a(status));
                    break;
                } else {
                    taskCompletionSource.setResult(oy7Var);
                    break;
                }
        }
    }

    @Override // dzc
    public final void S(int i, boolean z) {
        switch (this.b) {
            case 1:
                dve.a(new Status(i, null, null, null), Boolean.valueOf(z), this.c);
                break;
        }
    }
}
