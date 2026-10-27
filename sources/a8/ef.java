package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
