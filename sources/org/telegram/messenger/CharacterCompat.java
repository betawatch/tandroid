package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
