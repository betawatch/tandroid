// default package

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ma4 {
    public final HashMap a;

    public ma4(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public final void a(IBinder iBinder) {
        synchronized (this.a) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new xme();
            for (Map.Entry entry : this.a.entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/null");
                }
            }
        }
    }
}
