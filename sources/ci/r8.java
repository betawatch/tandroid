package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class r8 extends up {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ r8(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override // org.telegram.ui.Components.up, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.up, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ r8(int i10) {
        super(i10);
    }
}
