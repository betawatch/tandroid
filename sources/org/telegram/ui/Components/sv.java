package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sv extends mw {
    public static final /* synthetic */ int I0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ ey H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(ey eyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        super(eyVar, context, e6Var);
        this.H0 = eyVar;
        this.F0 = d2Var;
        this.G0 = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final void j() {
        tv tvVar = this.H0.D0;
        if (tvVar != null) {
            tvVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vk0
    public final void o(int i3, int i10) {
        ey eyVar = this.H0;
        lt ltVar = eyVar.g2;
        int i11 = eyVar.F1;
        int i12 = i3 - i11;
        int i13 = i10 - i11;
        int i14 = eyVar.d1;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i14);
        ArrayList arrayList = eyVar.e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        int i15 = 1;
        Collections.sort(b02.s0(0), new dl(this, i15));
        ArrayList arrayList2 = eyVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            eyVar.G2.addAll(arrayList);
        }
        eyVar.D();
        org.telegram.messenger.g0.r(ltVar);
        org.telegram.messenger.g0.i3(ltVar, 1500L);
        org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(i14);
        b03.Y[0] = org.telegram.messenger.li.q(b03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = eyVar.f0; i16 < arrayList.size(); i16 = a1.g.h(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new ei.u5(19));
        org.telegram.messenger.hs.f(i14).k(org.telegram.messenger.hs.x0, 0, Boolean.TRUE);
        eyVar.X(true);
        if (org.telegram.messenger.az.X) {
            org.telegram.messenger.az.P();
            org.telegram.ui.ActionBar.d2 d2Var = this.F0;
            if (d2Var != null) {
                fc.a0(d2Var).L(R.raw.filter_reorder, org.telegram.messenger.bd.M0(2131751338, null), org.telegram.messenger.bd.M0(2131751337, null), org.telegram.messenger.bd.N0("Settings"), new bd(i15, d2Var)).j();
                return;
            }
            FrameLayout frameLayout = eyVar.r;
            if (frameLayout != null) {
                new fc(frameLayout, eyVar.a2).I(R.raw.filter_reorder, org.telegram.messenger.bd.M0(2131751338, null), org.telegram.messenger.bd.M0(2131751337, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final void p() {
        ey eyVar = this.H0;
        eyVar.Z();
        tv tvVar = eyVar.D0;
        if (tvVar != null) {
            tvVar.invalidate();
        }
        invalidate();
        fx fxVar = eyVar.u1;
        if (fxVar != null) {
            fxVar.u();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (this.G0) {
                return;
            }
            this.H0.y0.invalidate();
        }
    }
}
