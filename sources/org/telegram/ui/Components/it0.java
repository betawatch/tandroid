package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class it0 extends sk0 {
    public final Context c;
    public final org.telegram.messenger.gw d;
    public boolean h;
    public rs0 s;
    public final /* synthetic */ zt0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final uo0 n = new uo0(this, 7);
    public final s4.u0 r = new s4.u0();
    public final s4.x w = new s4.x(new org.telegram.ui.ja(this, 5));
    public final HashSet x = new HashSet();

    public it0(zt0 zt0Var, Context context) {
        this.y = zt0Var;
        this.c = context;
        org.telegram.messenger.gw F1 = zt0Var.x1.getMessagesController().F1();
        this.d = F1;
        if (zt0Var.v0()) {
            F1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.fw fwVar;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            long dialogId = v2Var.getDialogId();
            int i10 = 0;
            while (true) {
                arrayList = this.f;
                if (i10 >= arrayList.size()) {
                    fwVar = null;
                    break;
                } else {
                    if (((org.telegram.messenger.fw) arrayList.get(i10)).a == dialogId) {
                        fwVar = (org.telegram.messenger.fw) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (fwVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(fwVar.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            zt0 zt0Var = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(fwVar.a));
                if (hashSet.size() <= 0 && zt0Var.E1) {
                    zt0Var.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(fwVar.a));
                if (hashSet.size() > 0 && !zt0Var.E1) {
                    zt0Var.l1(true);
                    org.telegram.ui.ActionBar.t0 t0Var = zt0Var.w0;
                    if (t0Var != null) {
                        t0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.v0;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                    }
                }
            }
            zt0Var.j1(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.fw fwVar2 = (org.telegram.messenger.fw) arrayList.get(i11);
                    if (fwVar2.a != longValue) {
                        i11++;
                    } else if (!fwVar2.b) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = zt0Var.x0;
            if (t0Var3 != null) {
                t0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = zt0Var.y0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(z10 ? 0 : 8);
            }
            v2Var.c0(hashSet.contains(Long.valueOf(fwVar.a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.j);
        if (z10) {
            f();
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.f.size();
    }

    @Override // s4.g0
    public final long c(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                return ((org.telegram.messenger.fw) arrayList.get(i10)).a;
            }
        }
        return i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 13;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            ArrayList arrayList = this.f;
            org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i10);
            v2Var.d0(fwVar.a, fwVar.d, fwVar.c(), false, false);
            v2Var.s0 = true;
            v2Var.c0(this.x.contains(Long.valueOf(fwVar.a)), false);
            v2Var.s2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ht0 ht0Var = new ht0(this, this.c);
        zt0 zt0Var = this.y;
        ht0Var.setDialogCellDelegate(zt0Var);
        ht0Var.r0 = true;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, ht0Var, zt0Var.H1);
        return new ck0(ht0Var);
    }
}
