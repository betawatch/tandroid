package org.telegram.ui;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class pj1 {
    public static final BigInteger a = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
    public static final BigInteger b = BigInteger.valueOf(2);
    public static org.telegram.ui.ActionBar.h3 c;
    public static bi.u6 d;

    public static byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 256) {
            return byteArray;
        }
        if (byteArray.length == 257 && byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        if (byteArray.length < 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
            return bArr;
        }
        throw new IllegalStateException("unexpected DH value size " + byteArray.length);
    }

    public static byte[] b(byte[][] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                messageDigest.update(bArr2);
            }
            return messageDigest.digest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] c(bi.u6 u6Var, String str, int i10, boolean z10) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 9);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.putInt(bytes.length);
        allocate.put(bytes);
        allocate.putInt(i10);
        allocate.put(z10 ? (byte) 1 : (byte) 0);
        byte[] array = allocate.array();
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArr2 = (byte[]) u6Var.d;
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr));
        byte[] doFinal = cipher.doFinal(array);
        byte[] bArr3 = new byte[doFinal.length + 28];
        System.arraycopy((byte[]) u6Var.a, 0, bArr3, 0, 16);
        System.arraycopy(bArr, 0, bArr3, 16, 12);
        System.arraycopy(doFinal, 0, bArr3, 28, doFinal.length);
        return bArr3;
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }
}
