package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g1 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Class cls, String str, int i3) {
        super(cls, str);
        this.a = i3;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((q1) obj).Vc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((li0) obj).w);
            case 3:
                return Float.valueOf(((wz0) obj).h);
            default:
                return Float.valueOf(((sq0) obj).a);
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
                ((li0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                wz0 wz0Var = (wz0) obj;
                wz0Var.h = ((Float) obj2).floatValue();
                wz0Var.invalidate();
                break;
            default:
                ((sq0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
