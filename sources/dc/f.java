package dc;

import a8.ah;
import a8.bh;
import a8.ch;
import a8.fg;
import a8.h0;
import a8.ig;
import a8.kg;
import a8.lg;
import a8.mg;
import a8.ng;
import a8.ob;
import a8.qb;
import a8.r1;
import a8.rb;
import a8.tg;
import a8.wg;
import a8.xg;
import a8.yg;
import a8.zg;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import m.r3;
import o6.l;
import o6.o;
import sb.g;
import sb.j;
import sb.m;
import w7.k5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends sb.e {
    public static final l6.c[] k = {j.c};
    public static final yb.a l = yb.a.a;
    public final Context d;
    public final cc.e e;
    public final kg f;
    public final mg g;
    public boolean h = true;
    public boolean i;
    public wg j;

    public f(g gVar, cc.e eVar, kg kgVar, mg mgVar) {
        l.i(gVar, "MlKitContext can not be null");
        l.i(eVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = eVar;
        this.f = kgVar;
        this.g = mgVar;
    }

    @Override // sb.i
    public final synchronized void b() {
        zg xgVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            l6.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(qb.c, elapsedRealtime);
                throw new ob.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = z6.e.c(this.d, z6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = yg.a;
                    if (b10 == null) {
                        xgVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        xgVar = queryLocalInterface instanceof zg ? (zg) queryLocalInterface : new xg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 0);
                    }
                    y6.b bVar = new y6.b(this.d);
                    this.e.getClass();
                    cc.e eVar = this.e;
                    this.j = ((xg) xgVar).V0(bVar, new ch(false, eVar.a, eVar.b, false, eVar.c));
                }
                try {
                    wg wgVar = this.j;
                    wgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(wgVar.c);
                    wgVar.R0(obtain, 1);
                    f(qb.b, elapsedRealtime);
                } catch (RemoteException e) {
                    f(qb.d, elapsedRealtime);
                    throw new ob.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e10) {
                f(qb.f, elapsedRealtime);
                throw new ob.a("Failed to load subject segmentation module", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // sb.i
    public final synchronized void c() {
        try {
            try {
                wg wgVar = this.j;
                if (wgVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(wgVar.c);
                    wgVar.R0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            kg kgVar = this.f;
            rb rbVar = rb.Q4;
            kgVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (kgVar.d(rbVar, elapsedRealtime)) {
                kgVar.i.put(rbVar, Long.valueOf(elapsedRealtime));
                r3 r3Var = new r3();
                r3Var.c = ob.b;
                m.a.execute(new fg(kgVar, new ng(r3Var, 0), rbVar, kgVar.c(), 0));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // sb.e
    public final Object e(xb.a aVar) {
        Throwable th2;
        y6.b bVar;
        f fVar;
        xb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    wg wgVar = this.j;
                    l.h(wgVar);
                    tg tgVar = new tg(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), k5.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new y6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new ob.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            l.h(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        l.h(bitmap);
                        bVar = new y6.b(bitmap);
                        try {
                            bh V0 = wgVar.V0(bVar, tgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (ah ahVar : V0.a) {
                                    float[] fArr = ahVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new cc.a(ahVar.b, ahVar.c, ahVar.d, ahVar.e, ahVar.f));
                                }
                            }
                            fVar = this;
                            aVar2 = aVar;
                            try {
                                fVar.g(qb.b, elapsedRealtime, this.h, aVar2, V0);
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
                                            fVar.g(qb.e, elapsedRealtime, fVar.h, aVar2, null);
                                            throw new ob.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e10) {
                                        e = e10;
                                    }
                                }
                                return new cc.b(arrayList);
                            } catch (RemoteException e11) {
                                e = e11;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
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

    public final void f(qb qbVar, long j10) {
        this.f.b(new e(this, qbVar, j10), rb.O4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(qb qbVar, long j10, boolean z10, xb.a aVar, bh bhVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new d(this, elapsedRealtime, qbVar, z10, aVar, bhVar), rb.P4);
        Object[] objArr = 0;
        h0 h0Var = new h0(2, false);
        h0Var.d = this.e.a();
        h0Var.b = qbVar;
        h0Var.c = Boolean.valueOf(z10);
        m.a.execute(new ig(this.f, new r1(h0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        mg mgVar = this.g;
        int i10 = qbVar.a;
        synchronized (mgVar) {
            AtomicLong atomicLong = mgVar.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - mgVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            mgVar.a.f(new o(0, Arrays.asList(new o6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new lg((Object) mgVar, elapsedRealtime2, (int) (objArr == true ? 1 : 0)));
        }
    }
}
