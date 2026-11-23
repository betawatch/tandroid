package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lm0 implements zm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ om0 d;

    public /* synthetic */ lm0(om0 om0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.a = i7;
        this.d = om0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.zm0
    public final /* synthetic */ void S() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.zm0
    public final /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.zm0
    public final void g0(int i7, boolean z10, boolean z11) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.d;
                om0Var.removeSelfFromStack();
                if (!z10) {
                    om0Var.a0(this.b, this.c, z11, i7);
                    break;
                }
                break;
            default:
                om0 om0Var2 = this.d;
                om0Var2.removeSelfFromStack();
                if (!z10) {
                    om0Var2.a0(this.b, this.c, z11, i7);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.zm0
    public final void o() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.zm0
    public final void v(Editable editable) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.d;
                org.telegram.ui.Components.wt wtVar = om0Var.N;
                om0Var.a = editable;
                wtVar.setText(editable);
                break;
            default:
                om0 om0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = om0Var2.N;
                om0Var2.a = editable;
                wtVar2.setText(editable);
                break;
        }
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
