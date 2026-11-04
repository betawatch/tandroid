package gi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.df0;
import org.telegram.ui.kg0;
import org.telegram.ui.wl0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o1 extends u4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        switch (this.a) {
            case 0:
                rect.right = ((t1) this.b).e.E1(RecyclerView.R(view)) ? 0 : org.telegram.messenger.g0.L(4.0f);
                rect.bottom = org.telegram.messenger.g0.L(4.0f);
                break;
            case 1:
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
                        rect.right = org.telegram.messenger.camera.q.A(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                        break;
                    }
                } else {
                    rect.right = org.telegram.messenger.g0.L(18.0f);
                    break;
                }
            case 2:
                v vVar = ((pu) this.b).o1;
                if (!(view instanceof ou)) {
                    vVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = org.telegram.messenger.g0.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -vVar.getPaddingLeft();
                    rect.right = -vVar.getPaddingRight();
                    break;
                }
                break;
            case 3:
                ey eyVar = (ey) this.b;
                rw rwVar = eyVar.Q;
                if (!(view instanceof org.telegram.ui.Cells.i8)) {
                    if (!(view instanceof tj0) && !(view instanceof ww)) {
                        if (view instanceof org.telegram.ui.Components.k9) {
                            rect.bottom = org.telegram.messenger.g0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -rwVar.getPaddingLeft();
                        rect.right = -rwVar.getPaddingRight();
                        if (view instanceof ww) {
                            rect.top = org.telegram.messenger.g0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > eyVar.S.F && !h10.i(eyVar.d1).q() && !eyVar.V0) {
                        rect.top = org.telegram.messenger.g0.L(10.0f);
                        break;
                    }
                }
                break;
            case 4:
                if (RecyclerView.R(view) == ((ArrayList) this.b).size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 5:
                if (RecyclerView.R(view) == ((df0) this.b).c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 6:
                super.e(rect, view, recyclerView, a1Var);
                int R = RecyclerView.R(view);
                kg0 kg0Var = (kg0) this.b;
                if (R == kg0Var.V1.size()) {
                    rect.bottom = kg0Var.e2;
                    break;
                }
                break;
            case 7:
                int R2 = RecyclerView.R(view);
                wl0 wl0Var = (wl0) this.b;
                int i3 = wl0Var.c0;
                if (R2 >= i3) {
                    int i10 = wl0Var.g0;
                    if (R2 < i3 + i10) {
                        int i11 = R2 - i3;
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
            case 8:
                super.e(rect, view, recyclerView, a1Var);
                int R3 = RecyclerView.R(view);
                xg.w0 w0Var = (xg.w0) this.b;
                if (R3 == w0Var.W1.size()) {
                    rect.bottom = w0Var.i2;
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, a1Var);
                int R4 = RecyclerView.R(view);
                xg.e1 e1Var = (xg.e1) this.b;
                if (R4 == e1Var.Z1.size()) {
                    rect.bottom = e1Var.j2;
                    break;
                }
                break;
        }
    }
}
