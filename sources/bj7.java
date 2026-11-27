// default package

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bj7 implements nr5 {
    public static final sae j = new sae();
    public final mx2 a;
    public final File b;
    public final ji1 c;
    public final String d;
    public final String e;
    public final String f;
    public final xj7 g;
    public final tgb h;
    public final tgb i;

    public bj7(mx2 mx2Var, File file) {
        mx2Var.getClass();
        this.a = mx2Var;
        this.b = file;
        Object obj = ej7.b;
        this.c = new ji1(new a83(file, null, (byte) 1), u24.a, -2, x01.a, (byte) 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new xj7();
        this.h = new tgb(new yi7(this, (byte) 1));
        this.i = new tgb(new yi7(this, (byte) 0));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                bg.e(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // nr5
    public final Object a(n83 n83Var) {
        if (this.i.b == qf5.d) {
            return fud.c(this.a, new xi7(this, null, (byte) 1), n83Var);
        }
        return new Integer(yea.b.nativeIncrementAndGetCounterValue(((yea) this.i.getValue()).a));
    }

    @Override // nr5
    public final Object b(zw2 zw2Var) {
        if (this.i.b == qf5.d) {
            return fud.c(this.a, new xi7(this, null, (byte) 0), zw2Var);
        }
        return new Integer(yea.b.nativeGetCounterValue(((yea) this.i.getValue()).a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0078, code lost:
    
        if (r10.d(r0) != r6) goto L26;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[Catch: all -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00d8, blocks: (B:16:0x00b4, B:30:0x00d4, B:31:0x00d7), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #3 {all -> 0x00d8, blocks: (B:16:0x00b4, B:30:0x00d4, B:31:0x00d7), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v21, types: [vj7] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, ur4] */
    @Override // nr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ur4 ur4Var, zw2 zw2Var) {
        zi7 zi7Var;
        Object obj;
        int i;
        vx2 vx2Var;
        xj7 xj7Var;
        ur4 ur4Var2;
        Throwable th;
        Object h;
        vj7 vj7Var;
        ur4 ur4Var3;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        vj7 vj7Var2;
        try {
            try {
                try {
                    if (zw2Var instanceof zi7) {
                        zi7Var = (zi7) zw2Var;
                        int i2 = zi7Var.f;
                        if ((i2 & TLObject.FLAG_31) != 0) {
                            zi7Var.f = i2 - TLObject.FLAG_31;
                            obj = zi7Var.d;
                            i = zi7Var.f;
                            vx2Var = vx2.a;
                            if (i != 0) {
                                ixe.b(obj);
                                zi7Var.a = this;
                                zi7Var.b = ur4Var;
                                xj7Var = this.g;
                                zi7Var.c = xj7Var;
                                zi7Var.f = 1;
                                ur4Var2 = ur4Var;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            grb.i("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        fileLock = (FileLock) zi7Var.c;
                                        closeable = (Closeable) zi7Var.b;
                                        vj7Var2 = (vj7) zi7Var.a;
                                        try {
                                            ixe.b(obj);
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            try {
                                                uvd.a(closeable, null);
                                                ((xj7) vj7Var2).f(null);
                                                return obj;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj = vj7Var2;
                                                ((xj7) obj).f(null);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    closeable = (Closeable) zi7Var.c;
                                    vj7Var = (vj7) zi7Var.b;
                                    ur4Var3 = (ur4) zi7Var.a;
                                    try {
                                        ixe.b(obj);
                                        fileLock2 = (FileLock) obj;
                                        try {
                                            zi7Var.a = vj7Var;
                                            zi7Var.b = closeable;
                                            zi7Var.c = fileLock2;
                                            zi7Var.f = 3;
                                            invoke = ur4Var3.invoke(zi7Var);
                                            if (invoke != vx2Var) {
                                                vj7Var2 = vj7Var;
                                                fileLock = fileLock2;
                                                obj = invoke;
                                                if (fileLock != null) {
                                                }
                                                uvd.a(closeable, null);
                                                ((xj7) vj7Var2).f(null);
                                                return obj;
                                            }
                                            return vx2Var;
                                        } catch (Throwable th4) {
                                            fileLock = fileLock2;
                                            th = th4;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileLock = null;
                                        if (fileLock != null) {
                                        }
                                        throw th;
                                    }
                                }
                                ?? r8 = (vj7) zi7Var.c;
                                ur4 ur4Var4 = (ur4) zi7Var.b;
                                bj7 bj7Var = (bj7) zi7Var.a;
                                ixe.b(obj);
                                xj7Var = r8;
                                this = bj7Var;
                                ur4Var2 = ur4Var4;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream((File) this.h.getValue());
                            sae saeVar = j;
                            zi7Var.a = ur4Var2;
                            zi7Var.b = xj7Var;
                            zi7Var.c = fileOutputStream;
                            zi7Var.f = 2;
                            h = saeVar.h(fileOutputStream, zi7Var);
                            if (h != vx2Var) {
                                xj7 xj7Var2 = xj7Var;
                                obj = h;
                                vj7Var = xj7Var2;
                                ur4Var3 = ur4Var2;
                                closeable = fileOutputStream;
                                fileLock2 = (FileLock) obj;
                                zi7Var.a = vj7Var;
                                zi7Var.b = closeable;
                                zi7Var.c = fileLock2;
                                zi7Var.f = 3;
                                invoke = ur4Var3.invoke(zi7Var);
                                if (invoke != vx2Var) {
                                }
                            }
                            return vx2Var;
                        }
                    }
                    sae saeVar2 = j;
                    zi7Var.a = ur4Var2;
                    zi7Var.b = xj7Var;
                    zi7Var.c = fileOutputStream;
                    zi7Var.f = 2;
                    h = saeVar2.h(fileOutputStream, zi7Var);
                    if (h != vx2Var) {
                    }
                    return vx2Var;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                    }
                    throw th;
                }
                if (i != 0) {
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            obj = zi7Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                uvd.a(ur4Var, th8);
                throw th9;
            }
        }
        zi7Var = new zi7(this, zw2Var);
        obj = zi7Var.d;
        i = zi7Var.f;
        vx2Var = vx2.a;
    }

    @Override // nr5
    public final mm4 d() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4 A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f0, blocks: (B:15:0x00d4, B:31:0x00ec, B:32:0x00ef), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec A[Catch: all -> 0x00f0, TRY_ENTER, TryCatch #1 {all -> 0x00f0, blocks: (B:15:0x00d4, B:31:0x00ec, B:32:0x00ef), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r18v0, types: [is4] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [aj7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [xj7] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // nr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(is4 is4Var, zw2 zw2Var) {
        ?? r3;
        ?? r4;
        ?? r1;
        xj7 xj7Var;
        FileLock fileLock;
        FileLock fileLock2;
        FileInputStream fileInputStream;
        boolean z;
        try {
            if (zw2Var instanceof aj7) {
                aj7 aj7Var = (aj7) zw2Var;
                int i = aj7Var.h;
                if ((i & TLObject.FLAG_31) != 0) {
                    aj7Var.h = i - TLObject.FLAG_31;
                    r3 = aj7Var;
                    Object obj = r3.e;
                    r4 = r3.h;
                    if (r4 == 0) {
                        if (r4 == 1) {
                            r1 = r3.d;
                            xj7Var = r3.a;
                            try {
                                ixe.b(obj);
                                z = r1;
                                if (z) {
                                    xj7Var.f(null);
                                }
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                if (r1 != 0) {
                                }
                                throw th;
                            }
                        }
                        if (r4 != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = r3.d;
                        fileLock2 = r3.c;
                        fileInputStream = r3.b;
                        xj7 xj7Var2 = r3.a;
                        try {
                            ixe.b(obj);
                            r1 = z2;
                            r3 = xj7Var2;
                            if (fileLock2 != null) {
                                fileLock2.release();
                            }
                            try {
                                uvd.a(fileInputStream, null);
                                if (r1 != 0) {
                                    r3.f(null);
                                }
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                xj7Var = r3;
                                if (r1 != 0) {
                                    xj7Var.f(null);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (fileLock2 != null) {
                            }
                            throw th;
                        }
                    }
                    ixe.b(obj);
                    xj7 xj7Var3 = this.g;
                    boolean e = xj7Var3.e();
                    vx2 vx2Var = vx2.a;
                    try {
                        if (e) {
                            FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                            try {
                                try {
                                    fileLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileLock2 = null;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                String message = e2.getMessage();
                                if (message != null) {
                                    String str = this.f;
                                    str.getClass();
                                    if (message.startsWith(str)) {
                                        fileLock = null;
                                    }
                                }
                                String message2 = e2.getMessage();
                                if (message2 == null || !message2.startsWith("Resource deadlock would occur")) {
                                    throw e2;
                                }
                                fileLock = null;
                            }
                            try {
                                Boolean valueOf = Boolean.valueOf(fileLock != null);
                                r3.a = xj7Var3;
                                r3.b = fileInputStream2;
                                r3.c = fileLock;
                                r3.d = e;
                                r3.h = 2;
                                obj = is4Var.invoke(valueOf, r3);
                                if (obj != vx2Var) {
                                    fileLock2 = fileLock;
                                    r3 = xj7Var3;
                                    r1 = e;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock2 != null) {
                                    }
                                    uvd.a(fileInputStream, null);
                                    if (r1 != 0) {
                                    }
                                    return obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileLock2 = fileLock;
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                throw th;
                            }
                        } else {
                            Boolean bool = Boolean.FALSE;
                            r3.a = xj7Var3;
                            r3.d = e;
                            r3.h = 1;
                            obj = is4Var.invoke(bool, r3);
                            if (obj != vx2Var) {
                                xj7Var = xj7Var3;
                                z = e;
                                if (z) {
                                }
                                return obj;
                            }
                        }
                        return vx2Var;
                    } catch (Throwable th6) {
                        th = th6;
                        xj7Var = xj7Var3;
                        r1 = e;
                        if (r1 != 0) {
                        }
                        throw th;
                    }
                }
            }
            if (r4 == 0) {
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    uvd.a(r4, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                    xj7Var = r3;
                    if (r1 != 0) {
                    }
                    throw th;
                }
            }
        }
        r3 = new aj7(this, zw2Var);
        Object obj2 = r3.e;
        r4 = r3.h;
    }
}
