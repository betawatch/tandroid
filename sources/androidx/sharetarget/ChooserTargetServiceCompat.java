package androidx.sharetarget;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Context applicationContext = getApplicationContext();
        if (lhd.a == null) {
            synchronized (lhd.b) {
                if (lhd.a == null) {
                    lhd.a = lhd.c(applicationContext);
                }
            }
        }
        ArrayList arrayList = lhd.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qea qeaVar = (qea) obj;
            if (qeaVar.b.equals(componentName.getClassName())) {
                pea[] peaVarArr = qeaVar.a;
                int length = peaVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(peaVarArr[i2].a)) {
                        arrayList2.add(qeaVar);
                        break;
                    }
                    i2++;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
        try {
            List<hka> b = shortcutInfoCompatSaverImpl.b();
            if (b == null || b.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList3 = new ArrayList();
            for (hka hkaVar : b) {
                int size2 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        qea qeaVar2 = (qea) obj2;
                        if (hkaVar.j.containsAll(Arrays.asList(qeaVar2.c))) {
                            arrayList3.add(new gh2(hkaVar, new ComponentName(applicationContext.getPackageName(), qeaVar2.b)));
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
            int i4 = ((gh2) arrayList3.get(0)).a.m;
            int size3 = arrayList3.size();
            float f = 1.0f;
            int i5 = i4;
            int i6 = 0;
            while (i6 < size3) {
                int i7 = i6 + 1;
                gh2 gh2Var = (gh2) arrayList3.get(i6);
                hka hkaVar2 = gh2Var.a;
                try {
                    iconCompat = shortcutInfoCompatSaverImpl.g(hkaVar2.b);
                } catch (Exception e) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e);
                    iconCompat = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", hkaVar2.b);
                int i8 = hkaVar2.m;
                if (i5 != i8) {
                    f -= 0.01f;
                    i5 = i8;
                }
                float f2 = f;
                arrayList4.add(new ChooserTarget(hkaVar2.e, iconCompat != null ? jpe.a(iconCompat, null) : null, f2, gh2Var.b, bundle));
                i6 = i7;
                f = f2;
            }
            return arrayList4;
        } catch (Exception e2) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e2);
            return Collections.EMPTY_LIST;
        }
    }
}
