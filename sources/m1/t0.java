package m1;

import a8.ab;
import c8.mb;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class t0 implements m0 {
    public final id.h a;
    public final File b;
    public final ce.b c;
    public final String d;
    public final String e;
    public final String f;
    public final ie.d g;
    public final gd.i h;
    public final gd.i i;

    public t0(id.h context, File file) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(file, "file");
        this.a = context;
        this.b = file;
        Object obj = v0.b;
        this.c = new ce.b(new de.c(file, (id.c) null, 5), id.i.a, -2, be.a.a, 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new ie.d();
        this.h = ab.b(new q0(this, 1));
        this.i = ab.b(new q0(this, 0));
    }

    public static final void f(t0 t0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:15:0x00dd, B:24:0x00f8, B:25:0x00fb), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:15:0x00dd, B:24:0x00f8, B:25:0x00fb), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v0, types: [rd.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, m1.s0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ie.d] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // m1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rd.p pVar, kd.c cVar) {
        ?? r32;
        ?? r52;
        String message;
        FileLock fileLock;
        FileLock fileLock2;
        ie.d dVar;
        boolean z9;
        FileInputStream fileInputStream;
        ie.d dVar2;
        boolean z10;
        ?? r22 = pVar;
        try {
            try {
                if (cVar instanceof s0) {
                    s0 s0Var = (s0) cVar;
                    int i7 = s0Var.h;
                    if ((i7 & TLObject.FLAG_31) != 0) {
                        s0Var.h = i7 - TLObject.FLAG_31;
                        r32 = s0Var;
                        Object obj = r32.e;
                        jd.a aVar = jd.a.a;
                        r52 = r32.h;
                        if (r52 == 0) {
                            if (r52 == 1) {
                                z10 = r32.d;
                                dVar2 = r32.a;
                                af.b.c(obj);
                                if (z10) {
                                    dVar2.f(null);
                                }
                                return obj;
                            }
                            if (r52 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z9 = r32.d;
                            fileLock2 = r32.c;
                            fileInputStream = r32.b;
                            dVar = r32.a;
                            try {
                                af.b.c(obj);
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                mb.a(fileInputStream, null);
                                if (z9) {
                                    dVar.f(null);
                                }
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileLock2 != null) {
                                }
                                throw th;
                            }
                        }
                        af.b.c(obj);
                        ie.d dVar3 = this.g;
                        boolean e10 = dVar3.e();
                        try {
                            if (e10) {
                                FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                                try {
                                    try {
                                        fileLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                    } catch (IOException e11) {
                                        String message2 = e11.getMessage();
                                        if ((message2 == null || !xd.l.d(message2, this.f)) && ((message = e11.getMessage()) == null || !xd.l.d(message, "Resource deadlock would occur"))) {
                                            throw e11;
                                        }
                                        fileLock = null;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileLock2 = null;
                                    if (fileLock2 != null) {
                                        fileLock2.release();
                                    }
                                    throw th;
                                }
                                try {
                                    Boolean valueOf = Boolean.valueOf(fileLock != null);
                                    r32.a = dVar3;
                                    r32.b = fileInputStream2;
                                    r32.c = fileLock;
                                    r32.d = e10;
                                    r32.h = 2;
                                    obj = r22.invoke(valueOf, r32);
                                    if (obj != aVar) {
                                        dVar = dVar3;
                                        z9 = e10;
                                        fileInputStream = fileInputStream2;
                                        fileLock2 = fileLock;
                                        if (fileLock2 != null) {
                                        }
                                        mb.a(fileInputStream, null);
                                        if (z9) {
                                        }
                                        return obj;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileLock2 = fileLock;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                Boolean bool = Boolean.FALSE;
                                r32.a = dVar3;
                                r32.d = e10;
                                r32.h = 1;
                                obj = r22.invoke(bool, r32);
                                if (obj != aVar) {
                                    dVar2 = dVar3;
                                    z10 = e10;
                                    if (z10) {
                                    }
                                    return obj;
                                }
                            }
                            return aVar;
                        } catch (Throwable th5) {
                            th = th5;
                            r32 = dVar3;
                            r22 = e10;
                            if (r22 != 0) {
                            }
                            throw th;
                        }
                    }
                }
                if (r52 == 0) {
                }
            } catch (Throwable th6) {
                Object obj2 = r32;
                try {
                    throw th6;
                } catch (Throwable th7) {
                    try {
                        mb.a(r52, th6);
                        throw th7;
                    } catch (Throwable th8) {
                        th = th8;
                        r22 = r22;
                        r32 = obj2;
                        if (r22 != 0) {
                            r32.f(null);
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
        }
        r32 = new s0(this, cVar);
        Object obj3 = r32.e;
        jd.a aVar2 = jd.a.a;
        r52 = r32.h;
    }

    @Override // m1.m0
    public final Object b(kd.c cVar) {
        if (this.i.b == gd.j.a) {
            return zd.b0.y(this.a, new p0(this, null, 0), cVar);
        }
        return new Integer(z0.b.nativeGetCounterValue(((z0) this.i.getValue()).a));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:16:0x00bb, B:30:0x00db, B:31:0x00de), top: B:7:0x0022, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:16:0x00bb, B:30:0x00db, B:31:0x00de), top: B:7:0x0022, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, jd.a] */
    @Override // m1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rd.l lVar, kd.c cVar) {
        r0 r0Var;
        Object obj;
        ?? r12;
        int i7;
        t0 t0Var;
        Throwable th2;
        Object a10;
        rd.l lVar2;
        Closeable closeable;
        Object obj2;
        Object obj3;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        Closeable closeable2;
        Object obj4;
        Object obj5;
        try {
            try {
                try {
                    if (cVar instanceof r0) {
                        r0Var = (r0) cVar;
                        int i10 = r0Var.f;
                        if ((i10 & TLObject.FLAG_31) != 0) {
                            r0Var.f = i10 - TLObject.FLAG_31;
                            obj = r0Var.d;
                            r12 = jd.a.a;
                            i7 = r0Var.f;
                            if (i7 != 0) {
                                af.b.c(obj);
                                r0Var.a = this;
                                r0Var.b = lVar;
                                ie.d dVar = this.g;
                                r0Var.c = dVar;
                                r0Var.f = 1;
                                if (dVar.d(r0Var) != r12) {
                                    t0Var = this;
                                    obj = dVar;
                                }
                                return r12;
                            }
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    fileLock = (FileLock) r0Var.c;
                                    closeable2 = (Closeable) r0Var.b;
                                    obj5 = (ie.a) r0Var.a;
                                    try {
                                        af.b.c(obj);
                                        obj4 = obj;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        try {
                                            mb.a(closeable2, null);
                                            ((ie.d) obj5).f(null);
                                            return obj4;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj = obj5;
                                            ((ie.d) obj).f(null);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        if (fileLock != null) {
                                        }
                                        throw th2;
                                    }
                                }
                                closeable = (Closeable) r0Var.c;
                                obj2 = (ie.a) r0Var.b;
                                lVar2 = (rd.l) r0Var.a;
                                try {
                                    af.b.c(obj);
                                    obj3 = obj;
                                    fileLock2 = (FileLock) obj3;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    fileLock = null;
                                    if (fileLock != null) {
                                    }
                                    throw th2;
                                }
                                try {
                                    r0Var.a = obj2;
                                    r0Var.b = closeable;
                                    r0Var.c = fileLock2;
                                    r0Var.f = 3;
                                    invoke = lVar2.invoke(r0Var);
                                    if (invoke != r12) {
                                        closeable2 = closeable;
                                        fileLock = fileLock2;
                                        obj4 = invoke;
                                        obj5 = obj2;
                                        if (fileLock != null) {
                                        }
                                        mb.a(closeable2, null);
                                        ((ie.d) obj5).f(null);
                                        return obj4;
                                    }
                                    return r12;
                                } catch (Throwable th6) {
                                    fileLock = fileLock2;
                                    th2 = th6;
                                    if (fileLock != null) {
                                    }
                                    throw th2;
                                }
                            }
                            ie.a aVar = (ie.a) r0Var.c;
                            rd.l lVar3 = (rd.l) r0Var.b;
                            t0Var = (t0) r0Var.a;
                            af.b.c(obj);
                            obj = aVar;
                            lVar = lVar3;
                            FileOutputStream fileOutputStream = new FileOutputStream((File) t0Var.h.getValue());
                            r0Var.a = lVar;
                            r0Var.b = obj;
                            r0Var.c = fileOutputStream;
                            r0Var.f = 2;
                            a10 = h1.a(fileOutputStream, r0Var);
                            if (a10 != r12) {
                                lVar2 = lVar;
                                closeable = fileOutputStream;
                                obj2 = obj;
                                obj3 = a10;
                                fileLock2 = (FileLock) obj3;
                                r0Var.a = obj2;
                                r0Var.b = closeable;
                                r0Var.c = fileLock2;
                                r0Var.f = 3;
                                invoke = lVar2.invoke(r0Var);
                                if (invoke != r12) {
                                }
                            }
                            return r12;
                        }
                    }
                    r0Var.a = lVar;
                    r0Var.b = obj;
                    r0Var.c = fileOutputStream;
                    r0Var.f = 2;
                    a10 = h1.a(fileOutputStream, r0Var);
                    if (a10 != r12) {
                    }
                    return r12;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream((File) t0Var.h.getValue());
            } catch (Throwable th8) {
                th = th8;
                ((ie.d) obj).f(null);
                throw th;
            }
            if (i7 != 0) {
            }
        } catch (Throwable th9) {
            obj = r0Var;
            try {
                throw th9;
            } catch (Throwable th10) {
                mb.a(r12, th9);
                throw th10;
            }
        }
        r0Var = new r0(this, cVar);
        obj = r0Var.d;
        r12 = jd.a.a;
        i7 = r0Var.f;
    }

    @Override // m1.m0
    public final ce.c d() {
        return this.c;
    }

    @Override // m1.m0
    public final Object e(a0 a0Var) {
        if (this.i.b == gd.j.a) {
            return zd.b0.y(this.a, new p0(this, null, 1), a0Var);
        }
        return new Integer(z0.b.nativeIncrementAndGetCounterValue(((z0) this.i.getValue()).a));
    }
}
