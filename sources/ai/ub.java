package ai;

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
import org.telegram.messenger.nk;
import org.telegram.messenger.vg;
import org.telegram.messenger.voip.VoIPService;
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
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.ib0;
import org.telegram.ui.mf0;
import org.telegram.ui.ng0;
import org.telegram.ui.nx;
import org.telegram.ui.om;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.ri;
import org.telegram.ui.xm;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ub implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ub(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 21;
        this.b = i10;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [hg.a2, hg.y] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j10;
        final long j11;
        boolean z11;
        boolean z12;
        org.telegram.ui.l4 l4Var;
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        org.telegram.ui.ActionBar.n2 R;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.ui.Cells.u1 u1Var;
        boolean z13;
        org.telegram.ui.Components.xc a02;
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
                ((ei.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                ga.y(i12, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj4;
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) obj2;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) obj;
                TextView textView = (TextView) obj3;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                    h9Var2.q(chat);
                    w9Var.e(chat, h9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        org.telegram.ui.Components.h9 h9Var3 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                        h9Var3.r(user2);
                        w9Var2.e(user2, h9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    if (w9Var2 != null) {
                        org.telegram.ui.Components.h9 h9Var4 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                        h9Var4.q(chat2);
                        w9Var2.e(chat2, h9Var4);
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
                final hg.h0 h0Var = (hg.h0) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) obj3;
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
                            nx nxVar = h0Var.U;
                            boolean z16 = (nxVar == null || nxVar.a() != j11) ? z11 : z14 ? 1 : 0;
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
                    nx nxVar2 = h0Var.U;
                    if (nxVar2 != null) {
                        nxVar2.d(h0Var.D0 > 0 ? z18 : z19, z18);
                        h0Var.U.c();
                        break;
                    }
                }
                break;
            case 4:
                hg.t1 t1Var = (hg.t1) obj4;
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
            case 5:
                Pair pair = (Pair) obj2;
                ((i2.f1) obj4).b.h.i(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj, (u2.c0) obj3, this.b);
                break;
            case 6:
                m4.p0 p0Var = (m4.p0) obj4;
                m4.o1 o1Var = (m4.o1) obj2;
                n4.t tVar = (n4.t) obj;
                m4.o0 o0Var = (m4.o0) obj3;
                qi.e eVar = p0Var.f;
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
                            if (!eVar.z(L, o1Var)) {
                            }
                        } else if (!eVar.y(L, i12)) {
                        }
                        try {
                            o0Var.f(L);
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
                ((MessagesController) obj4).lambda$processUpdateArray$406((zf.r) obj2, (ConcurrentHashMap) obj, (ConcurrentHashMap) obj3, i12);
                break;
            case 10:
                ((MessagesStorage) obj4).lambda$getSentFile$164((String) obj3, i12, (Object[]) obj2, (CountDownLatch) obj);
                break;
            case 11:
                ((MessagesStorage) obj4).lambda$putSentFile$170((String) obj3, (TLObject) obj, i12, (String) obj2);
                break;
            case 12:
                ((NotificationCenter) obj4).lambda$listen$5((View) obj2, (View.OnAttachStateChangeListener) obj, (vg) obj3, i12);
                break;
            case 13:
                ((TelegramMediaSession) obj4).lambda$loadChats$4(i12, (ArrayList) obj2, (a0.h) obj, (a0.h) obj3);
                break;
            case 14:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$33((TLObject) obj, i12, (String) obj3, (TLRPC.TL_error) obj2);
                break;
            case 15:
                org.telegram.ui.l4 l4Var2 = (org.telegram.ui.l4) obj4;
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
                        l4Var = l4Var2;
                        CharSequence C = org.telegram.ui.l4.C(l4Var, l4Var2.u0[0].c.E, null, richText, richText, pageBlock2, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        pageBlock = pageBlock2;
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        l4Var = l4Var2;
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
                    i16++;
                    l4Var2 = l4Var;
                }
                AndroidUtilities.runOnUIThread(new cb(l4Var2, this.b, arrayList10, str2, 11));
                break;
            case 16:
                TLObject tLObject2 = (TLObject) obj;
                HashSet hashSet = (HashSet) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
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
                    if (LaunchActivity.H1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.H1, i18, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i18).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i18).putChats(groupcall.chats, false);
                    if (LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.H1, i18, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Components.xc.a0(n2Var).f0(tL_error, false);
                    break;
                }
                break;
            case 17:
                qn.V((qn) obj4, i12, (Boolean) obj2, (TLRPC.WebPage) obj, (TL_account.getWebPagePreview) obj3);
                break;
            case 18:
                cn cnVar = (cn) obj4;
                ri riVar = (ri) obj2;
                riVar.b = cnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) obj).id, i12, new xm(cnVar, riVar, (qn) obj3));
                break;
            case 19:
                cn cnVar2 = (cn) obj4;
                MessageObject messageObject = (MessageObject) obj2;
                Integer num = (Integer) obj;
                byte[] bArr = (byte[]) obj3;
                qn qnVar = cnVar2.a;
                qnVar.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == qnVar.L6 ? 1 : 0, true, 0, num, bArr, new om(cnVar2, messageObject, z14 ? 1 : 0));
                break;
            case 20:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj4;
                int[] iArr = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i12));
                    n2Var2.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 21:
                TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                ArrayList arrayList13 = (ArrayList) obj3;
                if (LaunchActivity.D1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    sg.k0 k0Var = new sg.k0(11, this.b, R.getParentActivity(), R, null);
                    k0Var.J1(chat4, arrayList11, arrayList12, arrayList13, null);
                    k0Var.show();
                    break;
                }
                break;
            case 22:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) obj2;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                SharedPreferences.Editor edit = ((SharedPreferences) obj4).edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    b2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(tL_help_support.user);
                MessagesStorage.getInstance(i12).putUsersAndChats(arrayList14, null, true, true);
                MessagesController.getInstance(i12).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                n2Var3.presentFragment(new qn(bundle));
                break;
            case 23:
                ps.Q((ps) obj4, (TLObject) obj, (TLRPC.InputPeer) obj2, i12, (int[]) obj3);
                break;
            case 24:
                tw0 tw0Var = (tw0) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj2;
                MessageObject messageObject2 = (MessageObject) obj;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj3;
                int[] iArr2 = tw0Var.e;
                RLottieNative[] rLottieNativeArr = tw0Var.f1;
                if (tw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new rw0(tw0Var, 2));
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
                                AndroidUtilities.runOnUIThread(new rw0(tw0Var, 3));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(tw0Var, i20, u1Var3, 23));
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
                                        AndroidUtilities.runOnUIThread(new sw0(document, i20, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                        z21 = true;
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        u1Var = u1Var2;
                                        rLottieNativeArr[i19] = RLottieNative.b(readRes, iArr2, null, null);
                                        tw0Var.g1[i19] = iArr2[0];
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
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                TLObject tLObject3 = (TLObject) obj;
                Uri uri = (Uri) obj2;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj3;
                Pattern pattern = LaunchActivity.C1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 == null || launchActivity.q0 == null) {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.j0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
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
                        } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
                            PhotoViewer.u1().H0(false, true);
                        } else if (org.telegram.ui.l4.I() && org.telegram.ui.l4.x().V) {
                            org.telegram.ui.l4.x().o(false, true);
                        }
                        ei.vb.w();
                        q50 q50Var = q50.D3;
                        if (q50Var != null) {
                            q50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.q0.U(true, true);
                            launchActivity.s0.U(true, true);
                        }
                        cy cyVar = new cy(h);
                        cyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof ng0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() - 1) instanceof ng0)) {
                            z15 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(cyVar, z15, false);
                    }
                    try {
                        b2Var3.dismiss();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) obj4;
                z70 z70Var = (z70) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj3;
                ArrayList arrayList15 = launchActivity2.d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        z70Var.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.a;
                        b2Var4.R = string;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            b2Var4.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            b2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            b2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity2.F0(alertDialog$Builder);
                        break;
                    } else if (launchActivity2.q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat5 = updates2.chats.get(0);
                        chat5.left = false;
                        chat5.kicked = false;
                        MessagesController.getInstance(i12).putUsers(updates2.users, false);
                        MessagesController.getInstance(i12).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat5.id);
                        if (arrayList15.isEmpty() || MessagesController.getInstance(i12).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList15))) {
                            qn qnVar2 = new qn(bundle2);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity2.O()).S(qnVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                TLObject tLObject4 = (TLObject) obj;
                String str3 = (String) obj3;
                z70 z70Var2 = (z70) obj2;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i2.e.h(1, ((LaunchActivity) obj4).d0);
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
                            k10 k10Var = new k10(n2Var4, false);
                            k10Var.Y = -1;
                            k10Var.c0 = "";
                            k10Var.d0 = new ArrayList();
                            k10Var.f0 = "";
                            k10Var.h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            k10Var.i0 = arrayList16;
                            k10Var.z0 = -1;
                            k10Var.C0 = -5;
                            k10Var.X = str3;
                            k10Var.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z22) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                k10Var.c0 = tL_textWithEntities.text;
                                k10Var.d0 = tL_textWithEntities.entities;
                                k10Var.e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                k10Var.g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                k10Var.g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                k10Var.j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                k10Var.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (r72 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(r72);
                                            if (dialogFilter.id == k10Var.Y) {
                                                k10Var.c0 = dialogFilter.name;
                                                k10Var.d0 = dialogFilter.entities;
                                                k10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                r72++;
                                            }
                                        }
                                    }
                                }
                            }
                            k10Var.T();
                            n2Var4.showDialog(k10Var);
                            z70Var2.run();
                            break;
                        } else {
                            a02 = org.telegram.ui.Components.xc.a0(n2Var4);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = org.telegram.ui.Components.xc.a0(n2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    z70Var2.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                nk.q(i10, a02, null);
                break;
            case 28:
                ((ib0) obj4).v((String) obj3, i12 + 1, (String) obj2, (String) obj);
                break;
            default:
                String str4 = (String) obj3;
                ArrayList arrayList18 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = str4;
                arrayList18.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList18, new j6((mf0) obj4, str4, (String) obj2, (String) obj, this.b));
                break;
        }
    }

    public /* synthetic */ ub(ContextWrapper contextWrapper, TLObject tLObject, int i10, String str, Object obj, int i11) {
        this.a = i11;
        this.c = contextWrapper;
        this.e = tLObject;
        this.b = i10;
        this.f = str;
        this.d = obj;
    }

    public /* synthetic */ ub(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ub(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ub(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ ub(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ ub(Object obj, String str, String str2, String str3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.f = str;
        this.d = str2;
        this.e = str3;
        this.b = i10;
    }

    public /* synthetic */ ub(Object obj, TLObject tLObject, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ ub(MessagesStorage messagesStorage, String str, int i10, Object[] objArr, CountDownLatch countDownLatch) {
        this.a = 10;
        this.c = messagesStorage;
        this.f = str;
        this.b = i10;
        this.d = objArr;
        this.e = countDownLatch;
    }

    public /* synthetic */ ub(MessagesStorage messagesStorage, String str, TLObject tLObject, int i10, String str2) {
        this.a = 11;
        this.c = messagesStorage;
        this.f = str;
        this.e = tLObject;
        this.b = i10;
        this.d = str2;
    }

    public /* synthetic */ ub(TLObject tLObject, int i10, HashSet hashSet, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 16;
        this.e = tLObject;
        this.b = i10;
        this.c = hashSet;
        this.d = tL_error;
        this.f = n2Var;
    }

    public /* synthetic */ ub(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i10, TL_account.updateEmojiStatus updateemojistatus) {
        this.a = 2;
        this.e = tLObject;
        this.c = zArr;
        this.d = callback;
        this.b = i10;
        this.f = updateemojistatus;
    }
}
