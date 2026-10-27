package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dx extends xx {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ sz G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(sz szVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        super(szVar, context, u6Var);
        this.G0 = szVar;
        this.E0 = r2Var;
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.qn0
    public final void j() {
        ex exVar = this.G0.C0;
        if (exVar != null) {
            exVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.qn0
    public final void o(int i10, int i11) {
        sz szVar = this.G0;
        m.g3 g3Var = szVar.f2;
        int i12 = szVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = szVar.c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = szVar.d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new am(this, i16));
        ArrayList arrayList2 = szVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            szVar.F2.addAll(arrayList);
        }
        szVar.F();
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        AndroidUtilities.runOnUIThread(g3Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = szVar.e0; i17 < arrayList.size(); i17 = c3.h0.j(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new di.d6(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        szVar.Y(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.r2 r2Var = this.E0;
            if (r2Var != null) {
                wc.b0(r2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new ud(i16, r2Var)).j();
                return;
            }
            FrameLayout frameLayout = szVar.r;
            if (frameLayout != null) {
                new wc(frameLayout, szVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.qn0
    public final void p() {
        sz szVar = this.G0;
        szVar.Z();
        ex exVar = szVar.C0;
        if (exVar != null) {
            exVar.invalidate();
        }
        invalidate();
        ty tyVar = szVar.t1;
        if (tyVar != null) {
            tyVar.u();
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
