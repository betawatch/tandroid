package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lm0 implements ym0 {
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

    @Override // org.telegram.ui.ym0
    public final void A(Editable editable) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.d;
                org.telegram.ui.Components.rt rtVar = om0Var.N;
                om0Var.a = editable;
                rtVar.setText(editable);
                break;
            default:
                om0 om0Var2 = this.d;
                org.telegram.ui.Components.rt rtVar2 = om0Var2.N;
                om0Var2.a = editable;
                rtVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.ym0
    public final /* synthetic */ void d0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ym0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ym0
    public final void t0(int i7, boolean z10, boolean z11) {
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

    @Override // org.telegram.ui.ym0
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
