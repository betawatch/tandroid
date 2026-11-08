package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class vn0 implements org.telegram.messenger.ls {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ mo0 d;

    public vn0(mo0 mo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = mo0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        mo0 mo0Var = this.d;
        pj0 pj0Var = mo0Var.w1;
        ko0 ko0Var = mo0Var.D1;
        org.telegram.ui.ActionBar.k kVar = mo0Var.r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = ko0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z9 = (arrayList == null && org.telegram.messenger.qp.s1(mo0Var.a).q7.l(-dialog.id) != null) || atomicReference.get() == null;
            ko0Var.f = org.telegram.messenger.qp.s1(mo0Var.a).q7.l(-dialog.id);
            ko0Var.d = org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(mo0Var.a).a2(Long.valueOf(dialog.id)));
            ko0Var.e = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(mo0Var.a).a2(Long.valueOf(dialog.id)));
            if (z9) {
                ko0Var.f();
            }
            if (ko0Var.f != null) {
                org.telegram.messenger.qs.f(mo0Var.a).n(this, org.telegram.messenger.qs.q5);
            }
            if (z9) {
                pj0Var.setVisibility(0);
                pj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(mo0Var.a).a2(Long.valueOf(dialog.id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.qp.s1(mo0Var.a).a2(Long.valueOf(dialog.id))));
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745672, null));
                } else if (org.telegram.messenger.t3.o0(mo0Var.a, dialog.id)) {
                    int i11 = mo0Var.a;
                    kVar.setTitle(qg.d.i(i11, org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-dialog.id)), false));
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745672, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.qp.s1(mo0Var.a).M0(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745652, null));
                }
                mo0Var.E2 = mo0Var.D2;
                r1.g gVar = mo0Var.t2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.an anVar = mo0Var.X1;
                hVar.b((anVar == null || !anVar.b) ? 800.0f : 10.0f);
                hVar.a(1.0f);
                gVar2.m = hVar;
                mo0Var.t2 = gVar2;
                gVar2.b(new fn0(this, this.c, iArr, 1));
                mo0Var.t2.a(new ta(this, 6));
                mo0Var.t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
