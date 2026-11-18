package c8;

import java.util.Locale;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class qd {
    public static int a(int i7) {
        if (i7 >= 100 || i7 < 0) {
            return i7;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.gms.internal.vision.e2.k(String.valueOf(w7.s.b0().get(1)), 2, 0), Integer.valueOf(i7)));
    }
}
