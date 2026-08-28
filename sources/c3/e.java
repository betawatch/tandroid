package c3;

import a5.m;
import android.content.Context;
import android.text.TextUtils;
import bg.x2;
import d5.k;
import ff.j0;
import h3.a2;
import hg.r0;
import java.util.ArrayList;
import java.util.HashMap;
import of.w1;
import of.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.n40;
import org.telegram.ui.pc0;
import org.telegram.ui.qn;
import org.telegram.ui.r40;
import org.telegram.ui.xg;
import pf.o;
import pf.u;
import w2.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements e3.b, k, MediaDataController.KeywordResultCallback, NativeInstance.PayloadCallback, b2, Utilities.Callback3Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(int i9, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 4:
                qn qnVar = (qn) this.c;
                qnVar.getMessagesController().pinMessage(qnVar.e, qnVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                gc B = oc.B(qnVar, true, null, null, qnVar.aa);
                B.j();
                lb lbVar = B.e;
                lbVar.postDelayed(new xg(0, lbVar), 550L);
                break;
            case 5:
                qn.Q0((qn) this.c, this.b, (MessageObject) this.d);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    break;
                }
                break;
            case 7:
                mm0 mm0Var = (mm0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = mm0Var.getText().toString();
                if (obj.length() <= 12) {
                    MessagesController.getInstance(this.b).renameSavedReactionTag(r0.d(reaction), obj);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(mm0Var);
                    break;
                }
            case 8:
            case 13:
            default:
                o oVar = (o) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = oVar.getText().toString();
                if (obj2.length() <= 32) {
                    u d = u.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj2;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(oVar);
                    break;
                }
            case 9:
                n40 n40Var = (n40) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                r40 r40Var = n40Var.n;
                ChatObject.Call call = r40Var.b.W0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i10 = this.b;
                call.toggleRecord(obj3, i10);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                r40Var.b.k1().j(i10 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.Z;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((o2) j3.r0.j(1, arrayList))) {
                    pc0 pc0Var = new pc0(0);
                    pc0Var.B0 = new x2(hashMap, this.b, 10);
                    launchActivity.p0(pc0Var);
                    break;
                }
                break;
            case 11:
                ((pc0) this.c).v0(RichMessageLayout.PART_MAX_HEIGHT_DP, (TLRPC.User) this.d, this.b);
                break;
            case 12:
                PasscodeActivity.T((PasscodeActivity) this.c, (bc0) this.d, this.b);
                break;
            case 14:
                SessionsActivity.W((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
            case 15:
                StickersActivity.Z((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        h3.b2 b2Var = (h3.b2) this.c;
        h3.b2 b2Var2 = (h3.b2) this.d;
        a2 a2Var = (a2) obj;
        int i9 = this.b;
        a2Var.onPositionDiscontinuity(i9);
        a2Var.onPositionDiscontinuity(b2Var, b2Var2, i9);
    }

    @Override // e3.b
    public Object j() {
        h hVar = (h) this.c;
        ((m) hVar.d).A((i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i9, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i9, str);
    }

    public /* synthetic */ e(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        w1 w1Var = (w1) this.c;
        HashMap hashMap = (HashMap) this.d;
        y1 y1Var = w1Var.a;
        int i9 = y1Var.L;
        HashMap hashMap2 = y1Var.E;
        if (this.b != i9) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                w1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    y1Var.F.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            y1Var.l();
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        int i9 = this.b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i9));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        c2 c2Var = new c2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new j0(c2Var, i9, document, obj, tL_stickers_addStickerToSet, 9));
        try {
            c2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
