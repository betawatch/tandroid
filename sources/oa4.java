// default package

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class oa4 implements xi2 {
    public final File a;
    public final a5a b;
    public final AtomicBoolean c;

    public oa4(File file, a5a a5aVar) {
        a5aVar.getClass();
        this.a = file;
        this.b = a5aVar;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(0)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0083, code lost:
    
        r8 = new java.io.FileInputStream(r7.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        r0.a = r8;
        r0.b = null;
        r0.e = 2;
        r7 = r1.m(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0094, code lost:
    
        if (r7 != r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0097, code lost:
    
        r8 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        r8 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        return r1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0078, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [oa4] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(oa4 oa4Var, gw2 gw2Var) {
        na4 na4Var;
        ?? r1;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if (gw2Var instanceof na4) {
            na4Var = (na4) gw2Var;
            int i = na4Var.e;
            if ((i & TLObject.FLAG_31) != 0) {
                na4Var.e = i - TLObject.FLAG_31;
                Object obj = na4Var.c;
                r1 = na4Var.e;
                bx2 bx2Var = bx2.a;
                if (r1 != 0) {
                    qse.b(obj);
                    if (oa4Var.c.get()) {
                        sc8.j("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new FileInputStream(oa4Var.a);
                    } catch (FileNotFoundException unused) {
                        File file = oa4Var.a;
                        a5a a5aVar = oa4Var.b;
                        if (!file.exists()) {
                        }
                    }
                    try {
                        a5a a5aVar2 = oa4Var.b;
                        na4Var.a = oa4Var;
                        na4Var.b = fileInputStream2;
                        na4Var.e = 1;
                        Object m = a5aVar2.m(fileInputStream2);
                        if (m != bx2Var) {
                            fileInputStream = fileInputStream2;
                            obj = m;
                        }
                        return bx2Var;
                    } catch (Throwable th2) {
                        r1 = oa4Var;
                        fileInputStream = fileInputStream2;
                        th = th2;
                        throw th;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Closeable closeable = (Closeable) na4Var.a;
                    try {
                        qse.b(obj);
                        erd.a(closeable, null);
                        return obj;
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = na4Var.b;
                r1 = (oa4) na4Var.a;
                try {
                    qse.b(obj);
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } finally {
                    }
                }
                erd.a(fileInputStream, null);
                return obj;
            }
        }
        na4Var = new na4(oa4Var, gw2Var);
        Object obj2 = na4Var.c;
        r1 = na4Var.e;
        bx2 bx2Var2 = bx2.a;
        if (r1 != 0) {
        }
        erd.a(fileInputStream, null);
        return obj2;
    }

    @Override // xi2
    public final void close() {
        this.c.set(true);
    }
}
