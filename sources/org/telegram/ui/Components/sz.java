package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sz extends s4.u {
    public final /* synthetic */ int d;
    public final Runnable e;
    public final /* synthetic */ Object f;

    public sz(FiltersSetupActivity filtersSetupActivity) {
        this.d = 1;
        this.f = filtersSetupActivity;
        this.e = new org.telegram.ui.zy(this, 5);
    }

    @Override // s4.u
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                View view = c1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(R.id.dragging, null);
                break;
            default:
                super.a(recyclerView, c1Var);
                View view2 = c1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                if (view2 instanceof org.telegram.ui.b10) {
                    ((org.telegram.ui.b10) view2).setDragging(false);
                    break;
                }
                break;
        }
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                tz tzVar = (tz) this.f;
                return (!org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).A3() || (tzVar.n && !(c1Var.b() == 0 && ((pz) tzVar.h.get(0)).e && !org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()))) ? s4.u.l(12, 0) : s4.u.l(0, 0);
            default:
                return c1Var.f != 2 ? s4.u.l(0, 0) : s4.u.l(3, 0);
        }
    }

    @Override // s4.u
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((tz) this.f).n;
            default:
                return true;
        }
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        org.telegram.messenger.ap apVar;
        org.telegram.messenger.ap apVar2;
        switch (this.d) {
            case 0:
                int i10 = 0;
                if (!org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).A3() || ((c1Var.b() != 0 && c1Var2.b() != 0) || org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q())) {
                    fg.j jVar = ((tz) this.f).I;
                    int b10 = c1Var.b();
                    int b11 = c1Var2.b();
                    tz tzVar = (tz) jVar.e;
                    ArrayList arrayList = tzVar.h;
                    SparseIntArray sparseIntArray = tzVar.k0;
                    int size = arrayList.size();
                    if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
                        ArrayList S0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).S0();
                        org.telegram.messenger.ap apVar3 = (org.telegram.messenger.ap) S0.get(b10);
                        org.telegram.messenger.ap apVar4 = (org.telegram.messenger.ap) S0.get(b11);
                        int i11 = apVar3.f;
                        apVar3.f = apVar4.f;
                        apVar4.f = i11;
                        S0.set(b10, apVar4);
                        S0.set(b11, apVar3);
                        pz pzVar = (pz) arrayList.get(b10);
                        pz pzVar2 = (pz) arrayList.get(b11);
                        int i12 = pzVar.a;
                        pzVar.a = pzVar2.a;
                        pzVar2.a = i12;
                        int i13 = sparseIntArray.get(b10);
                        sparseIntArray.put(b10, sparseIntArray.get(b11));
                        sparseIntArray.put(b11, i13);
                        oz ozVar = tzVar.J;
                        int i14 = pzVar2.a;
                        int i15 = pzVar.a;
                        org.telegram.ui.rx rxVar = (org.telegram.ui.rx) ozVar;
                        while (true) {
                            org.telegram.ui.zx[] zxVarArr = rxVar.b.e0;
                            if (i10 < zxVarArr.length) {
                                org.telegram.ui.zx zxVar = zxVarArr[i10];
                                int i16 = zxVar.h;
                                if (i16 == i14) {
                                    zxVar.h = i15;
                                } else if (i16 == i15) {
                                    zxVar.h = i14;
                                }
                                i10++;
                            } else {
                                int i17 = tzVar.K;
                                if (i17 == b10) {
                                    tzVar.K = b11;
                                    tzVar.L = pzVar.a;
                                } else if (i17 == b11) {
                                    tzVar.K = b10;
                                    tzVar.L = pzVar2.a;
                                }
                                int i18 = tzVar.q0;
                                if (i18 == b10) {
                                    tzVar.q0 = b11;
                                    tzVar.r0 = pzVar.a;
                                } else if (i18 == b11) {
                                    tzVar.q0 = b10;
                                    tzVar.r0 = pzVar2.a;
                                }
                                arrayList.set(b10, pzVar2);
                                arrayList.set(b11, pzVar);
                                tzVar.j();
                                tzVar.D = true;
                                tzVar.F.setItemAnimator(tzVar.s0);
                                jVar.j(b10, b11);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (c1Var.f == c1Var2.f) {
                    org.telegram.ui.f10 f10Var = ((FiltersSetupActivity) this.f).b;
                    int b12 = c1Var.b();
                    int b13 = c1Var2.b();
                    FiltersSetupActivity filtersSetupActivity = f10Var.e;
                    int i19 = filtersSetupActivity.r;
                    ArrayList arrayList2 = filtersSetupActivity.n;
                    if (b12 >= i19 && b13 >= i19) {
                        org.telegram.ui.d10 d10Var = (org.telegram.ui.d10) arrayList2.get(b12);
                        org.telegram.ui.d10 d10Var2 = (org.telegram.ui.d10) arrayList2.get(b13);
                        if (d10Var != null && d10Var2 != null && (apVar = d10Var.d) != null && (apVar2 = d10Var2.d) != null) {
                            int i20 = apVar.f;
                            apVar.f = apVar2.f;
                            apVar2.f = i20;
                            ArrayList arrayList3 = filtersSetupActivity.getMessagesController().P0;
                            try {
                                arrayList3.set(b12 - filtersSetupActivity.r, d10Var2.d);
                                arrayList3.set(b13 - filtersSetupActivity.r, d10Var.d);
                            } catch (Exception unused) {
                            }
                            filtersSetupActivity.e = true;
                            filtersSetupActivity.f0(true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        int i11 = this.d;
        Object obj = this.f;
        Runnable runnable = this.e;
        switch (i11) {
            case 0:
                ho hoVar = (ho) runnable;
                tz tzVar = (tz) obj;
                if (i10 != 0) {
                    tzVar.F.I0(false);
                    c1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.a7.i(tzVar.b0, c1Var.a, tzVar.a);
                } else {
                    org.telegram.messenger.i0.r(hoVar);
                    org.telegram.messenger.i0.h3(hoVar, 320L);
                }
                if (c1Var != null) {
                    c1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            default:
                org.telegram.ui.zy zyVar = (org.telegram.ui.zy) runnable;
                if (i10 != 0) {
                    ((FiltersSetupActivity) obj).a.I0(false);
                    c1Var.a.setPressed(true);
                } else {
                    org.telegram.messenger.i0.r(zyVar);
                    org.telegram.messenger.i0.h3(zyVar, 320L);
                }
                if (c1Var != null) {
                    View view = c1Var.a;
                    view.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
                    if (view instanceof org.telegram.ui.b10) {
                        ((org.telegram.ui.b10) view).setDragging(i10 == 2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
        int i10 = this.d;
    }

    public sz(tz tzVar) {
        this.d = 0;
        this.f = tzVar;
        this.e = new ho(this, 18);
    }

    private final void r(s4.c1 c1Var) {
    }

    private final void s(s4.c1 c1Var) {
    }
}
