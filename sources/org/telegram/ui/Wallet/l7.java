package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                w7 w7Var = (w7) this.b;
                w7Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    Iterator it = w7Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((v7) it.next()).K = false;
                    }
                    w7Var.h0();
                    break;
                }
                break;
            default:
                z7 z7Var = (z7) this.b;
                if (i13 - i11 >= i17 - i15) {
                    z7Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = z7Var.v;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ia iaVar = (ia) obj;
                        if (iaVar.hasFocus()) {
                            iaVar.requestRectangleOnScreen(new Rect(0, 0, iaVar.getWidth(), iaVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
