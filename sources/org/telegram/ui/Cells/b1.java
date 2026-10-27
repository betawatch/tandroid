package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.zu0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b1 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Class cls, String str, int i10) {
        super(cls, str);
        this.a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((s1) obj).Be);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((gl0) obj).v);
            case 3:
                return Float.valueOf(((c31) obj).h);
            default:
                return Float.valueOf(((zu0) obj).a);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((s1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 2:
                ((gl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                c31 c31Var = (c31) obj;
                c31Var.h = ((Float) obj2).floatValue();
                c31Var.invalidate();
                break;
            default:
                ((zu0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
