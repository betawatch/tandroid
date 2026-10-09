package ci;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g0 extends lg.p {
    public final /* synthetic */ int P;
    public final /* synthetic */ FrameLayout Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override // lg.p
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.P) {
            case 0:
                currentHeight = ((i0) this.Q).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((l0) this.Q).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // lg.p
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.P) {
            case 0:
                currentWidth = ((i0) this.Q).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((l0) this.Q).getCurrentWidth();
                return currentWidth2;
        }
    }
}
