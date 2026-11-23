package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.cr0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h1 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Class cls, String str, int i7) {
        super(cls, str);
        this.a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((r1) obj).kd);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((xi0) obj).w);
            case 3:
                return Float.valueOf(((h01) obj).h);
            default:
                return Float.valueOf(((cr0) obj).a);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((r1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 2:
                ((xi0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            case 3:
                h01 h01Var = (h01) obj;
                h01Var.h = ((Float) obj2).floatValue();
                h01Var.invalidate();
                break;
            default:
                ((cr0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
