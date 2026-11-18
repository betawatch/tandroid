package f6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice a;
    public final g6.d0 b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ e(android.support.v4.media.session.a0 a0Var) {
        this.a = (CastDevice) a0Var.b;
        this.b = (g6.d0) a0Var.c;
        this.c = (Bundle) a0Var.d;
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
        if (q6.m.l(this.a, eVar.a)) {
            Bundle bundle = eVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!q6.m.l(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (q6.m.l(this.d, eVar.d)) {
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
