package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k6 extends l6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(String str, int i7) {
        super(str, 1);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.l6
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
