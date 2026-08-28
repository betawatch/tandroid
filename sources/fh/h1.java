package fh;

import android.util.LongSparseArray;
import gh.l7;
import gh.n7;
import gh.v7;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a8;
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
import org.telegram.ui.Components.cx0;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.fm0;
import org.telegram.ui.hp;
import org.telegram.ui.hr;
import org.telegram.ui.jb;
import org.telegram.ui.nm0;
import org.telegram.ui.or0;
import org.telegram.ui.pb;
import org.telegram.ui.rc;
import org.telegram.ui.ri;
import org.telegram.ui.wm0;
import org.telegram.ui.y21;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i9 = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1((p2) obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (g1) obj3, (Utilities.Callback) obj2, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new k1((gh.k5) obj4, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj3, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2, tL_error, 1, false));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new k1((gh.k5) obj4, tLObject, (bg.g3[]) obj, (Long) obj3, (androidx.car.app.utils.b) obj2, tL_error, 2, false));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bg.o0((v7) obj4, (org.telegram.ui.ActionBar.c2) obj, tLObject, (TL_stars.InputSavedStarGift) obj3, (Utilities.Callback) obj2));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new k1((v7) obj4, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj3, (ri) obj2, tL_error, 5, false));
                break;
            case 5:
                l7 l7Var = (l7) obj4;
                l7Var.getClass();
                AndroidUtilities.runOnUIThread(new k1(l7Var, tLObject, (TL_stars.TL_starGiftCollection) obj, (n7) obj3, (Utilities.Callback) obj2, tL_error, 7, false));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new bg.o0(obj4, obj, tL_error, (TLObject) obj3, obj2, 14));
                break;
            case 7:
                a8 a8Var = (a8) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj3;
                bf.a aVar = (bf.a) obj2;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyItem != null) {
                    FileRefController.getInstance(a8Var.a).requestReference(storyItem, tL_messages_getAttachedStickers, aVar);
                    break;
                } else {
                    aVar.run(tLObject, tL_error);
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new k1((of.x0) obj4, (String) obj, tL_error, tLObject, (MessagesController) obj3, (MessagesStorage) obj2));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new bg.o0((of.w1) obj4, (TLRPC.TL_messages_getStickers) obj, tLObject, (ArrayList) obj3, (LongSparseArray) obj2));
                break;
            case 10:
                jb jbVar = (jb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                pb pbVar = jbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (pbVar.z0 == null) {
                            pbVar.z0 = new HashMap();
                        }
                        pbVar.z0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new bg.o0(jbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, c2Var, 23));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.k6((hp) obj4, (org.telegram.ui.ActionBar.c2[]) obj, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.o2) obj2, 10));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bg.o0(obj4, tL_error, obj, obj3, (TLObject) obj2, 29));
                break;
            case 13:
                cx0.p((or0) obj4, this.c, (TLRPC.TL_messages_getAttachedStickers) obj3, (rc) obj2, tLObject, tL_error);
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new hr((fg0) obj4, tL_error, (String) obj, (String) obj3, (String) obj2, 14));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new k1((wm0) obj4, tL_error, (String) obj, (nm0) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj2));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new hr((fm0) obj4, tL_error, (zk0) obj, (org.telegram.ui.Cells.e3) obj3, (TL_account.verifyEmail) obj2, 21));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new hr((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj, (TLRPC.GlobalPrivacySettings) obj3, (TL_account.setGlobalPrivacySettings) obj2, 25));
                break;
            case 18:
                y21 y21Var = (y21) obj4;
                y21Var.getClass();
                AndroidUtilities.runOnUIThread(new k1(y21Var, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k1((org.telegram.ui.web.y0) obj4, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj3, tL_error, (String) obj2));
                break;
        }
    }

    public /* synthetic */ h1(jb jbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = 10;
        this.b = jbVar;
        this.d = tL_chatInviteExported;
        this.e = zArr;
        this.c = c2Var;
    }
}
