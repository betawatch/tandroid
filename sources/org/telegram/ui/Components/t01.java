package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t01 implements org.telegram.messenger.s10 {
    public final /* synthetic */ f11 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Boolean d;

    public /* synthetic */ t01(f11 f11Var, String str, long j3, Boolean bool) {
        this.a = f11Var;
        this.b = str;
        this.c = j3;
        this.d = bool;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.d00 d00Var = (org.telegram.messenger.d00) obj2;
        Integer num = (Integer) obj3;
        f11 f11Var = this.a;
        ArrayList arrayList2 = f11Var.N;
        f11Var.O = 0;
        if (this.b.equals(f11Var.M)) {
            if (this.c == f11Var.V) {
                if (Objects.equals(this.d, f11Var.W)) {
                    arrayList2.addAll(arrayList);
                    f11Var.Q = d00Var;
                    f11Var.R = d00Var == null || arrayList2.size() >= num.intValue();
                    f11Var.n();
                }
            }
        }
    }
}
