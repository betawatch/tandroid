package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
