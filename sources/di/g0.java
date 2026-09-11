package di;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class g0 extends mg.q {
    public final /* synthetic */ int P;
    public final /* synthetic */ FrameLayout Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override // mg.q
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

    @Override // mg.q
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
