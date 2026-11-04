package db;

import android.os.Build;
import b8.tb;
import gi.w5;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q {
    public static l1.b0 a(l1.z0 z0Var, w5 w5Var, be.c cVar, od.a aVar) {
        ed.o oVar = ed.o.a;
        fd.c cVar2 = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new l1.b0(new l1.f0(z0Var, new l1.y(cVar, 1), aVar), tb.a(new ae.d(oVar, cVar2, 7)), w5Var, cVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new l1.b0(new l1.f0(z0Var, l1.e0.b, aVar), tb.a(new ae.d(oVar, cVar2, 7)), w5Var, cVar);
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
