package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t01 implements org.telegram.messenger.r10 {
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

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.c00 c00Var = (org.telegram.messenger.c00) obj2;
        Integer num = (Integer) obj3;
        f11 f11Var = this.a;
        ArrayList arrayList2 = f11Var.N;
        f11Var.O = 0;
        if (this.b.equals(f11Var.M)) {
            if (this.c == f11Var.V) {
                if (Objects.equals(this.d, f11Var.W)) {
                    arrayList2.addAll(arrayList);
                    f11Var.Q = c00Var;
                    f11Var.R = c00Var == null || arrayList2.size() >= num.intValue();
                    f11Var.n();
                }
            }
        }
    }
}
