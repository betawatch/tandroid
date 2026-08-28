package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h8 extends jp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ h8(float f10, float f11, int i9) {
        super(f10, f11, i9);
    }

    @Override // org.telegram.ui.Components.jp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.jp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ h8(int i9) {
        super(i9);
    }
}
