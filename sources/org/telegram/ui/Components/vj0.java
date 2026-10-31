package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class vj0 {
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

    public vj0(tk0 tk0Var, s4.a0 a0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = tk0Var;
        this.f = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tk0 tk0Var = (tk0) this.e;
                tk0Var.setVerticalScrollBarEnabled(true);
                tk0Var.V1 = false;
                s4.g0 adapter = tk0Var.getAdapter();
                if (adapter instanceof tj0) {
                    ((tj0) adapter).E();
                }
                this.g = null;
                int childCount = tk0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tk0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) childAt).b(false, false);
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
        p4.w wVar = (p4.w) this.f;
        int i10 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        p4.y.b();
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
            if (eVar2.d == wVar) {
                Message obtainMessage = eVar2.a.obtainMessage(org.telegram.messenger.zs.m4, wVar);
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
        p4.w wVar2 = (p4.w) this.g;
        eVar3.d = wVar2;
        eVar3.e = (p4.q) this.e;
        p4.w wVar3 = (p4.w) this.h;
        if (wVar3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(org.telegram.messenger.zs.l4, new q0.b(wVar, wVar2));
            obtainMessage2.arg1 = i10;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(org.telegram.messenger.zs.n4, new q0.b(wVar3, wVar2));
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
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        s4.a0 a0Var = (s4.a0) this.f;
        tk0 tk0Var = (tk0) this.e;
        if (tk0Var.V1) {
            return;
        }
        if (tk0Var.getItemAnimator() != null) {
            if (z11) {
                s4.l0 itemAnimator = tk0Var.getItemAnimator();
                qj0 qj0Var = new qj0(this, i10, i11, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(qj0Var);
                } else {
                    d(i10, i11, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (tk0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            a0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = tk0Var.getChildCount();
        if (childCount == 0 || !org.telegram.messenger.vp.d1().getBoolean("view_animations", true)) {
            a0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.b == 0;
        tk0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        s4.g0 adapter = tk0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = tk0Var.getChildAt(i12);
            arrayList.add(childAt);
            a0Var.getClass();
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
                        j10 = adapter.c(b10);
                    }
                } else {
                    g0Var = adapter;
                    j10 = ((s4.o0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.r4) {
                ((org.telegram.ui.Cells.r4) childAt).b(true, true);
            }
            i12++;
            adapter = g0Var;
        }
        s4.g0 g0Var2 = adapter;
        tk0Var.C0();
        tk0Var.p0();
        kg.s0 s0Var = tk0Var.d;
        s0Var.m((ArrayList) s0Var.d);
        s0Var.m((ArrayList) s0Var.e);
        s0Var.b = 0;
        hf.e eVar = tk0Var.b;
        s4.g0 g0Var3 = tk0Var.x;
        eVar.d(g0Var3, g0Var3);
        tk0Var.u0.f = true;
        tk0Var.e.w();
        eVar.l();
        tj0 tj0Var = g0Var2 instanceof tj0 ? (tj0) g0Var2 : null;
        a0Var.i1(i10, i11, z10);
        if (g0Var2 != null) {
            g0Var2.f();
        }
        tk0Var.C0();
        tk0Var.setVerticalScrollBarEnabled(false);
        w7.d6 d6Var = (w7.d6) this.i;
        if (d6Var != null) {
            d6Var.c();
        }
        tk0Var.V1 = true;
        if (tj0Var != null) {
            tj0Var.c = true;
            tj0Var.d = false;
            tj0Var.e.clear();
            tj0Var.f.clear();
        }
        tk0Var.addOnLayoutChangeListener(new sj0(this, g0Var2, arrayList, z12, tj0Var));
    }

    public void e(w7.d6 d6Var) {
        this.i = d6Var;
    }

    public vj0(p4.e eVar, p4.w wVar, p4.q qVar, int i10, p4.w wVar2, Collection collection) {
        this.a = 1;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = wVar;
        this.e = qVar;
        this.b = i10;
        this.f = eVar.d;
        this.h = wVar2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new org.telegram.ui.ActionBar.w5(this, 23), 15000L);
    }
}
