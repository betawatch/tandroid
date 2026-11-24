// default package

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hb4 implements xi2 {
    public final File a;
    public final a5a b;
    public final kp5 c;
    public final db4 d;
    public final AtomicBoolean e;
    public final nh7 f;

    public hb4(File file, a5a a5aVar, kp5 kp5Var, db4 db4Var) {
        a5aVar.getClass();
        kp5Var.getClass();
        this.a = file;
        this.b = a5aVar;
        this.c = kp5Var;
        this.d = db4Var;
        this.e = new AtomicBoolean(false);
        this.f = new nh7();
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
    public final Object a(e73 e73Var, gw2 gw2Var) {
        fb4 fb4Var;
        int i;
        boolean e;
        Throwable th;
        oa4 oa4Var;
        hb4 hb4Var;
        boolean z;
        if (gw2Var instanceof fb4) {
            fb4Var = (fb4) gw2Var;
            int i2 = fb4Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                fb4Var.f = i2 - TLObject.FLAG_31;
                Object obj = fb4Var.d;
                i = fb4Var.f;
                if (i != 0) {
                    qse.b(obj);
                    if (this.e.get()) {
                        sc8.j("StorageConnection has already been disposed.");
                        return null;
                    }
                    e = this.f.e();
                    try {
                        oa4 oa4Var2 = new oa4(this.a, this.b);
                        try {
                            Object valueOf = Boolean.valueOf(e);
                            fb4Var.a = this;
                            fb4Var.b = oa4Var2;
                            fb4Var.c = e;
                            fb4Var.f = 1;
                            Object a = e73Var.a(oa4Var2, valueOf, fb4Var);
                            Object obj2 = bx2.a;
                            if (a == obj2) {
                                return obj2;
                            }
                            hb4Var = this;
                            z = e;
                            obj = a;
                            oa4Var = oa4Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            oa4Var = oa4Var2;
                            oa4Var.close();
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
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = fb4Var.c;
                    oa4Var = fb4Var.b;
                    hb4Var = fb4Var.a;
                    try {
                        qse.b(obj);
                    } catch (Throwable th4) {
                        e = z;
                        this = hb4Var;
                        th = th4;
                        try {
                            oa4Var.close();
                            throw th;
                        } catch (Throwable th5) {
                            tfe.a(th, th5);
                            throw th;
                        }
                    }
                }
                oa4Var.close();
                th = null;
                if (th != null) {
                    if (z) {
                        hb4Var.f.f(null);
                    }
                    return obj;
                }
                try {
                    throw th;
                } catch (Throwable th6) {
                    th = th6;
                    e = z;
                    this = hb4Var;
                    if (e) {
                    }
                    throw th;
                }
            }
        }
        fb4Var = new fb4(this, gw2Var);
        Object obj3 = fb4Var.d;
        i = fb4Var.f;
        if (i != 0) {
        }
        oa4Var.close();
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
    public final Object b(u73 u73Var, gw2 gw2Var) {
        gb4 gb4Var;
        int i;
        bx2 bx2Var;
        File file;
        lh7 lh7Var;
        eq4 eq4Var;
        sb4 sb4Var;
        Throwable th;
        sb4 sb4Var2;
        hb4 hb4Var;
        File file2;
        try {
            try {
                try {
                    try {
                        if (gw2Var instanceof gb4) {
                            gb4Var = (gb4) gw2Var;
                            int i2 = gb4Var.h;
                            if ((i2 & TLObject.FLAG_31) != 0) {
                                gb4Var.h = i2 - TLObject.FLAG_31;
                                Object obj = gb4Var.e;
                                i = gb4Var.h;
                                bx2Var = bx2.a;
                                if (i != 0) {
                                    qse.b(obj);
                                    if (this.e.get()) {
                                        sc8.j("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File file3 = this.a;
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            zf.e(file3, "Unable to create parent directories of ");
                                            return null;
                                        }
                                    }
                                    gb4Var.a = this;
                                    gb4Var.b = u73Var;
                                    nh7 nh7Var = this.f;
                                    gb4Var.c = nh7Var;
                                    gb4Var.h = 1;
                                    if (nh7Var.d(gb4Var) != bx2Var) {
                                        lh7Var = nh7Var;
                                        eq4Var = u73Var;
                                    }
                                    return bx2Var;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    sb4Var2 = gb4Var.d;
                                    file2 = (File) gb4Var.c;
                                    lh7Var = (lh7) gb4Var.b;
                                    hb4Var = gb4Var.a;
                                    try {
                                        qse.b(obj);
                                        try {
                                            sb4Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = hb4Var.a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? i00.g(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + hb4Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((nh7) lh7Var).f(null);
                                        return g5c.a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            sb4Var2.close();
                                        } catch (Throwable th4) {
                                            tfe.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                lh7 lh7Var2 = (lh7) gb4Var.c;
                                eq4 eq4Var2 = (eq4) gb4Var.b;
                                hb4 hb4Var2 = gb4Var.a;
                                qse.b(obj);
                                lh7Var = lh7Var2;
                                this = hb4Var2;
                                eq4Var = eq4Var2;
                                file = new File(this.a.getAbsolutePath() + ".tmp");
                                a5a a5aVar = this.b;
                                a5aVar.getClass();
                                sb4Var = new sb4(file, a5aVar);
                                gb4Var.a = this;
                                gb4Var.b = lh7Var;
                                gb4Var.c = file;
                                gb4Var.d = sb4Var;
                                gb4Var.h = 2;
                                if (eq4Var.invoke(sb4Var, gb4Var) != bx2Var) {
                                    hb4Var = this;
                                    file2 = file;
                                    sb4Var2 = sb4Var;
                                    sb4Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return bx2Var;
                            }
                        }
                        gb4Var.a = this;
                        gb4Var.b = lh7Var;
                        gb4Var.c = file;
                        gb4Var.d = sb4Var;
                        gb4Var.h = 2;
                        if (eq4Var.invoke(sb4Var, gb4Var) != bx2Var) {
                        }
                        return bx2Var;
                    } catch (Throwable th5) {
                        th = th5;
                        sb4Var2 = sb4Var;
                        sb4Var2.close();
                        throw th;
                    }
                    a5a a5aVar2 = this.b;
                    a5aVar2.getClass();
                    sb4Var = new sb4(file, a5aVar2);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ((nh7) lh7Var).f(null);
                throw th6;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            file = u73Var;
        }
        gb4Var = new gb4(this, gw2Var);
        Object obj2 = gb4Var.e;
        i = gb4Var.h;
        bx2Var = bx2.a;
    }

    @Override // xi2
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
