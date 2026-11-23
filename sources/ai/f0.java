package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qy;
import org.telegram.ui.dm0;
import org.telegram.ui.lf0;
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f0 extends v4.o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.b;
                if (l0Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) l0Var.F0;
                    break;
                }
                break;
            case 1:
                rect.right = ((hi.b2) this.b).e.E1(RecyclerView.R(view)) ? 0 : org.telegram.messenger.g0.L(4.0f);
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
                        rect.right = m10.B(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                        break;
                    }
                } else {
                    rect.right = org.telegram.messenger.g0.L(18.0f);
                    break;
                }
            case 3:
                hi.e0 e0Var = ((bv) this.b).r1;
                if (!(view instanceof av)) {
                    e0Var.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = org.telegram.messenger.g0.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -e0Var.getPaddingLeft();
                    rect.right = -e0Var.getPaddingRight();
                    break;
                }
                break;
            case 4:
                qy qyVar = (qy) this.b;
                dx dxVar = qyVar.Q;
                if (!(view instanceof j8)) {
                    if (!(view instanceof ek0) && !(view instanceof ix)) {
                        if (view instanceof p9) {
                            rect.bottom = org.telegram.messenger.g0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -dxVar.getPaddingLeft();
                        rect.right = -dxVar.getPaddingRight();
                        if (view instanceof ix) {
                            rect.top = org.telegram.messenger.g0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > qyVar.S.F && !i10.i(qyVar.d1).q() && !qyVar.V0) {
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
                if (RecyclerView.R(view) == ((lf0) this.b).c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.e(rect, view, recyclerView, c1Var);
                int R = RecyclerView.R(view);
                tg0 tg0Var = (tg0) this.b;
                if (R == tg0Var.Y1.size()) {
                    rect.bottom = tg0Var.h2;
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
                super.e(rect, view, recyclerView, c1Var);
                int R3 = RecyclerView.R(view);
                wg.v0 v0Var = (wg.v0) this.b;
                if (R3 == v0Var.Z1.size()) {
                    rect.bottom = v0Var.l2;
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, c1Var);
                int R4 = RecyclerView.R(view);
                wg.d1 d1Var = (wg.d1) this.b;
                if (R4 == d1Var.b2.size()) {
                    rect.bottom = d1Var.l2;
                    break;
                }
                break;
        }
    }
}
