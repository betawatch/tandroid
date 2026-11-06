package li;

import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class z3 {
    public ArrayList a;

    public z3(int i7) {
        switch (i7) {
            case 2:
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

    public s4.r a() {
        if (this.a == null) {
            return s4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new s4.r(bundle, this.a);
    }

    public void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e10) {
                yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
            }
        }
        arrayList.clear();
    }

    public void c(StringBuilder sb2) {
        sb2.append(((Boolean) org.telegram.ui.Cells.f1.k(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void d(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            c(sb2);
        }
    }
}
