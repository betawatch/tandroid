package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.jl0, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ nq(qr qrVar, int i10) {
        this.a = i10;
        this.b = qrVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        qr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        qr qrVar = this.b;
        if (qrVar.getParentActivity() != null) {
            f2.p0 adapter = qrVar.c.getAdapter();
            mr mrVar = qrVar.a;
            if (adapter == mrVar) {
                return qrVar.h0(mrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
    public void run(long j10) {
        qr.U(this.b, j10);
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
