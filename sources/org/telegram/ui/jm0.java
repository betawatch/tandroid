package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jm0 implements wm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ mm0 d;

    public /* synthetic */ jm0(mm0 mm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.a = i7;
        this.d = mm0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.wm0
    public final void A() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.wm0
    public final void B(Editable editable) {
        switch (this.a) {
            case 0:
                mm0 mm0Var = this.d;
                org.telegram.ui.Components.kt ktVar = mm0Var.M;
                mm0Var.a = editable;
                ktVar.setText(editable);
                break;
            default:
                mm0 mm0Var2 = this.d;
                org.telegram.ui.Components.kt ktVar2 = mm0Var2.M;
                mm0Var2.a = editable;
                ktVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.wm0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.wm0
    public final /* synthetic */ void f0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.wm0
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.a) {
            case 0:
                mm0 mm0Var = this.d;
                mm0Var.removeSelfFromStack();
                if (!z9) {
                    mm0Var.a0(this.b, this.c, z10, i7);
                    break;
                }
                break;
            default:
                mm0 mm0Var2 = this.d;
                mm0Var2.removeSelfFromStack();
                if (!z9) {
                    mm0Var2.a0(this.b, this.c, z10, i7);
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
