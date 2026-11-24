// default package

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gk1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hk1 hk1Var = (hk1) obj;
                hk1Var.c.setPivotX(r3.getMeasuredWidth() * 0.7f);
                hk1Var.b.setPivotX(r2.getMeasuredWidth() * 0.7f);
                break;
            case 1:
                view.post((b87) obj);
                break;
            case 2:
                xu4 xu4Var = (xu4) obj;
                if (i4 - i2 != i8 - i6) {
                    gl.c3(new nu4(xu4Var, (byte) 2));
                    break;
                }
                break;
            case 3:
                cs5 cs5Var = (cs5) obj;
                if (cs5Var.E()) {
                    cs5Var.P();
                    break;
                }
                break;
            case 4:
                ((mv5) obj).d();
                break;
            case 5:
                ((ak9) obj).a0();
                break;
            case 6:
                ((d8a) obj).o0();
                break;
            case 7:
                xza xzaVar = (xza) obj;
                px8 px8Var = xzaVar.h;
                if (px8Var != null && px8Var.getLayout() != null) {
                    xzaVar.G = px8Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
            case 8:
                koc kocVar = (koc) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    Iterator it = kocVar.f.values().iterator();
                    while (it.hasNext()) {
                        ((joc) it.next()).K = false;
                    }
                    kocVar.f0();
                    break;
                }
                break;
            default:
                noc nocVar = (noc) obj;
                if (i4 - i2 < i8 - i6) {
                    ArrayList arrayList = nocVar.w;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        lqc lqcVar = (lqc) obj2;
                        if (lqcVar.hasFocus()) {
                            lqcVar.requestRectangleOnScreen(new Rect(0, 0, lqcVar.getWidth(), lqcVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
