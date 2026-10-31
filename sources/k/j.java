package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m.p3;
import org.telegram.tgnet.ConnectionsManager;
import r0.k0;
import r0.l0;
import w7.q9;
import x7.g8;
import z7.ee;
import z7.fb;
import z7.gb;
import z7.ig;
import z7.jg;
import z7.qa;
import z7.ra;
import z7.ue;
import z7.va;
import z7.wf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j implements wf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ j(ub.d dVar, long j10, gb gbVar, boolean z10, ob.a aVar, jg jgVar) {
        this.c = dVar;
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
                ((k0) obj).b();
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
            k0 k0Var = (k0) obj;
            long j10 = this.a;
            if (j10 >= 0) {
                k0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) k0Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((l0) this.e) != null) {
                k0Var.d((i) this.f);
            }
            View view2 = (View) k0Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override // z7.wf
    public a5.a zza() {
        int i10;
        ub.d dVar = (ub.d) this.c;
        long j10 = this.a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.b;
        ob.a aVar = (ob.a) this.e;
        jg jgVar = (jg) this.f;
        bh.d dVar2 = new bh.d();
        boolean z11 = false;
        q5.d dVar3 = new q5.d(29, z11);
        dVar3.b = Long.valueOf(j10 & Long.MAX_VALUE);
        dVar3.c = gbVar;
        dVar3.d = Boolean.valueOf(z10);
        dVar2.a = new va(dVar3);
        int i11 = aVar.e;
        ub.d.l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.a;
            n6.l.g(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else {
            if (i12 == 17 || i12 == 842094169) {
                n6.l.g(null);
                throw null;
            }
            if (i12 == 35) {
                n6.l.g(null);
                throw null;
            }
            i10 = 0;
        }
        g8 g8Var = new g8(5);
        int i13 = 16;
        g8Var.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? qa.b : qa.d : qa.c : qa.e : qa.f : qa.h;
        g8Var.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        dVar2.b = new ra(g8Var);
        dVar2.c = dVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            z7.g gVar = z7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            q9.a(length, array);
            dVar2.e = z7.i.q(length, array);
            List<ig> list2 = jgVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i14 = 0;
                for (ig igVar : list2) {
                    ji.f fVar = new ji.f(i13, z11);
                    fVar.b = Integer.valueOf(igVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    fVar.c = Integer.valueOf(igVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    fVar.d = Integer.valueOf(igVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    fVar.e = Integer.valueOf(igVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    ue ueVar = new ue(fVar);
                    int i15 = i14 + 1;
                    int length2 = objArr.length;
                    if (length2 < i15) {
                        int i16 = length2 + (length2 >> 1) + 1;
                        if (i16 < i15) {
                            int highestOneBit = Integer.highestOneBit(i14);
                            i16 = highestOneBit + highestOneBit;
                        }
                        if (i16 < 0) {
                            i16 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i16);
                    }
                    objArr[i14] = ueVar;
                    i14 = i15;
                }
                dVar2.d = z7.i.q(i14, objArr);
            }
        }
        p3 p3Var = new p3();
        p3Var.c = fb.b;
        p3Var.f = new ee(dVar2);
        return new a5.a(p3Var, 0);
    }

    public j() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
