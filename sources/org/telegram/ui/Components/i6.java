package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i6 extends j6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6(String str, int i3) {
        super(str, 1);
        this.b = i3;
    }

    @Override // org.telegram.ui.Components.j6
    public final void b(int i3, Object obj) {
        switch (this.b) {
            case 0:
                ((Paint) obj).setAlpha(i3);
                break;
            case 1:
                ((Paint) obj).setColor(i3);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i3);
                break;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i3);
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
