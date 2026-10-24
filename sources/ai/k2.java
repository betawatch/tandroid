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
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.an0;
import org.telegram.ui.as0;
import org.telegram.ui.di1;
import org.telegram.ui.ig0;
import org.telegram.ui.im0;
import org.telegram.ui.kp;
import org.telegram.ui.oj0;
import org.telegram.ui.qm0;
import org.telegram.ui.s21;
import org.telegram.ui.ti;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                AndroidUtilities.runOnUIThread(new g3((l7) obj4, tLObject, (ug.l1[]) obj, (Long) obj3, (a3.l0) obj2, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new g3((l7) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new t0(obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (TLObject) obj3, obj2, 5));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new g3((ha) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (ti) obj2, tL_error, 4));
                break;
            case 4:
                v9 v9Var = (v9) obj4;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new g3(v9Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (y9) obj3, (Utilities.Callback) obj2, tL_error, 6));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new t0(obj4, obj, tL_error, (TLObject) obj3, obj2, 9));
                break;
            case 6:
                ei.a8 a8Var = (ei.a8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                h hVar = (h) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(a8Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, hVar);
                    break;
                } else {
                    hVar.run(tLObject, tL_error);
                    break;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new g3((hg.a1) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new t0((hg.c2) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2, 14));
                break;
            case 9:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
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
                AndroidUtilities.runOnUIThread(new t0(pbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, c2Var));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((kp) obj4, (org.telegram.ui.ActionBar.c2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.o2) obj2, 15));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new t0(obj4, tL_error, obj, obj3, (TLObject) obj2, 28));
                break;
            case 12:
                ty0.r((as0) obj4, this.c, (TLRPC.TL_messages_getAttachedStickers) obj3, (org.telegram.ui.vc) obj2, tLObject, tL_error);
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new g30((ig0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 13));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new g3((an0) obj4, tL_error, (String) obj, (qm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new g30((im0) obj4, tL_error, (oj0) obj, (n2.e) obj3, (TL_account.verifyEmail) obj2, 20));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new g30((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 24));
                break;
            case 17:
                s21 s21Var = (s21) obj4;
                s21Var.getClass();
                AndroidUtilities.runOnUIThread(new g3(s21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.b1) obj4, tLObject, (ci.y7) obj, (String) obj3, (String) obj2));
                break;
            case 19:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                b1Var.getClass();
                AndroidUtilities.runOnUIThread(new g3(b1Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new g3((yh.o1) obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (di1) obj3, (Utilities.Callback) obj2, tL_error));
                break;
        }
    }
}
