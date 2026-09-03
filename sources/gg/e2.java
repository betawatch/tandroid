package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.hp0;
import org.telegram.ui.jj0;
import org.telegram.ui.m3;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e2 extends f2.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                f2 f2Var = (f2) this.b;
                if (R == f2Var.a0.size()) {
                    rect.bottom = f2Var.m0;
                    break;
                }
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
                        rect.right = org.telegram.ui.b.z(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                        break;
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                    break;
                }
            case 2:
                m3 m3Var = ((lv) this.b).h;
                if (!(view instanceof kv)) {
                    m3Var.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = AndroidUtilities.dp(14.0f);
                        break;
                    }
                } else {
                    rect.left = -m3Var.getPaddingLeft();
                    rect.right = -m3Var.getPaddingRight();
                    break;
                }
                break;
            case 3:
                kz kzVar = (kz) this.b;
                ix ixVar = kzVar.M;
                if (!(view instanceof l8)) {
                    if (!(view instanceof rl0) && !(view instanceof zx)) {
                        if (view instanceof p9) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -ixVar.getPaddingLeft();
                        rect.right = -ixVar.getPaddingRight();
                        if (view instanceof zx) {
                            rect.top = AndroidUtilities.dp(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > kzVar.O.B && !UserConfig.getInstance(kzVar.Z0).isPremium() && !kzVar.R0) {
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
                if (RecyclerView.R(view) == ((yh0) this.b).c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
                }
                break;
            case 6:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                jj0 jj0Var = (jj0) this.b;
                if (R2 == jj0Var.Z.size()) {
                    rect.bottom = jj0Var.i0;
                    break;
                }
                break;
            case 7:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                hp0 hp0Var = (hp0) this.b;
                int i10 = hp0Var.V;
                if (R3 >= i10) {
                    int i11 = hp0Var.c0;
                    if (R3 < i10 + i11) {
                        int i12 = R3 - i10;
                        int i13 = i12 / 3;
                        boolean z4 = i13 == 0;
                        boolean z10 = i13 == (i11 - 1) / 3;
                        int i14 = i12 % 3;
                        boolean z11 = i14 == 0;
                        boolean z12 = i14 == 2;
                        rect.top = z4 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.bottom = z10 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.left = z11 ? AndroidUtilities.dp(10.0f) : 0;
                        rect.right = z12 ? AndroidUtilities.dp(10.0f) : 0;
                        break;
                    }
                }
                break;
            default:
                ph.g1 g1Var = ((ph.h1) this.b).e;
                recyclerView.getClass();
                rect.right = g1Var.E1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
                rect.bottom = AndroidUtilities.dp(4.0f);
                break;
        }
    }
}
