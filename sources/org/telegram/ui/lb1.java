package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lb1 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((qc1) this.b).n0 = false;
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((md1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.f0 = i10 != 0;
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                qc1 qc1Var = (qc1) this.b;
                qc1Var.q0.f1();
                qc1Var.n0 = true;
                break;
            case 2:
                ve1 ve1Var = (ve1) this.b;
                if (ve1Var.i0 && ve1Var.R.N0() + 5 >= ve1Var.g0) {
                    ve1Var.J(ve1Var.U);
                }
                ze1 ze1Var = ve1Var.p0;
                if (ze1Var.o0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(ze1Var.l0.getSearchField());
                        break;
                    }
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.D.getAdapter() == wallpapersListActivity.F) {
                    int L0 = wallpapersListActivity.G.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.G.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.G.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            ci1 ci1Var = wallpapersListActivity.F;
                            if (!ci1Var.f && ci1Var.s == 0) {
                                ci1Var.F(ci1Var.h, ci1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
