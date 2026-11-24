// default package

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ez8 implements gc4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public dz8 b;

    public ez8(File file) {
        this.a = file;
    }

    @Override // gc4
    public final void a() {
        bo2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // gc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        bg0 bg0Var;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new dz8(file);
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
                }
            }
            dz8 dz8Var = this.b;
            if (dz8Var != null) {
                int[] iArr = {0};
                int i = 16;
                if (dz8Var.c != 0) {
                    az8 az8Var = dz8Var.e;
                    int i2 = az8Var.b;
                    int i3 = dz8Var.d.b;
                    int i4 = az8Var.c;
                    i = i2 >= i3 ? 16 + (i2 - i3) + 4 + i4 : (((i2 + 4) + i4) + dz8Var.b) - i3;
                }
                byte[] bArr2 = new byte[i];
                try {
                    dz8Var.a(new mj4(bArr2, iArr, (byte) 20));
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e2);
                }
                bg0Var = new bg0(iArr[0], bArr2);
                if (bg0Var != null) {
                    bArr = null;
                } else {
                    int i5 = bg0Var.b;
                    bArr = new byte[i5];
                    System.arraycopy(bg0Var.a, 0, bArr, 0, i5);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        bg0Var = null;
        if (bg0Var != null) {
        }
        if (bArr == null) {
        }
    }
}
