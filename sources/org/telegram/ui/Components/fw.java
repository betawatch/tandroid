package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fw extends zw {
    public static final /* synthetic */ int I0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ ry H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(ry ryVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        super(ryVar, context, i6Var);
        this.H0 = ryVar;
        this.F0 = h2Var;
        this.G0 = z10;
    }

    @Override // org.telegram.ui.Components.el0
    public final void j() {
        gw gwVar = this.H0.D0;
        if (gwVar != null) {
            gwVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.el0
    public final void o(int i7, int i10) {
        ry ryVar = this.H0;
        gk gkVar = ryVar.g2;
        int i11 = ryVar.F1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = ryVar.d1;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i14);
        ArrayList arrayList = ryVar.e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        int i15 = 1;
        Collections.sort(d02.u0(0), new sl(this, i15));
        ArrayList arrayList2 = ryVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            ryVar.G2.addAll(arrayList);
        }
        ryVar.E();
        org.telegram.messenger.g0.r(gkVar);
        org.telegram.messenger.g0.h3(gkVar, 1500L);
        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i14);
        d03.Y[0] = org.telegram.messenger.ri.s(d03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = ryVar.f0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new fi.k5(19));
        org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.x0, 0, Boolean.TRUE);
        ryVar.Y(true);
        if (org.telegram.messenger.bz.X) {
            org.telegram.messenger.bz.P();
            org.telegram.ui.ActionBar.h2 h2Var = this.F0;
            if (h2Var != null) {
                lc.b0(h2Var).L(R.raw.filter_reorder, org.telegram.messenger.gd.M0(2131751326, null), org.telegram.messenger.gd.M0(2131751325, null), org.telegram.messenger.gd.N0("Settings"), new kd(i15, h2Var)).j();
                return;
            }
            FrameLayout frameLayout = ryVar.r;
            if (frameLayout != null) {
                new lc(frameLayout, ryVar.a2).I(R.raw.filter_reorder, org.telegram.messenger.gd.M0(2131751326, null), org.telegram.messenger.gd.M0(2131751325, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.el0
    public final void p() {
        ry ryVar = this.H0;
        ryVar.Z();
        gw gwVar = ryVar.D0;
        if (gwVar != null) {
            gwVar.invalidate();
        }
        invalidate();
        rx rxVar = ryVar.u1;
        if (rxVar != null) {
            rxVar.u();
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
