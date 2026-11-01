package org.telegram.messenger;

import java.io.IOException;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
