package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b21 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b21(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    n31 n31Var = (n31) this.b;
                    if (n31Var.F != null) {
                        org.telegram.ui.ActionBar.g5 g5Var = n31Var.d;
                        if (g5Var == null || !g5Var.x()) {
                            float f10 = n31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    n31Var.c.w0(0, (int) Math.ceil(n31Var.Z - n31Var.b0), org.telegram.ui.Components.kr.h);
                                    break;
                                } else {
                                    n31Var.c.w0(0, (int) (-(n31Var.a0 - n31Var.Z)), org.telegram.ui.Components.kr.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i7 == 0) {
                    ((v71) this.b).t0 = false;
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((n81) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i7 != 0;
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((c21) this.b).e1();
                break;
            case 1:
                n31 n31Var = (n31) this.b;
                n31Var.o0(false, true);
                n31Var.p0();
                if (n31Var.c.J1) {
                    org.telegram.messenger.g0.v1(n31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                b51 b51Var = (b51) this.b;
                if (b51Var.v0.size() != b51Var.w0.size() && !b51Var.A0 && b51Var.U.N0() > b51Var.X.d0 - 20) {
                    b51Var.k0();
                    break;
                }
                break;
            case 3:
                v71 v71Var = (v71) this.b;
                v71Var.w0.g1();
                v71Var.t0 = true;
                break;
            case 5:
                s91 s91Var = (s91) this.b;
                if (s91Var.p0 && s91Var.b0.N0() + 5 >= s91Var.n0) {
                    s91Var.J(s91Var.e0);
                }
                w91 w91Var = s91Var.w0;
                if (w91Var.t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(w91Var.q0.getSearchField());
                        break;
                    }
                }
                break;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
                    int L0 = wallpapersListActivity.J.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.J.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.J.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            sc1 sc1Var = wallpapersListActivity.I;
                            if (!sc1Var.f && sc1Var.s == 0) {
                                sc1Var.F(sc1Var.h, sc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
