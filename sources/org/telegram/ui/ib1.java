package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ib1 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((nc1) this.b).n0 = false;
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ld1) this.b).getParentActivity().getCurrentFocus());
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

    @Override // f2.b1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                nc1 nc1Var = (nc1) this.b;
                nc1Var.q0.f1();
                nc1Var.n0 = true;
                break;
            case 2:
                se1 se1Var = (se1) this.b;
                if (se1Var.i0 && se1Var.R.N0() + 5 >= se1Var.g0) {
                    se1Var.J(se1Var.U);
                }
                we1 we1Var = se1Var.p0;
                if (we1Var.o0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(we1Var.l0.getSearchField());
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
                            ai1 ai1Var = wallpapersListActivity.F;
                            if (!ai1Var.f && ai1Var.s == 0) {
                                ai1Var.F(ai1Var.h, ai1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
