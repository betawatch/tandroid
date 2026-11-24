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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Context applicationContext = getApplicationContext();
        if (ued.a == null) {
            synchronized (ued.b) {
                if (ued.a == null) {
                    ued.a = ued.c(applicationContext);
                }
            }
        }
        ArrayList arrayList = ued.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zca zcaVar = (zca) obj;
            if (zcaVar.b.equals(componentName.getClassName())) {
                yca[] ycaVarArr = zcaVar.a;
                int length = ycaVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(ycaVarArr[i2].a)) {
                        arrayList2.add(zcaVar);
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
            List<qia> b = shortcutInfoCompatSaverImpl.b();
            if (b == null || b.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList3 = new ArrayList();
            for (qia qiaVar : b) {
                int size2 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        zca zcaVar2 = (zca) obj2;
                        if (qiaVar.j.containsAll(Arrays.asList(zcaVar2.c))) {
                            arrayList3.add(new ci2(qiaVar, new ComponentName(applicationContext.getPackageName(), zcaVar2.b)));
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
            int i4 = ((ci2) arrayList3.get(0)).a.m;
            int size3 = arrayList3.size();
            float f = 1.0f;
            int i5 = i4;
            int i6 = 0;
            while (i6 < size3) {
                int i7 = i6 + 1;
                ci2 ci2Var = (ci2) arrayList3.get(i6);
                qia qiaVar2 = ci2Var.a;
                try {
                    iconCompat = shortcutInfoCompatSaverImpl.g(qiaVar2.b);
                } catch (Exception e) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e);
                    iconCompat = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", qiaVar2.b);
                int i8 = qiaVar2.m;
                if (i5 != i8) {
                    f -= 0.01f;
                    i5 = i8;
                }
                float f2 = f;
                arrayList4.add(new ChooserTarget(qiaVar2.e, iconCompat != null ? pme.a(iconCompat, null) : null, f2, ci2Var.b, bundle));
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
