// default package

import android.graphics.Bitmap;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
