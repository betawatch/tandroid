package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.er0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                return Float.valueOf(((ji0) obj).w);
            case 3:
                return Float.valueOf(((yz0) obj).h);
            default:
                return Float.valueOf(((er0) obj).a);
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
                ((ji0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                yz0 yz0Var = (yz0) obj;
                yz0Var.h = ((Float) obj2).floatValue();
                yz0Var.invalidate();
                break;
            default:
                ((er0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
