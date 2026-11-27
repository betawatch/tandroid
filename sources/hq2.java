// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class hq2 implements ut9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hq2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ut9
    public final Bundle c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                jq2 jq2Var = ((pq2) obj).x;
                jq2Var.getClass();
                HashMap hashMap = jq2Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jq2Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) jq2Var.g.clone());
                return bundle;
            case 1:
                jp4 jp4Var = (jp4) obj;
                while (jp4.v(jp4Var.u())) {
                }
                jp4Var.L.e(y26.ON_STOP);
                return new Bundle();
            case 2:
                return ((kq4) obj).Y();
            default:
                return ot9.a((ot9) obj);
        }
    }
}
