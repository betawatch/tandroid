package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class q8 extends wp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ q8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override // org.telegram.ui.Components.wp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.wp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ q8(int i10) {
        super(i10);
    }
}
