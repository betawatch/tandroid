package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.ls0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                return Float.valueOf(((nj0) obj).w);
            case 3:
                return Float.valueOf(((c11) obj).h);
            default:
                return Float.valueOf(((ls0) obj).a);
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
                ((nj0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                c11 c11Var = (c11) obj;
                c11Var.h = ((Float) obj2).floatValue();
                c11Var.invalidate();
                break;
            default:
                ((ls0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
