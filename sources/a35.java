// default package

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class a35 {
    public final String a;
    public final long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public a35 f;
    public List g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift i;
    public boolean j;
    public volatile boolean k;

    public a35(String str, long j, byte[] bArr, byte[] bArr2, int i) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = bArr2;
        this.e = i;
    }

    public static a35 a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() > 255) {
            lq5.j("Invalid prepared message count");
            return null;
        }
        if (arrayList.size() == 1) {
            return b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) arrayList.get(0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a35 b = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
            arrayList2.add(b);
            j += b.b;
        }
        a35 a35Var = (a35) arrayList2.get(0);
        a35 a35Var2 = new a35(a35Var.a, j, a35Var.c, a35Var.d, a35Var.e);
        a35Var2.g = DesugarCollections.unmodifiableList(arrayList2);
        return a35Var2;
    }

    public static a35 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        ed edVar = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            ed b = (bArr2 == null || bArr2.length <= 0) ? null : l0f.b(bArr2);
            if (bArr3 != null && bArr3.length > 0) {
                edVar = l0f.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            twb twbVar = new twb();
            arrayList.add(twbVar);
            ArrayList arrayList2 = new ArrayList();
            if (b != null) {
                arrayList2.add(Integer.valueOf(l0f.a(arrayList, b)));
            }
            if (edVar != null) {
                arrayList2.add(Integer.valueOf(l0f.a(arrayList, edVar)));
            }
            twbVar.c = new byte[]{(byte) ((((b != null ? 4 : 0) | (edVar != null ? 2 : 0)) << 3) | 4)};
            twbVar.d = new int[arrayList2.size()];
            int i = 0;
            while (true) {
                iArr = twbVar.d;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                i++;
            }
            twbVar.a = iArr.length;
            twbVar.b = 1;
            int size = arrayList.size();
            int i2 = 1;
            while (i2 < 4 && (size >>> (i2 << 3)) != 0) {
                i2++;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayList.get(i4);
                i4++;
                twb twbVar2 = (twb) obj;
                i3 += (twbVar2.d.length * i2) + twbVar2.c.length + 2;
            }
            int i5 = 1;
            while (i5 < 4 && (i3 >>> (i5 << 3)) != 0) {
                i5++;
            }
            int max = Math.max(1, i5);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            l0f.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i2 | 64);
            byteArrayOutputStream.write(max);
            l0f.d(byteArrayOutputStream, arrayList.size(), i2);
            l0f.d(byteArrayOutputStream, 1, i2);
            l0f.d(byteArrayOutputStream, 0, i2);
            l0f.d(byteArrayOutputStream, i3, max);
            l0f.d(byteArrayOutputStream, 0, i2);
            int size3 = arrayList.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj2 = arrayList.get(i6);
                i6++;
                twb twbVar3 = (twb) obj2;
                byteArrayOutputStream.write(twbVar3.a);
                byteArrayOutputStream.write(twbVar3.b);
                byte[] bArr4 = twbVar3.c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i7 : twbVar3.d) {
                    l0f.d(byteArrayOutputStream, i7, i2);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (l0f.a == null) {
                int[] iArr2 = new int[256];
                for (int i8 = 0; i8 < 256; i8++) {
                    int i9 = i8;
                    for (int i10 = 0; i10 < 8; i10++) {
                        int i11 = i9 & 1;
                        i9 >>>= 1;
                        if (i11 != 0) {
                            i9 ^= -2097792136;
                        }
                    }
                    iArr2[i8] = i9;
                }
                l0f.a = iArr2;
            }
            int i12 = -1;
            for (byte b2 : byteArray) {
                i12 = (i12 >>> 8) ^ l0f.a[(b2 ^ i12) & jn7.d4];
            }
            int i13 = ~i12;
            byte[] bArr5 = new byte[byteArray.length + 4];
            System.arraycopy(byteArray, 0, bArr5, 0, byteArray.length);
            bArr5[byteArray.length] = (byte) i13;
            bArr5[byteArray.length + 1] = (byte) (i13 >>> 8);
            bArr5[byteArray.length + 2] = (byte) (i13 >>> 16);
            bArr5[byteArray.length + 3] = (byte) (i13 >>> 24);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        return new a35(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
