package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class wi0 {
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

    public wi0(uj0 uj0Var, v4.b0 b0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = uj0Var;
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
                uj0 uj0Var = (uj0) this.e;
                uj0Var.setVerticalScrollBarEnabled(true);
                uj0Var.W1 = false;
                v4.h0 adapter = uj0Var.getAdapter();
                if (adapter instanceof ui0) {
                    ((ui0) adapter).E();
                }
                this.g = null;
                int childCount = uj0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = uj0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).b(false, false);
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
                Message obtainMessage = eVar2.a.obtainMessage(org.telegram.messenger.ns.m4, vVar);
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
            Message obtainMessage2 = bVar.obtainMessage(org.telegram.messenger.ns.l4, new q0.b(vVar, vVar2));
            obtainMessage2.arg1 = i7;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(org.telegram.messenger.ns.n4, new q0.b(vVar3, vVar2));
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

    public void c(int i7, int i10, boolean z10) {
        d(i7, i10, z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(int i7, int i10, boolean z10, boolean z11) {
        v4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        v4.b0 b0Var = (v4.b0) this.f;
        uj0 uj0Var = (uj0) this.e;
        if (uj0Var.W1) {
            return;
        }
        if (uj0Var.getItemAnimator() != null) {
            if (z11) {
                v4.m0 itemAnimator = uj0Var.getItemAnimator();
                ri0 ri0Var = new ri0(this, i7, i10, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(ri0Var);
                } else {
                    d(i7, i10, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (uj0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            b0Var.i1(i7, i10, z10);
            return;
        }
        int childCount = uj0Var.getChildCount();
        if (childCount == 0 || uj0Var.getVisibility() != 0 || !org.telegram.messenger.np.e1().getBoolean("view_animations", true)) {
            b0Var.i1(i7, i10, z10);
            return;
        }
        boolean z12 = this.b == 0;
        uj0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        v4.h0 adapter = uj0Var.getAdapter();
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = uj0Var.getChildAt(i11);
            arrayList.add(childAt);
            b0Var.getClass();
            sparseArray.put(v4.o0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                h0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((v4.p0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        h0Var = adapter;
                        i11++;
                        adapter = h0Var;
                    } else {
                        h0Var = adapter;
                        j3 = adapter.c(b10);
                    }
                } else {
                    h0Var = adapter;
                    j3 = ((v4.p0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j3), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).b(true, true);
            }
            i11++;
            adapter = h0Var;
        }
        v4.h0 h0Var2 = adapter;
        uj0Var.C0();
        uj0Var.p0();
        ug.l0 l0Var = uj0Var.d;
        l0Var.l((ArrayList) l0Var.d);
        l0Var.l((ArrayList) l0Var.e);
        l0Var.b = 0;
        v4.w0 w0Var = uj0Var.b;
        v4.h0 h0Var3 = uj0Var.x;
        w0Var.d(h0Var3, h0Var3);
        uj0Var.v0.f = true;
        uj0Var.e.E();
        w0Var.l();
        ui0 ui0Var = h0Var2 instanceof ui0 ? (ui0) h0Var2 : null;
        b0Var.i1(i7, i10, z10);
        if (h0Var2 != null) {
            h0Var2.f();
        }
        uj0Var.C0();
        uj0Var.setVerticalScrollBarEnabled(false);
        c8.ma maVar = (c8.ma) this.i;
        if (maVar != null) {
            maVar.c();
        }
        uj0Var.W1 = true;
        if (ui0Var != null) {
            ui0Var.c = true;
            ui0Var.d = false;
            ui0Var.e.clear();
            ui0Var.f.clear();
        }
        uj0Var.addOnLayoutChangeListener(new ti0(this, h0Var2, arrayList, z12, ui0Var));
    }

    public void e(c8.ma maVar) {
        this.i = maVar;
    }

    public wi0(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
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
        eVar.a.postDelayed(new q2.d(this, 7), 15000L);
    }
}
