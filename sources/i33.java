// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class i33 extends b43 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i33(FrameLayout frameLayout, Context context, byte b) {
        super(context);
        this.Q = b;
        this.R = frameLayout;
    }

    @Override // b43
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                currentHeight = ((l33) frameLayout).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((q33) frameLayout).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // b43
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                currentWidth = ((l33) frameLayout).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((q33) frameLayout).getCurrentWidth();
                return currentWidth2;
        }
    }
}
