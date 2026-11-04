package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hs0 extends sj0 {
    public final Context c;
    public final org.telegram.messenger.nv d;
    public boolean h;
    public qr0 s;
    public final /* synthetic */ ws0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final sp0 n = new sp0(this, 4);
    public final u4.v0 r = new u4.v0();
    public final u4.y w = new u4.y(new fi.c(this, 6));
    public final HashSet x = new HashSet();

    public hs0(ws0 ws0Var, Context context) {
        this.y = ws0Var;
        this.c = context;
        org.telegram.messenger.nv G1 = ws0Var.y1.getMessagesController().G1();
        this.d = G1;
        if (ws0Var.x0()) {
            G1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.mv mvVar;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            long dialogId = t2Var.getDialogId();
            int i3 = 0;
            while (true) {
                arrayList = this.f;
                if (i3 >= arrayList.size()) {
                    mvVar = null;
                    break;
                } else {
                    if (((org.telegram.messenger.mv) arrayList.get(i3)).a == dialogId) {
                        mvVar = (org.telegram.messenger.mv) arrayList.get(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (mvVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(mvVar.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            ws0 ws0Var = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(mvVar.a));
                if (hashSet.size() <= 0 && ws0Var.F1) {
                    ws0Var.o1(false);
                }
            } else {
                hashSet.add(Long.valueOf(mvVar.a));
                if (hashSet.size() > 0 && !ws0Var.F1) {
                    ws0Var.o1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = ws0Var.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            ws0Var.m1(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.mv mvVar2 = (org.telegram.messenger.mv) arrayList.get(i10);
                    if (mvVar2.a != longValue) {
                        i10++;
                    } else if (!mvVar2.b) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = ws0Var.y0;
            if (q0Var3 != null) {
                q0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = ws0Var.z0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(z10 ? 0 : 8);
            }
            t2Var.c0(hashSet.contains(Long.valueOf(mvVar.a)), true);
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

    @Override // u4.h0
    public final int b() {
        return this.f.size();
    }

    @Override // u4.h0
    public final long c(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f;
            if (i3 < arrayList.size()) {
                return ((org.telegram.messenger.mv) arrayList.get(i3)).a;
            }
        }
        return i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 13;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            ArrayList arrayList = this.f;
            org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i3);
            t2Var.d0(mvVar.a, mvVar.d, mvVar.c(), false, false);
            t2Var.t0 = true;
            t2Var.c0(this.x.contains(Long.valueOf(mvVar.a)), false);
            t2Var.t2 = i3 + 1 < arrayList.size();
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        gs0 gs0Var = new gs0(this, this.c);
        ws0 ws0Var = this.y;
        gs0Var.setDialogCellDelegate(ws0Var);
        gs0Var.s0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, gs0Var, ws0Var.I1);
        return new bj0(gs0Var);
    }
}
