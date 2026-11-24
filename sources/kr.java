// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kr extends c49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                or orVar = (or) obj;
                int b2 = recyclerView.T(view).b();
                if (b2 == 0) {
                    rect.left = gl.L(18.0f);
                }
                if (b2 != orVar.getAdapter().b() - 1) {
                    int b3 = orVar.getAdapter().b();
                    if (b3 != 4) {
                        rect.right = gl.L(24.0f);
                        break;
                    } else {
                        rect.right = ((orVar.getWidth() - gl.L(36.0f)) - (gl.L(58.0f) * b3)) / (b3 - 1);
                        break;
                    }
                } else {
                    rect.right = gl.L(18.0f);
                    break;
                }
            case 1:
                if (RecyclerView.R(view) == ((ArrayList) obj).size() - 1) {
                    rect.bottom = gl.L(4.0f);
                    break;
                }
                break;
            case 2:
                jm3 jm3Var = (jm3) obj;
                if (jm3Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) jm3Var.F0;
                    break;
                }
                break;
            case 3:
                rect.right = ((nv3) obj).e.C1(RecyclerView.R(view)) ? 0 : gl.L(4.0f);
                rect.bottom = gl.L(4.0f);
                break;
            case 4:
                boolean z = view instanceof px3;
                hw hwVar = ((qx3) obj).q1;
                if (!z) {
                    hwVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = gl.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -hwVar.getPaddingLeft();
                    rect.right = -hwVar.getPaddingRight();
                    break;
                }
                break;
            case 5:
                t14 t14Var = (t14) obj;
                g04 g04Var = t14Var.Q;
                if (!(view instanceof vza)) {
                    if (!(view instanceof o39) && !(view instanceof l04)) {
                        if (view instanceof be0) {
                            rect.bottom = gl.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -g04Var.getPaddingLeft();
                        rect.right = -g04Var.getPaddingRight();
                        if (view instanceof l04) {
                            rect.top = gl.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = gl.L(5.0f);
                    rect.right = gl.L(5.0f);
                    if (RecyclerView.R(view) + 1 > t14Var.S.F && !y6c.h(t14Var.d1).p() && !t14Var.V0) {
                        rect.top = gl.L(10.0f);
                        break;
                    }
                }
                break;
            case 6:
                if (RecyclerView.R(view) == ((t37) obj).c.size() - 1) {
                    rect.bottom = gl.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.e(rect, view, recyclerView, p49Var);
                gg7 gg7Var = (gg7) obj;
                if (RecyclerView.R(view) == gg7Var.X1.size()) {
                    rect.bottom = gg7Var.g2;
                    break;
                }
                break;
            case 8:
                int R = RecyclerView.R(view);
                t08 t08Var = (t08) obj;
                int i = t08Var.c0;
                if (R >= i) {
                    int i2 = t08Var.g0;
                    if (R < i + i2) {
                        int i3 = R - i;
                        int i4 = i3 / 3;
                        boolean z2 = i4 == 0;
                        boolean z3 = i4 == (i2 - 1) / 3;
                        int i5 = i3 % 3;
                        boolean z4 = i5 == 0;
                        boolean z5 = i5 == 2;
                        rect.top = z2 ? gl.L(8.0f) : 0;
                        rect.bottom = z3 ? gl.L(8.0f) : 0;
                        rect.left = z4 ? gl.L(10.0f) : 0;
                        rect.right = z5 ? gl.L(10.0f) : 0;
                        break;
                    }
                }
                break;
            case 9:
                super.e(rect, view, recyclerView, p49Var);
                zy9 zy9Var = (zy9) obj;
                if (RecyclerView.R(view) == zy9Var.Y1.size()) {
                    rect.bottom = zy9Var.k2;
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, p49Var);
                s7c s7cVar = (s7c) obj;
                if (RecyclerView.R(view) == s7cVar.a2.size()) {
                    rect.bottom = s7cVar.k2;
                    break;
                }
                break;
        }
    }
}
