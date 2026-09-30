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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class zw extends tx {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ mz G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(mz mzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        super(mzVar, context, d6Var);
        this.G0 = mzVar;
        this.E0 = m2Var;
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void j() {
        ax axVar = this.G0.C0;
        if (axVar != null) {
            axVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.wm0
    public final void o(int i10, int i11) {
        mz mzVar = this.G0;
        org.telegram.ui.Cells.t6 t6Var = mzVar.f2;
        int i12 = mzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = mzVar.c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = mzVar.d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new ql(this, i16));
        ArrayList arrayList2 = mzVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            mzVar.G2.addAll(arrayList);
        }
        mzVar.E();
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = mzVar.e0; i17 < arrayList.size(); i17 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.u7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        mzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.m2 m2Var = this.E0;
            if (m2Var != null) {
                yc.a0(m2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new ud(i16, m2Var)).j();
                return;
            }
            FrameLayout frameLayout = mzVar.r;
            if (frameLayout != null) {
                new yc(frameLayout, mzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.wm0
    public final void p() {
        mz mzVar = this.G0;
        mzVar.Y();
        ax axVar = mzVar.C0;
        if (axVar != null) {
            axVar.invalidate();
        }
        invalidate();
        ny nyVar = mzVar.t1;
        if (nyVar != null) {
            nyVar.u();
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
