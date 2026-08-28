package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kb1 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    ((oc1) this.b).n0 = false;
                    break;
                }
                break;
            case 1:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((kd1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.f0 = i9 != 0;
                break;
        }
    }

    @Override // f2.d1
    public void b(RecyclerView recyclerView, int i9, int i10) {
        switch (this.a) {
            case 0:
                oc1 oc1Var = (oc1) this.b;
                oc1Var.q0.f1();
                oc1Var.n0 = true;
                break;
            case 2:
                re1 re1Var = (re1) this.b;
                if (re1Var.i0 && re1Var.R.N0() + 5 >= re1Var.g0) {
                    re1Var.J(re1Var.U);
                }
                we1 we1Var = re1Var.p0;
                if (we1Var.o0) {
                    if (i9 != 0 || i10 != 0) {
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
                            bi1 bi1Var = wallpapersListActivity.F;
                            if (!bi1Var.f && bi1Var.s == 0) {
                                bi1Var.F(bi1Var.h, bi1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
