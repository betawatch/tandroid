package jb;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.t;
import f7.v8;
import j7.ee;
import j7.fb;
import j7.g;
import j7.gb;
import j7.hg;
import j7.ig;
import j7.qa;
import j7.ra;
import j7.te;
import j7.va;
import j7.vf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.t3;
import org.telegram.tgnet.ConnectionsManager;
import r0.m0;
import r0.n0;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements vf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ d(f fVar, long j10, gb gbVar, boolean z10, db.a aVar, ig igVar) {
        this.c = fVar;
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
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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

    @Override // j7.vf
    public a6.a zza() {
        int i9;
        f fVar = (f) this.c;
        long j10 = this.a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.b;
        db.a aVar = (db.a) this.e;
        ig igVar = (ig) this.f;
        b3.b bVar = new b3.b();
        boolean z11 = false;
        j4.c cVar = new j4.c(4, z11);
        cVar.b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.c = gbVar;
        cVar.d = Boolean.valueOf(z10);
        bVar.a = new va(cVar);
        int i10 = aVar.e;
        f.l.getClass();
        int i11 = aVar.e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.a;
            l.h(bitmap);
            i9 = bitmap.getAllocationByteCount();
        } else {
            if (i11 == 17 || i11 == 842094169) {
                l.h(null);
                throw null;
            }
            if (i11 == 35) {
                l.h(null);
                throw null;
            }
            i9 = 0;
        }
        g5.b bVar2 = new g5.b(11);
        bVar2.b = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? qa.b : qa.d : qa.c : qa.e : qa.f : qa.h;
        bVar2.c = Integer.valueOf(i9 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.b = new ra(bVar2);
        bVar.c = fVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = j7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            v8.a(length, array);
            bVar.e = j7.i.r(length, array);
            List<hg> list2 = igVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i12 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(14, z11);
                    tVar.b = Integer.valueOf(hgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.c = Integer.valueOf(hgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.d = Integer.valueOf(hgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    tVar.e = Integer.valueOf(hgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    te teVar = new te(tVar);
                    int i13 = i12 + 1;
                    int length2 = objArr.length;
                    if (length2 < i13) {
                        int i14 = length2 + (length2 >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = teVar;
                    i12 = i13;
                }
                bVar.d = j7.i.r(i12, objArr);
            }
        }
        t3 t3Var = new t3();
        t3Var.c = fb.b;
        t3Var.f = new ee(bVar);
        return new a6.a(t3Var, 0);
    }

    public d() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
