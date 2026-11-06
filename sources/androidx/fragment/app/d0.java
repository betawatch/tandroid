package androidx.fragment.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ int a;

    public final Object a(Intent intent, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i10 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(hd.h.d(arrayList2, 10), hd.h.d(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new gd.e(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new androidx.activity.result.a(intent, i7);
    }
}
