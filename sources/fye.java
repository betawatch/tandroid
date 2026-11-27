// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class fye {
    public static ot9 a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new ot9();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                hashMap.put(str, bundle2.get(str));
            }
            return new ot9(hashMap);
        }
        ClassLoader classLoader = ot9.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            grb.i("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new ot9(linkedHashMap);
    }
}
