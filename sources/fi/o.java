package fi;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
