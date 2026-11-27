// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ehf {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ehf(am2 am2Var) {
        this.a = (Boolean) am2Var.b;
        this.b = (Boolean) am2Var.c;
        this.c = (Boolean) am2Var.d;
        this.d = (Boolean) am2Var.e;
        this.e = (Boolean) am2Var.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ehf)) {
            return false;
        }
        ehf ehfVar = (ehf) obj;
        return vue.a(this.a, ehfVar.a) && vue.a(this.b, ehfVar.b) && vue.a(this.c, ehfVar.c) && vue.a(this.d, ehfVar.d) && vue.a(this.e, ehfVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
