package ib;

import a5.n;
import af.h;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.firebase.messaging.m;
import g7.b8;
import g7.c9;
import i7.i7;
import i7.ia;
import i7.j7;
import i7.k8;
import i7.ka;
import i7.l7;
import i7.l8;
import i7.m8;
import i7.q;
import i7.r7;
import i7.s;
import i7.s7;
import i7.t7;
import i7.w;
import i7.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import y5.j;
import y5.l;
import y5.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends za.e {
    public boolean d = true;
    public final m8 e;
    public final b f;
    public final ka g;
    public final c9 h;

    public f(hb.b bVar, b bVar2, ka kaVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f = bVar2;
        this.g = kaVar;
        ga.c cVar = new ga.c(17, false);
        cVar.b = Float.valueOf(bVar.a);
        this.e = new m8(cVar);
        this.h = new c9(za.g.c().b(), 1);
    }

    @Override // za.i
    public final synchronized void b() {
        this.f.zzb();
        ka kaVar = this.g;
        m mVar = new m();
        mVar.c = r7.b;
        g5.b bVar = new g5.b(9);
        bVar.b = this.e;
        q qVar = s.b;
        Object[] objArr = {s7.b};
        b8.a(1, objArr);
        bVar.c = new w(1, objArr);
        mVar.d = new l8(bVar);
        za.m.a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7.e, kaVar.b(), false, 5));
    }

    @Override // za.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        ka kaVar = this.g;
        m mVar = new m();
        mVar.c = r7.b;
        za.m.a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7.d, kaVar.b(), false, 5));
    }

    @Override // za.e
    public final Object e(eb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(s7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (va.a e9) {
                f(e9.a == 14 ? s7.c : s7.d, aVar, elapsedRealtime);
                throw e9;
            }
        }
        return a2;
    }

    public final void f(s7 s7Var, eb.a aVar, long j10) {
        int i10;
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
            n nVar = new n(24, z11);
            h hVar = new h();
            hVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            hVar.b = s7Var;
            hVar.c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            hVar.d = bool;
            hVar.e = bool;
            nVar.b = new l7(hVar);
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
            g5.b bVar = new g5.b(8);
            bVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? i7.b : i7.d : i7.c : i7.e : i7.f : i7.h;
            bVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            nVar.d = new j7(bVar);
            nVar.c = this.e;
            mVar.e = new k8(nVar);
            z10 = false;
            za.m.a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7Var, kaVar.b(), false, 5));
        } else {
            z10 = false;
        }
        n nVar2 = new n(23, z10);
        nVar2.d = this.e;
        nVar2.b = s7Var;
        nVar2.c = Boolean.valueOf(this.d);
        za.m.a.execute(new ia(this.g, new w0(nVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        c9 c9Var = this.h;
        int i12 = s7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (c9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (c9Var.b.get() != -1 && elapsedRealtime3 - c9Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            c9Var.a.f(new o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(c9Var, elapsedRealtime3, 3));
        }
    }
}
