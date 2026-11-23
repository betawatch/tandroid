package c8;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class bb {
    public static int[] a;

    public static int a(ArrayList arrayList, ca.q qVar) {
        int size = arrayList.size();
        ArrayList arrayList2 = qVar.a;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList2.get(i7);
            i7++;
            org.telegram.ui.Wallet.y3 y3Var = (org.telegram.ui.Wallet.y3) obj;
            org.telegram.ui.Wallet.y3 y3Var2 = new org.telegram.ui.Wallet.y3();
            y3Var2.a = y3Var.a;
            y3Var2.b = y3Var.b;
            y3Var2.c = y3Var.c;
            y3Var2.d = new int[y3Var.d.length];
            int i10 = 0;
            while (true) {
                int[] iArr = y3Var.d;
                if (i10 < iArr.length) {
                    y3Var2.d[i10] = iArr[i10] + size;
                    i10++;
                }
            }
            arrayList.add(y3Var2);
        }
        return qVar.b + size;
    }

    public static ca.q b(byte[] bArr) {
        if (c(0, 4, bArr) != -1242653582) {
            throw new IllegalArgumentException("Unsupported BOC");
        }
        int i7 = bArr[4];
        boolean z10 = (i7 & 128) != 0;
        int i10 = i7 & 7;
        int i11 = bArr[5] & ks.e4;
        int c10 = c(6, i10, bArr);
        int i12 = 6 + i10;
        int c11 = c(i12, i10, bArr);
        int i13 = i12 + i10 + i10 + i11;
        if (c11 != 1) {
            throw new IllegalArgumentException("Expected one root cell");
        }
        int c12 = c(i13, i10, bArr);
        int i14 = i13 + i10;
        if (z10) {
            i14 += i11 * c10;
        }
        ca.q qVar = new ca.q();
        qVar.a = new ArrayList();
        qVar.b = c12;
        for (int i15 = 0; i15 < c10; i15++) {
            org.telegram.ui.Wallet.y3 y3Var = new org.telegram.ui.Wallet.y3();
            int i16 = i14 + 1;
            int i17 = bArr[i14];
            y3Var.a = i17 & ks.e4;
            int i18 = i14 + 2;
            int i19 = bArr[i16] & ks.e4;
            y3Var.b = i19;
            if ((i17 & 16) != 0) {
                throw new IllegalArgumentException("Cells with cached hashes are not supported");
            }
            int i20 = i17 & 7;
            int i21 = (i19 + 1) / 2;
            byte[] bArr2 = new byte[i21];
            y3Var.c = bArr2;
            System.arraycopy(bArr, i18, bArr2, 0, i21);
            i14 = i18 + i21;
            y3Var.d = new int[i20];
            for (int i22 = 0; i22 < i20; i22++) {
                y3Var.d[i22] = c(i14, i10, bArr);
                i14 += i10;
            }
            qVar.a.add(y3Var);
        }
        return qVar;
    }

    public static int c(int i7, int i10, byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 << 8) | (bArr[i7 + i12] & 255);
        }
        return i11;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            byteArrayOutputStream.write((i7 >>> (i11 * 8)) & ks.e4);
        }
    }
}
