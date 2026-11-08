package li;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ b(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (li.a6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.F2();
                break;
            case 1:
                this.b.w3();
                break;
            case 2:
                t3 t3Var = this.b;
                if (t3Var.E3 != null && !t3Var.u3.x()) {
                    if (t3Var.W4(t3Var.E3, t3Var.C3, t3Var.D3)) {
                        t3Var.H3 = true;
                        break;
                    } else {
                        int left = (int) ((t3Var.C3 - t3Var.E3.getLeft()) - t3Var.getLeft());
                        int top = (int) ((t3Var.D3 - t3Var.E3.getTop()) - t3Var.getTop());
                        View view = t3Var.E3;
                        if (view instanceof f0) {
                            f0 f0Var = (f0) view;
                            f0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!f0.g(f0Var.x, f10, f11) && !f0.g(f0Var.y, f10, f11)) {
                                ArrayList arrayList = f0Var.D;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    if (f0.g((c0) obj, f10, f11)) {
                                    }
                                }
                            }
                            t3Var.H3 = true;
                            break;
                        }
                        View view2 = t3Var.E3;
                        if (view2 instanceof m5) {
                            m5 m5Var = (m5) view2;
                            if (t3Var.m3(m5Var, left, top)) {
                                try {
                                    m5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                t3Var.H3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell n10 = m5Var.n(left, top);
                                if (n10 != null) {
                                    k60 k60Var = t3Var.q4;
                                    if (k60Var != null) {
                                        t3Var.q4 = null;
                                        k60Var.u();
                                    }
                                    t3Var.j2(m5Var);
                                    t3Var.C0();
                                    t3Var.requestDisallowInterceptTouchEvent(true);
                                    t3Var.I3 = true;
                                    t3Var.K3 = n10;
                                    t3Var.L3 = n10;
                                    m5Var.y(n10, n10);
                                    try {
                                        m5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    t3Var.H3 = true;
                                    break;
                                } else {
                                    t3Var.M4(t3Var.E3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof a6) {
                            a6 a6Var = (a6) view2;
                            g1 g1Var = a6Var.h;
                            g1 g1Var2 = a6Var.f;
                            LinearLayout linearLayout = a6Var.b;
                            if (!a6.m(g1Var2, g1Var2.getLeft() + linearLayout.getLeft(), g1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (g1Var.getVisibility() == 0) {
                                    break;
                                }
                                t3Var.M4(t3Var.E3);
                                break;
                            }
                            t3Var.H3 = true;
                            break;
                        } else {
                            if (view2 instanceof r0) {
                                g1 g1Var3 = ((r0) view2).d;
                                if (g1Var3.length() == 0 && left >= g1Var3.getLeft()) {
                                    if (left <= g1Var3.getWidth() + g1Var3.getLeft() && top >= g1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            t3Var.M4(t3Var.E3);
                        }
                    }
                }
                break;
            case 3:
                t3 t3Var2 = this.b;
                g3 g3Var = t3Var2.u3;
                if (g3Var != null && g3Var.x()) {
                    for (int i10 = 0; i10 < t3Var2.getChildCount(); i10++) {
                        View childAt = t3Var2.getChildAt(i10);
                        if ((childAt instanceof a6) || (childAt instanceof m5) || (childAt instanceof k0) || (childAt instanceof r0)) {
                            childAt.invalidate();
                        }
                    }
                    g3Var.w();
                    break;
                }
                break;
            case 4:
                this.b.r3(true);
                break;
            default:
                this.b.d3();
                break;
        }
    }
}
