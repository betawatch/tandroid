package ei;

import ai.c9;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import ci.oc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wh;
import org.telegram.messenger.yg;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.fh0;
import org.telegram.ui.fs0;
import org.telegram.ui.gg0;
import org.telegram.ui.gn;
import org.telegram.ui.gy;
import org.telegram.ui.i60;
import org.telegram.ui.ln;
import org.telegram.ui.pr0;
import org.telegram.ui.uy;
import org.telegram.ui.xm;
import org.telegram.ui.y80;
import org.telegram.ui.zi;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 20;
        this.b = i10;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    private final void a() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        y80 y80Var = (y80) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        ArrayList arrayList = launchActivity.d0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            y80Var.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.FloodWait);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            launchActivity.B0(alertDialog$Builder);
            return;
        }
        if (launchActivity.q0 == null || updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        int i10 = this.b;
        MessagesController.getInstance(i10).putUsers(updates.users, false);
        MessagesController.getInstance(i10).putChats(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || MessagesController.getInstance(i10).checkCanOpenChat(bundle, (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList))) {
            zn znVar = new zn(bundle);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            ((ActionBarLayout) launchActivity.O()).S(znVar, false, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        char c10;
        final long j3;
        long j10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.n2 R;
        boolean z11;
        xc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        long j11 = 0;
        int i11 = 0;
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.c;
                int i12 = this.b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    h9 h9Var = new h9((e6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    h9 h9Var2 = new h9((e6) null);
                    h9Var2.q(chat);
                    w9Var.e(chat, h9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        h9 h9Var3 = new h9((e6) null);
                        h9Var3.r(user2);
                        w9Var2.e(user2, h9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                if (w9Var2 != null) {
                    h9 h9Var4 = new h9((e6) null);
                    h9Var4.q(chat2);
                    w9Var2.e(chat2, h9Var4);
                }
                if (textView != null) {
                    textView.setText(chat2 != null ? chat2.title : "");
                    return;
                }
                return;
            case 1:
                TLObject tLObject = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i13 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    callback.run("SERVER_ERROR");
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i13).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z10 = true;
                    c10 = 0;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i13).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                } else {
                    z10 = true;
                    c10 = 0;
                }
                if (zArr[c10]) {
                    return;
                }
                zArr[c10] = z10;
                callback.run(null);
                return;
            case 2:
                final gg.i0 i0Var = (gg.i0) this.c;
                int i14 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f;
                gg.z zVar = i0Var.j0;
                ArrayList arrayList6 = i0Var.v0;
                int i15 = i0Var.s0;
                i0Var.D0--;
                if (i14 != i0Var.d0) {
                    return;
                }
                i0Var.f0 = i14;
                if (i0Var.e0 != i14) {
                    zVar.b();
                }
                if (i0Var.g0 != i14) {
                    i0Var.I.clear();
                }
                i0Var.N = true;
                int i16 = 0;
                while (i16 < arrayList3.size()) {
                    if (!i0Var.F(arrayList3.get(i16))) {
                        arrayList3.remove(i16);
                        i16--;
                    }
                    i16++;
                }
                boolean z12 = true;
                int size = arrayList6.size();
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    final Object obj2 = arrayList3.get(i17);
                    if (obj2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj2;
                        MessagesController.getInstance(i15).putUser(user3, z12);
                        j3 = user3.id;
                    } else if (obj2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                        MessagesController.getInstance(i15).putChat(chat3, z12);
                        j3 = -chat3.id;
                    } else {
                        if (obj2 instanceof TLRPC.EncryptedChat) {
                            MessagesController.getInstance(i15).putEncryptedChat((TLRPC.EncryptedChat) obj2, z12);
                        }
                        j3 = j11;
                    }
                    if (j3 == j11 || ((TLRPC.Dialog) MessagesController.getInstance(i15).dialogs_dict.f(j3)) != null) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        MessagesStorage.getInstance(i15).getDialogFolderId(j3, new MessagesStorage.IntCallback() { // from class: gg.x
                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                            public final void run(int i18) {
                                int i19 = i0.this.s0;
                                if (i18 != -1) {
                                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                    long j12 = j3;
                                    tL_dialog.id = j12;
                                    if (i18 != 0) {
                                        tL_dialog.folder_id = i18;
                                    }
                                    Object obj3 = obj2;
                                    if (obj3 instanceof TLRPC.Chat) {
                                        tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                    }
                                    MessagesController.getInstance(i19).dialogs_dict.k(tL_dialog, j12);
                                    MessagesController.getInstance(i19).getAllDialogs().add(tL_dialog);
                                    MessagesController.getInstance(i19).sortDialogs(null);
                                }
                            }
                        });
                    }
                    if (i0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                        gy gyVar = i0Var.U;
                        boolean z13 = gyVar != null && gyVar.a() == j3;
                        int i18 = 0;
                        while (!z13 && i18 < size) {
                            gg.h0 h0Var = (gg.h0) arrayList6.get(i18);
                            int i19 = i18;
                            z13 = (h0Var == null || h0Var.c != j3) ? z13 : true;
                            i18 = i19 + 1;
                        }
                        if (z13) {
                            arrayList3.remove(i17);
                            arrayList4.remove(i17);
                            i17--;
                        }
                    }
                    i17++;
                    j11 = j10;
                    z12 = true;
                }
                MessagesController.getInstance(i15).putUsers(arrayList5, true);
                i0Var.s = arrayList3;
                i0Var.G = arrayList4;
                zVar.f(arrayList3, arrayList6);
                i0Var.l();
                gy gyVar2 = i0Var.U;
                if (gyVar2 != null) {
                    gyVar2.d(i0Var.D0 > 0, true);
                    i0Var.U.c();
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.c;
                int i20 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                if (i20 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f.f(arrayList7, null);
                    u1Var.y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                i2.c1 c1Var = (i2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f, this.b);
                return;
            case 5:
                ki.m mVar = (ki.m) this.c;
                Size size2 = (Size) this.d;
                int i21 = this.b;
                RuntimeException[] runtimeExceptionArr = (RuntimeException[]) this.e;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    try {
                        mVar.a = size2;
                        mVar.e = i21;
                        SurfaceTexture surfaceTexture = mVar.k;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        mVar.e();
                        ki.v vVar = mVar.u;
                        if (vVar != null) {
                            vVar.t(size2, i21);
                        }
                        ki.j jVar = mVar.d;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size2);
                        sb2.append(", crop=");
                        sb2.append(i21);
                        sb2.append(", filter=");
                        sb2.append(mVar.e == mVar.c ? "NEAREST" : "LINEAR");
                        jVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th2) {
                    countDownLatch.countDown();
                    throw th2;
                }
            case 6:
                m4.k0 k0Var = (m4.k0) this.c;
                m4.l1 l1Var = (m4.l1) this.d;
                int i22 = this.b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.j0 j0Var = (m4.j0) this.f;
                oi.f fVar = k0Var.f;
                if (k0Var.g.j()) {
                    return;
                }
                if (!((n4.r) k0Var.k.b).a.isActive()) {
                    StringBuilder sb3 = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb3.append(l1Var == null ? Integer.valueOf(i22) : l1Var.b);
                    sb3.append(", pid=");
                    sb3.append(a0Var.a.b);
                    e2.a.n("MediaSessionLegacyStub", sb3.toString());
                    return;
                }
                m4.r L = k0Var.L(a0Var);
                if (l1Var != null) {
                    if (!fVar.D(L, l1Var)) {
                        return;
                    }
                } else if (!fVar.C(L, i22)) {
                    return;
                }
                try {
                    j0Var.g(L);
                    return;
                } catch (RemoteException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                    return;
                }
            case 7:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.c, (Location) this.d, this.b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f);
                return;
            case 8:
                ((MediaDataController) this.c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.b, (int[]) this.f);
                return;
            case 9:
                ((MessagesController) this.c).lambda$processUpdateArray$403((yf.s) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                return;
            case 10:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                return;
            case 11:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                return;
            case 12:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (yg) this.f, this.b);
                return;
            case 13:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                return;
            case 14:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f;
                int i23 = this.b;
                ArrayList arrayList11 = new ArrayList();
                int size3 = arrayList10.size();
                int i24 = 0;
                while (i24 < size3) {
                    Object obj3 = arrayList10.get(i24);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = h4Var.u0[i11].c.E;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.h4.C(h4Var, webPage, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i25 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i25);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.q3 q3Var = new org.telegram.ui.q3();
                                    q3Var.a = indexOf;
                                    q3Var.c = pageBlock;
                                    q3Var.b = obj;
                                    arrayList11.add(q3Var);
                                }
                                i25 = length;
                            }
                        }
                    }
                    i24++;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(h4Var, i23, arrayList11, str, 10));
                return;
            case 15:
                TLObject tLObject2 = (TLObject) this.c;
                int i26 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                if (!(tLObject2 instanceof TLRPC.Updates)) {
                    if (!(tLObject2 instanceof TL_phone.groupCall)) {
                        if (tL_error != null) {
                            xc.a0(n2Var).d0(tL_error, false);
                            return;
                        }
                        return;
                    }
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i26).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i26).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall = groupcall.call;
                    tL_inputGroupCall.id = groupCall.id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i26, tL_inputGroupCall, false, groupCall, hashSet);
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                MessagesController.getInstance(i26).putUsers(updates.users, false);
                MessagesController.getInstance(i26).putChats(updates.chats, false);
                ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                int size4 = findUpdatesAndRemove.size();
                TLRPC.GroupCall groupCall2 = null;
                while (i11 < size4) {
                    Object obj4 = findUpdatesAndRemove.get(i11);
                    i11++;
                    groupCall2 = ((TL_update.TL_updateGroupCall) obj4).call;
                }
                if (LaunchActivity.G1 == null || groupCall2 == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall2.id = groupCall2.id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i26, tL_inputGroupCall2, false, groupCall2, hashSet);
                return;
            case 16:
                zn.t1((zn) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                return;
            case 17:
                ln lnVar = (ln) this.c;
                zi ziVar = (zi) this.d;
                ziVar.b = lnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new gn(lnVar, ziVar, (zn) this.f));
                return;
            case 18:
                ln lnVar2 = (ln) this.c;
                int i27 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                zn znVar = lnVar2.a;
                znVar.Xa(i27, messageObject.getId(), true, messageObject.getDialogId() == znVar.L6 ? 1 : 0, true, 0, num, bArr, new xm(lnVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i28 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new org.telegram.ui.Components.y1(iArr, runnable, i28));
                n2Var2.showDialog(b2VarArr[0]);
                return;
            case 20:
                int i29 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                if (!LaunchActivity.C1 || (R = LaunchActivity.R()) == null || R.getParentActivity() == null) {
                    return;
                }
                rg.j0 j0Var2 = new rg.j0(11, i29, R.getParentActivity(), R, null);
                j0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                j0Var2.show();
                return;
            case 21:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                int i30 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    b2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i30).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i30).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                n2Var3.presentFragment(new zn(bundle));
                return;
            case 22:
                fs.P((fs) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                return;
            case 23:
                jw0 jw0Var = (jw0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i31 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f;
                int[] iArr2 = jw0Var.e;
                RLottieNative[] rLottieNativeArr = jw0Var.f1;
                if (jw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new hw0(jw0Var, 2));
                    return;
                }
                boolean z14 = false;
                int i32 = 0;
                while (i32 < rLottieNativeArr.length) {
                    if (rLottieNativeArr[i32] == null) {
                        int i33 = i32 == 0 ? 1 : i32 == 1 ? 8 : i32 == 2 ? 14 : i32 == 3 ? 20 : 2;
                        if (i33 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i33);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new iw0(document, i31, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                z14 = true;
                            } else {
                                rLottieNativeArr[i32] = RLottieNative.b(readRes, iArr2, null, null);
                                jw0Var.g1[i32] = iArr2[0];
                            }
                        }
                    }
                    i32++;
                }
                if (z14) {
                    AndroidUtilities.runOnUIThread(new hw0(jw0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new wm(jw0Var, i31, u1Var2, 17));
                    return;
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i34 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f;
                Pattern pattern = LaunchActivity.B1;
                if (launchActivity.isFinishing()) {
                    return;
                }
                if (tLObject3 == null || launchActivity.q0 == null) {
                    if (launchActivity.W == null) {
                        launchActivity.W = new ArrayList();
                    }
                    launchActivity.W.add(0, launchActivity.X);
                    launchActivity.X = null;
                    launchActivity.i0(true);
                } else {
                    TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                    Bundle i35 = a4.a.i("onlySelect", true);
                    i35.putString("importTitle", tL_messages_historyImportParsed.title);
                    i35.putBoolean("allowSwitchAccount", true);
                    if (tL_messages_historyImportParsed.pm) {
                        i35.putInt("dialogsType", 12);
                    } else if (tL_messages_historyImportParsed.group) {
                        i35.putInt("dialogsType", 11);
                    } else {
                        String uri2 = uri.toString();
                        Iterator<String> it = MessagesController.getInstance(i34).exportPrivateUri.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                            } else if (uri2.contains(it.next())) {
                                i35.putInt("dialogsType", 12);
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            Iterator<String> it2 = MessagesController.getInstance(i34).exportGroupUri.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (uri2.contains(it2.next())) {
                                        i35.putInt("dialogsType", 11);
                                        z11 = true;
                                    }
                                }
                            }
                            if (!z11) {
                                i35.putInt("dialogsType", 13);
                            }
                        }
                    }
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                        SecretMediaViewer.f().e(false, false);
                    } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                        PhotoViewer.t1().G0(false, true);
                    } else if (org.telegram.ui.h4.I() && org.telegram.ui.h4.x().V) {
                        org.telegram.ui.h4.x().o(false, true);
                    }
                    oc.x();
                    i60 i60Var = i60.D3;
                    if (i60Var != null) {
                        i60Var.dismiss();
                    }
                    if (AndroidUtilities.isTablet()) {
                        launchActivity.q0.U(true, true);
                        launchActivity.s0.U(true, true);
                    }
                    uy uyVar = new uy(i35);
                    uyVar.C2 = launchActivity;
                    ((ActionBarLayout) launchActivity.O()).S(uyVar, !AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof fh0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() + (-1)) instanceof fh0), false);
                }
                try {
                    b2Var3.dismiss();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 25:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i36 = this.b;
                String str2 = (String) this.e;
                y80 y80Var = (y80) this.f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity2.d0);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
                        boolean z15 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z15) {
                            TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                            arrayList2 = tL_chatlists_chatlistInvite.chats;
                            arrayList = tL_chatlists_chatlistInvite.users;
                        } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                            TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                            arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                            arrayList = tL_chatlists_chatlistInviteAlready.users;
                        } else {
                            arrayList = null;
                            arrayList2 = null;
                        }
                        MessagesController.getInstance(i36).putChats(arrayList2, false);
                        MessagesController.getInstance(i36).putUsers(arrayList, false);
                        if (!z15 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            c10 c10Var = new c10(n2Var4, false);
                            c10Var.Y = -1;
                            c10Var.c0 = "";
                            c10Var.d0 = new ArrayList();
                            c10Var.f0 = "";
                            c10Var.h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            c10Var.i0 = arrayList16;
                            c10Var.z0 = -1;
                            c10Var.C0 = -5;
                            c10Var.X = str2;
                            c10Var.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z15) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                c10Var.c0 = tL_textWithEntities.text;
                                c10Var.d0 = tL_textWithEntities.entities;
                                c10Var.e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                c10Var.g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                c10Var.g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                c10Var.j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                c10Var.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i11 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i11);
                                            if (dialogFilter.id == c10Var.Y) {
                                                c10Var.c0 = dialogFilter.name;
                                                c10Var.d0 = dialogFilter.entities;
                                                c10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            }
                            c10Var.S();
                            n2Var4.showDialog(c10Var);
                            y80Var.run();
                            return;
                        }
                        a02 = xc.a0(n2Var4);
                        i10 = R.string.NoFolderFound;
                    } else {
                        a02 = xc.a0(n2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    y80Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                wh.o(i10, a02, null);
                break;
            case 26:
                a();
                return;
            case 27:
                gg0 gg0Var = (gg0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                int i37 = this.b;
                ArrayList arrayList18 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = str3;
                arrayList18.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList18, new org.telegram.ui.Components.d2(gg0Var, str3, str4, str5, i37));
                return;
            case 28:
                int[] iArr3 = (int[]) this.c;
                int i38 = this.b;
                h9 h9Var5 = (h9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f;
                w9 w9Var3 = (w9) this.d;
                iArr3[0] = i38;
                h9Var5.r(user4);
                w9Var3.e(user4, h9Var5);
                return;
            default:
                qg.m2 m2Var = (qg.m2) this.c;
                int i39 = this.b;
                List list = (List) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                pr0 pr0Var = (pr0) this.f;
                if (m2Var.I == null || m2Var.y) {
                    return;
                }
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f / m2Var.I.getWidth(), 1.0f / m2Var.I.getHeight());
                matrix.postTranslate(-0.5f, -0.5f);
                matrix.postRotate(i39);
                matrix.postTranslate(0.5f, 0.5f);
                if ((i39 / 90) % 2 != 0) {
                    matrix.postScale(m2Var.I.getHeight(), m2Var.I.getWidth());
                } else {
                    matrix.postScale(m2Var.I.getWidth(), m2Var.I.getHeight());
                }
                if (list.isEmpty()) {
                    qg.j2 j2Var = new qg.j2(m2Var);
                    j2Var.h.set(0.0f, 0.0f, m2Var.I.getWidth(), m2Var.I.getHeight());
                    j2Var.i.set(j2Var.h);
                    matrix.mapRect(j2Var.i);
                    j2Var.c = i39;
                    Bitmap d = m2Var.d(m2Var.I, 0, 0, false);
                    j2Var.d = d;
                    if (d == null) {
                        FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        return;
                    }
                    j2Var.f = j2Var.c();
                    qg.m2.c(j2Var, m2Var.T, m2Var.U);
                    m2Var.O = j2Var.j;
                    m2Var.P = j2Var.k;
                    arrayList19.add(j2Var);
                    AndroidUtilities.runOnUIThread(new fs0(m2Var, arrayList19, pr0Var, j2Var, 23));
                    m2Var.E = j2Var;
                    m2Var.y = true;
                    m2Var.x = false;
                    return;
                }
                for (int i40 = 0; i40 < list.size(); i40++) {
                    qg.l2 l2Var = (qg.l2) list.get(i40);
                    qg.j2 j2Var2 = new qg.j2(m2Var);
                    j2Var2.h.set(l2Var.b, l2Var.c, r14 + l2Var.d, r5 + l2Var.e);
                    j2Var2.i.set(j2Var2.h);
                    matrix.mapRect(j2Var2.i);
                    j2Var2.c = i39;
                    Bitmap d10 = m2Var.d(l2Var.a, l2Var.b, l2Var.c, false);
                    j2Var2.d = d10;
                    if (d10 != null) {
                        j2Var2.f = j2Var2.c();
                        qg.m2.c(j2Var2, m2Var.T, m2Var.U);
                        m2Var.O = j2Var2.j;
                        m2Var.P = j2Var2.k;
                        arrayList19.add(j2Var2);
                    }
                }
                m2Var.E = null;
                m2Var.y = true;
                m2Var.x = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.p1(11, m2Var, arrayList19));
                return;
        }
    }

    public /* synthetic */ l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ l3(int[] iArr, int i10, h9 h9Var, TLRPC.User user, w9 w9Var) {
        this.a = 28;
        this.c = iArr;
        this.b = i10;
        this.e = h9Var;
        this.f = user;
        this.d = w9Var;
    }
}
