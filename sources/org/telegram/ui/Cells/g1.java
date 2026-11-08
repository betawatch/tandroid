package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.cr0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                return Float.valueOf(((q1) obj).Wc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((ii0) obj).w);
            case 3:
                return Float.valueOf(((xz0) obj).h);
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
                ((ii0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                xz0 xz0Var = (xz0) obj;
                xz0Var.h = ((Float) obj2).floatValue();
                xz0Var.invalidate();
                break;
            default:
                ((cr0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
