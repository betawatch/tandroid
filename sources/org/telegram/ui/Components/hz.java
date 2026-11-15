package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hz extends v4.v {
    public final /* synthetic */ int d;
    public final Runnable e;
    public final /* synthetic */ Object f;

    public hz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f = filtersSetupActivity;
        this.e = new org.telegram.ui.iz(this, 4);
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, e1Var);
                View view = e1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(R.id.dragging, null);
                break;
            default:
                super.a(recyclerView, e1Var);
                View view2 = e1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                if (view2 instanceof org.telegram.ui.c00) {
                    ((org.telegram.ui.c00) view2).setDragging(false);
                    break;
                }
                break;
        }
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        switch (this.d) {
            case 0:
                iz izVar = (iz) this.f;
                return (!org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).D3() || (izVar.n && !(e1Var.b() == 0 && ((fz) izVar.h.get(0)).e && !org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q()))) ? v4.v.l(12, 0) : v4.v.l(0, 0);
            default:
                return e1Var.f != 2 ? v4.v.l(0, 0) : v4.v.l(3, 0);
        }
    }

    @Override // v4.v
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((iz) this.f).n;
            default:
                return true;
        }
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        org.telegram.messenger.so soVar;
        org.telegram.messenger.so soVar2;
        switch (this.d) {
            case 0:
                int i7 = 0;
                if (!org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).D3() || ((e1Var.b() != 0 && e1Var2.b() != 0) || org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q())) {
                    org.telegram.ui.l4 l4Var = ((iz) this.f).J;
                    int b10 = e1Var.b();
                    int b11 = e1Var2.b();
                    iz izVar = (iz) l4Var.e;
                    ArrayList arrayList = izVar.h;
                    SparseIntArray sparseIntArray = izVar.l0;
                    int size = arrayList.size();
                    if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                        ArrayList T0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).T0();
                        org.telegram.messenger.so soVar3 = (org.telegram.messenger.so) T0.get(b10);
                        org.telegram.messenger.so soVar4 = (org.telegram.messenger.so) T0.get(b11);
                        int i10 = soVar3.f;
                        soVar3.f = soVar4.f;
                        soVar4.f = i10;
                        T0.set(b10, soVar4);
                        T0.set(b11, soVar3);
                        fz fzVar = (fz) arrayList.get(b10);
                        fz fzVar2 = (fz) arrayList.get(b11);
                        int i11 = fzVar.a;
                        fzVar.a = fzVar2.a;
                        fzVar2.a = i11;
                        int i12 = sparseIntArray.get(b10);
                        sparseIntArray.put(b10, sparseIntArray.get(b11));
                        sparseIntArray.put(b11, i12);
                        ez ezVar = izVar.K;
                        int i13 = fzVar2.a;
                        int i14 = fzVar.a;
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) ezVar;
                        while (true) {
                            org.telegram.ui.xw[] xwVarArr = pwVar.b.f0;
                            if (i7 < xwVarArr.length) {
                                org.telegram.ui.xw xwVar = xwVarArr[i7];
                                int i15 = xwVar.h;
                                if (i15 == i13) {
                                    xwVar.h = i14;
                                } else if (i15 == i14) {
                                    xwVar.h = i13;
                                }
                                i7++;
                            } else {
                                int i16 = izVar.L;
                                if (i16 == b10) {
                                    izVar.L = b11;
                                    izVar.M = fzVar.a;
                                } else if (i16 == b11) {
                                    izVar.L = b10;
                                    izVar.M = fzVar2.a;
                                }
                                int i17 = izVar.r0;
                                if (i17 == b10) {
                                    izVar.r0 = b11;
                                    izVar.s0 = fzVar.a;
                                } else if (i17 == b11) {
                                    izVar.r0 = b10;
                                    izVar.s0 = fzVar2.a;
                                }
                                arrayList.set(b10, fzVar2);
                                arrayList.set(b11, fzVar);
                                izVar.j();
                                izVar.E = true;
                                izVar.G.setItemAnimator(izVar.t0);
                                l4Var.j(b10, b11);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (e1Var.f == e1Var2.f) {
                    org.telegram.ui.g00 g00Var = ((FiltersSetupActivity) this.f).b;
                    int b12 = e1Var.b();
                    int b13 = e1Var2.b();
                    FiltersSetupActivity filtersSetupActivity = g00Var.e;
                    int i18 = filtersSetupActivity.r;
                    ArrayList arrayList2 = filtersSetupActivity.n;
                    if (b12 >= i18 && b13 >= i18) {
                        org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) arrayList2.get(b12);
                        org.telegram.ui.e00 e00Var2 = (org.telegram.ui.e00) arrayList2.get(b13);
                        if (e00Var != null && e00Var2 != null && (soVar = e00Var.d) != null && (soVar2 = e00Var2.d) != null) {
                            int i19 = soVar.f;
                            soVar.f = soVar2.f;
                            soVar2.f = i19;
                            ArrayList arrayList3 = filtersSetupActivity.getMessagesController().Q0;
                            try {
                                arrayList3.set(b12 - filtersSetupActivity.r, e00Var2.d);
                                arrayList3.set(b13 - filtersSetupActivity.r, e00Var.d);
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
    public final void p(v4.e1 e1Var, int i7) {
        int i10 = this.d;
        Object obj = this.f;
        Runnable runnable = this.e;
        switch (i10) {
            case 0:
                fo foVar = (fo) runnable;
                iz izVar = (iz) obj;
                if (i7 != 0) {
                    izVar.G.I0(false);
                    e1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.q6.h(izVar.c0, e1Var.a, izVar.a);
                } else {
                    org.telegram.messenger.g0.r(foVar);
                    org.telegram.messenger.g0.i3(foVar, 320L);
                }
                if (e1Var != null) {
                    e1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            default:
                org.telegram.ui.iz izVar2 = (org.telegram.ui.iz) runnable;
                if (i7 != 0) {
                    ((FiltersSetupActivity) obj).a.I0(false);
                    e1Var.a.setPressed(true);
                } else {
                    org.telegram.messenger.g0.r(izVar2);
                    org.telegram.messenger.g0.i3(izVar2, 320L);
                }
                if (e1Var != null) {
                    View view = e1Var.a;
                    view.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    if (view instanceof org.telegram.ui.c00) {
                        ((org.telegram.ui.c00) view).setDragging(i7 == 2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.v
    public final void q(v4.e1 e1Var) {
        int i7 = this.d;
    }

    public hz(iz izVar) {
        this.d = 0;
        this.f = izVar;
        this.e = new fo(this, 18);
    }

    private final void r(v4.e1 e1Var) {
    }

    private final void s(v4.e1 e1Var) {
    }
}
