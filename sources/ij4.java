// default package

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ij4 {
    public static o83 a(s8a s8aVar, i09 i09Var, xw2 xw2Var, sr4 sr4Var) {
        x24 x24Var = x24.a;
        byte b = 3;
        zw2 zw2Var = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new o83(new bd4(s8aVar, new l83(xw2Var, (byte) 1), sr4Var), tl2.a(new ii1(x24Var, zw2Var, b)), i09Var, xw2Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new o83(new bd4(s8aVar, zc4.c, sr4Var), tl2.a(new ii1(x24Var, zw2Var, b)), i09Var, xw2Var);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && ur5.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                bg.e(parentFile, "Failed to delete conflicting file: ");
                return;
            }
            if (parentFile.isDirectory()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 26) {
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                bg.e(parentFile, "Failed to create directory: ");
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
