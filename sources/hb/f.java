package hb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.firebase.messaging.m;
import f7.d9;
import f7.y7;
import h7.i7;
import h7.ia;
import h7.j7;
import h7.k8;
import h7.ka;
import h7.l7;
import h7.l8;
import h7.m8;
import h7.q;
import h7.r7;
import h7.s;
import h7.s7;
import h7.t7;
import h7.w;
import h7.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import x5.j;
import x5.l;
import x5.o;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends ya.e {
    public boolean d = true;
    public final m8 e;
    public final b f;
    public final ka g;
    public final d9 h;

    public f(gb.b bVar, b bVar2, ka kaVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f = bVar2;
        this.g = kaVar;
        xa.c cVar = new xa.c(17);
        cVar.b = Float.valueOf(bVar.a);
        this.e = new m8(cVar);
        this.h = new d9(ya.g.c().b(), 1);
    }

    @Override // ya.i
    public final synchronized void b() {
        this.f.zzb();
        ka kaVar = this.g;
        m mVar = new m();
        mVar.c = r7.b;
        g5.b bVar = new g5.b(6);
        bVar.b = this.e;
        q qVar = s.b;
        Object[] objArr = {s7.b};
        y7.a(1, objArr);
        bVar.c = new w(1, objArr);
        mVar.d = new l8(bVar);
        ya.m.a.execute(new af.f(kaVar, new a6.a(mVar, 0), t7.e, kaVar.b(), false, 5));
    }

    @Override // ya.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        ka kaVar = this.g;
        m mVar = new m();
        mVar.c = r7.b;
        ya.m.a.execute(new af.f(kaVar, new a6.a(mVar, 0), t7.d, kaVar.b(), false, 5));
    }

    @Override // ya.e
    public final Object e(db.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(s7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (ua.a e10) {
                f(e10.a == 14 ? s7.c : s7.d, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a2;
    }

    public final void f(s7 s7Var, db.a aVar, long j10) {
        int i9;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ka kaVar = this.g;
        t7 t7Var = t7.b;
        kaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z11 = false;
        if (kaVar.c(t7Var, elapsedRealtime2)) {
            kaVar.i.put(t7Var, Long.valueOf(elapsedRealtime2));
            m mVar = new m();
            mVar.c = r7.b;
            a5.m mVar2 = new a5.m(24, z11);
            b3.b bVar = new b3.b();
            bVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            bVar.b = s7Var;
            bVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            bVar.d = bool;
            bVar.e = bool;
            mVar2.b = new l7(bVar);
            int i10 = aVar.e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.a;
                l.h(bitmap);
                i9 = bitmap.getAllocationByteCount();
            } else {
                if (i10 == 17 || i10 == 842094169) {
                    l.h(null);
                    throw null;
                }
                if (i10 == 35) {
                    l.h(null);
                    throw null;
                }
                i9 = 0;
            }
            g5.b bVar2 = new g5.b(5);
            bVar2.b = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? i7.b : i7.d : i7.c : i7.e : i7.f : i7.h;
            bVar2.c = Integer.valueOf(i9 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            mVar2.d = new j7(bVar2);
            mVar2.c = this.e;
            mVar.e = new k8(mVar2);
            z10 = false;
            ya.m.a.execute(new af.f(kaVar, new a6.a(mVar, 0), t7Var, kaVar.b(), false, 5));
        } else {
            z10 = false;
        }
        a5.m mVar3 = new a5.m(23, z10);
        mVar3.d = this.e;
        mVar3.b = s7Var;
        mVar3.c = Boolean.valueOf(this.d);
        ya.m.a.execute(new ia(this.g, new w0(mVar3), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.h;
        int i11 = s7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.b.get() != -1 && elapsedRealtime3 - d9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.a.f(new o(0, Arrays.asList(new j(24305, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.d(d9Var, elapsedRealtime3, 3));
        }
    }
}
