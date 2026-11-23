package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.b;
                p0 p0Var = (p0) this.c;
                int indexOf = q0Var.h0.indexOf(p0Var.getFilter());
                if (q0Var.i0 == indexOf) {
                    if (p0Var.getFilter().h) {
                        if (!p0Var.a.f) {
                            p0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            jg.o0 filter = p0Var.getFilter();
                            q0Var.J(filter);
                            m0 m0Var = q0Var.I;
                            if (m0Var != null) {
                                m0Var.j(filter);
                                q0Var.I.l(q0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    q0Var.i0 = indexOf;
                    q0Var.E();
                    break;
                }
                break;
            case 1:
                o0 o0Var = (o0) this.c;
                q0 q0Var2 = (q0) this.b;
                if (q0Var2.y() && o0Var.f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.r();
                    }
                }
                y yVar = q0Var2.c;
                if (yVar == null) {
                    l0 l0Var = q0Var2.Q;
                    if (l0Var != null) {
                        l0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 2:
                t1 t1Var = (t1) this.b;
                if (!((m1) this.c).a) {
                    q1 q1Var = t1Var.n0;
                    if (q1Var != null) {
                        q1Var.h(t1Var, -1);
                    }
                    if (t1Var.k0) {
                        t1Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                t1 t1Var2 = (t1) this.b;
                if (!((m1) this.c).a) {
                    q1 q1Var2 = t1Var2.p0;
                    if (q1Var2 != null) {
                        q1Var2.h(t1Var2, -2);
                    }
                    if (t1Var2.k0) {
                        t1Var2.cancel();
                        break;
                    }
                }
                break;
            case 4:
                t1 t1Var3 = (t1) this.b;
                if (!((m1) this.c).a) {
                    q1 q1Var3 = t1Var3.t0;
                    if (q1Var3 != null) {
                        q1Var3.h(t1Var3, -2);
                    }
                    if (t1Var3.k0) {
                        t1Var3.dismiss();
                        break;
                    }
                }
                break;
            default:
                t1 t1Var4 = (t1) this.b;
                if (!((m1) this.c).a) {
                    oi.c4 c4Var = t1Var4.r0;
                    if (c4Var != null) {
                        c4Var.h(t1Var4, -2);
                    }
                    if (t1Var4.k0) {
                        t1Var4.cancel();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c0(o0 o0Var, q0 q0Var) {
        this.a = 1;
        this.c = o0Var;
        this.b = q0Var;
    }
}
