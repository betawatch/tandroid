package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                Bundle c10 = ((m.q) lVar.e.d).c("android:support:activity-result");
                if (c10 != null) {
                    h hVar = lVar.x;
                    HashMap hashMap = hVar.b;
                    HashMap hashMap2 = hVar.a;
                    Bundle bundle = hVar.g;
                    ArrayList<Integer> integerArrayList = c10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        hVar.d = c10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(c10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                            String str = stringArrayList.get(i7);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i7);
                            num2.intValue();
                            String str2 = stringArrayList.get(i7);
                            hashMap2.put(num2, str2);
                            hVar.b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                androidx.fragment.app.t tVar = (androidx.fragment.app.t) ((androidx.fragment.app.u) this.b).J.b;
                tVar.d.b(tVar, tVar, null);
                break;
        }
    }
}
