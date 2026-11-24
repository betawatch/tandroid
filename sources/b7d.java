// default package

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b7d implements lr2, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ b7d(ie1 ie1Var) {
        this.a = (byte) 3;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 0:
                return new kg7((byte) 0);
            default:
                return new n89(sm2Var.N(m89.class));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        e1f.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public /* synthetic */ b7d(byte b) {
        this.a = b;
    }
}
