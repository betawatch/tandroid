package ig;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends h {
    public static final List c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i10) {
        this.b = i10;
    }

    public static g p(int i10) {
        List list = c;
        if (i10 >= 0 && i10 <= list.size()) {
            return (g) list.get(i10);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // ig.h
    public final float a() {
        return 1.0f;
    }

    @Override // ig.h
    public final int e() {
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

    @Override // ig.h
    public final String i(int i10) {
        if (i10 == 0 || i10 == 1) {
            return "shape";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }

    public final int m() {
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

    public final String n() {
        switch (this.b) {
            case 0:
                return cd.L0(2131747692, null);
            case 1:
                return cd.L0(2131747690, null);
            case 2:
                return cd.L0(2131747689, null);
            case 3:
                return cd.L0(2131747678, null);
            default:
                return cd.L0(2131747677, null);
        }
    }

    public final int o() {
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
