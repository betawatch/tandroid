package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vm implements ai {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 a;
    public final /* synthetic */ org.telegram.messenger.q20 b;
    public final /* synthetic */ ag.v c;

    public vm(ag.v vVar, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = k2Var;
        this.b = q20Var;
        this.c = vVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        org.telegram.messenger.zs.f(this.a.getCurrentAccount()).d(mgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ag.v vVar = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vVar.a2;
        org.telegram.messenger.q20 q20Var = this.b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.k2 k2Var = this.a;
            s4.f0(k2Var.getContext(), k2Var.getResourceProvider(), null, null, new um(q20Var, 0), null);
        } else if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    String str = efVar.h;
                    if (str != null) {
                        pzVar.c = str;
                    } else {
                        pzVar.c = efVar.I;
                    }
                    pzVar.e = efVar.c;
                    pzVar.f = efVar.g;
                    pzVar.k = efVar.s;
                    pzVar.p = efVar.d();
                    pzVar.z = efVar.m;
                    pzVar.q = true;
                    pzVar.o = efVar.b;
                    CharSequence charSequence = efVar.a;
                    pzVar.d = charSequence != null ? charSequence.toString() : null;
                    pzVar.i = efVar.n;
                    pzVar.j = efVar.r;
                    pzVar.h = efVar.x;
                    pzVar.v = efVar.S;
                    pzVar.y = efVar;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str2 = hfVar.h;
                    if (str2 != null) {
                        pzVar.c = str2;
                    } else {
                        pzVar.l = hfVar;
                    }
                    pzVar.e = hfVar.c;
                    pzVar.f = hfVar.g;
                    pzVar.k = hfVar.s;
                    CharSequence charSequence2 = hfVar.I;
                    pzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                    pzVar.i = hfVar.n;
                    pzVar.j = hfVar.r;
                    pzVar.h = hfVar.x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        pzVar.m = botInlineResult;
                        pzVar.n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
                q20Var.a(new jh.d(pzVar));
            }
        }
        vVar.a(true);
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ai
    public final void j0() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
