package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class pl0 {
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

    public pl0(mm0 mm0Var, s4.b0 b0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = mm0Var;
        this.f = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mm0 mm0Var = (mm0) this.e;
                mm0Var.setVerticalScrollBarEnabled(true);
                mm0Var.V1 = false;
                s4.g0 adapter = mm0Var.getAdapter();
                if (adapter instanceof nl0) {
                    ((nl0) adapter).E();
                }
                this.g = null;
                int childCount = mm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = mm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).d(false, false);
                    }
                }
                break;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.c && !this.d) {
                    this.d = true;
                    if (qVar != null) {
                        qVar.h(0);
                        qVar.d();
                        break;
                    }
                }
                break;
        }
    }

    public void b() {
        c0.l lVar;
        p4.v vVar = (p4.v) this.f;
        int i10 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        p4.x.b();
        if (this.c || this.d) {
            return;
        }
        p4.e eVar = (p4.e) weakReference.get();
        if (eVar == null || eVar.g != this || ((lVar = (c0.l) this.k) != null && lVar.isCancelled())) {
            a();
            return;
        }
        this.c = true;
        eVar.g = null;
        p4.e eVar2 = (p4.e) weakReference.get();
        if (eVar2 != null) {
            HashMap hashMap = eVar2.b;
            if (eVar2.d == vVar) {
                Message obtainMessage = eVar2.a.obtainMessage(263, vVar);
                obtainMessage.arg1 = i10;
                obtainMessage.sendToTarget();
                p4.q qVar = eVar2.e;
                if (qVar != null) {
                    qVar.h(i10);
                    eVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (p4.q qVar2 : hashMap.values()) {
                        qVar2.h(i10);
                        qVar2.d();
                    }
                    hashMap.clear();
                }
                eVar2.e = null;
            }
        }
        p4.e eVar3 = (p4.e) weakReference.get();
        if (eVar3 == null) {
            return;
        }
        p4.b bVar = eVar3.a;
        p4.v vVar2 = (p4.v) this.g;
        eVar3.d = vVar2;
        eVar3.e = (p4.q) this.e;
        p4.v vVar3 = (p4.v) this.h;
        if (vVar3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
            obtainMessage2.arg1 = i10;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
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
    public void c(int i10, int i11, boolean z10, boolean z11) {
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        s4.b0 b0Var = (s4.b0) this.f;
        mm0 mm0Var = (mm0) this.e;
        if (mm0Var.V1) {
            return;
        }
        if (mm0Var.getItemAnimator() != null) {
            if (z11) {
                s4.l0 itemAnimator = mm0Var.getItemAnimator();
                kl0 kl0Var = new kl0(this, i10, i11, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(kl0Var);
                } else {
                    c(i10, i11, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (mm0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            b0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = mm0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            b0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.b == 0;
        mm0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        s4.g0 adapter = mm0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = mm0Var.getChildAt(i12);
            arrayList.add(childAt);
            b0Var.getClass();
            sparseArray.put(s4.n0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                g0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((s4.o0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        g0Var = adapter;
                        i12++;
                        adapter = g0Var;
                    } else {
                        g0Var = adapter;
                        j10 = adapter.i(b10);
                    }
                } else {
                    g0Var = adapter;
                    j10 = ((s4.o0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) childAt).d(true, true);
            }
            i12++;
            adapter = g0Var;
        }
        s4.g0 g0Var2 = adapter;
        mm0Var.B0();
        mm0Var.o0();
        s4.b bVar = mm0Var.d;
        bVar.m((ArrayList) bVar.d);
        bVar.m((ArrayList) bVar.e);
        bVar.b = 0;
        qf.e eVar = mm0Var.b;
        s4.g0 g0Var3 = mm0Var.w;
        eVar.d(g0Var3, g0Var3);
        mm0Var.u0.f = true;
        mm0Var.e.R();
        eVar.l();
        nl0 nl0Var = g0Var2 instanceof nl0 ? (nl0) g0Var2 : null;
        b0Var.i1(i10, i11, z10);
        if (g0Var2 != null) {
            g0Var2.l();
        }
        mm0Var.B0();
        mm0Var.setVerticalScrollBarEnabled(false);
        w7.a6 a6Var = (w7.a6) this.i;
        if (a6Var != null) {
            a6Var.c();
        }
        mm0Var.V1 = true;
        if (nl0Var != null) {
            nl0Var.c = true;
            nl0Var.d = false;
            nl0Var.e.clear();
            nl0Var.f.clear();
        }
        mm0Var.addOnLayoutChangeListener(new ml0(this, g0Var2, arrayList, z12, nl0Var));
    }

    public void d(w7.a6 a6Var) {
        this.i = a6Var;
    }

    public pl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.a = 1;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = vVar;
        this.e = qVar;
        this.b = i10;
        this.f = eVar.d;
        this.h = vVar2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new org.telegram.ui.web.a2(this, 3), 15000L);
    }
}
