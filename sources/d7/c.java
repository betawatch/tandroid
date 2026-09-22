package d7;

import hg.k0;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import yc.i;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c {
    public final ArrayList a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                new ArrayList();
                new ArrayList();
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
            } catch (Exception e) {
                i.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    public void b(StringBuilder sb2) {
        sb2.append(((Boolean) k0.x(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
