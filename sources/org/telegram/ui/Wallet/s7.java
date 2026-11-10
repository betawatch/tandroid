package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                d8 d8Var = (d8) this.b;
                d8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    Iterator it = d8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((c8) it.next()).K = false;
                    }
                    d8Var.f0();
                    break;
                }
                break;
            default:
                g8 g8Var = (g8) this.b;
                if (i12 - i10 >= i16 - i14) {
                    g8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = g8Var.w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        pa paVar = (pa) obj;
                        if (paVar.hasFocus()) {
                            paVar.requestRectangleOnScreen(new Rect(0, 0, paVar.getWidth(), paVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
