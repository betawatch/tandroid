package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class i7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                t7 t7Var = (t7) this.b;
                t7Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    Iterator it = t7Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((s7) it.next()).K = false;
                    }
                    t7Var.f0();
                    break;
                }
                break;
            default:
                w7 w7Var = (w7) this.b;
                if (i13 - i11 >= i17 - i15) {
                    w7Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = w7Var.v;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ha haVar = (ha) obj;
                        if (haVar.hasFocus()) {
                            haVar.requestRectangleOnScreen(new Rect(0, 0, haVar.getWidth(), haVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
