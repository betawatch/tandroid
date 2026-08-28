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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            c cVar = (c) obj;
            if (cVar.b.equals(componentName.getClassName())) {
                b[] bVarArr = cVar.a;
                int length = bVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(bVarArr[i10].a)) {
                        arrayList2.add(cVar);
                        break;
                    }
                    i10++;
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
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
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
            int i12 = ((a) arrayList3.get(0)).a.m;
            int size3 = arrayList3.size();
            float f10 = 1.0f;
            int i13 = i12;
            int i14 = 0;
            while (i14 < size3) {
                int i15 = i14 + 1;
                a aVar = (a) arrayList3.get(i14);
                g0.c cVar4 = aVar.a;
                try {
                    iconCompat = shortcutInfoCompatSaverImpl.g(cVar4.b);
                } catch (Exception e10) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e10);
                    iconCompat = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", cVar4.b);
                int i16 = cVar4.m;
                if (i13 != i16) {
                    f10 -= 0.01f;
                    i13 = i16;
                }
                float f11 = f10;
                arrayList4.add(new ChooserTarget(cVar4.e, iconCompat != null ? iconCompat.m(null) : null, f11, aVar.b, bundle));
                i14 = i15;
                f10 = f11;
            }
            return arrayList4;
        } catch (Exception e11) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e11);
            return Collections.EMPTY_LIST;
        }
    }
}
