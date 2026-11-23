package oi;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    
        if (oi.a6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                        if (view instanceof e0) {
                            e0 e0Var = (e0) view;
                            e0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!e0.g(e0Var.x, f10, f11) && !e0.g(e0Var.y, f10, f11)) {
                                ArrayList arrayList = e0Var.E;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    if (e0.g((b0) obj, f10, f11)) {
                                    }
                                }
                            }
                            t3Var.I3 = true;
                            break;
                        }
                        View view2 = t3Var.F3;
                        if (view2 instanceof m5) {
                            m5 m5Var = (m5) view2;
                            if (t3Var.m3(m5Var, left, top)) {
                                try {
                                    m5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                t3Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell n10 = m5Var.n(left, top);
                                if (n10 != null) {
                                    a70 a70Var = t3Var.r4;
                                    if (a70Var != null) {
                                        t3Var.r4 = null;
                                        a70Var.v();
                                    }
                                    t3Var.j2(m5Var);
                                    t3Var.C0();
                                    t3Var.requestDisallowInterceptTouchEvent(true);
                                    t3Var.J3 = true;
                                    t3Var.L3 = n10;
                                    t3Var.M3 = n10;
                                    m5Var.y(n10, n10);
                                    try {
                                        m5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    t3Var.I3 = true;
                                    break;
                                } else {
                                    t3Var.M4(t3Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof a6) {
                            a6 a6Var = (a6) view2;
                            f1 f1Var = a6Var.h;
                            f1 f1Var2 = a6Var.f;
                            LinearLayout linearLayout = a6Var.b;
                            if (!a6.m(f1Var2, f1Var2.getLeft() + linearLayout.getLeft(), f1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (f1Var.getVisibility() == 0) {
                                    break;
                                }
                                t3Var.M4(t3Var.F3);
                                break;
                            }
                            t3Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof q0) {
                                f1 f1Var3 = ((q0) view2).d;
                                if (f1Var3.length() == 0 && left >= f1Var3.getLeft()) {
                                    if (left <= f1Var3.getWidth() + f1Var3.getLeft() && top >= f1Var3.getTop()) {
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
                        if ((childAt instanceof a6) || (childAt instanceof m5) || (childAt instanceof j0) || (childAt instanceof q0)) {
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
