package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.jv0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                return Float.valueOf(((t1) obj).ze);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((fk0) obj).v);
            default:
                return Float.valueOf(((jv0) obj).a);
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
                ((fk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                ((jv0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
