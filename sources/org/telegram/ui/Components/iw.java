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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class iw extends dx {
    public static final /* synthetic */ int D0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 A0;
    public final /* synthetic */ boolean B0;
    public final /* synthetic */ yy C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(yyVar, context, c6Var);
        this.C0 = yyVar;
        this.A0 = n2Var;
        this.B0 = z10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final void j() {
        jw jwVar = this.C0.y0;
        if (jwVar != null) {
            jwVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vl0
    public final void o(int i10, int i11) {
        yy yyVar = this.C0;
        m.i3 i3Var = yyVar.b2;
        int i12 = yyVar.A1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = yyVar.Y0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = yyVar.Z0;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new bl(this, i16));
        ArrayList arrayList2 = yyVar.D2;
        if (arrayList2 != null) {
            arrayList2.clear();
            yyVar.D2.addAll(arrayList);
        }
        yyVar.G();
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i17 = yyVar.a0; i17 < arrayList.size(); i17 = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_messages_stickerSet) arrayList.get(i17)).set.id, tL_messages_reorderStickerSets.order, i17, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new jh.m5(10));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        yyVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.A0;
            if (n2Var != null) {
                mc.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new fd(i16, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = yyVar.r;
            if (frameLayout != null) {
                new mc(frameLayout, yyVar.V1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final void p() {
        yy yyVar = this.C0;
        yyVar.a0();
        jw jwVar = yyVar.y0;
        if (jwVar != null) {
            jwVar.invalidate();
        }
        invalidate();
        xx xxVar = yyVar.p1;
        if (xxVar != null) {
            xxVar.u();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (this.B0) {
                return;
            }
            this.C0.t0.invalidate();
        }
    }
}
