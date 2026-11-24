// default package

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class e6d implements SuccessContinuation, ohe, OnFailureListener {
    public static final /* synthetic */ e6d a = new e6d();

    @Override // ohe
    public final byte[] a(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = fm9.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }
}
