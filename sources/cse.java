// default package

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cse extends l6d {
    public final /* synthetic */ byte c;
    public final /* synthetic */ TaskCompletionSource d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cse(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override // l6d
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
