// default package

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                    ok7.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
        }
        arrayList.clear();
    }
}
