// default package

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ed4 implements tj2 {
    public final File a;
    public final s8a b;
    public final nr5 c;
    public final ad4 d;
    public final AtomicBoolean e;
    public final wj7 f;

    public ed4(File file, s8a s8aVar, nr5 nr5Var, ad4 ad4Var) {
        s8aVar.getClass();
        nr5Var.getClass();
        this.a = file;
        this.b = s8aVar;
        this.c = nr5Var;
        this.d = ad4Var;
        this.e = new AtomicBoolean(false);
        this.f = new wj7();
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
    public final Object a(x73 x73Var, ax2 ax2Var) {
        cd4 cd4Var;
        int i;
        boolean e;
        Throwable th;
        lc4 lc4Var;
        ed4 ed4Var;
        boolean z;
        if (ax2Var instanceof cd4) {
            cd4Var = (cd4) ax2Var;
            int i2 = cd4Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                cd4Var.f = i2 - TLObject.FLAG_31;
                Object obj = cd4Var.d;
                i = cd4Var.f;
                if (i != 0) {
                    ixe.b(obj);
                    if (this.e.get()) {
                        grb.i("StorageConnection has already been disposed.");
                        return null;
                    }
                    e = this.f.e();
                    try {
                        lc4 lc4Var2 = new lc4(this.a, this.b);
                        try {
                            Object valueOf = Boolean.valueOf(e);
                            cd4Var.a = this;
                            cd4Var.b = lc4Var2;
                            cd4Var.c = e;
                            cd4Var.f = 1;
                            Object a = x73Var.a(lc4Var2, valueOf, cd4Var);
                            Object obj2 = vx2.a;
                            if (a == obj2) {
                                return obj2;
                            }
                            ed4Var = this;
                            z = e;
                            obj = a;
                            lc4Var = lc4Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            lc4Var = lc4Var2;
                            lc4Var.close();
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
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = cd4Var.c;
                    lc4Var = cd4Var.b;
                    ed4Var = cd4Var.a;
                    try {
                        ixe.b(obj);
                    } catch (Throwable th4) {
                        e = z;
                        this = ed4Var;
                        th = th4;
                        try {
                            lc4Var.close();
                            throw th;
                        } catch (Throwable th5) {
                            kke.a(th, th5);
                            throw th;
                        }
                    }
                }
                lc4Var.close();
                th = null;
                if (th != null) {
                    if (z) {
                        ed4Var.f.f(null);
                    }
                    return obj;
                }
                try {
                    throw th;
                } catch (Throwable th6) {
                    th = th6;
                    e = z;
                    this = ed4Var;
                    if (e) {
                    }
                    throw th;
                }
            }
        }
        cd4Var = new cd4(this, ax2Var);
        Object obj3 = cd4Var.d;
        i = cd4Var.f;
        if (i != 0) {
        }
        lc4Var.close();
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
    public final Object b(n83 n83Var, ax2 ax2Var) {
        dd4 dd4Var;
        int i;
        vx2 vx2Var;
        File file;
        uj7 uj7Var;
        is4 is4Var;
        pd4 pd4Var;
        Throwable th;
        pd4 pd4Var2;
        ed4 ed4Var;
        File file2;
        try {
            try {
                try {
                    try {
                        if (ax2Var instanceof dd4) {
                            dd4Var = (dd4) ax2Var;
                            int i2 = dd4Var.h;
                            if ((i2 & TLObject.FLAG_31) != 0) {
                                dd4Var.h = i2 - TLObject.FLAG_31;
                                Object obj = dd4Var.e;
                                i = dd4Var.h;
                                vx2Var = vx2.a;
                                if (i != 0) {
                                    ixe.b(obj);
                                    if (this.e.get()) {
                                        grb.i("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File file3 = this.a;
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            bg.e(file3, "Unable to create parent directories of ");
                                            return null;
                                        }
                                    }
                                    dd4Var.a = this;
                                    dd4Var.b = n83Var;
                                    wj7 wj7Var = this.f;
                                    dd4Var.c = wj7Var;
                                    dd4Var.h = 1;
                                    if (wj7Var.d(dd4Var) != vx2Var) {
                                        uj7Var = wj7Var;
                                        is4Var = n83Var;
                                    }
                                    return vx2Var;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        grb.i("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    pd4Var2 = dd4Var.d;
                                    file2 = (File) dd4Var.c;
                                    uj7Var = (uj7) dd4Var.b;
                                    ed4Var = dd4Var.a;
                                    try {
                                        ixe.b(obj);
                                        try {
                                            pd4Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = ed4Var.a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? j00.g(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + ed4Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((wj7) uj7Var).f(null);
                                        return f9c.a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            pd4Var2.close();
                                        } catch (Throwable th4) {
                                            kke.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                uj7 uj7Var2 = (uj7) dd4Var.c;
                                is4 is4Var2 = (is4) dd4Var.b;
                                ed4 ed4Var2 = dd4Var.a;
                                ixe.b(obj);
                                uj7Var = uj7Var2;
                                this = ed4Var2;
                                is4Var = is4Var2;
                                file = new File(this.a.getAbsolutePath() + ".tmp");
                                s8a s8aVar = this.b;
                                s8aVar.getClass();
                                pd4Var = new pd4(file, s8aVar);
                                dd4Var.a = this;
                                dd4Var.b = uj7Var;
                                dd4Var.c = file;
                                dd4Var.d = pd4Var;
                                dd4Var.h = 2;
                                if (is4Var.invoke(pd4Var, dd4Var) != vx2Var) {
                                    ed4Var = this;
                                    file2 = file;
                                    pd4Var2 = pd4Var;
                                    pd4Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return vx2Var;
                            }
                        }
                        dd4Var.a = this;
                        dd4Var.b = uj7Var;
                        dd4Var.c = file;
                        dd4Var.d = pd4Var;
                        dd4Var.h = 2;
                        if (is4Var.invoke(pd4Var, dd4Var) != vx2Var) {
                        }
                        return vx2Var;
                    } catch (Throwable th5) {
                        th = th5;
                        pd4Var2 = pd4Var;
                        pd4Var2.close();
                        throw th;
                    }
                    s8a s8aVar2 = this.b;
                    s8aVar2.getClass();
                    pd4Var = new pd4(file, s8aVar2);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ((wj7) uj7Var).f(null);
                throw th6;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            file = n83Var;
        }
        dd4Var = new dd4(this, ax2Var);
        Object obj2 = dd4Var.e;
        i = dd4Var.h;
        vx2Var = vx2.a;
    }

    @Override // tj2
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
