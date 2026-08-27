package h7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class q8 {
    public static void A(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new a7.c(a9.p.p(com.google.android.recaptcha.internal.a.p("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static void B(Parcel parcel, int i10, int i11) {
        int x8 = x(parcel, i10);
        if (x8 == i11) {
            return;
        }
        throw new a7.c(a9.p.p(com.google.android.recaptcha.internal.a.p("Expected size ", i11, " got ", x8, " (0x"), Integer.toHexString(x8), ")"), parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x8);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x8);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + x8);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x8);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + x8);
        return arrayList;
    }

    public static long[] f(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + x8);
        return createLongArray;
    }

    public static Parcelable g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x8);
        return parcelable;
    }

    public static String h(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x8);
        return readString;
    }

    public static String[] i(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x8);
        return createStringArray;
    }

    public static ArrayList j(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x8);
        return createStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i10, Parcelable.Creator creator) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x8);
        return createTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i10, Parcelable.Creator creator) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x8);
        return createTypedArrayList;
    }

    public static void m(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a7.c(i0.a.k(i10, "Overread allowed size end="), parcel);
        }
    }

    public static boolean n(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean o(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        if (x8 == 0) {
            return null;
        }
        A(parcel, x8, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte p(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float r(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        if (x8 == 0) {
            return null;
        }
        A(parcel, x8, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder t(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x8 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x8);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i10) {
        int x8 = x(parcel, i10);
        if (x8 == 0) {
            return null;
        }
        A(parcel, x8, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void y(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i10));
    }

    public static int z(Parcel parcel) {
        int readInt = parcel.readInt();
        int x8 = x(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new a7.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i10 = x8 + dataPosition;
        if (i10 < dataPosition || i10 > parcel.dataSize()) {
            throw new a7.c(a9.p.j(dataPosition, i10, "Size read is invalid start=", " end="), parcel);
        }
        return i10;
    }
}
