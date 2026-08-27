package kb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g7.c9;
import g7.z6;
import i7.ia;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k7.ag;
import k7.dg;
import k7.eg;
import k7.fb;
import k7.fe;
import k7.fg;
import k7.gb;
import k7.gg;
import k7.hb;
import k7.hg;
import k7.i1;
import k7.ig;
import k7.jg;
import k7.vf;
import k7.wf;
import m.t3;
import y5.l;
import y5.o;
import za.g;
import za.j;
import za.m;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends za.e {
    public static final v5.c[] k = {j.c};
    public static final fb.a l = fb.a.a;
    public final Context d;
    public final jb.e e;
    public final wf f;
    public final c9 g;
    public boolean h = true;
    public boolean i;
    public dg j;

    public e(g gVar, jb.e eVar, wf wfVar, c9 c9Var) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f = wfVar;
        this.g = c9Var;
    }

    @Override // za.i
    public final synchronized void b() {
        gg egVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            v5.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(gb.c, elapsedRealtime);
                throw new va.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = j6.e.c(this.d, j6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = fg.a;
                    if (b10 == null) {
                        egVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        egVar = queryLocalInterface instanceof gg ? (gg) queryLocalInterface : new eg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 6);
                    }
                    i6.b bVar = new i6.b(this.d);
                    this.e.getClass();
                    jb.e eVar = this.e;
                    this.j = ((eg) egVar).U0(bVar, new jg(false, eVar.a, eVar.b, false, eVar.c));
                }
                try {
                    dg dgVar = this.j;
                    dgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(dgVar.c);
                    dgVar.Q0(obtain, 1);
                    f(gb.b, elapsedRealtime);
                } catch (RemoteException e9) {
                    f(gb.d, elapsedRealtime);
                    throw new va.a("Failed to init module subject segmenter", e9);
                }
            } catch (Exception e10) {
                f(gb.f, elapsedRealtime);
                throw new va.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // za.i
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
                m.a.execute(new bf.e(wfVar, new b6.a(t3Var, 0), hbVar, wfVar.c(), false, 6));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // za.e
    public final Object e(eb.a aVar) {
        Throwable th;
        i6.b bVar;
        e eVar;
        eb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dg dgVar = this.j;
                    l.h(dgVar);
                    ag agVar = new ag(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), z6.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new i6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new va.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        l.h(bitmap);
                        bVar = new i6.b(bitmap);
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
                                    arrayList.add(new jb.a(hgVar.b, hgVar.c, hgVar.d, hgVar.e, hgVar.f));
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
                                        } catch (RemoteException e9) {
                                            e = e9;
                                            eVar.g(gb.e, elapsedRealtime, eVar.h, aVar2, null);
                                            throw new va.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new jb.b(arrayList);
                            } catch (RemoteException e11) {
                                e = e11;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
                            eVar = this;
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
        this.f.b(new vf() { // from class: kb.d
            @Override // k7.vf
            public final b6.a zza() {
                t3 t3Var = new t3();
                t3Var.c = fb.b;
                j9.a aVar = new j9.a(6, false);
                aVar.d = e.this.e.a();
                aVar.b = gbVar;
                aVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                t3Var.e = new fe(aVar);
                return new b6.a(t3Var, 0);
            }
        }, hb.K4);
    }

    public final void g(gb gbVar, long j10, boolean z10, eb.a aVar, ig igVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new k.j(this, elapsedRealtime, gbVar, z10, aVar, igVar), hb.L4);
        j9.a aVar2 = new j9.a(4, false);
        aVar2.d = this.e.a();
        aVar2.b = gbVar;
        aVar2.c = Boolean.valueOf(z10);
        m.a.execute(new ia(this.f, new i1(aVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        c9 c9Var = this.g;
        int i10 = gbVar.a;
        synchronized (c9Var) {
            AtomicLong atomicLong = c9Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - c9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            c9Var.a.f(new o(0, Arrays.asList(new y5.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(c9Var, elapsedRealtime2, 5));
        }
    }
}
