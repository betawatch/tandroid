package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p6 extends q6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(String str, int i7) {
        super(str, 1);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(int i7, Object obj) {
        switch (this.b) {
            case 0:
                ((Paint) obj).setAlpha(i7);
                break;
            case 1:
                ((Paint) obj).setColor(i7);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i7);
                break;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i7);
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
