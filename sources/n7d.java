// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n7d extends e1d {
    public final /* synthetic */ byte b;
    public final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7d(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 14);
        this.b = b;
        this.c = taskCompletionSource;
    }

    @Override // e1d
    public final void Q(Status status, boolean z) {
        switch (this.b) {
            case 1:
                fxe.a(status, Boolean.valueOf(z), this.c);
                break;
        }
    }

    @Override // e1d
    public final void R(Status status, q08 q08Var) {
        switch (this.b) {
            case 0:
                int i = l80.b;
                boolean b = status.b();
                TaskCompletionSource taskCompletionSource = this.c;
                if (!b) {
                    taskCompletionSource.setException(dod.a(status));
                    break;
                } else {
                    taskCompletionSource.setResult(q08Var);
                    break;
                }
        }
    }

    @Override // e1d
    public final void S(int i, boolean z) {
        switch (this.b) {
            case 1:
                fxe.a(new Status(i, null, null, null), Boolean.valueOf(z), this.c);
                break;
        }
    }
}
