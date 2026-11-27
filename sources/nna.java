// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
