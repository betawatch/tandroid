package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class js0 extends tj0 {
    public final Context c;
    public final org.telegram.messenger.tv d;
    public boolean h;
    public sr0 s;
    public final /* synthetic */ ys0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ro0 n = new ro0(this, 5);
    public final v4.v0 r = new v4.v0();
    public final v4.y w = new v4.y(new gi.c(this, 6));
    public final HashSet x = new HashSet();

    public js0(ys0 ys0Var, Context context) {
        this.y = ys0Var;
        this.c = context;
        org.telegram.messenger.tv G1 = ys0Var.y1.getMessagesController().G1();
        this.d = G1;
        if (ys0Var.x0()) {
            G1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.sv svVar;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            long dialogId = t2Var.getDialogId();
            int i7 = 0;
            while (true) {
                arrayList = this.f;
                if (i7 >= arrayList.size()) {
                    svVar = null;
                    break;
                } else {
                    if (((org.telegram.messenger.sv) arrayList.get(i7)).a == dialogId) {
                        svVar = (org.telegram.messenger.sv) arrayList.get(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (svVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(svVar.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            ys0 ys0Var = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(svVar.a));
                if (hashSet.size() <= 0 && ys0Var.F1) {
                    ys0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(svVar.a));
                if (hashSet.size() > 0 && !ys0Var.F1) {
                    ys0Var.q1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = ys0Var.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            ys0Var.o1(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.sv svVar2 = (org.telegram.messenger.sv) arrayList.get(i10);
                    if (svVar2.a != longValue) {
                        i10++;
                    } else if (!svVar2.b) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = ys0Var.y0;
            if (q0Var3 != null) {
                q0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = ys0Var.z0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(z10 ? 0 : 8);
            }
            t2Var.e0(hashSet.contains(Long.valueOf(svVar.a)), true);
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

    @Override // v4.h0
    public final int b() {
        return this.f.size();
    }

    @Override // v4.h0
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.sv) arrayList.get(i7)).a;
            }
        }
        return i7;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 13;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            ArrayList arrayList = this.f;
            org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i7);
            t2Var.f0(svVar.a, svVar.d, svVar.c(), false, false);
            t2Var.t0 = true;
            t2Var.e0(this.x.contains(Long.valueOf(svVar.a)), false);
            t2Var.t2 = i7 + 1 < arrayList.size();
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        is0 is0Var = new is0(this, this.c);
        ys0 ys0Var = this.y;
        is0Var.setDialogCellDelegate(ys0Var);
        is0Var.s0 = true;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, is0Var, ys0Var.I1);
        return new cj0(is0Var);
    }
}
