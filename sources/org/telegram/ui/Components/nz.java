package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nz extends v4.w {
    public final /* synthetic */ int d;
    public final Runnable e;
    public final /* synthetic */ Object f;

    public nz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f = filtersSetupActivity;
        this.e = new org.telegram.ui.kz(this, 4);
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
                if (view2 instanceof org.telegram.ui.e00) {
                    ((org.telegram.ui.e00) view2).setDragging(false);
                    break;
                }
                break;
        }
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                oz ozVar = (oz) this.f;
                return (!org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).K3() || (ozVar.n && !(f1Var.b() == 0 && ((lz) ozVar.h.get(0)).e && !org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q()))) ? v4.w.l(12, 0) : v4.w.l(0, 0);
            default:
                return f1Var.f != 2 ? v4.w.l(0, 0) : v4.w.l(3, 0);
        }
    }

    @Override // v4.w
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((oz) this.f).n;
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
                if (!org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).K3() || ((f1Var.b() != 0 && f1Var2.b() != 0) || org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q())) {
                    org.telegram.ui.l4 l4Var = ((oz) this.f).J;
                    int b10 = f1Var.b();
                    int b11 = f1Var2.b();
                    oz ozVar = (oz) l4Var.e;
                    ArrayList arrayList = ozVar.h;
                    SparseIntArray sparseIntArray = ozVar.l0;
                    int size = arrayList.size();
                    if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                        ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).V0();
                        org.telegram.messenger.ro roVar3 = (org.telegram.messenger.ro) V0.get(b10);
                        org.telegram.messenger.ro roVar4 = (org.telegram.messenger.ro) V0.get(b11);
                        int i10 = roVar3.f;
                        roVar3.f = roVar4.f;
                        roVar4.f = i10;
                        V0.set(b10, roVar4);
                        V0.set(b11, roVar3);
                        lz lzVar = (lz) arrayList.get(b10);
                        lz lzVar2 = (lz) arrayList.get(b11);
                        int i11 = lzVar.a;
                        lzVar.a = lzVar2.a;
                        lzVar2.a = i11;
                        int i12 = sparseIntArray.get(b10);
                        sparseIntArray.put(b10, sparseIntArray.get(b11));
                        sparseIntArray.put(b11, i12);
                        kz kzVar = ozVar.K;
                        int i13 = lzVar2.a;
                        int i14 = lzVar.a;
                        org.telegram.ui.sw swVar = (org.telegram.ui.sw) kzVar;
                        while (true) {
                            org.telegram.ui.ax[] axVarArr = swVar.b.f0;
                            if (i7 < axVarArr.length) {
                                org.telegram.ui.ax axVar = axVarArr[i7];
                                int i15 = axVar.h;
                                if (i15 == i13) {
                                    axVar.h = i14;
                                } else if (i15 == i14) {
                                    axVar.h = i13;
                                }
                                i7++;
                            } else {
                                int i16 = ozVar.L;
                                if (i16 == b10) {
                                    ozVar.L = b11;
                                    ozVar.M = lzVar.a;
                                } else if (i16 == b11) {
                                    ozVar.L = b10;
                                    ozVar.M = lzVar2.a;
                                }
                                int i17 = ozVar.r0;
                                if (i17 == b10) {
                                    ozVar.r0 = b11;
                                    ozVar.s0 = lzVar.a;
                                } else if (i17 == b11) {
                                    ozVar.r0 = b10;
                                    ozVar.s0 = lzVar2.a;
                                }
                                arrayList.set(b10, lzVar2);
                                arrayList.set(b11, lzVar);
                                ozVar.m();
                                ozVar.E = true;
                                ozVar.G.setItemAnimator(ozVar.t0);
                                l4Var.j(b10, b11);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (f1Var.f == f1Var2.f) {
                    org.telegram.ui.i00 i00Var = ((FiltersSetupActivity) this.f).b;
                    int b12 = f1Var.b();
                    int b13 = f1Var2.b();
                    FiltersSetupActivity filtersSetupActivity = i00Var.e;
                    int i18 = filtersSetupActivity.r;
                    ArrayList arrayList2 = filtersSetupActivity.n;
                    if (b12 >= i18 && b13 >= i18) {
                        org.telegram.ui.g00 g00Var = (org.telegram.ui.g00) arrayList2.get(b12);
                        org.telegram.ui.g00 g00Var2 = (org.telegram.ui.g00) arrayList2.get(b13);
                        if (g00Var != null && g00Var2 != null && (roVar = g00Var.d) != null && (roVar2 = g00Var2.d) != null) {
                            int i19 = roVar.f;
                            roVar.f = roVar2.f;
                            roVar2.f = i19;
                            ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                            try {
                                arrayList3.set(b12 - filtersSetupActivity.r, g00Var2.d);
                                arrayList3.set(b13 - filtersSetupActivity.r, g00Var.d);
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
                lo loVar = (lo) runnable;
                oz ozVar = (oz) obj;
                if (i7 != 0) {
                    ozVar.G.I0(false);
                    f1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.u6.h(ozVar.c0, f1Var.a, ozVar.a);
                } else {
                    org.telegram.messenger.g0.r(loVar);
                    org.telegram.messenger.g0.h3(loVar, 320L);
                }
                if (f1Var != null) {
                    f1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            default:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).a.I0(false);
                    f1Var.a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(kzVar);
                    org.telegram.messenger.g0.h3(kzVar, 320L);
                }
                if (f1Var != null) {
                    View view = f1Var.a;
                    view.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    if (view instanceof org.telegram.ui.e00) {
                        ((org.telegram.ui.e00) view).setDragging(i7 == 2);
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

    public nz(oz ozVar) {
        this.d = 0;
        this.f = ozVar;
        this.e = new lo(this, 18);
    }

    private final void r(v4.f1 f1Var) {
    }

    private final void s(v4.f1 f1Var) {
    }
}
