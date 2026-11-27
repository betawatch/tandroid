// default package

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e32 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u32 b;

    public /* synthetic */ e32(u32 u32Var, byte b) {
        this.a = b;
        this.b = u32Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        u32 u32Var = this.b;
        n32 n32Var = (n32) obj;
        n32 n32Var2 = (n32) obj2;
        switch (b) {
            case 0:
                File file = n32Var.f;
                if (file != null) {
                    if (n32Var2.f == null) {
                        return 1;
                    }
                    boolean isDirectory = file.isDirectory();
                    if (isDirectory != n32Var2.f.isDirectory()) {
                        if (!isDirectory) {
                            return 1;
                        }
                    } else {
                        if (isDirectory || u32Var.d0) {
                            return n32Var.f.getName().compareToIgnoreCase(n32Var2.f.getName());
                        }
                        long lastModified = n32Var.f.lastModified();
                        long lastModified2 = n32Var2.f.lastModified();
                        if (lastModified == lastModified2) {
                            return 0;
                        }
                        if (lastModified <= lastModified2) {
                            return 1;
                        }
                    }
                }
                return -1;
            default:
                if (u32Var.d0) {
                    return n32Var.f.getName().compareToIgnoreCase(n32Var2.f.getName());
                }
                long lastModified3 = n32Var.f.lastModified();
                long lastModified4 = n32Var2.f.lastModified();
                if (lastModified3 == lastModified4) {
                    return 0;
                }
                return lastModified3 > lastModified4 ? -1 : 1;
        }
    }
}
