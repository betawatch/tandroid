package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;

    public /* synthetic */ dd(ld ldVar, int i10) {
        this.a = i10;
        this.b = ldVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ld.X(this.b, view);
                break;
            case 1:
                ld ldVar = this.b;
                ldVar.v.o(ldVar.x != null, new cd(ldVar, 1), new s5(ldVar, 2), 0);
                ldVar.J.M(0);
                ldVar.J.P(43);
                ldVar.h.d();
                break;
            case 2:
                ld ldVar2 = this.b;
                if (!ldVar2.j0) {
                    ldVar2.f0();
                    break;
                } else if (ldVar2.a0) {
                    ldVar2.a0 = false;
                    ldVar2.h0();
                    break;
                }
                break;
            default:
                ld ldVar3 = this.b;
                if (!ldVar3.a0) {
                    ldVar3.a0 = true;
                    ldVar3.h0();
                    break;
                }
                break;
        }
    }
}
