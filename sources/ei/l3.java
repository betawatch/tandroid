package ei;

import ai.d9;
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
import ci.lc;
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
import org.telegram.messenger.bi;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.aj;
import org.telegram.ui.ec0;
import org.telegram.ui.fg0;
import org.telegram.ui.fh0;
import org.telegram.ui.fy;
import org.telegram.ui.g60;
import org.telegram.ui.gn;
import org.telegram.ui.ln;
import org.telegram.ui.m70;
import org.telegram.ui.ty;
import org.telegram.ui.xm;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    /* JADX WARN: Type inference failed for: r0v19, types: [gg.b2, gg.y] */
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
        long j3;
        final long j10;
        boolean z11;
        boolean z12;
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        org.telegram.ui.ActionBar.n2 R;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.ui.Cells.u1 u1Var;
        boolean z13;
        ad a02;
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
                y9 y9Var = (y9) obj;
                y9 y9Var2 = (y9) obj3;
                TextView textView = (TextView) obj2;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    j9 j9Var = new j9((e6) null);
                    j9Var.r(user);
                    y9Var.e(user, j9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    j9 j9Var2 = new j9((e6) null);
                    j9Var2.q(chat);
                    y9Var.e(chat, j9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(jArr[0]));
                    if (y9Var2 != null) {
                        j9 j9Var3 = new j9((e6) null);
                        j9Var3.r(user2);
                        y9Var2.e(user2, j9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-jArr[0]));
                    if (y9Var2 != null) {
                        j9 j9Var4 = new j9((e6) null);
                        j9Var4.q(chat2);
                        y9Var2.e(chat2, j9Var4);
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
                final gg.h0 h0Var = (gg.h0) obj4;
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
                            j3 = 0;
                            MessagesController.getInstance(i13).putUser(user3, z14);
                            j10 = user3.id;
                        } else {
                            j3 = 0;
                            if (obj5 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj5;
                                MessagesController.getInstance(i13).putChat(chat3, z14);
                                j10 = -chat3.id;
                            } else {
                                if (obj5 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i13).putEncryptedChat((TLRPC.EncryptedChat) obj5, z14);
                                }
                                j10 = 0;
                            }
                        }
                        if (j10 == j3 || ((TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(j10)) != null) {
                            z11 = r72;
                        } else {
                            z11 = r72;
                            MessagesStorage.getInstance(i13).getDialogFolderId(j10, new MessagesStorage.IntCallback() { // from class: gg.x
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i16) {
                                    int i17 = h0.this.s0;
                                    if (i16 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j11 = j10;
                                        tL_dialog.id = j11;
                                        if (i16 != 0) {
                                            tL_dialog.folder_id = i16;
                                        }
                                        Object obj6 = obj5;
                                        if (obj6 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj6) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i17).dialogs_dict.k(tL_dialog, j11);
                                        MessagesController.getInstance(i17).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i17).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (!h0Var.S() || (obj5 instanceof TLRPC.EncryptedChat)) {
                            z12 = z14 ? 1 : 0;
                        } else {
                            fy fyVar = h0Var.U;
                            boolean z16 = (fyVar == null || fyVar.a() != j10) ? z11 : z14 ? 1 : 0;
                            for (?? r14 = z11; z16 == 0 && r14 < size; r14++) {
                                gg.g0 g0Var = (gg.g0) r42.get(r14);
                                boolean z17 = z14;
                                z16 = (g0Var == null || g0Var.c != j10) ? z16 : z17;
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
                    fy fyVar2 = h0Var.U;
                    if (fyVar2 != null) {
                        fyVar2.d(h0Var.D0 > 0 ? z18 : z19, z18);
                        h0Var.U.c();
                        break;
                    }
                }
                break;
            case 3:
                gg.t1 t1Var = (gg.t1) obj4;
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
                ((i2.d1) obj4).b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) obj3, (u2.b0) obj2, this.b);
                break;
            case 5:
                m4.l0 l0Var = (m4.l0) obj4;
                m4.h1 h1Var = (m4.h1) obj;
                n4.z zVar = (n4.z) obj3;
                m4.k0 k0Var = (m4.k0) obj2;
                oi.f fVar = l0Var.f;
                if (!l0Var.g.j()) {
                    if (!((n4.r) l0Var.k.b).a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(h1Var == null ? Integer.valueOf(i12) : h1Var.b);
                        sb2.append(", pid=");
                        sb2.append(zVar.a.b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        break;
                    } else {
                        m4.r L = l0Var.L(zVar);
                        if (h1Var != null) {
                            if (!fVar.D(L, h1Var)) {
                            }
                        } else if (!fVar.C(L, i12)) {
                        }
                        try {
                            k0Var.g(L);
                            break;
                        } catch (RemoteException e7) {
                            e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
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
                ((MessagesController) obj4).lambda$processUpdateArray$406((yf.r) obj, (ConcurrentHashMap) obj3, (ConcurrentHashMap) obj2, i12);
                break;
            case 9:
                ((MessagesStorage) obj4).lambda$getSentFile$164((String) obj, i12, (Object[]) obj3, (CountDownLatch) obj2);
                break;
            case 10:
                ((MessagesStorage) obj4).lambda$putSentFile$170((String) obj, (TLObject) obj3, i12, (String) obj2);
                break;
            case 11:
                ((NotificationCenter) obj4).lambda$listen$5((View) obj, (View.OnAttachStateChangeListener) obj3, (xg) obj2, i12);
                break;
            case 12:
                ((TelegramMediaSession) obj4).lambda$loadChats$4(i12, (ArrayList) obj, (a0.i) obj3, (a0.i) obj2);
                break;
            case 13:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$33((TLObject) obj, i12, (String) obj3, (TLRPC.TL_error) obj2);
                break;
            case 14:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj4;
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
                        CharSequence C = org.telegram.ui.i4.C(i4Var, i4Var.u0[0].c.E, null, richText, richText, pageBlock2, MediaDataController.MAX_STYLE_RUNS_COUNT);
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
                }
                AndroidUtilities.runOnUIThread(new d9(i4Var, this.b, arrayList10, str, 10));
                break;
            case 15:
                TLObject tLObject = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
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
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i18, tL_inputGroupCall, false, groupCall, hashSet);
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
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i18, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    ad.a0(n2Var).f0(tL_error, false);
                    break;
                }
                break;
            case 16:
                zn.V((zn) obj4, i12, (Boolean) obj, (TLRPC.WebPage) obj3, (TL_account.getWebPagePreview) obj2);
                break;
            case 17:
                ln lnVar = (ln) obj4;
                aj ajVar = (aj) obj;
                ajVar.b = lnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) obj3).id, i12, new gn(lnVar, ajVar, (zn) obj2));
                break;
            case 18:
                ln lnVar2 = (ln) obj4;
                MessageObject messageObject = (MessageObject) obj;
                Integer num = (Integer) obj3;
                byte[] bArr = (byte[]) obj2;
                zn znVar = lnVar2.a;
                znVar.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == znVar.L6 ? 1 : 0, true, 0, num, bArr, new xm(lnVar2, messageObject, z14 ? 1 : 0));
                break;
            case 19:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj4;
                int[] iArr = (int[]) obj;
                Runnable runnable = (Runnable) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i12));
                    n2Var2.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 20:
                TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    rg.j0 j0Var = new rg.j0(11, this.b, R.getParentActivity(), R, null);
                    j0Var.J1(chat4, arrayList11, arrayList12, arrayList13, null);
                    j0Var.show();
                    break;
                }
                break;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) obj;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj2;
                SharedPreferences.Editor edit = ((SharedPreferences) obj4).edit();
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
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(tL_help_support.user);
                MessagesStorage.getInstance(i12).putUsersAndChats(arrayList14, null, true, true);
                MessagesController.getInstance(i12).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                n2Var3.presentFragment(new zn(bundle));
                break;
            case 22:
                vs.Q((vs) obj4, (TLObject) obj, (TLRPC.InputPeer) obj3, i12, (int[]) obj2);
                break;
            case 23:
                ax0 ax0Var = (ax0) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                MessageObject messageObject2 = (MessageObject) obj3;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj2;
                int[] iArr2 = ax0Var.e;
                RLottieNative[] rLottieNativeArr = ax0Var.f1;
                if (ax0Var.W0) {
                    AndroidUtilities.runOnUIThread(new yw0(ax0Var, 2));
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
                                AndroidUtilities.runOnUIThread(new yw0(ax0Var, 3));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new zk(ax0Var, i20, u1Var3, 18));
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
                                        AndroidUtilities.runOnUIThread(new zw0(document, i20, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                        z21 = true;
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        u1Var = u1Var2;
                                        rLottieNativeArr[i19] = RLottieNative.b(readRes, iArr2, null, null);
                                        ax0Var.g1[i19] = iArr2[0];
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
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj2;
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
                        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.i4.I() && org.telegram.ui.i4.x().V) {
                            org.telegram.ui.i4.x().o(false, true);
                        }
                        lc.w();
                        g60 g60Var = g60.D3;
                        if (g60Var != null) {
                            g60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.q0.U(true, true);
                            launchActivity.s0.U(true, true);
                        }
                        ty tyVar = new ty(i22);
                        tyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof fh0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() - 1) instanceof fh0)) {
                            z15 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(tyVar, z15, false);
                    }
                    try {
                        b2Var3.dismiss();
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                break;
            case 25:
                TLObject tLObject3 = (TLObject) obj;
                String str2 = (String) obj3;
                m70 m70Var = (m70) obj2;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) hg.c.g(1, ((LaunchActivity) obj4).d0);
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
                            s10 s10Var = new s10(n2Var4, false);
                            s10Var.Y = -1;
                            s10Var.c0 = "";
                            s10Var.d0 = new ArrayList();
                            s10Var.f0 = "";
                            s10Var.h0 = new ArrayList();
                            ArrayList arrayList15 = new ArrayList();
                            s10Var.i0 = arrayList15;
                            s10Var.z0 = -1;
                            s10Var.C0 = -5;
                            s10Var.X = str2;
                            s10Var.Z = chatlist_chatlistinvite;
                            arrayList15.clear();
                            if (z22) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                s10Var.c0 = tL_textWithEntities.text;
                                s10Var.d0 = tL_textWithEntities.entities;
                                s10Var.e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                s10Var.g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                s10Var.g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                s10Var.j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                s10Var.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList16 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList16 != null) {
                                    while (true) {
                                        if (r72 < arrayList16.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList16.get(r72);
                                            if (dialogFilter.id == s10Var.Y) {
                                                s10Var.c0 = dialogFilter.name;
                                                s10Var.d0 = dialogFilter.entities;
                                                s10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                r72++;
                                            }
                                        }
                                    }
                                }
                            }
                            s10Var.T();
                            n2Var4.showDialog(s10Var);
                            m70Var.run();
                            break;
                        } else {
                            a02 = ad.a0(n2Var4);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = ad.a0(n2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    m70Var.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                bi.q(i10, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) obj4;
                m70 m70Var2 = (m70) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                ArrayList arrayList17 = launchActivity2.d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        m70Var2.run();
                    } catch (Exception e13) {
                        FileLog.e(e13);
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
                        if (arrayList17.isEmpty() || MessagesController.getInstance(i12).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList17))) {
                            zn znVar2 = new zn(bundle2);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity2.O()).S(znVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                ((ec0) obj4).v((String) obj, i12 + 1, (String) obj3, (String) obj2);
                break;
            case 28:
                String str3 = (String) obj;
                ArrayList arrayList18 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.c = "inapp";
                aVar.b = str3;
                arrayList18.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList18, new org.telegram.ui.Components.e2((fg0) obj4, str3, (String) obj3, (String) obj2, this.b));
                break;
            default:
                j9 j9Var5 = (j9) obj3;
                TLRPC.User user4 = (TLRPC.User) obj2;
                ((int[]) obj4)[0] = i12;
                j9Var5.r(user4);
                ((y9) obj).e(user4, j9Var5);
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

    public /* synthetic */ l3(int[] iArr, int i10, j9 j9Var, TLRPC.User user, y9 y9Var) {
        this.a = 29;
        this.c = iArr;
        this.b = i10;
        this.e = j9Var;
        this.f = user;
        this.d = y9Var;
    }
}
