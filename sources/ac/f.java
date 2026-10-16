package ac;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.messaging.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import m2.t;
import n6.j;
import n6.l;
import org.telegram.tgnet.ConnectionsManager;
import v7.z8;
import w7.k8;
import x7.d7;
import x7.da;
import x7.e7;
import x7.f8;
import x7.fa;
import x7.g7;
import x7.g8;
import x7.h8;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f extends rb.e {
    public boolean d = true;
    public final h8 e;
    public final b f;
    public final fa g;
    public final z8 h;

    public f(zb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f = bVar;
        this.g = faVar;
        v1.b bVar2 = new v1.b();
        bVar2.a = Float.valueOf(aVar.a);
        this.e = new h8(bVar2);
        this.h = new z8(rb.g.c().b(), 1);
    }

    @Override // rb.i
    public final synchronized void b() {
        this.f.zzb();
        fa faVar = this.g;
        m mVar = new m();
        mVar.c = m7.b;
        n3.b bVar = new n3.b(24, false);
        bVar.b = this.e;
        x7.m mVar2 = o.b;
        Object[] objArr = {n7.b};
        k8.a(1, objArr);
        bVar.c = new s(1, objArr);
        mVar.d = new g8(bVar);
        rb.m.a.execute(new p(faVar, new a5.a(mVar, 0), o7.e, faVar.b(), 7));
    }

    @Override // rb.i
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        fa faVar = this.g;
        m mVar = new m();
        mVar.c = m7.b;
        rb.m.a.execute(new p(faVar, new a5.a(mVar, 0), o7.d, faVar.b(), 7));
    }

    @Override // rb.e
    public final Object e(wb.a aVar) {
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f.a(aVar);
                f(n7.b, aVar, elapsedRealtime);
                this.d = false;
            } catch (nb.a e) {
                f(e.a == 14 ? n7.c : n7.d, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(n7 n7Var, wb.a aVar, long j10) {
        int i10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        fa faVar = this.g;
        o7 o7Var = o7.b;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        byte b10 = 0;
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.i.put(o7Var, Long.valueOf(elapsedRealtime2));
            m mVar = new m();
            mVar.c = m7.b;
            u2.c cVar = new u2.c(12, false);
            z5 z5Var = new z5();
            z5Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            z5Var.c = n7Var;
            z5Var.a = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            z5Var.d = bool;
            z5Var.e = bool;
            cVar.b = new g7(z5Var);
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
            t tVar = new t(29, b10);
            tVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? d7.b : d7.d : d7.c : d7.e : d7.f : d7.h;
            tVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
            cVar.d = new e7(tVar);
            cVar.c = this.e;
            mVar.e = new f8(cVar);
            rb.m.a.execute(new p(faVar, new a5.a(mVar, 0), o7Var, faVar.b(), 7));
        }
        u2.c cVar2 = new u2.c(11, false);
        cVar2.d = this.e;
        cVar2.b = n7Var;
        cVar2.c = Boolean.valueOf(this.d);
        rb.m.a.execute(new da(this.g, new r0(cVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.h;
        int i12 = n7Var.a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.b.get() != -1 && elapsedRealtime3 - z8Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.a.f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ad.d(z8Var, elapsedRealtime3, 9));
        }
    }
}
