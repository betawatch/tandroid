package org.telegram.messenger;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class m6 {
    public static final n6 a;

    static {
        try {
            a = new n6();
        } catch (IOException e) {
            throw new IllegalStateException("Unable to open emoji.pack", e);
        }
    }
}
