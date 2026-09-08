package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                Bundle c10 = ((m.p) mVar.e.d).c("android:support:activity-result");
                if (c10 != null) {
                    h hVar = mVar.w;
                    HashMap hashMap = hVar.b;
                    HashMap hashMap2 = hVar.a;
                    Bundle bundle = hVar.g;
                    ArrayList<Integer> integerArrayList = c10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        hVar.d = c10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(c10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                            String str = stringArrayList.get(i10);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i10);
                            num2.intValue();
                            String str2 = stringArrayList.get(i10);
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
