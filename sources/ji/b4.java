package ji;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class b4 {
    public final ArrayList a;

    public b4(int i10) {
        switch (i10) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e7) {
                yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e7);
            }
        }
        arrayList.clear();
    }

    public void b(StringBuilder sb2) {
        sb2.append(((Boolean) i2.g.z(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
