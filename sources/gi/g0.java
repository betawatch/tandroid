package gi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends pg.m {
    public final /* synthetic */ int Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(FrameLayout frameLayout, Context context, int i3) {
        super(context);
        this.Q = i3;
        this.R = frameLayout;
    }

    @Override // pg.m
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.Q) {
            case 0:
                currentHeight = ((j0) this.R).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((m0) this.R).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // pg.m
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.Q) {
            case 0:
                currentWidth = ((j0) this.R).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((m0) this.R).getCurrentWidth();
                return currentWidth2;
        }
    }
}
