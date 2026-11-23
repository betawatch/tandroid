package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.messenger.o10;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.ty;
import org.telegram.ui.fm0;
import org.telegram.ui.mf0;
import org.telegram.ui.vg0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class j0 extends v4.o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.b;
                if (p0Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) p0Var.F0;
                    break;
                }
                break;
            case 1:
                rect.right = ((hi.t1) this.b).e.E1(RecyclerView.R(view)) ? 0 : org.telegram.messenger.g0.L(4.0f);
                rect.bottom = org.telegram.messenger.g0.L(4.0f);
                break;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.b;
                int b10 = recyclerView.T(view).b();
                if (b10 == 0) {
                    rect.left = org.telegram.messenger.g0.L(18.0f);
                }
                if (b10 != tVar.getAdapter().b() - 1) {
                    int b11 = tVar.getAdapter().b();
                    if (b11 != 4) {
                        rect.right = org.telegram.messenger.g0.L(24.0f);
                        break;
                    } else {
                        rect.right = o10.B(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                        break;
                    }
                } else {
                    rect.right = org.telegram.messenger.g0.L(18.0f);
                    break;
                }
            case 3:
                hi.x xVar = ((ev) this.b).r1;
                if (!(view instanceof dv)) {
                    xVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = org.telegram.messenger.g0.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -xVar.getPaddingLeft();
                    rect.right = -xVar.getPaddingRight();
                    break;
                }
                break;
            case 4:
                ty tyVar = (ty) this.b;
                gx gxVar = tyVar.Q;
                if (!(view instanceof k8)) {
                    if (!(view instanceof ek0) && !(view instanceof lx)) {
                        if (view instanceof q9) {
                            rect.bottom = org.telegram.messenger.g0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -gxVar.getPaddingLeft();
                        rect.right = -gxVar.getPaddingRight();
                        if (view instanceof lx) {
                            rect.top = org.telegram.messenger.g0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > tyVar.S.F && !k10.i(tyVar.d1).q() && !tyVar.V0) {
                        rect.top = org.telegram.messenger.g0.L(10.0f);
                        break;
                    }
                }
                break;
            case 5:
                if (RecyclerView.R(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 6:
                if (RecyclerView.R(view) == ((mf0) this.b).c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.e(rect, view, recyclerView, c1Var);
                int R = RecyclerView.R(view);
                vg0 vg0Var = (vg0) this.b;
                if (R == vg0Var.Y1.size()) {
                    rect.bottom = vg0Var.h2;
                    break;
                }
                break;
            case 8:
                int R2 = RecyclerView.R(view);
                fm0 fm0Var = (fm0) this.b;
                int i7 = fm0Var.c0;
                if (R2 >= i7) {
                    int i10 = fm0Var.g0;
                    if (R2 < i7 + i10) {
                        int i11 = R2 - i7;
                        int i12 = i11 / 3;
                        boolean z10 = i12 == 0;
                        boolean z11 = i12 == (i10 - 1) / 3;
                        int i13 = i11 % 3;
                        boolean z12 = i13 == 0;
                        boolean z13 = i13 == 2;
                        rect.top = z10 ? org.telegram.messenger.g0.L(8.0f) : 0;
                        rect.bottom = z11 ? org.telegram.messenger.g0.L(8.0f) : 0;
                        rect.left = z12 ? org.telegram.messenger.g0.L(10.0f) : 0;
                        rect.right = z13 ? org.telegram.messenger.g0.L(10.0f) : 0;
                        break;
                    }
                }
                break;
            case 9:
                super.e(rect, view, recyclerView, c1Var);
                int R3 = RecyclerView.R(view);
                wg.w0 w0Var = (wg.w0) this.b;
                if (R3 == w0Var.Z1.size()) {
                    rect.bottom = w0Var.l2;
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, c1Var);
                int R4 = RecyclerView.R(view);
                wg.e1 e1Var = (wg.e1) this.b;
                if (R4 == e1Var.b2.size()) {
                    rect.bottom = e1Var.l2;
                    break;
                }
                break;
        }
    }
}
