// default package

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class on3 implements fn7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ pn3 c;
    public final /* synthetic */ File[] d;
    public final /* synthetic */ File e;
    public final /* synthetic */ CountDownLatch f;

    public on3(String str, long[] jArr, pn3 pn3Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = jArr;
        this.c = pn3Var;
        this.d = fileArr;
        this.e = file;
        this.f = countDownLatch;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        File file;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            String str = this.a;
            if (str.equals(obj)) {
                this.b[0] = SystemClock.elapsedRealtime();
                if (i == jn7.X1) {
                    this.c.a(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i == jn7.Y1) {
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
                    if (i != jn7.Z1) {
                        return;
                    }
                    StringBuilder p = ik8.p("speech models: ", str, " download failed (");
                    p.append(objArr.length > 1 ? objArr[1] : "");
                    p.append(")");
                    Log.d("Dictation", p.toString());
                    uc7.e1().edit().remove("speech_models_checked").apply();
                }
                this.f.countDown();
            }
        }
    }
}
