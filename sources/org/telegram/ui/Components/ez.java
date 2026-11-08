package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ez extends v4.v {
    public final /* synthetic */ int d;
    public final Runnable e;
    public final /* synthetic */ Object f;

    public ez(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f = filtersSetupActivity;
        this.e = new org.telegram.ui.hz(this, 4);
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                View view = d1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(R.id.dragging, null);
                break;
            default:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                if (view2 instanceof org.telegram.ui.a00) {
                    ((org.telegram.ui.a00) view2).setDragging(false);
                    break;
                }
                break;
        }
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                fz fzVar = (fz) this.f;
                return (!org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).D3() || (fzVar.n && !(d1Var.b() == 0 && ((cz) fzVar.h.get(0)).e && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()))) ? v4.v.l(12, 0) : v4.v.l(0, 0);
            default:
                return d1Var.f != 2 ? v4.v.l(0, 0) : v4.v.l(3, 0);
        }
    }

    @Override // v4.v
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((fz) this.f).n;
            default:
                return true;
        }
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        org.telegram.messenger.vo voVar;
        org.telegram.messenger.vo voVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (!org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).D3() || ((d1Var.b() != 0 && d1Var2.b() != 0) || org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q())) {
                    org.telegram.ui.l4 l4Var = ((fz) this.f).I;
                    int b10 = d1Var.b();
                    int b11 = d1Var2.b();
                    fz fzVar = (fz) l4Var.e;
                    ArrayList arrayList = fzVar.h;
                    SparseIntArray sparseIntArray = fzVar.k0;
                    int size = arrayList.size();
                    if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                        ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).T0();
                        org.telegram.messenger.vo voVar3 = (org.telegram.messenger.vo) T0.get(b10);
                        org.telegram.messenger.vo voVar4 = (org.telegram.messenger.vo) T0.get(b11);
                        int i10 = voVar3.f;
                        voVar3.f = voVar4.f;
                        voVar4.f = i10;
                        T0.set(b10, voVar4);
                        T0.set(b11, voVar3);
                        cz czVar = (cz) arrayList.get(b10);
                        cz czVar2 = (cz) arrayList.get(b11);
                        int i11 = czVar.a;
                        czVar.a = czVar2.a;
                        czVar2.a = i11;
                        int i12 = sparseIntArray.get(b10);
                        sparseIntArray.put(b10, sparseIntArray.get(b11));
                        sparseIntArray.put(b11, i12);
                        bz bzVar = fzVar.J;
                        int i13 = czVar2.a;
                        int i14 = czVar.a;
                        org.telegram.ui.nw nwVar = (org.telegram.ui.nw) bzVar;
                        while (true) {
                            org.telegram.ui.vw[] vwVarArr = nwVar.b.e0;
                            if (i7 < vwVarArr.length) {
                                org.telegram.ui.vw vwVar = vwVarArr[i7];
                                int i15 = vwVar.h;
                                if (i15 == i13) {
                                    vwVar.h = i14;
                                } else if (i15 == i14) {
                                    vwVar.h = i13;
                                }
                                i7++;
                            } else {
                                int i16 = fzVar.K;
                                if (i16 == b10) {
                                    fzVar.K = b11;
                                    fzVar.L = czVar.a;
                                } else if (i16 == b11) {
                                    fzVar.K = b10;
                                    fzVar.L = czVar2.a;
                                }
                                int i17 = fzVar.q0;
                                if (i17 == b10) {
                                    fzVar.q0 = b11;
                                    fzVar.r0 = czVar.a;
                                } else if (i17 == b11) {
                                    fzVar.q0 = b10;
                                    fzVar.r0 = czVar2.a;
                                }
                                arrayList.set(b10, czVar2);
                                arrayList.set(b11, czVar);
                                fzVar.j();
                                fzVar.D = true;
                                fzVar.F.setItemAnimator(fzVar.s0);
                                l4Var.j(b10, b11);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (d1Var.f == d1Var2.f) {
                    org.telegram.ui.e00 e00Var = ((FiltersSetupActivity) this.f).b;
                    int b12 = d1Var.b();
                    int b13 = d1Var2.b();
                    FiltersSetupActivity filtersSetupActivity = e00Var.e;
                    int i18 = filtersSetupActivity.r;
                    ArrayList arrayList2 = filtersSetupActivity.n;
                    if (b12 >= i18 && b13 >= i18) {
                        org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) arrayList2.get(b12);
                        org.telegram.ui.c00 c00Var2 = (org.telegram.ui.c00) arrayList2.get(b13);
                        if (c00Var != null && c00Var2 != null && (voVar = c00Var.d) != null && (voVar2 = c00Var2.d) != null) {
                            int i19 = voVar.f;
                            voVar.f = voVar2.f;
                            voVar2.f = i19;
                            ArrayList arrayList3 = filtersSetupActivity.getMessagesController().P0;
                            try {
                                arrayList3.set(b12 - filtersSetupActivity.r, c00Var2.d);
                                arrayList3.set(b13 - filtersSetupActivity.r, c00Var.d);
                            } catch (Exception unused) {
                            }
                            filtersSetupActivity.e = true;
                            filtersSetupActivity.g0(true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        int i10 = this.d;
        Object obj = this.f;
        Runnable runnable = this.e;
        switch (i10) {
            case 0:
                gp gpVar = (gp) runnable;
                fz fzVar = (fz) obj;
                if (i7 != 0) {
                    fzVar.F.I0(false);
                    d1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.r6.i(fzVar.b0, d1Var.a, fzVar.a);
                } else {
                    org.telegram.messenger.g0.r(gpVar);
                    org.telegram.messenger.g0.i3(gpVar, 320L);
                }
                if (d1Var != null) {
                    d1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            default:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).a.I0(false);
                    d1Var.a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(hzVar);
                    org.telegram.messenger.g0.i3(hzVar, 320L);
                }
                if (d1Var != null) {
                    View view = d1Var.a;
                    view.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    if (view instanceof org.telegram.ui.a00) {
                        ((org.telegram.ui.a00) view).setDragging(i7 == 2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
        int i7 = this.d;
    }

    public ez(fz fzVar) {
        this.d = 0;
        this.f = fzVar;
        this.e = new gp(this, 16);
    }

    private final void r(v4.d1 d1Var) {
    }

    private final void s(v4.d1 d1Var) {
    }
}
