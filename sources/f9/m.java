package f9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements c {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public k b;

    public m(File file) {
        this.a = file;
    }

    @Override // f9.c
    public final void b() {
        e9.h.c(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    @Override // f9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        l lVar;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new k(file);
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
                }
            }
            k kVar = this.b;
            if (kVar != null) {
                int[] iArr = {0};
                int i9 = 16;
                if (kVar.c != 0) {
                    h hVar = kVar.e;
                    int i10 = hVar.a;
                    int i11 = hVar.b;
                    int i12 = kVar.d.a;
                    i9 = i10 >= i12 ? 16 + (i10 - i12) + 4 + i11 : (((i10 + 4) + i11) + kVar.b) - i12;
                }
                byte[] bArr2 = new byte[i9];
                try {
                    kVar.a(new e(bArr2, iArr));
                } catch (IOException e11) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e11);
                }
                lVar = new l(bArr2, iArr[0]);
                if (lVar != null) {
                    bArr = null;
                } else {
                    int i13 = lVar.a;
                    bArr = new byte[i13];
                    System.arraycopy(lVar.b, 0, bArr, 0, i13);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        lVar = null;
        if (lVar != null) {
        }
        if (bArr == null) {
        }
    }
}
