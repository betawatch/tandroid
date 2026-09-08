package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class oe1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oe1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((te1) this.b).getParentActivity().getCurrentFocus());
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
                wallpapersListActivity.j0 = i10 != 0;
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ag1 ag1Var = (ag1) this.b;
                if (ag1Var.m0 && ag1Var.V.N0() + 5 >= ag1Var.k0) {
                    ag1Var.J(ag1Var.b0);
                }
                eg1 eg1Var = ag1Var.t0;
                if (eg1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(eg1Var.p0.getSearchField());
                        break;
                    }
                }
                break;
            case 3:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.H.getAdapter() == wallpapersListActivity.J) {
                    int L0 = wallpapersListActivity.K.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.K.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.K.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            jj1 jj1Var = wallpapersListActivity.J;
                            if (!jj1Var.f && jj1Var.s == 0) {
                                jj1Var.F(jj1Var.h, jj1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
