package fi;

import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import bi.n8;
import di.kc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zg;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.d20;
import org.telegram.ui.ej;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.ic0;
import org.telegram.ui.jg0;
import org.telegram.ui.jh0;
import org.telegram.ui.ky;
import org.telegram.ui.ln;
import org.telegram.ui.n60;
import org.telegram.ui.qn;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [hg.a2, hg.y] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j10;
        final long j11;
        boolean z11;
        boolean z12;
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        org.telegram.ui.ActionBar.m2 R;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.ui.Cells.u1 u1Var;
        boolean z13;
        zc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i11 = this.a;
        TLRPC.GroupCall groupCall = null;
        boolean z14 = true;
        r6 = true;
        boolean z15 = true;
        ?? r72 = 0;
        int i12 = this.b;
        Object obj = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i11) {
            case 0:
                long[] jArr = (long[]) obj4;
                z9 z9Var = (z9) obj;
                z9 z9Var2 = (z9) obj3;
                TextView textView = (TextView) obj2;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    k9 k9Var = new k9((c6) null);
                    k9Var.r(user);
                    z9Var.e(user, k9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    k9 k9Var2 = new k9((c6) null);
                    k9Var2.q(chat);
                    z9Var.e(chat, k9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    if (z9Var2 != null) {
                        k9 k9Var3 = new k9((c6) null);
                        k9Var3.r(user2);
                        z9Var2.e(user2, k9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    if (z9Var2 != null) {
                        k9 k9Var4 = new k9((c6) null);
                        k9Var4.q(chat2);
                        z9Var2.e(chat2, k9Var4);
                    }
                    if (textView != null) {
                        textView.setText(chat2 != null ? chat2.title : "");
                        break;
                    }
                }
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) obj2;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i12).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                    } else {
                        z10 = true;
                    }
                    if (!zArr[0]) {
                        zArr[0] = z10;
                        callback.run(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    callback.run("SERVER_ERROR");
                    break;
                }
                break;
            case 2:
                final hg.h0 h0Var = (hg.h0) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) obj2;
                ?? r02 = h0Var.j0;
                ?? r42 = h0Var.v0;
                int i13 = h0Var.s0;
                h0Var.D0--;
                if (i12 == h0Var.d0) {
                    h0Var.f0 = i12;
                    if (h0Var.e0 != i12) {
                        r02.b();
                    }
                    if (h0Var.g0 != i12) {
                        h0Var.I.clear();
                    }
                    h0Var.N = true;
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (!h0Var.F(arrayList3.get(i14))) {
                            arrayList3.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    int size = r42.size();
                    int i15 = 0;
                    while (i15 < arrayList3.size()) {
                        final Object obj5 = arrayList3.get(i15);
                        if (obj5 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj5;
                            j10 = 0;
                            MessagesController.getInstance(i13).putUser(user3, z14);
                            j11 = user3.id;
                        } else {
                            j10 = 0;
                            if (obj5 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj5;
                                MessagesController.getInstance(i13).putChat(chat3, z14);
                                j11 = -chat3.id;
                            } else {
                                if (obj5 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i13).putEncryptedChat((TLRPC.EncryptedChat) obj5, z14);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 == j10 || ((TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(j11)) != null) {
                            z11 = r72;
                        } else {
                            z11 = r72;
                            MessagesStorage.getInstance(i13).getDialogFolderId(j11, new MessagesStorage.IntCallback() { // from class: hg.x
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i16) {
                                    int i17 = h0.this.s0;
                                    if (i16 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j11;
                                        tL_dialog.id = j12;
                                        if (i16 != 0) {
                                            tL_dialog.folder_id = i16;
                                        }
                                        Object obj6 = obj5;
                                        if (obj6 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj6) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i17).dialogs_dict.k(tL_dialog, j12);
                                        MessagesController.getInstance(i17).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i17).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (!h0Var.S() || (obj5 instanceof TLRPC.EncryptedChat)) {
                            z12 = z14 ? 1 : 0;
                        } else {
                            ky kyVar = h0Var.U;
                            boolean z16 = (kyVar == null || kyVar.a() != j11) ? z11 : z14 ? 1 : 0;
                            for (?? r14 = z11; z16 == 0 && r14 < size; r14++) {
                                hg.g0 g0Var = (hg.g0) r42.get(r14);
                                boolean z17 = z14;
                                z16 = (g0Var == null || g0Var.c != j11) ? z16 : z17;
                                z14 = z17;
                            }
                            z12 = z14;
                            if (z16 != 0) {
                                arrayList3.remove(i15);
                                arrayList4.remove(i15);
                                i15--;
                            }
                        }
                        i15++;
                        r72 = z11;
                        z14 = z12;
                    }
                    boolean z18 = z14 ? 1 : 0;
                    boolean z19 = r72;
                    MessagesController.getInstance(i13).putUsers(arrayList5, z18);
                    h0Var.s = arrayList3;
                    h0Var.G = arrayList4;
                    r02.f(arrayList3, r42);
                    h0Var.l();
                    ky kyVar2 = h0Var.U;
                    if (kyVar2 != null) {
                        kyVar2.d(h0Var.D0 > 0 ? z18 : z19, z18);
                        h0Var.U.c();
                        break;
                    }
                }
                break;
            case 3:
                hg.t1 t1Var = (hg.t1) obj4;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                if (i12 == t1Var.E) {
                    t1Var.d = arrayList6;
                    t1Var.e = arrayList7;
                    t1Var.H = arrayList8;
                    t1Var.f.f(arrayList6, null);
                    t1Var.y = false;
                    t1Var.l();
                    t1Var.F();
                    break;
                }
                break;
            case 4:
                Pair pair = (Pair) obj;
                ((i2.g1) obj4).b.h.i(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj3, (u2.c0) obj2, this.b);
                break;
            case 5:
                m4.p0 p0Var = (m4.p0) obj4;
                m4.o1 o1Var = (m4.o1) obj;
                n4.t tVar = (n4.t) obj3;
                m4.o0 o0Var = (m4.o0) obj2;
                pi.e eVar = p0Var.f;
                if (!p0Var.g.j()) {
                    if (!((n4.n) p0Var.m.b).a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(o1Var == null ? Integer.valueOf(i12) : o1Var.b);
                        sb2.append(", pid=");
                        sb2.append(tVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", sb2.toString());
                        break;
                    } else {
                        m4.v L = p0Var.L(tVar);
                        if (o1Var != null) {
                            if (!eVar.w(L, o1Var)) {
                            }
                        } else if (!eVar.v(L, i12)) {
                        }
                        try {
                            o0Var.e(L);
                            break;
                        } catch (RemoteException e) {
                            e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                            return;
                        }
                    }
                }
                break;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) obj4, (Location) obj, i12, (Locale) obj3, (LocationController.LocationFetchCallback) obj2);
                break;
            case 7:
                ((MediaDataController) obj4).lambda$removeMultipleStickerSets$110((boolean[]) obj, (ArrayList) obj3, i12, (int[]) obj2);
                break;
            case 8:
                ((MessagesController) obj4).lambda$processUpdateArray$406((zf.s) obj, (ConcurrentHashMap) obj3, (ConcurrentHashMap) obj2, i12);
                break;
            case 9:
                ((MessagesStorage) obj4).lambda$getSentFile$164((String) obj, i12, (Object[]) obj3, (CountDownLatch) obj2);
                break;
            case 10:
                ((MessagesStorage) obj4).lambda$putSentFile$170((String) obj, (TLObject) obj3, i12, (String) obj2);
                break;
            case 11:
                ((NotificationCenter) obj4).lambda$listen$5((View) obj, (View.OnAttachStateChangeListener) obj3, (zg) obj2, i12);
                break;
            case 12:
                ((TelegramMediaSession) obj4).lambda$loadChats$4(i12, (ArrayList) obj, (a0.h) obj3, (a0.h) obj2);
                break;
            case 13:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$33((TLObject) obj, i12, (String) obj3, (TLRPC.TL_error) obj2);
                break;
            case 14:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj4;
                ArrayList arrayList9 = (ArrayList) obj;
                HashMap hashMap = (HashMap) obj3;
                String str = (String) obj2;
                ArrayList arrayList10 = new ArrayList();
                int size2 = arrayList9.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    Object obj6 = arrayList9.get(i16);
                    TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) hashMap.get(obj6);
                    if (obj6 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj6;
                        CharSequence C = org.telegram.ui.k4.C(k4Var, k4Var.u0[0].c.E, null, richText, richText, pageBlock2, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        pageBlock = pageBlock2;
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        pageBlock = pageBlock2;
                        if (obj6 instanceof String) {
                            lowerCase = ((String) obj6).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i17 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i17);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.t3 t3Var = new org.telegram.ui.t3();
                                    t3Var.a = indexOf;
                                    t3Var.c = pageBlock;
                                    t3Var.b = obj6;
                                    arrayList10.add(t3Var);
                                }
                                i17 = length;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new n8(k4Var, this.b, arrayList10, str, 10));
                break;
            case 15:
                TLObject tLObject = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                boolean z20 = tLObject instanceof TLRPC.Updates;
                int i18 = this.b;
                if (z20) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i18).putUsers(updates.users, false);
                    MessagesController.getInstance(i18).putChats(updates.chats, false);
                    ?? findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    while (r72 < size3) {
                        groupCall = ((TL_update.TL_updateGroupCall) findUpdatesAndRemove.get(r72)).call;
                        r72++;
                    }
                    if (LaunchActivity.G1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i18, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i18).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i18).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i18, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    zc.a0(m2Var).f0(tL_error, false);
                    break;
                }
                break;
            case 16:
                fo.V((fo) obj4, i12, (Boolean) obj, (TLRPC.WebPage) obj3, (TL_account.getWebPagePreview) obj2);
                break;
            case 17:
                qn qnVar = (qn) obj4;
                ej ejVar = (ej) obj;
                ejVar.b = qnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) obj3).id, i12, new ln(qnVar, ejVar, (fo) obj2));
                break;
            case 18:
                qn qnVar2 = (qn) obj4;
                MessageObject messageObject = (MessageObject) obj;
                Integer num = (Integer) obj3;
                byte[] bArr = (byte[]) obj2;
                fo foVar = qnVar2.a;
                foVar.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == foVar.L6 ? 1 : 0, true, 0, num, bArr, new cn(qnVar2, messageObject, z14 ? 1 : 0));
                break;
            case 19:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj4;
                int[] iArr = (int[]) obj;
                Runnable runnable = (Runnable) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i12));
                    m2Var2.showDialog(a2VarArr[0]);
                    break;
                }
                break;
            case 20:
                TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    sg.j0 j0Var = new sg.j0(11, this.b, R.getParentActivity(), R, null);
                    j0Var.J1(chat4, arrayList11, arrayList12, arrayList13, null);
                    j0Var.show();
                    break;
                }
                break;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) obj;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj3;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj2;
                SharedPreferences.Editor edit = ((SharedPreferences) obj4).edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    a2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(tL_help_support.user);
                MessagesStorage.getInstance(i12).putUsersAndChats(arrayList14, null, true, true);
                MessagesController.getInstance(i12).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                m2Var3.presentFragment(new fo(bundle));
                break;
            case 22:
                ss.Q((ss) obj4, (TLObject) obj, (TLRPC.InputPeer) obj3, i12, (int[]) obj2);
                break;
            case 23:
                ww0 ww0Var = (ww0) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                MessageObject messageObject2 = (MessageObject) obj3;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj2;
                int[] iArr2 = ww0Var.e;
                RLottieNative[] rLottieNativeArr = ww0Var.f1;
                if (ww0Var.W0) {
                    AndroidUtilities.runOnUIThread(new uw0(ww0Var, 2));
                    break;
                } else {
                    int i19 = 0;
                    boolean z21 = false;
                    while (true) {
                        int length2 = rLottieNativeArr.length;
                        int i20 = this.b;
                        if (i19 >= length2) {
                            org.telegram.ui.Cells.u1 u1Var3 = u1Var2;
                            if (z21) {
                                AndroidUtilities.runOnUIThread(new uw0(ww0Var, 3));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new gm(ww0Var, i20, u1Var3, 19));
                                break;
                            }
                        } else {
                            if (rLottieNativeArr[i19] == null) {
                                int i21 = i19 == 0 ? 1 : i19 == 1 ? 8 : i19 == 2 ? 14 : i19 == 3 ? 20 : 2;
                                if (i21 < tL_messages_stickerSet2.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet2.documents.get(i21);
                                    String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                    if (TextUtils.isEmpty(readRes)) {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        u1Var = u1Var2;
                                        AndroidUtilities.runOnUIThread(new vw0(document, i20, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                        z21 = true;
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        u1Var = u1Var2;
                                        rLottieNativeArr[i19] = RLottieNative.b(readRes, iArr2, null, null);
                                        ww0Var.g1[i19] = iArr2[0];
                                    }
                                    i19++;
                                    u1Var2 = u1Var;
                                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                                    z21 = z21;
                                }
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            u1Var = u1Var2;
                            i19++;
                            u1Var2 = u1Var;
                            tL_messages_stickerSet2 = tL_messages_stickerSet;
                            z21 = z21;
                        }
                    }
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                TLObject tLObject2 = (TLObject) obj;
                Uri uri = (Uri) obj3;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 == null || launchActivity.q0 == null) {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.i0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                        Bundle h = a1.g.h("onlySelect", true);
                        h.putString("importTitle", tL_messages_historyImportParsed.title);
                        h.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            h.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            h.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i12).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z13 = false;
                                } else if (uri2.contains(it.next())) {
                                    h.putInt("dialogsType", 12);
                                    z13 = true;
                                }
                            }
                            if (!z13) {
                                Iterator<String> it2 = MessagesController.getInstance(i12).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            h.putInt("dialogsType", 11);
                                            z13 = true;
                                        }
                                    }
                                }
                                if (!z13) {
                                    h.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.k4.I() && org.telegram.ui.k4.x().V) {
                            org.telegram.ui.k4.x().o(false, true);
                        }
                        kc.w();
                        n60 n60Var = n60.D3;
                        if (n60Var != null) {
                            n60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.q0.U(true, true);
                            launchActivity.s0.U(true, true);
                        }
                        yy yyVar = new yy(h);
                        yyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof jh0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() - 1) instanceof jh0)) {
                            z15 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(yyVar, z15, false);
                    }
                    try {
                        a2Var3.dismiss();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 25:
                TLObject tLObject3 = (TLObject) obj;
                String str2 = (String) obj3;
                d20 d20Var = (d20) obj2;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) i2.d.h(1, ((LaunchActivity) obj4).d0);
                try {
                    if (tLObject3 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject3;
                        boolean z22 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z22) {
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
                        MessagesController.getInstance(i12).putChats(arrayList2, false);
                        MessagesController.getInstance(i12).putUsers(arrayList, false);
                        if (!z22 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            o10 o10Var = new o10(m2Var4, false);
                            o10Var.Y = -1;
                            o10Var.c0 = "";
                            o10Var.d0 = new ArrayList();
                            o10Var.f0 = "";
                            o10Var.h0 = new ArrayList();
                            ArrayList arrayList15 = new ArrayList();
                            o10Var.i0 = arrayList15;
                            o10Var.z0 = -1;
                            o10Var.C0 = -5;
                            o10Var.X = str2;
                            o10Var.Z = chatlist_chatlistinvite;
                            arrayList15.clear();
                            if (z22) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                o10Var.c0 = tL_textWithEntities.text;
                                o10Var.d0 = tL_textWithEntities.entities;
                                o10Var.e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                o10Var.g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                o10Var.g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                o10Var.j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                o10Var.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList16 = m2Var4.getMessagesController().dialogFilters;
                                if (arrayList16 != null) {
                                    while (true) {
                                        if (r72 < arrayList16.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList16.get(r72);
                                            if (dialogFilter.id == o10Var.Y) {
                                                o10Var.c0 = dialogFilter.name;
                                                o10Var.d0 = dialogFilter.entities;
                                                o10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                r72++;
                                            }
                                        }
                                    }
                                }
                            }
                            o10Var.T();
                            m2Var4.showDialog(o10Var);
                            d20Var.run();
                            break;
                        } else {
                            a02 = zc.a0(m2Var4);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = zc.a0(m2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    d20Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                sk.q(i10, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) obj4;
                d20 d20Var2 = (d20) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                ArrayList arrayList17 = launchActivity2.d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        d20Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder.a;
                        a2Var4.R = string;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            a2Var4.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            a2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            a2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity2.B0(alertDialog$Builder);
                        break;
                    } else if (launchActivity2.q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat5 = updates2.chats.get(0);
                        chat5.left = false;
                        chat5.kicked = false;
                        MessagesController.getInstance(i12).putUsers(updates2.users, false);
                        MessagesController.getInstance(i12).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat5.id);
                        if (arrayList17.isEmpty() || MessagesController.getInstance(i12).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.m2) i2.d.h(1, arrayList17))) {
                            fo foVar2 = new fo(bundle2);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity2.O()).S(foVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                ((ic0) obj4).v((String) obj, i12 + 1, (String) obj3, (String) obj2);
                break;
            case 28:
                String str3 = (String) obj;
                ArrayList arrayList18 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = str3;
                arrayList18.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList18, new org.telegram.ui.Components.e2((jg0) obj4, str3, (String) obj3, (String) obj2, this.b));
                break;
            default:
                k9 k9Var5 = (k9) obj3;
                TLRPC.User user4 = (TLRPC.User) obj2;
                ((int[]) obj4)[0] = i12;
                k9Var5.r(user4);
                ((z9) obj).e(user4, k9Var5);
                break;
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

    public /* synthetic */ l3(int[] iArr, int i10, k9 k9Var, TLRPC.User user, z9 z9Var) {
        this.a = 29;
        this.c = iArr;
        this.b = i10;
        this.e = k9Var;
        this.f = user;
        this.d = z9Var;
    }
}
