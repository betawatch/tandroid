package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
    public final void A() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ym0
    public final void B(Editable editable) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.d;
                org.telegram.ui.Components.lt ltVar = om0Var.M;
                om0Var.a = editable;
                ltVar.setText(editable);
                break;
            default:
                om0 om0Var2 = this.d;
                org.telegram.ui.Components.lt ltVar2 = om0Var2.M;
                om0Var2.a = editable;
                ltVar2.setText(editable);
                break;
        }
    }

    @Override // org.telegram.ui.ym0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ym0
    public final /* synthetic */ void f0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ym0
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.d;
                om0Var.removeSelfFromStack();
                if (!z9) {
                    om0Var.a0(this.b, this.c, z10, i7);
                    break;
                }
                break;
            default:
                om0 om0Var2 = this.d;
                om0Var2.removeSelfFromStack();
                if (!z9) {
                    om0Var2.a0(this.b, this.c, z10, i7);
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
