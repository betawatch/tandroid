package org.telegram.messenger;

import java.io.IOException;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class l6 {
    public static final m6 a;

    static {
        try {
            a = new m6();
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to open emoji.pack", e10);
        }
    }
}
