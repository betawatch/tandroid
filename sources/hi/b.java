package hi;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ b(z3 z3Var, int i10) {
        this.a = i10;
        this.b = z3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (hi.g6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                z3 z3Var = this.b;
                if (z3Var.x3 != null && !z3Var.n3.y()) {
                    if (z3Var.S4(z3Var.x3, z3Var.v3, z3Var.w3)) {
                        z3Var.A3 = true;
                        break;
                    } else {
                        int left = (int) ((z3Var.v3 - z3Var.x3.getLeft()) - z3Var.getLeft());
                        int top = (int) ((z3Var.w3 - z3Var.x3.getTop()) - z3Var.getTop());
                        View view = z3Var.x3;
                        if (view instanceof i0) {
                            i0 i0Var = (i0) view;
                            i0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!i0.h(i0Var.w, f7, f10) && !i0.h(i0Var.x, f7, f10)) {
                                ArrayList arrayList = i0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (i0.h((f0) obj, f7, f10)) {
                                    }
                                }
                            }
                            z3Var.A3 = true;
                            break;
                        }
                        View view2 = z3Var.x3;
                        if (view2 instanceof r5) {
                            r5 r5Var = (r5) view2;
                            if (z3Var.i3(r5Var, left, top)) {
                                try {
                                    r5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                z3Var.A3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = r5Var.m(left, top);
                                if (m10 != null) {
                                    w70 w70Var = z3Var.j4;
                                    if (w70Var != null) {
                                        z3Var.j4 = null;
                                        w70Var.u();
                                    }
                                    z3Var.f2(r5Var);
                                    z3Var.B0();
                                    z3Var.requestDisallowInterceptTouchEvent(true);
                                    z3Var.B3 = true;
                                    z3Var.D3 = m10;
                                    z3Var.E3 = m10;
                                    r5Var.w(m10, m10);
                                    try {
                                        r5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    z3Var.A3 = true;
                                    break;
                                } else {
                                    z3Var.I4(z3Var.x3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof g6) {
                            g6 g6Var = (g6) view2;
                            k1 k1Var = g6Var.h;
                            k1 k1Var2 = g6Var.f;
                            LinearLayout linearLayout = g6Var.b;
                            if (!g6.m(k1Var2, k1Var2.getLeft() + linearLayout.getLeft(), k1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (k1Var.getVisibility() == 0) {
                                    break;
                                }
                                z3Var.I4(z3Var.x3);
                                break;
                            }
                            z3Var.A3 = true;
                            break;
                        } else {
                            if (view2 instanceof w0) {
                                k1 k1Var3 = ((w0) view2).d;
                                if (k1Var3.length() == 0 && left >= k1Var3.getLeft()) {
                                    if (left <= k1Var3.getWidth() + k1Var3.getLeft() && top >= k1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            z3Var.I4(z3Var.x3);
                        }
                    }
                }
                break;
            case 3:
                z3 z3Var2 = this.b;
                m3 m3Var = z3Var2.n3;
                if (m3Var != null && m3Var.y()) {
                    for (int i11 = 0; i11 < z3Var2.getChildCount(); i11++) {
                        View childAt = z3Var2.getChildAt(i11);
                        if ((childAt instanceof g6) || (childAt instanceof r5) || (childAt instanceof n0) || (childAt instanceof w0)) {
                            childAt.invalidate();
                        }
                    }
                    m3Var.x();
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
