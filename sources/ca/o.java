package ca;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class o implements d {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public m b;

    public o(File file) {
        this.a = file;
    }

    @Override // ca.d
    public final void b() {
        aa.g.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    @Override // ca.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m() {
        n nVar;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new m(file);
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
                }
            }
            m mVar = this.b;
            if (mVar != null) {
                int[] iArr = {0};
                int i7 = 16;
                if (mVar.c != 0) {
                    j jVar = mVar.e;
                    int i10 = jVar.a;
                    int i11 = jVar.b;
                    int i12 = mVar.d.a;
                    i7 = i10 >= i12 ? 16 + (i10 - i12) + 4 + i11 : (((i10 + 4) + i11) + mVar.b) - i12;
                }
                byte[] bArr2 = new byte[i7];
                try {
                    mVar.a(new f(bArr2, iArr));
                } catch (IOException e11) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e11);
                }
                nVar = new n(bArr2, iArr[0]);
                if (nVar != null) {
                    bArr = null;
                } else {
                    int i13 = nVar.a;
                    bArr = new byte[i13];
                    System.arraycopy(nVar.b, 0, bArr, 0, i13);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        nVar = null;
        if (nVar != null) {
        }
        if (bArr == null) {
        }
    }
}
