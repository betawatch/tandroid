package eg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.vx;
import org.telegram.ui.oh0;
import org.telegram.ui.to0;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f2 extends f2.v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, k1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                g2 g2Var = (g2) this.b;
                if (R == g2Var.Z.size()) {
                    rect.bottom = g2Var.l0;
                    break;
                }
                break;
            case 1:
                nh.s1 s1Var = ((nh.t1) this.b).e;
                recyclerView.getClass();
                rect.right = s1Var.E1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
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
                        rect.right = org.telegram.ui.b.z(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 3:
                nh.v vVar = ((jv) this.b).h;
                if (!(view instanceof iv)) {
                    vVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = AndroidUtilities.dp(14.0f);
                        break;
                    }
                } else {
                    rect.left = -vVar.getPaddingLeft();
                    rect.right = -vVar.getPaddingRight();
                    break;
                }
                break;
            case 4:
                fz fzVar = (fz) this.b;
                dx dxVar = fzVar.L;
                if (!(view instanceof k8)) {
                    if (!(view instanceof jl0) && !(view instanceof vx)) {
                        if (view instanceof t9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -dxVar.getPaddingLeft();
                        rect.right = -dxVar.getPaddingRight();
                        if (view instanceof vx) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > fzVar.N.A && !UserConfig.getInstance(fzVar.Y0).isPremium() && !fzVar.Q0) {
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
                if (RecyclerView.R(view) == ((oh0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 7:
                super.a(rect, view, recyclerView, k1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                zi0 zi0Var = (zi0) this.b;
                if (R2 == zi0Var.Y.size()) {
                    rect.bottom = zi0Var.h0;
                    break;
                }
                break;
            default:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                to0 to0Var = (to0) this.b;
                int i10 = to0Var.P;
                if (R3 >= i10) {
                    int i11 = to0Var.T;
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
