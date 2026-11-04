package l1;

import android.os.Build;
import b8.gb;
import b8.ib;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i0 implements a {
    public final File a;
    public final z0 b;
    public final m0 c;
    public final androidx.lifecycle.k0 d;
    public final AtomicBoolean e;
    public final fe.d f;

    public i0(File file, z0 serializer, m0 coordinator, androidx.lifecycle.k0 k0Var) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.a = file;
        this.b = serializer;
        this.c = coordinator;
        this.d = k0Var;
        this.e = new AtomicBoolean(false);
        this.f = new fe.d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|14|15|16|(2:(1:19)|20)(1:22)))|56|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:22:0x007a, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [l1.i0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l1.g0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [l1.i0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n nVar, hd.c cVar) {
        ?? r02;
        int i3;
        Throwable th2;
        d0 d0Var;
        boolean z10;
        i0 i0Var;
        try {
            if (cVar instanceof g0) {
                g0 g0Var = (g0) cVar;
                int i10 = g0Var.f;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    g0Var.f = i10 - TLObject.FLAG_31;
                    r02 = g0Var;
                    Object obj = r02.d;
                    gd.a aVar = gd.a.a;
                    i3 = r02.f;
                    if (i3 != 0) {
                        ib.b(obj);
                        if (this.e.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean e10 = this.f.e();
                        try {
                            d0 d0Var2 = new d0(this.a, this.b);
                            try {
                                Boolean valueOf = Boolean.valueOf(e10);
                                r02.a = this;
                                r02.b = d0Var2;
                                r02.c = e10;
                                r02.f = 1;
                                Object a10 = nVar.a(d0Var2, valueOf, r02);
                                if (a10 == aVar) {
                                    return aVar;
                                }
                                obj = a10;
                                z10 = e10;
                                i0Var = this;
                                d0Var = d0Var2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                nVar = e10;
                                r02 = this;
                                d0Var = d0Var2;
                                d0Var.close();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            nVar = e10;
                            r02 = this;
                            if (nVar != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar = r02.c;
                        d0Var = r02.b;
                        r02 = r02.a;
                        try {
                            ib.b(obj);
                            i0Var = r02;
                            z10 = nVar;
                        } catch (Throwable th5) {
                            th2 = th5;
                            try {
                                d0Var.close();
                            } catch (Throwable th6) {
                                gb.a(th2, th6);
                            }
                            throw th2;
                        }
                    }
                    d0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z10) {
                        i0Var.f.f(null);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            d0Var.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th7) {
            th = th7;
            if (nVar != 0) {
                r02.f.f(null);
            }
            throw th;
        }
        r02 = new g0(this, cVar);
        Object obj2 = r02.d;
        gd.a aVar2 = gd.a.a;
        i3 = r02.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2 A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TryCatch #2 {IOException -> 0x011f, blocks: (B:19:0x00e2, B:21:0x00e8, B:23:0x00f0, B:26:0x00fc, B:27:0x011c, B:29:0x00f5, B:32:0x012a, B:38:0x0137, B:41:0x0134), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x011f, blocks: (B:19:0x00e2, B:21:0x00e8, B:23:0x00f0, B:26:0x00fc, B:27:0x011c, B:29:0x00f5, B:32:0x012a, B:38:0x0137, B:41:0x0134), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a0 a0Var, hd.c cVar) {
        h0 h0Var;
        gd.a aVar;
        int i3;
        File file;
        i0 i0Var;
        fe.a aVar2;
        od.p pVar;
        k0 k0Var;
        Throwable th2;
        k0 k0Var2;
        File file2;
        i0 i0Var2;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof h0) {
                            h0Var = (h0) cVar;
                            int i10 = h0Var.h;
                            if ((i10 & TLObject.FLAG_31) != 0) {
                                h0Var.h = i10 - TLObject.FLAG_31;
                                Object obj = h0Var.e;
                                aVar = gd.a.a;
                                i3 = h0Var.h;
                                if (i3 != 0) {
                                    ib.b(obj);
                                    if (this.e.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File file3 = this.a;
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file3);
                                        }
                                    }
                                    h0Var.a = this;
                                    h0Var.b = a0Var;
                                    fe.d dVar = this.f;
                                    h0Var.c = dVar;
                                    h0Var.h = 1;
                                    if (dVar.d(h0Var) != aVar) {
                                        i0Var = this;
                                        aVar2 = dVar;
                                        pVar = a0Var;
                                    }
                                    return aVar;
                                }
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    k0Var2 = h0Var.d;
                                    file2 = (File) h0Var.c;
                                    aVar2 = (fe.a) h0Var.b;
                                    i0Var2 = h0Var.a;
                                    try {
                                        ib.b(obj);
                                        try {
                                            k0Var2.close();
                                            th = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = i0Var2.a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? y6.a.e(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + i0Var2.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((fe.d) aVar2).f(null);
                                        return dd.k.a;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        try {
                                            k0Var2.close();
                                        } catch (Throwable th5) {
                                            gb.a(th2, th5);
                                        }
                                        throw th2;
                                    }
                                }
                                fe.a aVar3 = (fe.a) h0Var.c;
                                od.p pVar2 = (od.p) h0Var.b;
                                i0Var = h0Var.a;
                                ib.b(obj);
                                aVar2 = aVar3;
                                pVar = pVar2;
                                file = new File(i0Var.a.getAbsolutePath() + ".tmp");
                                z0 serializer = i0Var.b;
                                kotlin.jvm.internal.j.e(serializer, "serializer");
                                k0Var = new k0(file, serializer);
                                h0Var.a = i0Var;
                                h0Var.b = aVar2;
                                h0Var.c = file;
                                h0Var.d = k0Var;
                                h0Var.h = 2;
                                if (pVar.invoke(k0Var, h0Var) != aVar) {
                                    file2 = file;
                                    i0Var2 = i0Var;
                                    k0Var2 = k0Var;
                                    k0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        h0Var.a = i0Var;
                        h0Var.b = aVar2;
                        h0Var.c = file;
                        h0Var.d = k0Var;
                        h0Var.h = 2;
                        if (pVar.invoke(k0Var, h0Var) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th6) {
                        th2 = th6;
                        k0Var2 = k0Var;
                        k0Var2.close();
                        throw th2;
                    }
                    z0 serializer2 = i0Var.b;
                    kotlin.jvm.internal.j.e(serializer2, "serializer");
                    k0Var = new k0(file, serializer2);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(i0Var.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                ((fe.d) aVar2).f(null);
                throw th7;
            }
            if (i3 != 0) {
            }
        } catch (IOException e11) {
            e = e11;
            file = aVar;
        }
        h0Var = new h0(this, cVar);
        Object obj2 = h0Var.e;
        aVar = gd.a.a;
        i3 = h0Var.h;
    }

    @Override // l1.a
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
