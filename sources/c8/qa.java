package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
