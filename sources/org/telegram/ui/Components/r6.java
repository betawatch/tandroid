package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r6 extends s6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(String str, int i10) {
        super(str, 1);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.s6
    public final void a(int i10, Object obj) {
        switch (this.b) {
            case 0:
                ((Paint) obj).setAlpha(i10);
                break;
            case 1:
                ((Paint) obj).setColor(i10);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i10);
                break;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i10);
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((Paint) obj).getAlpha());
            case 1:
                return Integer.valueOf(((Paint) obj).getColor());
            case 2:
                return Integer.valueOf(((Drawable) obj).getAlpha());
            default:
                return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
        }
    }
}
