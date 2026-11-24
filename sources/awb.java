// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class awb implements k8c {
    public final /* synthetic */ lwb a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Boolean d;

    public /* synthetic */ awb(lwb lwbVar, String str, long j, Boolean bool) {
        this.a = lwbVar;
        this.b = str;
        this.c = j;
        this.d = bool;
    }

    @Override // k8c
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        oub oubVar = (oub) obj2;
        Integer num = (Integer) obj3;
        lwb lwbVar = this.a;
        ArrayList arrayList2 = lwbVar.N;
        lwbVar.O = 0;
        if (this.b.equals(lwbVar.M)) {
            if (this.c == lwbVar.V) {
                if (Objects.equals(this.d, lwbVar.W)) {
                    arrayList2.addAll(arrayList);
                    lwbVar.Q = oubVar;
                    lwbVar.R = oubVar == null || arrayList2.size() >= num.intValue();
                    lwbVar.n();
                }
            }
        }
    }
}
