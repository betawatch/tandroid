package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x30 implements ai {
    public final /* synthetic */ b40 a;

    public x30(b40 b40Var) {
        this.a = b40Var;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar;
        b40 b40Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = b40Var.a;
        if (k2Var == null || k2Var.getParentActivity() == null || (biVar = b40Var.c) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            biVar.N(i10);
            if (i10 == 0) {
                b40Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = b40Var.c.a2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
            org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
            arrayList.add(pzVar);
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
                pzVar.o = efVar.b;
                pzVar.z = efVar.m;
                pzVar.q = true;
                CharSequence charSequence = efVar.a;
                pzVar.d = charSequence != null ? charSequence.toString() : null;
                pzVar.i = efVar.n;
                pzVar.j = efVar.r;
                pzVar.h = efVar.x;
                TLRPC.VideoSize videoSize = efVar.S;
                pzVar.v = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
        }
        b40.a(b40Var, z14, arrayList);
        if (i10 != 8) {
            b40Var.c.a(true);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public final void N() {
        this.a.q();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void j0() {
        org.telegram.messenger.i0.v1(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
