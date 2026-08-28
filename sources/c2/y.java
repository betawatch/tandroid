package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import f2.g1;
import g7.f6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public y(wk0 wk0Var, f2.m0 m0Var) {
        this.a = 1;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = wk0Var;
        this.f = m0Var;
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
                wk0 wk0Var = (wk0) this.e;
                wk0Var.setVerticalScrollBarEnabled(true);
                wk0Var.T1 = false;
                f2.r0 adapter = wk0Var.getAdapter();
                if (adapter instanceof bk0) {
                    ((bk0) adapter).E();
                }
                this.g = null;
                int childCount = wk0Var.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = wk0Var.getChildAt(i9);
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
        int i9 = this.b;
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
                obtainMessage.arg1 = i9;
                obtainMessage.sendToTarget();
                r rVar = eVar2.e;
                if (rVar != null) {
                    rVar.h(i9);
                    eVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (r rVar2 : hashMap.values()) {
                        rVar2.h(i9);
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
        a0 a0Var2 = (a0) this.g;
        eVar3.d = a0Var2;
        eVar3.e = (r) this.e;
        a0 a0Var3 = (a0) this.h;
        if (a0Var3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(a0Var, a0Var2));
            obtainMessage2.arg1 = i9;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(a0Var3, a0Var2));
            obtainMessage3.arg1 = i9;
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
    public void c(int i9, int i10, boolean z10, boolean z11) {
        f2.r0 r0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        f2.m0 m0Var = (f2.m0) this.f;
        wk0 wk0Var = (wk0) this.e;
        if (wk0Var.T1) {
            return;
        }
        if (wk0Var.getItemAnimator() != null) {
            if (z11) {
                f2.w0 itemAnimator = wk0Var.getItemAnimator();
                yj0 yj0Var = new yj0(this, i9, i10, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(yj0Var);
                } else {
                    c(i9, i10, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (wk0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            m0Var.i1(i9, i10, z10);
            return;
        }
        int childCount = wk0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            m0Var.i1(i9, i10, z10);
            return;
        }
        boolean z12 = this.b == 0;
        wk0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        f2.r0 adapter = wk0Var.getAdapter();
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = wk0Var.getChildAt(i11);
            arrayList.add(childAt);
            m0Var.getClass();
            sparseArray.put(f2.z0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                r0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((f2.a1) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        r0Var = adapter;
                        i11++;
                        adapter = r0Var;
                    } else {
                        r0Var = adapter;
                        j10 = adapter.i(b10);
                    }
                } else {
                    r0Var = adapter;
                    j10 = ((f2.a1) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof o4) {
                ((o4) childAt).c(true, true);
            }
            i11++;
            adapter = r0Var;
        }
        f2.r0 r0Var2 = adapter;
        wk0Var.B0();
        wk0Var.o0();
        f2.b bVar = wk0Var.d;
        bVar.m((ArrayList) bVar.d);
        bVar.m((ArrayList) bVar.e);
        bVar.b = 0;
        g1 g1Var = wk0Var.b;
        f2.r0 r0Var3 = wk0Var.w;
        g1Var.d(r0Var3, r0Var3);
        wk0Var.p0.f = true;
        wk0Var.e.z();
        g1Var.l();
        bk0 bk0Var = r0Var2 instanceof bk0 ? (bk0) r0Var2 : null;
        m0Var.i1(i9, i10, z10);
        if (r0Var2 != null) {
            r0Var2.l();
        }
        wk0Var.B0();
        wk0Var.setVerticalScrollBarEnabled(false);
        f6 f6Var = (f6) this.i;
        if (f6Var != null) {
            f6Var.c();
        }
        wk0Var.T1 = true;
        if (bk0Var != null) {
            bk0Var.c = true;
            bk0Var.d = false;
            bk0Var.e.clear();
            bk0Var.f.clear();
        }
        wk0Var.addOnLayoutChangeListener(new ak0(this, r0Var2, arrayList, z12, bk0Var));
    }

    public y(e eVar, a0 a0Var, r rVar, int i9, a0 a0Var2, Collection collection) {
        this.a = 0;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = a0Var;
        this.e = rVar;
        this.b = i9;
        this.f = eVar.d;
        this.h = a0Var2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new af.e(this, 18), 15000L);
    }
}
