// default package

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class m01 {
    public static final List a = Arrays.asList(new k01(), new f01(), new h01(), new j01(), new g01(), new i01());

    public float a() {
        return 0.85f;
    }

    public int b() {
        return -16777216;
    }

    public float c() {
        return 0.25f;
    }

    public int d() {
        return R.raw.photo_arrow;
    }

    public float e() {
        return 1.0f;
    }

    public float f() {
        return 0.4f;
    }

    public float g() {
        return 1.0f;
    }

    public String h(int i) {
        if (i == 0) {
            return "blitWithMask";
        }
        if (i == 1) {
            return "compositeWithMask";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }

    public float i() {
        return 1.0f;
    }

    public float j() {
        return 0.15f;
    }

    public int k() {
        return R.drawable.paint_radial_brush;
    }
}
