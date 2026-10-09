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
import org.telegram.ui.Components.xy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c41;
import org.telegram.ui.cj;
import org.telegram.ui.dn0;
import org.telegram.ui.g90;
import org.telegram.ui.nn0;
import org.telegram.ui.nq;
import org.telegram.ui.oo;
import org.telegram.ui.rs0;
import org.telegram.ui.up;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q3(ci.l8 l8Var, TL_stories.StoryItem storyItem, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, o8 o8Var) {
        this.a = 1;
        this.c = l8Var;
        this.b = storyItem;
        this.d = tL_messages_getAttachedStickers;
        this.e = o8Var;
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
                AndroidUtilities.runOnUIThread(new n3((f6) obj4, (Runnable) obj, tL_error, (TL_stories.StoryItem) obj3, (ci.da) obj2));
                break;
            case 1:
                ci.l8 l8Var = (ci.l8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                o8 o8Var = (o8) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(l8Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, o8Var);
                    break;
                } else {
                    o8Var.run(tLObject, tL_error);
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new a9((gg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2, 3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new n3((gg.d2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 6));
                break;
            case 4:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.vb vbVar = pbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (vbVar.z0 == null) {
                            vbVar.z0 = new HashMap();
                        }
                        vbVar.z0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new n3(pbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, b2Var, 14));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((up) obj4, (org.telegram.ui.ActionBar.b2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.n2) obj2, 12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new n3((nq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2, 20));
                break;
            case 7:
                xy0.r((rs0) obj4, this.d, (TLRPC.TL_messages_getAttachedStickers) obj3, (oo) obj2, tLObject, tL_error);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new g90(obj4, tL_error, obj, obj3, obj2, 5));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a9((nn0) obj4, tL_error, (String) obj, (dn0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2, 9));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new g90(obj4, tL_error, obj, obj3, obj2, 12));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new g90(obj4, tL_error, obj, obj3, obj2, 16));
                break;
            case 12:
                c41 c41Var = (c41) obj4;
                c41Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(c41Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 10));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) obj4, tLObject, (ea) obj, (String) obj3, (String) obj2));
                break;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                b1Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(b1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 18));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new a9((xh.r1) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (qg.f2) obj3, (Utilities.Callback) obj2, tL_error, 20));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new a9((yh.s3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 21));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new a9((yh.s3) obj4, tLObject, (tg.m1[]) obj, (Long) obj3, (tg.q) obj2, tL_error, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((yh.m5) obj4, (org.telegram.ui.ActionBar.b2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2, 11));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new a9((yh.m5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (cj) obj2, tL_error, 25));
                break;
            default:
                yh.d5 d5Var = (yh.d5) obj4;
                d5Var.getClass();
                AndroidUtilities.runOnUIThread(new a9(d5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (yh.e5) obj3, (Utilities.Callback) obj2, tL_error, 27));
                break;
        }
    }

    public /* synthetic */ q3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }
}
