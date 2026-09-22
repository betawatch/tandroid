package ci;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                currentHeight = ((j0) this.Q).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((m0) this.Q).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // lg.p
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.P) {
            case 0:
                currentWidth = ((j0) this.Q).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((m0) this.Q).getCurrentWidth();
                return currentWidth2;
        }
    }
}
