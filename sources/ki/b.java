package ki;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ b(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (ki.c6.l(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                w3 w3Var = this.b;
                if (w3Var.y3 != null && !w3Var.o3.x()) {
                    if (w3Var.Z4(w3Var.y3, w3Var.w3, w3Var.x3)) {
                        w3Var.B3 = true;
                        break;
                    } else {
                        int left = (int) ((w3Var.w3 - w3Var.y3.getLeft()) - w3Var.getLeft());
                        int top = (int) ((w3Var.x3 - w3Var.y3.getTop()) - w3Var.getTop());
                        View view = w3Var.y3;
                        if (view instanceof g0) {
                            g0 g0Var = (g0) view;
                            g0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!g0.g(g0Var.w, f7, f10) && !g0.g(g0Var.x, f7, f10)) {
                                ArrayList arrayList = g0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (g0.g((d0) obj, f7, f10)) {
                                    }
                                }
                            }
                            w3Var.B3 = true;
                            break;
                        }
                        View view2 = w3Var.y3;
                        if (view2 instanceof o5) {
                            o5 o5Var = (o5) view2;
                            if (w3Var.p3(o5Var, left, top)) {
                                try {
                                    o5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                w3Var.B3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell l4 = o5Var.l(left, top);
                                if (l4 != null) {
                                    j80 j80Var = w3Var.k4;
                                    if (j80Var != null) {
                                        w3Var.k4 = null;
                                        j80Var.u();
                                    }
                                    w3Var.m2(o5Var);
                                    w3Var.B0();
                                    w3Var.requestDisallowInterceptTouchEvent(true);
                                    w3Var.C3 = true;
                                    w3Var.E3 = l4;
                                    w3Var.F3 = l4;
                                    o5Var.v(l4, l4);
                                    try {
                                        o5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    w3Var.B3 = true;
                                    break;
                                } else {
                                    w3Var.P4(w3Var.y3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof c6) {
                            c6 c6Var = (c6) view2;
                            h1 h1Var = c6Var.h;
                            h1 h1Var2 = c6Var.f;
                            LinearLayout linearLayout = c6Var.b;
                            if (!c6.l(h1Var2, h1Var2.getLeft() + linearLayout.getLeft(), h1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (h1Var.getVisibility() == 0) {
                                    break;
                                }
                                w3Var.P4(w3Var.y3);
                                break;
                            }
                            w3Var.B3 = true;
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
                            w3Var.P4(w3Var.y3);
                        }
                    }
                }
                break;
            case 3:
                w3 w3Var2 = this.b;
                j3 j3Var = w3Var2.o3;
                if (j3Var != null && j3Var.x()) {
                    for (int i11 = 0; i11 < w3Var2.getChildCount(); i11++) {
                        View childAt = w3Var2.getChildAt(i11);
                        if ((childAt instanceof c6) || (childAt instanceof o5) || (childAt instanceof l0) || (childAt instanceof t0)) {
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
