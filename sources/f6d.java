// default package

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class f6d implements Continuation, v56, aq2, ohe {
    public static final /* synthetic */ f6d b = new f6d(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ f6d(byte b2) {
        this.a = b2;
    }

    @Override // v56
    public final void H(Object obj) {
        ((ly4) obj).getClass();
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        switch (this.a) {
            case 2:
                synchronized (zdf.class) {
                    zdf.a(new kcf());
                }
                return new c6e();
            default:
                return new sfa((Context) gl2Var.a(Context.class));
        }
    }

    @Override // ohe
    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
