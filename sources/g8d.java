// default package

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class g8d implements SuccessContinuation, pje, OnFailureListener {
    public static final /* synthetic */ g8d a = new g8d();

    @Override // pje
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
        int i = fo9.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }
}
