package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ma implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ma(int i10, Object obj, Object obj2) {
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
                ka kaVar = (ka) obj;
                if (kaVar != null) {
                    kaVar.d.add((oa) obj2);
                    break;
                }
                break;
            default:
                f11 f11Var = (f11) obj2;
                f11Var.k = z5.update(f11Var.l, (View) obj, f11Var.k, f11Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                oa oaVar = (oa) this.c;
                ka kaVar = (ka) this.b;
                if (kaVar != null) {
                    ArrayList arrayList = kaVar.d;
                    arrayList.remove(oaVar);
                    if (kaVar.e.isEmpty() && arrayList.isEmpty()) {
                        kaVar.n.a();
                    }
                }
                oaVar.n = null;
                Paint paint = oaVar.h;
                oaVar.o = null;
                paint.setShader(null);
                break;
            default:
                z5.release((View) this.b, ((f11) this.c).k);
                break;
        }
    }
}
