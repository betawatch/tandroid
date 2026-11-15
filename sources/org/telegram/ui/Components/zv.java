package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zv extends tw {
    public static final /* synthetic */ int I0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ ly H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(ly lyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        super(lyVar, context, e6Var);
        this.H0 = lyVar;
        this.F0 = e2Var;
        this.G0 = z10;
    }

    @Override // org.telegram.ui.Components.wk0
    public final void j() {
        aw awVar = this.H0.D0;
        if (awVar != null) {
            awVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.wk0
    public final void o(int i7, int i10) {
        ly lyVar = this.H0;
        zj zjVar = lyVar.g2;
        int i11 = lyVar.F1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = lyVar.d1;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i14);
        ArrayList arrayList = lyVar.e1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        int i15 = 1;
        Collections.sort(b02.s0(0), new ll(this, i15));
        ArrayList arrayList2 = lyVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            lyVar.G2.addAll(arrayList);
        }
        lyVar.D();
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 1500L);
        org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(i14);
        b03.Y[0] = org.telegram.messenger.si.q(b03.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = lyVar.f0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new fi.m5(19));
        org.telegram.messenger.ns.f(i14).k(org.telegram.messenger.ns.x0, 0, Boolean.TRUE);
        lyVar.Y(true);
        if (org.telegram.messenger.gz.X) {
            org.telegram.messenger.gz.P();
            org.telegram.ui.ActionBar.e2 e2Var = this.F0;
            if (e2Var != null) {
                cc.a0(e2Var).L(R.raw.filter_reorder, org.telegram.messenger.hd.M0(2131751337, null), org.telegram.messenger.hd.M0(2131751336, null), org.telegram.messenger.hd.N0("Settings"), new bd(i15, e2Var)).j();
                return;
            }
            FrameLayout frameLayout = lyVar.r;
            if (frameLayout != null) {
                new cc(frameLayout, lyVar.a2).I(R.raw.filter_reorder, org.telegram.messenger.hd.M0(2131751337, null), org.telegram.messenger.hd.M0(2131751336, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public final void p() {
        ly lyVar = this.H0;
        lyVar.Z();
        aw awVar = lyVar.D0;
        if (awVar != null) {
            awVar.invalidate();
        }
        invalidate();
        mx mxVar = lyVar.u1;
        if (mxVar != null) {
            mxVar.u();
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
