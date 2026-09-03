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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tw extends px {
    public static final /* synthetic */ int E0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 B0;
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ kz D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        super(kzVar, context, f6Var);
        this.D0 = kzVar;
        this.B0 = p2Var;
        this.C0 = z4;
    }

    @Override // org.telegram.ui.Components.om0
    public final void j() {
        uw uwVar = this.D0.z0;
        if (uwVar != null) {
            uwVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.om0
    public final void o(int i10, int i11) {
        kz kzVar = this.D0;
        m2.b bVar = kzVar.c2;
        int i12 = kzVar.B1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = kzVar.Z0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = kzVar.a1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new il(this, i16));
        ArrayList arrayList2 = kzVar.E2;
        if (arrayList2 != null) {
            arrayList2.clear();
            kzVar.E2.addAll(arrayList);
        }
        kzVar.F();
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = kzVar.b0; i17 < arrayList.size(); i17 = android.support.v4.media.a.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new nh.p5(9));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        kzVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.p2 p2Var = this.B0;
            if (p2Var != null) {
                qc.a0(p2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new jd(i16, p2Var)).j();
                return;
            }
            FrameLayout frameLayout = kzVar.r;
            if (frameLayout != null) {
                new qc(frameLayout, kzVar.W1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.om0
    public final void p() {
        kz kzVar = this.D0;
        kzVar.a0();
        uw uwVar = kzVar.z0;
        if (uwVar != null) {
            uwVar.invalidate();
        }
        invalidate();
        ky kyVar = kzVar.q1;
        if (kyVar != null) {
            kyVar.u();
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
