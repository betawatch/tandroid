// default package

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class hw6 implements o27 {
    public final /* synthetic */ byte a;
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

    public hw6(a05 a05Var, jw6 jw6Var, aw6 aw6Var, int i, jw6 jw6Var2, ArrayList arrayList) {
        this.a = (byte) 0;
        this.w = null;
        this.c = false;
        this.d = false;
        this.s = new WeakReference(a05Var);
        this.h = jw6Var;
        this.e = aw6Var;
        this.b = i;
        this.f = a05Var.d;
        this.n = jw6Var2;
        this.r = arrayList != null ? new ArrayList(arrayList) : null;
        a05Var.a.postDelayed(new gw6(this, (byte) 1), 15000L);
    }

    @Override // o27
    public final boolean a() {
        return false;
    }

    @Override // o27
    public final void b(ula ulaVar, s7 s7Var) {
        boolean z = ulaVar != null;
        if (this.c != z) {
            this.c = z;
            View view = (View) this.r;
            if (z) {
                this.b = view.getVisibility();
                ((View) this.r).setVisibility(4);
            } else if (view.getVisibility() == 4) {
                ((View) this.r).setVisibility(this.b);
            }
        }
    }

    @Override // o27
    public final boolean c(s7 s7Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.r).getWidth(), ((View) this.r).getHeight());
        return true;
    }

    @Override // o27
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                aw6 aw6Var = (aw6) obj;
                if (!this.c && !this.d) {
                    this.d = true;
                    if (aw6Var != null) {
                        aw6Var.h(0);
                        aw6Var.d();
                        break;
                    }
                }
                break;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                d79 d79Var = (d79) obj;
                d79Var.setVerticalScrollBarEnabled(true);
                d79Var.W1 = false;
                j79 adapter = d79Var.getAdapter();
                if (adapter instanceof g69) {
                    ((g69) adapter).E();
                }
                this.h = null;
                int childCount = d79Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = d79Var.getChildAt(i);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof pk5) {
                        ((pk5) childAt).b(false, false);
                    }
                }
                break;
        }
    }

    @Override // o27
    public final boolean f() {
        return true;
    }

    @Override // o27
    public final boolean g() {
        return false;
    }

    @Override // o27
    public final int getButtonsGlassBackgroundColor() {
        ol0 ol0Var = (ol0) this.n;
        return ol0Var.a(ol0Var.e);
    }

    @Override // o27
    public final bl0 getButtonsGlassColorProvider() {
        return (ol0) this.n;
    }

    @Override // o27
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override // o27
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override // o27
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override // o27
    public final bl0 getMenuGlassColorProvider() {
        return (ol0) this.n;
    }

    @Override // o27
    public final View getMenuHostView() {
        return (View) this.r;
    }

    @Override // o27
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override // o27
    public final vnb getMenuResourcesProvider() {
        return (vnb) this.h;
    }

    @Override // o27
    public final int getMenuRise() {
        return 0;
    }

    @Override // o27
    public final View getMenuView() {
        return (View) this.r;
    }

    @Override // o27
    public final ula getOpenMenuOverlay() {
        if (this.c) {
            return (ula) this.e;
        }
        return null;
    }

    @Override // o27
    public final boolean h() {
        int[] iArr = (int[]) this.s;
        Rect rect = (Rect) this.w;
        View view = (View) this.r;
        if (view == null || this.d) {
            return false;
        }
        view.getLocationOnScreen(iArr);
        ((View) this.r).getWindowVisibleDisplayFrame(rect);
        return (((View) this.r).getHeight() / 2) + iArr[1] > (rect.height() > 0 ? rect.centerY() : hl.q.y / 2);
    }

    @Override // o27
    public final jl0 i(ula ulaVar) {
        jl0 c = ((eg0) this.f).d.c(ulaVar, null, false);
        c.p((ol0) this.n);
        ik8.r(c, hl.L(21.0f), 6.0f);
        return c;
    }

    public final void j() {
        v91 v91Var;
        jw6 jw6Var = (jw6) this.f;
        int i = this.b;
        WeakReference weakReference = (WeakReference) this.s;
        lw6.b();
        if (this.c || this.d) {
            return;
        }
        a05 a05Var = (a05) weakReference.get();
        if (a05Var == null || a05Var.g != this || ((v91Var = (v91) this.w) != null && v91Var.isCancelled())) {
            e();
            return;
        }
        this.c = true;
        a05Var.g = null;
        a05 a05Var2 = (a05) weakReference.get();
        if (a05Var2 != null) {
            HashMap hashMap = a05Var2.b;
            if (a05Var2.d == jw6Var) {
                Message obtainMessage = a05Var2.a.obtainMessage(jn7.l4, jw6Var);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
                aw6 aw6Var = a05Var2.e;
                if (aw6Var != null) {
                    aw6Var.h(i);
                    a05Var2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (aw6 aw6Var2 : hashMap.values()) {
                        aw6Var2.h(i);
                        aw6Var2.d();
                    }
                    hashMap.clear();
                }
                a05Var2.e = null;
            }
        }
        a05 a05Var3 = (a05) weakReference.get();
        if (a05Var3 != null) {
            jw6 jw6Var2 = (jw6) this.h;
            a05Var3.d = jw6Var2;
            a05Var3.e = (aw6) this.e;
            jw6 jw6Var3 = (jw6) this.n;
            xz4 xz4Var = a05Var3.a;
            if (jw6Var3 == null) {
                Message obtainMessage2 = xz4Var.obtainMessage(jn7.k4, new sx7(jw6Var, jw6Var2));
                obtainMessage2.arg1 = i;
                obtainMessage2.sendToTarget();
            } else {
                Message obtainMessage3 = xz4Var.obtainMessage(jn7.m4, new sx7(jw6Var3, jw6Var2));
                obtainMessage3.arg1 = i;
                obtainMessage3.sendToTarget();
            }
            a05Var3.b.clear();
            a05Var3.g();
            a05Var3.l();
            ArrayList arrayList = (ArrayList) this.r;
            if (arrayList != null) {
                a05Var3.d.n(arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i, int i2, boolean z, boolean z2) {
        j79 j79Var;
        long j;
        HashMap hashMap = (HashMap) this.w;
        SparseArray sparseArray = (SparseArray) this.s;
        x46 x46Var = (x46) this.f;
        d79 d79Var = (d79) this.e;
        if (d79Var.W1) {
            return;
        }
        if (d79Var.getItemAnimator() != null) {
            if (z2) {
                o79 itemAnimator = d79Var.getItemAnimator();
                d69 d69Var = new d69(this, i, i2, z);
                if (itemAnimator.k()) {
                    itemAnimator.b.add(d69Var);
                    return;
                }
                k(i, i2, z, false);
            } else if (d79Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.b == -1) {
            x46Var.h1(i, i2, z);
            return;
        }
        int childCount = d79Var.getChildCount();
        if (childCount == 0 || d79Var.getVisibility() != 0 || !uc7.e1().getBoolean("view_animations", true)) {
            x46Var.h1(i, i2, z);
            return;
        }
        boolean z3 = this.b == 0;
        d79Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        j79 adapter = d79Var.getAdapter();
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = d79Var.getChildAt(i3);
            arrayList.add(childAt);
            x46Var.getClass();
            sparseArray.put(q79.G(childAt), childAt);
            if (adapter == null || !(adapter.b || this.c)) {
                j79Var = adapter;
            } else {
                if (this.c) {
                    int b = ((r79) childAt.getLayoutParams()).a.b();
                    if (b < 0) {
                        j79Var = adapter;
                        i3++;
                        adapter = j79Var;
                    } else {
                        j79Var = adapter;
                        j = adapter.c(b);
                    }
                } else {
                    j79Var = adapter;
                    j = ((r79) childAt.getLayoutParams()).a.e;
                }
                hashMap.put(Long.valueOf(j), childAt);
            }
            if (childAt instanceof pk5) {
                ((pk5) childAt).b(true, true);
            }
            i3++;
            adapter = j79Var;
        }
        j79 j79Var2 = adapter;
        d79Var.E0();
        d79Var.r0();
        ia iaVar = d79Var.d;
        iaVar.l((ArrayList) iaVar.d);
        iaVar.l((ArrayList) iaVar.e);
        iaVar.b = 0;
        oh2 oh2Var = d79Var.b;
        j79 j79Var3 = d79Var.x;
        oh2Var.e(j79Var3, j79Var3);
        d79Var.v0.f = true;
        d79Var.e.j0();
        oh2Var.m();
        g69 g69Var = j79Var2 instanceof g69 ? (g69) j79Var2 : null;
        x46Var.h1(i, i2, z);
        if (j79Var2 != null) {
            j79Var2.f();
        }
        d79Var.E0();
        d79Var.setVerticalScrollBarEnabled(false);
        cxe cxeVar = (cxe) this.r;
        if (cxeVar != null) {
            cxeVar.c();
        }
        d79Var.W1 = true;
        if (g69Var != null) {
            g69Var.c = true;
            g69Var.d = false;
            g69Var.e.clear();
            g69Var.f.clear();
        }
        d79Var.addOnLayoutChangeListener(new f69(this, j79Var2, arrayList, z3, g69Var));
    }

    public void l(int i) {
        this.b = i;
    }

    @Override // o27
    public final void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = ((eg0) this.f).e;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }

    public hw6(d79 d79Var, x46 x46Var) {
        this.a = (byte) 1;
        this.s = new SparseArray();
        this.w = new HashMap();
        this.e = d79Var;
        this.f = x46Var;
    }

    public hw6(ula ulaVar, eg0 eg0Var, vnb vnbVar) {
        this.a = (byte) 2;
        this.b = 0;
        this.s = new int[2];
        this.w = new Rect();
        this.e = ulaVar;
        this.f = eg0Var;
        this.h = vnbVar;
        this.n = dtd.l(vnbVar);
    }
}
