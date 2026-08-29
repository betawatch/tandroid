package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v7 extends np {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ v7(float f9, float f10, int i10) {
        super(f9, f10, i10);
    }

    @Override // org.telegram.ui.Components.np, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.np, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ v7(int i10) {
        super(i10);
    }
}
