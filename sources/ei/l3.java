package ei;

import ai.c9;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bj;
import org.telegram.ui.bo;
import org.telegram.ui.gh0;
import org.telegram.ui.hg0;
import org.telegram.ui.hs0;
import org.telegram.ui.in;
import org.telegram.ui.iy;
import org.telegram.ui.k60;
import org.telegram.ui.nn;
import org.telegram.ui.oa0;
import org.telegram.ui.qr0;
import org.telegram.ui.wy;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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
        org.telegram.ui.h4 h4Var;
        int i10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.o2 R;
        boolean z11;
        vc a02;
        int i11;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        long j11 = 0;
        int i12 = 0;
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.c;
                int i13 = this.b;
                u9 u9Var = (u9) this.d;
                u9 u9Var2 = (u9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(jArr[0]));
                    f9 f9Var = new f9((f6) null);
                    f9Var.r(user);
                    u9Var.e(user, f9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-jArr[0]));
                    f9 f9Var2 = new f9((f6) null);
                    f9Var2.q(chat);
                    u9Var.e(chat, f9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(jArr[0]));
                    if (u9Var2 != null) {
                        f9 f9Var3 = new f9((f6) null);
                        f9Var3.r(user2);
                        u9Var2.e(user2, f9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(-jArr[0]));
                    if (u9Var2 != null) {
                        f9 f9Var4 = new f9((f6) null);
                        f9Var4.q(chat2);
                        u9Var2.e(chat2, f9Var4);
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
                int i14 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i14).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        c10 = 0;
                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i14).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
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
                final gg.i0 i0Var = (gg.i0) this.c;
                int i15 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f;
                gg.z zVar = i0Var.j0;
                ArrayList arrayList6 = i0Var.v0;
                int i16 = i0Var.s0;
                i0Var.D0--;
                if (i15 == i0Var.d0) {
                    i0Var.f0 = i15;
                    if (i0Var.e0 != i15) {
                        zVar.b();
                    }
                    if (i0Var.g0 != i15) {
                        i0Var.I.clear();
                    }
                    i0Var.N = true;
                    int i17 = 0;
                    while (i17 < arrayList3.size()) {
                        if (!i0Var.F(arrayList3.get(i17))) {
                            arrayList3.remove(i17);
                            i17--;
                        }
                        i17++;
                    }
                    boolean z12 = true;
                    int size = arrayList6.size();
                    int i18 = 0;
                    while (i18 < arrayList3.size()) {
                        final Object obj2 = arrayList3.get(i18);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj2;
                            MessagesController.getInstance(i16).putUser(user3, z12);
                            j3 = user3.id;
                        } else if (obj2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                            MessagesController.getInstance(i16).putChat(chat3, z12);
                            j3 = -chat3.id;
                        } else {
                            if (obj2 instanceof TLRPC.EncryptedChat) {
                                MessagesController.getInstance(i16).putEncryptedChat((TLRPC.EncryptedChat) obj2, z12);
                            }
                            j3 = j11;
                        }
                        if (j3 == j11 || ((TLRPC.Dialog) MessagesController.getInstance(i16).dialogs_dict.f(j3)) != null) {
                            j10 = j11;
                        } else {
                            j10 = j11;
                            MessagesStorage.getInstance(i16).getDialogFolderId(j3, new MessagesStorage.IntCallback() { // from class: gg.x
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i19) {
                                    int i20 = i0.this.s0;
                                    if (i19 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.id = j12;
                                        if (i19 != 0) {
                                            tL_dialog.folder_id = i19;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i20).dialogs_dict.k(tL_dialog, j12);
                                        MessagesController.getInstance(i20).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i20).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (i0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            iy iyVar = i0Var.U;
                            boolean z13 = iyVar != null && iyVar.a() == j3;
                            int i19 = 0;
                            while (!z13 && i19 < size) {
                                gg.h0 h0Var = (gg.h0) arrayList6.get(i19);
                                int i20 = i19;
                                z13 = (h0Var == null || h0Var.c != j3) ? z13 : true;
                                i19 = i20 + 1;
                            }
                            if (z13) {
                                arrayList3.remove(i18);
                                arrayList4.remove(i18);
                                i18--;
                            }
                        }
                        i18++;
                        j11 = j10;
                        z12 = true;
                    }
                    MessagesController.getInstance(i16).putUsers(arrayList5, true);
                    i0Var.s = arrayList3;
                    i0Var.G = arrayList4;
                    zVar.f(arrayList3, arrayList6);
                    i0Var.l();
                    iy iyVar2 = i0Var.U;
                    if (iyVar2 != null) {
                        iyVar2.d(i0Var.D0 > 0, true);
                        i0Var.U.c();
                        break;
                    }
                }
                break;
            case 3:
                gg.u1 u1Var = (gg.u1) this.c;
                int i21 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                if (i21 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f.f(arrayList7, null);
                    u1Var.y = false;
                    u1Var.l();
                    u1Var.F();
                    break;
                }
                break;
            case 4:
                i2.c1 c1Var = (i2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f, this.b);
                break;
            case 5:
                m4.l0 l0Var = (m4.l0) this.c;
                m4.m1 m1Var = (m4.m1) this.d;
                int i22 = this.b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.k0 k0Var = (m4.k0) this.f;
                ni.f fVar = l0Var.f;
                if (!l0Var.g.j()) {
                    if (!((n4.r) l0Var.k.b).a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(m1Var == null ? Integer.valueOf(i22) : m1Var.b);
                        sb2.append(", pid=");
                        sb2.append(a0Var.a.b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        break;
                    } else {
                        m4.r L = l0Var.L(a0Var);
                        if (m1Var != null) {
                            if (!fVar.D(L, m1Var)) {
                            }
                        } else if (!fVar.C(L, i22)) {
                        }
                        try {
                            k0Var.g(L);
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
                ((MessagesController) this.c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                break;
            case 9:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                break;
            case 10:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                break;
            case 11:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (yg) this.f, this.b);
                break;
            case 12:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 13:
                org.telegram.ui.h4 h4Var2 = (org.telegram.ui.h4) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f;
                int i23 = this.b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj3 = arrayList10.get(i24);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = h4Var2.u0[i12].c.E;
                        int i25 = i24;
                        h4Var = h4Var2;
                        i10 = i25;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.h4.C(h4Var, webPage, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i26 = i24;
                        h4Var = h4Var2;
                        i10 = i26;
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i27 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i27);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.q3 q3Var = new org.telegram.ui.q3();
                                    q3Var.a = indexOf;
                                    q3Var.c = pageBlock;
                                    q3Var.b = obj;
                                    arrayList11.add(q3Var);
                                }
                                i27 = length;
                            }
                        }
                    }
                    org.telegram.ui.h4 h4Var3 = h4Var;
                    i24 = i10 + 1;
                    h4Var2 = h4Var3;
                    i12 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(h4Var2, i23, arrayList11, str, 10));
                break;
            case 14:
                TLObject tLObject2 = (TLObject) this.c;
                int i28 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i28).putUsers(updates.users, false);
                    MessagesController.getInstance(i28).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size3) {
                        Object obj4 = findUpdatesAndRemove.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj4).call;
                    }
                    if (LaunchActivity.G1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i28, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i28).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i28).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i28, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    vc.a0(o2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 15:
                bo.N0((bo) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 16:
                nn nnVar = (nn) this.c;
                bj bjVar = (bj) this.d;
                bjVar.b = nnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new in(nnVar, bjVar, (bo) this.f));
                break;
            case 17:
                nn nnVar2 = (nn) this.c;
                int i29 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                bo boVar = nnVar2.a;
                boVar.Xa(i29, messageObject.getId(), true, messageObject.getDialogId() == boVar.L6 ? 1 : 0, true, 0, num, bArr, new zm(nnVar2, messageObject, 1));
                break;
            case 18:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i30 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new org.telegram.ui.Components.y1(iArr, runnable, i30));
                    o2Var2.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            case 19:
                int i31 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    rg.j0 j0Var = new rg.j0(11, i31, R.getParentActivity(), R, null);
                    j0Var.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    j0Var.show();
                    break;
                }
                break;
            case 20:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                int i32 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    c2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i32).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i32).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                o2Var3.presentFragment(new bo(bundle));
                break;
            case 21:
                fs.P((fs) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 22:
                yv0 yv0Var = (yv0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i33 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f;
                int[] iArr2 = yv0Var.e;
                RLottieNative[] rLottieNativeArr = yv0Var.f1;
                if (yv0Var.W0) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, 2));
                    break;
                } else {
                    boolean z14 = false;
                    int i34 = 0;
                    while (i34 < rLottieNativeArr.length) {
                        if (rLottieNativeArr[i34] == null) {
                            int i35 = i34 == 0 ? 1 : i34 == 1 ? 8 : i34 == 2 ? 14 : i34 == 3 ? 20 : 2;
                            if (i35 < tL_messages_stickerSet.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i35);
                                String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                if (TextUtils.isEmpty(readRes)) {
                                    AndroidUtilities.runOnUIThread(new xv0(document, i33, messageObject2, t1Var, tL_messages_stickerSet, 1));
                                    z14 = true;
                                } else {
                                    rLottieNativeArr[i34] = RLottieNative.b(readRes, iArr2, null, null);
                                    yv0Var.g1[i34] = iArr2[0];
                                }
                            }
                        }
                        i34++;
                    }
                    if (z14) {
                        AndroidUtilities.runOnUIThread(new wv0(yv0Var, 3));
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new wm(yv0Var, i33, t1Var, 17));
                        break;
                    }
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i36 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f;
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
                        Bundle i37 = a4.a.i("onlySelect", true);
                        i37.putString("importTitle", tL_messages_historyImportParsed.title);
                        i37.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i37.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i37.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i36).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                } else if (uri2.contains(it.next())) {
                                    i37.putInt("dialogsType", 12);
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i36).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i37.putInt("dialogsType", 11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (!z11) {
                                    i37.putInt("dialogsType", 13);
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
                        k60 k60Var = k60.D3;
                        if (k60Var != null) {
                            k60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.q0.U(true, true);
                            launchActivity.s0.U(true, true);
                        }
                        wy wyVar = new wy(i37);
                        wyVar.C2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(wyVar, !AndroidUtilities.isTablet() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof gh0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() + (-1)) instanceof gh0), false);
                    }
                    try {
                        c2Var3.dismiss();
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
                int i38 = this.b;
                String str2 = (String) this.e;
                oa0 oa0Var = (oa0) this.f;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) hg.k0.h(1, launchActivity2.d0);
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
                        MessagesController.getInstance(i38).putChats(arrayList2, false);
                        MessagesController.getInstance(i38).putUsers(arrayList, false);
                        if (!z15 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            c10 c10Var = new c10(o2Var4, false);
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
                                ArrayList<MessagesController.DialogFilter> arrayList17 = o2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i12 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i12);
                                            if (dialogFilter.id == c10Var.Y) {
                                                c10Var.c0 = dialogFilter.name;
                                                c10Var.d0 = dialogFilter.entities;
                                                c10Var.e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                }
                            }
                            c10Var.S();
                            o2Var4.showDialog(c10Var);
                            oa0Var.run();
                            break;
                        } else {
                            a02 = vc.a0(o2Var4);
                            i11 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = vc.a0(o2Var4);
                        i11 = R.string.NoFolderFound;
                    }
                    oa0Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.w1.p(i11, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                oa0 oa0Var2 = (oa0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i39 = this.b;
                ArrayList arrayList18 = launchActivity3.d0;
                if (!launchActivity3.isFinishing()) {
                    try {
                        oa0Var2.run();
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
                        MessagesController.getInstance(i39).putUsers(updates2.users, false);
                        MessagesController.getInstance(i39).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat5.id);
                        if (arrayList18.isEmpty() || MessagesController.getInstance(i39).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList18))) {
                            bo boVar2 = new bo(bundle2);
                            NotificationCenter.getInstance(i39).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(boVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 26:
                hg0 hg0Var = (hg0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                int i40 = this.b;
                ArrayList arrayList19 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = str3;
                arrayList19.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.d2(hg0Var, str3, str4, str5, i40));
                break;
            case 27:
                int[] iArr3 = (int[]) this.c;
                int i41 = this.b;
                f9 f9Var5 = (f9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f;
                u9 u9Var3 = (u9) this.d;
                iArr3[0] = i41;
                f9Var5.r(user4);
                u9Var3.e(user4, f9Var5);
                break;
            default:
                qg.p2 p2Var = (qg.p2) this.c;
                int i42 = this.b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                qr0 qr0Var = (qr0) this.f;
                if (p2Var.I != null && !p2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / p2Var.I.getWidth(), 1.0f / p2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i42);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i42 / 90) % 2 != 0) {
                        matrix.postScale(p2Var.I.getHeight(), p2Var.I.getWidth());
                    } else {
                        matrix.postScale(p2Var.I.getWidth(), p2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        qg.m2 m2Var = new qg.m2(p2Var);
                        m2Var.h.set(0.0f, 0.0f, p2Var.I.getWidth(), p2Var.I.getHeight());
                        m2Var.i.set(m2Var.h);
                        matrix.mapRect(m2Var.i);
                        m2Var.c = i42;
                        Bitmap d = p2Var.d(p2Var.I, 0, 0, false);
                        m2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            m2Var.f = m2Var.c();
                            qg.p2.c(m2Var, p2Var.T, p2Var.U);
                            p2Var.O = m2Var.j;
                            p2Var.P = m2Var.k;
                            arrayList20.add(m2Var);
                            AndroidUtilities.runOnUIThread(new hs0(p2Var, arrayList20, qr0Var, m2Var, 23));
                            p2Var.E = m2Var;
                            p2Var.y = true;
                            p2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i43 = 0; i43 < list.size(); i43++) {
                            qg.o2 o2Var5 = (qg.o2) list.get(i43);
                            qg.m2 m2Var2 = new qg.m2(p2Var);
                            m2Var2.h.set(o2Var5.b, o2Var5.c, r13 + o2Var5.d, r15 + o2Var5.e);
                            m2Var2.i.set(m2Var2.h);
                            matrix.mapRect(m2Var2.i);
                            m2Var2.c = i42;
                            Bitmap d10 = p2Var.d(o2Var5.a, o2Var5.b, o2Var5.c, false);
                            m2Var2.d = d10;
                            if (d10 != null) {
                                m2Var2.f = m2Var2.c();
                                qg.p2.c(m2Var2, p2Var.T, p2Var.U);
                                p2Var.O = m2Var2.j;
                                p2Var.P = m2Var2.k;
                                arrayList20.add(m2Var2);
                            }
                        }
                        p2Var.E = null;
                        p2Var.y = true;
                        p2Var.x = false;
                        AndroidUtilities.runOnUIThread(new p2.b(7, p2Var, arrayList20));
                        break;
                    }
                }
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

    public /* synthetic */ l3(int[] iArr, int i10, f9 f9Var, TLRPC.User user, u9 u9Var) {
        this.a = 27;
        this.c = iArr;
        this.b = i10;
        this.e = f9Var;
        this.f = user;
        this.d = u9Var;
    }
}
