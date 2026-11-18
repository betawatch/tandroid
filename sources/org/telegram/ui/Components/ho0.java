package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ho0 implements org.telegram.messenger.fs {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ yo0 d;

    public ho0(yo0 yo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = yo0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        yo0 yo0Var = this.d;
        ck0 ck0Var = yo0Var.A1;
        wo0 wo0Var = yo0Var.H1;
        org.telegram.ui.ActionBar.k kVar = yo0Var.v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = wo0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z10 = (arrayList == null && org.telegram.messenger.mp.u1(yo0Var.a).t7.l(-dialog.id) != null) || atomicReference.get() == null;
            wo0Var.f = org.telegram.messenger.mp.u1(yo0Var.a).t7.l(-dialog.id);
            wo0Var.d = org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(yo0Var.a).c2(Long.valueOf(dialog.id)));
            wo0Var.e = org.telegram.messenger.o10.w(org.telegram.messenger.mp.u1(yo0Var.a).c2(Long.valueOf(dialog.id)));
            if (z10) {
                wo0Var.f();
            }
            if (wo0Var.f != null) {
                org.telegram.messenger.ks.f(yo0Var.a).n(this, org.telegram.messenger.ks.t5);
            }
            if (z10) {
                ck0Var.setVisibility(0);
                ck0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(yo0Var.a).c2(Long.valueOf(dialog.id)))) {
                    kVar.setTitle(org.telegram.messenger.n5.u(org.telegram.messenger.mp.u1(yo0Var.a).c2(Long.valueOf(dialog.id))));
                    kVar.setSubtitle(org.telegram.messenger.gd.M0(2131745474, null));
                } else if (org.telegram.messenger.v3.o0(yo0Var.a, dialog.id)) {
                    int i11 = yo0Var.a;
                    kVar.setTitle(qg.c.j(i11, org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialog.id)), false));
                    kVar.setSubtitle(org.telegram.messenger.gd.M0(2131745474, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.mp.u1(yo0Var.a).O0(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(org.telegram.messenger.gd.M0(2131745454, null));
                }
                yo0Var.I2 = yo0Var.H2;
                r1.g gVar = yo0Var.x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.bn bnVar = yo0Var.b2;
                hVar.b((bnVar == null || !bnVar.b) ? 800.0f : 10.0f);
                hVar.a(1.0f);
                gVar2.m = hVar;
                yo0Var.x2 = gVar2;
                gVar2.b(new sn0(this, this.c, iArr, 1));
                yo0Var.x2.a(new ya(this, 6));
                yo0Var.x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
