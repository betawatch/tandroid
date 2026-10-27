package bi;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.an0;
import org.telegram.ui.gs0;
import org.telegram.ui.hi1;
import org.telegram.ui.ig0;
import org.telegram.ui.kn0;
import org.telegram.ui.nj0;
import org.telegram.ui.pp;
import org.telegram.ui.sm0;
import org.telegram.ui.x21;
import org.telegram.ui.xi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new c3((h7) obj4, tLObject, (vg.n1[]) obj, (Long) obj3, (a3.l0) obj2, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((h7) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new u0(obj4, (org.telegram.ui.ActionBar.e2) obj, tLObject, (TLObject) obj3, obj2, 5));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new c3((ca) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (xi) obj2, tL_error, 4));
                break;
            case 4:
                q9 q9Var = (q9) obj4;
                q9Var.getClass();
                AndroidUtilities.runOnUIThread(new c3(q9Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (t9) obj3, (Utilities.Callback) obj2, tL_error, 6));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new u0(obj4, obj, tL_error, (TLObject) obj3, obj2, 9));
                break;
            case 6:
                fi.w7 w7Var = (fi.w7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                i0 i0Var = (i0) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(w7Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, i0Var);
                    break;
                } else {
                    i0Var.run(tLObject, tL_error);
                    break;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new c3((ig.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new u0((ig.b2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 14));
                break;
            case 9:
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.wb wbVar = qbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (wbVar.z0 == null) {
                            wbVar.z0 = new HashMap();
                        }
                        wbVar.z0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new u0(qbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, e2Var));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new m4.v0((pp) obj4, (org.telegram.ui.ActionBar.e2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.r2) obj2, 18));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new u0(obj4, tL_error, obj, obj3, (TLObject) obj2, 28));
                break;
            case 12:
                dz0.q((gs0) obj4, this.c, (TLRPC.TL_messages_getAttachedStickers) obj3, (org.telegram.ui.z7) obj2, tLObject, tL_error);
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new i30((ig0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new c3((kn0) obj4, tL_error, (String) obj, (an0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new i30((sm0) obj4, tL_error, (nj0) obj, (m4.w1) obj3, (TL_account.verifyEmail) obj2, 20));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new i30((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                break;
            case 17:
                x21 x21Var = (x21) obj4;
                x21Var.getClass();
                AndroidUtilities.runOnUIThread(new c3(x21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) obj4, tLObject, (di.x7) obj, (String) obj3, (String) obj2));
                break;
            case 19:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                a1Var.getClass();
                AndroidUtilities.runOnUIThread(new c3(a1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new c3((zh.p1) obj4, (org.telegram.ui.ActionBar.e2) obj, tLObject, (hi1) obj3, (Utilities.Callback) obj2, tL_error));
                break;
        }
    }
}
