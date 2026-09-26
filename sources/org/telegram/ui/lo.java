package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 4;
        int i12 = 8;
        int i13 = 16;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ro roVar = (ro) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = roVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    roVar.getMessagesStorage().updateUserInfo(roVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new jo(roVar, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fh(i13, (rp) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((kq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 13));
                break;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, i14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.j8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 10));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(7, (org.telegram.ui.Components.wi) obj2, (org.telegram.ui.Components.pi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(i12, (org.telegram.ui.Components.wi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.lp) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, i13));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vw(9, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.d10) obj2, tL_error, tLObject, (Utilities.Callback) obj));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.s30) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 25));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.g90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.ah0) obj2, (org.telegram.ui.Components.zg0) obj, tLObject, 29));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wn0((org.telegram.ui.Components.uq0) obj2, tLObject, (Context) obj, i11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.fy0) obj2, tL_error, tLObject, (MediaDataController) obj, 3));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((js0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 4));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.s01) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, tL_error, 5));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.i41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 7));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new sq((cz) obj2, tLObject, (MessageObject) obj, i11));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new tt(12, (wz) obj2, (org.telegram.ui.ActionBar.a2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new tt(i13, (b10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new sq((u00) obj2, tL_error, (t00) obj, i12));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new tt(18, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((k50) obj2, tL_error, tLObject, (String) obj, 11));
                break;
            case 24:
                k70 k70Var = (k70) obj2;
                if (Objects.equals(k70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new tt(26, k70Var, tLObject));
                    break;
                }
                break;
            case 25:
                y70 y70Var = (y70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new sq(y70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new sq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.ActionBar.a2) obj2, tLObject, (h) obj, tL_error, 15));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new sq((zb0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sq((wb0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}
