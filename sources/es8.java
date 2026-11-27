// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class es8 {
    public final String a;
    public final Runnable b;
    public final String c;
    public final String[] d;
    public final int e;
    public final short f;
    public int g;
    public String h;

    /* JADX WARN: Multi-variable type inference failed */
    public es8(int i, String str, String str2, String str3, String str4, int i2, Runnable runnable) {
        this.f = i;
        this.a = str;
        this.c = str2;
        this.b = runnable;
        this.e = i2;
        if (str3 != null) {
            if (str4 != null) {
                this.d = new String[]{str3, str4};
            } else {
                this.d = new String[]{str3};
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof es8) && this.f == ((es8) obj).f;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f);
        return Utilities.f(serializedData.toByteArray());
    }

    public es8(int i, String str, String str2, int i2, Runnable runnable) {
        this(i, str, null, str2, null, i2, runnable);
    }

    public es8(int i, String str, String str2, String str3, int i2, Runnable runnable) {
        this(i, str, str2, str3, null, i2, runnable);
    }

    public es8(int i, String str, int i2, Runnable runnable) {
        this(i, str, null, null, null, i2, runnable);
    }
}
