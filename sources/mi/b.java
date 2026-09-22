package mi;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class b {
    public static SparseIntArray b;
    public static final b c = new b();
    public final SparseArray a;

    public b() {
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

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.a.get(str.hashCode());
    }

    public final String c(Context context, String str, int i10) {
        String b10 = str != null ? b(str) : null;
        if (b10 != null || i10 == 0) {
            return b10;
        }
        if (context != null && i10 != 0) {
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
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            int i12 = b.get(i10);
            if (i12 != 0) {
                return (String) this.a.get(i12);
            }
        }
        return null;
    }

    public b(a aVar) {
        SparseArray sparseArray = aVar.a;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
