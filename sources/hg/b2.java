package hg;

import ai.sb;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m.g3;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.fh;
import org.telegram.ui.pc0;
import org.telegram.ui.r40;
import org.telegram.ui.sn;
import org.telegram.ui.v40;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements MediaDataController.KeywordResultCallback, e2.o, org.telegram.ui.ActionBar.a2, m4.o0, e2.j, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b2(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // e2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj) {
        m4.s1 s1Var;
        m4.f0 f0Var = (m4.f0) this.c;
        m4.v vVar = (m4.v) this.d;
        try {
            s1Var = (m4.s1) ((j9.y) obj).get();
            u6.l(s1Var, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            e2.a.m("MediaSessionStub", "Session operation failed", e);
            s1Var = new m4.s1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e7) {
            e2.a.m("MediaSessionStub", "Session operation cancelled", e7);
            s1Var = new m4.s1(1);
        } catch (ExecutionException e10) {
            e = e10;
            e2.a.m("MediaSessionStub", "Session operation failed", e);
            s1Var = new m4.s1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        m4.i1.P0(f0Var, vVar, this.b, s1Var);
    }

    @Override // m4.o0
    public void f(m4.v vVar) {
        byte[] bArr;
        m4.p0 p0Var = (m4.p0) this.c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.n.a;
        String str = hVar.a;
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i11 = 3;
        androidx.biometric.e eVar = new androidx.biometric.e(i11);
        eVar.b = hVar.r;
        b2.k0 k0Var2 = new b2.k0(eVar);
        CharSequence charSequence = hVar.b;
        b2.q0 q0Var = new b2.q0();
        q0Var.f = hVar.c;
        q0Var.g = hVar.d;
        q0Var.n = hVar.h;
        q0Var.i = m4.n.c(null);
        Bitmap bitmap = hVar.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        hVar.f = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    e2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = hVar.f;
        }
        if (bArr != null) {
            q0Var.b(bArr, 3);
        }
        Bundle bundle = hVar.n;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j10 = bundle2.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j10 != 0) {
                if (j10 == 1) {
                    i11 = 1;
                } else if (j10 == 2) {
                    i11 = 2;
                } else if (j10 != 3) {
                    if (j10 == 4) {
                        i11 = 4;
                    } else if (j10 == 5) {
                        i11 = 5;
                    } else if (j10 == 6) {
                        i11 = 6;
                    }
                }
                q0Var.q = Integer.valueOf(i11);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            q0Var.q = Integer.valueOf(i11);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        q0Var.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            q0Var.H = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            q0Var.J = e9.n0.u(e9.n0.u(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            q0Var.a = charSequence;
        } else {
            q0Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            q0Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            q0Var.I = bundle2;
        }
        q0Var.s = Boolean.TRUE;
        j9.y l4 = p0Var.g.l(vVar, e9.n0.y(new b2.o0(str2, new b2.e0(c0Var), null, new b2.i0(h0Var), new b2.r0(q0Var), k0Var2)));
        l4.a(new j9.u(0, l4, new a5.a(p0Var, vVar, this.b)), j9.r.a);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                ig.s sVar = (ig.s) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() <= 32) {
                    ig.y d = ig.y.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(sVar);
                    break;
                }
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.a0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 6:
                sn snVar = (sn) this.c;
                snVar.getMessagesController().pinMessage(snVar.e, snVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                qc B = xc.B(snVar, true, null, null, snVar.ea);
                B.j();
                ub ubVar = B.e;
                ubVar.postDelayed(new fh(0, ubVar), 550L);
                break;
            case 7:
                sn.s0((sn) this.c, this.b, (MessageObject) this.d);
                break;
            case 8:
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
            case 9:
                zn0 zn0Var = (zn0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = zn0Var.getText().toString();
                if (obj2.length() <= 12) {
                    MessagesController.getInstance(this.b).renameSavedReactionTag(ah.i1.d(reaction), obj2);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(zn0Var);
                    break;
                }
            case 11:
                r40 r40Var = (r40) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                v40 v40Var = r40Var.n;
                ChatObject.Call call = v40Var.b.a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i11 = this.b;
                call.toggleRecord(obj3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                v40Var.b.l1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((n2) i2.d.h(1, arrayList))) {
                    pc0 pc0Var = new pc0(0);
                    pc0Var.F0 = new i2.r(hashMap, this.b, 12);
                    launchActivity.t0(pc0Var);
                    break;
                }
                break;
            case 13:
                ((pc0) this.c).v0(RichMessageLayout.PART_MAX_HEIGHT_DP, (TLRPC.User) this.d, this.b);
                break;
            case 14:
                PasscodeActivity.U((PasscodeActivity) this.c, (od0) this.d, this.b);
                break;
            case 16:
                SessionsActivity.X((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) this.c;
        b2.e1 e1Var2 = (b2.e1) this.d;
        b2.d1 d1Var = (b2.d1) obj;
        int i10 = this.b;
        d1Var.onPositionDiscontinuity(i10);
        d1Var.onPositionDiscontinuity(e1Var, e1Var2, i10);
    }

    @Override // t5.b
    public Object j() {
        ea.b bVar = (ea.b) this.c;
        ((g3) bVar.d).U((l5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i10, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i10, str);
    }

    public /* synthetic */ b2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        c2 c2Var = (c2) this.c;
        HashMap hashMap = (HashMap) this.d;
        e2 e2Var = c2Var.a;
        int i10 = e2Var.P;
        HashMap hashMap2 = e2Var.I;
        if (this.b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                c2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    e2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            e2Var.l();
        }
    }

    public /* synthetic */ b2(Object obj, Object obj2, int i10, int i11) {
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
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new sb(b2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            b2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
