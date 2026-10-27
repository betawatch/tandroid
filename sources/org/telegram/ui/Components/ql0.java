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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ql0 {
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

    public ql0(nm0 nm0Var, s4.c0 c0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = nm0Var;
        this.f = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nm0 nm0Var = (nm0) this.e;
                nm0Var.setVerticalScrollBarEnabled(true);
                nm0Var.V1 = false;
                s4.h0 adapter = nm0Var.getAdapter();
                if (adapter instanceof ol0) {
                    ((ol0) adapter).E();
                }
                this.g = null;
                int childCount = nm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = nm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) childAt).b(false, false);
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
        s4.h0 h0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        s4.c0 c0Var = (s4.c0) this.f;
        nm0 nm0Var = (nm0) this.e;
        if (nm0Var.V1) {
            return;
        }
        if (nm0Var.getItemAnimator() != null) {
            if (z11) {
                s4.m0 itemAnimator = nm0Var.getItemAnimator();
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
            } else if (nm0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            c0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = nm0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            c0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.b == 0;
        nm0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        s4.h0 adapter = nm0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = nm0Var.getChildAt(i12);
            arrayList.add(childAt);
            c0Var.getClass();
            sparseArray.put(s4.p0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                h0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((s4.q0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        h0Var = adapter;
                        i12++;
                        adapter = h0Var;
                    } else {
                        h0Var = adapter;
                        j10 = adapter.i(b10);
                    }
                } else {
                    h0Var = adapter;
                    j10 = ((s4.q0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) childAt).b(true, true);
            }
            i12++;
            adapter = h0Var;
        }
        s4.h0 h0Var2 = adapter;
        nm0Var.C0();
        nm0Var.p0();
        s4.b bVar = nm0Var.d;
        bVar.m((ArrayList) bVar.d);
        bVar.m((ArrayList) bVar.e);
        bVar.b = 0;
        rf.e eVar = nm0Var.b;
        s4.h0 h0Var3 = nm0Var.w;
        eVar.d(h0Var3, h0Var3);
        nm0Var.u0.f = true;
        nm0Var.e.s();
        eVar.l();
        ol0 ol0Var = h0Var2 instanceof ol0 ? (ol0) h0Var2 : null;
        c0Var.i1(i10, i11, z10);
        if (h0Var2 != null) {
            h0Var2.l();
        }
        nm0Var.C0();
        nm0Var.setVerticalScrollBarEnabled(false);
        kb1 kb1Var = (kb1) this.i;
        if (kb1Var != null) {
            kb1Var.Q();
        }
        nm0Var.V1 = true;
        if (ol0Var != null) {
            ol0Var.c = true;
            ol0Var.d = false;
            ol0Var.e.clear();
            ol0Var.f.clear();
        }
        nm0Var.addOnLayoutChangeListener(new nl0(this, h0Var2, arrayList, z12, ol0Var));
    }

    public void d(kb1 kb1Var) {
        this.i = kb1Var;
    }

    public ql0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
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
        eVar.a.postDelayed(new org.telegram.ui.web.h1(this, 6), 15000L);
    }
}
