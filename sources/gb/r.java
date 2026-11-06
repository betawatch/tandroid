package gb;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class r {
    public static m1.b0 a(m1.y0 y0Var, h9.f1 f1Var, ee.c cVar, rd.a aVar) {
        hd.n nVar = hd.n.a;
        id.c cVar2 = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new m1.b0(new m1.f0(y0Var, new m1.y(cVar, 1), aVar), c8.d0.a(new be.l(nVar, cVar2, 8)), f1Var, cVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new m1.b0(new m1.f0(y0Var, m1.e0.b, aVar), c8.d0.a(new be.l(nVar, cVar2, 8)), f1Var, cVar);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.j.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                return;
            } catch (Exception e10) {
                throw new IOException("Failed to create directory: " + parentFile, e10);
            }
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Failed to create directory: " + parentFile);
    }
}
