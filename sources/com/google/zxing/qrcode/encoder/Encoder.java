package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.MinimalEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes3.dex */
public abstract class Encoder {
    private static final int[] ALPHANUMERIC_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset DEFAULT_BYTE_MODE_ENCODING = StandardCharsets.ISO_8859_1;

    private static int calculateMaskPenalty(ByteMatrix byteMatrix) {
        return MaskUtil.applyMaskPenaltyRule1(byteMatrix) + MaskUtil.applyMaskPenaltyRule2(byteMatrix) + MaskUtil.applyMaskPenaltyRule3(byteMatrix) + MaskUtil.applyMaskPenaltyRule4(byteMatrix);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013c, code lost:
    
        if (com.google.zxing.qrcode.encoder.QRCode.isValidMaskPattern(r8) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map map) {
        boolean z;
        boolean z2;
        Version recommendVersion;
        Mode mode;
        Version version;
        BitArray bitArray;
        CharacterSetECI characterSetECI;
        int i;
        boolean z3 = false;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                z = true;
                if (map != null) {
                    EncodeHintType encodeHintType2 = EncodeHintType.QR_COMPACT;
                    if (map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString())) {
                        z2 = true;
                        Charset charset = DEFAULT_BYTE_MODE_ENCODING;
                        if (map != null && map.containsKey(EncodeHintType.CHARACTER_SET)) {
                            z3 = true;
                        }
                        if (z3) {
                            try {
                                charset = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                        }
                        if (z2) {
                            mode = Mode.BYTE;
                            if (charset.equals(DEFAULT_BYTE_MODE_ENCODING)) {
                                charset = null;
                            }
                            MinimalEncoder.ResultList encode = MinimalEncoder.encode(str, null, charset, z, errorCorrectionLevel);
                            bitArray = new BitArray();
                            encode.getBits(bitArray);
                            version = encode.getVersion();
                        } else {
                            Mode chooseMode = chooseMode(str, charset);
                            BitArray bitArray2 = new BitArray();
                            Mode mode2 = Mode.BYTE;
                            if (chooseMode == mode2 && z3 && (characterSetECI = CharacterSetECI.getCharacterSetECI(charset)) != null) {
                                appendECI(characterSetECI, bitArray2);
                            }
                            if (z) {
                                appendModeInfo(Mode.FNC1_FIRST_POSITION, bitArray2);
                            }
                            appendModeInfo(chooseMode, bitArray2);
                            BitArray bitArray3 = new BitArray();
                            appendBytes(str, chooseMode, bitArray3, charset);
                            if (map != null) {
                                EncodeHintType encodeHintType3 = EncodeHintType.QR_VERSION;
                                if (map.containsKey(encodeHintType3)) {
                                    recommendVersion = Version.getVersionForNumber(Integer.parseInt(map.get(encodeHintType3).toString()));
                                    if (!willFit(calculateBitsNeeded(chooseMode, bitArray2, bitArray3, recommendVersion), recommendVersion, errorCorrectionLevel)) {
                                        throw new WriterException("Data too big for requested version");
                                    }
                                    BitArray bitArray4 = new BitArray();
                                    bitArray4.appendBitArray(bitArray2);
                                    appendLengthInfo(chooseMode != mode2 ? bitArray3.getSizeInBytes() : str.length(), recommendVersion, chooseMode, bitArray4);
                                    bitArray4.appendBitArray(bitArray3);
                                    mode = chooseMode;
                                    version = recommendVersion;
                                    bitArray = bitArray4;
                                }
                            }
                            recommendVersion = recommendVersion(errorCorrectionLevel, chooseMode, bitArray2, bitArray3);
                            BitArray bitArray42 = new BitArray();
                            bitArray42.appendBitArray(bitArray2);
                            appendLengthInfo(chooseMode != mode2 ? bitArray3.getSizeInBytes() : str.length(), recommendVersion, chooseMode, bitArray42);
                            bitArray42.appendBitArray(bitArray3);
                            mode = chooseMode;
                            version = recommendVersion;
                            bitArray = bitArray42;
                        }
                        Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
                        int totalCodewords = version.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
                        terminateBits(totalCodewords, bitArray);
                        BitArray interleaveWithECBytes = interleaveWithECBytes(bitArray, version.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
                        QRCode qRCode = new QRCode();
                        qRCode.setECLevel(errorCorrectionLevel);
                        qRCode.setMode(mode);
                        qRCode.setVersion(version);
                        int dimensionForVersion = version.getDimensionForVersion();
                        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
                        if (map != null) {
                            EncodeHintType encodeHintType4 = EncodeHintType.QR_MASK_PATTERN;
                            if (map.containsKey(encodeHintType4)) {
                                i = Integer.parseInt(map.get(encodeHintType4).toString());
                            }
                        }
                        i = -1;
                        if (i == -1) {
                            i = chooseMaskPattern(interleaveWithECBytes, errorCorrectionLevel, version, byteMatrix);
                        }
                        qRCode.setMaskPattern(i);
                        MatrixUtil.buildMatrix(interleaveWithECBytes, errorCorrectionLevel, version, i, byteMatrix);
                        qRCode.setMatrix(byteMatrix);
                        return qRCode;
                    }
                }
                z2 = false;
                Charset charset2 = DEFAULT_BYTE_MODE_ENCODING;
                if (map != null) {
                    z3 = true;
                }
                if (z3) {
                }
                if (z2) {
                }
                Version.ECBlocks eCBlocksForLevel2 = version.getECBlocksForLevel(errorCorrectionLevel);
                int totalCodewords2 = version.getTotalCodewords() - eCBlocksForLevel2.getTotalECCodewords();
                terminateBits(totalCodewords2, bitArray);
                BitArray interleaveWithECBytes2 = interleaveWithECBytes(bitArray, version.getTotalCodewords(), totalCodewords2, eCBlocksForLevel2.getNumBlocks());
                QRCode qRCode2 = new QRCode();
                qRCode2.setECLevel(errorCorrectionLevel);
                qRCode2.setMode(mode);
                qRCode2.setVersion(version);
                int dimensionForVersion2 = version.getDimensionForVersion();
                ByteMatrix byteMatrix2 = new ByteMatrix(dimensionForVersion2, dimensionForVersion2);
                if (map != null) {
                }
                i = -1;
                if (i == -1) {
                }
                qRCode2.setMaskPattern(i);
                MatrixUtil.buildMatrix(interleaveWithECBytes2, errorCorrectionLevel, version, i, byteMatrix2);
                qRCode2.setMatrix(byteMatrix2);
                return qRCode2;
            }
        }
        z = false;
        if (map != null) {
        }
        z2 = false;
        Charset charset22 = DEFAULT_BYTE_MODE_ENCODING;
        if (map != null) {
        }
        if (z3) {
        }
        if (z2) {
        }
        Version.ECBlocks eCBlocksForLevel22 = version.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords22 = version.getTotalCodewords() - eCBlocksForLevel22.getTotalECCodewords();
        terminateBits(totalCodewords22, bitArray);
        BitArray interleaveWithECBytes22 = interleaveWithECBytes(bitArray, version.getTotalCodewords(), totalCodewords22, eCBlocksForLevel22.getNumBlocks());
        QRCode qRCode22 = new QRCode();
        qRCode22.setECLevel(errorCorrectionLevel);
        qRCode22.setMode(mode);
        qRCode22.setVersion(version);
        int dimensionForVersion22 = version.getDimensionForVersion();
        ByteMatrix byteMatrix22 = new ByteMatrix(dimensionForVersion22, dimensionForVersion22);
        if (map != null) {
        }
        i = -1;
        if (i == -1) {
        }
        qRCode22.setMaskPattern(i);
        MatrixUtil.buildMatrix(interleaveWithECBytes22, errorCorrectionLevel, version, i, byteMatrix22);
        qRCode22.setMatrix(byteMatrix22);
        return qRCode22;
    }

