package jf;

import a6.m;
import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a {
    public static SparseIntArray b;
    public static final a c = new a();
    public final SparseArray a;

    public a() {
        this.a = new SparseArray();
    }

    public static SparseArray a(Context context, String str, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i10 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i10 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i10++;
                }
            } else {
                while (i10 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i10++;
                }
            }
            bufferedInputStream.close();
            return sparseArray;
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String b(Context context, int i10) {
        if (context == null || i10 == 0) {
            return null;
        }
        if (b == null) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                try {
                    SerializedData serializedData = new SerializedData(bufferedInputStream);
                    int readInt32 = serializedData.readInt32(true);
                    SparseIntArray sparseIntArray = new SparseIntArray(readInt32);
                    for (int i11 = 0; i11 < readInt32; i11++) {
                        sparseIntArray.append(serializedData.readInt32(true), serializedData.readInt32(true));
                    }
                    bufferedInputStream.close();
                    b = sparseIntArray;
                } finally {
                }
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        int i12 = b.get(i10);
        if (i12 == 0) {
            return null;
        }
        return (String) this.a.get(i12);
    }

    public final String c(Context context, String str, int i10) {
        String str2 = str != null ? (String) this.a.get(str.hashCode()) : null;
        return (str2 != null || i10 == 0) ? str2 : b(context, i10);
    }

    public a(m mVar) {
        SparseArray sparseArray = (SparseArray) mVar.b;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
