// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lr extends p79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pr prVar = (pr) obj;
                int b2 = recyclerView.U(view).b();
                if (b2 == 0) {
                    rect.left = hl.L(18.0f);
                }
                if (b2 != prVar.getAdapter().b() - 1) {
                    int b3 = prVar.getAdapter().b();
                    if (b3 != 4) {
                        rect.right = hl.L(24.0f);
                        break;
                    } else {
                        rect.right = ((prVar.getWidth() - hl.L(36.0f)) - (hl.L(58.0f) * b3)) / (b3 - 1);
                        break;
                    }
                } else {
                    rect.right = hl.L(18.0f);
                    break;
                }
            case 1:
                if (RecyclerView.S(view) == ((ArrayList) obj).size() - 1) {
                    rect.bottom = hl.L(4.0f);
                    break;
                }
                break;
            case 2:
                bn3 bn3Var = (bn3) obj;
                if (bn3Var.G0 > 0.0f && RecyclerView.S(view) == 0) {
                    rect.bottom += (int) bn3Var.G0;
                    break;
                }
                break;
            case 3:
                rect.right = ((hw3) obj).e.C1(RecyclerView.S(view)) ? 0 : hl.L(4.0f);
                rect.bottom = hl.L(4.0f);
                break;
            case 4:
                boolean z = view instanceof ky3;
                iw iwVar = ((ly3) obj).q1;
                if (!z) {
                    iwVar.getClass();
                    if (RecyclerView.S(view) == 1) {
                        rect.top = hl.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -iwVar.getPaddingLeft();
                    rect.right = -iwVar.getPaddingRight();
                    break;
                }
                break;
            case 5:
                o24 o24Var = (o24) obj;
                b14 b14Var = o24Var.Q;
                if (!(view instanceof t3b)) {
                    if (!(view instanceof d79) && !(view instanceof g14)) {
                        if (view instanceof de0) {
                            rect.bottom = hl.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -b14Var.getPaddingLeft();
                        rect.right = -b14Var.getPaddingRight();
                        if (view instanceof g14) {
                            rect.top = hl.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = hl.L(5.0f);
                    rect.right = hl.L(5.0f);
                    if (RecyclerView.S(view) + 1 > o24Var.S.F && !yac.h(o24Var.d1).p() && !o24Var.V0) {
                        rect.top = hl.L(10.0f);
                        break;
                    }
                }
                break;
            case 6:
                if (RecyclerView.S(view) == ((a67) obj).c.size() - 1) {
                    rect.bottom = hl.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.d(rect, view, recyclerView, c89Var);
                pi7 pi7Var = (pi7) obj;
                if (RecyclerView.S(view) == pi7Var.X1.size()) {
                    rect.bottom = pi7Var.g2;
                    break;
                }
                break;
            case 8:
                int S = RecyclerView.S(view);
                a48 a48Var = (a48) obj;
                int i = a48Var.c0;
                if (S >= i) {
                    int i2 = a48Var.g0;
                    if (S < i + i2) {
                        int i3 = S - i;
                        int i4 = i3 / 3;
                        boolean z2 = i4 == 0;
                        boolean z3 = i4 == (i2 - 1) / 3;
                        int i5 = i3 % 3;
                        boolean z4 = i5 == 0;
                        boolean z5 = i5 == 2;
                        rect.top = z2 ? hl.L(8.0f) : 0;
                        rect.bottom = z3 ? hl.L(8.0f) : 0;
                        rect.left = z4 ? hl.L(10.0f) : 0;
                        rect.right = z5 ? hl.L(10.0f) : 0;
                        break;
                    }
                }
                break;
            case 9:
                super.d(rect, view, recyclerView, c89Var);
                t2a t2aVar = (t2a) obj;
                if (RecyclerView.S(view) == t2aVar.Y1.size()) {
                    rect.bottom = t2aVar.k2;
                    break;
                }
                break;
            default:
                super.d(rect, view, recyclerView, c89Var);
                sbc sbcVar = (sbc) obj;
                if (RecyclerView.S(view) == sbcVar.a2.size()) {
                    rect.bottom = sbcVar.k2;
                    break;
                }
                break;
        }
    }
}
