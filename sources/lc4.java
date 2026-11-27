// default package

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class lc4 implements tj2 {
    public final File a;
    public final s8a b;
    public final AtomicBoolean c;

    public lc4(File file, s8a s8aVar) {
        s8aVar.getClass();
        this.a = file;
        this.b = s8aVar;
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
        r7 = r1.q(r8);
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
    /* JADX WARN: Type inference failed for: r1v11, types: [lc4] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(lc4 lc4Var, ax2 ax2Var) {
        kc4 kc4Var;
        ?? r1;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if (ax2Var instanceof kc4) {
            kc4Var = (kc4) ax2Var;
            int i = kc4Var.e;
            if ((i & TLObject.FLAG_31) != 0) {
                kc4Var.e = i - TLObject.FLAG_31;
                Object obj = kc4Var.c;
                r1 = kc4Var.e;
                vx2 vx2Var = vx2.a;
                if (r1 != 0) {
                    ixe.b(obj);
                    if (lc4Var.c.get()) {
                        grb.i("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new FileInputStream(lc4Var.a);
                    } catch (FileNotFoundException unused) {
                        File file = lc4Var.a;
                        s8a s8aVar = lc4Var.b;
                        if (!file.exists()) {
                        }
                    }
                    try {
                        s8a s8aVar2 = lc4Var.b;
                        kc4Var.a = lc4Var;
                        kc4Var.b = fileInputStream2;
                        kc4Var.e = 1;
                        Object q = s8aVar2.q(fileInputStream2);
                        if (q != vx2Var) {
                            fileInputStream = fileInputStream2;
                            obj = q;
                        }
                        return vx2Var;
                    } catch (Throwable th2) {
                        r1 = lc4Var;
                        fileInputStream = fileInputStream2;
                        th = th2;
                        throw th;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Closeable closeable = (Closeable) kc4Var.a;
                    try {
                        ixe.b(obj);
                        uvd.a(closeable, null);
                        return obj;
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = kc4Var.b;
                r1 = (lc4) kc4Var.a;
                try {
                    ixe.b(obj);
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } finally {
                    }
                }
                uvd.a(fileInputStream, null);
                return obj;
            }
        }
        kc4Var = new kc4(lc4Var, ax2Var);
        Object obj2 = kc4Var.c;
        r1 = kc4Var.e;
        vx2 vx2Var2 = vx2.a;
        if (r1 != 0) {
        }
        uvd.a(fileInputStream, null);
        return obj2;
    }

    @Override // tj2
    public final void close() {
        this.c.set(true);
    }
}
