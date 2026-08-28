package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;

    public /* synthetic */ eq(jr jrVar, int i9) {
        this.a = i9;
        this.b = jrVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        jr jrVar = this.b;
        if (jrVar.getParentActivity() != null) {
            f2.r0 adapter = jrVar.c.getAdapter();
            er erVar = jrVar.a;
            if (adapter == erVar) {
                return jrVar.g0(erVar.E(i9), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        jr.U(this.b, view, i9);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                this.b.t0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        jr.T(this.b, j10);
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
