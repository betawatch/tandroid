// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nna implements tf7 {
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

    @Override // tf7
    public final ko4 a() {
        return null;
    }

    @Override // tf7
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

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
