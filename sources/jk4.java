// default package

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jk4 {
    public final ArrayList a;

    public jk4(byte b) {
        switch (b) {
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

    public final void a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                grb.o();
                return;
            } else {
                try {
                    throw null;
                } catch (Exception e) {
                    nk7.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
        }
        arrayList.clear();
    }
}
