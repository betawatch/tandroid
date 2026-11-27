// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class e31 {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length << 3) + 5) / 6) + 3) / 4) << 2;
        StringBuilder sb = new StringBuilder(length);
        int i5 = 0;
        while (true) {
            int i6 = i5 / 8;
            if (bArr.length <= i6) {
                i2 = -1;
            } else {
                int i7 = bArr.length - 1 == i6 ? 0 : bArr[i6 + 1];
                int i8 = (i5 % 24) / 6;
                if (i8 != 0) {
                    if (i8 == 1) {
                        i3 = (bArr[i6] << 4) & 48;
                        i4 = (i7 >> 4) & 15;
                    } else if (i8 == 2) {
                        i3 = (bArr[i6] << 2) & 60;
                        i4 = (i7 >> 6) & 3;
                    } else if (i8 != 3) {
                        i2 = 0;
                    } else {
                        i = bArr[i6];
                    }
                    i2 = i3 | i4;
                } else {
                    i = bArr[i6] >> 2;
                }
                i2 = i & 63;
            }
            if (i2 < 0) {
                break;
            }
            sb.append((char) a[i2]);
            i5 += 6;
        }
        for (int length2 = sb.length(); length2 < length; length2++) {
            sb.append('=');
        }
        return sb.toString();
    }

    public static j99 b(es4 es4Var, ArrayList arrayList) {
        mo5 p = po5.p();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            p.c(es4Var.apply(bundle));
        }
        return p.f();
    }

    public static ArrayList c(Collection collection, es4 es4Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) es4Var.apply(it.next()));
        }
        return arrayList;
    }
}
