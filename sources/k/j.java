package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.t;
import g7.v8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.ee;
import k7.fb;
import k7.gb;
import k7.hg;
import k7.ig;
import k7.qa;
import k7.ra;
import k7.te;
import k7.va;
import k7.vf;
import m.t3;
import org.telegram.tgnet.ConnectionsManager;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements vf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ j(kb.e eVar, long j10, gb gbVar, boolean z10, eb.a aVar, ig igVar) {
        this.c = eVar;
        this.a = j10;
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
                ((m0) obj).b();
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
            m0 m0Var = (m0) obj;
            long j10 = this.a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.e) != null) {
                m0Var.d((i) this.f);
            }
            View view2 = (View) m0Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override // k7.vf
    public b6.a zza() {
        int i10;
        kb.e eVar = (kb.e) this.c;
        long j10 = this.a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.b;
        eb.a aVar = (eb.a) this.e;
        ig igVar = (ig) this.f;
        af.h hVar = new af.h();
        boolean z11 = false;
        j9.a aVar2 = new j9.a(5, z11);
        aVar2.b = Long.valueOf(j10 & Long.MAX_VALUE);
        aVar2.c = gbVar;
        aVar2.d = Boolean.valueOf(z10);
        hVar.a = new va(aVar2);
        int i11 = aVar.e;
        kb.e.l.getClass();
        int i12 = aVar.e;
        int i13 = 17;
        if (i12 == -1) {
            Bitmap bitmap = aVar.a;
            y5.l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else {
            if (i12 == 17 || i12 == 842094169) {
                y5.l.h(null);
                throw null;
            }
            if (i12 == 35) {
                y5.l.h(null);
                throw null;
            }
            i10 = 0;
        }
        g5.b bVar = new g5.b(12);
        bVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? qa.b : qa.d : qa.c : qa.e : qa.f : qa.h;
        bVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        hVar.b = new ra(bVar);
        hVar.c = eVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            k7.g gVar = k7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            v8.a(length, array);
            hVar.e = k7.i.r(length, array);
            List<hg> list2 = igVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i14 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(i13, z11);
                    tVar.b = Integer.valueOf(hgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.c = Integer.valueOf(hgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.d = Integer.valueOf(hgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.e = Integer.valueOf(hgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    te teVar = new te(tVar);
                    int i15 = i14 + 1;
                    int length2 = objArr.length;
                    if (length2 < i15) {
                        int i16 = length2 + (length2 >> 1) + 1;
                        if (i16 < i15) {
                            int highestOneBit = Integer.highestOneBit(i14);
                            i16 = highestOneBit + highestOneBit;
                        }
                        if (i16 < 0) {
                            i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i16);
                    }
                    objArr[i14] = teVar;
                    i14 = i15;
                }
                hVar.d = k7.i.r(i14, objArr);
            }
        }
        t3 t3Var = new t3();
        t3Var.c = fb.b;
        t3Var.f = new ee(hVar);
        return new b6.a(t3Var, 0);
    }

    public j() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
