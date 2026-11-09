package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wn0 implements org.telegram.messenger.ls {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ no0 d;

    public wn0(no0 no0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = no0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        no0 no0Var = this.d;
        qj0 qj0Var = no0Var.w1;
        lo0 lo0Var = no0Var.D1;
        org.telegram.ui.ActionBar.k kVar = no0Var.r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = lo0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z9 = (arrayList == null && org.telegram.messenger.qp.s1(no0Var.a).q7.l(-dialog.id) != null) || atomicReference.get() == null;
            lo0Var.f = org.telegram.messenger.qp.s1(no0Var.a).q7.l(-dialog.id);
            lo0Var.d = org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(no0Var.a).a2(Long.valueOf(dialog.id)));
            lo0Var.e = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(no0Var.a).a2(Long.valueOf(dialog.id)));
            if (z9) {
                lo0Var.f();
            }
            if (lo0Var.f != null) {
                org.telegram.messenger.qs.f(no0Var.a).n(this, org.telegram.messenger.qs.q5);
            }
            if (z9) {
                qj0Var.setVisibility(0);
                qj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(no0Var.a).a2(Long.valueOf(dialog.id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.qp.s1(no0Var.a).a2(Long.valueOf(dialog.id))));
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745669, null));
                } else if (org.telegram.messenger.t3.o0(no0Var.a, dialog.id)) {
                    int i11 = no0Var.a;
                    kVar.setTitle(qg.d.i(i11, org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-dialog.id)), false));
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745669, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.qp.s1(no0Var.a).M0(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745649, null));
                }
                no0Var.E2 = no0Var.D2;
                r1.g gVar = no0Var.t2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.cn cnVar = no0Var.X1;
                hVar.b((cnVar == null || !cnVar.b) ? 800.0f : 10.0f);
                hVar.a(1.0f);
                gVar2.m = hVar;
                no0Var.t2 = gVar2;
                gVar2.b(new gn0(this, this.c, iArr, 1));
                no0Var.t2.a(new ta(this, 6));
                no0Var.t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
