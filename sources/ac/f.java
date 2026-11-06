package ac;

import a8.pa;
import a8.qa;
import a8.ua;
import a8.va;
import a8.wa;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Log;
import c8.bg;
import c8.cg;
import c8.db;
import c8.dg;
import c8.eb;
import c8.eg;
import c8.fb;
import c8.fg;
import c8.gg;
import c8.h1;
import c8.hg;
import c8.uf;
import c8.wc;
import c8.yf;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import pb.g;
import pb.j;
import q6.k;
import q6.m;
import q6.p;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends pb.e {
    public static final n6.c[] k = {j.c};
    public static final vb.a l = vb.a.a;
    public final Context d;
    public final zb.d e;
    public final uf f;
    public final va g;
    public boolean h = true;
    public boolean i;
    public bg j;

    public f(g gVar, zb.d dVar, uf ufVar, va vaVar) {
        m.h(gVar, "MlKitContext can not be null");
        m.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = dVar;
        this.f = ufVar;
        this.g = vaVar;
    }

    @Override // pb.i
    public final synchronized void b() {
        eg cgVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            n6.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(eb.c, elapsedRealtime);
                throw new lb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = b7.f.c(this.d, b7.f.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i7 = dg.a;
                    if (b10 == null) {
                        cgVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        cgVar = queryLocalInterface instanceof eg ? (eg) queryLocalInterface : new cg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 1);
                    }
                    a7.b bVar = new a7.b(this.d);
                    this.e.getClass();
                    zb.d dVar = this.e;
                    this.j = ((cg) cgVar).X0(bVar, new hg(false, dVar.a, dVar.b, false, dVar.c));
                }
                try {
                    bg bgVar = this.j;
                    bgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(bgVar.c);
                    bgVar.T0(obtain, 1);
                    f(eb.b, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(eb.d, elapsedRealtime);
                    throw new lb.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(eb.f, elapsedRealtime);
                throw new lb.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // pb.i
    public final synchronized void c() {
        try {
            try {
                bg bgVar = this.j;
                if (bgVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(bgVar.c);
                    bgVar.T0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            uf ufVar = this.f;
            fb fbVar = fb.Q4;
            ufVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ufVar.d(fbVar, elapsedRealtime)) {
                ufVar.i.put(fbVar, Long.valueOf(elapsedRealtime));
                ga.d dVar = new ga.d(1);
                dVar.d = db.b;
                pb.m.a.execute(new pa(ufVar, new wa(dVar, 0), fbVar, ufVar.c(), 1));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // pb.e
    public final Object e(ub.a aVar) {
        Throwable th2;
        a7.b bVar;
        f fVar;
        ub.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bg bgVar = this.j;
                    m.g(bgVar);
                    yf yfVar = new yf(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), wc.a(aVar.d));
                    int i7 = aVar.e;
                    try {
                        if (i7 != -1) {
                            if (i7 != 17) {
                                if (i7 == 35) {
                                    bVar = new a7.b(null);
                                } else if (i7 != 842094169) {
                                    throw new lb.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            m.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        m.g(bitmap);
                        bVar = new a7.b(bitmap);
                        try {
                            gg X0 = bgVar.X0(bVar, yfVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (fg fgVar : X0.a) {
                                    float[] fArr = fgVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new zb.a(fgVar.b, fgVar.c, fgVar.d, fgVar.e, fgVar.f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(eb.b, elapsedRealtime, this.h, aVar2, X0);
                                fVar.h = false;
                                float[] fArr2 = X0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            fVar.g(eb.e, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new lb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new zb.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
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

    public final void f(eb ebVar, long j3) {
        this.f.b(new e(this, ebVar, j3), fb.O4);
    }

    public final void g(eb ebVar, long j3, boolean z9, ub.a aVar, gg ggVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.f.b(new d(this, elapsedRealtime, ebVar, z9, aVar, ggVar), fb.P4);
        a0 a0Var = new a0(16, false);
        a0Var.d = this.e.a();
        a0Var.b = ebVar;
        a0Var.c = Boolean.valueOf(z9);
        pb.m.a.execute(new qa(this.f, new h1(a0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - elapsedRealtime;
        va vaVar = this.g;
        int i7 = ebVar.a;
        synchronized (vaVar) {
            AtomicLong atomicLong = vaVar.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - vaVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            vaVar.a.f(new p(0, Arrays.asList(new k(24336, i7, 0, j10, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ua(vaVar, elapsedRealtime2, 1));
        }
    }
}
