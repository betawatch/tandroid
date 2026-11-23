package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                r8 r8Var = (r8) this.b;
                r8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    Iterator it = r8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((q8) it.next()).K = false;
                    }
                    r8Var.f0();
                    break;
                }
                break;
            default:
                u8 u8Var = (u8) this.b;
                if (i12 - i10 >= i16 - i14) {
                    u8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = u8Var.w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        db dbVar = (db) obj;
                        if (dbVar.hasFocus()) {
                            dbVar.requestRectangleOnScreen(new Rect(0, 0, dbVar.getWidth(), dbVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
