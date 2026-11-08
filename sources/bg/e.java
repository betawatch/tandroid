package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ e(int i7, ArrayList arrayList) {
        this.a = i7;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                break;
            default:
                sg.b0.h = this.b;
                sg.b0.i = false;
                qs.e().k(qs.C5, new Object[0]);
                break;
        }
    }
}
