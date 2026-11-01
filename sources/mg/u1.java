package mg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.e20;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.g3;
import org.telegram.ui.ln0;
import org.telegram.ui.pg0;
import org.telegram.ui.uh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u1 extends s4.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.a) {
            case 0:
                super.c(rect, view, recyclerView, z0Var);
                int R = RecyclerView.R(view);
                v1 v1Var = (v1) this.b;
                if (R == v1Var.V1.size()) {
                    rect.bottom = v1Var.h2;
                    break;
                }
                break;
            case 1:
                super.c(rect, view, recyclerView, z0Var);
                int R2 = RecyclerView.R(view);
                i2 i2Var = (i2) this.b;
                if (R2 == i2Var.Y1.size()) {
                    rect.bottom = i2Var.i2;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.b;
                int b10 = recyclerView.T(view).b();
                if (b10 == 0) {
                    rect.left = org.telegram.messenger.i0.L(18.0f);
                }
                if (b10 != tVar.getAdapter().b() - 1) {
                    int b11 = tVar.getAdapter().b();
                    if (b11 != 4) {
                        rect.right = org.telegram.messenger.i0.L(24.0f);
                        break;
                    } else {
                        rect.right = a30.A(58.0f, b11, tVar.getWidth() - org.telegram.messenger.i0.L(36.0f)) / (b11 - 1);
                        break;
                    }
                } else {
                    rect.right = org.telegram.messenger.i0.L(18.0f);
                    break;
                }
            case 3:
                g3 g3Var = ((cv) this.b).n1;
                if (!(view instanceof bv)) {
                    g3Var.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = org.telegram.messenger.i0.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -g3Var.getPaddingLeft();
                    rect.right = -g3Var.getPaddingRight();
                    break;
                }
                break;
            case 4:
                vy vyVar = (vy) this.b;
                hx hxVar = vyVar.P;
                if (!(view instanceof n8)) {
                    if (!(view instanceof uk0) && !(view instanceof mx)) {
                        if (view instanceof g9) {
                            rect.bottom = org.telegram.messenger.i0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -hxVar.getPaddingLeft();
                        rect.right = -hxVar.getPaddingRight();
                        if (view instanceof mx) {
                            rect.top = org.telegram.messenger.i0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.i0.L(5.0f);
                    rect.right = org.telegram.messenger.i0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > vyVar.R.E && !e20.i(vyVar.c1).q() && !vyVar.U0) {
                        rect.top = org.telegram.messenger.i0.L(10.0f);
                        break;
                    }
                }
                break;
            case 5:
                if (RecyclerView.R(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = org.telegram.messenger.i0.L(4.0f);
                    break;
                }
                break;
            case 6:
                if (RecyclerView.R(view) == ((pg0) this.b).c.size() - 1) {
                    rect.bottom = org.telegram.messenger.i0.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.c(rect, view, recyclerView, z0Var);
                int R3 = RecyclerView.R(view);
                uh0 uh0Var = (uh0) this.b;
                if (R3 == uh0Var.U1.size()) {
                    rect.bottom = uh0Var.d2;
                    break;
                }
                break;
            case 8:
                int R4 = RecyclerView.R(view);
                ln0 ln0Var = (ln0) this.b;
                int i10 = ln0Var.b0;
                if (R4 >= i10) {
                    int i11 = ln0Var.f0;
                    if (R4 < i10 + i11) {
                        int i12 = R4 - i10;
                        int i13 = i12 / 3;
                        boolean z10 = i13 == 0;
                        boolean z11 = i13 == (i11 - 1) / 3;
                        int i14 = i12 % 3;
                        boolean z12 = i14 == 0;
                        boolean z13 = i14 == 2;
                        rect.top = z10 ? org.telegram.messenger.i0.L(8.0f) : 0;
                        rect.bottom = z11 ? org.telegram.messenger.i0.L(8.0f) : 0;
                        rect.left = z12 ? org.telegram.messenger.i0.L(10.0f) : 0;
                        rect.right = z13 ? org.telegram.messenger.i0.L(10.0f) : 0;
                        break;
                    }
                }
                break;
            default:
                rect.right = ((vh.g1) this.b).e.E1(RecyclerView.R(view)) ? 0 : org.telegram.messenger.i0.L(4.0f);
                rect.bottom = org.telegram.messenger.i0.L(4.0f);
                break;
        }
    }
}
