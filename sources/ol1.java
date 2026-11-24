// default package

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pl1 pl1Var = (pl1) obj;
                pl1Var.c.setPivotX(r3.getMeasuredWidth() * 0.7f);
                pl1Var.b.setPivotX(r2.getMeasuredWidth() * 0.7f);
                break;
            case 1:
                view.post((da7) obj);
                break;
            case 2:
                yw4 yw4Var = (yw4) obj;
                if (i4 - i2 != i8 - i6) {
                    gm.c3(new ow4(yw4Var, (byte) 2));
                    break;
                }
                break;
            case 3:
                bu5 bu5Var = (bu5) obj;
                if (bu5Var.E()) {
                    bu5Var.P();
                    break;
                }
                break;
            case 4:
                ((mx5) obj).d();
                break;
            case 5:
                ((bm9) obj).a0();
                break;
            case 6:
                ((daa) obj).p0();
                break;
            case 7:
                y1b y1bVar = (y1b) obj;
                qz8 qz8Var = y1bVar.h;
                if (qz8Var != null && qz8Var.getLayout() != null) {
                    y1bVar.G = qz8Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
            case 8:
                mqc mqcVar = (mqc) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    Iterator it = mqcVar.f.values().iterator();
                    while (it.hasNext()) {
                        ((lqc) it.next()).K = false;
                    }
                    mqcVar.f0();
                    break;
                }
                break;
            default:
                pqc pqcVar = (pqc) obj;
                if (i4 - i2 < i8 - i6) {
                    ArrayList arrayList = pqcVar.w;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        nsc nscVar = (nsc) obj2;
                        if (nscVar.hasFocus()) {
                            nscVar.requestRectangleOnScreen(new Rect(0, 0, nscVar.getWidth(), nscVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
