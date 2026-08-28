package jb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import f7.d9;
import f7.z6;
import h7.ia;
import j7.ag;
import j7.dg;
import j7.eg;
import j7.fb;
import j7.fe;
import j7.fg;
import j7.gb;
import j7.gg;
import j7.hb;
import j7.hg;
import j7.i1;
import j7.ig;
import j7.jg;
import j7.vf;
import j7.wf;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.t3;
import x5.l;
import x5.o;
import ya.g;
import ya.j;
import ya.m;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends ya.e {
    public static final u5.c[] k = {j.c};
    public static final eb.a l = eb.a.a;
    public final Context d;
    public final ib.e e;
    public final wf f;
    public final d9 g;
    public boolean h = true;
    public boolean i;
    public dg j;

    public f(g gVar, ib.e eVar, wf wfVar, d9 d9Var) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f = wfVar;
        this.g = d9Var;
    }

    @Override // ya.i
    public final synchronized void b() {
        gg egVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            u5.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(gb.c, elapsedRealtime);
                throw new ua.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = i6.e.c(this.d, i6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i9 = fg.a;
                    if (b10 == null) {
                        egVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        egVar = queryLocalInterface instanceof gg ? (gg) queryLocalInterface : new eg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                    }
                    h6.b bVar = new h6.b(this.d);
                    this.e.getClass();
                    ib.e eVar = this.e;
                    this.j = ((eg) egVar).U0(bVar, new jg(false, eVar.a, eVar.b, false, eVar.c));
                }
                try {
                    dg dgVar = this.j;
                    dgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(dgVar.c);
                    dgVar.Q0(obtain, 1);
                    f(gb.b, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(gb.d, elapsedRealtime);
                    throw new ua.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(gb.f, elapsedRealtime);
                throw new ua.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ya.i
    public final synchronized void c() {
        try {
            try {
                dg dgVar = this.j;
                if (dgVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(dgVar.c);
                    dgVar.Q0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            wf wfVar = this.f;
            hb hbVar = hb.M4;
            wfVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (wfVar.d(hbVar, elapsedRealtime)) {
                wfVar.i.put(hbVar, Long.valueOf(elapsedRealtime));
                t3 t3Var = new t3();
                t3Var.c = fb.b;
                m.a.execute(new af.f(wfVar, new a6.a(t3Var, 0), hbVar, wfVar.c(), false, 6));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // ya.e
    public final Object e(db.a aVar) {
        Throwable th;
        h6.b bVar;
        f fVar;
        db.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), z6.a(aVar.d));
                    int i9 = aVar.e;
                    try {
                        if (i9 != -1) {
                            if (i9 != 17) {
                                if (i9 == 35) {
                                    bVar = new h6.b(null);
                                } else if (i9 != 842094169) {
                                    throw new ua.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        l.h(bitmap);
                        bVar = new h6.b(bitmap);
                        try {
                            ig U0 = dgVar.U0(bVar, agVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (hg hgVar : U0.a) {
                                    float[] fArr = hgVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new ib.a(hgVar.b, hgVar.c, hgVar.d, hgVar.e, hgVar.f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(gb.b, elapsedRealtime, this.h, aVar2, U0);
                                fVar.h = false;
                                float[] fArr2 = U0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            fVar.g(gb.e, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new ua.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new ib.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
                            fVar = this;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void f(final gb gbVar, final long j10) {
        this.f.b(new vf() { // from class: jb.e
            @Override // j7.vf
            public final a6.a zza() {
                t3 t3Var = new t3();
                t3Var.c = fb.b;
                j4.c cVar = new j4.c(5, false);
                cVar.d = f.this.e.a();
                cVar.b = gbVar;
                cVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                t3Var.e = new fe(cVar);
                return new a6.a(t3Var, 0);
            }
        }, hb.K4);
    }

    public final void g(gb gbVar, long j10, boolean z10, db.a aVar, ig igVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new d(this, elapsedRealtime, gbVar, z10, aVar, igVar), hb.L4);
        j4.c cVar = new j4.c(3, false);
        cVar.d = this.e.a();
        cVar.b = gbVar;
        cVar.c = Boolean.valueOf(z10);
        m.a.execute(new ia(this.f, new i1(cVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        d9 d9Var = this.g;
        int i9 = gbVar.a;
        synchronized (d9Var) {
            AtomicLong atomicLong = d9Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - d9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.a.f(new o(0, Arrays.asList(new x5.j(24336, i9, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.d(d9Var, elapsedRealtime2, 5));
        }
    }
}
