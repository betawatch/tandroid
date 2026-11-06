package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.br0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                return Float.valueOf(((q1) obj).Vc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((ii0) obj).w);
            case 3:
                return Float.valueOf(((wz0) obj).h);
            default:
                return Float.valueOf(((br0) obj).a);
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
                ((ii0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                wz0 wz0Var = (wz0) obj;
                wz0Var.h = ((Float) obj2).floatValue();
                wz0Var.invalidate();
                break;
            default:
                ((br0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
