package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d21 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d21(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    o31 o31Var = (o31) this.b;
                    if (o31Var.F != null) {
                        org.telegram.ui.ActionBar.g5 g5Var = o31Var.d;
                        if (g5Var == null || !g5Var.x()) {
                            float f10 = o31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    o31Var.c.w0(0, (int) Math.ceil(o31Var.Z - o31Var.b0), org.telegram.ui.Components.nr.h);
                                    break;
                                } else {
                                    o31Var.c.w0(0, (int) (-(o31Var.a0 - o31Var.Z)), org.telegram.ui.Components.nr.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i7 == 0) {
                    ((x71) this.b).t0 = false;
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((p81) this.b).getParentActivity().getCurrentFocus());
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
                ((e21) this.b).e1();
                break;
            case 1:
                o31 o31Var = (o31) this.b;
                o31Var.o0(false, true);
                o31Var.p0();
                if (o31Var.c.J1) {
                    org.telegram.messenger.g0.v1(o31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                c51 c51Var = (c51) this.b;
                if (c51Var.v0.size() != c51Var.w0.size() && !c51Var.A0 && c51Var.U.N0() > c51Var.X.d0 - 20) {
                    c51Var.k0();
                    break;
                }
                break;
            case 3:
                x71 x71Var = (x71) this.b;
                x71Var.w0.g1();
                x71Var.t0 = true;
                break;
            case 5:
                u91 u91Var = (u91) this.b;
                if (u91Var.p0 && u91Var.b0.N0() + 5 >= u91Var.n0) {
                    u91Var.H(u91Var.e0);
                }
                y91 y91Var = u91Var.w0;
                if (y91Var.t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(y91Var.q0.getSearchField());
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
                            uc1 uc1Var = wallpapersListActivity.I;
                            if (!uc1Var.f && uc1Var.s == 0) {
                                uc1Var.F(uc1Var.h, uc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
