package ci;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.di0;
import org.telegram.ui.oj0;
import org.telegram.ui.qp0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class r1 extends s4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.a) {
            case 0:
                y1 y1Var = ((z1) this.b).e;
                recyclerView.getClass();
                rect.right = y1Var.E1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
                rect.bottom = AndroidUtilities.dp(4.0f);
                break;
            case 1:
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
                        rect.right = bi.A(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 2:
                v vVar = ((wv) this.b).h;
                if (!(view instanceof vv)) {
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
            case 3:
                nz nzVar = (nz) this.b;
                zx zxVar = nzVar.P;
                if (!(view instanceof org.telegram.ui.Cells.o8)) {
                    if (!(view instanceof zl0) && !(view instanceof fy)) {
                        if (view instanceof org.telegram.ui.Components.w9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -zxVar.getPaddingLeft();
                        rect.right = -zxVar.getPaddingRight();
                        if (view instanceof fy) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > nzVar.R.E && !UserConfig.getInstance(nzVar.c1).isPremium() && !nzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        break;
                    }
                }
                break;
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((di0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 6:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                oj0 oj0Var = (oj0) this.b;
                if (R == oj0Var.c0.size()) {
                    rect.bottom = oj0Var.l0;
                    break;
                }
                break;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                qp0 qp0Var = (qp0) this.b;
                int i10 = qp0Var.b0;
                if (R2 >= i10) {
                    int i11 = qp0Var.f0;
                    if (R2 < i10 + i11) {
                        int i12 = R2 - i10;
                        int i13 = i12 / 3;
                        boolean z10 = i13 == 0;
                        boolean z11 = i13 == (i11 - 1) / 3;
                        int i14 = i12 % 3;
                        boolean z12 = i14 == 0;
                        boolean z13 = i14 == 2;
                        rect.top = z10 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.bottom = z11 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.left = z12 ? AndroidUtilities.dp(10.0f) : 0;
                        rect.right = z13 ? AndroidUtilities.dp(10.0f) : 0;
                        break;
                    }
                }
                break;
            default:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                tg.z0 z0Var2 = (tg.z0) this.b;
                if (R3 == z0Var2.d0.size()) {
                    rect.bottom = z0Var2.p0;
                    break;
                }
                break;
        }
    }
}
