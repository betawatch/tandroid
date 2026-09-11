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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xw extends rx {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ kz G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(kzVar, context, f6Var);
        this.G0 = kzVar;
        this.E0 = n2Var;
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.im0
    public final void j() {
        yw ywVar = this.G0.C0;
        if (ywVar != null) {
            ywVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.im0
    public final void o(int i10, int i11) {
        kz kzVar = this.G0;
        org.telegram.ui.Cells.l7 l7Var = kzVar.f2;
        int i12 = kzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = kzVar.c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = kzVar.d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new ol(this, i16));
        ArrayList arrayList2 = kzVar.H2;
        if (arrayList2 != null) {
            arrayList2.clear();
            kzVar.H2.addAll(arrayList);
        }
        kzVar.G();
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = kzVar.e0; i17 < arrayList.size(); i17 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new bi.c7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        kzVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.E0;
            if (n2Var != null) {
                yc.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new td(i16, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = kzVar.r;
            if (frameLayout != null) {
                new yc(frameLayout, kzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.im0
    public final void p() {
        kz kzVar = this.G0;
        kzVar.a0();
        yw ywVar = kzVar.C0;
        if (ywVar != null) {
            ywVar.invalidate();
        }
        invalidate();
        ly lyVar = kzVar.t1;
        if (lyVar != null) {
            lyVar.u();
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
