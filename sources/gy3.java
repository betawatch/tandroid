// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gy3 {
    public static final hy3 a;

    static {
        try {
            a = new hy3();
        } catch (IOException e) {
            wa3.h("Unable to open emoji.pack", e);
        }
    }
}
