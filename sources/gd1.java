// default package

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gd1 implements wn {
    public final CastDevice a;
    public final kmf b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ gd1(rx6 rx6Var) {
        this.a = (CastDevice) rx6Var.b;
        this.b = (kmf) rx6Var.c;
        this.c = (Bundle) rx6Var.d;
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
        if (!(obj instanceof gd1)) {
            return false;
        }
        gd1 gd1Var = (gd1) obj;
        if (vue.a(this.a, gd1Var.a)) {
            Bundle bundle = gd1Var.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!vue.a(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (vue.a(this.d, gd1Var.d)) {
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
