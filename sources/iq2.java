// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq2 b;

    public /* synthetic */ iq2(pq2 pq2Var, byte b) {
        this.a = b;
        this.b = pq2Var;
    }

    public final void a() {
        byte b = this.a;
        pq2 pq2Var = this.b;
        switch (b) {
            case 0:
                Bundle c = ((po) pq2Var.e.d).c("android:support:activity-result");
                if (c != null) {
                    jq2 jq2Var = pq2Var.x;
                    HashMap hashMap = jq2Var.b;
                    HashMap hashMap2 = jq2Var.a;
                    Bundle bundle = jq2Var.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        jq2Var.d = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            hashMap2.put(num2, str2);
                            jq2Var.b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                ip4 ip4Var = (ip4) ((jp4) pq2Var).K.b;
                ip4Var.d.b(ip4Var, ip4Var, null);
                break;
        }
    }
}
