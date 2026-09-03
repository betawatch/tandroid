package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.xu0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                return Float.valueOf(((t1) obj).we);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((qk0) obj).v);
            default:
                return Float.valueOf(((xu0) obj).a);
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
                ((qk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                ((xu0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
