// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class it2 extends iwc {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it2(String str, cwc cwcVar, int i, byte b) {
        super(str, cwcVar, i);
        this.b = b;
    }

    @Override // iwc
    public final void a() {
        byte b = this.b;
        cwc cwcVar = this.a;
        switch (b) {
            case 0:
                try {
                    cwcVar.b();
                    break;
                } catch (dwc e) {
                    yh4 yh4Var = cwcVar.d;
                    yh4Var.f(e);
                    ArrayList arrayList = (ArrayList) yh4Var.u();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        o35 o35Var = (o35) obj;
                        try {
                            try {
                                gm.c3(new up6((Object) o35Var.c, yh4Var.b, o35Var.a, (Object) "connect error: ".concat(p35.b(e)), (byte) 25));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            o35Var.getClass();
                        }
                    }
                    return;
                }
            default:
                cwcVar.d();
                break;
        }
    }
}
