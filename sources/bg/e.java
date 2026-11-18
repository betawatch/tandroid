package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                sg.a0.h = this.b;
                sg.a0.i = false;
                ks.e().k(ks.E5, new Object[0]);
                break;
        }
    }
}
