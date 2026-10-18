package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                z7 z7Var = (z7) this.b;
                z7Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    Iterator it = z7Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((y7) it.next()).K = false;
                    }
                    z7Var.h0();
                    break;
                }
                break;
            default:
                c8 c8Var = (c8) this.b;
                if (i13 - i11 >= i17 - i15) {
                    c8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = c8Var.v;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        la laVar = (la) obj;
                        if (laVar.hasFocus()) {
                            laVar.requestRectangleOnScreen(new Rect(0, 0, laVar.getWidth(), laVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
