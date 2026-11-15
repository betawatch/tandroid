package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p7 {
    public final o7 a;
    public final Integer b;

    public /* synthetic */ p7(wf.b bVar) {
        this.a = (o7) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return q6.m.k(this.a, p7Var.a) && q6.m.k(this.b, p7Var.b) && q6.m.k(null, null) && q6.m.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
