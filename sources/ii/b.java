package ii;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
    
        if (ii.d6.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                if (w3Var.x3 != null && !w3Var.n3.y()) {
                    if (w3Var.U4(w3Var.x3, w3Var.v3, w3Var.w3)) {
                        w3Var.A3 = true;
                        break;
                    } else {
                        int left = (int) ((w3Var.v3 - w3Var.x3.getLeft()) - w3Var.getLeft());
                        int top = (int) ((w3Var.w3 - w3Var.x3.getTop()) - w3Var.getTop());
                        View view = w3Var.x3;
                        if (view instanceof h0) {
                            h0 h0Var = (h0) view;
                            h0Var.getLocationOnScreen(new int[2]);
                            float f7 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!h0.h(h0Var.w, f7, f10) && !h0.h(h0Var.x, f7, f10)) {
                                ArrayList arrayList = h0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (h0.h((e0) obj, f7, f10)) {
                                    }
                                }
                            }
                            w3Var.A3 = true;
                            break;
                        }
                        View view2 = w3Var.x3;
                        if (view2 instanceof o5) {
                            o5 o5Var = (o5) view2;
                            if (w3Var.k3(o5Var, left, top)) {
                                try {
                                    o5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                w3Var.A3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = o5Var.m(left, top);
                                if (m10 != null) {
                                    w70 w70Var = w3Var.j4;
                                    if (w70Var != null) {
                                        w3Var.j4 = null;
                                        w70Var.u();
                                    }
                                    w3Var.h2(o5Var);
                                    w3Var.C0();
                                    w3Var.requestDisallowInterceptTouchEvent(true);
                                    w3Var.B3 = true;
                                    w3Var.D3 = m10;
                                    w3Var.E3 = m10;
                                    o5Var.w(m10, m10);
                                    try {
                                        o5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    w3Var.A3 = true;
                                    break;
                                } else {
                                    w3Var.K4(w3Var.x3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof d6) {
                            d6 d6Var = (d6) view2;
                            i1 i1Var = d6Var.h;
                            i1 i1Var2 = d6Var.f;
                            LinearLayout linearLayout = d6Var.b;
                            if (!d6.m(i1Var2, i1Var2.getLeft() + linearLayout.getLeft(), i1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (i1Var.getVisibility() == 0) {
                                    break;
                                }
                                w3Var.K4(w3Var.x3);
                                break;
                            }
                            w3Var.A3 = true;
                            break;
                        } else {
                            if (view2 instanceof u0) {
                                i1 i1Var3 = ((u0) view2).d;
                                if (i1Var3.length() == 0 && left >= i1Var3.getLeft()) {
                                    if (left <= i1Var3.getWidth() + i1Var3.getLeft() && top >= i1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            w3Var.K4(w3Var.x3);
                        }
                    }
                }
                break;
            case 3:
                w3 w3Var2 = this.b;
                j3 j3Var = w3Var2.n3;
                if (j3Var != null && j3Var.y()) {
                    for (int i11 = 0; i11 < w3Var2.getChildCount(); i11++) {
                        View childAt = w3Var2.getChildAt(i11);
                        if ((childAt instanceof d6) || (childAt instanceof o5) || (childAt instanceof m0) || (childAt instanceof u0)) {
                            childAt.invalidate();
                        }
                    }
                    j3Var.x();
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
