// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0c implements kcc {
    public final /* synthetic */ n0c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Boolean d;

    public /* synthetic */ d0c(n0c n0cVar, String str, long j, Boolean bool) {
        this.a = n0cVar;
        this.b = str;
        this.c = j;
        this.d = bool;
    }

    @Override // kcc
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        pyb pybVar = (pyb) obj2;
        Integer num = (Integer) obj3;
        n0c n0cVar = this.a;
        ArrayList arrayList2 = n0cVar.N;
        n0cVar.O = 0;
        if (this.b.equals(n0cVar.M)) {
            if (this.c == n0cVar.V) {
                if (Objects.equals(this.d, n0cVar.W)) {
                    arrayList2.addAll(arrayList);
                    n0cVar.Q = pybVar;
                    n0cVar.R = pybVar == null || arrayList2.size() >= num.intValue();
                    n0cVar.n();
                }
            }
        }
    }
}
