package ac;

import a8.d8;
import a8.r7;
import a8.xa;
import ab.c0;
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
import c8.pa;
import c8.qa;
import c8.re;
import c8.tf;
import c8.ua;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import org.telegram.tgnet.ConnectionsManager;
import q6.m;
import r0.l0;
import r0.m0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements tf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ d(f fVar, long j3, eb ebVar, boolean z10, ub.a aVar, gg ggVar) {
        this.c = fVar;
        this.a = j3;
        this.d = ebVar;
        this.b = z10;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.tf
    public xa zza() {
        int i7;
        f fVar = (f) this.c;
        long j3 = this.a;
        eb ebVar = (eb) this.d;
        boolean z10 = this.b;
        ub.a aVar = (ub.a) this.e;
        gg ggVar = (gg) this.f;
        Object[] objArr = 0;
        r7 r7Var = new r7(3, (byte) 0);
        a0 a0Var = new a0(17, (boolean) (0 == true ? 1 : 0));
        a0Var.b = Long.valueOf(j3 & Long.MAX_VALUE);
        a0Var.c = ebVar;
        a0Var.d = Boolean.valueOf(z10);
        r7Var.b = new ua(a0Var);
        int i10 = aVar.e;
        f.l.getClass();
        int i11 = aVar.e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.a;
            m.h(bitmap);
            i7 = bitmap.getAllocationByteCount();
        } else {
            if (i11 == 17 || i11 == 842094169) {
                m.h(null);
                throw null;
            }
            if (i11 == 35) {
                m.h(null);
                throw null;
            }
            i7 = 0;
        }
        wf.b bVar = new wf.b(7, (boolean) (objArr == true ? 1 : 0));
        bVar.b = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? pa.b : pa.d : pa.c : pa.e : pa.f : pa.h;
        bVar.c = Integer.valueOf(i7 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r7Var.c = new qa(bVar);
        r7Var.d = fVar.e.a();
        if (ggVar != null) {
            List list = ggVar.d;
            g gVar = c8.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            d8.a(length, array);
            r7Var.f = c8.i.m(length, array);
            List<fg> list2 = ggVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr2 = new Object[4];
                int i12 = 0;
                for (fg fgVar : list2) {
                    c0 c0Var = new c0(2);
                    c0Var.b = Integer.valueOf(fgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    c0Var.c = Integer.valueOf(fgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    c0Var.d = Integer.valueOf(fgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    c0Var.e = Integer.valueOf(fgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    re reVar = new re(c0Var);
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
                    objArr2[i12] = reVar;
                    i12 = i13;
                }
                r7Var.e = c8.i.m(i12, objArr2);
            }
        }
        ga.d dVar = new ga.d(1);
        dVar.d = db.b;
        dVar.h = new ce(r7Var);
        return new xa(dVar, 0);
    }

    public d() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
