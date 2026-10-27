package a8;

import java.util.Locale;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class q0 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", c3.h0.l(2, 0, String.valueOf(sb.b.R0().get(1))), Integer.valueOf(i10)));
    }
}
