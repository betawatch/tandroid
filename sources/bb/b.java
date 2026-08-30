package bb;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.result.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m8.x0;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b {
    public final HashMap a = new HashMap();

    public b() {
    }

    public void a(IBinder iBinder) {
        synchronized (this.a) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new x0();
            for (Map.Entry entry : this.a.entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + BuildConfig.BETA_URL);
                }
            }
        }
    }

    public b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            HashMap hashMap = this.a;
            aVar.getClass();
            hashMap.put(c.class, aVar.a);
        }
    }
}
