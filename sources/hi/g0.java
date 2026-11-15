package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g0 extends og.o {
    public final /* synthetic */ int Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override // og.o
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.Q) {
            case 0:
                currentHeight = ((j0) this.R).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((n0) this.R).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // og.o
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.Q) {
            case 0:
                currentWidth = ((j0) this.R).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((n0) this.R).getCurrentWidth();
                return currentWidth2;
        }
    }
}
