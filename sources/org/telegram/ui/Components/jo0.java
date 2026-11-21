package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jo0 implements org.telegram.messenger.fs {
    public final /* synthetic */ TLRPC.Dialog a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ap0 d;

    public jo0(ap0 ap0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = ap0Var;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ap0 ap0Var = this.d;
        ek0 ek0Var = ap0Var.A1;
        yo0 yo0Var = ap0Var.H1;
        org.telegram.ui.ActionBar.k kVar = ap0Var.v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = yo0Var.f;
            AtomicReference atomicReference = this.b;
            boolean z10 = (arrayList == null && org.telegram.messenger.mp.u1(ap0Var.a).t7.l(-dialog.id) != null) || atomicReference.get() == null;
            yo0Var.f = org.telegram.messenger.mp.u1(ap0Var.a).t7.l(-dialog.id);
            yo0Var.d = org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(ap0Var.a).c2(Long.valueOf(dialog.id)));
            yo0Var.e = org.telegram.messenger.o10.w(org.telegram.messenger.mp.u1(ap0Var.a).c2(Long.valueOf(dialog.id)));
            if (z10) {
                yo0Var.f();
            }
            if (yo0Var.f != null) {
                org.telegram.messenger.ks.f(ap0Var.a).n(this, org.telegram.messenger.ks.t5);
            }
            if (z10) {
                ek0Var.setVisibility(0);
                ek0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(ap0Var.a).c2(Long.valueOf(dialog.id)))) {
                    kVar.setTitle(org.telegram.messenger.n5.u(org.telegram.messenger.mp.u1(ap0Var.a).c2(Long.valueOf(dialog.id))));
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745473, null));
                } else if (org.telegram.messenger.v3.o0(ap0Var.a, dialog.id)) {
                    int i11 = ap0Var.a;
                    kVar.setTitle(qg.c.j(i11, org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialog.id)), false));
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745473, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.mp.u1(ap0Var.a).O0(Long.valueOf(-dialog.id)).title);
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745453, null));
                }
                ap0Var.I2 = ap0Var.H2;
                r1.g gVar = ap0Var.x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.bn bnVar = ap0Var.b2;
                hVar.b((bnVar == null || !bnVar.b) ? 800.0f : 10.0f);
                hVar.a(1.0f);
                gVar2.m = hVar;
                ap0Var.x2 = gVar2;
                gVar2.b(new un0(this, this.c, iArr, 1));
                ap0Var.x2.a(new ya(this, 6));
                ap0Var.x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
