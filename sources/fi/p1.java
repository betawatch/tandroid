package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.zv;
import org.telegram.ui.ej0;
import org.telegram.ui.np0;
import org.telegram.ui.th0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p1 extends s4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        switch (this.a) {
            case 0:
                rect.right = ((u1) this.b).e.F1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
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
                        rect.right = wh.C(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 2:
                v vVar = ((aw) this.b).h;
                if (!(view instanceof zv)) {
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
                sz szVar = (sz) this.b;
                dy dyVar = szVar.P;
                if (!(view instanceof org.telegram.ui.Cells.s8)) {
                    if (!(view instanceof nm0) && !(view instanceof iy)) {
                        if (view instanceof org.telegram.ui.Components.y9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -dyVar.getPaddingLeft();
                        rect.right = -dyVar.getPaddingRight();
                        if (view instanceof iy) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    if (RecyclerView.R(view) + 1 > szVar.R.E && !UserConfig.getInstance(szVar.c1).isPremium() && !szVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        break;
                    }
                }
                break;
            case 4:
                if (RecyclerView.R(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 5:
                if (RecyclerView.R(view) == ((th0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 6:
                super.d(rect, view, recyclerView, b1Var);
                int R = RecyclerView.R(view);
                ej0 ej0Var = (ej0) this.b;
                if (R == ej0Var.c0.size()) {
                    rect.bottom = ej0Var.l0;
                    break;
                }
                break;
            case 7:
                int R2 = RecyclerView.R(view);
                np0 np0Var = (np0) this.b;
                int i10 = np0Var.b0;
                if (R2 >= i10) {
                    int i11 = np0Var.f0;
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
                super.d(rect, view, recyclerView, b1Var);
                int R3 = RecyclerView.R(view);
                vg.z0 z0Var = (vg.z0) this.b;
                if (R3 == z0Var.d0.size()) {
                    rect.bottom = z0Var.p0;
                    break;
                }
                break;
        }
    }
}
