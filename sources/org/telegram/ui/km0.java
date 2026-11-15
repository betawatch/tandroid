package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class km0 implements xm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ nm0 d;

    public /* synthetic */ km0(nm0 nm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.a = i7;
        this.d = nm0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.xm0
    public final void A(Editable editable) {
        switch (this.a) {
            case 0:
                nm0 nm0Var = this.d;
                org.telegram.ui.Components.rt rtVar = nm0Var.N;
                nm0Var.a = editable;
                rtVar.setText(editable);
                break;
            default:
                nm0 nm0Var2 = this.d;
                org.telegram.ui.Components.rt rtVar2 = nm0Var2.N;
                nm0Var2.a = editable;
                rtVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.xm0
    public final /* synthetic */ void d0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.xm0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.xm0
    public final void t0(int i7, boolean z10, boolean z11) {
        switch (this.a) {
            case 0:
                nm0 nm0Var = this.d;
                nm0Var.removeSelfFromStack();
                if (!z10) {
                    nm0Var.a0(this.b, this.c, z11, i7);
                    break;
                }
                break;
            default:
                nm0 nm0Var2 = this.d;
                nm0Var2.removeSelfFromStack();
                if (!z10) {
                    nm0Var2.a0(this.b, this.c, z11, i7);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.xm0
    public final void y() {
        int i7 = this.a;
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
