package cc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.cast.p;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.s3;
import n6.l;
import n6.o;
import rb.g;
import rb.j;
import rb.m;
import w7.q8;
import x7.da;
import z7.cg;
import z7.fg;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ib;
import z7.ig;
import z7.jb;
import z7.jg;
import z7.kg;
import z7.lg;
import z7.ra;
import z7.yf;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class f extends rb.e {
    public static final k6.c[] k = {j.c};
    public static final xb.a l = xb.a.a;
    public final Context d;
    public final bc.e e;
    public final yf f;
    public final ra g;
    public boolean h = true;
    public boolean i;
    public fg j;

    public f(g gVar, bc.e eVar, yf yfVar, ra raVar) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f = yfVar;
        this.g = raVar;
    }

    @Override // rb.i
    public final synchronized void b() {
        ig ggVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(ib.c, elapsedRealtime);
                throw new nb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = hg.a;
                    if (b10 == null) {
                        ggVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        ggVar = queryLocalInterface instanceof ig ? (ig) queryLocalInterface : new gg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 11);
                    }
                    x6.b bVar = new x6.b(this.d);
                    this.e.getClass();
                    bc.e eVar = this.e;
                    this.j = ((gg) ggVar).V0(bVar, new lg(false, eVar.a, eVar.b, false, eVar.c));
                }
                try {
                    fg fgVar = this.j;
                    fgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(fgVar.c);
                    fgVar.R0(obtain, 1);
                    f(ib.b, elapsedRealtime);
                } catch (RemoteException e) {
                    f(ib.d, elapsedRealtime);
                    throw new nb.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e7) {
                f(ib.f, elapsedRealtime);
                throw new nb.a("Failed to load subject segmentation module", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // rb.i
    public final synchronized void c() {
        try {
            try {
                fg fgVar = this.j;
                if (fgVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(fgVar.c);
                    fgVar.R0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            yf yfVar = this.f;
            jb jbVar = jb.Q4;
            yfVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (yfVar.d(jbVar, elapsedRealtime)) {
                yfVar.i.put(jbVar, Long.valueOf(elapsedRealtime));
                s3 s3Var = new s3();
                s3Var.c = hb.b;
                m.a.execute(new p(yfVar, new a5.a(s3Var, 0), jbVar, yfVar.c(), 8));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // rb.e
    public final Object e(wb.a aVar) {
        Throwable th2;
        x6.b bVar;
        f fVar;
        wb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    fg fgVar = this.j;
                    l.h(fgVar);
                    cg cgVar = new cg(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), q8.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new x6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new nb.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        l.h(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            kg V0 = fgVar.V0(bVar, cgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (jg jgVar : V0.a) {
                                    float[] fArr = jgVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new bc.a(jgVar.b, jgVar.c, jgVar.d, jgVar.e, jgVar.f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(ib.b, elapsedRealtime, this.h, aVar2, V0);
                                fVar.h = false;
                                float[] fArr2 = V0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            fVar.g(ib.e, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new nb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                    }
                                }
                                return new bc.b(arrayList);
                            } catch (RemoteException e10) {
                                e = e10;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            fVar = this;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void f(ib ibVar, long j10) {
        this.f.b(new e(this, ibVar, j10), jb.O4);
    }

    public final void g(ib ibVar, long j10, boolean z10, wb.a aVar, kg kgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new d(this, elapsedRealtime, ibVar, z10, aVar, kgVar), jb.P4);
        u2.c cVar = new u2.c(17, false);
        cVar.d = this.e.a();
        cVar.b = ibVar;
        cVar.c = Boolean.valueOf(z10);
        m.a.execute(new da(this.f, new i1(cVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        ra raVar = this.g;
        int i10 = ibVar.a;
        synchronized (raVar) {
            AtomicLong atomicLong = (AtomicLong) raVar.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - ((AtomicLong) raVar.b).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((p6.b) raVar.a).f(new o(0, Arrays.asList(new n6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ad.d(raVar, elapsedRealtime2, 10));
        }
    }
}
