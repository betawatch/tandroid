package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b21 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b21(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    m31 m31Var = (m31) this.b;
                    if (m31Var.E != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = m31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = m31Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    m31Var.c.w0(0, (int) Math.ceil(m31Var.Y - m31Var.a0), org.telegram.ui.Components.xq.h);
                                    break;
                                } else {
                                    m31Var.c.w0(0, (int) (-(m31Var.Z - m31Var.Y)), org.telegram.ui.Components.xq.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i7 == 0) {
                    ((u71) this.b).s0 = false;
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((m81) this.b).getParentActivity().getCurrentFocus());
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
                ((c21) this.b).d1();
                break;
            case 1:
                m31 m31Var = (m31) this.b;
                m31Var.o0(false, true);
                m31Var.p0();
                if (m31Var.c.I1) {
                    org.telegram.messenger.g0.v1(m31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                c51 c51Var = (c51) this.b;
                if (c51Var.u0.size() != c51Var.v0.size() && !c51Var.z0 && c51Var.T.N0() > c51Var.W.c0 - 20) {
                    c51Var.k0();
                    break;
                }
                break;
            case 3:
                u71 u71Var = (u71) this.b;
                u71Var.v0.g1();
                u71Var.s0 = true;
                break;
            case 5:
                r91 r91Var = (r91) this.b;
                if (r91Var.o0 && r91Var.a0.N0() + 5 >= r91Var.m0) {
                    r91Var.L(r91Var.d0);
                }
                v91 v91Var = r91Var.v0;
                if (v91Var.s0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(v91Var.p0.getSearchField());
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
                            rc1 rc1Var = wallpapersListActivity.H;
                            if (!rc1Var.f && rc1Var.s == 0) {
                                rc1Var.F(rc1Var.h, rc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
