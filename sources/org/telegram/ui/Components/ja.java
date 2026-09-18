package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ja implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ja(int i10, Object obj, Object obj2) {
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
                ha haVar = (ha) obj;
                if (haVar != null) {
                    haVar.d.add((la) obj2);
                    break;
                }
                break;
            default:
                h01 h01Var = (h01) obj2;
                h01Var.k = x5.update(h01Var.l, (View) obj, h01Var.k, h01Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                la laVar = (la) this.c;
                ha haVar = (ha) this.b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.n.a();
                    }
                }
                laVar.n = null;
                Paint paint = laVar.h;
                laVar.o = null;
                paint.setShader(null);
                break;
            default:
                x5.release((View) this.b, ((h01) this.c).k);
                break;
        }
    }
}
