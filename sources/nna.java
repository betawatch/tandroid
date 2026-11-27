// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nna implements sf7 {
    public final ArrayList a;

    public nna(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((mna) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((mna) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((mna) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        yve.f(!z);
    }

    @Override // sf7
    public final ko4 a() {
        return null;
    }

    @Override // sf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nna.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((nna) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
