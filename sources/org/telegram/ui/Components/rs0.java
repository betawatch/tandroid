package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rs0 extends bk0 {
    public final Context c;
    public final org.telegram.messenger.pv d;
    public boolean h;
    public as0 s;
    public final /* synthetic */ gt0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ap0 n = new ap0(this, 5);
    public final v4.w0 r = new v4.w0();
    public final v4.z w = new v4.z(new gi.c(this, 6));
    public final HashSet x = new HashSet();

    public rs0(gt0 gt0Var, Context context) {
        this.y = gt0Var;
        this.c = context;
        org.telegram.messenger.pv I1 = gt0Var.y1.getMessagesController().I1();
        this.d = I1;
        if (gt0Var.x0()) {
            I1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.ov ovVar;
        if (view instanceof org.telegram.ui.Cells.u2) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            long dialogId = u2Var.getDialogId();
            int i7 = 0;
            while (true) {
                arrayList = this.f;
                if (i7 >= arrayList.size()) {
                    ovVar = null;
                    break;
                } else {
                    if (((org.telegram.messenger.ov) arrayList.get(i7)).a == dialogId) {
                        ovVar = (org.telegram.messenger.ov) arrayList.get(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (ovVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(ovVar.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            gt0 gt0Var = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(ovVar.a));
                if (hashSet.size() <= 0 && gt0Var.F1) {
                    gt0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(ovVar.a));
                if (hashSet.size() > 0 && !gt0Var.F1) {
                    gt0Var.q1(true);
                    org.telegram.ui.ActionBar.r0 r0Var = gt0Var.x0;
                    if (r0Var != null) {
                        r0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.w0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                }
            }
            gt0Var.o1(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.ov ovVar2 = (org.telegram.messenger.ov) arrayList.get(i10);
                    if (ovVar2.a != longValue) {
                        i10++;
                    } else if (!ovVar2.b) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = gt0Var.y0;
            if (r0Var3 != null) {
                r0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = gt0Var.z0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(z10 ? 0 : 8);
            }
            u2Var.c0(hashSet.contains(Long.valueOf(ovVar.a)), true);
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

    @Override // v4.i0
    public final int b() {
        return this.f.size();
    }

    @Override // v4.i0
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(i7)).a;
            }
        }
        return i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 13;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.u2) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            ArrayList arrayList = this.f;
            org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i7);
            u2Var.d0(ovVar.a, ovVar.d, ovVar.c(), false, false);
            u2Var.t0 = true;
            u2Var.c0(this.x.contains(Long.valueOf(ovVar.a)), false);
            u2Var.t2 = i7 + 1 < arrayList.size();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        qs0 qs0Var = new qs0(this, this.c);
        gt0 gt0Var = this.y;
        qs0Var.setDialogCellDelegate(gt0Var);
        qs0Var.s0 = true;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, qs0Var, gt0Var.I1);
        return new kj0(qs0Var);
    }
}
