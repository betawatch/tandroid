package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ oq(qr qrVar, int i10) {
        this.a = i10;
        this.b = qrVar;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        qr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        qr qrVar = this.b;
        if (qrVar.getParentActivity() != null) {
            s4.h0 adapter = qrVar.c.getAdapter();
            mr mrVar = qrVar.a;
            if (adapter == mrVar) {
                return qrVar.h0(mrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.u0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        qr.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
