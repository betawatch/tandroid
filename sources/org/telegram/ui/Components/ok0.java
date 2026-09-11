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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class ok0 {
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

    public ok0(ll0 ll0Var, s4.c0 c0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = ll0Var;
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
                ll0 ll0Var = (ll0) this.e;
                ll0Var.setVerticalScrollBarEnabled(true);
                ll0Var.X1 = false;
                s4.h0 adapter = ll0Var.getAdapter();
                if (adapter instanceof mk0) {
                    ((mk0) adapter).E();
                }
                this.g = null;
                int childCount = ll0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ll0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(false, false);
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
        c0.k kVar;
        p4.v vVar = (p4.v) this.f;
        int i10 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        p4.x.b();
        if (this.c || this.d) {
            return;
        }
        p4.e eVar = (p4.e) weakReference.get();
        if (eVar == null || eVar.g != this || ((kVar = (c0.k) this.k) != null && kVar.isCancelled())) {
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
        long j3;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        s4.c0 c0Var = (s4.c0) this.f;
        ll0 ll0Var = (ll0) this.e;
        if (ll0Var.X1) {
            return;
        }
        if (ll0Var.getItemAnimator() != null) {
            if (z11) {
                s4.m0 itemAnimator = ll0Var.getItemAnimator();
                jk0 jk0Var = new jk0(this, i10, i11, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(jk0Var);
                } else {
                    c(i10, i11, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (ll0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            c0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = ll0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            c0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.b == 0;
        ll0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        s4.h0 adapter = ll0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = ll0Var.getChildAt(i12);
            arrayList.add(childAt);
            c0Var.getClass();
            sparseArray.put(s4.o0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                h0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((s4.p0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        h0Var = adapter;
                        i12++;
                        adapter = h0Var;
                    } else {
                        h0Var = adapter;
                        j3 = adapter.i(b10);
                    }
                } else {
                    h0Var = adapter;
                    j3 = ((s4.p0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j3), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) childAt).e(true, true);
            }
            i12++;
            adapter = h0Var;
        }
        s4.h0 h0Var2 = adapter;
        ll0Var.B0();
        ll0Var.o0();
        ra.a aVar = ll0Var.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        pf.e eVar = ll0Var.b;
        s4.h0 h0Var3 = ll0Var.w;
        eVar.d(h0Var3, h0Var3);
        ll0Var.t0.f = true;
        ll0Var.e.L();
        eVar.l();
        mk0 mk0Var = h0Var2 instanceof mk0 ? (mk0) h0Var2 : null;
        c0Var.i1(i10, i11, z10);
        if (h0Var2 != null) {
            h0Var2.l();
        }
        ll0Var.B0();
        ll0Var.setVerticalScrollBarEnabled(false);
        w7.y5 y5Var = (w7.y5) this.i;
        if (y5Var != null) {
            y5Var.c();
        }
        ll0Var.X1 = true;
        if (mk0Var != null) {
            mk0Var.c = true;
            mk0Var.d = false;
            mk0Var.e.clear();
            mk0Var.f.clear();
        }
        ll0Var.addOnLayoutChangeListener(new lk0(this, h0Var2, arrayList, z12, mk0Var));
    }

    public ok0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
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
        eVar.a.postDelayed(new org.telegram.ui.web.b(this, 11), 15000L);
    }
}
