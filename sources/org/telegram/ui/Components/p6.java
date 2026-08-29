package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p6 extends q6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(String str, int i10) {
        super(str, 1);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.q6
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
