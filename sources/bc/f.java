package bc;

import a8.fg;
import a8.ig;
import a8.lg;
import a8.me;
import a8.mg;
import a8.ng;
import aa.m0;
import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import m4.w1;
import o6.j;
import o6.l;
import o6.o;
import org.telegram.tgnet.ConnectionsManager;
import sb.m;
import w7.f5;
import w7.h6;
import y7.b7;
import y7.c7;
import y7.ca;
import y7.d8;
import y7.e7;
import y7.e8;
import y7.f8;
import y7.k7;
import y7.l7;
import y7.m7;
import y7.n;
import y7.q0;
import y7.r;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends sb.e {
    public boolean d = true;
    public final f8 e;
    public final b f;
    public final ca g;
    public final mg h;

    public f(ac.b bVar, b bVar2, ca caVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f = bVar2;
        this.g = caVar;
        h6 h6Var = new h6();
        h6Var.a = Float.valueOf(bVar.a);
        this.e = new f8(h6Var);
        this.h = new mg(sb.g.c().b(), 1);
    }

    @Override // sb.i
    public final synchronized void b() {
        this.f.zzb();
        ca caVar = this.g;
        m0 m0Var = new m0();
        m0Var.c = k7.b;
        w1 w1Var = new w1(28, (byte) 0);
        w1Var.b = this.e;
        y7.l lVar = n.b;
        Object[] objArr = {l7.b};
        f5.a(1, objArr);
        w1Var.c = new r(1, objArr);
        m0Var.d = new e8(w1Var);
        m.a.execute(new fg(caVar, new ng(m0Var, 0), m7.e, caVar.b(), 8));
    }

    @Override // sb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        ca caVar = this.g;
        m0 m0Var = new m0();
        m0Var.c = k7.b;
        m.a.execute(new fg(caVar, new ng(m0Var, 0), m7.d, caVar.b(), 8));
    }

    @Override // sb.e
    public final Object e(xb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(l7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (ob.a e) {
                f(e.a == 14 ? l7.c : l7.d, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(l7 l7Var, xb.a aVar, long j10) {
        int i10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ca caVar = this.g;
        m7 m7Var = m7.b;
        caVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z10 = false;
        if (caVar.c(m7Var, elapsedRealtime2)) {
            caVar.i.put(m7Var, Long.valueOf(elapsedRealtime2));
            m0 m0Var = new m0();
            m0Var.c = k7.b;
            s4.d dVar = new s4.d(18, z10);
            me meVar = new me();
            meVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            meVar.b = l7Var;
            meVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            meVar.d = bool;
            meVar.e = bool;
            dVar.b = new e7(meVar);
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
            m4.c cVar = new m4.c(27, z10);
            cVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? b7.b : b7.d : b7.c : b7.e : b7.f : b7.h;
            cVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            dVar.d = new c7(cVar);
            dVar.c = this.e;
            m0Var.e = new d8(dVar);
            m.a.execute(new fg(caVar, new ng(m0Var, 0), m7Var, caVar.b(), 8));
        }
        s4.d dVar2 = new s4.d(17, z10);
        dVar2.d = this.e;
        dVar2.b = l7Var;
        dVar2.c = Boolean.valueOf(this.d);
        m.a.execute(new ig(this.g, new q0(dVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        mg mgVar = this.h;
        int i12 = l7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (mgVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (mgVar.b.get() != -1 && elapsedRealtime3 - mgVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            mgVar.a.f(new o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new lg(mgVar, elapsedRealtime3, 11));
        }
    }
}
