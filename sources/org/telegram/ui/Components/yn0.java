package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yn0 implements org.telegram.messenger.is {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ po0 d;

    public yn0(po0 po0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = po0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        po0 po0Var = this.d;
        uj0 uj0Var = po0Var.A1;
        no0 no0Var = po0Var.H1;
        org.telegram.ui.ActionBar.k kVar = po0Var.v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = no0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z10 = (arrayList == null && org.telegram.messenger.np.s1(po0Var.a).r7.l(-dialog.id) != null) || atomicReference.get() == null;
            no0Var.f = org.telegram.messenger.np.s1(po0Var.a).r7.l(-dialog.id);
            no0Var.d = org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(po0Var.a).a2(Long.valueOf(dialog.id)));
            no0Var.e = org.telegram.messenger.q10.v(org.telegram.messenger.np.s1(po0Var.a).a2(Long.valueOf(dialog.id)));
            if (z10) {
                no0Var.f();
            }
            if (no0Var.f != null) {
                org.telegram.messenger.ns.f(po0Var.a).n(this, org.telegram.messenger.ns.q5);
            }
            if (z10) {
                uj0Var.setVisibility(0);
                uj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(po0Var.a).a2(Long.valueOf(dialog.id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.np.s1(po0Var.a).a2(Long.valueOf(dialog.id))));
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745669, null));
                } else if (org.telegram.messenger.t3.o0(po0Var.a, dialog.id)) {
                    int i11 = po0Var.a;
                    kVar.setTitle(qg.c.i(i11, org.telegram.messenger.np.s1(i11).M0(Long.valueOf(-dialog.id)), false));
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745669, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.np.s1(po0Var.a).M0(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745649, null));
                }
                po0Var.I2 = po0Var.H2;
                r1.g gVar = po0Var.x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.an anVar = po0Var.b2;
                hVar.b((anVar == null || !anVar.b) ? 800.0f : 10.0f);
                hVar.a(1.0f);
                gVar2.m = hVar;
                po0Var.x2 = gVar2;
                gVar2.b(new jn0(this, this.c, iArr, 1));
                po0Var.x2.a(new pa(this, 6));
                po0Var.x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
