package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.cr0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g1 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Class cls, String str, int i7) {
        super(cls, str);
        this.a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((q1) obj).kd);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((vi0) obj).w);
            case 3:
                return Float.valueOf(((g01) obj).h);
            default:
                return Float.valueOf(((cr0) obj).a);
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
                ((vi0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                g01 g01Var = (g01) obj;
                g01Var.h = ((Float) obj2).floatValue();
                g01Var.invalidate();
                break;
            default:
                ((cr0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
