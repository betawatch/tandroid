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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Context applicationContext = getApplicationContext();
        if (scd.a == null) {
            synchronized (scd.b) {
                if (scd.a == null) {
                    scd.a = scd.c(applicationContext);
                }
            }
        }
        ArrayList arrayList = scd.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zaa zaaVar = (zaa) obj;
            if (zaaVar.b.equals(componentName.getClassName())) {
                yaa[] yaaVarArr = zaaVar.a;
                int length = yaaVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(yaaVarArr[i2].a)) {
                        arrayList2.add(zaaVar);
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
            List<oga> b = shortcutInfoCompatSaverImpl.b();
            if (b == null || b.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList3 = new ArrayList();
            for (oga ogaVar : b) {
                int size2 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        zaa zaaVar2 = (zaa) obj2;
                        if (ogaVar.j.containsAll(Arrays.asList(zaaVar2.c))) {
                            arrayList3.add(new og2(ogaVar, new ComponentName(applicationContext.getPackageName(), zaaVar2.b)));
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
            int i4 = ((og2) arrayList3.get(0)).a.m;
            int size3 = arrayList3.size();
            float f = 1.0f;
            int i5 = i4;
            int i6 = 0;
            while (i6 < size3) {
                int i7 = i6 + 1;
                og2 og2Var = (og2) arrayList3.get(i6);
                oga ogaVar2 = og2Var.a;
                try {
                    iconCompat = shortcutInfoCompatSaverImpl.g(ogaVar2.b);
                } catch (Exception e) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e);
                    iconCompat = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", ogaVar2.b);
                int i8 = ogaVar2.m;
                if (i5 != i8) {
                    f -= 0.01f;
                    i5 = i8;
                }
                float f2 = f;
                arrayList4.add(new ChooserTarget(ogaVar2.e, iconCompat != null ? nke.a(iconCompat, null) : null, f2, og2Var.b, bundle));
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
