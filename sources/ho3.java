// default package

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ho3 implements jm7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ io3 c;
    public final /* synthetic */ File[] d;
    public final /* synthetic */ File e;
    public final /* synthetic */ CountDownLatch f;

    public ho3(String str, long[] jArr, io3 io3Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = jArr;
        this.c = io3Var;
        this.d = fileArr;
        this.e = file;
        this.f = countDownLatch;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        File file;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            String str = this.a;
            if (str.equals(obj)) {
                this.b[0] = SystemClock.elapsedRealtime();
                if (i == nm7.X1) {
                    this.c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i == nm7.Y1) {
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
                    if (i != nm7.Z1) {
                        return;
                    }
                    StringBuilder p = wi8.p("speech models: ", str, " download failed (");
                    p.append(objArr.length > 1 ? objArr[1] : "");
                    p.append(")");
                    Log.d("Dictation", p.toString());
                    oc7.d1().edit().remove("speech_models_checked").apply();
                }
                this.f.countDown();
            }
        }
    }
}
