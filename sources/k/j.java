package k;

import android.graphics.Bitmap;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.animation.Interpolator;
import b8.af;
import b8.cb;
import b8.gg;
import b8.k1;
import b8.ke;
import b8.kg;
import b8.lb;
import b8.le;
import b8.nb;
import b8.xa;
import b8.xg;
import b8.ya;
import b8.yg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import r0.l0;
import r0.m0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements gg {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ j(xb.d dVar, long j10, nb nbVar, boolean z10, rb.a aVar, yg ygVar) {
        this.c = dVar;
        this.a = j10;
        this.d = nbVar;
        this.b = z10;
        this.e = aVar;
        this.f = ygVar;
    }

    public void a() {
        if (this.b) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((l0) obj).b();
            }
            this.b = false;
        }
    }

    public void b() {
        View view;
        if (this.b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            l0 l0Var = (l0) obj;
            long j10 = this.a;
            if (j10 >= 0) {
                l0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f);
            }
            View view2 = (View) l0Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b8.gg
    public kg zza() {
        int i3;
        xb.d dVar = (xb.d) this.c;
        long j10 = this.a;
        nb nbVar = (nb) this.d;
        boolean z10 = this.b;
        rb.a aVar = (rb.a) this.e;
        yg ygVar = (yg) this.f;
        Object[] objArr = 0;
        ke keVar = new ke(0);
        a0 a0Var = new a0(9, (boolean) (0 == true ? 1 : 0));
        a0Var.b = Long.valueOf(j10 & Long.MAX_VALUE);
        a0Var.c = nbVar;
        a0Var.d = Boolean.valueOf(z10);
        keVar.b = new cb(a0Var);
        int i10 = aVar.e;
        xb.d.l.getClass();
        int i11 = aVar.e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.a;
            p6.m.g(bitmap);
            i3 = bitmap.getAllocationByteCount();
        } else {
            if (i11 == 17 || i11 == 842094169) {
                p6.m.g(null);
                throw null;
            }
            if (i11 == 35) {
                p6.m.g(null);
                throw null;
            }
            i3 = 0;
        }
        tf.b bVar = new tf.b();
        bVar.a = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? xa.b : xa.d : xa.c : xa.e : xa.f : xa.h;
        bVar.b = Integer.valueOf(i3 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        keVar.c = new ya(bVar);
        keVar.d = dVar.e.a();
        if (ygVar != null) {
            List list = ygVar.d;
            b8.j jVar = b8.l.b;
            Object[] array = list.toArray();
            int length = array.length;
            k1.a(length, array);
            keVar.f = b8.l.m(length, array);
            List<xg> list2 = ygVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr2 = new Object[4];
                int i12 = 0;
                for (xg xgVar : list2) {
                    ui.f fVar = new ui.f(2, (boolean) (objArr == true ? 1 : 0));
                    fVar.b = Integer.valueOf(xgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    fVar.c = Integer.valueOf(xgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    fVar.d = Integer.valueOf(xgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    fVar.e = Integer.valueOf(xgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    af afVar = new af(fVar);
                    int i13 = i12 + 1;
                    int length2 = objArr2.length;
                    if (length2 < i13) {
                        int i14 = length2 + (length2 >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i14);
                    }
                    objArr2[i12] = afVar;
                    i12 = i13;
                }
                keVar.e = b8.l.m(i12, objArr2);
            }
        }
        fa.f fVar2 = new fa.f(1);
        fVar2.d = lb.b;
        fVar2.h = new le(keVar);
        return new kg(fVar2, 0);
    }

    public j() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
