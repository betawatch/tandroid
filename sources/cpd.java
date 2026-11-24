// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cpd {
    public final yse a;
    public final Boolean b;
    public final kxe c;

    public /* synthetic */ cpd(rod rodVar) {
        this.a = (yse) rodVar.b;
        this.b = (Boolean) rodVar.c;
        this.c = (kxe) rodVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cpd)) {
            return false;
        }
        cpd cpdVar = (cpd) obj;
        return cqe.a(this.a, cpdVar.a) && cqe.a(this.b, cpdVar.b) && cqe.a(null, null) && cqe.a(this.c, cpdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
