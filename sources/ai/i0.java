package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.ui.Cells.i8;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.yw;
import org.telegram.ui.dm0;
import org.telegram.ui.jf0;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i0 extends v4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                if (n0Var.E0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) n0Var.E0;
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
                        rect.right = i20.A(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                        break;
                    }
                } else {
                    rect.right = org.telegram.messenger.g0.L(18.0f);
                    break;
                }
            case 3:
                hi.v vVar = ((wu) this.b).r1;
                if (!(view instanceof vu)) {
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
            case 4:
                ly lyVar = (ly) this.b;
                yw ywVar = lyVar.Q;
                if (!(view instanceof i8)) {
                    if (!(view instanceof uj0) && !(view instanceof dx)) {
                        if (view instanceof i9) {
                            rect.bottom = org.telegram.messenger.g0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -ywVar.getPaddingLeft();
                        rect.right = -ywVar.getPaddingRight();
                        if (view instanceof dx) {
                            rect.top = org.telegram.messenger.g0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > lyVar.S.F && !m10.i(lyVar.d1).q() && !lyVar.V0) {
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
                if (RecyclerView.R(view) == ((jf0) this.b).c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.e(rect, view, recyclerView, b1Var);
                int R = RecyclerView.R(view);
                qg0 qg0Var = (qg0) this.b;
                if (R == qg0Var.Y1.size()) {
                    rect.bottom = qg0Var.h2;
                    break;
                }
                break;
            case 8:
                int R2 = RecyclerView.R(view);
                dm0 dm0Var = (dm0) this.b;
                int i7 = dm0Var.c0;
                if (R2 >= i7) {
                    int i10 = dm0Var.g0;
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
                super.e(rect, view, recyclerView, b1Var);
                int R3 = RecyclerView.R(view);
                wg.u0 u0Var = (wg.u0) this.b;
                if (R3 == u0Var.Z1.size()) {
                    rect.bottom = u0Var.l2;
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, b1Var);
                int R4 = RecyclerView.R(view);
                wg.c1 c1Var = (wg.c1) this.b;
                if (R4 == c1Var.c2.size()) {
                    rect.bottom = c1Var.m2;
                    break;
                }
                break;
        }
    }
}
