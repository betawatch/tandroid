package e3;

import android.content.Context;
import android.text.TextUtils;
import eg.n2;
import f5.j;
import j3.a2;
import j7.l1;
import java.util.ArrayList;
import java.util.HashMap;
import jf.i0;
import kg.q0;
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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.q40;
import org.telegram.ui.rc0;
import org.telegram.ui.tn;
import org.telegram.ui.u40;
import org.telegram.ui.wg;
import rf.m1;
import sf.o;
import sf.u;
import y2.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g3.b, j, NativeInstance.PayloadCallback, b2, Utilities.Callback3Return, MediaDataController.KeywordResultCallback {
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

    @Override // g3.b
    public Object f() {
        f fVar = (f) this.c;
        ((androidx.biometric.e) fVar.d).A((i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                tn tnVar = (tn) this.c;
                tnVar.getMessagesController().pinMessage(tnVar.e, tnVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                mc B = tc.B(tnVar, true, null, null, tnVar.aa);
                B.j();
                rb rbVar = B.e;
                rbVar.postDelayed(new wg(0, rbVar), 550L);
                break;
            case 4:
                tn.Q0((tn) this.c, this.b, (MessageObject) this.d);
                break;
            case 5:
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
            case 6:
                ym0 ym0Var = (ym0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = ym0Var.getText().toString();
                if (obj.length() <= 12) {
                    MessagesController.getInstance(this.b).renameSavedReactionTag(q0.d(reaction), obj);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(ym0Var);
                    break;
                }
            case 7:
            case 12:
            default:
                o oVar = (o) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = oVar.getText().toString();
                if (obj2.length() <= 32) {
                    u d = u.d(this.b);
                    TL_account.TL_businessChatLink c3 = d.c(tL_businessChatLink.link);
                    if (c3 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c3.message;
                        tL_inputBusinessChatLink.entities = c3.entities;
                        tL_inputBusinessChatLink.title = obj2;
                        d.b(c3, tL_inputBusinessChatLink, null);
                    }
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(oVar);
                    break;
                }
            case 8:
                q40 q40Var = (q40) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                u40 u40Var = q40Var.n;
                ChatObject.Call call = u40Var.b.W0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i11 = this.b;
                call.toggleRecord(obj3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                u40Var.b.k1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.Z;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((o2) l1.i(1, arrayList))) {
                    rc0 rc0Var = new rc0(0);
                    rc0Var.B0 = new n2(hashMap, this.b, 10);
                    launchActivity.p0(rc0Var);
                    break;
                }
                break;
            case 10:
                ((rc0) this.c).w0(RichMessageLayout.PART_MAX_HEIGHT_DP, (TLRPC.User) this.d, this.b);
                break;
            case 11:
                PasscodeActivity.U((PasscodeActivity) this.c, (qc0) this.d, this.b);
                break;
            case 13:
                SessionsActivity.X((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
            case 14:
                StickersActivity.a0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
        }
    }

    @Override // f5.j
    public void invoke(Object obj) {
        j3.b2 b2Var = (j3.b2) this.c;
        j3.b2 b2Var2 = (j3.b2) this.d;
        a2 a2Var = (a2) obj;
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
        rf.l1 l1Var = (rf.l1) this.c;
        HashMap hashMap = (HashMap) this.d;
        m1 m1Var = l1Var.a;
        int i10 = m1Var.L;
        HashMap hashMap2 = m1Var.E;
        if (this.b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                l1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    m1Var.F.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            m1Var.l();
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
        c2 c2Var = new c2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new i0(c2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            c2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
