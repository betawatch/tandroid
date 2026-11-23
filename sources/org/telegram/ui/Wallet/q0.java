package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q0 {
    public final String a;
    public final long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public q0 f;
    public List g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift i;

    public q0(String str, long j3, byte[] bArr, byte[] bArr2, int i7) {
        this.a = str;
        this.b = j3;
        this.c = bArr;
        this.d = bArr2;
        this.e = i7;
    }

    public static q0 a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() > 255) {
            throw new IllegalArgumentException("Invalid prepared message count");
        }
        if (arrayList.size() == 1) {
            return b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) arrayList.get(0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        long j3 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q0 b10 = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
            arrayList2.add(b10);
            j3 += b10.b;
        }
        q0 q0Var = (q0) arrayList2.get(0);
        q0 q0Var2 = new q0(q0Var.a, j3, q0Var.c, q0Var.d, q0Var.e);
        q0Var2.g = DesugarCollections.unmodifiableList(arrayList2);
        return q0Var2;
    }

    public static q0 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        ca.q qVar = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            ca.q b10 = (bArr2 == null || bArr2.length <= 0) ? null : c8.bb.b(bArr2);
            if (bArr3 != null && bArr3.length > 0) {
                qVar = c8.bb.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            y3 y3Var = new y3();
            arrayList.add(y3Var);
            ArrayList arrayList2 = new ArrayList();
            if (b10 != null) {
                arrayList2.add(Integer.valueOf(c8.bb.a(arrayList, b10)));
            }
            if (qVar != null) {
                arrayList2.add(Integer.valueOf(c8.bb.a(arrayList, qVar)));
            }
            y3Var.c = new byte[]{(byte) ((((qVar != null ? 2 : 0) | (b10 != null ? 4 : 0)) << 3) | 4)};
            y3Var.d = new int[arrayList2.size()];
            int i7 = 0;
            while (true) {
                iArr = y3Var.d;
                if (i7 >= iArr.length) {
                    break;
                }
                iArr[i7] = ((Integer) arrayList2.get(i7)).intValue();
                i7++;
            }
            y3Var.a = iArr.length;
            y3Var.b = 1;
            int size = arrayList.size();
            int i10 = 1;
            while (i10 < 4 && (size >>> (i10 * 8)) != 0) {
                i10++;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                y3 y3Var2 = (y3) obj;
                i11 += (y3Var2.d.length * i10) + y3Var2.c.length + 2;
            }
            int i13 = 1;
            while (i13 < 4 && (i11 >>> (i13 * 8)) != 0) {
                i13++;
            }
            int max = Math.max(1, i13);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            c8.bb.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i10 | 64);
            byteArrayOutputStream.write(max);
            c8.bb.d(byteArrayOutputStream, arrayList.size(), i10);
            c8.bb.d(byteArrayOutputStream, 1, i10);
            c8.bb.d(byteArrayOutputStream, 0, i10);
            c8.bb.d(byteArrayOutputStream, i11, max);
            c8.bb.d(byteArrayOutputStream, 0, i10);
            int size3 = arrayList.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj2 = arrayList.get(i14);
                i14++;
                y3 y3Var3 = (y3) obj2;
                byteArrayOutputStream.write(y3Var3.a);
                byteArrayOutputStream.write(y3Var3.b);
                byte[] bArr4 = y3Var3.c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i15 : y3Var3.d) {
                    c8.bb.d(byteArrayOutputStream, i15, i10);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (c8.bb.a == null) {
                int[] iArr2 = new int[256];
                for (int i16 = 0; i16 < 256; i16++) {
                    int i17 = i16;
                    for (int i18 = 0; i18 < 8; i18++) {
                        int i19 = i17 & 1;
                        i17 >>>= 1;
                        if (i19 != 0) {
                            i17 ^= -2097792136;
                        }
                    }
                    iArr2[i16] = i17;
                }
                c8.bb.a = iArr2;
            }
            int i20 = -1;
            for (byte b11 : byteArray) {
                i20 = (i20 >>> 8) ^ c8.bb.a[(b11 ^ i20) & ks.e4];
            }
            int i21 = ~i20;
            byte[] bArr5 = new byte[byteArray.length + 4];
            System.arraycopy(byteArray, 0, bArr5, 0, byteArray.length);
            bArr5[byteArray.length] = (byte) i21;
            bArr5[byteArray.length + 1] = (byte) (i21 >>> 8);
            bArr5[byteArray.length + 2] = (byte) (i21 >>> 16);
            bArr5[byteArray.length + 3] = (byte) (i21 >>> 24);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        return new q0(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
