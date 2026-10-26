package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.xu0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                return Float.valueOf(((fl0) obj).v);
            case 3:
                return Float.valueOf(((b31) obj).h);
            default:
                return Float.valueOf(((xu0) obj).a);
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
                ((fl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                b31 b31Var = (b31) obj;
                b31Var.h = ((Float) obj2).floatValue();
                b31Var.invalidate();
                break;
            default:
                ((xu0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
