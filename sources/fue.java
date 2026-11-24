// default package

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fue extends n8d {
    public final /* synthetic */ byte c;
    public final /* synthetic */ TaskCompletionSource d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fue(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override // n8d
    public final void U(Bundle bundle) {
        byte b = this.c;
        TaskCompletionSource taskCompletionSource = this.d;
        switch (b) {
            case 0:
                taskCompletionSource.setResult(bundle);
                break;
            case 1:
                taskCompletionSource.setResult(bundle);
                break;
            default:
                taskCompletionSource.setResult(bundle);
                break;
        }
    }
}
