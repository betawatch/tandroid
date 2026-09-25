package org.telegram.messenger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
