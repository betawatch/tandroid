package oi;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ b(s3 s3Var, int i7) {
        this.a = i7;
        this.b = s3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (oi.z5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                s3 s3Var = this.b;
                if (s3Var.F3 != null && !s3Var.v3.x()) {
                    if (s3Var.W4(s3Var.F3, s3Var.D3, s3Var.E3)) {
                        s3Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((s3Var.D3 - s3Var.F3.getLeft()) - s3Var.getLeft());
                        int top = (int) ((s3Var.E3 - s3Var.F3.getTop()) - s3Var.getTop());
                        View view = s3Var.F3;
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
                            s3Var.I3 = true;
                            break;
                        }
                        View view2 = s3Var.F3;
                        if (view2 instanceof l5) {
                            l5 l5Var = (l5) view2;
                            if (s3Var.m3(l5Var, left, top)) {
                                try {
                                    l5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                s3Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell n10 = l5Var.n(left, top);
                                if (n10 != null) {
                                    y60 y60Var = s3Var.r4;
                                    if (y60Var != null) {
                                        s3Var.r4 = null;
                                        y60Var.v();
                                    }
                                    s3Var.j2(l5Var);
                                    s3Var.C0();
                                    s3Var.requestDisallowInterceptTouchEvent(true);
                                    s3Var.J3 = true;
                                    s3Var.L3 = n10;
                                    s3Var.M3 = n10;
                                    l5Var.y(n10, n10);
                                    try {
                                        l5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    s3Var.I3 = true;
                                    break;
                                } else {
                                    s3Var.M4(s3Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof z5) {
                            z5 z5Var = (z5) view2;
                            e1 e1Var = z5Var.h;
                            e1 e1Var2 = z5Var.f;
                            LinearLayout linearLayout = z5Var.b;
                            if (!z5.m(e1Var2, e1Var2.getLeft() + linearLayout.getLeft(), e1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (e1Var.getVisibility() == 0) {
                                    break;
                                }
                                s3Var.M4(s3Var.F3);
                                break;
                            }
                            s3Var.I3 = true;
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
                            s3Var.M4(s3Var.F3);
                        }
                    }
                }
                break;
            case 3:
                s3 s3Var2 = this.b;
                g3 g3Var = s3Var2.v3;
                if (g3Var != null && g3Var.x()) {
                    for (int i10 = 0; i10 < s3Var2.getChildCount(); i10++) {
                        View childAt = s3Var2.getChildAt(i10);
                        if ((childAt instanceof z5) || (childAt instanceof l5) || (childAt instanceof i0) || (childAt instanceof p0)) {
                            childAt.invalidate();
                        }
                    }
                    g3Var.w();
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
