// default package

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n22 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d32 b;

    public /* synthetic */ n22(d32 d32Var, byte b) {
        this.a = b;
        this.b = d32Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        d32 d32Var = this.b;
        w22 w22Var = (w22) obj;
        w22 w22Var2 = (w22) obj2;
        switch (b) {
            case 0:
                File file = w22Var.f;
                if (file != null) {
                    if (w22Var2.f == null) {
                        return 1;
                    }
                    boolean isDirectory = file.isDirectory();
                    if (isDirectory != w22Var2.f.isDirectory()) {
                        if (!isDirectory) {
                            return 1;
                        }
                    } else {
                        if (isDirectory || d32Var.d0) {
                            return w22Var.f.getName().compareToIgnoreCase(w22Var2.f.getName());
                        }
                        long lastModified = w22Var.f.lastModified();
                        long lastModified2 = w22Var2.f.lastModified();
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
                if (d32Var.d0) {
                    return w22Var.f.getName().compareToIgnoreCase(w22Var2.f.getName());
                }
                long lastModified3 = w22Var.f.lastModified();
                long lastModified4 = w22Var2.f.lastModified();
                if (lastModified3 == lastModified4) {
                    return 0;
                }
                return lastModified3 > lastModified4 ? -1 : 1;
        }
    }
}
