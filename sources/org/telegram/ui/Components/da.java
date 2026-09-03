package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class da implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    break;
                }
                break;
            default:
                k01 k01Var = (k01) obj2;
                k01Var.k = u5.update(k01Var.l, (View) obj, k01Var.k, k01Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                fa faVar = (fa) this.c;
                ba baVar = (ba) this.b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.e.isEmpty() && arrayList.isEmpty()) {
                        baVar.n.a();
                    }
                }
                faVar.n = null;
                Paint paint = faVar.h;
                faVar.o = null;
                paint.setShader(null);
                break;
            default:
                u5.release((View) this.b, ((k01) this.c).k);
                break;
        }
    }
}
