package bg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.wy;
import org.telegram.ui.bj0;
import org.telegram.ui.ph0;
import org.telegram.ui.uo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p2 extends f2.y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, n1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                q2 q2Var = (q2) this.b;
                if (R == q2Var.Z.size()) {
                    rect.bottom = q2Var.l0;
                    break;
                }
                break;
            case 1:
                kh.v1 v1Var = ((kh.w1) this.b).e;
                recyclerView.getClass();
                rect.right = v1Var.E1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
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
                        rect.right = ll.A(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 3:
                kh.w wVar = ((dv) this.b).h;
                if (!(view instanceof cv)) {
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
                wy wyVar = (wy) this.b;
                ww wwVar = wyVar.L;
                if (!(view instanceof m8)) {
                    if (!(view instanceof wk0) && !(view instanceof nx)) {
                        if (view instanceof o9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -wwVar.getPaddingLeft();
                        rect.right = -wwVar.getPaddingRight();
                        if (view instanceof nx) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > wyVar.N.A && !UserConfig.getInstance(wyVar.Y0).isPremium() && !wyVar.Q0) {
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
                if (RecyclerView.R(view) == ((ph0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 7:
                super.a(rect, view, recyclerView, n1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                bj0 bj0Var = (bj0) this.b;
                if (R2 == bj0Var.Y.size()) {
                    rect.bottom = bj0Var.h0;
                    break;
                }
                break;
            default:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                uo0 uo0Var = (uo0) this.b;
                int i9 = uo0Var.P;
                if (R3 >= i9) {
                    int i10 = uo0Var.T;
                    if (R3 < i9 + i10) {
                        int i11 = R3 - i9;
                        int i12 = i11 / 3;
                        boolean z10 = i12 == 0;
                        boolean z11 = i12 == (i10 - 1) / 3;
                        int i13 = i11 % 3;
                        boolean z12 = i13 == 0;
                        boolean z13 = i13 == 2;
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
