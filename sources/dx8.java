// default package

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dx8 implements ga4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public cx8 b;

    public dx8(File file) {
        this.a = file;
    }

    @Override // ga4
    public final void a() {
        pm2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // ga4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        bf0 bf0Var;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new cx8(file);
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
                }
            }
            cx8 cx8Var = this.b;
            if (cx8Var != null) {
                int[] iArr = {0};
                int i = 16;
                if (cx8Var.c != 0) {
                    zw8 zw8Var = cx8Var.e;
                    int i2 = zw8Var.b;
                    int i3 = cx8Var.d.b;
                    int i4 = zw8Var.c;
                    i = i2 >= i3 ? 16 + (i2 - i3) + 4 + i4 : (((i2 + 4) + i4) + cx8Var.b) - i3;
                }
                byte[] bArr2 = new byte[i];
                try {
                    cx8Var.a(new sk4(bArr2, iArr, (byte) 18));
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e2);
                }
                bf0Var = new bf0(iArr[0], bArr2);
                if (bf0Var != null) {
                    bArr = null;
                } else {
                    int i5 = bf0Var.b;
                    bArr = new byte[i5];
                    System.arraycopy(bf0Var.a, 0, bArr, 0, i5);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        bf0Var = null;
        if (bf0Var != null) {
        }
        if (bArr == null) {
        }
    }
}
