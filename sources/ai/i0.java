package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.n10;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.ry;
import org.telegram.ui.fm0;
import org.telegram.ui.nf0;
import org.telegram.ui.vg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i0 extends v4.o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                if (n0Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) n0Var.F0;
                    break;
                }
                break;
            case 1:
                rect.right = ((hi.u1) this.b).e.E1(RecyclerView.R(view)) ? 0 : org.telegram.messenger.g0.L(4.0f);
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
                        rect.right = n10.B(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                        break;
                    }
                } else {
                    rect.right = org.telegram.messenger.g0.L(18.0f);
                    break;
                }
            case 3:
                hi.w wVar = ((bv) this.b).r1;
                if (!(view instanceof av)) {
                    wVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = org.telegram.messenger.g0.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -wVar.getPaddingLeft();
                    rect.right = -wVar.getPaddingRight();
                    break;
                }
                break;
            case 4:
                ry ryVar = (ry) this.b;
                ex exVar = ryVar.Q;
                if (!(view instanceof k8)) {
                    if (!(view instanceof ck0) && !(view instanceof jx)) {
                        if (view instanceof q9) {
                            rect.bottom = org.telegram.messenger.g0.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -exVar.getPaddingLeft();
                        rect.right = -exVar.getPaddingRight();
                        if (view instanceof jx) {
                            rect.top = org.telegram.messenger.g0.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > ryVar.S.F && !j10.i(ryVar.d1).q() && !ryVar.V0) {
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
                if (RecyclerView.R(view) == ((nf0) this.b).c.size() - 1) {
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
                wg.d1 d1Var = (wg.d1) this.b;
                if (R4 == d1Var.b2.size()) {
                    rect.bottom = d1Var.l2;
                    break;
                }
                break;
        }
    }
}
