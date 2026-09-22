package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u8 extends tp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ u8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override // org.telegram.ui.Components.tp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.tp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ u8(int i10) {
        super(i10);
    }
}
