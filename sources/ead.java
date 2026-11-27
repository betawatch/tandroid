// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ead extends u3d {
    public final /* synthetic */ byte b;
    public final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ead(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 14);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override // u3d
    public final void Q(Status status, boolean z) {
        switch (this.b) {
            case 1:
                vze.a(status, Boolean.valueOf(z), this.c);
                break;
        }
    }

    @Override // u3d
    public final void R(Status status, u18 u18Var) {
        switch (this.b) {
            case 0:
                int i = n70.b;
                boolean b = status.b();
                TaskCompletionSource taskCompletionSource = this.c;
                if (!b) {
                    taskCompletionSource.setException(sqd.a(status));
                    break;
                } else {
                    taskCompletionSource.setResult(u18Var);
                    break;
                }
        }
    }

    @Override // u3d
    public final void S(int i, boolean z) {
        switch (this.b) {
            case 1:
                vze.a(new Status(i, null, null, null), Boolean.valueOf(z), this.c);
                break;
        }
    }
}
