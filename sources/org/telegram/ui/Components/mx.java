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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mx extends hy {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ a00 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(a00 a00Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(a00Var, context, e6Var);
        this.G0 = a00Var;
        this.E0 = n2Var;
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.on0
    public final void j() {
        nx nxVar = this.G0.C0;
        if (nxVar != null) {
            nxVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.on0
    public final void o(int i10, int i11) {
        a00 a00Var = this.G0;
        org.telegram.ui.Cells.t6 t6Var = a00Var.f2;
        int i12 = a00Var.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = a00Var.c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = a00Var.d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new fm(this, i16));
        ArrayList arrayList2 = a00Var.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            a00Var.G2.addAll(arrayList);
        }
        a00Var.E();
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = a00Var.e0; i17 < arrayList.size(); i17 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.v7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        a00Var.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.E0;
            if (n2Var != null) {
                ad.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new wd(i16, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = a00Var.r;
            if (frameLayout != null) {
                new ad(frameLayout, a00Var.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final void p() {
        a00 a00Var = this.G0;
        a00Var.Y();
        nx nxVar = a00Var.C0;
        if (nxVar != null) {
            nxVar.invalidate();
        }
        invalidate();
        az azVar = a00Var.t1;
        if (azVar != null) {
            azVar.u();
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
