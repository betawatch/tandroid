package jb;

import a5.j;
import ab.h;
import ag.j2;
import android.graphics.Bitmap;
import android.os.SystemClock;
import bg.c2;
import c2.p;
import h7.b9;
import h7.r8;
import j7.j7;
import j7.ja;
import j7.k7;
import j7.l8;
import j7.la;
import j7.m7;
import j7.m8;
import j7.n8;
import j7.q;
import j7.s;
import j7.s7;
import j7.t7;
import j7.u7;
import j7.w;
import j7.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import z5.l;
import z5.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends ab.f {
    public boolean d = true;
    public final n8 e;
    public final b f;
    public final la g;
    public final b9 h;

    public f(ib.b bVar, b bVar2, la laVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f = bVar2;
        this.g = laVar;
        ha.c cVar = new ha.c(20);
        cVar.b = Float.valueOf(bVar.a);
        this.e = new n8(cVar);
        this.h = new b9(h.c().b(), 1);
    }

    @Override // ab.j
    public final synchronized void b() {
        this.f.zzb();
        la laVar = this.g;
        c2 c2Var = new c2();
        c2Var.c = s7.b;
        g9.l lVar = new g9.l(12, (byte) 0);
        lVar.b = this.e;
        q qVar = s.b;
        Object[] objArr = {t7.b};
        r8.a(1, objArr);
        lVar.c = new w(1, objArr);
        c2Var.d = new m8(lVar);
        ab.q.a.execute(new p(laVar, new j2(c2Var, 0), u7.e, laVar.b(), false, 5));
    }

    @Override // ab.j
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        la laVar = this.g;
        c2 c2Var = new c2();
        c2Var.c = s7.b;
        ab.q.a.execute(new p(laVar, new j2(c2Var, 0), u7.d, laVar.b(), false, 5));
    }

    @Override // ab.f
    public final Object e(fb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(t7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (wa.a e10) {
                f(e10.a == 14 ? t7.c : t7.d, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(t7 t7Var, fb.a aVar, long j10) {
        int i10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        la laVar = this.g;
        u7 u7Var = u7.b;
        laVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (laVar.c(u7Var, elapsedRealtime2)) {
            laVar.i.put(u7Var, Long.valueOf(elapsedRealtime2));
            c2 c2Var = new c2();
            c2Var.c = s7.b;
            androidx.biometric.e eVar = new androidx.biometric.e(24, z10);
            j jVar = new j();
            jVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            jVar.b = t7Var;
            jVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            jVar.d = bool;
            jVar.e = bool;
            eVar.b = new m7(jVar);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.a;
                l.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else {
                if (i11 == 17 || i11 == 842094169) {
                    l.h(null);
                    throw null;
                }
                if (i11 == 35) {
                    l.h(null);
                    throw null;
                }
                i10 = 0;
            }
            g9.l lVar = new g9.l(11, (byte) (objArr2 == true ? 1 : 0));
            lVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? j7.b : j7.d : j7.c : j7.e : j7.f : j7.h;
            lVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            eVar.d = new k7(lVar);
            eVar.c = this.e;
            c2Var.e = new l8(eVar);
            ab.q.a.execute(new p(laVar, new j2(c2Var, 0), u7Var, laVar.b(), false, 5));
        }
        androidx.biometric.e eVar2 = new androidx.biometric.e(23, (boolean) (objArr == true ? 1 : 0));
        eVar2.d = this.e;
        eVar2.b = t7Var;
        eVar2.c = Boolean.valueOf(this.d);
        ab.q.a.execute(new ja(this.g, new w0(eVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        b9 b9Var = this.h;
        int i12 = t7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (b9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (b9Var.b.get() != -1 && elapsedRealtime3 - b9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            b9Var.a.f(new o(0, Arrays.asList(new z5.j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(b9Var, elapsedRealtime3, 3));
        }
    }
}
