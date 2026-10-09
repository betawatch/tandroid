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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 12;
        int i12 = 18;
        int i13 = 2;
        int i14 = 19;
        int i15 = 11;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                uo uoVar = (uo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = uoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    uoVar.getMessagesStorage().updateUserInfo(uoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new mo(uoVar, i13));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new sg(i14, (up) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((nq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 13));
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, i16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.l8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, i11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea(11, (org.telegram.ui.Components.yi) obj2, (org.telegram.ui.Components.ri) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea(12, (org.telegram.ui.Components.yi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.aq) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, i12));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zr(16, (org.telegram.ui.Components.s10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.s10) obj2, tL_error, tLObject, (Utilities.Callback) obj));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.i40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 25));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.x90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.og0((org.telegram.ui.Components.sh0) obj2, (org.telegram.ui.Components.rh0) obj, tLObject, 1));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ci0((org.telegram.ui.Components.mr0) obj2, tLObject, (Context) obj, i15));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0((org.telegram.ui.Components.xy0) obj2, tL_error, tLObject, (MediaDataController) obj, 3));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0((rs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 4));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0((org.telegram.ui.Components.k11) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 5));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0((org.telegram.ui.Components.b51) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 7));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new vq((fz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea1(i12, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea1(22, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new vq((y00) obj2, tL_error, (x00) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea1(24, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0((n50) obj2, tL_error, tLObject, (String) obj, 11));
                break;
            case 24:
                o70 o70Var = (o70) obj2;
                if (Objects.equals(o70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new m70(i13, o70Var, tLObject));
                    break;
                }
                break;
            case 25:
                d80 d80Var = (d80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new vq(d80Var, (TLRPC.TL_langPackString) langPackString, str, i15));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new vq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oo0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 15));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new vq((ec0) obj2, tLObject, (String) obj, i14));
                break;
            default:
                AndroidUtilities.runOnUIThread(new vq((bc0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}
