package cc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.cast.z5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.s3;
import n6.l;
import org.telegram.tgnet.ConnectionsManager;
import r0.l0;
import r0.m0;
import w7.e9;
import z7.ee;
import z7.fb;
import z7.g;
import z7.gb;
import z7.ig;
import z7.jg;
import z7.qa;
import z7.ra;
import z7.te;
import z7.va;
import z7.vf;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements vf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ d(f fVar, long j10, gb gbVar, boolean z10, wb.a aVar, jg jgVar) {
        this.c = fVar;
        this.a = j10;
        this.d = gbVar;
        this.b = z10;
        this.e = aVar;
        this.f = jgVar;
    }

    public void a() {
        if (this.b) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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

    @Override // z7.vf
    public a5.a zza() {
        int i10;
        f fVar = (f) this.c;
        long j10 = this.a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.b;
        wb.a aVar = (wb.a) this.e;
        jg jgVar = (jg) this.f;
        z5 z5Var = new z5();
        boolean z11 = false;
        u2.c cVar = new u2.c(18, false);
        cVar.b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.c = gbVar;
        cVar.d = Boolean.valueOf(z10);
        z5Var.b = new va(cVar);
        int i11 = aVar.e;
        f.l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.a;
            l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else {
            if (i12 == 17 || i12 == 842094169) {
                l.h(null);
                throw null;
            }
            if (i12 == 35) {
                l.h(null);
                throw null;
            }
            i10 = 0;
        }
        n2.e eVar = new n2.e(29, z11);
        eVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? qa.b : qa.d : qa.c : qa.e : qa.f : qa.h;
        eVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        z5Var.c = new ra(eVar);
        z5Var.a = fVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            g gVar = z7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            e9.a(length, array);
            z5Var.e = z7.i.q(length, array);
            List<ig> list2 = jgVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    qi.e eVar2 = new qi.e();
                    eVar2.a = Integer.valueOf(igVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    eVar2.b = Integer.valueOf(igVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    eVar2.c = Integer.valueOf(igVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    eVar2.d = Integer.valueOf(igVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    te teVar = new te(eVar2);
                    int i14 = i13 + 1;
                    int length2 = objArr.length;
                    if (length2 < i14) {
                        int i15 = length2 + (length2 >> 1) + 1;
                        if (i15 < i14) {
                            int highestOneBit = Integer.highestOneBit(i13);
                            i15 = highestOneBit + highestOneBit;
                        }
                        if (i15 < 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i15);
                    }
                    objArr[i13] = teVar;
                    i13 = i14;
                }
                z5Var.d = z7.i.q(i13, objArr);
            }
        }
        s3 s3Var = new s3();
        s3Var.c = fb.b;
        s3Var.f = new ee(z5Var);
        return new a5.a(s3Var, 0);
    }

    public d() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
