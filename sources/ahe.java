// default package

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ahe extends qi6 {
    public boolean d = true;
    public final b2f e;
    public final ggd f;
    public final q8f g;
    public final q2f h;

    public ahe(lm5 lm5Var, ggd ggdVar, q8f q8fVar) {
        xve.i(lm5Var, "ImageLabelerOptions can not be null");
        this.f = ggdVar;
        this.g = q8fVar;
        g9d g9dVar = new g9d();
        g9dVar.b = Float.valueOf(lm5Var.a);
        this.e = new b2f(g9dVar);
        this.h = new q2f(jg7.c().b(), (byte) 1);
    }

    @Override // sg7
    public final synchronized void b() {
        this.f.zzb();
        q8f q8fVar = this.g;
        fp fpVar = new fp();
        fpVar.c = kxe.b;
        zhc zhcVar = new zhc((byte) 17, false);
        zhcVar.b = this.e;
        vgd vgdVar = ghd.f;
        Object[] objArr = {pxe.b};
        i5f.a(1, objArr);
        zhcVar.c = new yjd(1, objArr);
        fpVar.d = new s1f(zhcVar);
        xnb.c(1, new dd1(q8fVar, new rx(fpVar, 0), vxe.e, q8fVar.b(), (byte) 3));
    }

    @Override // sg7
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        q8f q8fVar = this.g;
        fp fpVar = new fp();
        fpVar.c = kxe.b;
        xnb.c(1, new dd1(q8fVar, new rx(fpVar, 0), vxe.d, q8fVar.b(), (byte) 3));
    }

    @Override // qi6
    public final Object e(jq5 jq5Var) {
        ArrayList a;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a = this.f.a(jq5Var);
                f(pxe.b, jq5Var, elapsedRealtime);
                this.d = false;
            } catch (kg7 e) {
                f(e.a == 14 ? pxe.c : pxe.d, jq5Var, elapsedRealtime);
                throw e;
            }
        }
        return a;
    }

    public final void f(pxe pxeVar, jq5 jq5Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        q8f q8fVar = this.g;
        vxe vxeVar = vxe.b;
        q8fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z = false;
        if (q8fVar.c(vxeVar, elapsedRealtime2)) {
            q8fVar.i.put(vxeVar, Long.valueOf(elapsedRealtime2));
            fp fpVar = new fp();
            fpVar.c = kxe.b;
            htd htdVar = new htd((byte) 8);
            am2 am2Var = new am2((byte) 22, z);
            am2Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            am2Var.c = pxeVar;
            am2Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            am2Var.e = bool;
            am2Var.f = bool;
            htdVar.b = new cwe(am2Var);
            Bitmap bitmap = jq5Var.a;
            xve.h(bitmap);
            int allocationByteCount = bitmap.getAllocationByteCount();
            k7b k7bVar = new k7b((byte) 18, z);
            k7bVar.b = ave.b;
            k7bVar.c = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
            htdVar.d = new kve(k7bVar);
            htdVar.c = this.e;
            fpVar.e = new h1f(htdVar);
            xnb.c(1, new dd1(q8fVar, new rx(fpVar, 0), vxeVar, q8fVar.b(), (byte) 3));
        }
        htd htdVar2 = new htd((byte) 1);
        htdVar2.d = this.e;
        htdVar2.b = pxeVar;
        htdVar2.c = Boolean.valueOf(this.d);
        xnb.c(1, new k8f(this.g, new std(htdVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        q2f q2fVar = this.h;
        short s = pxeVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (q2fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (q2fVar.b.get() == -1 || elapsedRealtime3 - q2fVar.b.get() > 1800000) {
                q2fVar.a.i(new ikb(0, Arrays.asList(new bg7(24305, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new zg2((Object) q2fVar, elapsedRealtime3, (byte) 11));
            }
        }
    }
}
