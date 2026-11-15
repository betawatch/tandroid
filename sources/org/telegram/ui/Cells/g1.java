package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.ar0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                return Float.valueOf(((mi0) obj).w);
            case 3:
                return Float.valueOf(((zz0) obj).h);
            default:
                return Float.valueOf(((ar0) obj).a);
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
                ((mi0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                zz0 zz0Var = (zz0) obj;
                zz0Var.h = ((Float) obj2).floatValue();
                zz0Var.invalidate();
                break;
            default:
                ((ar0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
