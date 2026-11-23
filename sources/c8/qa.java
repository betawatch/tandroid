package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
