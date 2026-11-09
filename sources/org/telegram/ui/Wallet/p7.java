package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                a8 a8Var = (a8) this.b;
                a8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    Iterator it = a8Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((z7) it.next()).K = false;
                    }
                    a8Var.f0();
                    break;
                }
                break;
            default:
                d8 d8Var = (d8) this.b;
                if (i12 - i10 >= i16 - i14) {
                    d8Var.getClass();
                    break;
                } else {
                    ArrayList arrayList = d8Var.w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        ma maVar = (ma) obj;
                        if (maVar.hasFocus()) {
                            maVar.requestRectangleOnScreen(new Rect(0, 0, maVar.getWidth(), maVar.getHeight()), true);
                            break;
                        }
                    }
                    break;
                }
        }
    }
}
