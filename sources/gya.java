// default package

import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gya {
    public final String a;
    public final qm5 b;
    public final qm5 c;
    public final qm5 d;

    public gya(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = qm5.b(hashMap);
        this.c = qm5.b(hashMap2);
        this.d = qm5.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gya)) {
            return false;
        }
        gya gyaVar = (gya) obj;
        return Objects.equals(this.a, gyaVar.a) && this.b.equals(gyaVar.b) && this.c.equals(gyaVar.c) && this.d.equals(gyaVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
