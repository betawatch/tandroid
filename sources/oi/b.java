package oi;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    public /* synthetic */ b(q3 q3Var, int i7) {
        this.a = i7;
        this.b = q3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (oi.y5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                q3 q3Var = this.b;
                if (q3Var.F3 != null && !q3Var.v3.x()) {
                    if (q3Var.W4(q3Var.F3, q3Var.D3, q3Var.E3)) {
                        q3Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((q3Var.D3 - q3Var.F3.getLeft()) - q3Var.getLeft());
                        int top = (int) ((q3Var.E3 - q3Var.F3.getTop()) - q3Var.getTop());
                        View view = q3Var.F3;
                        if (view instanceof d0) {
                            d0 d0Var = (d0) view;
                            d0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!d0.g(d0Var.x, f10, f11) && !d0.g(d0Var.y, f10, f11)) {
                                ArrayList arrayList = d0Var.E;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    if (d0.g((a0) obj, f10, f11)) {
                                    }
                                }
                            }
                            q3Var.I3 = true;
                            break;
                        }
                        View view2 = q3Var.F3;
                        if (view2 instanceof k5) {
                            k5 k5Var = (k5) view2;
                            if (q3Var.m3(k5Var, left, top)) {
                                try {
                                    k5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                q3Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell n10 = k5Var.n(left, top);
                                if (n10 != null) {
                                    m60 m60Var = q3Var.r4;
                                    if (m60Var != null) {
                                        q3Var.r4 = null;
                                        m60Var.u();
                                    }
                                    q3Var.j2(k5Var);
                                    q3Var.C0();
                                    q3Var.requestDisallowInterceptTouchEvent(true);
                                    q3Var.J3 = true;
                                    q3Var.L3 = n10;
                                    q3Var.M3 = n10;
                                    k5Var.y(n10, n10);
                                    try {
                                        k5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    q3Var.I3 = true;
                                    break;
                                } else {
                                    q3Var.M4(q3Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof y5) {
                            y5 y5Var = (y5) view2;
                            e1 e1Var = y5Var.h;
                            e1 e1Var2 = y5Var.f;
                            LinearLayout linearLayout = y5Var.b;
                            if (!y5.m(e1Var2, e1Var2.getLeft() + linearLayout.getLeft(), e1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (e1Var.getVisibility() == 0) {
                                    break;
                                }
                                q3Var.M4(q3Var.F3);
                                break;
                            }
                            q3Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof p0) {
                                e1 e1Var3 = ((p0) view2).d;
                                if (e1Var3.length() == 0 && left >= e1Var3.getLeft()) {
                                    if (left <= e1Var3.getWidth() + e1Var3.getLeft() && top >= e1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            q3Var.M4(q3Var.F3);
                        }
                    }
                }
                break;
            case 3:
                q3 q3Var2 = this.b;
                e3 e3Var = q3Var2.v3;
                if (e3Var != null && e3Var.x()) {
                    for (int i10 = 0; i10 < q3Var2.getChildCount(); i10++) {
                        View childAt = q3Var2.getChildAt(i10);
                        if ((childAt instanceof y5) || (childAt instanceof k5) || (childAt instanceof i0) || (childAt instanceof p0)) {
                            childAt.invalidate();
                        }
                    }
                    e3Var.w();
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
