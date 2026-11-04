package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                b8 b8Var = (b8) this.b;
                b8Var.getClass();
                if (i11 - i3 != i15 - i13 || i12 - i10 != i16 - i14) {
                    Iterator it = b8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((a8) it.next()).K = false;
                    }
                    b8Var.f0();
                    break;
                }
                break;
            default:
                e8 e8Var = (e8) this.b;
                if (i12 - i10 >= i16 - i14) {
                    e8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = e8Var.w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        na naVar = (na) obj;
                        if (naVar.hasFocus()) {
                            naVar.requestRectangleOnScreen(new Rect(0, 0, naVar.getWidth(), naVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
