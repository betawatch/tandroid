package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e21 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e21(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    o31 o31Var = (o31) this.b;
                    if (o31Var.E != null) {
                        org.telegram.ui.ActionBar.g5 g5Var = o31Var.d;
                        if (g5Var == null || !g5Var.w()) {
                            float f10 = o31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    o31Var.c.w0(0, (int) Math.ceil(o31Var.Y - o31Var.a0), org.telegram.ui.Components.wq.h);
                                    break;
                                } else {
                                    o31Var.c.w0(0, (int) (-(o31Var.Z - o31Var.Y)), org.telegram.ui.Components.wq.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i7 == 0) {
                    ((x71) this.b).s0 = false;
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
                wallpapersListActivity.f0 = i7 != 0;
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((f21) this.b).d1();
                break;
            case 1:
                o31 o31Var = (o31) this.b;
                o31Var.o0(false, true);
                o31Var.p0();
                if (o31Var.c.I1) {
                    org.telegram.messenger.g0.v1(o31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                e51 e51Var = (e51) this.b;
                if (e51Var.u0.size() != e51Var.v0.size() && !e51Var.z0 && e51Var.T.N0() > e51Var.W.c0 - 20) {
                    e51Var.k0();
                    break;
                }
                break;
            case 3:
                x71 x71Var = (x71) this.b;
                x71Var.v0.g1();
                x71Var.s0 = true;
                break;
            case 5:
                v91 v91Var = (v91) this.b;
                if (v91Var.o0 && v91Var.a0.N0() + 5 >= v91Var.m0) {
                    v91Var.L(v91Var.d0);
                }
                z91 z91Var = v91Var.v0;
                if (z91Var.s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(z91Var.p0.getSearchField());
                        break;
                    }
                }
                break;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            wc1 wc1Var = wallpapersListActivity.H;
                            if (!wc1Var.f && wc1Var.s == 0) {
                                wc1Var.F(wc1Var.h, wc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
