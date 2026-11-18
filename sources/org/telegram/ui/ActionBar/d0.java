package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.b;
                q0 q0Var = (q0) this.c;
                int indexOf = r0Var.h0.indexOf(q0Var.getFilter());
                if (r0Var.i0 == indexOf) {
                    if (q0Var.getFilter().h) {
                        if (!q0Var.a.f) {
                            q0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            jg.o0 filter = q0Var.getFilter();
                            r0Var.J(filter);
                            n0 n0Var = r0Var.I;
                            if (n0Var != null) {
                                n0Var.j(filter);
                                r0Var.I.l(r0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    r0Var.i0 = indexOf;
                    r0Var.E();
                    break;
                }
                break;
            case 1:
                p0 p0Var = (p0) this.c;
                r0 r0Var2 = (r0) this.b;
                if (r0Var2.y() && p0Var.f) {
                    if (!r0Var2.U) {
                        r0Var2.U = true;
                        r0Var2.r();
                    }
                }
                z zVar = r0Var2.c;
                if (zVar == null) {
                    m0 m0Var = r0Var2.Q;
                    if (m0Var != null) {
                        m0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 2:
                u1 u1Var = (u1) this.b;
                if (!((n1) this.c).a) {
                    r1 r1Var = u1Var.n0;
                    if (r1Var != null) {
                        r1Var.h(u1Var, -1);
                    }
                    if (u1Var.k0) {
                        u1Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                u1 u1Var2 = (u1) this.b;
                if (!((n1) this.c).a) {
                    r1 r1Var2 = u1Var2.p0;
                    if (r1Var2 != null) {
                        r1Var2.h(u1Var2, -2);
                    }
                    if (u1Var2.k0) {
                        u1Var2.cancel();
                        break;
                    }
                }
                break;
            case 4:
                u1 u1Var3 = (u1) this.b;
                if (!((n1) this.c).a) {
                    r1 r1Var3 = u1Var3.t0;
                    if (r1Var3 != null) {
                        r1Var3.h(u1Var3, -2);
                    }
                    if (u1Var3.k0) {
                        u1Var3.dismiss();
                        break;
                    }
                }
                break;
            default:
                u1 u1Var4 = (u1) this.b;
                if (!((n1) this.c).a) {
                    oi.b4 b4Var = u1Var4.r0;
                    if (b4Var != null) {
                        b4Var.h(u1Var4, -2);
                    }
                    if (u1Var4.k0) {
                        u1Var4.cancel();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d0(p0 p0Var, r0 r0Var) {
        this.a = 1;
        this.c = p0Var;
        this.b = r0Var;
    }
}
