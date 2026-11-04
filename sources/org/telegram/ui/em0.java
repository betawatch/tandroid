package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class em0 implements rm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ hm0 d;

    public /* synthetic */ em0(hm0 hm0Var, HashMap hashMap, ArrayList arrayList, int i3) {
        this.a = i3;
        this.d = hm0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.rm0
    public final /* synthetic */ void c0() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.rm0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.rm0
    public final void m() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.rm0
    public final void u(Editable editable) {
        switch (this.a) {
            case 0:
                hm0 hm0Var = this.d;
                org.telegram.ui.Components.jt jtVar = hm0Var.N;
                hm0Var.a = editable;
                jtVar.setText(editable);
                break;
            default:
                hm0 hm0Var2 = this.d;
                org.telegram.ui.Components.jt jtVar2 = hm0Var2.N;
                hm0Var2.a = editable;
                jtVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.rm0
    public final void v0(int i3, boolean z10, boolean z11) {
        switch (this.a) {
            case 0:
                hm0 hm0Var = this.d;
                hm0Var.removeSelfFromStack();
                if (!z10) {
                    hm0Var.a0(this.b, this.c, z11, i3);
                    break;
                }
                break;
            default:
                hm0 hm0Var2 = this.d;
                hm0Var2.removeSelfFromStack();
                if (!z10) {
                    hm0Var2.a0(this.b, this.c, z11, i3);
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
