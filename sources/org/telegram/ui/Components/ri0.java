package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class ri0 {
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

    public ri0(pj0 pj0Var, v4.b0 b0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = pj0Var;
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
                pj0 pj0Var = (pj0) this.e;
                pj0Var.setVerticalScrollBarEnabled(true);
                pj0Var.V1 = false;
                v4.g0 adapter = pj0Var.getAdapter();
                if (adapter instanceof pi0) {
                    ((pi0) adapter).E();
                }
                this.g = null;
                int childCount = pj0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = pj0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(false, false);
                    }
                }
                break;
            default:
                s4.q qVar = (s4.q) this.e;
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
        s4.v vVar = (s4.v) this.f;
        int i7 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        s4.x.b();
        if (this.c || this.d) {
            return;
        }
        s4.e eVar = (s4.e) weakReference.get();
        if (eVar == null || eVar.g != this || ((lVar = (c0.l) this.k) != null && lVar.isCancelled())) {
            a();
            return;
        }
        this.c = true;
        eVar.g = null;
        s4.e eVar2 = (s4.e) weakReference.get();
        if (eVar2 != null) {
            HashMap hashMap = eVar2.b;
            if (eVar2.d == vVar) {
                Message obtainMessage = eVar2.a.obtainMessage(org.telegram.messenger.qs.m4, vVar);
                obtainMessage.arg1 = i7;
                obtainMessage.sendToTarget();
                s4.q qVar = eVar2.e;
                if (qVar != null) {
                    qVar.h(i7);
                    eVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (s4.q qVar2 : hashMap.values()) {
                        qVar2.h(i7);
                        qVar2.d();
                    }
                    hashMap.clear();
                }
                eVar2.e = null;
            }
        }
        s4.e eVar3 = (s4.e) weakReference.get();
        if (eVar3 == null) {
            return;
        }
        s4.b bVar = eVar3.a;
        s4.v vVar2 = (s4.v) this.g;
        eVar3.d = vVar2;
        eVar3.e = (s4.q) this.e;
        s4.v vVar3 = (s4.v) this.h;
        if (vVar3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(org.telegram.messenger.qs.l4, new q0.b(vVar, vVar2));
            obtainMessage2.arg1 = i7;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(org.telegram.messenger.qs.n4, new q0.b(vVar3, vVar2));
            obtainMessage3.arg1 = i7;
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

    public void c(int i7, int i10, boolean z9) {
        d(i7, i10, z9, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(int i7, int i10, boolean z9, boolean z10) {
        v4.g0 g0Var;
        long j3;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        v4.b0 b0Var = (v4.b0) this.f;
        pj0 pj0Var = (pj0) this.e;
        if (pj0Var.V1) {
            return;
        }
        if (pj0Var.getItemAnimator() != null) {
            if (z10) {
                v4.l0 itemAnimator = pj0Var.getItemAnimator();
                mi0 mi0Var = new mi0(this, i7, i10, z9);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(mi0Var);
                } else {
                    d(i7, i10, z9, false);
                }
                if (k10) {
                    return;
                }
            } else if (pj0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            b0Var.i1(i7, i10, z9);
            return;
        }
        int childCount = pj0Var.getChildCount();
        if (childCount == 0 || pj0Var.getVisibility() != 0 || !org.telegram.messenger.qp.e1().getBoolean("view_animations", true)) {
            b0Var.i1(i7, i10, z9);
            return;
        }
        boolean z11 = this.b == 0;
        pj0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        v4.g0 adapter = pj0Var.getAdapter();
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = pj0Var.getChildAt(i11);
            arrayList.add(childAt);
            b0Var.getClass();
            sparseArray.put(v4.n0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                g0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((v4.o0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        g0Var = adapter;
                        i11++;
                        adapter = g0Var;
                    } else {
                        g0Var = adapter;
                        j3 = adapter.c(b10);
                    }
                } else {
                    g0Var = adapter;
                    j3 = ((v4.o0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j3), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, true);
            }
            i11++;
            adapter = g0Var;
        }
        v4.g0 g0Var2 = adapter;
        pj0Var.C0();
        pj0Var.p0();
        ug.k0 k0Var = pj0Var.d;
        k0Var.l((ArrayList) k0Var.d);
        k0Var.l((ArrayList) k0Var.e);
        k0Var.b = 0;
        v4.v0 v0Var = pj0Var.b;
        v4.g0 g0Var3 = pj0Var.x;
        v0Var.d(g0Var3, g0Var3);
        pj0Var.u0.f = true;
        pj0Var.e.G();
        v0Var.l();
        pi0 pi0Var = g0Var2 instanceof pi0 ? (pi0) g0Var2 : null;
        b0Var.i1(i7, i10, z9);
        if (g0Var2 != null) {
            g0Var2.f();
        }
        pj0Var.C0();
        pj0Var.setVerticalScrollBarEnabled(false);
        c8.ja jaVar = (c8.ja) this.i;
        if (jaVar != null) {
            jaVar.c();
        }
        pj0Var.V1 = true;
        if (pi0Var != null) {
            pi0Var.c = true;
            pi0Var.d = false;
            pi0Var.e.clear();
            pi0Var.f.clear();
        }
        pj0Var.addOnLayoutChangeListener(new oi0(this, g0Var2, arrayList, z11, pi0Var));
    }

    public void e(c8.ja jaVar) {
        this.i = jaVar;
    }

    public ri0(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.a = 1;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = vVar;
        this.e = qVar;
        this.b = i7;
        this.f = eVar.d;
        this.h = vVar2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new org.telegram.ui.ActionBar.m5(this, 27), 15000L);
    }
}
