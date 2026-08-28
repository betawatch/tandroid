package kh;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h0 extends tf.n {
    public final /* synthetic */ int L;
    public final /* synthetic */ FrameLayout M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(FrameLayout frameLayout, Context context, int i9) {
        super(context);
        this.L = i9;
        this.M = frameLayout;
    }

    @Override // tf.n
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.L) {
            case 0:
                currentHeight = ((k0) this.M).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((n0) this.M).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // tf.n
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.L) {
            case 0:
                currentWidth = ((k0) this.M).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((n0) this.M).getCurrentWidth();
                return currentWidth2;
        }
    }
}
