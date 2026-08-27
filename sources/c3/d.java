package c3;

import a5.n;
import android.content.Context;
import android.text.TextUtils;
import cg.p2;
import d5.k;
import gf.j0;
import ig.q0;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.om0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.r40;
import org.telegram.ui.rn;
import org.telegram.ui.tc0;
import org.telegram.ui.v40;
import org.telegram.ui.zg;
import pf.k1;
import pf.l1;
import qf.p;
import qf.v;
import w2.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements e3.b, k, NativeInstance.PayloadCallback, a2, Utilities.Callback3Return, MediaDataController.KeywordResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                rn rnVar = (rn) this.c;
                rnVar.getMessagesController().pinMessage(rnVar.e, rnVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                ec B = mc.B(rnVar, true, null, null, rnVar.aa);
                B.j();
                jb jbVar = B.e;
                jbVar.postDelayed(new zg(0, jbVar), 550L);
                break;
            case 4:
                rn.Q0((rn) this.c, this.b, (MessageObject) this.d);
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    break;
                }
                break;
            case 6:
                om0 om0Var = (om0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = om0Var.getText().toString();
                if (obj.length() <= 12) {
                    MessagesController.getInstance(this.b).renameSavedReactionTag(q0.d(reaction), obj);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(om0Var);
                    break;
                }
            case 7:
            case 12:
            default:
                p pVar = (p) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = pVar.getText().toString();
                if (obj2.length() <= 32) {
                    v d = v.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj2;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(pVar);
                    break;
                }
            case 8:
                r40 r40Var = (r40) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                v40 v40Var = r40Var.n;
                ChatObject.Call call = v40Var.b.W0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i11 = this.b;
                call.toggleRecord(obj3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                v40Var.b.k1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.Z;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((n2) i0.a.i(1, arrayList))) {
                    tc0 tc0Var = new tc0(0);
                    tc0Var.B0 = new p2(hashMap, this.b, 10);
                    launchActivity.p0(tc0Var);
                    break;
                }
                break;
            case 10:
                ((tc0) this.c).w0(RichMessageLayout.PART_MAX_HEIGHT_DP, (TLRPC.User) this.d, this.b);
                break;
            case 11:
                PasscodeActivity.U((PasscodeActivity) this.c, (fc0) this.d, this.b);
                break;
            case 13:
                SessionsActivity.X((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
            case 14:
                StickersActivity.a0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
        }
    }

    @Override // e3.b
    public Object i() {
        g gVar = (g) this.c;
        ((n) gVar.d).y((i) this.d, this.b + 1, false);
        return null;
    }

    @Override // d5.k
    public void invoke(Object obj) {
        h3.b2 b2Var = (h3.b2) this.c;
        h3.b2 b2Var2 = (h3.b2) this.d;
        h3.a2 a2Var = (h3.a2) obj;
        int i10 = this.b;
        a2Var.onPositionDiscontinuity(i10);
        a2Var.onPositionDiscontinuity(b2Var, b2Var2, i10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i10, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i10, str);
    }

    public /* synthetic */ d(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        k1 k1Var = (k1) this.c;
        HashMap hashMap = (HashMap) this.d;
        l1 l1Var = k1Var.a;
        int i10 = l1Var.L;
        HashMap hashMap2 = l1Var.E;
        if (this.b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                k1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    l1Var.F.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            l1Var.l();
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        int i10 = this.b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        b2 b2Var = new b2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new j0(b2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            b2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
