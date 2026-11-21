package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v01 implements org.telegram.messenger.s10 {
    public final /* synthetic */ h11 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Boolean d;

    public /* synthetic */ v01(h11 h11Var, String str, long j3, Boolean bool) {
        this.a = h11Var;
        this.b = str;
        this.c = j3;
        this.d = bool;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.d00 d00Var = (org.telegram.messenger.d00) obj2;
        Integer num = (Integer) obj3;
        h11 h11Var = this.a;
        ArrayList arrayList2 = h11Var.N;
        h11Var.O = 0;
        if (this.b.equals(h11Var.M)) {
            if (this.c == h11Var.V) {
                if (Objects.equals(this.d, h11Var.W)) {
                    arrayList2.addAll(arrayList);
                    h11Var.Q = d00Var;
                    h11Var.R = d00Var == null || arrayList2.size() >= num.intValue();
                    h11Var.n();
                }
            }
        }
    }
}
