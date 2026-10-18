package ad;

import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import p4.r;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class e {
    public ArrayList a;

    public e(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.a = new ArrayList();
                break;
        }
    }

    public r a() {
        if (this.a == null) {
            return r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new r(bundle, this.a);
    }

    public void b() {
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
                m.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    public void c(StringBuilder sb2) {
        sb2.append(((Boolean) i2.d.A(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void d(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            c(sb2);
        }
    }
}
