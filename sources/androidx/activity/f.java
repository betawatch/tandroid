package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i3) {
        this.a = i3;
        this.b = lVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                Bundle c2 = ((m.p) lVar.e.d).c("android:support:activity-result");
                if (c2 != null) {
                    h hVar = lVar.x;
                    HashMap hashMap = hVar.b;
                    HashMap hashMap2 = hVar.a;
                    Bundle bundle = hVar.g;
                    ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        hVar.d = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                            String str = stringArrayList.get(i3);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            hashMap2.put(num2, str2);
                            hVar.b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                androidx.fragment.app.u uVar = (androidx.fragment.app.u) ((androidx.fragment.app.v) this.b).K.b;
                uVar.d.b(uVar, uVar, null);
                break;
        }
    }
}
