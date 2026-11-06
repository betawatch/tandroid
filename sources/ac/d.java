package ac;

import a8.r7;
import a8.wa;
import a8.x7;
import ab.b0;
import android.graphics.Bitmap;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.animation.Interpolator;
import c8.ce;
import c8.db;
import c8.eb;
import c8.fg;
import c8.g;
import c8.gg;
import c8.oa;
import c8.pa;
import c8.re;
import c8.ta;
import c8.tf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import org.telegram.tgnet.ConnectionsManager;
import q6.m;
import r0.l0;
import r0.m0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements tf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ d(f fVar, long j3, eb ebVar, boolean z9, ub.a aVar, gg ggVar) {
        this.c = fVar;
        this.a = j3;
        this.d = ebVar;
        this.b = z9;
        this.e = aVar;
        this.f = ggVar;
    }

    public void a() {
        if (this.b) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            l0 l0Var = (l0) obj;
            long j3 = this.a;
            if (j3 >= 0) {
                l0Var.c(j3);
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

    @Override // c8.tf
    public wa zza() {
        int i7;
        f fVar = (f) this.c;
        long j3 = this.a;
        eb ebVar = (eb) this.d;
        boolean z9 = this.b;
        ub.a aVar = (ub.a) this.e;
        gg ggVar = (gg) this.f;
        r7 r7Var = new r7(3);
        boolean z10 = false;
        a0 a0Var = new a0(17, z10);
        a0Var.b = Long.valueOf(j3 & Long.MAX_VALUE);
        a0Var.c = ebVar;
        a0Var.d = Boolean.valueOf(z9);
        r7Var.b = new ta(a0Var);
        int i10 = aVar.e;
        f.l.getClass();
        int i11 = aVar.e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.a;
            m.g(bitmap);
            i7 = bitmap.getAllocationByteCount();
        } else {
            if (i11 == 17 || i11 == 842094169) {
                m.g(null);
                throw null;
            }
            if (i11 == 35) {
                m.g(null);
                throw null;
            }
            i7 = 0;
        }
        wf.b bVar = new wf.b(8, z10);
        bVar.b = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? oa.b : oa.d : oa.c : oa.e : oa.f : oa.h;
        bVar.c = Integer.valueOf(i7 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r7Var.c = new pa(bVar);
        r7Var.d = fVar.e.a();
        if (ggVar != null) {
            List list = ggVar.d;
            g gVar = c8.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            x7.a(length, array);
            r7Var.f = c8.i.m(length, array);
            List<fg> list2 = ggVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i12 = 0;
                for (fg fgVar : list2) {
                    b0 b0Var = new b0(2, z10);
                    b0Var.b = Integer.valueOf(fgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    b0Var.c = Integer.valueOf(fgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    b0Var.d = Integer.valueOf(fgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    b0Var.e = Integer.valueOf(fgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    re reVar = new re(b0Var);
                    int i13 = i12 + 1;
                    int length2 = objArr.length;
                    if (length2 < i13) {
                        int i14 = length2 + (length2 >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = reVar;
                    i12 = i13;
                }
                r7Var.e = c8.i.m(i12, objArr);
            }
        }
        ga.d dVar = new ga.d(1);
        dVar.d = db.b;
        dVar.h = new ce(r7Var);
        return new wa(dVar, 0);
    }

    public d() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
