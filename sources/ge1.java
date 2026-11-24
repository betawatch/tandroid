// default package

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ge1 implements wo {
    public final CastDevice a;
    public final vjf b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ ge1(mx6 mx6Var) {
        this.a = (CastDevice) mx6Var.b;
        this.b = (vjf) mx6Var.c;
        this.c = (Bundle) mx6Var.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r3 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1)) {
            return false;
        }
        ge1 ge1Var = (ge1) obj;
        if (fse.a(this.a, ge1Var.a)) {
            Bundle bundle = ge1Var.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!fse.a(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (fse.a(this.d, ge1Var.d)) {
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
