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
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.th;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ac0;
import org.telegram.ui.fj;
import org.telegram.ui.h41;
import org.telegram.ui.ql0;
import org.telegram.ui.qs0;
import org.telegram.ui.rq;
import org.telegram.ui.wm0;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l9(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                r9 r9Var = (r9) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                c2 c2Var = (c2) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(r9Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, c2Var);
                    break;
                } else {
                    c2Var.run(tLObject, tL_error);
                    break;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new te((fg.b1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ya((fg.f2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 2));
                break;
            case 3:
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.wb wbVar = qbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (wbVar.D0 == null) {
                            wbVar.D0 = new HashMap();
                        }
                        wbVar.D0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new ya(qbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, d2Var));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((yp) obj4, (org.telegram.ui.ActionBar.d2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.p2) obj2, 7));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ya((rq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2));
                break;
            case 6:
                hy0.p((qs0) obj4, this.c, (TLRPC.TL_messages_getAttachedStickers) obj3, (th) obj2, tLObject, tL_error);
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ac0(obj4, (Object) tL_error, (String) obj, obj3, obj2, 1));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new te((org.telegram.ui.ActionBar.p2) obj4, (Object) tL_error, obj, obj3, tLObject, obj2, 8));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ac0((wm0) obj4, tL_error, (ql0) obj, (n7.a1) obj3, (TL_account.verifyEmail) obj2, 8));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ac0(obj4, (Object) tL_error, obj, obj3, obj2, 12));
                break;
            case 11:
                h41 h41Var = (h41) obj4;
                h41Var.getClass();
                AndroidUtilities.runOnUIThread(new te(h41Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2, 9));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) obj4, tLObject, (org.telegram.ui.web.a1) obj, (String) obj3, (String) obj2));
                break;
            case 13:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new te(c1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2, 12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new te((wh.p1) obj4, (org.telegram.ui.ActionBar.d2) obj, tLObject, (xh.r6) obj3, (Utilities.Callback) obj2, tL_error));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new te((xh.x3) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 15));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new te((xh.x3) obj4, tLObject, (sg.p1[]) obj, (Long) obj3, (sx0) obj2, tL_error, 16));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new xh.x4((xh.v5) obj4, (org.telegram.ui.ActionBar.d2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2, 1));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new te((xh.v5) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (fj) obj2, tL_error, 19));
                break;
            case 19:
                xh.l5 l5Var = (xh.l5) obj4;
                l5Var.getClass();
                AndroidUtilities.runOnUIThread(new te(l5Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (xh.n5) obj3, (Utilities.Callback) obj2, tL_error, 21));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xh.x4((zh.a3) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj, (pb) obj2, 5));
                break;
        }
    }

    public /* synthetic */ l9(zh.a3 a3Var, Runnable runnable, TL_stories.StoryItem storyItem, pb pbVar) {
        this.a = 20;
        this.b = a3Var;
        this.d = runnable;
        this.c = storyItem;
        this.e = pbVar;
    }
}
