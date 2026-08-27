package k7;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ve {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ve(af.h hVar) {
        this.a = (Boolean) hVar.a;
        this.b = (Boolean) hVar.b;
        this.c = (Boolean) hVar.c;
        this.d = (Boolean) hVar.d;
        this.e = (Boolean) hVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return y5.l.l(this.a, veVar.a) && y5.l.l(this.b, veVar.b) && y5.l.l(this.c, veVar.c) && y5.l.l(this.d, veVar.d) && y5.l.l(this.e, veVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
