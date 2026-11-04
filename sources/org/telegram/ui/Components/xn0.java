package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xn0 implements org.telegram.messenger.cs {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ oo0 d;

    public xn0(oo0 oo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = oo0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        oo0 oo0Var = this.d;
        tj0 tj0Var = oo0Var.x1;
        mo0 mo0Var = oo0Var.E1;
        org.telegram.ui.ActionBar.k kVar = oo0Var.s2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = mo0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z10 = (arrayList == null && org.telegram.messenger.hp.s1(oo0Var.a).q7.l(-dialog.id) != null) || atomicReference.get() == null;
            mo0Var.f = org.telegram.messenger.hp.s1(oo0Var.a).q7.l(-dialog.id);
            mo0Var.d = org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(oo0Var.a).a2(Long.valueOf(dialog.id)));
            mo0Var.e = org.telegram.messenger.l10.v(org.telegram.messenger.hp.s1(oo0Var.a).a2(Long.valueOf(dialog.id)));
            if (z10) {
                mo0Var.f();
            }
            if (mo0Var.f != null) {
                org.telegram.messenger.hs.f(oo0Var.a).n(this, org.telegram.messenger.hs.q5);
            }
            if (z10) {
                tj0Var.setVisibility(0);
                tj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(oo0Var.a).a2(Long.valueOf(dialog.id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.hp.s1(oo0Var.a).a2(Long.valueOf(dialog.id))));
                    kVar.setSubtitle(org.telegram.messenger.bd.M0(2131745679, null));
                } else if (org.telegram.messenger.t3.o0(oo0Var.a, dialog.id)) {
                    int i11 = oo0Var.a;
                    kVar.setTitle(rg.c.i(i11, org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(-dialog.id)), false));
                    kVar.setSubtitle(org.telegram.messenger.bd.M0(2131745679, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.hp.s1(oo0Var.a).M0(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(org.telegram.messenger.bd.M0(2131745659, null));
                }
                oo0Var.F2 = oo0Var.E2;
                q1.g gVar = oo0Var.u2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                q1.g gVar2 = new q1.g(new q1.f(0.0f));
                q1.h hVar = new q1.h(1000.0f);
                org.telegram.ui.wm wmVar = oo0Var.Y1;
                hVar.b((wmVar == null || !wmVar.b) ? 800.0f : 10.0f);
                hVar.a(1.0f);
                gVar2.m = hVar;
                oo0Var.u2 = gVar2;
                gVar2.b(new in0(this, this.c, iArr, 1));
                oo0Var.u2.a(new sa(this, 6));
                oo0Var.u2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
