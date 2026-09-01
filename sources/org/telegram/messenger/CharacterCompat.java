package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
