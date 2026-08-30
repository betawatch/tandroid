package lb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import b4.e0;
import b6.k;
import b6.m;
import c2.p;
import c5.j;
import cb.h;
import cb.o;
import j7.d9;
import j7.i6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import l7.j7;
import l7.ja;
import l7.k7;
import l7.l8;
import l7.la;
import l7.m7;
import l7.m8;
import l7.n8;
import l7.q;
import l7.s;
import l7.s7;
import l7.t7;
import l7.u7;
import l7.w;
import l7.w0;
import l7.x0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends cb.f {
    public boolean d = true;
    public final n8 e;
    public final b f;
    public final la g;
    public final d9 h;

    public f(kb.b bVar, b bVar2, la laVar) {
        m.i(bVar, "ImageLabelerOptions can not be null");
        this.f = bVar2;
        this.g = laVar;
        i6 i6Var = new i6();
        i6Var.a = Float.valueOf(bVar.a);
        this.e = new n8(i6Var);
        this.h = new d9(h.c().b(), 1);
    }

    @Override // cb.j
    public final synchronized void b() {
        this.f.zzb();
        la laVar = this.g;
        a9.a aVar = new a9.a();
        aVar.c = s7.b;
        f7.b bVar = new f7.b((char) 0, 25);
        bVar.b = this.e;
        q qVar = s.b;
        Object[] objArr = {t7.b};
        k7.g.a(1, objArr);
        bVar.c = new w(1, objArr);
        aVar.d = new m8(bVar);
        o.a.execute(new p(laVar, new e0(aVar, 0), u7.e, laVar.b(), false, 6));
    }

    @Override // cb.j
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        la laVar = this.g;
        a9.a aVar = new a9.a();
        aVar.c = s7.b;
        o.a.execute(new p(laVar, new e0(aVar, 0), u7.d, laVar.b(), false, 6));
    }

    @Override // cb.f
    public final Object e(hb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(t7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (ya.a e) {
                f(e.a == 14 ? t7.c : t7.d, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(t7 t7Var, hb.a aVar, long j10) {
        int i10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        la laVar = this.g;
        u7 u7Var = u7.b;
        laVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z4 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (laVar.c(u7Var, elapsedRealtime2)) {
            laVar.i.put(u7Var, Long.valueOf(elapsedRealtime2));
            a9.a aVar2 = new a9.a();
            aVar2.c = s7.b;
            w0 w0Var = new w0(2, z4);
            j jVar = new j();
            jVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            jVar.b = t7Var;
            jVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            jVar.d = bool;
            jVar.e = bool;
            w0Var.b = new m7(jVar);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.a;
                m.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else {
                if (i11 == 17 || i11 == 842094169) {
                    m.h(null);
                    throw null;
                }
                if (i11 == 35) {
                    m.h(null);
                    throw null;
                }
                i10 = 0;
            }
            f7.b bVar = new f7.b((char) (objArr2 == true ? 1 : 0), 24);
            bVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? j7.b : j7.d : j7.c : j7.e : j7.f : j7.h;
            bVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            w0Var.d = new k7(bVar);
            w0Var.c = this.e;
            aVar2.e = new l8(w0Var);
            o.a.execute(new p(laVar, new e0(aVar2, 0), u7Var, laVar.b(), false, 6));
        }
        w0 w0Var2 = new w0(1, (boolean) (objArr == true ? 1 : 0));
        w0Var2.d = this.e;
        w0Var2.b = t7Var;
        w0Var2.c = Boolean.valueOf(this.d);
        o.a.execute(new ja(this.g, new x0(w0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.h;
        int i12 = t7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.b.get() != -1 && elapsedRealtime3 - d9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.a.f(new b6.p(0, Arrays.asList(new k(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime3, 4));
        }
    }
}
