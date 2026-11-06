package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class is0 extends oj0 {
    public final Context c;
    public final org.telegram.messenger.vv d;
    public boolean h;
    public rr0 s;
    public final /* synthetic */ xs0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ir0 n = new ir0(this, 2);
    public final v4.u0 r = new v4.u0();
    public final v4.y w = new v4.y(new ei.d(this, 6));
    public final HashSet x = new HashSet();

    public is0(xs0 xs0Var, Context context) {
        this.y = xs0Var;
        this.c = context;
        org.telegram.messenger.vv G1 = xs0Var.x1.getMessagesController().G1();
        this.d = G1;
        if (xs0Var.x0()) {
            G1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.uv uvVar;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            long dialogId = t2Var.getDialogId();
            int i7 = 0;
            while (true) {
                arrayList = this.f;
                if (i7 >= arrayList.size()) {
                    uvVar = null;
                    break;
                } else {
                    if (((org.telegram.messenger.uv) arrayList.get(i7)).a == dialogId) {
                        uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (uvVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(uvVar.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            xs0 xs0Var = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(uvVar.a));
                if (hashSet.size() <= 0 && xs0Var.E1) {
                    xs0Var.o1(false);
                }
            } else {
                hashSet.add(Long.valueOf(uvVar.a));
                if (hashSet.size() > 0 && !xs0Var.E1) {
                    xs0Var.o1(true);
                    org.telegram.ui.ActionBar.r0 r0Var = xs0Var.w0;
                    if (r0Var != null) {
                        r0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = xs0Var.v0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                }
            }
            xs0Var.m1(hashSet.size(), true);
            boolean z9 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.uv uvVar2 = (org.telegram.messenger.uv) arrayList.get(i10);
                    if (uvVar2.a != longValue) {
                        i10++;
                    } else if (!uvVar2.b) {
                        z9 = false;
                    }
                }
                if (!z9) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = xs0Var.x0;
            if (r0Var3 != null) {
                r0Var3.setVisibility(z9 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = xs0Var.y0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(z9 ? 0 : 8);
            }
            t2Var.c0(hashSet.contains(Long.valueOf(uvVar.a)), true);
        }
    }

    public final void F(boolean z9) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.j);
        if (z9) {
            f();
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.f.size();
    }

    @Override // v4.g0
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(i7)).a;
            }
        }
        return i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 13;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            ArrayList arrayList = this.f;
            org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
            t2Var.d0(uvVar.a, uvVar.d, uvVar.c(), false, false);
            t2Var.s0 = true;
            t2Var.c0(this.x.contains(Long.valueOf(uvVar.a)), false);
            t2Var.s2 = i7 + 1 < arrayList.size();
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        hs0 hs0Var = new hs0(this, this.c);
        xs0 xs0Var = this.y;
        hs0Var.setDialogCellDelegate(xs0Var);
        hs0Var.r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, hs0Var, xs0Var.H1);
        return new xi0(hs0Var);
    }
}
