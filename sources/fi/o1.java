package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.xw;
import org.telegram.ui.bm0;
import org.telegram.ui.jf0;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class o1 extends v4.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
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
                v vVar = ((qu) this.b).n1;
                if (!(view instanceof pu)) {
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
                gy gyVar = (gy) this.b;
                sw swVar = gyVar.P;
                if (!(view instanceof org.telegram.ui.Cells.j8)) {
                    if (!(view instanceof pj0) && !(view instanceof xw)) {
                        if (view instanceof org.telegram.ui.Components.l9) {
                            rect.bottom = org.telegram.messenger.g0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -swVar.getPaddingLeft();
                        rect.right = -swVar.getPaddingRight();
                        if (view instanceof xw) {
                            rect.top = org.telegram.messenger.g0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > gyVar.R.E && !p10.i(gyVar.c1).q() && !gyVar.U0) {
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
                if (RecyclerView.R(view) == ((jf0) this.b).c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 6:
                super.e(rect, view, recyclerView, a1Var);
                int R = RecyclerView.R(view);
                qg0 qg0Var = (qg0) this.b;
                if (R == qg0Var.U1.size()) {
                    rect.bottom = qg0Var.d2;
                    break;
                }
                break;
            case 7:
                int R2 = RecyclerView.R(view);
                bm0 bm0Var = (bm0) this.b;
                int i7 = bm0Var.b0;
                if (R2 >= i7) {
                    int i10 = bm0Var.f0;
                    if (R2 < i7 + i10) {
                        int i11 = R2 - i7;
                        int i12 = i11 / 3;
                        boolean z9 = i12 == 0;
                        boolean z10 = i12 == (i10 - 1) / 3;
                        int i13 = i11 % 3;
                        boolean z11 = i13 == 0;
                        boolean z12 = i13 == 2;
                        rect.top = z9 ? org.telegram.messenger.g0.L(8.0f) : 0;
                        rect.bottom = z10 ? org.telegram.messenger.g0.L(8.0f) : 0;
                        rect.left = z11 ? org.telegram.messenger.g0.L(10.0f) : 0;
                        rect.right = z12 ? org.telegram.messenger.g0.L(10.0f) : 0;
                        break;
                    }
                }
                break;
            case 8:
                super.e(rect, view, recyclerView, a1Var);
                int R3 = RecyclerView.R(view);
                wg.w0 w0Var = (wg.w0) this.b;
                if (R3 == w0Var.V1.size()) {
                    rect.bottom = w0Var.h2;
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, a1Var);
                int R4 = RecyclerView.R(view);
                wg.f1 f1Var = (wg.f1) this.b;
                if (R4 == f1Var.Y1.size()) {
                    rect.bottom = f1Var.i2;
                    break;
                }
                break;
        }
    }
}
