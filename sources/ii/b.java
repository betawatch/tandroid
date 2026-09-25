package ii;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ b(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (ii.e6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C2();
                break;
            case 1:
                this.b.t3();
                break;
            case 2:
                x3 x3Var = this.b;
                if (x3Var.x3 != null && !x3Var.n3.y()) {
                    if (x3Var.T4(x3Var.x3, x3Var.v3, x3Var.w3)) {
                        x3Var.A3 = true;
                        break;
                    } else {
                        int left = (int) ((x3Var.v3 - x3Var.x3.getLeft()) - x3Var.getLeft());
                        int top = (int) ((x3Var.w3 - x3Var.x3.getTop()) - x3Var.getTop());
                        View view = x3Var.x3;
                        if (view instanceof h0) {
                            h0 h0Var = (h0) view;
                            h0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!h0.h(h0Var.w, f7, f10) && !h0.h(h0Var.x, f7, f10)) {
                                ArrayList arrayList = h0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (h0.h((e0) obj, f7, f10)) {
                                    }
                                }
                            }
                            x3Var.A3 = true;
                            break;
                        }
                        View view2 = x3Var.x3;
                        if (view2 instanceof p5) {
                            p5 p5Var = (p5) view2;
                            if (x3Var.j3(p5Var, left, top)) {
                                try {
                                    p5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                x3Var.A3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = p5Var.m(left, top);
                                if (m10 != null) {
                                    y70 y70Var = x3Var.j4;
                                    if (y70Var != null) {
                                        x3Var.j4 = null;
                                        y70Var.u();
                                    }
                                    x3Var.g2(p5Var);
                                    x3Var.B0();
                                    x3Var.requestDisallowInterceptTouchEvent(true);
                                    x3Var.B3 = true;
                                    x3Var.D3 = m10;
                                    x3Var.E3 = m10;
                                    p5Var.w(m10, m10);
                                    try {
                                        p5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    x3Var.A3 = true;
                                    break;
                                } else {
                                    x3Var.J4(x3Var.x3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof e6) {
                            e6 e6Var = (e6) view2;
                            i1 i1Var = e6Var.h;
                            i1 i1Var2 = e6Var.f;
                            LinearLayout linearLayout = e6Var.b;
                            if (!e6.m(i1Var2, i1Var2.getLeft() + linearLayout.getLeft(), i1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (i1Var.getVisibility() == 0) {
                                    break;
                                }
                                x3Var.J4(x3Var.x3);
                                break;
                            }
                            x3Var.A3 = true;
                            break;
                        } else {
                            if (view2 instanceof u0) {
                                i1 i1Var3 = ((u0) view2).d;
                                if (i1Var3.length() == 0 && left >= i1Var3.getLeft()) {
                                    if (left <= i1Var3.getWidth() + i1Var3.getLeft() && top >= i1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            x3Var.J4(x3Var.x3);
                        }
                    }
                }
                break;
            case 3:
                x3 x3Var2 = this.b;
                k3 k3Var = x3Var2.n3;
                if (k3Var != null && k3Var.y()) {
                    for (int i11 = 0; i11 < x3Var2.getChildCount(); i11++) {
                        View childAt = x3Var2.getChildAt(i11);
                        if ((childAt instanceof e6) || (childAt instanceof p5) || (childAt instanceof m0) || (childAt instanceof u0)) {
                            childAt.invalidate();
                        }
                    }
                    k3Var.x();
                    break;
                }
                break;
            case 4:
                this.b.o3(true);
                break;
            default:
                this.b.a3();
                break;
        }
    }
}
