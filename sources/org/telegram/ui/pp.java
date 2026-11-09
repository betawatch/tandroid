package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ pp(qq qqVar, int i7) {
        this.a = i7;
        this.b = qqVar;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        qq qqVar = this.b;
        if (qqVar.getParentActivity() != null) {
            v4.g0 adapter = qqVar.c.getAdapter();
            mq mqVar = qqVar.a;
            if (adapter == mqVar) {
                return qqVar.m0(mqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        qq.a0(this.b, view, i7);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.z0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        qq.Z(this.b, j3);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
