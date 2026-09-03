package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class be1 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ be1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ge1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i10 != 0;
                break;
        }
    }

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                of1 of1Var = (of1) this.b;
                if (of1Var.j0 && of1Var.S.N0() + 5 >= of1Var.h0) {
                    of1Var.J(of1Var.V);
                }
                sf1 sf1Var = of1Var.q0;
                if (sf1Var.p0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(sf1Var.m0.getSearchField());
                        break;
                    }
                }
                break;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.E.getAdapter() == wallpapersListActivity.G) {
                    int L0 = wallpapersListActivity.H.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.H.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.H.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            xi1 xi1Var = wallpapersListActivity.G;
                            if (!xi1Var.f && xi1Var.s == 0) {
                                xi1Var.F(xi1Var.h, xi1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
