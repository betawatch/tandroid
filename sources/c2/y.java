package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import k7.d6;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class y {
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

    public y(tl0 tl0Var, f2.j0 j0Var) {
        this.a = 1;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = tl0Var;
        this.f = j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        switch (this.a) {
            case 0:
                s sVar = (s) this.e;
                if (!this.c && !this.d) {
                    this.d = true;
                    if (sVar != null) {
                        sVar.h(0);
                        sVar.d();
                        break;
                    }
                }
                break;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tl0 tl0Var = (tl0) this.e;
                tl0Var.setVerticalScrollBarEnabled(true);
                tl0Var.U1 = false;
                f2.p0 adapter = tl0Var.getAdapter();
                if (adapter instanceof yk0) {
                    ((yk0) adapter).E();
                }
                this.g = null;
                int childCount = tl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(false, false);
                    }
                }
                break;
        }
    }

    public void b() {
        c0.k kVar;
        a0 a0Var = (a0) this.f;
        int i10 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        c0.b();
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
            if (eVar2.d == a0Var) {
                Message obtainMessage = eVar2.a.obtainMessage(263, a0Var);
                obtainMessage.arg1 = i10;
                obtainMessage.sendToTarget();
                s sVar = eVar2.e;
                if (sVar != null) {
                    sVar.h(i10);
                    eVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (s sVar2 : hashMap.values()) {
                        sVar2.h(i10);
                        sVar2.d();
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
        a0 a0Var2 = (a0) this.g;
        eVar3.d = a0Var2;
        eVar3.e = (s) this.e;
        a0 a0Var3 = (a0) this.h;
        if (a0Var3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(a0Var, a0Var2));
            obtainMessage2.arg1 = i10;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(a0Var3, a0Var2));
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

    /* JADX WARN: Multi-variable type inference failed */
    public void c(int i10, int i11, boolean z4, boolean z10) {
        f2.p0 p0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        f2.j0 j0Var = (f2.j0) this.f;
        tl0 tl0Var = (tl0) this.e;
        if (tl0Var.U1) {
            return;
        }
        if (tl0Var.getItemAnimator() != null) {
            if (z10) {
                f2.u0 itemAnimator = tl0Var.getItemAnimator();
                vk0 vk0Var = new vk0(this, i10, i11, z4);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(vk0Var);
                } else {
                    c(i10, i11, z4, false);
                }
                if (k10) {
                    return;
                }
            } else if (tl0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            j0Var.i1(i10, i11, z4);
            return;
        }
        int childCount = tl0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            j0Var.i1(i10, i11, z4);
            return;
        }
        boolean z11 = this.b == 0;
        tl0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        f2.p0 adapter = tl0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = tl0Var.getChildAt(i12);
            arrayList.add(childAt);
            j0Var.getClass();
            sparseArray.put(f2.w0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                p0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((f2.x0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        p0Var = adapter;
                        i12++;
                        adapter = p0Var;
                    } else {
                        p0Var = adapter;
                        j10 = adapter.i(b10);
                    }
                } else {
                    p0Var = adapter;
                    j10 = ((f2.x0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof o4) {
                ((o4) childAt).c(true, true);
            }
            i12++;
            adapter = p0Var;
        }
        f2.p0 p0Var2 = adapter;
        tl0Var.B0();
        tl0Var.o0();
        da.a aVar = tl0Var.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        bf.f fVar = tl0Var.b;
        f2.p0 p0Var3 = tl0Var.w;
        fVar.d(p0Var3, p0Var3);
        tl0Var.q0.f = true;
        tl0Var.e.y();
        fVar.l();
        yk0 yk0Var = p0Var2 instanceof yk0 ? (yk0) p0Var2 : null;
        j0Var.i1(i10, i11, z4);
        if (p0Var2 != null) {
            p0Var2.l();
        }
        tl0Var.B0();
        tl0Var.setVerticalScrollBarEnabled(false);
        d6 d6Var = (d6) this.i;
        if (d6Var != null) {
            d6Var.c();
        }
        tl0Var.U1 = true;
        if (yk0Var != null) {
            yk0Var.c = true;
            yk0Var.d = false;
            yk0Var.e.clear();
            yk0Var.f.clear();
        }
        tl0Var.addOnLayoutChangeListener(new xk0(this, p0Var2, arrayList, z11, yk0Var));
    }

    public y(e eVar, a0 a0Var, s sVar, int i10, a0 a0Var2, Collection collection) {
        this.a = 0;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = a0Var;
        this.e = sVar;
        this.b = i10;
        this.f = eVar.d;
        this.h = a0Var2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new ag.e(this, 12), 15000L);
    }
}
