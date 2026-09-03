package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import k7.c6;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public z(rl0 rl0Var, f2.i0 i0Var) {
        this.a = 1;
        this.j = new SparseArray();
        this.k = new HashMap();
        this.e = rl0Var;
        this.f = i0Var;
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
                rl0 rl0Var = (rl0) this.e;
                rl0Var.setVerticalScrollBarEnabled(true);
                rl0Var.U1 = false;
                f2.o0 adapter = rl0Var.getAdapter();
                if (adapter instanceof wk0) {
                    ((wk0) adapter).E();
                }
                this.g = null;
                int childCount = rl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = rl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof n4) {
                        ((n4) childAt).c(false, false);
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
    public void c(int i10, int i11, boolean z4, boolean z10) {
        f2.o0 o0Var;
        long j10;
        HashMap hashMap = (HashMap) this.k;
        SparseArray sparseArray = (SparseArray) this.j;
        f2.i0 i0Var = (f2.i0) this.f;
        rl0 rl0Var = (rl0) this.e;
        if (rl0Var.U1) {
            return;
        }
        if (rl0Var.getItemAnimator() != null) {
            if (z10) {
                f2.t0 itemAnimator = rl0Var.getItemAnimator();
                tk0 tk0Var = new tk0(this, i10, i11, z4);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(tk0Var);
                } else {
                    c(i10, i11, z4, false);
                }
                if (k10) {
                    return;
                }
            } else if (rl0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            i0Var.i1(i10, i11, z4);
            return;
        }
        int childCount = rl0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            i0Var.i1(i10, i11, z4);
            return;
        }
        boolean z11 = this.b == 0;
        rl0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        f2.o0 adapter = rl0Var.getAdapter();
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = rl0Var.getChildAt(i12);
            arrayList.add(childAt);
            i0Var.getClass();
            sparseArray.put(f2.v0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                o0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((f2.w0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        o0Var = adapter;
                        i12++;
                        adapter = o0Var;
                    } else {
                        o0Var = adapter;
                        j10 = adapter.i(b10);
                    }
                } else {
                    o0Var = adapter;
                    j10 = ((f2.w0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j10), childAt);
            }
            if (childAt instanceof n4) {
                ((n4) childAt).c(true, true);
            }
            i12++;
            adapter = o0Var;
        }
        f2.o0 o0Var2 = adapter;
        rl0Var.B0();
        rl0Var.o0();
        da.a aVar = rl0Var.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.e);
        aVar.b = 0;
        af.h hVar = rl0Var.b;
        f2.o0 o0Var3 = rl0Var.w;
        hVar.d(o0Var3, o0Var3);
        rl0Var.q0.f = true;
        rl0Var.e.y();
        hVar.l();
        wk0 wk0Var = o0Var2 instanceof wk0 ? (wk0) o0Var2 : null;
        i0Var.i1(i10, i11, z4);
        if (o0Var2 != null) {
            o0Var2.l();
        }
        rl0Var.B0();
        rl0Var.setVerticalScrollBarEnabled(false);
        c6 c6Var = (c6) this.i;
        if (c6Var != null) {
            c6Var.c();
        }
        rl0Var.U1 = true;
        if (wk0Var != null) {
            wk0Var.c = true;
            wk0Var.d = false;
            wk0Var.e.clear();
            wk0Var.f.clear();
        }
        rl0Var.addOnLayoutChangeListener(new vk0(this, o0Var2, arrayList, z11, wk0Var));
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
        eVar.a.postDelayed(new ag.d(this, 11), 15000L);
    }
}
