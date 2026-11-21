package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class qz extends v4.w {
    public final /* synthetic */ int d;
    public final Runnable e;
    public final /* synthetic */ Object f;

    public qz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f = filtersSetupActivity;
        this.e = new org.telegram.ui.lz(this, 4);
    }

    @Override // v4.w
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, f1Var);
                View view = f1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(R.id.dragging, null);
                break;
            default:
                super.a(recyclerView, f1Var);
                View view2 = f1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                if (view2 instanceof org.telegram.ui.f00) {
                    ((org.telegram.ui.f00) view2).setDragging(false);
                    break;
                }
                break;
        }
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                rz rzVar = (rz) this.f;
                return (!org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).K3() || (rzVar.n && !(f1Var.b() == 0 && ((oz) rzVar.h.get(0)).e && !org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()))) ? v4.w.l(12, 0) : v4.w.l(0, 0);
            default:
                return f1Var.f != 2 ? v4.w.l(0, 0) : v4.w.l(3, 0);
        }
    }

    @Override // v4.w
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((rz) this.f).n;
            default:
                return true;
        }
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        org.telegram.messenger.ro roVar;
        org.telegram.messenger.ro roVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (!org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).K3() || ((f1Var.b() != 0 && f1Var2.b() != 0) || org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q())) {
                    org.telegram.ui.l4 l4Var = ((rz) this.f).J;
                    int b10 = f1Var.b();
                    int b11 = f1Var2.b();
                    rz rzVar = (rz) l4Var.e;
                    ArrayList arrayList = rzVar.h;
                    SparseIntArray sparseIntArray = rzVar.l0;
                    int size = arrayList.size();
                    if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                        ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).V0();
                        org.telegram.messenger.ro roVar3 = (org.telegram.messenger.ro) V0.get(b10);
                        org.telegram.messenger.ro roVar4 = (org.telegram.messenger.ro) V0.get(b11);
                        int i10 = roVar3.f;
                        roVar3.f = roVar4.f;
                        roVar4.f = i10;
                        V0.set(b10, roVar4);
                        V0.set(b11, roVar3);
                        oz ozVar = (oz) arrayList.get(b10);
                        oz ozVar2 = (oz) arrayList.get(b11);
                        int i11 = ozVar.a;
                        ozVar.a = ozVar2.a;
                        ozVar2.a = i11;
                        int i12 = sparseIntArray.get(b10);
                        sparseIntArray.put(b10, sparseIntArray.get(b11));
                        sparseIntArray.put(b11, i12);
                        nz nzVar = rzVar.K;
                        int i13 = ozVar2.a;
                        int i14 = ozVar.a;
                        org.telegram.ui.tw twVar = (org.telegram.ui.tw) nzVar;
                        while (true) {
                            org.telegram.ui.bx[] bxVarArr = twVar.b.f0;
                            if (i7 < bxVarArr.length) {
                                org.telegram.ui.bx bxVar = bxVarArr[i7];
                                int i15 = bxVar.h;
                                if (i15 == i13) {
                                    bxVar.h = i14;
                                } else if (i15 == i14) {
                                    bxVar.h = i13;
                                }
                                i7++;
                            } else {
                                int i16 = rzVar.L;
                                if (i16 == b10) {
                                    rzVar.L = b11;
                                    rzVar.M = ozVar.a;
                                } else if (i16 == b11) {
                                    rzVar.L = b10;
                                    rzVar.M = ozVar2.a;
                                }
                                int i17 = rzVar.r0;
                                if (i17 == b10) {
                                    rzVar.r0 = b11;
                                    rzVar.s0 = ozVar.a;
                                } else if (i17 == b11) {
                                    rzVar.r0 = b10;
                                    rzVar.s0 = ozVar2.a;
                                }
                                arrayList.set(b10, ozVar2);
                                arrayList.set(b11, ozVar);
                                rzVar.m();
                                rzVar.E = true;
                                rzVar.G.setItemAnimator(rzVar.t0);
                                l4Var.j(b10, b11);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (f1Var.f == f1Var2.f) {
                    org.telegram.ui.j00 j00Var = ((FiltersSetupActivity) this.f).b;
                    int b12 = f1Var.b();
                    int b13 = f1Var2.b();
                    FiltersSetupActivity filtersSetupActivity = j00Var.e;
                    int i18 = filtersSetupActivity.r;
                    ArrayList arrayList2 = filtersSetupActivity.n;
                    if (b12 >= i18 && b13 >= i18) {
                        org.telegram.ui.h00 h00Var = (org.telegram.ui.h00) arrayList2.get(b12);
                        org.telegram.ui.h00 h00Var2 = (org.telegram.ui.h00) arrayList2.get(b13);
                        if (h00Var != null && h00Var2 != null && (roVar = h00Var.d) != null && (roVar2 = h00Var2.d) != null) {
                            int i19 = roVar.f;
                            roVar.f = roVar2.f;
                            roVar2.f = i19;
                            ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                            try {
                                arrayList3.set(b12 - filtersSetupActivity.r, h00Var2.d);
                                arrayList3.set(b13 - filtersSetupActivity.r, h00Var.d);
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

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        int i10 = this.d;
        Object obj = this.f;
        Runnable runnable = this.e;
        switch (i10) {
            case 0:
                oo ooVar = (oo) runnable;
                rz rzVar = (rz) obj;
                if (i7 != 0) {
                    rzVar.G.I0(false);
                    f1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.t6.h(rzVar.c0, f1Var.a, rzVar.a);
                } else {
                    org.telegram.messenger.g0.r(ooVar);
                    org.telegram.messenger.g0.h3(ooVar, 320L);
                }
                if (f1Var != null) {
                    f1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            default:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).a.I0(false);
                    f1Var.a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(lzVar);
                    org.telegram.messenger.g0.h3(lzVar, 320L);
                }
                if (f1Var != null) {
                    View view = f1Var.a;
                    view.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    if (view instanceof org.telegram.ui.f00) {
                        ((org.telegram.ui.f00) view).setDragging(i7 == 2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
        int i7 = this.d;
    }

    public qz(rz rzVar) {
        this.d = 0;
        this.f = rzVar;
        this.e = new oo(this, 18);
    }

    private final void r(v4.f1 f1Var) {
    }

    private final void s(v4.f1 f1Var) {
    }
}
