// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class isd {
    public final m5f a;
    public final Boolean b;
    public final ocf c;

    public /* synthetic */ isd(rod rodVar) {
        this.a = (m5f) rodVar.b;
        this.b = (Boolean) rodVar.c;
        this.c = (ocf) rodVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isd)) {
            return false;
        }
        isd isdVar = (isd) obj;
        return cqe.a(this.a, isdVar.a) && cqe.a(this.b, isdVar.b) && cqe.a(null, null) && cqe.a(this.c, isdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
