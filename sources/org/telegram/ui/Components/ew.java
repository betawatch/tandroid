package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ew extends yw {
    public static final /* synthetic */ int I0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ qy H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(qy qyVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        super(qyVar, context, i6Var);
        this.H0 = qyVar;
        this.F0 = g2Var;
        this.G0 = z10;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void j() {
        fw fwVar = this.H0.D0;
        if (fwVar != null) {
            fwVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.gl0
    public final void o(int i7, int i10) {
        qy qyVar = this.H0;
        rc rcVar = qyVar.g2;
        int i11 = qyVar.F1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = qyVar.d1;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i14);
        ArrayList arrayList = qyVar.e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        int i15 = 1;
        Collections.sort(d02.u0(0), new sl(this, i15));
        ArrayList arrayList2 = qyVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            qyVar.G2.addAll(arrayList);
        }
        qyVar.D();
        org.telegram.messenger.g0.r(rcVar);
        org.telegram.messenger.g0.h3(rcVar, 1500L);
        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i14);
        d03.Y[0] = org.telegram.messenger.ri.s(d03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = qyVar.f0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new fi.l5(19));
        org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.x0, 0, Boolean.TRUE);
        qyVar.Y(true);
        if (org.telegram.messenger.bz.X) {
            org.telegram.messenger.bz.P();
            org.telegram.ui.ActionBar.g2 g2Var = this.F0;
            if (g2Var != null) {
                kc.b0(g2Var).L(R.raw.filter_reorder, org.telegram.messenger.gd.N0(2131751325, null), org.telegram.messenger.gd.N0(2131751324, null), org.telegram.messenger.gd.O0("Settings"), new kd(i15, g2Var)).j();
                return;
            }
            FrameLayout frameLayout = qyVar.r;
            if (frameLayout != null) {
                new kc(frameLayout, qyVar.a2).I(R.raw.filter_reorder, org.telegram.messenger.gd.N0(2131751325, null), org.telegram.messenger.gd.N0(2131751324, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public final void p() {
        qy qyVar = this.H0;
        qyVar.Z();
        fw fwVar = qyVar.D0;
        if (fwVar != null) {
            fwVar.invalidate();
        }
        invalidate();
        qx qxVar = qyVar.u1;
        if (qxVar != null) {
            qxVar.u();
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
