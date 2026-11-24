// default package

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l01 extends m01 {
    public static final List c = Arrays.asList(new l01(2), new l01(3), new l01(4), new l01(1), new l01(0));
    public final /* synthetic */ byte b;

    public /* synthetic */ l01(byte b) {
        this.b = b;
    }

    public static l01 o(int i) {
        List list = c;
        if (i >= 0 && i <= list.size()) {
            return (l01) list.get(i);
        }
        wn4.k("Shape type must be in range from 0 to ", list.size() - 1, ", but got ", i);
        return null;
    }

    @Override // m01
    public final float a() {
        return 1.0f;
    }

    @Override // m01
    public final int d() {
        switch (this.b) {
            case 0:
                return R.drawable.photo_arrowshape;
            case 1:
                return R.drawable.msg_msgbubble;
            case 2:
                return R.drawable.photo_circle;
            case 3:
                return R.drawable.photo_rectangle;
            default:
                return R.drawable.photo_star;
        }
    }

    @Override // m01
    public final String h(int i) {
        if (i == 0 || i == 1) {
            return "shape";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }

    public final int l() {
        switch (this.b) {
            case 0:
                return R.drawable.photo_arrowshape;
            case 1:
                return R.drawable.msg_msgbubble2;
            case 2:
                return R.drawable.photo_circle_fill;
            case 3:
                return R.drawable.photo_rectangle_fill;
            default:
                return R.drawable.photo_star_fill;
        }
    }

    public final String m() {
        switch (this.b) {
            case 0:
                return k96.M0(2131747483, null);
            case 1:
                return k96.M0(2131747481, null);
            case 2:
                return k96.M0(2131747480, null);
            case 3:
                return k96.M0(2131747469, null);
            default:
                return k96.M0(2131747468, null);
        }
    }

    public final int n() {
        switch (this.b) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 0;
            case 3:
                return 1;
            default:
                return 2;
        }
    }
}
