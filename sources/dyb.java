// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dyb implements lac {
    public final /* synthetic */ oyb a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Boolean d;

    public /* synthetic */ dyb(oyb oybVar, String str, long j, Boolean bool) {
        this.a = oybVar;
        this.b = str;
        this.c = j;
        this.d = bool;
    }

    @Override // lac
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        pwb pwbVar = (pwb) obj2;
        Integer num = (Integer) obj3;
        oyb oybVar = this.a;
        ArrayList arrayList2 = oybVar.N;
        oybVar.O = 0;
        if (this.b.equals(oybVar.M)) {
            if (this.c == oybVar.V) {
                if (Objects.equals(this.d, oybVar.W)) {
                    arrayList2.addAll(arrayList);
                    oybVar.Q = pwbVar;
                    oybVar.R = pwbVar == null || arrayList2.size() >= num.intValue();
                    oybVar.n();
                }
            }
        }
    }
}
