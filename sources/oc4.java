// default package

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class oc4 implements lk2 {
    public final File a;
    public final c7a b;
    public final AtomicBoolean c;

    public oc4(File file, c7a c7aVar) {
        c7aVar.getClass();
        this.a = file;
        this.b = c7aVar;
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
        r7 = r1.p(r8);
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
    /* JADX WARN: Type inference failed for: r1v11, types: [oc4] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(oc4 oc4Var, qx2 qx2Var) {
        nc4 nc4Var;
        ?? r1;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if (qx2Var instanceof nc4) {
            nc4Var = (nc4) qx2Var;
            int i = nc4Var.e;
            if ((i & TLObject.FLAG_31) != 0) {
                nc4Var.e = i - TLObject.FLAG_31;
                Object obj = nc4Var.c;
                r1 = nc4Var.e;
                ly2 ly2Var = ly2.a;
                if (r1 != 0) {
                    tue.b(obj);
                    if (oc4Var.c.get()) {
                        dq9.m("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new FileInputStream(oc4Var.a);
                    } catch (FileNotFoundException unused) {
                        File file = oc4Var.a;
                        c7a c7aVar = oc4Var.b;
                        if (!file.exists()) {
                        }
                    }
                    try {
                        c7a c7aVar2 = oc4Var.b;
                        nc4Var.a = oc4Var;
                        nc4Var.b = fileInputStream2;
                        nc4Var.e = 1;
                        Object p = c7aVar2.p(fileInputStream2);
                        if (p != ly2Var) {
                            fileInputStream = fileInputStream2;
                            obj = p;
                        }
                        return ly2Var;
                    } catch (Throwable th2) {
                        r1 = oc4Var;
                        fileInputStream = fileInputStream2;
                        th = th2;
                        throw th;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Closeable closeable = (Closeable) nc4Var.a;
                    try {
                        tue.b(obj);
                        htd.a(closeable, null);
                        return obj;
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = nc4Var.b;
                r1 = (oc4) nc4Var.a;
                try {
                    tue.b(obj);
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } finally {
                    }
                }
                htd.a(fileInputStream, null);
                return obj;
            }
        }
        nc4Var = new nc4(oc4Var, qx2Var);
        Object obj2 = nc4Var.c;
        r1 = nc4Var.e;
        ly2 ly2Var2 = ly2.a;
        if (r1 != 0) {
        }
        htd.a(fileInputStream, null);
        return obj2;
    }

    @Override // lk2
    public final void close() {
        this.c.set(true);
    }
}
