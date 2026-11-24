// default package

import com.google.android.recaptcha.internal.zzsw;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class haf {
    public static /* synthetic */ void a() {
        throw new zzsw("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void b(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void c(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void d(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }
}
