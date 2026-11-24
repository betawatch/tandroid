// default package

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hh4 {
    public static v73 a(a5a a5aVar, ln8 ln8Var, dw2 dw2Var, op4 op4Var) {
        c24 c24Var = c24.a;
        byte b = 3;
        fw2 fw2Var = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new v73(new eb4(a5aVar, new s73(dw2Var, (byte) 1), op4Var), zk2.a(new ai1(c24Var, fw2Var, b)), ln8Var, dw2Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new v73(new eb4(a5aVar, cb4.c, op4Var), zk2.a(new ai1(c24Var, fw2Var, b)), ln8Var, dw2Var);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && rp5.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                zf.e(parentFile, "Failed to delete conflicting file: ");
                return;
            }
            if (parentFile.isDirectory()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 26) {
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                zf.e(parentFile, "Failed to create directory: ");
                return;
            }
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
            } catch (Exception e) {
                throw new IOException("Failed to create directory: " + parentFile, e);
            }
        }
    }
}
