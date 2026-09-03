package g5;

import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l0 extends IOException {
    public l0(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}
