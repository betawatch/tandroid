// default package

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class m72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi9 b;

    public /* synthetic */ m72(pi9 pi9Var, byte b) {
        this.a = b;
        this.b = pi9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016c, code lost:
    
        if (r3 <= (r1.getHeight() + r1.getTop())) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
    
        if (km9.j(r1, r1.getLeft(), r1.getTop(), r0, r3) == false) goto L81;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                pi9Var.z2();
                break;
            case 1:
                pi9Var.q3();
                break;
            case 2:
                if (pi9Var.F3 != null && !pi9Var.v3.w()) {
                    if (pi9Var.X4(pi9Var.F3, pi9Var.D3, pi9Var.E3)) {
                        pi9Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((pi9Var.D3 - pi9Var.F3.getLeft()) - pi9Var.getLeft());
                        int top = (int) ((pi9Var.E3 - pi9Var.F3.getTop()) - pi9Var.getTop());
                        View view = pi9Var.F3;
                        if (view instanceof ff9) {
                            ff9 ff9Var = (ff9) view;
                            ff9Var.getLocationOnScreen(new int[2]);
                            float f = r7[0] + left;
                            float f2 = r7[1] + top;
                            if (!ff9.g(ff9Var.x, f, f2) && !ff9.g(ff9Var.y, f, f2)) {
                                ArrayList arrayList = ff9Var.E;
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    if (ff9.g((cf9) obj, f, f2)) {
                                    }
                                }
                            }
                            pi9Var.I3 = true;
                            break;
                        }
                        View view2 = pi9Var.F3;
                        if (view2 instanceof xl9) {
                            xl9 xl9Var = (xl9) view2;
                            if (pi9Var.g3(xl9Var, left, top)) {
                                try {
                                    xl9Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                pi9Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell o = xl9Var.o(left, top);
                                if (o != null) {
                                    fu5 fu5Var = pi9Var.r4;
                                    if (fu5Var != null) {
                                        pi9Var.r4 = null;
                                        fu5Var.u();
                                    }
                                    pi9Var.c2(xl9Var);
                                    pi9Var.E0();
                                    pi9Var.requestDisallowInterceptTouchEvent(true);
                                    pi9Var.J3 = true;
                                    pi9Var.L3 = o;
                                    pi9Var.M3 = o;
                                    xl9Var.y(o, o);
                                    try {
                                        xl9Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    pi9Var.I3 = true;
                                    break;
                                } else {
                                    pi9Var.N4(pi9Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof km9) {
                            km9 km9Var = (km9) view2;
                            dg9 dg9Var = km9Var.h;
                            dg9 dg9Var2 = km9Var.f;
                            LinearLayout linearLayout = km9Var.b;
                            if (!km9.j(dg9Var2, dg9Var2.getLeft() + linearLayout.getLeft(), dg9Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (dg9Var.getVisibility() == 0) {
                                    break;
                                }
                                pi9Var.N4(pi9Var.F3);
                                break;
                            }
                            pi9Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof rf9) {
                                dg9 dg9Var3 = ((rf9) view2).d;
                                if (dg9Var3.length() == 0 && left >= dg9Var3.getLeft()) {
                                    if (left <= dg9Var3.getWidth() + dg9Var3.getLeft() && top >= dg9Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            pi9Var.N4(pi9Var.F3);
                        }
                    }
                }
                break;
            case 3:
                di9 di9Var = pi9Var.v3;
                if (di9Var != null && di9Var.w()) {
                    for (int i2 = 0; i2 < pi9Var.getChildCount(); i2++) {
                        View childAt = pi9Var.getChildAt(i2);
                        if ((childAt instanceof km9) || (childAt instanceof xl9) || (childAt instanceof jf9) || (childAt instanceof rf9)) {
                            childAt.invalidate();
                        }
                    }
                    di9Var.v();
                    break;
                }
                break;
            case 4:
                pi9Var.l3(true);
                break;
            default:
                pi9Var.X2();
                break;
        }
    }
}
