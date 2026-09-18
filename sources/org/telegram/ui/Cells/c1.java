package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.mv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                return Float.valueOf(((gk0) obj).v);
            default:
                return Float.valueOf(((mv0) obj).a);
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
                ((gk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                ((mv0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
