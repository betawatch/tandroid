package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d21 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d21(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    n31 n31Var = (n31) this.b;
                    if (n31Var.E != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = n31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = n31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    n31Var.c.w0(0, (int) Math.ceil(n31Var.Y - n31Var.a0), org.telegram.ui.Components.xq.h);
                                    break;
                                } else {
                                    n31Var.c.w0(0, (int) (-(n31Var.Z - n31Var.Y)), org.telegram.ui.Components.xq.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i7 == 0) {
                    ((w71) this.b).s0 = false;
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((o81) this.b).getParentActivity().getCurrentFocus());
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
                ((e21) this.b).d1();
                break;
            case 1:
                n31 n31Var = (n31) this.b;
                n31Var.o0(false, true);
                n31Var.p0();
                if (n31Var.c.I1) {
                    org.telegram.messenger.g0.v1(n31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                d51 d51Var = (d51) this.b;
                if (d51Var.u0.size() != d51Var.v0.size() && !d51Var.z0 && d51Var.T.N0() > d51Var.W.c0 - 20) {
                    d51Var.k0();
                    break;
                }
                break;
            case 3:
                w71 w71Var = (w71) this.b;
                w71Var.v0.g1();
                w71Var.s0 = true;
                break;
            case 5:
                u91 u91Var = (u91) this.b;
                if (u91Var.o0 && u91Var.a0.N0() + 5 >= u91Var.m0) {
                    u91Var.L(u91Var.d0);
                }
                y91 y91Var = u91Var.v0;
                if (y91Var.s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(y91Var.p0.getSearchField());
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
                            vc1 vc1Var = wallpapersListActivity.H;
                            if (!vc1Var.f && vc1Var.s == 0) {
                                vc1Var.F(vc1Var.h, vc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
