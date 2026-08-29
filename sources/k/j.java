package k;

import ag.j2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.s;
import i7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.g0;
import l7.ee;
import l7.fb;
import l7.gb;
import l7.hg;
import l7.ig;
import l7.qa;
import l7.ra;
import l7.te;
import l7.va;
import l7.vf;
import m.s3;
import org.telegram.tgnet.ConnectionsManager;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j implements vf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ j(lb.e eVar, long j10, gb gbVar, boolean z10, fb.a aVar, ig igVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l7.vf
    public j2 zza() {
        int i10;
        lb.e eVar = (lb.e) this.c;
        long j10 = this.a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.b;
        fb.a aVar = (fb.a) this.e;
        ig igVar = (ig) this.f;
        a5.j jVar = new a5.j();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        g0 g0Var = new g0(5, false);
        g0Var.b = Long.valueOf(j10 & Long.MAX_VALUE);
        g0Var.c = gbVar;
        g0Var.d = Boolean.valueOf(z10);
        jVar.a = new va(g0Var);
        int i11 = aVar.e;
        lb.e.l.getClass();
        int i12 = aVar.e;
        int i13 = 17;
        if (i12 == -1) {
            Bitmap bitmap = aVar.a;
            z5.l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else {
            if (i12 == 17 || i12 == 842094169) {
                z5.l.h(null);
                throw null;
            }
            if (i12 == 35) {
                z5.l.h(null);
                throw null;
            }
            i10 = 0;
        }
        g9.l lVar = new g9.l(i13, (byte) (objArr2 == true ? 1 : 0));
        lVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? qa.b : qa.d : qa.c : qa.e : qa.f : qa.h;
        lVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jVar.b = new ra(lVar);
        jVar.c = eVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            l7.g gVar = l7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            o.a(length, array);
            jVar.e = l7.i.r(length, array);
            List<hg> list2 = igVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr3 = new Object[4];
                int i14 = 0;
                for (hg hgVar : list2) {
                    s sVar = new s(18, (boolean) (objArr == true ? 1 : 0));
                    sVar.b = Integer.valueOf(hgVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    sVar.c = Integer.valueOf(hgVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    sVar.d = Integer.valueOf(hgVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    sVar.e = Integer.valueOf(hgVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    te teVar = new te(sVar);
                    int i15 = i14 + 1;
                    int length2 = objArr3.length;
                    if (length2 < i15) {
                        int i16 = length2 + (length2 >> 1) + 1;
                        if (i16 < i15) {
                            int highestOneBit = Integer.highestOneBit(i14);
                            i16 = highestOneBit + highestOneBit;
                        }
                        if (i16 < 0) {
                            i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr3 = Arrays.copyOf(objArr3, i16);
                    }
                    objArr3[i14] = teVar;
                    i14 = i15;
                }
                jVar.d = l7.i.r(i14, objArr3);
            }
        }
        s3 s3Var = new s3();
        s3Var.c = fb.b;
        s3Var.f = new ee(jVar);
        return new j2(s3Var, 0);
    }

    public j() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
