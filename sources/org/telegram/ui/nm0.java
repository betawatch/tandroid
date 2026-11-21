package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nm0 implements bn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ qm0 d;

    public /* synthetic */ nm0(qm0 qm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.a = i7;
        this.d = qm0Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.bn0
    public final void A(Editable editable) {
        switch (this.a) {
            case 0:
                qm0 qm0Var = this.d;
                org.telegram.ui.Components.yt ytVar = qm0Var.N;
                qm0Var.a = editable;
                ytVar.setText(editable);
                break;
            default:
                qm0 qm0Var2 = this.d;
                org.telegram.ui.Components.yt ytVar2 = qm0Var2.N;
                qm0Var2.a = editable;
                ytVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.bn0
    public final /* synthetic */ void b0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.bn0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.bn0
    public final void u() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.bn0
    public final void v0(int i7, boolean z10, boolean z11) {
        switch (this.a) {
            case 0:
                qm0 qm0Var = this.d;
                qm0Var.removeSelfFromStack();
                if (!z10) {
                    qm0Var.a0(this.b, this.c, z11, i7);
                    break;
                }
                break;
            default:
                qm0 qm0Var2 = this.d;
                qm0Var2.removeSelfFromStack();
                if (!z10) {
                    qm0Var2.a0(this.b, this.c, z11, i7);
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
