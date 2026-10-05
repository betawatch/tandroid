package ii;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
    
        if (ii.f6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D2();
                break;
            case 1:
                this.b.u3();
                break;
            case 2:
                x3 x3Var = this.b;
                if (x3Var.E3 != null && !x3Var.u3.y()) {
                    if (x3Var.U4(x3Var.E3, x3Var.C3, x3Var.D3)) {
                        x3Var.H3 = true;
                        break;
                    } else {
                        int left = (int) ((x3Var.C3 - x3Var.E3.getLeft()) - x3Var.getLeft());
                        int top = (int) ((x3Var.D3 - x3Var.E3.getTop()) - x3Var.getTop());
                        View view = x3Var.E3;
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
                            x3Var.H3 = true;
                            break;
                        }
                        View view2 = x3Var.E3;
                        if (view2 instanceof q5) {
                            q5 q5Var = (q5) view2;
                            if (x3Var.k3(q5Var, left, top)) {
                                try {
                                    q5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                x3Var.H3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = q5Var.m(left, top);
                                if (m10 != null) {
                                    b80 b80Var = x3Var.q4;
                                    if (b80Var != null) {
                                        x3Var.q4 = null;
                                        b80Var.u();
                                    }
                                    x3Var.h2(q5Var);
                                    x3Var.C0();
                                    x3Var.requestDisallowInterceptTouchEvent(true);
                                    x3Var.I3 = true;
                                    x3Var.K3 = m10;
                                    x3Var.L3 = m10;
                                    q5Var.w(m10, m10);
                                    try {
                                        q5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    x3Var.H3 = true;
                                    break;
                                } else {
                                    x3Var.K4(x3Var.E3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof f6) {
                            f6 f6Var = (f6) view2;
                            i1 i1Var = f6Var.h;
                            i1 i1Var2 = f6Var.f;
                            LinearLayout linearLayout = f6Var.b;
                            if (!f6.m(i1Var2, i1Var2.getLeft() + linearLayout.getLeft(), i1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (i1Var.getVisibility() == 0) {
                                    break;
                                }
                                x3Var.K4(x3Var.E3);
                                break;
                            }
                            x3Var.H3 = true;
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
                            x3Var.K4(x3Var.E3);
                        }
                    }
                }
                break;
            case 3:
                x3 x3Var2 = this.b;
                k3 k3Var = x3Var2.u3;
                if (k3Var != null && k3Var.y()) {
                    for (int i11 = 0; i11 < x3Var2.getChildCount(); i11++) {
                        View childAt = x3Var2.getChildAt(i11);
                        if ((childAt instanceof f6) || (childAt instanceof q5) || (childAt instanceof m0) || (childAt instanceof u0)) {
                            childAt.invalidate();
                        }
                    }
                    k3Var.x();
                    break;
                }
                break;
            case 4:
                this.b.p3(true);
                break;
            default:
                this.b.b3();
                break;
        }
    }
}
