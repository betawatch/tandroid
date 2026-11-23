package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                s8 s8Var = (s8) this.b;
                s8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    Iterator it = s8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((r8) it.next()).K = false;
                    }
                    s8Var.f0();
                    break;
                }
                break;
            default:
                v8 v8Var = (v8) this.b;
                if (i12 - i10 >= i16 - i14) {
                    v8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = v8Var.w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        eb ebVar = (eb) obj;
                        if (ebVar.hasFocus()) {
                            ebVar.requestRectangleOnScreen(new Rect(0, 0, ebVar.getWidth(), ebVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
