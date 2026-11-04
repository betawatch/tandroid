package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class vi0 {
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

    public vi0(tj0 tj0Var, u4.b0 b0Var) {
        this.a = 0;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = tj0Var;
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
                tj0 tj0Var = (tj0) this.e;
                tj0Var.setVerticalScrollBarEnabled(true);
                tj0Var.W1 = false;
                u4.h0 adapter = tj0Var.getAdapter();
                if (adapter instanceof ti0) {
                    ((ti0) adapter).E();
                }
                this.g = null;
                int childCount = tj0Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = tj0Var.getChildAt(i3);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).b(false, false);
                    }
                }
                break;
            default:
                r4.q qVar = (r4.q) this.e;
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
        r4.w wVar = (r4.w) this.f;
        int i3 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        r4.y.b();
        if (this.c || this.d) {
            return;
        }
        r4.e eVar = (r4.e) weakReference.get();
        if (eVar == null || eVar.g != this || ((lVar = (c0.l) this.k) != null && lVar.isCancelled())) {
            a();
            return;
        }
        this.c = true;
        eVar.g = null;
        r4.e eVar2 = (r4.e) weakReference.get();
        if (eVar2 != null) {
            HashMap hashMap = eVar2.b;
            if (eVar2.d == wVar) {
                Message obtainMessage = eVar2.a.obtainMessage(org.telegram.messenger.hs.m4, wVar);
                obtainMessage.arg1 = i3;
                obtainMessage.sendToTarget();
                r4.q qVar = eVar2.e;
                if (qVar != null) {
                    qVar.h(i3);
                    eVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (r4.q qVar2 : hashMap.values()) {
                        qVar2.h(i3);
                        qVar2.d();
                    }
                    hashMap.clear();
                }
                eVar2.e = null;
            }
        }
        r4.e eVar3 = (r4.e) weakReference.get();
        if (eVar3 == null) {
            return;
        }
        r4.b bVar = eVar3.a;
        r4.w wVar2 = (r4.w) this.g;
        eVar3.d = wVar2;
        eVar3.e = (r4.q) this.e;
        r4.w wVar3 = (r4.w) this.h;
        if (wVar3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(org.telegram.messenger.hs.l4, new q0.b(wVar, wVar2));
            obtainMessage2.arg1 = i3;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(org.telegram.messenger.hs.n4, new q0.b(wVar3, wVar2));
            obtainMessage3.arg1 = i3;
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

    public void c(int i3, int i10, boolean z10) {
        d(i3, i10, z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(int i3, int i10, boolean z10, boolean z11) {
        u4.h0 h0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        u4.b0 b0Var = (u4.b0) this.f;
        tj0 tj0Var = (tj0) this.e;
        if (tj0Var.W1) {
            return;
        }
        if (tj0Var.getItemAnimator() != null) {
            if (z11) {
                u4.m0 itemAnimator = tj0Var.getItemAnimator();
                pi0 pi0Var = new pi0(this, i3, i10, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(pi0Var);
                } else {
                    d(i3, i10, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (tj0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            b0Var.i1(i3, i10, z10);
            return;
        }
        int childCount = tj0Var.getChildCount();
        if (childCount == 0 || !org.telegram.messenger.hp.e1().getBoolean("view_animations", true)) {
            b0Var.i1(i3, i10, z10);
            return;
        }
        boolean z12 = this.b == 0;
        tj0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        u4.h0 adapter = tj0Var.getAdapter();
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = tj0Var.getChildAt(i11);
            arrayList.add(childAt);
            b0Var.getClass();
            sparseArray.put(u4.o0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                h0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((u4.p0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        h0Var = adapter;
                        i11++;
                        adapter = h0Var;
                    } else {
                        h0Var = adapter;
                        j10 = adapter.c(b10);
                    }
                } else {
                    h0Var = adapter;
                    j10 = ((u4.p0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).b(true, true);
            }
            i11++;
            adapter = h0Var;
        }
        u4.h0 h0Var2 = adapter;
        tj0Var.C0();
        tj0Var.p0();
        u4.b bVar = tj0Var.d;
        bVar.l((ArrayList) bVar.d);
        bVar.l((ArrayList) bVar.e);
        bVar.b = 0;
        tf.e eVar = tj0Var.b;
        u4.h0 h0Var3 = tj0Var.x;
        eVar.d(h0Var3, h0Var3);
        tj0Var.v0.f = true;
        tj0Var.e.B();
        eVar.l();
        ti0 ti0Var = h0Var2 instanceof ti0 ? (ti0) h0Var2 : null;
        b0Var.i1(i3, i10, z10);
        if (h0Var2 != null) {
            h0Var2.f();
        }
        tj0Var.C0();
        tj0Var.setVerticalScrollBarEnabled(false);
        b8.of ofVar = (b8.of) this.i;
        if (ofVar != null) {
            ofVar.c();
        }
        tj0Var.W1 = true;
        if (ti0Var != null) {
            ti0Var.c = true;
            ti0Var.d = false;
            ti0Var.e.clear();
            ti0Var.f.clear();
        }
        tj0Var.addOnLayoutChangeListener(new si0(this, h0Var2, arrayList, z12, ti0Var));
    }

    public void e(b8.of ofVar) {
        this.i = ofVar;
    }

    public vi0(r4.e eVar, r4.w wVar, r4.q qVar, int i3, r4.w wVar2, Collection collection) {
        this.a = 1;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = wVar;
        this.e = qVar;
        this.b = i3;
        this.f = eVar.d;
        this.h = wVar2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new r4.u(this, 0), 15000L);
    }
}
