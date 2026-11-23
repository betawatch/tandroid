package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class qa {
    public final pa a;
    public final Integer b;

    public /* synthetic */ qa(wf.b bVar) {
        this.a = (pa) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return q6.m.l(this.a, qaVar.a) && q6.m.l(this.b, qaVar.b) && q6.m.l(null, null) && q6.m.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
