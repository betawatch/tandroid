// default package

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lee extends mi6 {
    public boolean d = true;
    public final mze e;
    public final pdd f;
    public final b6f g;
    public final b0f h;

    public lee(im5 im5Var, pdd pddVar, b6f b6fVar) {
        ite.i(im5Var, "ImageLabelerOptions can not be null");
        this.f = pddVar;
        this.g = b6fVar;
        eod eodVar = new eod((byte) 5);
        eodVar.b = Float.valueOf(im5Var.a);
        this.e = new mze(eodVar);
        this.h = new b0f(cg7.c().b(), (byte) 1);
    }

    @Override // lg7
    public final synchronized void b() {
        this.f.zzb();
        b6f b6fVar = this.g;
        eq eqVar = new eq();
        eqVar.c = wue.b;
        rhb rhbVar = new rhb((byte) 19, false);
        rhbVar.b = this.e;
        eed eedVar = ped.f;
        Object[] objArr = {bve.b};
        r2f.a(1, objArr);
        rhbVar.c = new ihd(1, objArr);
        eqVar.d = new dze(rhbVar);
        mlb.c(1, new de1(b6fVar, new ry(eqVar, 0), hve.e, b6fVar.b(), (byte) 3));
    }

    @Override // lg7
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        b6f b6fVar = this.g;
        eq eqVar = new eq();
        eqVar.c = wue.b;
        mlb.c(1, new de1(b6fVar, new ry(eqVar, 0), hve.d, b6fVar.b(), (byte) 3));
    }

    @Override // mi6
    public final Object e(gq5 gq5Var) {
        ArrayList e;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                e = this.f.e(gq5Var);
                f(bve.b, gq5Var, elapsedRealtime);
                this.d = false;
            } catch (dg7 e2) {
                f(e2.a == 14 ? bve.c : bve.d, gq5Var, elapsedRealtime);
                throw e2;
            }
        }
        return e;
    }

    public final void f(bve bveVar, gq5 gq5Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        b6f b6fVar = this.g;
        hve hveVar = hve.b;
        b6fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z = false;
        if (b6fVar.c(hveVar, elapsedRealtime2)) {
            b6fVar.i.put(hveVar, Long.valueOf(elapsedRealtime2));
            eq eqVar = new eq();
            eqVar.c = wue.b;
            uqd uqdVar = new uqd((byte) 8);
            sm2 sm2Var = new sm2((byte) 23, z);
            sm2Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            sm2Var.c = bveVar;
            sm2Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            sm2Var.e = bool;
            sm2Var.f = bool;
            uqdVar.b = new ote(sm2Var);
            Bitmap bitmap = gq5Var.a;
            ite.h(bitmap);
            int allocationByteCount = bitmap.getAllocationByteCount();
            xab xabVar = new xab((byte) 17, z);
            xabVar.b = mse.b;
            xabVar.c = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
            uqdVar.d = new wse(xabVar);
            uqdVar.c = this.e;
            eqVar.e = new sye(uqdVar);
            mlb.c(1, new de1(b6fVar, new ry(eqVar, 0), hveVar, b6fVar.b(), (byte) 3));
        }
        uqd uqdVar2 = new uqd((byte) 1);
        uqdVar2.d = this.e;
        uqdVar2.b = bveVar;
        uqdVar2.c = Boolean.valueOf(this.d);
        mlb.c(1, new v5f(this.g, new frd(uqdVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        b0f b0fVar = this.h;
        short s = bveVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (b0fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (b0fVar.b.get() == -1 || elapsedRealtime3 - b0fVar.b.get() > 1800000) {
                b0fVar.a.i(new nib(0, Arrays.asList(new uf7(24305, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new vh2((Object) b0fVar, elapsedRealtime3, (byte) 11));
            }
        }
    }
}
