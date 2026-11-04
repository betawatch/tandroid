package mi;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ b(t3 t3Var, int i3) {
        this.a = i3;
        this.b = t3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (mi.b6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                if (t3Var.F3 != null && !t3Var.v3.x()) {
                    if (t3Var.W4(t3Var.F3, t3Var.D3, t3Var.E3)) {
                        t3Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((t3Var.D3 - t3Var.F3.getLeft()) - t3Var.getLeft());
                        int top = (int) ((t3Var.E3 - t3Var.F3.getTop()) - t3Var.getTop());
                        View view = t3Var.F3;
                        if (view instanceof f0) {
                            f0 f0Var = (f0) view;
                            f0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!f0.g(f0Var.x, f10, f11) && !f0.g(f0Var.y, f10, f11)) {
                                ArrayList arrayList = f0Var.E;
                                int size = arrayList.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    Object obj = arrayList.get(i3);
                                    i3++;
                                    if (f0.g((c0) obj, f10, f11)) {
                                    }
                                }
                            }
                            t3Var.I3 = true;
                            break;
                        }
                        View view2 = t3Var.F3;
                        if (view2 instanceof n5) {
                            n5 n5Var = (n5) view2;
                            if (t3Var.m3(n5Var, left, top)) {
                                try {
                                    n5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                t3Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell n4 = n5Var.n(left, top);
                                if (n4 != null) {
                                    f60 f60Var = t3Var.r4;
                                    if (f60Var != null) {
                                        t3Var.r4 = null;
                                        f60Var.u();
                                    }
                                    t3Var.j2(n5Var);
                                    t3Var.C0();
                                    t3Var.requestDisallowInterceptTouchEvent(true);
                                    t3Var.J3 = true;
                                    t3Var.L3 = n4;
                                    t3Var.M3 = n4;
                                    n5Var.y(n4, n4);
                                    try {
                                        n5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    t3Var.I3 = true;
                                    break;
                                } else {
                                    t3Var.M4(t3Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof b6) {
                            b6 b6Var = (b6) view2;
                            h1 h1Var = b6Var.h;
                            h1 h1Var2 = b6Var.f;
                            LinearLayout linearLayout = b6Var.b;
                            if (!b6.m(h1Var2, h1Var2.getLeft() + linearLayout.getLeft(), h1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (h1Var.getVisibility() == 0) {
                                    break;
                                }
                                t3Var.M4(t3Var.F3);
                                break;
                            }
                            t3Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof s0) {
                                h1 h1Var3 = ((s0) view2).d;
                                if (h1Var3.length() == 0 && left >= h1Var3.getLeft()) {
                                    if (left <= h1Var3.getWidth() + h1Var3.getLeft() && top >= h1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            t3Var.M4(t3Var.F3);
                        }
                    }
                }
                break;
            case 3:
                t3 t3Var2 = this.b;
                h3 h3Var = t3Var2.v3;
                if (h3Var != null && h3Var.x()) {
                    for (int i10 = 0; i10 < t3Var2.getChildCount(); i10++) {
                        View childAt = t3Var2.getChildAt(i10);
                        if ((childAt instanceof b6) || (childAt instanceof n5) || (childAt instanceof l0) || (childAt instanceof s0)) {
                            childAt.invalidate();
                        }
                    }
                    h3Var.w();
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
