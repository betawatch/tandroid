package ki;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
    
        if (ki.c6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                w3 w3Var = this.b;
                if (w3Var.v3 != null && !w3Var.l3.x()) {
                    if (w3Var.U4(w3Var.v3, w3Var.t3, w3Var.u3)) {
                        w3Var.y3 = true;
                        break;
                    } else {
                        int left = (int) ((w3Var.t3 - w3Var.v3.getLeft()) - w3Var.getLeft());
                        int top = (int) ((w3Var.u3 - w3Var.v3.getTop()) - w3Var.getTop());
                        View view = w3Var.v3;
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
                            w3Var.y3 = true;
                            break;
                        }
                        View view2 = w3Var.v3;
                        if (view2 instanceof o5) {
                            o5 o5Var = (o5) view2;
                            if (w3Var.k3(o5Var, left, top)) {
                                try {
                                    o5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                w3Var.y3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = o5Var.m(left, top);
                                if (m10 != null) {
                                    i80 i80Var = w3Var.h4;
                                    if (i80Var != null) {
                                        w3Var.h4 = null;
                                        i80Var.u();
                                    }
                                    w3Var.h2(o5Var);
                                    w3Var.B0();
                                    w3Var.requestDisallowInterceptTouchEvent(true);
                                    w3Var.z3 = true;
                                    w3Var.B3 = m10;
                                    w3Var.C3 = m10;
                                    o5Var.w(m10, m10);
                                    try {
                                        o5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    w3Var.y3 = true;
                                    break;
                                } else {
                                    w3Var.K4(w3Var.v3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof c6) {
                            c6 c6Var = (c6) view2;
                            h1 h1Var = c6Var.h;
                            h1 h1Var2 = c6Var.f;
                            LinearLayout linearLayout = c6Var.b;
                            if (!c6.m(h1Var2, h1Var2.getLeft() + linearLayout.getLeft(), h1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (h1Var.getVisibility() == 0) {
                                    break;
                                }
                                w3Var.K4(w3Var.v3);
                                break;
                            }
                            w3Var.y3 = true;
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
                            w3Var.K4(w3Var.v3);
                        }
                    }
                }
                break;
            case 3:
                w3 w3Var2 = this.b;
                j3 j3Var = w3Var2.l3;
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
                this.b.p3(true);
                break;
            default:
                this.b.b3();
                break;
        }
    }
}
