package lb;

import ab.f;
import ab.h;
import ab.k;
import ab.q;
import ag.j2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c2.p;
import h7.b9;
import h7.q7;
import j7.ja;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k.j;
import l3.g0;
import l7.ag;
import l7.dg;
import l7.eg;
import l7.fb;
import l7.fe;
import l7.fg;
import l7.gb;
import l7.gg;
import l7.hb;
import l7.hg;
import l7.i1;
import l7.ig;
import l7.jg;
import l7.vf;
import l7.wf;
import m.s3;
import z5.l;
import z5.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends f {
    public static final w5.c[] k = {k.c};
    public static final gb.a l = gb.a.a;
    public final Context d;
    public final kb.e e;
    public final wf f;
    public final b9 g;
    public boolean h = true;
    public boolean i;
    public dg j;

    public e(h hVar, kb.e eVar, wf wfVar, b9 b9Var) {
        l.i(hVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = hVar.b();
        this.e = eVar;
        this.f = wfVar;
        this.g = b9Var;
    }

    @Override // ab.j
    public final synchronized void b() {
        gg egVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            w5.c[] cVarArr = k;
            if (!k.a(context, cVarArr)) {
                if (!this.i) {
                    k.c(this.d, cVarArr);
                    this.i = true;
                }
                f(gb.c, elapsedRealtime);
                throw new wa.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = k6.e.c(this.d, k6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = fg.a;
                    if (b10 == null) {
                        egVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        egVar = queryLocalInterface instanceof gg ? (gg) queryLocalInterface : new eg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                    }
                    j6.b bVar = new j6.b(this.d);
                    this.e.getClass();
                    kb.e eVar = this.e;
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
                    throw new wa.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(gb.f, elapsedRealtime);
                throw new wa.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ab.j
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
                s3 s3Var = new s3();
                s3Var.c = fb.b;
                q.a.execute(new p(wfVar, new j2(s3Var, 0), hbVar, wfVar.c(), false, 7));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // ab.f
    public final Object e(fb.a aVar) {
        Throwable th2;
        j6.b bVar;
        e eVar;
        fb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), q7.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new j6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new wa.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        l.h(bitmap);
                        bVar = new j6.b(bitmap);
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
                                    arrayList.add(new kb.a(hgVar.b, hgVar.c, hgVar.d, hgVar.e, hgVar.f));
                                }
                            }
                            eVar = this;
                            aVar2 = aVar;
                            try {
                                eVar.g(gb.b, elapsedRealtime, this.h, aVar2, U0);
                                eVar.h = false;
                                float[] fArr2 = U0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            eVar.g(gb.e, elapsedRealtime, eVar.h, aVar2, null);
                                            throw new wa.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new kb.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
                            eVar = this;
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

    public final void f(final gb gbVar, final long j10) {
        this.f.b(new vf() { // from class: lb.d
            @Override // l7.vf
            public final j2 zza() {
                s3 s3Var = new s3();
                s3Var.c = fb.b;
                g0 g0Var = new g0(6, false);
                g0Var.d = e.this.e.a();
                g0Var.b = gbVar;
                g0Var.c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                s3Var.e = new fe(g0Var);
                return new j2(s3Var, 0);
            }
        }, hb.K4);
    }

    public final void g(gb gbVar, long j10, boolean z10, fb.a aVar, ig igVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new j(this, elapsedRealtime, gbVar, z10, aVar, igVar), hb.L4);
        g0 g0Var = new g0(4, false);
        g0Var.d = this.e.a();
        g0Var.b = gbVar;
        g0Var.c = Boolean.valueOf(z10);
        q.a.execute(new ja(this.f, new i1(g0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        b9 b9Var = this.g;
        int i10 = gbVar.a;
        synchronized (b9Var) {
            AtomicLong atomicLong = b9Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - b9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            b9Var.a.f(new o(0, Arrays.asList(new z5.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(b9Var, elapsedRealtime2, 5));
        }
    }
}
