package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u01 implements org.telegram.messenger.t10 {
    public final /* synthetic */ g11 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Boolean d;

    public /* synthetic */ u01(g11 g11Var, String str, long j3, Boolean bool) {
        this.a = g11Var;
        this.b = str;
        this.c = j3;
        this.d = bool;
    }

    @Override // org.telegram.messenger.t10
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.e00 e00Var = (org.telegram.messenger.e00) obj2;
        Integer num = (Integer) obj3;
        g11 g11Var = this.a;
        ArrayList arrayList2 = g11Var.N;
        g11Var.O = 0;
        if (this.b.equals(g11Var.M)) {
            if (this.c == g11Var.V) {
                if (Objects.equals(this.d, g11Var.W)) {
                    arrayList2.addAll(arrayList);
                    g11Var.Q = e00Var;
                    g11Var.R = e00Var == null || arrayList2.size() >= num.intValue();
                    g11Var.n();
                }
            }
        }
    }
}
