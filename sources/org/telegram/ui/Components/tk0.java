package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tk0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ uk0 e;

    public tk0(uk0 uk0Var, View view, int i10, float f10, float f11) {
        this.e = uk0Var;
        this.a = view;
        this.b = i10;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.z zVar = this.e.b;
        zk0 zk0Var = (zk0) zVar.b;
        if (this == zk0Var.O1) {
            zk0Var.O1 = null;
        }
        View view = this.a;
        if (view != null) {
            zk0Var.h1(view, 0.0f, 0.0f, false);
            if (((zk0) zVar.b).N1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                zk0 zk0Var2 = (zk0) zVar.b;
                pk0 pk0Var = zk0Var2.R0;
                if (pk0Var != null) {
                    pk0Var.a(i10, view);
                    return;
                }
                qk0 qk0Var = zk0Var2.S0;
                if (qk0Var != null) {
                    qk0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
