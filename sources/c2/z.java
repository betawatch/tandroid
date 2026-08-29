package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import f2.d1;
import i7.g6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.mk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class z {
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

    public z(jl0 jl0Var, f2.j0 j0Var) {
        this.a = 1;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = jl0Var;
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
                jl0 jl0Var = (jl0) this.e;
                jl0Var.setVerticalScrollBarEnabled(true);
                jl0Var.T1 = false;
                f2.p0 adapter = jl0Var.getAdapter();
                if (adapter instanceof mk0) {
                    ((mk0) adapter).E();
                }
                this.g = null;
                int childCount = jl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = jl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof m4) {
                        ((m4) childAt).b(false, false);
                    }
                }
                break;
        }
    }

    public void b() {
        c0.k kVar;
        b0 b0Var = (b0) this.f;
        int i10 = this.b;
        WeakReference weakReference = (WeakReference) this.j;
        d0.b();
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
            if (eVar2.d == b0Var) {
                Message obtainMessage = eVar2.a.obtainMessage(263, b0Var);
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
        b0 b0Var2 = (b0) this.g;
        eVar3.d = b0Var2;
        eVar3.e = (s) this.e;
        b0 b0Var3 = (b0) this.h;
        if (b0Var3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(b0Var, b0Var2));
            obtainMessage2.arg1 = i10;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(b0Var3, b0Var2));
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
        f2.p0 p0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        f2.j0 j0Var = (f2.j0) this.f;
        jl0 jl0Var = (jl0) this.e;
        if (jl0Var.T1) {
            return;
        }
        if (jl0Var.getItemAnimator() != null) {
            if (z11) {
                f2.u0 itemAnimator = jl0Var.getItemAnimator();
                jk0 jk0Var = new jk0(this, i10, i11, z10);
                boolean k9 = itemAnimator.k();
                if (k9) {
                    itemAnimator.b.add(jk0Var);
                } else {
                    c(i10, i11, z10, false);
                }
                if (k9) {
                    return;
                }
            } else if (jl0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            j0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = jl0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            j0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.b == 0;
        jl0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        f2.p0 adapter = jl0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = jl0Var.getChildAt(i12);
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
            if (childAt instanceof m4) {
                ((m4) childAt).b(true, true);
            }
            i12++;
            adapter = p0Var;
        }
        f2.p0 p0Var2 = adapter;
        jl0Var.B0();
        jl0Var.o0();
        ba.a aVar = jl0Var.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        d1 d1Var = jl0Var.b;
        f2.p0 p0Var3 = jl0Var.w;
        d1Var.d(p0Var3, p0Var3);
        jl0Var.p0.f = true;
        jl0Var.e.z();
        d1Var.l();
        mk0 mk0Var = p0Var2 instanceof mk0 ? (mk0) p0Var2 : null;
        j0Var.i1(i10, i11, z10);
        if (p0Var2 != null) {
            p0Var2.l();
        }
        jl0Var.B0();
        jl0Var.setVerticalScrollBarEnabled(false);
        g6 g6Var = (g6) this.i;
        if (g6Var != null) {
            g6Var.c();
        }
        jl0Var.T1 = true;
        if (mk0Var != null) {
            mk0Var.c = true;
            mk0Var.d = false;
            mk0Var.e.clear();
            mk0Var.f.clear();
        }
        jl0Var.addOnLayoutChangeListener(new lk0(this, p0Var2, arrayList, z12, mk0Var));
    }

    public z(e eVar, b0 b0Var, s sVar, int i10, b0 b0Var2, Collection collection) {
        this.a = 0;
        this.k = null;
        this.c = false;
        this.d = false;
        this.j = new WeakReference(eVar);
        this.g = b0Var;
        this.e = sVar;
        this.b = i10;
        this.f = eVar.d;
        this.h = b0Var2;
        this.i = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new a4.g(this, 24), 15000L);
    }
}
