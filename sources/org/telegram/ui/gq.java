package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.qk0, org.telegram.ui.Components.rk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ gq(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        lr lrVar = this.b;
        if (lrVar.getParentActivity() != null) {
            f2.q0 adapter = lrVar.c.getAdapter();
            hr hrVar = lrVar.a;
            if (adapter == hrVar) {
                return lrVar.h0(hrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        lr.V(this.b, view, i10);
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

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        lr.U(this.b, j10);
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
