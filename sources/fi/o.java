package fi;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ la b;

    public /* synthetic */ o(la laVar, int i7) {
        this.a = i7;
        this.b = laVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                la laVar = this.b;
                laVar.setPeriod(intValue);
                c20 c20Var = laVar.A1;
                if (c20Var != null) {
                    c20Var.a(num);
                    break;
                }
                break;
            default:
                c20 c20Var2 = this.b.B1;
                if (c20Var2 != null) {
                    c20Var2.a(num);
                    break;
                }
                break;
        }
    }
}
