package org.telegram.messenger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class CharacterCompat {
    public static final char MIN_HIGH_SURROGATE = 55296;
    public static final char MIN_LOW_SURROGATE = 56320;
    public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;

    public static char highSurrogate(int i10) {
        return (char) ((i10 >>> 10) + 55232);
    }

    public static char lowSurrogate(int i10) {
        return (char) ((i10 & 1023) + 56320);
    }
}
