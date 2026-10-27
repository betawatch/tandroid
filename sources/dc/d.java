package dc;

import a8.ab;
import a8.ah;
import a8.bh;
import a8.cf;
import a8.eb;
import a8.h0;
import a8.j;
import a8.jg;
import a8.me;
import a8.ne;
import a8.ng;
import a8.ob;
import a8.qb;
import a8.za;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.r3;
import n4.s;
import o6.l;
import org.telegram.tgnet.ConnectionsManager;
import r0.l0;
import r0.m0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements jg {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public /* synthetic */ d(f fVar, long j10, qb qbVar, boolean z10, xb.a aVar, bh bhVar) {
        this.c = fVar;
        this.a = j10;
        this.d = qbVar;
        this.b = z10;
        this.e = aVar;
        this.f = bhVar;
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

    @Override // a8.jg
    public ng zza() {
        int i10;
        f fVar = (f) this.c;
        long j10 = this.a;
        qb qbVar = (qb) this.d;
        boolean z10 = this.b;
        xb.a aVar = (xb.a) this.e;
        bh bhVar = (bh) this.f;
        me meVar = new me();
        int i11 = 3;
        boolean z11 = false;
        h0 h0Var = new h0(i11, z11);
        h0Var.b = Long.valueOf(j10 & Long.MAX_VALUE);
        h0Var.c = qbVar;
        h0Var.d = Boolean.valueOf(z10);
        meVar.a = new eb(h0Var);
        int i12 = aVar.e;
        f.l.getClass();
        int i13 = aVar.e;
        if (i13 == -1) {
            Bitmap bitmap = aVar.a;
            l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else {
            if (i13 == 17 || i13 == 842094169) {
                l.h(null);
                throw null;
            }
            if (i13 == 35) {
                l.h(null);
                throw null;
            }
            i10 = 0;
        }
        s sVar = new s(i11, z11);
        sVar.b = i12 != -1 ? i12 != 35 ? i12 != 842094169 ? i12 != 16 ? i12 != 17 ? za.b : za.d : za.c : za.e : za.f : za.h;
        sVar.c = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        meVar.b = new ab(sVar);
        meVar.c = fVar.e.a();
        if (bhVar != null) {
            List list = bhVar.d;
            j jVar = a8.l.b;
            Object[] array = list.toArray();
            int length = array.length;
            a8.l0.a(length, array);
            meVar.e = a8.l.q(length, array);
            List<ah> list2 = bhVar.a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i14 = 0;
                for (ah ahVar : list2) {
                    q qVar = new q();
                    qVar.a = Integer.valueOf(ahVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    qVar.b = Integer.valueOf(ahVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    qVar.c = Integer.valueOf(ahVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    qVar.d = Integer.valueOf(ahVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    cf cfVar = new cf(qVar);
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
                    objArr[i14] = cfVar;
                    i14 = i15;
                }
                meVar.d = a8.l.q(i14, objArr);
            }
        }
        r3 r3Var = new r3();
        r3Var.c = ob.b;
        r3Var.f = new ne(meVar);
        return new ng(r3Var, 0);
    }

    public d() {
        this.a = -1L;
        this.f = new i(this);
        this.c = new ArrayList();
    }
}
