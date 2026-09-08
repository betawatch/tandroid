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
import org.telegram.ui.Components.ux0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dj;
import org.telegram.ui.e41;
import org.telegram.ui.fn0;
import org.telegram.ui.h90;
import org.telegram.ui.pn0;
import org.telegram.ui.qq;
import org.telegram.ui.qs0;
import org.telegram.ui.ro;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c3(di.o8 o8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, v7 v7Var) {
        this.a = 1;
        this.c = o8Var;
        this.b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.e = v7Var;
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
                AndroidUtilities.runOnUIThread(new z2((o5) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (di.ga) obj2));
                break;
            case 1:
                di.o8 o8Var = (di.o8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                v7 v7Var = (v7) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(o8Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, v7Var);
                    break;
                } else {
                    v7Var.run(tLObject, tL_error);
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new h8((hg.b1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2, 3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new z2((hg.d2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 6));
                break;
            case 4:
                org.telegram.ui.ob obVar = (org.telegram.ui.ob) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ub ubVar = obVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (ubVar.D0 == null) {
                            ubVar.D0 = new HashMap();
                        }
                        ubVar.D0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new z2(obVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var, 14));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj4, obj, obj3, obj2, 11));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new z2((qq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                break;
            case 7:
                ux0.p((qs0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (ro) obj2, tLObject, tL_error);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new h90(obj4, tL_error, obj, obj3, obj2, 5));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new h8((pn0) obj4, tL_error, (String) obj, (fn0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new h90(obj4, tL_error, obj, obj3, obj2, 12));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new h90(obj4, tL_error, obj, obj3, obj2, 16));
                break;
            case 12:
                e41 e41Var = (e41) obj4;
                e41Var.getClass();
                AndroidUtilities.runOnUIThread(new h8(e41Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.d1) obj4, tLObject, (k9) obj, (String) obj3, (String) obj2));
                break;
            case 14:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj4;
                d1Var.getClass();
                AndroidUtilities.runOnUIThread(new h8(d1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 13));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new h8((yh.p1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (zh.o6) obj3, (Utilities.Callback) obj2, tL_error, 15));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new h8((zh.w3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 16));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new h8((zh.w3) obj4, tLObject, (ug.n1[]) obj, (Long) obj3, (wh.n) obj2, tL_error, 17));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new h8((zh.s5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (dj) obj2, tL_error, 20));
                break;
            default:
                zh.i5 i5Var = (zh.i5) obj4;
                i5Var.getClass();
                AndroidUtilities.runOnUIThread(new h8(i5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (zh.j5) obj3, (Utilities.Callback) obj2, tL_error, 22));
                break;
        }
    }

    public /* synthetic */ c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }
}
