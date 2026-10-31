package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gw extends cx {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ vy G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(vy vyVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        super(vyVar, context, p6Var);
        this.G0 = vyVar;
        this.E0 = k2Var;
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void j() {
        hw hwVar = this.G0.C0;
        if (hwVar != null) {
            hwVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.ul0
    public final void o(int i10, int i11) {
        vy vyVar = this.G0;
        ew ewVar = vyVar.f2;
        int i12 = vyVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = vyVar.c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i15);
        ArrayList arrayList = vyVar.d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(b02.s0(0), new jl(this, i16));
        ArrayList arrayList2 = vyVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            vyVar.F2.addAll(arrayList);
        }
        vyVar.F();
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 1500L);
        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i15);
        b03.X[0] = org.telegram.messenger.ui.q(b03.G[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = vyVar.e0; i17 < arrayList.size(); i17 = c3.i0.k(i17, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ag.c3(14));
        org.telegram.messenger.zs.f(i15).k(org.telegram.messenger.zs.x0, 0, Boolean.TRUE);
        vyVar.Y(true);
        if (org.telegram.messenger.tz.X) {
            org.telegram.messenger.tz.P();
            org.telegram.ui.ActionBar.k2 k2Var = this.E0;
            if (k2Var != null) {
                cc.a0(k2Var).L(R.raw.filter_reorder, org.telegram.messenger.cd.L0(2131751338, null), org.telegram.messenger.cd.L0(2131751337, null), org.telegram.messenger.cd.M0("Settings"), new wc(i16, k2Var)).j();
                return;
            }
            FrameLayout frameLayout = vyVar.r;
            if (frameLayout != null) {
                new cc(frameLayout, vyVar.Z1).I(R.raw.filter_reorder, org.telegram.messenger.cd.L0(2131751338, null), org.telegram.messenger.cd.L0(2131751337, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final void p() {
        vy vyVar = this.G0;
        vyVar.Z();
        hw hwVar = vyVar.C0;
        if (hwVar != null) {
            hwVar.invalidate();
        }
        invalidate();
        vx vxVar = vyVar.t1;
        if (vxVar != null) {
            vxVar.u();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (this.F0) {
                return;
            }
            this.G0.x0.invalidate();
        }
    }
}
