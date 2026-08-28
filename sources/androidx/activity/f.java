package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i9) {
        this.a = i9;
        this.b = mVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                Bundle c10 = ((g2.e) mVar.e.c).c("android:support:activity-result");
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
                        for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                            String str = stringArrayList.get(i9);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i9);
                            num2.intValue();
                            String str2 = stringArrayList.get(i9);
                            hashMap2.put(num2, str2);
                            hVar.b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                androidx.fragment.app.u uVar = (androidx.fragment.app.u) ((androidx.fragment.app.v) this.b).F.b;
                uVar.d.b(uVar, uVar, null);
                break;
        }
    }
}
