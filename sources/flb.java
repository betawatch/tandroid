// default package

import java.util.regex.Pattern;
import org.telegram.messenger.voip.CallAudioDevice;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
