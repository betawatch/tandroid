package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xo0 implements org.telegram.messenger.us {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ op0 d;

    public xo0(op0 op0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = op0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        op0 op0Var = this.d;
        tk0 tk0Var = op0Var.w1;
        mp0 mp0Var = op0Var.D1;
        org.telegram.ui.ActionBar.l lVar = op0Var.r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = mp0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z10 = (arrayList == null && org.telegram.messenger.vp.r1(op0Var.a).r7.l(-dialog.id) != null) || atomicReference.get() == null;
            mp0Var.f = org.telegram.messenger.vp.r1(op0Var.a).r7.l(-dialog.id);
            mp0Var.d = org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(op0Var.a).Z1(Long.valueOf(dialog.id)));
            mp0Var.e = org.telegram.messenger.h20.v(org.telegram.messenger.vp.r1(op0Var.a).Z1(Long.valueOf(dialog.id)));
            if (z10) {
                mp0Var.f();
            }
            if (mp0Var.f != null) {
                org.telegram.messenger.zs.f(op0Var.a).n(this, org.telegram.messenger.zs.q5);
            }
            if (z10) {
                tk0Var.setVisibility(0);
                tk0Var.setAlpha(0.0f);
                lVar.setVisibility(0);
                lVar.setAlpha(0.0f);
                if (org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(op0Var.a).Z1(Long.valueOf(dialog.id)))) {
                    lVar.setTitle(org.telegram.messenger.o5.u(org.telegram.messenger.vp.r1(op0Var.a).Z1(Long.valueOf(dialog.id))));
                    lVar.setSubtitle(org.telegram.messenger.cd.L0(2131745686, null));
                } else if (org.telegram.messenger.w3.o0(op0Var.a, dialog.id)) {
                    int i12 = op0Var.a;
                    lVar.setTitle(gg.e.i(i12, org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-dialog.id)), false));
                    lVar.setSubtitle(org.telegram.messenger.cd.L0(2131745686, null));
                } else {
                    lVar.setTitle(org.telegram.messenger.vp.r1(op0Var.a).L0(Long.valueOf(-dialog.id)).title);
                    lVar.setSubtitle(org.telegram.messenger.cd.L0(2131745666, null));
                }
                op0Var.E2 = op0Var.D2;
                o1.j jVar = op0Var.t2;
                if (jVar != null) {
                    jVar.d();
                }
                int[] iArr = new int[2];
                o1.j jVar2 = new o1.j(new o1.i(0.0f));
                o1.k kVar = new o1.k(1000.0f);
                org.telegram.ui.un unVar = op0Var.X1;
                kVar.b((unVar == null || !unVar.b) ? 800.0f : 10.0f);
                kVar.a(1.0f);
                jVar2.m = kVar;
                op0Var.t2 = jVar2;
                jVar2.b(new go0(this, this.c, iArr, 1));
                op0Var.t2.a(new na(this, 6));
                op0Var.t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.i0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
