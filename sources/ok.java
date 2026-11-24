// default package

import android.graphics.Bitmap;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ok implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ok(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                zArr[0] = i == 0;
                countDownLatch.countDown();
                break;
            default:
                fi6 fi6Var = (fi6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                fi6Var.h = false;
                if (!fi6Var.i && i == 0) {
                    fi6Var.f = fi6Var.e;
                    fi6Var.e = bitmap;
                    fi6Var.a.run();
                    break;
                }
                break;
        }
    }
}
