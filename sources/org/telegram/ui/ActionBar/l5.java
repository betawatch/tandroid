package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import c8.oa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class l5 implements u4 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public Object h;
    public Object n;
    public Object r;
    public final Object s;
    public Object w;

    public l5(k5 k5Var, ri.a aVar, i6 i6Var) {
        this.a = 0;
        this.b = 0;
        this.s = new int[2];
        this.w = new Rect();
        this.e = k5Var;
        this.f = aVar;
        this.h = i6Var;
        this.n = c8.i0.m(i6Var);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public boolean b(r0 r0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.r).getWidth(), ((View) this.r).getHeight());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c() {
        switch (this.a) {
            case 1:
                ValueAnimator valueAnimator = (ValueAnimator) this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ck0 ck0Var = (ck0) this.e;
                ck0Var.setVerticalScrollBarEnabled(true);
                ck0Var.W1 = false;
                v4.i0 adapter = ck0Var.getAdapter();
                if (adapter instanceof dj0) {
                    ((dj0) adapter).E();
                }
                this.h = null;
                int childCount = ck0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ck0Var.getChildAt(i7);
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

    @Override // org.telegram.ui.ActionBar.u4
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public boolean f() {
        int[] iArr = (int[]) this.s;
        Rect rect = (Rect) this.w;
        View view = (View) this.r;
        if (view == null || this.d) {
            return false;
        }
        view.getLocationOnScreen(iArr);
        ((View) this.r).getWindowVisibleDisplayFrame(rect);
        return (((View) this.r).getHeight() / 2) + iArr[1] > (rect.height() > 0 ? rect.centerY() : org.telegram.messenger.g0.q.y / 2);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public fh.g g(k5 k5Var) {
        fh.g c10 = ((ri.a) this.f).d.c(k5Var, null, false);
        c10.p((gh.e) this.n);
        n10.s(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.n;
        return eVar.a(eVar.e);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.n;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuAnchorTint() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuDimAlpha() {
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuExtraBelow() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public gh.a getMenuGlassColorProvider() {
        return (gh.e) this.n;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public View getMenuHostView() {
        return (View) this.r;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuMaxHeight() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public i6 getMenuResourcesProvider() {
        return (i6) this.h;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public View getMenuView() {
        return (View) this.r;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public k5 getOpenMenuOverlay() {
        if (this.c) {
            return (k5) this.e;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void h(k5 k5Var, r0 r0Var) {
        boolean z10 = k5Var != null;
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        if (z10) {
            this.b = ((View) this.r).getVisibility();
            ((View) this.r).setVisibility(4);
        } else if (((View) this.r).getVisibility() == 4) {
            ((View) this.r).setVisibility(this.b);
        }
    }

    public void i() {
        c0.l lVar;
        s4.v vVar = (s4.v) this.f;
        int i7 = this.b;
        WeakReference weakReference = (WeakReference) this.s;
        s4.x.b();
        if (this.c || this.d) {
            return;
        }
        s4.e eVar = (s4.e) weakReference.get();
        if (eVar == null || eVar.g != this || ((lVar = (c0.l) this.w) != null && lVar.isCancelled())) {
            c();
            return;
        }
        this.c = true;
        eVar.g = null;
        s4.e eVar2 = (s4.e) weakReference.get();
        if (eVar2 != null) {
            HashMap hashMap = eVar2.b;
            if (eVar2.d == vVar) {
                Message obtainMessage = eVar2.a.obtainMessage(ks.m4, vVar);
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
        s4.v vVar2 = (s4.v) this.h;
        eVar3.d = vVar2;
        eVar3.e = (s4.q) this.e;
        s4.v vVar3 = (s4.v) this.n;
        if (vVar3 == null) {
            Message obtainMessage2 = bVar.obtainMessage(ks.l4, new q0.b(vVar, vVar2));
            obtainMessage2.arg1 = i7;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = bVar.obtainMessage(ks.n4, new q0.b(vVar3, vVar2));
            obtainMessage3.arg1 = i7;
            obtainMessage3.sendToTarget();
        }
        eVar3.b.clear();
        eVar3.g();
        eVar3.l();
        ArrayList arrayList = (ArrayList) this.r;
        if (arrayList != null) {
            eVar3.d.n(arrayList);
        }
    }

    public void j(int i7, int i10, boolean z10) {
        k(i7, i10, z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(int i7, int i10, boolean z10, boolean z11) {
        v4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.w;
        SparseArray sparseArray = (SparseArray) this.s;
        v4.c0 c0Var = (v4.c0) this.f;
        ck0 ck0Var = (ck0) this.e;
        if (ck0Var.W1) {
            return;
        }
        if (ck0Var.getItemAnimator() != null) {
            if (z11) {
                v4.n0 itemAnimator = ck0Var.getItemAnimator();
                aj0 aj0Var = new aj0(this, i7, i10, z10);
                boolean k10 = itemAnimator.k();
                if (k10) {
                    itemAnimator.b.add(aj0Var);
                } else {
                    k(i7, i10, z10, false);
                }
                if (k10) {
                    return;
                }
            } else if (ck0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            c0Var.i1(i7, i10, z10);
            return;
        }
        int childCount = ck0Var.getChildCount();
        if (childCount == 0 || ck0Var.getVisibility() != 0 || !mp.g1().getBoolean("view_animations", true)) {
            c0Var.i1(i7, i10, z10);
            return;
        }
        boolean z12 = this.b == 0;
        ck0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        v4.i0 adapter = ck0Var.getAdapter();
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = ck0Var.getChildAt(i11);
            arrayList.add(childAt);
            c0Var.getClass();
            sparseArray.put(v4.p0.H(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                i0Var = adapter;
            } else {
                if (this.c) {
                    int b10 = ((v4.q0) childAt.getLayoutParams()).a.b();
                    if (b10 < 0) {
                        i0Var = adapter;
                        i11++;
                        adapter = i0Var;
                    } else {
                        i0Var = adapter;
                        j3 = adapter.c(b10);
                    }
                } else {
                    i0Var = adapter;
                    j3 = ((v4.q0) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j3), childAt);
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, true);
            }
            i11++;
            adapter = i0Var;
        }
        v4.i0 i0Var2 = adapter;
        ck0Var.C0();
        ck0Var.p0();
        ug.n0 n0Var = ck0Var.d;
        n0Var.l((ArrayList) n0Var.d);
        n0Var.l((ArrayList) n0Var.e);
        n0Var.b = 0;
        v4.x0 x0Var = ck0Var.b;
        v4.i0 i0Var3 = ck0Var.x;
        x0Var.d(i0Var3, i0Var3);
        ck0Var.v0.f = true;
        ck0Var.e.E();
        x0Var.l();
        dj0 dj0Var = i0Var2 instanceof dj0 ? (dj0) i0Var2 : null;
        c0Var.i1(i7, i10, z10);
        if (i0Var2 != null) {
            i0Var2.f();
        }
        ck0Var.C0();
        ck0Var.setVerticalScrollBarEnabled(false);
        oa oaVar = (oa) this.r;
        if (oaVar != null) {
            oaVar.c();
        }
        ck0Var.W1 = true;
        if (dj0Var != null) {
            dj0Var.c = true;
            dj0Var.d = false;
            dj0Var.e.clear();
            dj0Var.f.clear();
        }
        ck0Var.addOnLayoutChangeListener(new cj0(this, i0Var2, arrayList, z12, dj0Var));
    }

    public void l(oa oaVar) {
        this.r = oaVar;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((ri.a) this.f).e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public l5(ck0 ck0Var, v4.c0 c0Var) {
        this.a = 1;
        this.s = new SparseArray();
        this.w = new HashMap();
        this.e = ck0Var;
        this.f = c0Var;
    }

    public l5(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.a = 2;
        this.w = null;
        this.c = false;
        this.d = false;
        this.s = new WeakReference(eVar);
        this.h = vVar;
        this.e = qVar;
        this.b = i7;
        this.f = eVar.d;
        this.n = vVar2;
        this.r = collection != null ? new ArrayList(collection) : null;
        eVar.a.postDelayed(new org.telegram.ui.web.z0(this, 10), 15000L);
    }
}
