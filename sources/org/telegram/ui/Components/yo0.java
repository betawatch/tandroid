package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yo0 implements org.telegram.messenger.vs {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ pp0 d;

    public yo0(pp0 pp0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = pp0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pp0 pp0Var = this.d;
        uk0 uk0Var = pp0Var.w1;
        np0 np0Var = pp0Var.D1;
        org.telegram.ui.ActionBar.l lVar = pp0Var.r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = np0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z10 = (arrayList == null && org.telegram.messenger.wp.r1(pp0Var.a).r7.l(-dialog.id) != null) || atomicReference.get() == null;
            np0Var.f = org.telegram.messenger.wp.r1(pp0Var.a).r7.l(-dialog.id);
            np0Var.d = org.telegram.messenger.i20.u(org.telegram.messenger.wp.r1(pp0Var.a).Z1(Long.valueOf(dialog.id)));
            np0Var.e = org.telegram.messenger.i20.v(org.telegram.messenger.wp.r1(pp0Var.a).Z1(Long.valueOf(dialog.id)));
            if (z10) {
                np0Var.f();
            }
            if (np0Var.f != null) {
                org.telegram.messenger.at.f(pp0Var.a).n(this, org.telegram.messenger.at.q5);
            }
            if (z10) {
                uk0Var.setVisibility(0);
                uk0Var.setAlpha(0.0f);
                lVar.setVisibility(0);
                lVar.setAlpha(0.0f);
                if (org.telegram.messenger.i20.u(org.telegram.messenger.wp.r1(pp0Var.a).Z1(Long.valueOf(dialog.id)))) {
                    lVar.setTitle(org.telegram.messenger.o5.u(org.telegram.messenger.wp.r1(pp0Var.a).Z1(Long.valueOf(dialog.id))));
                    lVar.setSubtitle(org.telegram.messenger.dd.L0(2131745686, null));
                } else if (org.telegram.messenger.w3.o0(pp0Var.a, dialog.id)) {
                    int i12 = pp0Var.a;
                    lVar.setTitle(gg.e.i(i12, org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(-dialog.id)), false));
                    lVar.setSubtitle(org.telegram.messenger.dd.L0(2131745686, null));
                } else {
                    lVar.setTitle(org.telegram.messenger.wp.r1(pp0Var.a).L0(Long.valueOf(-dialog.id)).title);
                    lVar.setSubtitle(org.telegram.messenger.dd.L0(2131745666, null));
                }
                pp0Var.E2 = pp0Var.D2;
                o1.j jVar = pp0Var.t2;
                if (jVar != null) {
                    jVar.d();
                }
                int[] iArr = new int[2];
                o1.j jVar2 = new o1.j(new o1.i(0.0f));
                o1.k kVar = new o1.k(1000.0f);
                org.telegram.ui.un unVar = pp0Var.X1;
                kVar.b((unVar == null || !unVar.b) ? 800.0f : 10.0f);
                kVar.a(1.0f);
                jVar2.m = kVar;
                pp0Var.t2 = jVar2;
                jVar2.b(new ho0(this, this.c, iArr, 1));
                pp0Var.t2.a(new na(this, 6));
                pp0Var.t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.i0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
