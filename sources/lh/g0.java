package lh;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g0 extends uf.n {
    public final /* synthetic */ int L;
    public final /* synthetic */ FrameLayout M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.L = i10;
        this.M = frameLayout;
    }

    @Override // uf.n
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.L) {
            case 0:
                currentHeight = ((j0) this.M).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((m0) this.M).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // uf.n
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.L) {
            case 0:
                currentWidth = ((j0) this.M).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((m0) this.M).getCurrentWidth();
                return currentWidth2;
        }
    }
}
