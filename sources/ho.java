// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ho {
    public final int a;
    public final zn b;
    public final wn c;
    public final String d;

    public ho(zn znVar, wn wnVar, String str) {
        this.b = znVar;
        this.c = wnVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{znVar, wnVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return vue.a(this.b, hoVar.b) && vue.a(this.c, hoVar.c) && vue.a(this.d, hoVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
