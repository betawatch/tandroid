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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ex extends yx {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ tz G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(tz tzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        super(tzVar, context, g6Var);
        this.G0 = tzVar;
        this.E0 = o2Var;
        this.F0 = z10;
    }

    @Override // org.telegram.ui.Components.kn0
    public final void j() {
        fx fxVar = this.G0.C0;
        if (fxVar != null) {
            fxVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.kn0
    public final void o(int i10, int i11) {
        tz tzVar = this.G0;
        org.telegram.ui.Cells.u5 u5Var = tzVar.f2;
        int i12 = tzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = tzVar.c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = tzVar.d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new zl(this, i16));
        ArrayList arrayList2 = tzVar.H2;
        if (arrayList2 != null) {
            arrayList2.clear();
            tzVar.H2.addAll(arrayList);
        }
        tzVar.D();
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        AndroidUtilities.runOnUIThread(u5Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = tzVar.e0; i17 < arrayList.size(); i17 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ci.d6(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        tzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.o2 o2Var = this.E0;
            if (o2Var != null) {
                xc.a0(o2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new sd(i16, o2Var)).j();
                return;
            }
            FrameLayout frameLayout = tzVar.r;
            if (frameLayout != null) {
                new xc(frameLayout, tzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.kn0
    public final void p() {
        tz tzVar = this.G0;
        tzVar.Y();
        fx fxVar = tzVar.C0;
        if (fxVar != null) {
            fxVar.invalidate();
        }
        invalidate();
        uy uyVar = tzVar.t1;
        if (uyVar != null) {
            uyVar.u();
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
