// default package

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class b82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch9 b;

    public /* synthetic */ b82(ch9 ch9Var, byte b) {
        this.a = b;
        this.b = ch9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016c, code lost:
    
        if (r3 <= (r1.getHeight() + r1.getTop())) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
    
        if (xk9.j(r1, r1.getLeft(), r1.getTop(), r0, r3) == false) goto L81;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                ch9Var.y2();
                break;
            case 1:
                ch9Var.p3();
                break;
            case 2:
                if (ch9Var.F3 != null && !ch9Var.v3.w()) {
                    if (ch9Var.W4(ch9Var.F3, ch9Var.D3, ch9Var.E3)) {
                        ch9Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((ch9Var.D3 - ch9Var.F3.getLeft()) - ch9Var.getLeft());
                        int top = (int) ((ch9Var.E3 - ch9Var.F3.getTop()) - ch9Var.getTop());
                        View view = ch9Var.F3;
                        if (view instanceof pd9) {
                            pd9 pd9Var = (pd9) view;
                            pd9Var.getLocationOnScreen(new int[2]);
                            float f = r7[0] + left;
                            float f2 = r7[1] + top;
                            if (!pd9.g(pd9Var.x, f, f2) && !pd9.g(pd9Var.y, f, f2)) {
                                ArrayList arrayList = pd9Var.E;
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    if (pd9.g((md9) obj, f, f2)) {
                                    }
                                }
                            }
                            ch9Var.I3 = true;
                            break;
                        }
                        View view2 = ch9Var.F3;
                        if (view2 instanceof kk9) {
                            kk9 kk9Var = (kk9) view2;
                            if (ch9Var.f3(kk9Var, left, top)) {
                                try {
                                    kk9Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                ch9Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell o = kk9Var.o(left, top);
                                if (o != null) {
                                    bu5 bu5Var = ch9Var.r4;
                                    if (bu5Var != null) {
                                        ch9Var.r4 = null;
                                        bu5Var.u();
                                    }
                                    ch9Var.b2(kk9Var);
                                    ch9Var.D0();
                                    ch9Var.requestDisallowInterceptTouchEvent(true);
                                    ch9Var.J3 = true;
                                    ch9Var.L3 = o;
                                    ch9Var.M3 = o;
                                    kk9Var.y(o, o);
                                    try {
                                        kk9Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    ch9Var.I3 = true;
                                    break;
                                } else {
                                    ch9Var.M4(ch9Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof xk9) {
                            xk9 xk9Var = (xk9) view2;
                            ne9 ne9Var = xk9Var.h;
                            ne9 ne9Var2 = xk9Var.f;
                            LinearLayout linearLayout = xk9Var.b;
                            if (!xk9.j(ne9Var2, ne9Var2.getLeft() + linearLayout.getLeft(), ne9Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (ne9Var.getVisibility() == 0) {
                                    break;
                                }
                                ch9Var.M4(ch9Var.F3);
                                break;
                            }
                            ch9Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof be9) {
                                ne9 ne9Var3 = ((be9) view2).d;
                                if (ne9Var3.length() == 0 && left >= ne9Var3.getLeft()) {
                                    if (left <= ne9Var3.getWidth() + ne9Var3.getLeft() && top >= ne9Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            ch9Var.M4(ch9Var.F3);
                        }
                    }
                }
                break;
            case 3:
                qg9 qg9Var = ch9Var.v3;
                if (qg9Var != null && qg9Var.w()) {
                    for (int i2 = 0; i2 < ch9Var.getChildCount(); i2++) {
                        View childAt = ch9Var.getChildAt(i2);
                        if ((childAt instanceof xk9) || (childAt instanceof kk9) || (childAt instanceof td9) || (childAt instanceof be9)) {
                            childAt.invalidate();
                        }
                    }
                    qg9Var.v();
                    break;
                }
                break;
            case 4:
                ch9Var.k3(true);
                break;
            default:
                ch9Var.W2();
                break;
        }
    }
}
