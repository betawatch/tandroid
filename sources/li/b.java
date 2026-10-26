package li;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ b(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (li.d6.l(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.I2();
                break;
            case 1:
                this.b.z3();
                break;
            case 2:
                v3 v3Var = this.b;
                if (v3Var.F3 != null && !v3Var.v3.x()) {
                    if (v3Var.Z4(v3Var.F3, v3Var.D3, v3Var.E3)) {
                        v3Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((v3Var.D3 - v3Var.F3.getLeft()) - v3Var.getLeft());
                        int top = (int) ((v3Var.E3 - v3Var.F3.getTop()) - v3Var.getTop());
                        View view = v3Var.F3;
                        if (view instanceof f0) {
                            f0 f0Var = (f0) view;
                            f0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!f0.g(f0Var.w, f7, f10) && !f0.g(f0Var.x, f7, f10)) {
                                ArrayList arrayList = f0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (f0.g((c0) obj, f7, f10)) {
                                    }
                                }
                            }
                            v3Var.I3 = true;
                            break;
                        }
                        View view2 = v3Var.F3;
                        if (view2 instanceof p5) {
                            p5 p5Var = (p5) view2;
                            if (v3Var.p3(p5Var, left, top)) {
                                try {
                                    p5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                v3Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell l4 = p5Var.l(left, top);
                                if (l4 != null) {
                                    k80 k80Var = v3Var.r4;
                                    if (k80Var != null) {
                                        v3Var.r4 = null;
                                        k80Var.u();
                                    }
                                    v3Var.m2(p5Var);
                                    v3Var.C0();
                                    v3Var.requestDisallowInterceptTouchEvent(true);
                                    v3Var.J3 = true;
                                    v3Var.L3 = l4;
                                    v3Var.M3 = l4;
                                    p5Var.v(l4, l4);
                                    try {
                                        p5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    v3Var.I3 = true;
                                    break;
                                } else {
                                    v3Var.P4(v3Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof d6) {
                            d6 d6Var = (d6) view2;
                            g1 g1Var = d6Var.h;
                            g1 g1Var2 = d6Var.f;
                            LinearLayout linearLayout = d6Var.b;
                            if (!d6.l(g1Var2, g1Var2.getLeft() + linearLayout.getLeft(), g1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (g1Var.getVisibility() == 0) {
                                    break;
                                }
                                v3Var.P4(v3Var.F3);
                                break;
                            }
                            v3Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof s0) {
                                g1 g1Var3 = ((s0) view2).d;
                                if (g1Var3.length() == 0 && left >= g1Var3.getLeft()) {
                                    if (left <= g1Var3.getWidth() + g1Var3.getLeft() && top >= g1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            v3Var.P4(v3Var.F3);
                        }
                    }
                }
                break;
            case 3:
                v3 v3Var2 = this.b;
                j3 j3Var = v3Var2.v3;
                if (j3Var != null && j3Var.x()) {
                    for (int i11 = 0; i11 < v3Var2.getChildCount(); i11++) {
                        View childAt = v3Var2.getChildAt(i11);
                        if ((childAt instanceof d6) || (childAt instanceof p5) || (childAt instanceof k0) || (childAt instanceof s0)) {
                            childAt.invalidate();
                        }
                    }
                    j3Var.w();
                    break;
                }
                break;
            case 4:
                this.b.u3(true);
                break;
            default:
                this.b.g3();
                break;
        }
    }
}
