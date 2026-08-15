package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final Charset GB2312_CHARSET;
    private static final Charset PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset();
    public static final Charset SHIFT_JIS_CHARSET;

    static {
        Charset charset;
        Charset charset2;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        SHIFT_JIS_CHARSET = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        GB2312_CHARSET = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        EUC_JP = charset3;
        Charset charset4 = SHIFT_JIS_CHARSET;
        ASSUME_SHIFT_JIS = (charset4 != null && charset4.equals(PLATFORM_DEFAULT_ENCODING)) || (charset3 != null && charset3.equals(PLATFORM_DEFAULT_ENCODING));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Charset guessCharset(byte[] bArr, Map map) {
        int i;
        byte b;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return Charset.forName(map.get(decodeHintType).toString());
            }
        }
        boolean z = true;
        int i2 = 0;
        if (bArr2.length > 2 && (((b = bArr2[0]) == -2 && bArr2[1] == -1) || (b == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z2 = SHIFT_JIS_CHARSET != null;
        boolean z3 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z4 = z2;
        int i3 = 0;
        boolean z5 = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i4 < length && (z || z4 || z5)) {
            byte b2 = bArr2[i4];
            int i14 = b2 & 255;
            if (z5) {
                if (i5 <= 0) {
                    i = length;
                    if ((b2 & 128) != 0) {
                        if ((b2 & 64) != 0) {
                            int i15 = i5 + 1;
                            if ((b2 & 32) == 0) {
                                i7++;
                            } else {
                                i15 = i5 + 2;
                                if ((b2 & 16) == 0) {
                                    i8++;
                                } else {
                                    i5 += 3;
                                    if ((b2 & 8) == 0) {
                                        i9++;
                                    }
                                }
                            }
                            i5 = i15;
                        }
                    }
                    if (z) {
                        if (i14 > 127 && i14 < 160) {
                            z = false;
                        } else if (i14 > 159 && (i14 < 192 || i14 == 215 || i14 == 247)) {
                            i11++;
                        }
                    }
                    if (z4) {
                        if (i6 > 0) {
                            if (i14 >= 64 && i14 != 127 && i14 <= 252) {
                                i6--;
                            }
                            z4 = false;
                        } else {
                            if (i14 != 128 && i14 != 160 && i14 <= 239) {
                                if (i14 <= 160 || i14 >= 224) {
                                    if (i14 > 127) {
                                        i6++;
                                        int i16 = i12 + 1;
                                        if (i16 > i2) {
                                            i2 = i16;
                                            i12 = i2;
                                        } else {
                                            i12 = i16;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    i13 = 0;
                                } else {
                                    i3++;
                                    int i17 = i13 + 1;
                                    if (i17 > i10) {
                                        i10 = i17;
                                        i13 = i10;
                                    } else {
                                        i13 = i17;
                                    }
                                    i12 = 0;
                                }
                            }
                            z4 = false;
                        }
                    }
                    i4++;
                    bArr2 = bArr;
                    length = i;
                } else if ((b2 & 128) == 0) {
                    i = length;
                } else {
                    i5--;
                }
                z5 = false;
                if (z) {
                }
                if (z4) {
                }
                i4++;
                bArr2 = bArr;
                length = i;
            }
            i = length;
            if (z) {
            }
            if (z4) {
            }
            i4++;
            bArr2 = bArr;
            length = i;
        }
        int i18 = length;
        if (z5 && i5 > 0) {
            z5 = false;
        }
        if (z4 && i6 > 0) {
            z4 = false;
        }
        if (z5 && (z3 || i7 + i8 + i9 > 0)) {
            return StandardCharsets.UTF_8;
        }
        if (z4 && (ASSUME_SHIFT_JIS || i10 >= 3 || i2 >= 3)) {
            return SHIFT_JIS_CHARSET;
        }
        if (z && z4) {
            return (!(i10 == 2 && i3 == 2) && i11 * 10 < i18) ? StandardCharsets.ISO_8859_1 : SHIFT_JIS_CHARSET;
        }
        if (z) {
            return StandardCharsets.ISO_8859_1;
        }
        if (z4) {
            return SHIFT_JIS_CHARSET;
        }
        if (z5) {
            return StandardCharsets.UTF_8;
        }
        return PLATFORM_DEFAULT_ENCODING;
    }
}
