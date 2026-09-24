package ai;

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
import org.telegram.ui.Components.fy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aj;
import org.telegram.ui.c90;
import org.telegram.ui.gn0;
import org.telegram.ui.js0;
import org.telegram.ui.kq;
import org.telegram.ui.lo;
import org.telegram.ui.t31;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p3(ci.l8 l8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, n8 n8Var) {
        this.a = 1;
        this.c = l8Var;
        this.b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.e = n8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new m3((e6) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (ci.da) obj2));
                break;
            case 1:
                ci.l8 l8Var = (ci.l8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                n8 n8Var = (n8) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(l8Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, n8Var);
                    break;
                } else {
                    n8Var.run(tLObject, tL_error);
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new z8((gg.b1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2, 3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new m3((gg.e2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 6));
                break;
            case 4:
                org.telegram.ui.ob obVar = (org.telegram.ui.ob) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                org.telegram.ui.ub ubVar = obVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (ubVar.z0 == null) {
                            ubVar.z0 = new HashMap();
                        }
                        ubVar.z0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new m3(obVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, a2Var, 14));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(obj4, obj, obj3, obj2, 11));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new m3((kq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                break;
            case 7:
                fy0.p((js0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (lo) obj2, tLObject, tL_error);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new c90(obj4, tL_error, obj, obj3, obj2, 5));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new z8((gn0) obj4, tL_error, (String) obj, (wm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new c90(obj4, tL_error, obj, obj3, obj2, 12));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new c90(obj4, tL_error, obj, obj3, obj2, 16));
                break;
            case 12:
                t31 t31Var = (t31) obj4;
                t31Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(t31Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) obj4, tLObject, (da) obj, (String) obj3, (String) obj2));
                break;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                b1Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(b1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 13));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new z8((xh.r1) obj4, (org.telegram.ui.ActionBar.a2) obj, tLObject, (xh.o0) obj3, (Utilities.Callback) obj2, tL_error, 15));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new z8((yh.x3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 16));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new z8((yh.x3) obj4, tLObject, (tg.m1[]) obj, (Long) obj3, (tg.r) obj2, tL_error, 17));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new yh.u((yh.t5) obj4, (org.telegram.ui.ActionBar.a2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new z8((yh.t5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (aj) obj2, tL_error, 20));
                break;
            default:
                yh.j5 j5Var = (yh.j5) obj4;
                j5Var.getClass();
                AndroidUtilities.runOnUIThread(new z8(j5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (yh.k5) obj3, (Utilities.Callback) obj2, tL_error, 22));
                break;
        }
    }

    public /* synthetic */ p3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }
}
