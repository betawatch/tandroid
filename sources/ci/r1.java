package ci;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.hi0;
import org.telegram.ui.uj0;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                rect.right = y1Var.E1(RecyclerView.S(view)) ? 0 : AndroidUtilities.dp(4.0f);
                rect.bottom = AndroidUtilities.dp(4.0f);
                break;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.b;
                int b10 = recyclerView.U(view).b();
                if (b10 == 0) {
                    rect.left = AndroidUtilities.dp(18.0f);
                }
                if (b10 != tVar.getAdapter().h() - 1) {
                    int h = tVar.getAdapter().h();
                    if (h != 4) {
                        rect.right = AndroidUtilities.dp(24.0f);
                        break;
                    } else {
                        rect.right = rk.B(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 2:
                v vVar = ((tv) this.b).h;
                if (!(view instanceof sv)) {
                    vVar.getClass();
                    if (RecyclerView.S(view) == 1) {
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
                kz kzVar = (kz) this.b;
                wx wxVar = kzVar.P;
                if (!(view instanceof org.telegram.ui.Cells.p8)) {
                    if (!(view instanceof yl0) && !(view instanceof cy)) {
                        if (view instanceof org.telegram.ui.Components.v9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -wxVar.getPaddingLeft();
                        rect.right = -wxVar.getPaddingRight();
                        if (view instanceof cy) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.S(view) + 1 > kzVar.R.E && !UserConfig.getInstance(kzVar.c1).isPremium() && !kzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        break;
                    }
                }
                break;
            case 4:
                recyclerView.getClass();
                if (RecyclerView.S(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.S(view) == ((hi0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 6:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                uj0 uj0Var = (uj0) this.b;
                if (S == uj0Var.c0.size()) {
                    rect.bottom = uj0Var.l0;
                    break;
                }
                break;
            case 7:
                recyclerView.getClass();
                int S2 = RecyclerView.S(view);
                wp0 wp0Var = (wp0) this.b;
                int i10 = wp0Var.b0;
                if (S2 >= i10) {
                    int i11 = wp0Var.f0;
                    if (S2 < i10 + i11) {
                        int i12 = S2 - i10;
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
                int S3 = RecyclerView.S(view);
                tg.z0 z0Var2 = (tg.z0) this.b;
                if (S3 == z0Var2.d0.size()) {
                    rect.bottom = z0Var2.p0;
                    break;
                }
                break;
        }
    }
}
