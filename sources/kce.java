// default package

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kce extends mg6 {
    public boolean d = true;
    public final kxe e;
    public final nbd f;
    public final z3f g;
    public final zxe h;

    public kce(ik5 ik5Var, nbd nbdVar, z3f z3fVar) {
        fre.i(ik5Var, "ImageLabelerOptions can not be null");
        this.f = nbdVar;
        this.g = z3fVar;
        g6e g6eVar = new g6e();
        g6eVar.b = Float.valueOf(ik5Var.a);
        this.e = new kxe(g6eVar);
        this.h = new zxe(ae7.c().b(), (byte) 1);
    }

    @Override // je7
    public final synchronized void b() {
        this.f.zzb();
        z3f z3fVar = this.g;
        ep epVar = new ep();
        epVar.c = tse.b;
        aec aecVar = new aec((byte) 17, false);
        aecVar.b = this.e;
        ccd ccdVar = ncd.f;
        Object[] objArr = {yse.b};
        p0f.a(1, objArr);
        aecVar.c = new hfd(1, objArr);
        epVar.d = new bxe(aecVar);
        yjb.c(1, new vc1(z3fVar, new qx(epVar, 0), ete.e, z3fVar.b(), (byte) 3));
    }

    @Override // je7
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        z3f z3fVar = this.g;
        ep epVar = new ep();
        epVar.c = tse.b;
        yjb.c(1, new vc1(z3fVar, new qx(epVar, 0), ete.d, z3fVar.b(), (byte) 3));
    }

    @Override // mg6
    public final Object e(go5 go5Var) {
        ArrayList d;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                d = this.f.d(go5Var);
                f(yse.b, go5Var, elapsedRealtime);
                this.d = false;
            } catch (be7 e) {
                f(e.a == 14 ? yse.c : yse.d, go5Var, elapsedRealtime);
                throw e;
            }
        }
        return d;
    }

    public final void f(yse yseVar, go5 go5Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        z3f z3fVar = this.g;
        ete eteVar = ete.b;
        z3fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z = false;
        if (z3fVar.c(eteVar, elapsedRealtime2)) {
            z3fVar.i.put(eteVar, Long.valueOf(elapsedRealtime2));
            ep epVar = new ep();
            epVar.c = tse.b;
            rod rodVar = new rod((byte) 8);
            gl2 gl2Var = new gl2((byte) 22, z);
            gl2Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            gl2Var.c = yseVar;
            gl2Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            gl2Var.e = bool;
            gl2Var.f = bool;
            rodVar.b = new lre(gl2Var);
            Bitmap bitmap = go5Var.a;
            fre.h(bitmap);
            int allocationByteCount = bitmap.getAllocationByteCount();
            v8b v8bVar = new v8b((byte) 17, z);
            v8bVar.b = jqe.b;
            v8bVar.c = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
            rodVar.d = new tqe(v8bVar);
            rodVar.c = this.e;
            epVar.e = new qwe(rodVar);
            yjb.c(1, new vc1(z3fVar, new qx(epVar, 0), eteVar, z3fVar.b(), (byte) 3));
        }
        rod rodVar2 = new rod((byte) 1);
        rodVar2.d = this.e;
        rodVar2.b = yseVar;
        rodVar2.c = Boolean.valueOf(this.d);
        yjb.c(1, new t3f(this.g, new cpd(rodVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        zxe zxeVar = this.h;
        short s = yseVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (zxeVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (zxeVar.b.get() == -1 || elapsedRealtime3 - zxeVar.b.get() > 1800000) {
                zxeVar.a.i(new mgb(0, Arrays.asList(new sd7(24305, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new hg2((Object) zxeVar, elapsedRealtime3, (byte) 10));
            }
        }
    }
}