    private static Version recommendVersion(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) {
        return chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, Version.getVersionForNumber(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    private static int calculateBitsNeeded(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray.getSize() + mode.getCharacterCountBits(version) + bitArray2.getSize();
    }

    static int getAlphanumericCode(int i) {
        int[] iArr = ALPHANUMERIC_TABLE;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static Mode chooseMode(String str, Charset charset) {
        Charset charset2 = StringUtils.SHIFT_JIS_CHARSET;
        if (charset2 != null && charset2.equals(charset) && isOnlyDoubleByteKanji(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (getAlphanumericCode(charAt) == -1) {
                    return Mode.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    static boolean isOnlyDoubleByteKanji(String str) {
        byte[] bytes = str.getBytes(StringUtils.SHIFT_JIS_CHARSET);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static int chooseMaskPattern(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) {
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            MatrixUtil.buildMatrix(bitArray, errorCorrectionLevel, version, i3, byteMatrix);
            int calculateMaskPenalty = calculateMaskPenalty(byteMatrix);
            if (calculateMaskPenalty < i) {
                i2 = i3;
                i = calculateMaskPenalty;
            }
        }
        return i2;
    }

    private static Version chooseVersion(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            Version versionForNumber = Version.getVersionForNumber(i2);
            if (willFit(i, versionForNumber, errorCorrectionLevel)) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    static boolean willFit(int i, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        return version.getTotalCodewords() - version.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i + 7) / 8;
    }

    static void terminateBits(int i, BitArray bitArray) {
        int i2 = i * 8;
        if (bitArray.getSize() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && bitArray.getSize() < i2; i3++) {
            bitArray.appendBit(false);
        }
        int size = bitArray.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                bitArray.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i - bitArray.getSizeInBytes();
        for (int i4 = 0; i4 < sizeInBytes; i4++) {
            bitArray.appendBits((i4 & 1) == 0 ? NotificationCenter.channelConnectedBotsUpdate : 17, 8);
        }
        if (bitArray.getSize() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    static void getNumDataBytesAndNumECBytesForBlockID(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    static BitArray interleaveWithECBytes(BitArray bitArray, int i, int i2, int i3) {
        if (bitArray.getSizeInBytes() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            getNumDataBytesAndNumECBytesForBlockID(i, i2, i3, i7, iArr, iArr2);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            bitArray.toBytes(i4 * 8, bArr, 0, i8);
            byte[] generateECBytes = generateECBytes(bArr, iArr2[0]);
            arrayList.add(new BlockPair(bArr, generateECBytes));
            i5 = Math.max(i5, i8);
            i6 = Math.max(i6, generateECBytes.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray2 = new BitArray();
        for (int i9 = 0; i9 < i5; i9++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] dataBytes = ((BlockPair) it.next()).getDataBytes();
                if (i9 < dataBytes.length) {
                    bitArray2.appendBits(dataBytes[i9], 8);
                }
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] errorCorrectionBytes = ((BlockPair) it2.next()).getErrorCorrectionBytes();
                if (i10 < errorCorrectionBytes.length) {
                    bitArray2.appendBits(errorCorrectionBytes[i10], 8);
                }
            }
        }
        if (i == bitArray2.getSizeInBytes()) {
            return bitArray2;
        }
        throw new WriterException("Interleaving error: " + i + " and " + bitArray2.getSizeInBytes() + " differ.");
    }

    static byte[] generateECBytes(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void appendModeInfo(Mode mode, BitArray bitArray) {
        bitArray.appendBits(mode.getBits(), 4);
    }

    static void appendLengthInfo(int i, Version version, Mode mode, BitArray bitArray) {
        int characterCountBits = mode.getCharacterCountBits(version);
        int i2 = 1 << characterCountBits;
        if (i >= i2) {
            throw new WriterException(i + " is bigger than " + (i2 - 1));
        }
        bitArray.appendBits(i, characterCountBits);
    }

    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void appendBytes(String str, Mode mode, BitArray bitArray, Charset charset) {
        int i = 1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i == 1) {
            appendNumericBytes(str, bitArray);
            return;
        }
        if (i == 2) {
            appendAlphanumericBytes(str, bitArray);
            return;
        }
        if (i == 3) {
            append8BitBytes(str, bitArray, charset);
        } else {
            if (i == 4) {
                appendKanjiBytes(str, bitArray);
                return;
            }
            throw new WriterException("Invalid mode: " + mode);
        }
    }

    static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                bitArray.appendBits((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    bitArray.appendBits((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    bitArray.appendBits(charAt, 4);
                }
            }
        }
    }

    static void appendAlphanumericBytes(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int alphanumericCode = getAlphanumericCode(charSequence.charAt(i));
            if (alphanumericCode == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int alphanumericCode2 = getAlphanumericCode(charSequence.charAt(i2));
                if (alphanumericCode2 == -1) {
                    throw new WriterException();
                }
                bitArray.appendBits((alphanumericCode * 45) + alphanumericCode2, 11);
                i += 2;
            } else {
                bitArray.appendBits(alphanumericCode, 6);
                i = i2;
            }
        }
    }

    static void append8BitBytes(String str, BitArray bitArray, Charset charset) {
        for (byte b : str.getBytes(charset)) {
            bitArray.appendBits(b, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[LOOP:0: B:6:0x0011->B:13:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void appendKanjiBytes(String str, BitArray bitArray) {
        int i;
        Charset charset = StringUtils.SHIFT_JIS_CHARSET;
        if (charset == null) {
            throw new WriterException("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
            int i4 = 33088;
            if (i3 < 33088 || i3 > 40956) {
                if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                    if (i != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    bitArray.appendBits(((i >> 8) * NotificationCenter.didUpdatePremiumGiftStickers) + (i & NotificationCenter.didReceiveSmsCode), 13);
                } else {
                    i4 = 49472;
                }
            }
            i = i3 - i4;
            if (i != -1) {
            }
        }
    }

    private static void appendECI(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.appendBits(Mode.ECI.getBits(), 4);
        bitArray.appendBits(characterSetECI.getValue(), 8);
    }
}
