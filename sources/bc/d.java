package bc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.p3;
import n6.l;
import n7.a1;
import org.telegram.tgnet.ConnectionsManager;
import r0.l0;
import r0.m0;
import v7.r1;
import w7.g9;
import z7.ee;
import z7.fb;
import z7.g;
import z7.gb;
import z7.hg;
import z7.ig;
import z7.qa;
import z7.ra;
import z7.te;
import z7.va;
import z7.vf;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements vf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, ig igVar) {
        this.c = fVar;
        this.a = j3;
        this.d = gbVar;
        this.b = z10;
        this.e = aVar;
        this.f = igVar;
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

    @Override // z7.vf
    public a5.a zza() {
        int i10;
        f fVar = (f) this.c;
        long j3 = this.a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.b;
        vb.a aVar = (vb.a) this.e;
        ig igVar = (ig) this.f;
        cf.c cVar = new cf.c();
        boolean z11 = false;
        r1 r1Var = new r1(15, false);
        r1Var.b = Long.valueOf(j3 & Long.MAX_VALUE);
        r1Var.d = gbVar;
        r1Var.c = Boolean.valueOf(z10);
        cVar.a = new va(r1Var);
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
        a1 a1Var = new a1(28);
        a1Var.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? qa.b : qa.d : qa.c : qa.e : qa.f : qa.h;
        a1Var.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        cVar.b = new ra(a1Var);
        cVar.c = fVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            g9.a(length, array);
            cVar.e = z7.i.r(length, array);
            List<hg> list2 = igVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(14, z11);
                    tVar.b = Integer.valueOf(hgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.c = Integer.valueOf(hgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.d = Integer.valueOf(hgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.e = Integer.valueOf(hgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    te teVar = new te(tVar);
                    int i14 = i13 + 1;
                    int length2 = objArr.length;
                    if (length2 < i14) {
                        int i15 = length2 + (length2 >> 1) + 1;
                        if (i15 < i14) {
                            int highestOneBit = Integer.highestOneBit(i13);
                            i15 = highestOneBit + highestOneBit;
                        }
                        if (i15 < 0) {
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i15);
                    }
                    objArr[i13] = teVar;
                    i13 = i14;
                }
                cVar.d = z7.i.r(i13, objArr);
            }
        }
        p3 p3Var = new p3();
        p3Var.c = fb.b;
        p3Var.f = new ee(cVar);
        return new a5.a(p3Var, 0);
    }

    public d() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
