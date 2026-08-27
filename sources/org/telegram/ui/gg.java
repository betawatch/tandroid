package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gg(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((rn) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 1:
                rn rnVar = (rn) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new rd(11, rnVar, tL_error));
                        break;
                    }
                } else {
                    rnVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rd(10, rnVar, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new yf((rn) this.b, tLObject, tL_error, (MessagesStorage) this.c, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new u1((tl) this.b, tLObject, (MessageObject) this.c, 23));
                break;
            case 4:
                jo joVar = (jo) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = joVar.A0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    joVar.getMessagesStorage().updateUserInfo(joVar.A0, false);
                }
                AndroidUtilities.runOnUIThread(new co(joVar, 2));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new rd(23, (jp) this.b, (org.telegram.ui.ActionBar.b2[]) this.c));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yf((dq) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 7));
                break;
            case 7:
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) this.b;
                NotificationCenter.getInstance(g5Var.e).doOnIdle(new org.telegram.ui.Components.f5(g5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((org.telegram.ui.Components.b8) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, 6));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new yq(14, (org.telegram.ui.Components.gi) this.b, (org.telegram.ui.Components.zh) this.c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new yq(15, (org.telegram.ui.Components.gi) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((org.telegram.ui.Components.yo) this.b, tLObject, (org.telegram.ui.ActionBar.f6) this.c, 12));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xq(16, (org.telegram.ui.Components.q00) this.b, (Pair) this.c));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.q00) this.b, tL_error, tLObject, (Utilities.Callback) this.c, 17));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.g30) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 19));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.i80) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject, 21));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((org.telegram.ui.Components.cg0) this.b, (org.telegram.ui.Components.bg0) this.c, tLObject, 25));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg0((org.telegram.ui.Components.sp0) this.b, tLObject, (Context) this.c, 11));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.ex0) this.b, tL_error, tLObject, (MediaDataController) this.c, 27));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new yf((pr0) this.b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.c, 28));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.oz0) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error, 29));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((org.telegram.ui.Components.b31) this.b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.c, 1));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new lq((sy) this.b, tLObject, (MessageObject) this.c, 4));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(19, (mz) this.b, (org.telegram.ui.ActionBar.b2) this.c));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(23, (q00) this.b, (org.telegram.ui.ActionBar.b2) this.c));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((j00) this.b, tL_error, (i00) this.c, 8));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(25, (FiltersSetupActivity) this.b, (TLRPC.TL_messages_toggleDialogFilterTags) this.c));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((z40) this.b, tL_error, tLObject, (String) this.c, 5));
                break;
            case 28:
                y60 y60Var = (y60) this.b;
                if (Objects.equals(y60Var.a.e, (String) this.c)) {
                    AndroidUtilities.runOnUIThread(new a30(3, y60Var, tLObject));
                    break;
                }
                break;
            default:
                l70 l70Var = (l70) this.b;
                String str = (String) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(l70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
