package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h1 implements fs {
    public final /* synthetic */ String a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ i1 c;
    public final /* synthetic */ File[] d;
    public final /* synthetic */ File e;
    public final /* synthetic */ CountDownLatch f;

    public h1(String str, long[] jArr, i1 i1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = jArr;
        this.c = i1Var;
        this.d = fileArr;
        this.e = file;
        this.f = countDownLatch;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        File file;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            String str = this.a;
            if (str.equals(obj)) {
                this.b[0] = SystemClock.elapsedRealtime();
                if (i7 == ks.X1) {
                    this.c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i7 == ks.Y1) {
                    if (objArr.length > 1) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof File) {
                            file = (File) obj2;
                            this.d[0] = file;
                        }
                    }
                    file = this.e;
                    this.d[0] = file;
                } else {
                    if (i7 != ks.Z1) {
                        return;
                    }
                    StringBuilder u10 = a8.p0.u("speech models: ", str, " download failed (");
                    u10.append(objArr.length > 1 ? objArr[1] : "");
                    u10.append(")");
                    Log.d("Dictation", u10.toString());
                    mp.g1().edit().remove("speech_models_checked").apply();
                }
                this.f.countDown();
            }
        }
    }
}
