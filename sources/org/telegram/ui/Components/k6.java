package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k6 extends l6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(String str, int i9) {
        super(str, 1);
        this.b = i9;
    }

    @Override // org.telegram.ui.Components.l6
    public final void a(int i9, Object obj) {
        switch (this.b) {
            case 0:
                ((Paint) obj).setAlpha(i9);
                break;
            case 1:
                ((Paint) obj).setColor(i9);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i9);
                break;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i9);
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
