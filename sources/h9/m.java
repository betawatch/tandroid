package h9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m implements c {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public k b;

    public m(File file) {
        this.a = file;
    }

    @Override // h9.c
    public final void b() {
        g9.h.c(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    @Override // h9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i() {
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
                int i10 = 16;
                if (kVar.c != 0) {
                    h hVar = kVar.e;
                    int i11 = hVar.a;
                    int i12 = hVar.b;
                    int i13 = kVar.d.a;
                    i10 = i11 >= i13 ? 16 + (i11 - i13) + 4 + i12 : (((i11 + 4) + i12) + kVar.b) - i13;
                }
                byte[] bArr2 = new byte[i10];
                try {
                    kVar.a(new e(bArr2, iArr));
                } catch (IOException e11) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e11);
                }
                lVar = new l(bArr2, iArr[0]);
                if (lVar != null) {
                    bArr = null;
                } else {
                    int i14 = lVar.a;
                    bArr = new byte[i14];
                    System.arraycopy(lVar.b, 0, bArr, 0, i14);
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
