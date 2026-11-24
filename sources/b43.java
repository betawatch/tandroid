// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class b43 extends u43 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b43(FrameLayout frameLayout, Context context, byte b) {
        super(context);
        this.Q = b;
        this.R = frameLayout;
    }

    @Override // u43
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                currentHeight = ((e43) frameLayout).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((j43) frameLayout).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // u43
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                currentWidth = ((e43) frameLayout).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((j43) frameLayout).getCurrentWidth();
                return currentWidth2;
        }
    }
}
