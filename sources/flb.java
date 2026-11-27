// default package

import java.util.regex.Pattern;
import org.telegram.messenger.voip.CallAudioDevice;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class flb {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final bp5 e = bp5.p(2, CallAudioDevice.NAME_AUTO, "none");
    public static final bp5 f = bp5.p(3, "dot", "sesame", "circle");
    public static final bp5 g = bp5.p(2, "filled", "open");
    public static final bp5 h = bp5.p(3, "after", "before", "outside");
    public final int a;
    public final byte b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public flb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
