package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                h8 h8Var = (h8) this.b;
                h8Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    Iterator it = h8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((g8) it.next()).K = false;
                    }
                    h8Var.f0();
                    break;
                }
                break;
            default:
                k8 k8Var = (k8) this.b;
                if (i13 - i11 >= i17 - i15) {
                    k8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = k8Var.w;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ra raVar = (ra) obj;
                        if (raVar.hasFocus()) {
                            raVar.requestRectangleOnScreen(new Rect(0, 0, raVar.getWidth(), raVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
