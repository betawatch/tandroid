package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nm implements bi {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ org.telegram.messenger.c20 b;
    public final /* synthetic */ di.u2 c;

    public nm(di.u2 u2Var, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = f2Var;
        this.b = c20Var;
        this.c = u2Var;
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void c0(qg qgVar) {
        org.telegram.messenger.qs.f(this.a.getCurrentAccount()).d(qgVar);
    }

    @Override // org.telegram.ui.Components.bi
    public final boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var.a2;
        org.telegram.messenger.c20 c20Var = this.b;
        if (i7 == 15) {
            org.telegram.ui.ActionBar.f2 f2Var = this.a;
            v4.d0(f2Var.getContext(), f2Var.getResourceProvider(), null, null, new mm(c20Var, 0), null);
        } else if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    String str = gfVar.h;
                    if (str != null) {
                        fzVar.c = str;
                    } else {
                        fzVar.c = gfVar.I;
                    }
                    fzVar.e = gfVar.c;
                    fzVar.f = gfVar.g;
                    fzVar.k = gfVar.s;
                    fzVar.p = gfVar.d();
                    fzVar.z = gfVar.m;
                    fzVar.q = true;
                    fzVar.o = gfVar.b;
                    CharSequence charSequence = gfVar.a;
                    fzVar.d = charSequence != null ? charSequence.toString() : null;
                    fzVar.i = gfVar.n;
                    fzVar.j = gfVar.r;
                    fzVar.h = gfVar.x;
                    fzVar.v = gfVar.S;
                    fzVar.y = gfVar;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    String str2 = kfVar.h;
                    if (str2 != null) {
                        fzVar.c = str2;
                    } else {
                        fzVar.l = kfVar;
                    }
                    fzVar.e = kfVar.c;
                    fzVar.f = kfVar.g;
                    fzVar.k = kfVar.s;
                    CharSequence charSequence2 = kfVar.I;
                    fzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                    fzVar.i = kfVar.n;
                    fzVar.j = kfVar.r;
                    fzVar.h = kfVar.x;
                    TLRPC.BotInlineResult botInlineResult = kfVar.N;
                    if (botInlineResult != null && kfVar.H == 1) {
                        fzVar.m = botInlineResult;
                        fzVar.n = kfVar.O;
                    }
                    System.currentTimeMillis();
                }
                c20Var.a(new th.d(fzVar));
            }
        }
        u2Var.a(true);
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bi
    public final void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.bi
    public final void F0() {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
