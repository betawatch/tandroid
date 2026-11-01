package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vm implements ai {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 a;
    public final /* synthetic */ org.telegram.messenger.r20 b;
    public final /* synthetic */ ag.v c;

    public vm(ag.v vVar, org.telegram.messenger.r20 r20Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = k2Var;
        this.b = r20Var;
        this.c = vVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        org.telegram.messenger.at.f(this.a.getCurrentAccount()).d(mgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ag.v vVar = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vVar.a2;
        org.telegram.messenger.r20 r20Var = this.b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.k2 k2Var = this.a;
            s4.f0(k2Var.getContext(), k2Var.getResourceProvider(), null, null, new um(r20Var, 0), null);
        } else if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    String str = ffVar.h;
                    if (str != null) {
                        qzVar.c = str;
                    } else {
                        qzVar.c = ffVar.I;
                    }
                    qzVar.e = ffVar.c;
                    qzVar.f = ffVar.g;
                    qzVar.k = ffVar.s;
                    qzVar.p = ffVar.d();
                    qzVar.z = ffVar.m;
                    qzVar.q = true;
                    qzVar.o = ffVar.b;
                    CharSequence charSequence = ffVar.a;
                    qzVar.d = charSequence != null ? charSequence.toString() : null;
                    qzVar.i = ffVar.n;
                    qzVar.j = ffVar.r;
                    qzVar.h = ffVar.x;
                    qzVar.v = ffVar.S;
                    qzVar.y = ffVar;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str2 = jfVar.h;
                    if (str2 != null) {
                        qzVar.c = str2;
                    } else {
                        qzVar.l = jfVar;
                    }
                    qzVar.e = jfVar.c;
                    qzVar.f = jfVar.g;
                    qzVar.k = jfVar.s;
                    CharSequence charSequence2 = jfVar.I;
                    qzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                    qzVar.i = jfVar.n;
                    qzVar.j = jfVar.r;
                    qzVar.h = jfVar.x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        qzVar.m = botInlineResult;
                        qzVar.n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
                r20Var.a(new jh.d(qzVar));
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
