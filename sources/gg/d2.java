package gg;

import ai.ya;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.bo;
import org.telegram.ui.j50;
import org.telegram.ui.kd0;
import org.telegram.ui.kh;
import org.telegram.ui.n50;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.b2, e2.m, m4.k0, NativeInstance.PayloadCallback, Utilities.Callback3Return, t5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d2(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                hg.s sVar = (hg.s) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() <= 32) {
                    hg.y d = hg.y.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(sVar);
                    break;
                }
            case 2:
            case 3:
            case 4:
            case 9:
            case 14:
            default:
                StickersActivity.a0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 5:
                bo boVar = (bo) this.c;
                boVar.getMessagesController().pinMessage(boVar.e, boVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                oc B = vc.B(boVar, true, null, null, boVar.ea);
                B.j();
                sb sbVar = B.e;
                sbVar.postDelayed(new kh(0, sbVar), 550L);
                break;
            case 6:
                bo.Q0((bo) this.c, this.b, (MessageObject) this.d);
                break;
            case 7:
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
            case 8:
                dn0 dn0Var = (dn0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = dn0Var.getText().toString();
                if (obj2.length() <= 12) {
                    MessagesController.getInstance(this.b).renameSavedReactionTag(zg.p0.d(reaction), obj2);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(dn0Var);
                    break;
                }
            case 10:
                j50 j50Var = (j50) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                n50 n50Var = j50Var.n;
                ChatObject.Call call = n50Var.b.a1;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i11 = this.b;
                call.toggleRecord(obj3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                n50Var.b.k1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((o2) hg.k0.h(1, arrayList))) {
                    kd0 kd0Var = new kd0(0);
                    kd0Var.F0 = new i2.s(hashMap, this.b, 11);
                    launchActivity.p0(kd0Var);
                    break;
                }
                break;
            case 12:
                ((kd0) this.c).w0(RichMessageLayout.PART_MAX_HEIGHT_DP, (TLRPC.User) this.d, this.b);
                break;
            case 13:
                PasscodeActivity.U((PasscodeActivity) this.c, (uc0) this.d, this.b);
                break;
            case 15:
                SessionsActivity.X((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
        }
    }

    @Override // m4.k0
    public void g(m4.r rVar) {
        byte[] bArr;
        int i10;
        m4.l0 l0Var = (m4.l0) this.c;
        n4.l lVar = (n4.l) this.d;
        if (TextUtils.isEmpty(lVar.a)) {
            e2.a.n("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i11 = m4.k.a;
        String str = lVar.a;
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        aa.a aVar = new aa.a(4);
        aVar.c = lVar.n;
        b2.g0 g0Var3 = new b2.g0(aVar);
        CharSequence charSequence = lVar.b;
        b2.m0 m0Var = new b2.m0();
        m0Var.f = lVar.c;
        m0Var.g = lVar.d;
        m0Var.m = lVar.f;
        m0Var.i = m4.k.c(null);
        Bitmap bitmap = lVar.e;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e2.a.o("LegacyConversions", "Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            m0Var.k = bArr == null ? null : (byte[]) bArr.clone();
            m0Var.l = 3;
        }
        Bundle bundle = lVar.h;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j3 = bundle2.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j3 != 0) {
                if (j3 == 1) {
                    i10 = 1;
                } else if (j3 == 2) {
                    i10 = 2;
                } else if (j3 == 3) {
                    i10 = 3;
                } else if (j3 == 4) {
                    i10 = 4;
                } else if (j3 == 5) {
                    i10 = 5;
                } else if (j3 == 6) {
                    i10 = 6;
                }
                m0Var.p = Integer.valueOf(i10);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            m0Var.p = Integer.valueOf(i10);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        m0Var.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            m0Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            m0Var.I = e9.i0.v(e9.i0.v(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            m0Var.a = charSequence;
        } else {
            m0Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            m0Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            m0Var.H = bundle2;
        }
        m0Var.r = Boolean.TRUE;
        i9.w l4 = l0Var.g.l(rVar, e9.i0.z(new b2.k0(str2, new b2.a0(yVar), null, new b2.e0(d0Var), new b2.n0(m0Var), g0Var3)));
        l4.a(new i9.s(0, l4, new a5.a(l0Var, rVar, this.b)), i9.q.a);
    }

    @Override // t5.b
    public Object i() {
        da.b bVar = (da.b) this.c;
        ((lf.i) bVar.d).V((l5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // e2.m
    public void invoke(Object obj) {
        b2.a1 a1Var = (b2.a1) this.c;
        b2.a1 a1Var2 = (b2.a1) this.d;
        b2.z0 z0Var = (b2.z0) obj;
        int i10 = this.b;
        z0Var.onPositionDiscontinuity(i10);
        z0Var.onPositionDiscontinuity(a1Var, a1Var2, i10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i10, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i10, str);
    }

    public /* synthetic */ d2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        e2 e2Var = (e2) this.c;
        HashMap hashMap = (HashMap) this.d;
        g2 g2Var = e2Var.a;
        int i10 = g2Var.P;
        HashMap hashMap2 = g2Var.I;
        if (this.b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                e2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    g2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            g2Var.l();
        }
    }

    public /* synthetic */ d2(Object obj, Object obj2, int i10, int i11) {
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
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ya(c2Var, i10, document, obj, tL_stickers_addStickerToSet, 6));
        try {
            c2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
