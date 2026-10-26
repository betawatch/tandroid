package d6;

import a8.h0;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice a;
    public final e6.d0 b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ e(h0 h0Var) {
        this.a = (CastDevice) h0Var.b;
        this.b = (e6.d0) h0Var.c;
        this.c = (Bundle) h0Var.d;
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
        if (o6.l.l(this.a, eVar.a)) {
            Bundle bundle = eVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!o6.l.l(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (o6.l.l(this.d, eVar.d)) {
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
