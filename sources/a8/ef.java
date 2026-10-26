package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class ef {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ef(me meVar) {
        this.a = (Boolean) meVar.a;
        this.b = (Boolean) meVar.b;
        this.c = (Boolean) meVar.c;
        this.d = (Boolean) meVar.d;
        this.e = (Boolean) meVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj;
        return o6.l.l(this.a, efVar.a) && o6.l.l(this.b, efVar.b) && o6.l.l(this.c, efVar.c) && o6.l.l(this.d, efVar.d) && o6.l.l(this.e, efVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
