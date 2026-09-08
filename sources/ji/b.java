package ji;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    
        if (ji.g6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B2();
                break;
            case 1:
                this.b.s3();
                break;
            case 2:
                v3 v3Var = this.b;
                if (v3Var.x3 != null && !v3Var.n3.y()) {
                    if (v3Var.S4(v3Var.x3, v3Var.v3, v3Var.w3)) {
                        v3Var.A3 = true;
                        break;
                    } else {
                        int left = (int) ((v3Var.v3 - v3Var.x3.getLeft()) - v3Var.getLeft());
                        int top = (int) ((v3Var.w3 - v3Var.x3.getTop()) - v3Var.getTop());
                        View view = v3Var.x3;
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
                            v3Var.A3 = true;
                            break;
                        }
                        View view2 = v3Var.x3;
                        if (view2 instanceof s5) {
                            s5 s5Var = (s5) view2;
                            if (v3Var.i3(s5Var, left, top)) {
                                try {
                                    s5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                v3Var.A3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = s5Var.m(left, top);
                                if (m10 != null) {
                                    n70 n70Var = v3Var.j4;
                                    if (n70Var != null) {
                                        v3Var.j4 = null;
                                        n70Var.u();
                                    }
                                    v3Var.f2(s5Var);
                                    v3Var.B0();
                                    v3Var.requestDisallowInterceptTouchEvent(true);
                                    v3Var.B3 = true;
                                    v3Var.D3 = m10;
                                    v3Var.E3 = m10;
                                    s5Var.w(m10, m10);
                                    try {
                                        s5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    v3Var.A3 = true;
                                    break;
                                } else {
                                    v3Var.I4(v3Var.x3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof g6) {
                            g6 g6Var = (g6) view2;
                            h1 h1Var = g6Var.h;
                            h1 h1Var2 = g6Var.f;
                            LinearLayout linearLayout = g6Var.b;
                            if (!g6.m(h1Var2, h1Var2.getLeft() + linearLayout.getLeft(), h1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (h1Var.getVisibility() == 0) {
                                    break;
                                }
                                v3Var.I4(v3Var.x3);
                                break;
                            }
                            v3Var.A3 = true;
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
                            v3Var.I4(v3Var.x3);
                        }
                    }
                }
                break;
            case 3:
                v3 v3Var2 = this.b;
                i3 i3Var = v3Var2.n3;
                if (i3Var != null && i3Var.y()) {
                    for (int i11 = 0; i11 < v3Var2.getChildCount(); i11++) {
                        View childAt = v3Var2.getChildAt(i11);
                        if ((childAt instanceof g6) || (childAt instanceof s5) || (childAt instanceof l0) || (childAt instanceof t0)) {
                            childAt.invalidate();
                        }
                    }
                    i3Var.x();
                    break;
                }
                break;
            case 4:
                this.b.n3(true);
                break;
            default:
                this.b.Z2();
                break;
        }
    }
}
