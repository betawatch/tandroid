package bi;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ b(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (bi.q6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                d4 d4Var = this.b;
                if (d4Var.E3 != null && !d4Var.u3.x()) {
                    if (d4Var.W4(d4Var.E3, d4Var.C3, d4Var.D3)) {
                        d4Var.H3 = true;
                        break;
                    } else {
                        int left = (int) ((d4Var.C3 - d4Var.E3.getLeft()) - d4Var.getLeft());
                        int top = (int) ((d4Var.D3 - d4Var.E3.getTop()) - d4Var.getTop());
                        View view = d4Var.E3;
                        if (view instanceof j0) {
                            j0 j0Var = (j0) view;
                            j0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!j0.g(j0Var.x, f7, f10) && !j0.g(j0Var.y, f7, f10)) {
                                ArrayList arrayList = j0Var.D;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (j0.g((g0) obj, f7, f10)) {
                                    }
                                }
                            }
                            d4Var.H3 = true;
                            break;
                        }
                        View view2 = d4Var.E3;
                        if (view2 instanceof z5) {
                            z5 z5Var = (z5) view2;
                            if (d4Var.m3(z5Var, left, top)) {
                                try {
                                    z5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                d4Var.H3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell o10 = z5Var.o(left, top);
                                if (o10 != null) {
                                    z60 z60Var = d4Var.q4;
                                    if (z60Var != null) {
                                        d4Var.q4 = null;
                                        z60Var.u();
                                    }
                                    d4Var.j2(z5Var);
                                    d4Var.C0();
                                    d4Var.requestDisallowInterceptTouchEvent(true);
                                    d4Var.I3 = true;
                                    d4Var.K3 = o10;
                                    d4Var.L3 = o10;
                                    z5Var.y(o10, o10);
                                    try {
                                        z5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    d4Var.H3 = true;
                                    break;
                                } else {
                                    d4Var.M4(d4Var.E3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof q6) {
                            q6 q6Var = (q6) view2;
                            n1 n1Var = q6Var.h;
                            n1 n1Var2 = q6Var.f;
                            LinearLayout linearLayout = q6Var.b;
                            if (!q6.m(n1Var2, n1Var2.getLeft() + linearLayout.getLeft(), n1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (n1Var.getVisibility() == 0) {
                                    break;
                                }
                                d4Var.M4(d4Var.E3);
                                break;
                            }
                            d4Var.H3 = true;
                            break;
                        } else {
                            if (view2 instanceof y0) {
                                n1 n1Var3 = ((y0) view2).d;
                                if (n1Var3.length() == 0 && left >= n1Var3.getLeft()) {
                                    if (left <= n1Var3.getWidth() + n1Var3.getLeft() && top >= n1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            d4Var.M4(d4Var.E3);
                        }
                    }
                }
                break;
            case 3:
                d4 d4Var2 = this.b;
                q3 q3Var = d4Var2.u3;
                if (q3Var != null && q3Var.x()) {
                    for (int i11 = 0; i11 < d4Var2.getChildCount(); i11++) {
                        View childAt = d4Var2.getChildAt(i11);
                        if ((childAt instanceof q6) || (childAt instanceof z5) || (childAt instanceof o0) || (childAt instanceof y0)) {
                            childAt.invalidate();
                        }
                    }
                    q3Var.w();
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
