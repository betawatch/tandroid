package bi;

import android.content.ContextWrapper;
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
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.messenger.vh;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.xg;
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
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.rs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.cy;
import org.telegram.ui.fn;
import org.telegram.ui.lb0;
import org.telegram.ui.lx;
import org.telegram.ui.of0;
import org.telegram.ui.pg0;
import org.telegram.ui.rm;
import org.telegram.ui.si;
import org.telegram.ui.sz;
import org.telegram.ui.un;
import org.telegram.ui.v50;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sb(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 21;
        this.b = i10;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [ig.a2, ig.y] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j10;
        final long j11;
        boolean z11;
        boolean z12;
        org.telegram.ui.j4 j4Var;
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        org.telegram.ui.ActionBar.r2 R;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.ui.Cells.s1 s1Var;
        boolean z13;
        org.telegram.ui.Components.wc b02;
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
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                String str = (String) obj3;
                ((fi.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.ActionBar.k3[]) obj2)[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                ca.y(i12, false).S();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.wc.b0(U).W(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj4;
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) obj2;
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) obj;
                TextView textView = (TextView) obj3;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    j9Var.r(user);
                    y9Var.f(user, j9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    j9Var2.q(chat);
                    y9Var.f(chat, j9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    if (y9Var2 != null) {
                        org.telegram.ui.Components.j9 j9Var3 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                        j9Var3.r(user2);
                        y9Var2.f(user2, j9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    if (y9Var2 != null) {
                        org.telegram.ui.Components.j9 j9Var4 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                        j9Var4.q(chat2);
                        y9Var2.f(chat2, j9Var4);
                    }
                    if (textView != null) {
                        textView.setText(chat2 != null ? chat2.title : "");
                        break;
                    }
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) obj3;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
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
            case 3:
                Pair pair = (Pair) obj2;
                ((i2.g1) obj4).b.h.h(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj, (u2.c0) obj3, this.b);
                break;
            case 4:
                final ig.i0 i0Var = (ig.i0) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) obj3;
                ?? r02 = i0Var.j0;
                ?? r42 = i0Var.v0;
                int i13 = i0Var.s0;
                i0Var.D0--;
                if (i12 == i0Var.d0) {
                    i0Var.f0 = i12;
                    if (i0Var.e0 != i12) {
                        r02.b();
                    }
                    if (i0Var.g0 != i12) {
                        i0Var.I.clear();
                    }
                    i0Var.N = true;
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (!i0Var.F(arrayList3.get(i14))) {
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
                            MessagesStorage.getInstance(i13).getDialogFolderId(j11, new MessagesStorage.IntCallback() { // from class: ig.x
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i16) {
                                    int i17 = i0.this.s0;
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
                        if (!i0Var.R() || (obj5 instanceof TLRPC.EncryptedChat)) {
                            z12 = z14 ? 1 : 0;
                        } else {
                            lx lxVar = i0Var.U;
                            boolean z16 = (lxVar == null || lxVar.a() != j11) ? z11 : z14 ? 1 : 0;
                            for (?? r14 = z11; z16 == 0 && r14 < size; r14++) {
                                ig.h0 h0Var = (ig.h0) r42.get(r14);
                                boolean z17 = z14;
                                z16 = (h0Var == null || h0Var.c != j11) ? z16 : z17;
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
                    i0Var.s = arrayList3;
                    i0Var.G = arrayList4;
                    r02.f(arrayList3, r42);
                    i0Var.l();
                    lx lxVar2 = i0Var.U;
                    if (lxVar2 != null) {
                        lxVar2.d(i0Var.D0 > 0 ? z18 : z19, z18);
                        i0Var.U.c();
                        break;
                    }
                }
                break;
            case 5:
                ig.t1 t1Var = (ig.t1) obj4;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = (ArrayList) obj3;
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
            case 6:
                m4.p0 p0Var = (m4.p0) obj4;
                m4.p1 p1Var = (m4.p1) obj2;
                n4.t tVar = (n4.t) obj;
                m4.o0 o0Var = (m4.o0) obj3;
                com.google.firebase.messaging.q qVar = p0Var.f;
                if (!p0Var.g.j()) {
                    if (!((n4.n) p0Var.m.b).a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(p1Var == null ? Integer.valueOf(i12) : p1Var.b);
                        sb2.append(", pid=");
                        sb2.append(tVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", sb2.toString());
                        break;
                    } else {
                        m4.w L = p0Var.L(tVar);
                        if (p1Var != null) {
                            if (!qVar.x(L, p1Var)) {
                            }
                        } else if (!qVar.w(L, i12)) {
                        }
                        try {
                            o0Var.i(L);
                            break;
                        } catch (RemoteException e) {
                            e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                            return;
                        }
                    }
                }
                break;
            case 7:
                LocationController.lambda$fetchLocationAddress$29((Locale) obj4, (Location) obj2, i12, (Locale) obj, (LocationController.LocationFetchCallback) obj3);
                break;
            case 8:
                ((MediaDataController) obj4).lambda$removeMultipleStickerSets$110((boolean[]) obj2, (ArrayList) obj, i12, (int[]) obj3);
                break;
            case 9:
                ((MessagesController) obj4).lambda$processUpdateArray$408((ag.y) obj2, (ConcurrentHashMap) obj, (ConcurrentHashMap) obj3, i12);
                break;
            case 10:
                ((MessagesStorage) obj4).lambda$getSentFile$167((String) obj3, i12, (Object[]) obj2, (CountDownLatch) obj);
                break;
            case 11:
                ((MessagesStorage) obj4).lambda$putSentFile$173((String) obj3, (TLObject) obj, i12, (String) obj2);
                break;
            case 12:
                ((NotificationCenter) obj4).lambda$listen$5((View) obj2, (View.OnAttachStateChangeListener) obj, (xg) obj3, i12);
                break;
            case 13:
                ((TelegramMediaSession) obj4).lambda$loadChats$4(i12, (ArrayList) obj2, (a0.h) obj, (a0.h) obj3);
                break;
            case 14:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$33((TLObject) obj, i12, (String) obj3, (TLRPC.TL_error) obj2);
                break;
            case 15:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                HashMap hashMap = (HashMap) obj;
                String str2 = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                int size2 = arrayList9.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj6 = arrayList9.get(i16);
                    TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) hashMap.get(obj6);
                    if (obj6 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj6;
                        j4Var = j4Var2;
                        CharSequence C = org.telegram.ui.j4.C(j4Var, j4Var2.u0[0].c.E, null, richText, richText, pageBlock2, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        pageBlock = pageBlock2;
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        j4Var = j4Var2;
                        pageBlock = pageBlock2;
                        if (obj6 instanceof String) {
                            lowerCase = ((String) obj6).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i17 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i17);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.r3 r3Var = new org.telegram.ui.r3();
                                    r3Var.a = indexOf;
                                    r3Var.c = pageBlock;
                                    r3Var.b = obj6;
                                    arrayList10.add(r3Var);
                                }
                                i17 = length;
                            }
                        }
                    }
                    i16++;
                    j4Var2 = j4Var;
                }
                AndroidUtilities.runOnUIThread(new ai.h1((Object) j4Var2, this.b, (Object) arrayList10, str2, 14));
                break;
            case 16:
                TLObject tLObject2 = (TLObject) obj;
                HashSet hashSet = (HashSet) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.o9 o9Var = (org.telegram.ui.o9) obj3;
                boolean z20 = tLObject2 instanceof TLRPC.Updates;
                int i18 = this.b;
                if (z20) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i18).putUsers(updates.users, false);
                    MessagesController.getInstance(i18).putChats(updates.chats, false);
                    ?? findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    while (r72 < size3) {
                        groupCall = ((TL_update.TL_updateGroupCall) findUpdatesAndRemove.get(r72)).call;
                        r72++;
                    }
                    if (LaunchActivity.I1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, i18, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i18).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i18).putChats(groupcall.chats, false);
                    if (LaunchActivity.I1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, i18, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Components.wc.b0(o9Var).g0(tL_error, false);
                    break;
                }
                break;
            case 17:
                un.v1((un) obj4, i12, (Boolean) obj2, (TLRPC.WebPage) obj, (TL_account.getWebPagePreview) obj3);
                break;
            case 18:
                fn fnVar = (fn) obj4;
                si siVar = (si) obj2;
                siVar.b = fnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) obj).id, i12, new an(fnVar, siVar, (un) obj3));
                break;
            case 19:
                fn fnVar2 = (fn) obj4;
                MessageObject messageObject = (MessageObject) obj2;
                Integer num = (Integer) obj;
                byte[] bArr = (byte[]) obj3;
                un unVar = fnVar2.a;
                unVar.gb(this.b, messageObject.getId(), true, messageObject.getDialogId() == unVar.X6 ? 1 : 0, true, 0, num, bArr, new rm(fnVar2, messageObject, z14 ? 1 : 0));
                break;
            case 20:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj4;
                int[] iArr = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new org.telegram.ui.Components.u1(iArr, runnable, i12));
                    r2Var.showDialog(e2VarArr[0]);
                    break;
                }
                break;
            case 21:
                TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                ArrayList arrayList13 = (ArrayList) obj3;
                if (LaunchActivity.E1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    tg.j0 j0Var = new tg.j0(11, this.b, R.getParentActivity(), R, null);
                    j0Var.M1(chat4, arrayList11, arrayList12, arrayList13, null);
                    j0Var.show();
                    break;
                }
                break;
            case 22:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj3;
                SharedPreferences.Editor edit = ((SharedPreferences) obj4).edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    e2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(tL_help_support.user);
                MessagesStorage.getInstance(i12).putUsersAndChats(arrayList14, null, true, true);
                MessagesController.getInstance(i12).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                r2Var2.presentFragment(new un(bundle));
                break;
            case 23:
                rs.P((rs) obj4, (TLObject) obj, (TLRPC.InputPeer) obj2, i12, (int[]) obj3);
                break;
            case 24:
                dx0 dx0Var = (dx0) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj2;
                MessageObject messageObject2 = (MessageObject) obj;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) obj3;
                int[] iArr2 = dx0Var.e;
                RLottieNative[] rLottieNativeArr = dx0Var.f1;
                if (dx0Var.W0) {
                    AndroidUtilities.runOnUIThread(new bx0(dx0Var, 2));
                    break;
                } else {
                    int i19 = 0;
                    boolean z21 = false;
                    while (true) {
                        int length2 = rLottieNativeArr.length;
                        int i20 = this.b;
                        if (i19 >= length2) {
                            org.telegram.ui.Cells.s1 s1Var3 = s1Var2;
                            if (z21) {
                                AndroidUtilities.runOnUIThread(new bx0(dx0Var, 3));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(dx0Var, i20, s1Var3, 21));
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
                                        s1Var = s1Var2;
                                        AndroidUtilities.runOnUIThread(new cx0(document, i20, messageObject2, s1Var2, tL_messages_stickerSet, 1));
                                        z21 = true;
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        s1Var = s1Var2;
                                        rLottieNativeArr[i19] = RLottieNative.b(readRes, iArr2, null, null);
                                        dx0Var.g1[i19] = iArr2[0];
                                    }
                                    i19++;
                                    s1Var2 = s1Var;
                                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                                    z21 = z21;
                                }
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            s1Var = s1Var2;
                            i19++;
                            s1Var2 = s1Var;
                            tL_messages_stickerSet2 = tL_messages_stickerSet;
                            z21 = z21;
                        }
                    }
                }
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                TLObject tLObject3 = (TLObject) obj;
                Uri uri = (Uri) obj2;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj3;
                Pattern pattern = LaunchActivity.D1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 == null || launchActivity.q0 == null) {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.k0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i22 = a1.g.i("onlySelect", true);
                        i22.putString("importTitle", tL_messages_historyImportParsed.title);
                        i22.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i22.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i22.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i12).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z13 = false;
                                } else if (uri2.contains(it.next())) {
                                    i22.putInt("dialogsType", 12);
                                    z13 = true;
                                }
                            }
                            if (!z13) {
                                Iterator<String> it2 = MessagesController.getInstance(i12).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i22.putInt("dialogsType", 11);
                                            z13 = true;
                                        }
                                    }
                                }
                                if (!z13) {
                                    i22.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
                            PhotoViewer.u1().H0(false, true);
                        } else if (org.telegram.ui.j4.I() && org.telegram.ui.j4.x().V) {
                            org.telegram.ui.j4.x().o(false, true);
                        }
                        fi.sb.w();
                        v50 v50Var = v50.D3;
                        if (v50Var != null) {
                            v50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.q0.W(true, true);
                            launchActivity.s0.W(true, true);
                        }
                        cy cyVar = new cy(i22);
                        cyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof pg0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() - 1) instanceof pg0)) {
                            z15 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).U(cyVar, z15, false);
                    }
                    try {
                        e2Var3.dismiss();
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) obj4;
                sz szVar = (sz) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj3;
                ArrayList arrayList15 = launchActivity2.d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        szVar.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder.a;
                        e2Var4.R = string;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            e2Var4.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            e2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            e2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity2.G0(alertDialog$Builder);
                        break;
                    } else if (launchActivity2.q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat5 = updates2.chats.get(0);
                        chat5.left = false;
                        chat5.kicked = false;
                        MessagesController.getInstance(i12).putUsers(updates2.users, false);
                        MessagesController.getInstance(i12).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat5.id);
                        if (arrayList15.isEmpty() || MessagesController.getInstance(i12).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList15))) {
                            un unVar2 = new un(bundle2);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity2.O()).U(unVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                TLObject tLObject4 = (TLObject) obj;
                String str3 = (String) obj3;
                sz szVar2 = (sz) obj2;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) ic.a.g(1, ((LaunchActivity) obj4).d0);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
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
                            n10 n10Var = new n10(r2Var3, false);
                            n10Var.Y = -1;
                            n10Var.c0 = "";
                            n10Var.d0 = new ArrayList();
                            n10Var.f0 = "";
                            n10Var.h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            n10Var.i0 = arrayList16;
                            n10Var.z0 = -1;
                            n10Var.C0 = -5;
                            n10Var.X = str3;
                            n10Var.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z22) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                n10Var.c0 = tL_textWithEntities.text;
                                n10Var.d0 = tL_textWithEntities.entities;
                                n10Var.e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                n10Var.g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                n10Var.g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                n10Var.j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                n10Var.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = r2Var3.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (r72 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(r72);
                                            if (dialogFilter.id == n10Var.Y) {
                                                n10Var.c0 = dialogFilter.name;
                                                n10Var.d0 = dialogFilter.entities;
                                                n10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                r72++;
                                            }
                                        }
                                    }
                                }
                            }
                            n10Var.T();
                            r2Var3.showDialog(n10Var);
                            szVar2.run();
                            break;
                        } else {
                            b02 = org.telegram.ui.Components.wc.b0(r2Var3);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        b02 = org.telegram.ui.Components.wc.b0(r2Var3);
                        i10 = R.string.NoFolderFound;
                    }
                    szVar2.run();
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
                vh.n(i10, b02, null);
                break;
            case 28:
                ((lb0) obj4).v((String) obj3, i12 + 1, (String) obj2, (String) obj);
                break;
            default:
                String str4 = (String) obj3;
                ArrayList arrayList18 = new ArrayList();
                d5.a aVar = new d5.a();
                aVar.b = "inapp";
                aVar.a = str4;
                arrayList18.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList18, new e6((of0) obj4, str4, (String) obj2, (String) obj, this.b));
                break;
        }
    }

    public /* synthetic */ sb(ContextWrapper contextWrapper, TLObject tLObject, int i10, String str, Object obj, int i11) {
        this.a = i11;
        this.c = contextWrapper;
        this.e = tLObject;
        this.b = i10;
        this.f = str;
        this.d = obj;
    }

    public /* synthetic */ sb(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ sb(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ sb(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ sb(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ sb(Object obj, String str, String str2, String str3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.f = str;
        this.d = str2;
        this.e = str3;
        this.b = i10;
    }

    public /* synthetic */ sb(Object obj, TLObject tLObject, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ sb(MessagesStorage messagesStorage, String str, int i10, Object[] objArr, CountDownLatch countDownLatch) {
        this.a = 10;
        this.c = messagesStorage;
        this.f = str;
        this.b = i10;
        this.d = objArr;
        this.e = countDownLatch;
    }

    public /* synthetic */ sb(MessagesStorage messagesStorage, String str, TLObject tLObject, int i10, String str2) {
        this.a = 11;
        this.c = messagesStorage;
        this.f = str;
        this.e = tLObject;
        this.b = i10;
        this.d = str2;
    }

    public /* synthetic */ sb(TLObject tLObject, int i10, HashSet hashSet, TLRPC.TL_error tL_error, org.telegram.ui.o9 o9Var) {
        this.a = 16;
        this.e = tLObject;
        this.b = i10;
        this.c = hashSet;
        this.d = tL_error;
        this.f = o9Var;
    }

    public /* synthetic */ sb(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i10, TL_account.updateEmojiStatus updateemojistatus) {
        this.a = 2;
        this.e = tLObject;
        this.c = zArr;
        this.d = callback;
        this.b = i10;
        this.f = updateemojistatus;
    }
}
