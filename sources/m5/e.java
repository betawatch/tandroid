package m5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice a;
    public final n5.f0 b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ e(j4.c cVar) {
        this.a = (CastDevice) cVar.b;
        this.b = (n5.f0) cVar.c;
        this.c = (Bundle) cVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r3 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (x5.l.l(this.a, eVar.a)) {
            Bundle bundle = eVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!x5.l.l(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (x5.l.l(this.d, eVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
