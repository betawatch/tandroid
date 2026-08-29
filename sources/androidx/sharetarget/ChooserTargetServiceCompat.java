package androidx.sharetarget;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import h2.a;
import h2.b;
import h2.c;
import h2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Context applicationContext = getApplicationContext();
        if (d.a == null) {
            synchronized (d.b) {
                try {
                    if (d.a == null) {
                        d.a = d.e(applicationContext);
                    }
                } finally {
                }
            }
        }
        ArrayList arrayList = d.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            if (cVar.b.equals(componentName.getClassName())) {
                b[] bVarArr = cVar.a;
                int length = bVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(bVarArr[i11].a)) {
                        arrayList2.add(cVar);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
        try {
            List<g0.c> b10 = shortcutInfoCompatSaverImpl.b();
            if (b10 == null || b10.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList3 = new ArrayList();
            for (g0.c cVar2 : b10) {
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        c cVar3 = (c) obj2;
                        if (cVar2.j.containsAll(Arrays.asList(cVar3.c))) {
                            arrayList3.add(new a(cVar2, new ComponentName(applicationContext.getPackageName(), cVar3.b)));
                            break;
                        }
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                return new ArrayList();
            }
            Collections.sort(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int i13 = ((a) arrayList3.get(0)).a.m;
            int size3 = arrayList3.size();
            float f9 = 1.0f;
            int i14 = i13;
            int i15 = 0;
            while (i15 < size3) {
                int i16 = i15 + 1;
                a aVar = (a) arrayList3.get(i15);
                g0.c cVar4 = aVar.a;
                try {
                    iconCompat = shortcutInfoCompatSaverImpl.g(cVar4.b);
                } catch (Exception e10) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e10);
                    iconCompat = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", cVar4.b);
                int i17 = cVar4.m;
                if (i14 != i17) {
                    f9 -= 0.01f;
                    i14 = i17;
                }
                float f10 = f9;
                arrayList4.add(new ChooserTarget(cVar4.e, iconCompat != null ? iconCompat.m(null) : null, f10, aVar.b, bundle));
                i15 = i16;
                f9 = f10;
            }
            return arrayList4;
        } catch (Exception e11) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e11);
            return Collections.EMPTY_LIST;
        }
    }
}
