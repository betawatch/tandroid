package m5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice a;
    public final n5.e0 b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ e(j9.a aVar) {
        this.a = (CastDevice) aVar.b;
        this.b = (n5.e0) aVar.c;
        this.c = (Bundle) aVar.d;
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
        if (y5.l.l(this.a, eVar.a)) {
            Bundle bundle = eVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!y5.l.l(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (y5.l.l(this.d, eVar.d)) {
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
