package org.telegram.messenger;

import java.io.IOException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class k6 {
    public static final l6 a;

    static {
        try {
            a = new l6();
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to open emoji.pack", e10);
        }
    }
}
