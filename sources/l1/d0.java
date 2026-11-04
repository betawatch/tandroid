package l1;

import b8.he;
import b8.ib;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class d0 implements a {
    public final File a;
    public final z0 b;
    public final AtomicBoolean c;

    public d0(File file, z0 serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.a = file;
        this.b = serializer;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|46|47|(1:49)|50)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [l1.d0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(d0 d0Var, hd.c cVar) {
        c0 c0Var;
        ?? r22;
        Throwable th2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th3;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i3 = c0Var.e;
            if ((i3 & TLObject.FLAG_31) != 0) {
                c0Var.e = i3 - TLObject.FLAG_31;
                Object obj = c0Var.c;
                gd.a aVar = gd.a.a;
                r22 = c0Var.e;
                if (r22 != 0) {
                    ib.b(obj);
                    if (d0Var.c.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream3 = new FileInputStream(d0Var.a);
                        try {
                            z0 z0Var = d0Var.b;
                            c0Var.a = d0Var;
                            c0Var.b = fileInputStream3;
                            c0Var.e = 1;
                            Object c2 = z0Var.c(fileInputStream3);
                            if (c2 != aVar) {
                                fileInputStream2 = fileInputStream3;
                                obj = c2;
                            }
                        } catch (Throwable th4) {
                            r22 = d0Var;
                            fileInputStream2 = fileInputStream3;
                            th3 = th4;
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        File file = d0Var.a;
                        z0 z0Var2 = d0Var.b;
                        if (!file.exists()) {
                            return z0Var2.a();
                        }
                        FileInputStream fileInputStream4 = new FileInputStream(d0Var.a);
                        try {
                            c0Var.a = fileInputStream4;
                            c0Var.b = null;
                            c0Var.e = 2;
                            Object c10 = z0Var2.c(fileInputStream4);
                            if (c10 != aVar) {
                                obj = c10;
                                fileInputStream = fileInputStream4;
                                he.a(fileInputStream, null);
                                return obj;
                            }
                            return aVar;
                        } catch (Throwable th5) {
                            th2 = th5;
                            fileInputStream = fileInputStream4;
                            throw th2;
                        }
                    }
                    return aVar;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileInputStream = (Closeable) c0Var.a;
                    try {
                        ib.b(obj);
                        he.a(fileInputStream, null);
                        return obj;
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                fileInputStream2 = c0Var.b;
                r22 = (d0) c0Var.a;
                try {
                    ib.b(obj);
                } catch (Throwable th7) {
                    th3 = th7;
                    try {
                        throw th2;
                    } finally {
                    }
                }
                he.a(fileInputStream2, null);
                return obj;
            }
        }
        c0Var = new c0(d0Var, cVar);
        Object obj2 = c0Var.c;
        gd.a aVar2 = gd.a.a;
        r22 = c0Var.e;
        if (r22 != 0) {
        }
        he.a(fileInputStream2, null);
        return obj2;
    }

    @Override // l1.a
    public final void close() {
        this.c.set(true);
    }
}
