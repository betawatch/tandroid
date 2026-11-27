// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g8f {
    public final d8f a;
    public final Integer b;

    public /* synthetic */ g8f(zhc zhcVar) {
        this.a = (d8f) zhcVar.b;
        this.b = (Integer) zhcVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g8f)) {
            return false;
        }
        g8f g8fVar = (g8f) obj;
        return vue.a(this.a, g8fVar.a) && vue.a(this.b, g8fVar.b) && vue.a(null, null) && vue.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
