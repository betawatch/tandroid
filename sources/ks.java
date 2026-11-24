// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ks extends e69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                os osVar = (os) obj;
                int b2 = recyclerView.T(view).b();
                if (b2 == 0) {
                    rect.left = gm.L(18.0f);
                }
                if (b2 != osVar.getAdapter().b() - 1) {
                    int b3 = osVar.getAdapter().b();
                    if (b3 != 4) {
                        rect.right = gm.L(24.0f);
                        break;
                    } else {
                        rect.right = ((osVar.getWidth() - gm.L(36.0f)) - (gm.L(58.0f) * b3)) / (b3 - 1);
                        break;
                    }
                } else {
                    rect.right = gm.L(18.0f);
                    break;
                }
            case 1:
                if (RecyclerView.R(view) == ((ArrayList) obj).size() - 1) {
                    rect.bottom = gm.L(4.0f);
                    break;
                }
                break;
            case 2:
                un3 un3Var = (un3) obj;
                if (un3Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) un3Var.F0;
                    break;
                }
                break;
            case 3:
                rect.right = ((yw3) obj).e.C1(RecyclerView.R(view)) ? 0 : gm.L(4.0f);
                rect.bottom = gm.L(4.0f);
                break;
            case 4:
                boolean z = view instanceof zy3;
                hx hxVar = ((az3) obj).q1;
                if (!z) {
                    hxVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = gm.L(14.0f);
                        break;
                    }
                } else {
                    rect.left = -hxVar.getPaddingLeft();
                    rect.right = -hxVar.getPaddingRight();
                    break;
                }
                break;
            case 5:
                e34 e34Var = (e34) obj;
                r14 r14Var = e34Var.Q;
                if (!(view instanceof w1b)) {
                    if (!(view instanceof r59) && !(view instanceof w14)) {
                        if (view instanceof bf0) {
                            rect.bottom = gm.L(12.0f);
                            break;
                        }
                    } else {
                        rect.left = -r14Var.getPaddingLeft();
                        rect.right = -r14Var.getPaddingRight();
                        if (view instanceof w14) {
                            rect.top = gm.L(8.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = gm.L(5.0f);
                    rect.right = gm.L(5.0f);
                    if (RecyclerView.R(view) + 1 > e34Var.S.F && !z8c.h(e34Var.d1).p() && !e34Var.V0) {
                        rect.top = gm.L(10.0f);
                        break;
                    }
                }
                break;
            case 6:
                if (RecyclerView.R(view) == ((t57) obj).c.size() - 1) {
                    rect.bottom = gm.L(4.0f);
                    break;
                }
                break;
            case 7:
                super.d(rect, view, recyclerView, r69Var);
                ji7 ji7Var = (ji7) obj;
                if (RecyclerView.R(view) == ji7Var.X1.size()) {
                    rect.bottom = ji7Var.g2;
                    break;
                }
                break;
            case 8:
                int R = RecyclerView.R(view);
                w28 w28Var = (w28) obj;
                int i = w28Var.c0;
                if (R >= i) {
                    int i2 = w28Var.g0;
                    if (R < i + i2) {
                        int i3 = R - i;
                        int i4 = i3 / 3;
                        boolean z2 = i4 == 0;
                        boolean z3 = i4 == (i2 - 1) / 3;
                        int i5 = i3 % 3;
                        boolean z4 = i5 == 0;
                        boolean z5 = i5 == 2;
                        rect.top = z2 ? gm.L(8.0f) : 0;
                        rect.bottom = z3 ? gm.L(8.0f) : 0;
                        rect.left = z4 ? gm.L(10.0f) : 0;
                        rect.right = z5 ? gm.L(10.0f) : 0;
                        break;
                    }
                }
                break;
            case 9:
                super.d(rect, view, recyclerView, r69Var);
                b1a b1aVar = (b1a) obj;
                if (RecyclerView.R(view) == b1aVar.Y1.size()) {
                    rect.bottom = b1aVar.k2;
                    break;
                }
                break;
            default:
                super.d(rect, view, recyclerView, r69Var);
                t9c t9cVar = (t9c) obj;
                if (RecyclerView.R(view) == t9cVar.a2.size()) {
                    rect.bottom = t9cVar.k2;
                    break;
                }
                break;
        }
    }
}
