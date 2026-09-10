package di;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import bi.ce;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
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
import org.telegram.messenger.gh;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bn;
import org.telegram.ui.cj;
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.fh0;
import org.telegram.ui.fy0;
import org.telegram.ui.h90;
import org.telegram.ui.iy;
import org.telegram.ui.j60;
import org.telegram.ui.kn;
import org.telegram.ui.or0;
import org.telegram.ui.pn;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 19;
        this.b = i10;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        char c10;
        final long j3;
        long j10;
        org.telegram.ui.j4 j4Var;
        int i10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.p2 R;
        boolean z11;
        wc a02;
        int i11;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        long j11 = 0;
        int i12 = 2;
        int i13 = 0;
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.c;
                int i14 = this.b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(jArr[0]));
                    g9 g9Var = new g9((f6) null);
                    g9Var.r(user);
                    w9Var.e(user, g9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-jArr[0]));
                    g9 g9Var2 = new g9((f6) null);
                    g9Var2.q(chat);
                    w9Var.e(chat, g9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        g9 g9Var3 = new g9((f6) null);
                        g9Var3.r(user2);
                        w9Var2.e(user2, g9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i14).getChat(Long.valueOf(-jArr[0]));
                    if (w9Var2 != null) {
                        g9 g9Var4 = new g9((f6) null);
                        g9Var4.q(chat2);
                        w9Var2.e(chat2, g9Var4);
                    }
                    if (textView != null) {
                        textView.setText(chat2 != null ? chat2.title : "");
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i15 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i15).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        c10 = 0;
                        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i15).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                    } else {
                        z10 = true;
                        c10 = 0;
                    }
                    if (!zArr[c10]) {
                        zArr[c10] = z10;
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
                final fg.h0 h0Var = (fg.h0) this.c;
                int i16 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f;
                fg.y yVar = h0Var.j0;
                ArrayList arrayList6 = h0Var.v0;
                int i17 = h0Var.s0;
                h0Var.D0--;
                if (i16 == h0Var.d0) {
                    h0Var.f0 = i16;
                    if (h0Var.e0 != i16) {
                        yVar.b();
                    }
                    if (h0Var.g0 != i16) {
                        h0Var.I.clear();
                    }
                    h0Var.N = true;
                    int i18 = 0;
                    while (i18 < arrayList3.size()) {
                        if (!h0Var.F(arrayList3.get(i18))) {
                            arrayList3.remove(i18);
                            i18--;
                        }
                        i18++;
                    }
                    boolean z12 = true;
                    int size = arrayList6.size();
                    int i19 = 0;
                    while (i19 < arrayList3.size()) {
                        final Object obj2 = arrayList3.get(i19);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj2;
                            MessagesController.getInstance(i17).putUser(user3, z12);
                            j3 = user3.id;
                        } else if (obj2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                            MessagesController.getInstance(i17).putChat(chat3, z12);
                            j3 = -chat3.id;
                        } else {
                            if (obj2 instanceof TLRPC.EncryptedChat) {
                                MessagesController.getInstance(i17).putEncryptedChat((TLRPC.EncryptedChat) obj2, z12);
                            }
                            j3 = j11;
                        }
                        if (j3 == j11 || ((TLRPC.Dialog) MessagesController.getInstance(i17).dialogs_dict.f(j3)) != null) {
                            j10 = j11;
                        } else {
                            j10 = j11;
                            MessagesStorage.getInstance(i17).getDialogFolderId(j3, new MessagesStorage.IntCallback() { // from class: fg.w
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i20) {
                                    int i21 = h0.this.s0;
                                    if (i20 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.id = j12;
                                        if (i20 != 0) {
                                            tL_dialog.folder_id = i20;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i21).dialogs_dict.k(tL_dialog, j12);
                                        MessagesController.getInstance(i21).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i21).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (h0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            iy iyVar = h0Var.U;
                            boolean z13 = iyVar != null && iyVar.a() == j3;
                            int i20 = 0;
                            while (!z13 && i20 < size) {
                                fg.g0 g0Var = (fg.g0) arrayList6.get(i20);
                                int i21 = i20;
                                z13 = (g0Var == null || g0Var.c != j3) ? z13 : true;
                                i20 = i21 + 1;
                            }
                            if (z13) {
                                arrayList3.remove(i19);
                                arrayList4.remove(i19);
                                i19--;
                            }
                        }
                        i19++;
                        j11 = j10;
                        z12 = true;
                    }
                    MessagesController.getInstance(i17).putUsers(arrayList5, true);
                    h0Var.s = arrayList3;
                    h0Var.G = arrayList4;
                    yVar.f(arrayList3, arrayList6);
                    h0Var.l();
                    iy iyVar2 = h0Var.U;
                    if (iyVar2 != null) {
                        iyVar2.d(h0Var.D0 > 0, true);
                        h0Var.U.c();
                        break;
                    }
                }
                break;
            case 3:
                fg.w1 w1Var = (fg.w1) this.c;
                int i22 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                if (i22 == w1Var.E) {
                    w1Var.d = arrayList7;
                    w1Var.e = arrayList8;
                    w1Var.H = arrayList9;
                    w1Var.f.f(arrayList7, null);
                    w1Var.y = false;
                    w1Var.l();
                    w1Var.F();
                    break;
                }
                break;
            case 4:
                i2.b1 b1Var = (i2.b1) this.c;
                Pair pair = (Pair) this.d;
                b1Var.b.h.h(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f, this.b);
                break;
            case 5:
                m4.l0 l0Var = (m4.l0) this.c;
                m4.n1 n1Var = (m4.n1) this.d;
                int i23 = this.b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.k0 k0Var = (m4.k0) this.f;
                ki.f fVar = l0Var.f;
                if (!l0Var.g.j()) {
                    if (!((n4.r) l0Var.k.b).a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(n1Var == null ? Integer.valueOf(i23) : n1Var.b);
                        sb2.append(", pid=");
                        sb2.append(a0Var.a.b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        break;
                    } else {
                        m4.r L = l0Var.L(a0Var);
                        if (n1Var != null) {
                            if (!fVar.C(L, n1Var)) {
                            }
                        } else if (!fVar.B(L, i23)) {
                        }
                        try {
                            k0Var.h(L);
                            break;
                        } catch (RemoteException e) {
                            e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                            return;
                        }
                    }
                }
                break;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.c, (Location) this.d, this.b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.b, (int[]) this.f);
                break;
            case 8:
                ((MessagesController) this.c).lambda$processUpdateArray$403((xf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                break;
            case 9:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                break;
            case 10:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                break;
            case 11:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (gh) this.f, this.b);
                break;
            case 12:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 13:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f;
                int i24 = this.b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i25 = 0;
                while (i25 < size2) {
                    Object obj3 = arrayList10.get(i25);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = j4Var2.u0[i13].c.E;
                        int i26 = i25;
                        j4Var = j4Var2;
                        i10 = i26;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.j4.C(j4Var, webPage, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i27 = i25;
                        j4Var = j4Var2;
                        i10 = i27;
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i28 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i28);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.s3 s3Var = new org.telegram.ui.s3();
                                    s3Var.a = indexOf;
                                    s3Var.c = pageBlock;
                                    s3Var.b = obj;
                                    arrayList11.add(s3Var);
                                }
                                i28 = length;
                            }
                        }
                    }
                    org.telegram.ui.j4 j4Var3 = j4Var;
                    i25 = i10 + 1;
                    j4Var2 = j4Var3;
                    i13 = 0;
                }
                AndroidUtilities.runOnUIThread(new q((Object) j4Var2, i24, arrayList11, (Serializable) str, 10));
                break;
            case 14:
                TLObject tLObject2 = (TLObject) this.c;
                int i29 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i29).putUsers(updates.users, false);
                    MessagesController.getInstance(i29).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size3) {
                        Object obj4 = findUpdatesAndRemove.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj4).call;
                    }
                    if (LaunchActivity.G1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i29, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i29).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i29).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i29, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    wc.a0(p2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 15:
                eo.N0((eo) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 16:
                pn pnVar = (pn) this.c;
                cj cjVar = (cj) this.d;
                cjVar.b = pnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new kn(pnVar, cjVar, (eo) this.f));
                break;
            case 17:
                pn pnVar2 = (pn) this.c;
                int i30 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                eo eoVar = pnVar2.a;
                eoVar.Xa(i30, messageObject.getId(), true, messageObject.getDialogId() == eoVar.L6 ? 1 : 0, true, 0, num, bArr, new bn(pnVar2, messageObject, 1));
                break;
            case 18:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i31 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new org.telegram.ui.Components.a2(iArr, runnable, i31));
                    p2Var2.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            case 19:
                int i32 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    qg.k0 k0Var2 = new qg.k0(11, i32, R.getParentActivity(), R, null);
                    k0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    k0Var2.show();
                    break;
                }
                break;
            case 20:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                int i33 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    d2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i33).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i33).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                p2Var3.presentFragment(new eo(bundle));
                break;
            case 21:
                ls.P((ls) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 22:
                iw0 iw0Var = (iw0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i34 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f;
                int[] iArr2 = iw0Var.e;
                RLottieNative[] rLottieNativeArr = iw0Var.f1;
                if (iw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new gw0(iw0Var, i12));
                    break;
                } else {
                    boolean z14 = false;
                    int i35 = 0;
                    while (true) {
                        int i36 = 3;
                        if (i35 < rLottieNativeArr.length) {
                            if (rLottieNativeArr[i35] == null) {
                                int i37 = i35 == 0 ? 1 : i35 == 1 ? 8 : i35 == 2 ? 14 : i35 == 3 ? 20 : 2;
                                if (i37 < tL_messages_stickerSet.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i37);
                                    String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                    if (TextUtils.isEmpty(readRes)) {
                                        AndroidUtilities.runOnUIThread(new hw0(document, i34, messageObject2, t1Var, tL_messages_stickerSet, 1));
                                        z14 = true;
                                    } else {
                                        rLottieNativeArr[i35] = RLottieNative.b(readRes, iArr2, null, null);
                                        iw0Var.g1[i35] = iArr2[0];
                                    }
                                }
                            }
                            i35++;
                        } else if (z14) {
                            AndroidUtilities.runOnUIThread(new gw0(iw0Var, i36));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new my(iw0Var, i34, t1Var, 15));
                            break;
                        }
                    }
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i38 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 == null || launchActivity.q0 == null) {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.i0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i39 = a4.a.i("onlySelect", true);
                        i39.putString("importTitle", tL_messages_historyImportParsed.title);
                        i39.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i39.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i39.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i38).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                } else if (uri2.contains(it.next())) {
                                    i39.putInt("dialogsType", 12);
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i38).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i39.putInt("dialogsType", 11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (!z11) {
                                    i39.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.j4.I() && org.telegram.ui.j4.x().V) {
                            org.telegram.ui.j4.x().o(false, true);
                        }
                        ce.x();
                        j60 j60Var = j60.D3;
                        if (j60Var != null) {
                            j60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.q0.U(true, true);
                            launchActivity.s0.U(true, true);
                        }
                        wy wyVar = new wy(i39);
                        wyVar.C2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(wyVar, !AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof fh0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() + (-1)) instanceof fh0), false);
                    }
                    try {
                        d2Var3.dismiss();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 24:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i40 = this.b;
                String str2 = (String) this.e;
                h90 h90Var = (h90) this.f;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) hc.b.i(1, launchActivity2.d0);
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
                        MessagesController.getInstance(i40).putChats(arrayList2, false);
                        MessagesController.getInstance(i40).putUsers(arrayList, false);
                        if (!z15 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            k10 k10Var = new k10(p2Var4, false);
                            k10Var.Y = -1;
                            k10Var.c0 = "";
                            k10Var.d0 = new ArrayList();
                            k10Var.f0 = "";
                            k10Var.h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            k10Var.i0 = arrayList16;
                            k10Var.z0 = -1;
                            k10Var.C0 = -5;
                            k10Var.X = str2;
                            k10Var.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z15) {
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
                                ArrayList<MessagesController.DialogFilter> arrayList17 = p2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i13 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i13);
                                            if (dialogFilter.id == k10Var.Y) {
                                                k10Var.c0 = dialogFilter.name;
                                                k10Var.d0 = dialogFilter.entities;
                                                k10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                            }
                            k10Var.S();
                            p2Var4.showDialog(k10Var);
                            h90Var.run();
                            break;
                        } else {
                            a02 = wc.a0(p2Var4);
                            i11 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = wc.a0(p2Var4);
                        i11 = R.string.NoFolderFound;
                    }
                    h90Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.a2.p(i11, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                h90 h90Var2 = (h90) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i41 = this.b;
                ArrayList arrayList18 = launchActivity3.d0;
                if (!launchActivity3.isFinishing()) {
                    try {
                        h90Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity3);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity3.B0(alertDialog$Builder);
                        break;
                    } else if (launchActivity3.q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat5 = updates2.chats.get(0);
                        chat5.left = false;
                        chat5.kicked = false;
                        MessagesController.getInstance(i41).putUsers(updates2.users, false);
                        MessagesController.getInstance(i41).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat5.id);
                        if (arrayList18.isEmpty() || MessagesController.getInstance(i41).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList18))) {
                            eo eoVar2 = new eo(bundle2);
                            NotificationCenter.getInstance(i41).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(eoVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 26:
                fg0 fg0Var = (fg0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                int i42 = this.b;
                ArrayList arrayList19 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = str3;
                arrayList19.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.f2(fg0Var, str3, str4, str5, i42));
                break;
            case 27:
                int[] iArr3 = (int[]) this.c;
                int i43 = this.b;
                g9 g9Var5 = (g9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f;
                w9 w9Var3 = (w9) this.d;
                iArr3[0] = i43;
                g9Var5.r(user4);
                w9Var3.e(user4, g9Var5);
                break;
            default:
                pg.n2 n2Var = (pg.n2) this.c;
                int i44 = this.b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                or0 or0Var = (or0) this.f;
                if (n2Var.I != null && !n2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i44);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i44 / 90) % 2 != 0) {
                        matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                    } else {
                        matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        pg.k2 k2Var = new pg.k2(n2Var);
                        k2Var.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                        k2Var.i.set(k2Var.h);
                        matrix.mapRect(k2Var.i);
                        k2Var.c = i44;
                        Bitmap d = n2Var.d(n2Var.I, 0, 0, false);
                        k2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            k2Var.f = k2Var.c();
                            pg.n2.c(k2Var, n2Var.T, n2Var.U);
                            n2Var.O = k2Var.j;
                            n2Var.P = k2Var.k;
                            arrayList20.add(k2Var);
                            AndroidUtilities.runOnUIThread(new fy0(n2Var, arrayList20, or0Var, k2Var, 18));
                            n2Var.E = k2Var;
                            n2Var.y = true;
                            n2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i45 = 0; i45 < list.size(); i45++) {
                            pg.m2 m2Var = (pg.m2) list.get(i45);
                            pg.k2 k2Var2 = new pg.k2(n2Var);
                            k2Var2.h.set(m2Var.b, m2Var.c, r13 + m2Var.d, r15 + m2Var.e);
                            k2Var2.i.set(k2Var2.h);
                            matrix.mapRect(k2Var2.i);
                            k2Var2.c = i44;
                            Bitmap d10 = n2Var.d(m2Var.a, m2Var.b, m2Var.c, false);
                            k2Var2.d = d10;
                            if (d10 != null) {
                                k2Var2.f = k2Var2.c();
                                pg.n2.c(k2Var2, n2Var.T, n2Var.U);
                                n2Var.O = k2Var2.j;
                                n2Var.P = k2Var2.k;
                                arrayList20.add(k2Var2);
                            }
                        }
                        n2Var.E = null;
                        n2Var.y = true;
                        n2Var.x = false;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(6, n2Var, arrayList20));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ o3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ o3(int[] iArr, int i10, g9 g9Var, TLRPC.User user, w9 w9Var) {
        this.a = 27;
        this.c = iArr;
        this.b = i10;
        this.e = g9Var;
        this.f = user;
        this.d = w9Var;
    }
}
