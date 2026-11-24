// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o32 implements u32 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv2 b;

    public /* synthetic */ o32(yv2 yv2Var, byte b) {
        this.a = b;
        this.b = yv2Var;
    }

    @Override // u32
    public final String run() {
        byte b = this.a;
        yv2 yv2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = yv2Var.e;
                return !arrayList.isEmpty() ? r58.f().e((String) arrayList.get(0)) : "";
            default:
                ArrayList arrayList2 = yv2Var.e;
                return !arrayList2.isEmpty() ? r58.f().e((String) arrayList2.get(0)) : "";
        }
    }
}
