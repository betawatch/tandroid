package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import f2.e1;
import h7.a6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class x {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final Object j;
    public Object k;

    public x(zk0 zk0Var, f2.k0 k0Var) {
        this.a = 1;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = zk0Var;
        this.f = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        switch (this.a) {
            case 0:
                r rVar = (r) this.e;
                if (!this.c && !this.d) {
                    this.d = true;
                    if (rVar != null) {
                        rVar.h(0);
                        rVar.d();
                        break;
                    }
                }
                break;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zk0 zk0Var = (zk0) this.e;
                zk0Var.setVerticalScrollBarEnabled(true);
                zk0Var.T1 = false;
                f2.q0 adapter = zk0Var.getAdapter();
                if (adapter instanceof dk0) {
                    ((dk0) adapter).E();
                }
                this.g = null;
                int childCount = zk0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zk0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof l4) {
                        ((l4) childAt).c(false, false);
                    }
                }
                break;
        }
    }

    public void b() {
        c0.k kVar;
        z zVar = (z) this.f;
        int i10 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        b0.b();
        if (this.c || this.d) {
            return;
        }
        e eVar = (e) weakReference.get();
        if (eVar == null || eVar.g != this || ((kVar = (c0.k) this.k) != null && kVar.isCancelled())) {
            a();
            return;
        }
        this.c = true;
        eVar.g = null;
        e eVar2 = (e) weakReference.get();
        if (eVar2 != null) {
            HashMap hashMap = eVar2.b;
            if (eVar2.d == zVar) {
                Message obtainMessage = eVar2.a.obtainMessage(263, zVar);
                obtainMessage.arg1 = i10;
                obtainMessage.sendToTarget();
                r rVar = eVar2.e;
                if (rVar != null) {
                    rVar.h(i10);
                    eVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (r rVar2 : hashMap.values()) {
                        rVar2.h(i10);
                        rVar2.d();
                    }
                    hashMap.clear();
                }
                eVar2.e = null;
            }
        }
        e eVar3 = (e) weakReference.get();
        if (eVar3 == null) {
            return;
        }
        b bVar = eVar3.a;
        z zVar2 = (z) this.g;
        eVar3.d = zVar2;
        eVar3.e = (r) this.e;
        z zVar3 = (z) this.h;
        if (zVar3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(zVar, zVar2));
            obtainMessage2.arg1 = i10;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(zVar3, zVar2));
            obtainMessage3.arg1 = i10;
            obtainMessage3.sendToTarget();
        }
        eVar3.b.clear();
        eVar3.g();
        eVar3.l();
        ArrayList arrayList = (ArrayList) this.i;
        if (arrayList != null) {
            eVar3.d.n(arrayList);
        }
    }

    public void c(int i10, int i11, boolean z10) {
        d(i10, i11, z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(int i10, int i11, boolean z10, boolean z11) {
        f2.q0 q0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        f2.k0 k0Var = (f2.k0) this.f;
        zk0 zk0Var = (zk0) this.e;
        if (zk0Var.T1) {
            return;
        }
        if (zk0Var.getItemAnimator() != null) {
            if (z11) {
                f2.v0 itemAnimator = zk0Var.getItemAnimator();
                ak0 ak0Var = new ak0(this, i10, i11, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(ak0Var);
                } else {
                    d(i10, i11, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (zk0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            k0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = zk0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            k0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.b == 0;
        zk0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        f2.q0 adapter = zk0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = zk0Var.getChildAt(i12);
            arrayList.add(childAt);
            k0Var.getClass();
            sparseArray.put(f2.x0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                q0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((f2.y0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        q0Var = adapter;
                        i12++;
                        adapter = q0Var;
                    } else {
                        q0Var = adapter;
                        j10 = adapter.i(b10);
                    }
                } else {
                    q0Var = adapter;
                    j10 = ((f2.y0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof l4) {
                ((l4) childAt).c(true, true);
            }
            i12++;
            adapter = q0Var;
        }
        f2.q0 q0Var2 = adapter;
        zk0Var.B0();
        zk0Var.o0();
        aa.a aVar = zk0Var.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        e1 e1Var = zk0Var.b;
        f2.q0 q0Var3 = zk0Var.w;
        e1Var.d(q0Var3, q0Var3);
        zk0Var.p0.f = true;
        zk0Var.e.x();
        e1Var.l();
        dk0 dk0Var = q0Var2 instanceof dk0 ? (dk0) q0Var2 : null;
        k0Var.i1(i10, i11, z10);
        if (q0Var2 != null) {
            q0Var2.l();
        }
        zk0Var.B0();
        zk0Var.setVerticalScrollBarEnabled(false);
        a6 a6Var = (a6) this.i;
        if (a6Var != null) {
            a6Var.c();
        }
        zk0Var.T1 = true;
        if (dk0Var != null) {
            dk0Var.c = true;
            dk0Var.d = false;
            dk0Var.e.clear();
            dk0Var.f.clear();
        }
        zk0Var.addOnLayoutChangeListener(new ck0(this, q0Var2, arrayList, z12, dk0Var));
    }

    public x(e eVar, z zVar, r rVar, int i10, z zVar2, Collection collection) {
        this.a = 0;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = zVar;
        this.e = rVar;
        this.b = i10;
        this.f = eVar.d;
        this.h = zVar2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new af.e(this, 18), 15000L);
    }
}
