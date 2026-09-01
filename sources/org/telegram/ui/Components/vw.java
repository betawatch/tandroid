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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vw extends rx {
    public static final /* synthetic */ int E0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 B0;
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ mz D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(mz mzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        super(mzVar, context, g6Var);
        this.D0 = mzVar;
        this.B0 = p2Var;
        this.C0 = z4;
    }

    @Override // org.telegram.ui.Components.qm0
    public final void j() {
        ww wwVar = this.D0.z0;
        if (wwVar != null) {
            wwVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.qm0
    public final void o(int i10, int i11) {
        mz mzVar = this.D0;
        m2.b bVar = mzVar.c2;
        int i12 = mzVar.B1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = mzVar.Z0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = mzVar.a1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new kl(this, i16));
        ArrayList arrayList2 = mzVar.E2;
        if (arrayList2 != null) {
            arrayList2.clear();
            mzVar.E2.addAll(arrayList);
        }
        mzVar.F();
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = mzVar.b0; i17 < arrayList.size(); i17 = android.support.v4.media.a.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new oh.p5(9));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        mzVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.p2 p2Var = this.B0;
            if (p2Var != null) {
                qc.a0(p2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new jd(i16, p2Var)).j();
                return;
            }
            FrameLayout frameLayout = mzVar.r;
            if (frameLayout != null) {
                new qc(frameLayout, mzVar.W1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public final void p() {
        mz mzVar = this.D0;
        mzVar.a0();
        ww wwVar = mzVar.z0;
        if (wwVar != null) {
            wwVar.invalidate();
        }
        invalidate();
        my myVar = mzVar.q1;
        if (myVar != null) {
            myVar.u();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (this.C0) {
                return;
            }
            this.D0.u0.invalidate();
        }
    }
}
