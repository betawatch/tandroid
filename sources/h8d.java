// default package

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class h8d implements Continuation, v76, lr2, pje {
    public static final /* synthetic */ h8d b = new h8d(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ h8d(byte b2) {
        this.a = b2;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 2:
                synchronized (agf.class) {
                    agf.a(new lef());
                }
                return new f8e();
            default:
                return new uha((Context) sm2Var.a(Context.class));
        }
    }

    @Override // pje
    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // v76
    public final void c(Object obj) {
        ((m05) obj).getClass();
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
