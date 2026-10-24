package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.t21;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class c1 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Class cls, String str, int i10) {
        super(cls, str);
        this.a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((t1) obj).Ae);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((gl0) obj).v);
            case 3:
                return Float.valueOf(((t21) obj).h);
            default:
                return Float.valueOf(((tu0) obj).a);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 2:
                ((gl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                t21 t21Var = (t21) obj;
                t21Var.h = ((Float) obj2).floatValue();
                t21Var.invalidate();
                break;
            default:
                ((tu0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
