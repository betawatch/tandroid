package nb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b4.e0;
import b6.m;
import c2.p;
import cb.f;
import cb.h;
import cb.k;
import cb.o;
import j7.d9;
import j7.f8;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k.j;
import l7.ja;
import l7.w0;
import m.r3;
import n7.bg;
import n7.eg;
import n7.fg;
import n7.gb;
import n7.ge;
import n7.gg;
import n7.hb;
import n7.hg;
import n7.i1;
import n7.ib;
import n7.ig;
import n7.jg;
import n7.kg;
import n7.wf;
import n7.xf;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends f {
    public static final y5.c[] k = {k.c};
    public static final ib.a l = ib.a.a;
    public final Context d;
    public final mb.e e;
    public final xf f;
    public final d9 g;
    public boolean h = true;
    public boolean i;
    public eg j;

    public e(h hVar, mb.e eVar, xf xfVar, d9 d9Var) {
        m.i(hVar, "MlKitContext can not be null");
        m.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = hVar.b();
        this.e = eVar;
        this.f = xfVar;
        this.g = d9Var;
    }

    @Override // cb.j
    public final synchronized void b() {
        hg fgVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            y5.c[] cVarArr = k;
            if (!k.a(context, cVarArr)) {
                if (!this.i) {
                    k.c(this.d, cVarArr);
                    this.i = true;
                }
                f(hb.c, elapsedRealtime);
                throw new ya.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = m6.e.c(this.d, m6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.a;
                    if (b10 == null) {
                        fgVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        fgVar = queryLocalInterface instanceof hg ? (hg) queryLocalInterface : new fg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 7);
                    }
                    l6.b bVar = new l6.b(this.d);
                    this.e.getClass();
                    mb.e eVar = this.e;
                    this.j = ((fg) fgVar).U0(bVar, new kg(false, eVar.a, eVar.b, false, eVar.c));
                }
                try {
                    eg egVar = this.j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.c);
                    egVar.Q0(obtain, 1);
                    f(hb.b, elapsedRealtime);
                } catch (RemoteException e6) {
                    f(hb.d, elapsedRealtime);
                    throw new ya.a("Failed to init module subject segmenter", e6);
                }
            } catch (Exception e10) {
                f(hb.f, elapsedRealtime);
                throw new ya.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // cb.j
    public final synchronized void c() {
        try {
            try {
                eg egVar = this.j;
                if (egVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.c);
                    egVar.Q0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            xf xfVar = this.f;
            ib ibVar = ib.N4;
            xfVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (xfVar.d(ibVar, elapsedRealtime)) {
                xfVar.i.put(ibVar, Long.valueOf(elapsedRealtime));
                r3 r3Var = new r3();
                r3Var.c = gb.b;
                o.a.execute(new p(xfVar, new e0(r3Var, 0), ibVar, xfVar.c(), false, 7));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // cb.f
    public final Object e(hb.a aVar) {
        Throwable th2;
        l6.b bVar;
        e eVar;
        hb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    eg egVar = this.j;
                    m.h(egVar);
                    bg bgVar = new bg(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), f8.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new l6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new ya.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            m.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        m.h(bitmap);
                        bVar = new l6.b(bitmap);
                        try {
                            jg U0 = egVar.U0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (ig igVar : U0.a) {
                                    float[] fArr = igVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new mb.a(igVar.b, igVar.c, igVar.d, igVar.e, igVar.f));
                                }
                            }
                            eVar = this;
                            aVar2 = aVar;
                            try {
                                eVar.g(hb.b, elapsedRealtime, this.h, aVar2, U0);
                                eVar.h = false;
                                float[] fArr2 = U0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e6) {
                                            e = e6;
                                            eVar.g(hb.e, elapsedRealtime, eVar.h, aVar2, null);
                                            throw new ya.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new mb.b(arrayList);
                            } catch (RemoteException e11) {
                                e = e11;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
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

    public final void f(final hb hbVar, final long j10) {
        this.f.b(new wf() { // from class: nb.d
            @Override // n7.wf
            public final e0 zza() {
                r3 r3Var = new r3();
                r3Var.c = gb.b;
                w0 w0Var = new w0(11, false);
                w0Var.d = e.this.e.a();
                w0Var.b = hbVar;
                w0Var.c = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
                r3Var.e = new ge(w0Var);
                return new e0(r3Var, 0);
            }
        }, ib.L4);
    }

    public final void g(hb hbVar, long j10, boolean z4, hb.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new j(this, elapsedRealtime, hbVar, z4, aVar, jgVar), ib.M4);
        w0 w0Var = new w0(9, false);
        w0Var.d = this.e.a();
        w0Var.b = hbVar;
        w0Var.c = Boolean.valueOf(z4);
        o.a.execute(new ja(this.f, new i1(w0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        d9 d9Var = this.g;
        int i10 = hbVar.a;
        synchronized (d9Var) {
            AtomicLong atomicLong = d9Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - d9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.a.f(new b6.p(0, Arrays.asList(new b6.k(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime2, 5));
        }
    }
}
