package cg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.dj0;
import org.telegram.ui.rh0;
import org.telegram.ui.vo0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h2 extends f2.w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, l1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                i2 i2Var = (i2) this.b;
                if (R == i2Var.Z.size()) {
                    rect.bottom = i2Var.l0;
                    break;
                }
                break;
            case 1:
                lh.t1 t1Var = ((lh.u1) this.b).e;
                recyclerView.getClass();
                rect.right = t1Var.E1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
                rect.bottom = AndroidUtilities.dp(4.0f);
                break;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.b;
                int b10 = recyclerView.T(view).b();
                if (b10 == 0) {
                    rect.left = AndroidUtilities.dp(18.0f);
                }
                if (b10 != tVar.getAdapter().h() - 1) {
                    int h = tVar.getAdapter().h();
                    if (h != 4) {
                        rect.right = AndroidUtilities.dp(24.0f);
                        break;
                    } else {
                        rect.right = rl.z(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 3:
                lh.w wVar = ((cv) this.b).h;
                if (!(view instanceof bv)) {
                    wVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = AndroidUtilities.dp(14.0f);
                        break;
                    }
                } else {
                    rect.left = -wVar.getPaddingLeft();
                    rect.right = -wVar.getPaddingRight();
                    break;
                }
                break;
            case 4:
                yy yyVar = (yy) this.b;
                ww wwVar = yyVar.L;
                if (!(view instanceof j8)) {
                    if (!(view instanceof zk0) && !(view instanceof ox)) {
                        if (view instanceof n9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -wwVar.getPaddingLeft();
                        rect.right = -wwVar.getPaddingRight();
                        if (view instanceof ox) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > yyVar.N.A && !UserConfig.getInstance(yyVar.Y0).isPremium() && !yyVar.Q0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        break;
                    }
                }
                break;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 6:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((rh0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 7:
                super.a(rect, view, recyclerView, l1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                dj0 dj0Var = (dj0) this.b;
                if (R2 == dj0Var.Y.size()) {
                    rect.bottom = dj0Var.h0;
                    break;
                }
                break;
            default:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                vo0 vo0Var = (vo0) this.b;
                int i10 = vo0Var.P;
                if (R3 >= i10) {
                    int i11 = vo0Var.T;
                    if (R3 < i10 + i11) {
                        int i12 = R3 - i10;
                        int i13 = i12 / 3;
                        boolean z10 = i13 == 0;
                        boolean z11 = i13 == (i11 - 1) / 3;
                        int i14 = i12 % 3;
                        boolean z12 = i14 == 0;
                        boolean z13 = i14 == 2;
                        rect.top = z10 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.bottom = z11 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.left = z12 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.right = z13 ? AndroidUtilities.dp(8.0f) : 0;
                        break;
                    }
                }
                break;
        }
    }
}
