// default package

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hd4 implements lk2 {
    public final File a;
    public final c7a b;
    public final kr5 c;
    public final dd4 d;
    public final AtomicBoolean e;
    public final qj7 f;

    public hd4(File file, c7a c7aVar, kr5 kr5Var, dd4 dd4Var) {
        c7aVar.getClass();
        kr5Var.getClass();
        this.a = file;
        this.b = c7aVar;
        this.c = kr5Var;
        this.d = dd4Var;
        this.e = new AtomicBoolean(false);
        this.f = new qj7();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(3:9|10|11)(2:42|43))(2:44|(7:46|47|48|49|50|51|(1:53)(1:54))(2:58|59))|12|13|14|(2:(1:17)|18)(2:20|21)))|60|6|(0)(0)|12|13|14|(0)(0)|(2:(0)|(1:40))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q83 q83Var, qx2 qx2Var) {
        fd4 fd4Var;
        int i;
        boolean e;
        Throwable th;
        oc4 oc4Var;
        hd4 hd4Var;
        boolean z;
        if (qx2Var instanceof fd4) {
            fd4Var = (fd4) qx2Var;
            int i2 = fd4Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                fd4Var.f = i2 - TLObject.FLAG_31;
                Object obj = fd4Var.d;
                i = fd4Var.f;
                if (i != 0) {
                    tue.b(obj);
                    if (this.e.get()) {
                        dq9.m("StorageConnection has already been disposed.");
                        return null;
                    }
                    e = this.f.e();
                    try {
                        oc4 oc4Var2 = new oc4(this.a, this.b);
                        try {
                            Object valueOf = Boolean.valueOf(e);
                            fd4Var.a = this;
                            fd4Var.b = oc4Var2;
                            fd4Var.c = e;
                            fd4Var.f = 1;
                            Object a = q83Var.a(oc4Var2, valueOf, fd4Var);
                            Object obj2 = ly2.a;
                            if (a == obj2) {
                                return obj2;
                            }
                            hd4Var = this;
                            z = e;
                            obj = a;
                            oc4Var = oc4Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            oc4Var = oc4Var2;
                            oc4Var.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (e) {
                            this.f.f(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = fd4Var.c;
                    oc4Var = fd4Var.b;
                    hd4Var = fd4Var.a;
                    try {
                        tue.b(obj);
                    } catch (Throwable th4) {
                        e = z;
                        this = hd4Var;
                        th = th4;
                        try {
                            oc4Var.close();
                            throw th;
                        } catch (Throwable th5) {
                            uhe.a(th, th5);
                            throw th;
                        }
                    }
                }
                oc4Var.close();
                th = null;
                if (th != null) {
                    if (z) {
                        hd4Var.f.f(null);
                    }
                    return obj;
                }
                try {
                    throw th;
                } catch (Throwable th6) {
                    th = th6;
                    e = z;
                    this = hd4Var;
                    if (e) {
                    }
                    throw th;
                }
            }
        }
        fd4Var = new fd4(this, qx2Var);
        Object obj3 = fd4Var.d;
        i = fd4Var.f;
        if (i != 0) {
        }
        oc4Var.close();
        th = null;
        if (th != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[Catch: IOException -> 0x011f, all -> 0x012c, TRY_ENTER, TryCatch #3 {IOException -> 0x011f, blocks: (B:18:0x00cd, B:20:0x00d3, B:22:0x00db, B:24:0x00e6, B:25:0x0106, B:27:0x00e0, B:30:0x0111, B:37:0x011e, B:40:0x011b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[Catch: IOException -> 0x011f, all -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x011f, blocks: (B:18:0x00cd, B:20:0x00d3, B:22:0x00db, B:24:0x00e6, B:25:0x0106, B:27:0x00e0, B:30:0x0111, B:37:0x011e, B:40:0x011b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g93 g93Var, qx2 qx2Var) {
        gd4 gd4Var;
        int i;
        ly2 ly2Var;
        File file;
        oj7 oj7Var;
        fs4 fs4Var;
        sd4 sd4Var;
        Throwable th;
        sd4 sd4Var2;
        hd4 hd4Var;
        File file2;
        try {
            try {
                try {
                    try {
                        if (qx2Var instanceof gd4) {
                            gd4Var = (gd4) qx2Var;
                            int i2 = gd4Var.h;
                            if ((i2 & TLObject.FLAG_31) != 0) {
                                gd4Var.h = i2 - TLObject.FLAG_31;
                                Object obj = gd4Var.e;
                                i = gd4Var.h;
                                ly2Var = ly2.a;
                                if (i != 0) {
                                    tue.b(obj);
                                    if (this.e.get()) {
                                        dq9.m("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File file3 = this.a;
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            zg.e(file3, "Unable to create parent directories of ");
                                            return null;
                                        }
                                    }
                                    gd4Var.a = this;
                                    gd4Var.b = g93Var;
                                    qj7 qj7Var = this.f;
                                    gd4Var.c = qj7Var;
                                    gd4Var.h = 1;
                                    if (qj7Var.d(gd4Var) != ly2Var) {
                                        oj7Var = qj7Var;
                                        fs4Var = g93Var;
                                    }
                                    return ly2Var;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    sd4Var2 = gd4Var.d;
                                    file2 = (File) gd4Var.c;
                                    oj7Var = (oj7) gd4Var.b;
                                    hd4Var = gd4Var.a;
                                    try {
                                        tue.b(obj);
                                        try {
                                            sd4Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = hd4Var.a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? i10.g(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + hd4Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((qj7) oj7Var).f(null);
                                        return g7c.a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            sd4Var2.close();
                                        } catch (Throwable th4) {
                                            uhe.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                oj7 oj7Var2 = (oj7) gd4Var.c;
                                fs4 fs4Var2 = (fs4) gd4Var.b;
                                hd4 hd4Var2 = gd4Var.a;
                                tue.b(obj);
                                oj7Var = oj7Var2;
                                this = hd4Var2;
                                fs4Var = fs4Var2;
                                file = new File(this.a.getAbsolutePath() + ".tmp");
                                c7a c7aVar = this.b;
                                c7aVar.getClass();
                                sd4Var = new sd4(file, c7aVar);
                                gd4Var.a = this;
                                gd4Var.b = oj7Var;
                                gd4Var.c = file;
                                gd4Var.d = sd4Var;
                                gd4Var.h = 2;
                                if (fs4Var.invoke(sd4Var, gd4Var) != ly2Var) {
                                    hd4Var = this;
                                    file2 = file;
                                    sd4Var2 = sd4Var;
                                    sd4Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return ly2Var;
                            }
                        }
                        gd4Var.a = this;
                        gd4Var.b = oj7Var;
                        gd4Var.c = file;
                        gd4Var.d = sd4Var;
                        gd4Var.h = 2;
                        if (fs4Var.invoke(sd4Var, gd4Var) != ly2Var) {
                        }
                        return ly2Var;
                    } catch (Throwable th5) {
                        th = th5;
                        sd4Var2 = sd4Var;
                        sd4Var2.close();
                        throw th;
                    }
                    c7a c7aVar2 = this.b;
                    c7aVar2.getClass();
                    sd4Var = new sd4(file, c7aVar2);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ((qj7) oj7Var).f(null);
                throw th6;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            file = g93Var;
        }
        gd4Var = new gd4(this, qx2Var);
        Object obj2 = gd4Var.e;
        i = gd4Var.h;
        ly2Var = ly2.a;
    }

    @Override // lk2
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
