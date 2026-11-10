package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mm0 implements zm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ pm0 d;

    public /* synthetic */ mm0(pm0 pm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.a = i7;
        this.d = pm0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.zm0
    public final void A() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.zm0
    public final void B(Editable editable) {
        switch (this.a) {
            case 0:
                pm0 pm0Var = this.d;
                org.telegram.ui.Components.kt ktVar = pm0Var.M;
                pm0Var.a = editable;
                ktVar.setText(editable);
                break;
            default:
                pm0 pm0Var2 = this.d;
                org.telegram.ui.Components.kt ktVar2 = pm0Var2.M;
                pm0Var2.a = editable;
                ktVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.zm0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.zm0
    public final /* synthetic */ void f0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.zm0
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.a) {
            case 0:
                pm0 pm0Var = this.d;
                pm0Var.removeSelfFromStack();
                if (!z9) {
                    pm0Var.a0(this.b, this.c, z10, i7);
                    break;
                }
                break;
            default:
                pm0 pm0Var2 = this.d;
                pm0Var2.removeSelfFromStack();
                if (!z9) {
                    pm0Var2.a0(this.b, this.c, z10, i7);
                    break;
                }
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
