package ji;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    
        if (ji.i6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                if (x3Var.v3 != null && !x3Var.l3.x()) {
                    if (x3Var.U4(x3Var.v3, x3Var.t3, x3Var.u3)) {
                        x3Var.y3 = true;
                        break;
                    } else {
                        int left = (int) ((x3Var.t3 - x3Var.v3.getLeft()) - x3Var.getLeft());
                        int top = (int) ((x3Var.u3 - x3Var.v3.getTop()) - x3Var.getTop());
                        View view = x3Var.v3;
                        if (view instanceof g0) {
                            g0 g0Var = (g0) view;
                            g0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!g0.h(g0Var.w, f7, f10) && !g0.h(g0Var.x, f7, f10)) {
                                ArrayList arrayList = g0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (g0.h((d0) obj, f7, f10)) {
                                    }
                                }
                            }
                            x3Var.y3 = true;
                            break;
                        }
                        View view2 = x3Var.v3;
                        if (view2 instanceof u5) {
                            u5 u5Var = (u5) view2;
                            if (x3Var.k3(u5Var, left, top)) {
                                try {
                                    u5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                x3Var.y3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = u5Var.m(left, top);
                                if (m10 != null) {
                                    l80 l80Var = x3Var.h4;
                                    if (l80Var != null) {
                                        x3Var.h4 = null;
                                        l80Var.u();
                                    }
                                    x3Var.h2(u5Var);
                                    x3Var.B0();
                                    x3Var.requestDisallowInterceptTouchEvent(true);
                                    x3Var.z3 = true;
                                    x3Var.B3 = m10;
                                    x3Var.C3 = m10;
                                    u5Var.w(m10, m10);
                                    try {
                                        u5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    x3Var.y3 = true;
                                    break;
                                } else {
                                    x3Var.K4(x3Var.v3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof i6) {
                            i6 i6Var = (i6) view2;
                            h1 h1Var = i6Var.h;
                            h1 h1Var2 = i6Var.f;
                            LinearLayout linearLayout = i6Var.b;
                            if (!i6.m(h1Var2, h1Var2.getLeft() + linearLayout.getLeft(), h1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (h1Var.getVisibility() == 0) {
                                    break;
                                }
                                x3Var.K4(x3Var.v3);
                                break;
                            }
                            x3Var.y3 = true;
                            break;
                        } else {
                            if (view2 instanceof t0) {
                                h1 h1Var3 = ((t0) view2).d;
                                if (h1Var3.length() == 0 && left >= h1Var3.getLeft()) {
                                    if (left <= h1Var3.getWidth() + h1Var3.getLeft() && top >= h1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            x3Var.K4(x3Var.v3);
                        }
                    }
                }
                break;
            case 3:
                x3 x3Var2 = this.b;
                k3 k3Var = x3Var2.l3;
                if (k3Var != null && k3Var.x()) {
                    for (int i11 = 0; i11 < x3Var2.getChildCount(); i11++) {
                        View childAt = x3Var2.getChildAt(i11);
                        if ((childAt instanceof i6) || (childAt instanceof u5) || (childAt instanceof l0) || (childAt instanceof t0)) {
                            childAt.invalidate();
                        }
                    }
                    k3Var.w();
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
