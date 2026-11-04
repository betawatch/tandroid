package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mm implements zh {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ org.telegram.messenger.u10 b;
    public final /* synthetic */ ei.x2 c;

    public mm(ei.x2 x2Var, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = d2Var;
        this.b = u10Var;
        this.c = x2Var;
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void Y(ng ngVar) {
        org.telegram.messenger.hs.f(this.a.getCurrentAccount()).d(ngVar);
    }

    @Override // org.telegram.ui.Components.zh
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ei.x2 x2Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x2Var.b2;
        org.telegram.messenger.u10 u10Var = this.b;
        if (i3 == 15) {
            org.telegram.ui.ActionBar.d2 d2Var = this.a;
            t4.f0(d2Var.getContext(), d2Var.getResourceProvider(), null, null, new lm(u10Var, 0), null);
        } else if (i3 == 7 || i3 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    String str = yeVar.h;
                    if (str != null) {
                        xyVar.c = str;
                    } else {
                        xyVar.c = yeVar.I;
                    }
                    xyVar.e = yeVar.c;
                    xyVar.f = yeVar.g;
                    xyVar.k = yeVar.s;
                    xyVar.p = yeVar.d();
                    xyVar.z = yeVar.m;
                    xyVar.q = true;
                    xyVar.o = yeVar.b;
                    CharSequence charSequence = yeVar.a;
                    xyVar.d = charSequence != null ? charSequence.toString() : null;
                    xyVar.i = yeVar.n;
                    xyVar.j = yeVar.r;
                    xyVar.h = yeVar.x;
                    xyVar.v = yeVar.S;
                    xyVar.y = yeVar;
                } else if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    String str2 = bfVar.h;
                    if (str2 != null) {
                        xyVar.c = str2;
                    } else {
                        xyVar.l = bfVar;
                    }
                    xyVar.e = bfVar.c;
                    xyVar.f = bfVar.g;
                    xyVar.k = bfVar.s;
                    CharSequence charSequence2 = bfVar.I;
                    xyVar.d = charSequence2 != null ? charSequence2.toString() : null;
                    xyVar.i = bfVar.n;
                    xyVar.j = bfVar.r;
                    xyVar.h = bfVar.x;
                    TLRPC.BotInlineResult botInlineResult = bfVar.N;
                    if (botInlineResult != null && bfVar.H == 1) {
                        xyVar.m = botInlineResult;
                        xyVar.n = bfVar.O;
                    }
                    System.currentTimeMillis();
                }
                u10Var.a(new uh.d(xyVar));
            }
        }
        x2Var.a(true);
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public final void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final void v0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
