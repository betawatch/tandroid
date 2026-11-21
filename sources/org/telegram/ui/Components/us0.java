package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class us0 extends dk0 {
    public final Context c;
    public final org.telegram.messenger.pv d;
    public boolean h;
    public cs0 s;
    public final /* synthetic */ jt0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final cp0 n = new cp0(this, 5);
    public final v4.w0 r = new v4.w0();
    public final v4.z w = new v4.z(new gi.c(this, 6));
    public final HashSet x = new HashSet();

    public us0(jt0 jt0Var, Context context) {
        this.y = jt0Var;
        this.c = context;
        org.telegram.messenger.pv I1 = jt0Var.y1.getMessagesController().I1();
        this.d = I1;
        if (jt0Var.x0()) {
            I1.g(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.dk0
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
            jt0 jt0Var = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(ovVar.a));
                if (hashSet.size() <= 0 && jt0Var.F1) {
                    jt0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(ovVar.a));
                if (hashSet.size() > 0 && !jt0Var.F1) {
                    jt0Var.q1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = jt0Var.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            jt0Var.o1(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.q0 q0Var3 = jt0Var.y0;
            if (q0Var3 != null) {
                q0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = jt0Var.z0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(z10 ? 0 : 8);
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
        ts0 ts0Var = new ts0(this, this.c);
        jt0 jt0Var = this.y;
        ts0Var.setDialogCellDelegate(jt0Var);
        ts0Var.s0 = true;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, ts0Var, jt0Var.I1);
        return new mj0(ts0Var);
    }
}
