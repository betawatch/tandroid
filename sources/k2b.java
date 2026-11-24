// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k2b extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k2b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        brc brcVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                if (i == 0) {
                    ((rob) obj).t0 = false;
                    break;
                }
                break;
            case 3:
                if (i == 1) {
                    gm.t1(((wqb) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (i == 1) {
                    gm.t1(((avb) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (i == 1) {
                    gm.t1(((t9c) obj).U1.getEditText());
                    break;
                }
                break;
            case 7:
                y9c y9cVar = (y9c) obj;
                pu9 pu9Var = y9cVar.n1;
                if (i == 0 && y9cVar.A1) {
                    if (gm.L(13.0f) + y9cVar.x1 + y9cVar.t0 < (gm.m << 1) && pu9Var.canScrollVertically(1) && (b59Var = (b59) pu9Var.K(0)) != null) {
                        View view = b59Var.a;
                        if (view.getTop() > 0) {
                            pu9Var.x0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                if (i == 1) {
                    gm.t1(((UsersSelectActivity) obj).c);
                    break;
                }
                break;
            case 10:
                if (i == 1 && (brcVar = ((goc) obj).j0) != null) {
                    brcVar.a();
                    break;
                }
                break;
            case 13:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (i == 1) {
                    gm.t1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i != 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d0, code lost:
    
        if (r4.x() != false) goto L59;
     */
    @Override // k69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        rja rjaVar;
        coc cocVar;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((x2b) obj).U0();
                break;
            case 1:
                yfb yfbVar = (yfb) obj;
                fn0 fn0Var = yfbVar.Y;
                if (!yfbVar.c.canScrollVertically(-1)) {
                    rjaVar = ((d) yfbVar).simpleActionBar;
                    break;
                }
                z = true;
                fn0Var.a(z, true);
                break;
            case 2:
                rob robVar = (rob) obj;
                robVar.w0.h1();
                robVar.t0 = true;
                break;
            case 5:
                nxb nxbVar = (nxb) obj;
                if (nxbVar.p0 && nxbVar.b0.M0() + 5 >= nxbVar.n0) {
                    nxbVar.L(nxbVar.e0);
                }
                sxb sxbVar = nxbVar.w0;
                if (sxbVar.t0) {
                    if (i != 0 || i2 != 0) {
                        gm.t1(sxbVar.q0.getSearchField());
                        break;
                    }
                }
                break;
            case 7:
                ((y9c) obj).L0();
                break;
            case 9:
                ((vgc) obj).invalidate();
                break;
            case 10:
                goc gocVar = (goc) obj;
                if (i2 != 0 && recyclerView.getScrollState() == 1 && (cocVar = gocVar.t0) != null && cocVar.f) {
                    cocVar.d = true;
                }
                gocVar.Y0();
                break;
            case 11:
                int[] iArr = (int[]) obj;
                iArr[0] = iArr[0] + i2;
                break;
            case 12:
                asc ascVar = (asc) obj;
                if (ascVar.a.J1) {
                    gm.t1(ascVar.O);
                    break;
                }
                break;
            case 13:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
                    int K0 = wallpapersListActivity.J.K0();
                    int abs = K0 != -1 ? Math.abs(wallpapersListActivity.J.M0() - K0) + 1 : 0;
                    if (abs > 0) {
                        int A = wallpapersListActivity.J.A();
                        if (abs != 0 && K0 + abs > A - 2) {
                            qtc qtcVar = wallpapersListActivity.I;
                            if (!qtcVar.f && qtcVar.s == 0) {
                                qtcVar.F(qtcVar.h, qtcVar.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
