package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                c8 c8Var = (c8) this.b;
                c8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    Iterator it = c8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((b8) it.next()).K = false;
                    }
                    c8Var.f0();
                    break;
                }
                break;
            default:
                f8 f8Var = (f8) this.b;
                if (i12 - i10 >= i16 - i14) {
                    f8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = f8Var.w;
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
