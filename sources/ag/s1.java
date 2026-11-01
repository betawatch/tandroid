package ag;

import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s1 extends kp {
    public final /* synthetic */ int i = 1;

    public /* synthetic */ s1(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override // org.telegram.ui.Components.kp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return (int) ((this.b * 2.0f) + this.a);
            default:
                return org.telegram.messenger.i0.L(26.0f);
        }
    }

    @Override // org.telegram.ui.Components.kp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return (int) ((this.b * 2.0f) + this.a);
            default:
                return org.telegram.messenger.i0.L(26.0f);
        }
    }

    public /* synthetic */ s1(int i10) {
        super(i10);
    }
}
