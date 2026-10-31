package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.ms0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g1 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Class cls, String str, int i10) {
        super(cls, str);
        this.a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((q1) obj).Uc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((mj0) obj).w);
            case 3:
                return Float.valueOf(((b11) obj).h);
            default:
                return Float.valueOf(((ms0) obj).a);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 2:
                ((mj0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                b11 b11Var = (b11) obj;
                b11Var.h = ((Float) obj2).floatValue();
                b11Var.invalidate();
                break;
            default:
                ((ms0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
