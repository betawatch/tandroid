package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements org.telegram.messenger.qr, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.hj0, org.telegram.ui.Components.ij0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ pp(qq qqVar, int i7) {
        this.a = i7;
        this.b = qqVar;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        qq qqVar = this.b;
        if (qqVar.getParentActivity() != null) {
            v4.h0 adapter = qqVar.c.getAdapter();
            mq mqVar = qqVar.a;
            if (adapter == mqVar) {
                return qqVar.m0(mqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        qq.a0(this.b, view, i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.z0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void run(long j3) {
        qq.Z(this.b, j3);
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
