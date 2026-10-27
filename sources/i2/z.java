package i2;

import a8.ng;
import a8.yb;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import ig.d2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.a50;
import org.telegram.ui.hh;
import org.telegram.ui.rc0;
import org.telegram.ui.w40;
import org.telegram.ui.wn;
import org.telegram.ui.xj0;
import org.telegram.ui.zj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements e2.o, MediaDataController.KeywordResultCallback, b2, m4.o0, e2.j, NativeInstance.PayloadCallback, Utilities.Callback3Return, Utilities.Callback5, u5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(int i10, Object obj, Object obj2, int i11) {
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
        m4.t1 t1Var;
        m4.f0 f0Var = (m4.f0) this.c;
        m4.w wVar = (m4.w) this.d;
        try {
            t1Var = (m4.t1) ((k9.y) obj).get();
            yb.l(t1Var, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            e2.a.m("MediaSessionStub", "Session operation failed", e);
            t1Var = new m4.t1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e10) {
            e2.a.m("MediaSessionStub", "Session operation cancelled", e10);
            t1Var = new m4.t1(1);
        } catch (ExecutionException e11) {
            e = e11;
            e2.a.m("MediaSessionStub", "Session operation failed", e);
            t1Var = new m4.t1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        m4.j1.P0(f0Var, wVar, this.b, t1Var);
    }

    @Override // u5.b
    public Object f() {
        aa.b0 b0Var = (aa.b0) this.c;
        ((s4.d) b0Var.b).t((m5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                jg.t tVar = (jg.t) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = tVar.getText().toString();
                if (obj.length() <= 32) {
                    jg.z d = jg.z.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    e2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(tVar);
                    break;
                }
            case 3:
            case 4:
            case 5:
            case 10:
            case 14:
            case 16:
            default:
                StickersActivity.b0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 6:
                wn wnVar = (wn) this.c;
                wnVar.getMessagesController().pinMessage(wnVar.e, wnVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                qc B = wc.B(wnVar, true, null, null, wnVar.ua);
                B.j();
                ub ubVar = B.e;
                ubVar.postDelayed(new hh(0, ubVar), 550L);
                break;
            case 7:
                wn.p0((wn) this.c, this.b, (MessageObject) this.d);
                break;
            case 8:
                f5 f5Var = (f5) this.c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = f5Var.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    e2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(f5Var);
                    break;
                }
                break;
            case 9:
                jo0 jo0Var = (jo0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = jo0Var.getText().toString();
                if (obj2.length() <= 12) {
                    MessagesController.getInstance(this.b).renameSavedReactionTag(bh.x0.d(reaction), obj2);
                    e2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(jo0Var);
                    break;
                }
            case 11:
                w40 w40Var = (w40) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                a50 a50Var = w40Var.n;
                ChatObject.Call call = a50Var.b.a1;
                String obj3 = editTextBoldCursor.getText().toString();
                int i11 = this.b;
                call.toggleRecord(obj3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                a50Var.b.k1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.d0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((r2) ic.a.g(1, arrayList))) {
                    rc0 rc0Var = new rc0(0);
                    rc0Var.E0 = new r(hashMap, this.b, 12);
                    launchActivity.u0(rc0Var);
                    break;
                }
                break;
            case 13:
                ((rc0) this.c).x0(RichMessageLayout.PART_MAX_HEIGHT_DP, (TLRPC.User) this.d, this.b);
                break;
            case 15:
                PasscodeActivity.V((PasscodeActivity) this.c, (nd0) this.d, this.b);
                break;
            case 17:
                SessionsActivity.Y((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.o0
    public void i(m4.w wVar) {
        byte[] bArr;
        m4.p0 p0Var = (m4.p0) this.c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.o.a;
        String str = hVar.a;
        b2.d0 d0Var = new b2.d0();
        f9.g0 g0Var = f9.i0.b;
        f9.s1 s1Var = f9.s1.e;
        List list = Collections.EMPTY_LIST;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        a8.h0 h0Var = new a8.h0(8, false);
        h0Var.b = hVar.r;
        b2.l0 l0Var2 = new b2.l0(h0Var);
        CharSequence charSequence = hVar.b;
        b2.r0 r0Var = new b2.r0();
        r0Var.f = hVar.c;
        r0Var.g = hVar.d;
        r0Var.n = hVar.h;
        r0Var.i = m4.o.c(null);
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
        int i11 = 3;
        if (bArr != null) {
            r0Var.b(bArr, 3);
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
                r0Var.q = Integer.valueOf(i11);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            r0Var.q = Integer.valueOf(i11);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        r0Var.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            r0Var.H = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            r0Var.J = f9.i0.u(f9.i0.u(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            r0Var.a = charSequence;
        } else {
            r0Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            r0Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            r0Var.I = bundle2;
        }
        r0Var.s = Boolean.TRUE;
        k9.y l4 = p0Var.g.l(wVar, f9.i0.y(new b2.p0(str2, new b2.f0(d0Var), null, new b2.j0(i0Var), new b2.s0(r0Var), l0Var2)));
        l4.a(new k9.u((int) (null == true ? 1 : 0), (Object) l4, (Object) new ng(p0Var, wVar, this.b)), k9.r.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b2.f1 f1Var = (b2.f1) this.c;
        b2.f1 f1Var2 = (b2.f1) this.d;
        b2.e1 e1Var = (b2.e1) obj;
        int i10 = this.b;
        e1Var.onPositionDiscontinuity(i10);
        e1Var.onPositionDiscontinuity(f1Var, f1Var2, i10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i10, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i10, str);
    }

    public /* synthetic */ z(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ig.b2 b2Var = (ig.b2) this.c;
        HashMap hashMap = (HashMap) this.d;
        d2 d2Var = b2Var.a;
        int i10 = d2Var.P;
        HashMap hashMap2 = d2Var.I;
        if (this.b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                b2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    d2Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            d2Var.l();
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, int i10, int i11) {
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
        e2 e2Var = new e2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ag.p0(e2Var, i10, document, obj, tL_stickers_addStickerToSet, 9));
        try {
            e2Var.r(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zj0 zj0Var = (zj0) this.c;
        xj0 xj0Var = (xj0) this.d;
        u61 u61Var = (u61) obj;
        Object obj6 = u61Var.G;
        if (obj6 instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj6;
            Bundle bundle = new Bundle();
            long dialogId = messageObject.getDialogId();
            bundle.putLong(dialogId < 0 ? "chat_id" : "user_id", Math.abs(dialogId));
            bundle.putInt("message_id", messageObject.getId());
            bundle.putBoolean("from_news", true);
            bundle.putBoolean("for_news", true);
            if (zj0Var.getMessagesController().checkCanOpenChat(bundle, zj0Var)) {
                wn wnVar = new wn(bundle);
                wnVar.mb = messageObject;
                zj0Var.presentFragment(wnVar);
                return;
            }
            return;
        }
        int i10 = u61Var.d;
        if (i10 == -1) {
            zj0Var.l0(this.b, xj0Var.n);
        } else if (i10 == -2) {
            zj0Var.k0();
        }
    }
}
