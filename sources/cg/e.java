package cg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ e(int i3, ArrayList arrayList) {
        this.a = i3;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((Bitmap) obj).recycle();
                }
                break;
            default:
                tg.b0.h = this.b;
                tg.b0.i = false;
                hs.e().k(hs.C5, new Object[0]);
                break;
        }
    }
}
