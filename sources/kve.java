// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kve {
    public final ave a;
    public final Integer b;

    public /* synthetic */ kve(k7b k7bVar) {
        this.a = (ave) k7bVar.b;
        this.b = (Integer) k7bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kve)) {
            return false;
        }
        kve kveVar = (kve) obj;
        return vue.a(this.a, kveVar.a) && vue.a(this.b, kveVar.b) && vue.a(null, null) && vue.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
