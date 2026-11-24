// default package

import android.graphics.Bitmap;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class jd8 {
    public static np3 a;
    public static final ot4 b = new ot4(25165824, (byte) 2);
    public static final or4 c = new or4(16, 0.75f, true, (byte) 2);
    public static final HashMap d = new HashMap();

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
