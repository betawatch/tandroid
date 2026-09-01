package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import b4.e0;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.c0;
import l7.w0;
import m.r3;
import n7.fe;
import n7.gb;
import n7.hb;
import n7.ig;
import n7.jg;
import n7.qa;
import n7.ra;
import n7.sa;
import n7.ue;
import n7.wa;
import n7.wf;
import org.telegram.tgnet.ConnectionsManager;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j implements wf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ j(nb.e eVar, long j10, hb hbVar, boolean z4, hb.a aVar, jg jgVar) {
        this.c = eVar;
        this.a = j10;
        this.d = hbVar;
        this.b = z4;
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
    @Override // n7.wf
    public e0 zza() {
        int i10;
        nb.e eVar = (nb.e) this.c;
        long j10 = this.a;
        hb hbVar = (hb) this.d;
        boolean z4 = this.b;
        hb.a aVar = (hb.a) this.e;
        jg jgVar = (jg) this.f;
        c5.j jVar = new c5.j();
        Object[] objArr = 0;
        w0 w0Var = new w0(10, false);
        w0Var.b = Long.valueOf(j10 & Long.MAX_VALUE);
        w0Var.c = hbVar;
        w0Var.d = Boolean.valueOf(z4);
        jVar.a = new wa(w0Var);
        int i11 = aVar.e;
        nb.e.l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.a;
            b6.m.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else {
            if (i12 == 17 || i12 == 842094169) {
                b6.m.h(null);
                throw null;
            }
            if (i12 == 35) {
                b6.m.h(null);
                throw null;
            }
            i10 = 0;
        }
        qa qaVar = new qa((int) (objArr == true ? 1 : 0));
        qaVar.b = i11 != -1 ? i11 != 35 ? i11 != 842094169 ? i11 != 16 ? i11 != 17 ? ra.b : ra.d : ra.c : ra.e : ra.f : ra.h;
        qaVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jVar.b = new sa(qaVar);
        jVar.c = eVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            n7.g gVar = n7.i.b;
            Object[] array = list.toArray();
            int length = array.length;
            c0.a(length, array);
            jVar.e = n7.i.r(length, array);
            List<ig> list2 = jgVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr2 = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    s sVar = new s();
                    sVar.a = Integer.valueOf(igVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    sVar.b = Integer.valueOf(igVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    sVar.c = Integer.valueOf(igVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    sVar.d = Integer.valueOf(igVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    ue ueVar = new ue(sVar);
                    int i14 = i13 + 1;
                    int length2 = objArr2.length;
                    if (length2 < i14) {
                        int i15 = length2 + (length2 >> 1) + 1;
                        if (i15 < i14) {
                            int highestOneBit = Integer.highestOneBit(i13);
                            i15 = highestOneBit + highestOneBit;
                        }
                        if (i15 < 0) {
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i15);
                    }
                    objArr2[i13] = ueVar;
                    i13 = i14;
                }
                jVar.d = n7.i.r(i13, objArr2);
            }
        }
        r3 r3Var = new r3();
        r3Var.c = gb.b;
        r3Var.f = new fe(jVar);
        return new e0(r3Var, 0);
    }

    public j() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
