package fh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import gh.v7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kh.wb;
import org.json.JSONObject;
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
import org.telegram.messenger.ll;
import org.telegram.messenger.qg;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.dy;
import org.telegram.ui.ei1;
import org.telegram.ui.fk0;
import org.telegram.ui.ir0;
import org.telegram.ui.mq0;
import org.telegram.ui.ng0;
import org.telegram.ui.o50;
import org.telegram.ui.of0;
import org.telegram.ui.oi;
import org.telegram.ui.om;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import org.telegram.ui.rl;
import org.telegram.ui.x20;
import org.telegram.ui.xm;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g1(int i9, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 19;
        this.b = i9;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        boolean z10;
        char c10;
        final long j10;
        long j11;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.o2 R;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i9;
        org.telegram.ui.Cells.t1 t1Var;
        boolean z11;
        oc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        long j12 = 0;
        int i11 = 12;
        int i12 = 3;
        int i13 = 2;
        int i14 = 0;
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.c;
                Context context = (Context) this.d;
                int i15 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j13 = p2Var.Y;
                c1 c1Var = new c1(p2Var, callback, 2);
                boolean z12 = starGift.limited;
                new p1(p2Var, context, i15, starGift, j13, c1Var, z12 && (disallowedGiftsSettings2 = p2Var.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z12 && (disallowedGiftsSettings = p2Var.X) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 1:
                kh.d dVar = (kh.d) this.c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                int i16 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                v7.y(i16, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    oc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            case 2:
                long[] jArr = (long[]) this.c;
                int i17 = this.b;
                o9 o9Var = (o9) this.d;
                o9 o9Var2 = (o9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var.r(user);
                    o9Var.e(user, z8Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    z8 z8Var2 = new z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var2.q(chat);
                    o9Var.e(chat, z8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (o9Var2 != null) {
                        z8 z8Var3 = new z8((org.telegram.ui.ActionBar.b6) null);
                        z8Var3.r(user2);
                        o9Var2.e(user2, z8Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    if (o9Var2 != null) {
                        z8 z8Var4 = new z8((org.telegram.ui.ActionBar.b6) null);
                        z8Var4.q(chat2);
                        o9Var2.e(chat2, z8Var4);
                    }
                    if (textView != null) {
                        textView.setText(chat2 != null ? chat2.title : "");
                        break;
                    }
                }
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                int i18 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.e;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i18).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        c10 = 0;
                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                    } else {
                        z10 = true;
                        c10 = 0;
                    }
                    if (!zArr[c10]) {
                        zArr[c10] = z10;
                        callback2.run(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    callback2.run("SERVER_ERROR");
                    break;
                }
                break;
            case 4:
                final of.f0 f0Var = (of.f0) this.c;
                int i19 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f;
                of.w wVar = f0Var.f0;
                ArrayList arrayList6 = f0Var.r0;
                int i20 = f0Var.o0;
                f0Var.z0--;
                if (i19 == f0Var.Z) {
                    f0Var.b0 = i19;
                    if (f0Var.a0 != i19) {
                        wVar.b();
                    }
                    if (f0Var.c0 != i19) {
                        f0Var.E.clear();
                    }
                    f0Var.J = true;
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        if (!f0Var.F(arrayList3.get(i21))) {
                            arrayList3.remove(i21);
                            i21--;
                        }
                        i21++;
                    }
                    boolean z13 = true;
                    int size = arrayList6.size();
                    int i22 = 0;
                    while (i22 < arrayList3.size()) {
                        final Object obj2 = arrayList3.get(i22);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj2;
                            MessagesController.getInstance(i20).putUser(user3, z13);
                            j10 = user3.id;
                        } else if (obj2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                            MessagesController.getInstance(i20).putChat(chat3, z13);
                            j10 = -chat3.id;
                        } else {
                            if (obj2 instanceof TLRPC.EncryptedChat) {
                                MessagesController.getInstance(i20).putEncryptedChat((TLRPC.EncryptedChat) obj2, z13);
                            }
                            j10 = j12;
                        }
                        if (j10 == j12 || ((TLRPC.Dialog) MessagesController.getInstance(i20).dialogs_dict.f(j10)) != null) {
                            j11 = j12;
                        } else {
                            j11 = j12;
                            MessagesStorage.getInstance(i20).getDialogFolderId(j10, new MessagesStorage.IntCallback() { // from class: of.u
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i23) {
                                    int i24 = f0.this.o0;
                                    if (i23 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j10;
                                        tL_dialog.id = j14;
                                        if (i23 != 0) {
                                            tL_dialog.folder_id = i23;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i24).dialogs_dict.k(tL_dialog, j14);
                                        MessagesController.getInstance(i24).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i24).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (f0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            ox oxVar = f0Var.Q;
                            boolean z14 = oxVar != null && oxVar.a() == j10;
                            int i23 = 0;
                            while (!z14 && i23 < size) {
                                of.e0 e0Var = (of.e0) arrayList6.get(i23);
                                int i24 = i23;
                                z14 = (e0Var == null || e0Var.c != j10) ? z14 : true;
                                i23 = i24 + 1;
                            }
                            if (z14) {
                                arrayList3.remove(i22);
                                arrayList4.remove(i22);
                                i22--;
                            }
                        }
                        z13 = true;
                        i22++;
                        j12 = j11;
                    }
                    MessagesController.getInstance(i20).putUsers(arrayList5, z13);
                    f0Var.s = arrayList3;
                    f0Var.C = arrayList4;
                    wVar.f(arrayList3, arrayList6);
                    f0Var.l();
                    ox oxVar2 = f0Var.Q;
                    if (oxVar2 != null) {
                        oxVar2.d(f0Var.z0 > 0, z13);
                        f0Var.Q.c();
                        break;
                    }
                }
                break;
            case 5:
                of.o1 o1Var = (of.o1) this.c;
                int i25 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                if (i25 == o1Var.A) {
                    o1Var.d = arrayList7;
                    o1Var.e = arrayList8;
                    o1Var.D = arrayList9;
                    o1Var.f.f(arrayList7, null);
                    o1Var.y = false;
                    o1Var.l();
                    o1Var.F();
                    break;
                }
                break;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.c, (Location) this.d, this.b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.b, (int[]) this.f);
                break;
            case 8:
                ((MessagesController) this.c).lambda$processUpdateArray$403((ff.u) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                break;
            case 9:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                break;
            case 10:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                break;
            case 11:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (qg) this.f, this.b);
                break;
            case 12:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str2 = (String) this.f;
                int i26 = this.b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i27 = 0;
                while (i27 < size2) {
                    Object obj3 = arrayList10.get(i27);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = l4Var.q0[i14].c.A;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.l4.C(l4Var, webPage, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
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
                        int i28 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i28);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.u3 u3Var = new org.telegram.ui.u3();
                                    u3Var.a = indexOf;
                                    u3Var.c = pageBlock;
                                    u3Var.b = obj;
                                    arrayList11.add(u3Var);
                                }
                                i28 = length;
                            }
                        }
                    }
                    i27++;
                    i14 = 0;
                }
                AndroidUtilities.runOnUIThread(new c3.d(l4Var, i26, arrayList11, str2, 10));
                break;
            case 14:
                TLObject tLObject3 = (TLObject) this.c;
                int i29 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i29).putUsers(updates.users, false);
                    MessagesController.getInstance(i29).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i14 < size3) {
                        Object obj4 = findUpdatesAndRemove.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj4).call;
                    }
                    if (LaunchActivity.C1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i29, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    MessagesController.getInstance(i29).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i29).putChats(groupcall.chats, false);
                    if (LaunchActivity.C1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i29, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    oc.a0(o2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 15:
                qn.N0((qn) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 16:
                cn cnVar = (cn) this.c;
                oi oiVar = (oi) this.d;
                oiVar.b = cnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new xm(cnVar, oiVar, (qn) this.f));
                break;
            case 17:
                cn cnVar2 = (cn) this.c;
                int i30 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                qn qnVar = cnVar2.a;
                qnVar.Xa(i30, messageObject.getId(), true, messageObject.getDialogId() == qnVar.H6 ? 1 : 0, true, 0, num, bArr, new om(cnVar2, messageObject, 1));
                break;
            case 18:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i31 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new org.telegram.ui.Components.x1(iArr, runnable, i31));
                    o2Var2.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            case 19:
                int i32 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f;
                if (LaunchActivity.y1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    zf.j0 j0Var = new zf.j0(11, i32, R.getParentActivity(), R, null);
                    j0Var.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    j0Var.show();
                    break;
                }
                break;
            case 20:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                int i33 = this.b;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i33).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i33).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                o2Var3.presentFragment(new qn(bundle));
                break;
            case 21:
                wr.O((wr) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 22:
                fv0 fv0Var = (fv0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.d;
                int i34 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f;
                int[] iArr2 = fv0Var.e;
                RLottieNative[] rLottieNativeArr = fv0Var.b1;
                if (fv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new dv0(fv0Var, i13));
                    break;
                } else {
                    boolean z15 = false;
                    int i35 = 0;
                    while (i35 < rLottieNativeArr.length) {
                        if (rLottieNativeArr[i35] == null) {
                            int i36 = i35 == 0 ? 1 : i35 == 1 ? 8 : i35 == 2 ? 14 : i35 == 3 ? 20 : 2;
                            if (i36 < tL_messages_stickerSet2.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet2.documents.get(i36);
                                String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                if (TextUtils.isEmpty(readRes)) {
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    int i37 = i34;
                                    i9 = i37;
                                    t1Var = t1Var2;
                                    AndroidUtilities.runOnUIThread(new ev0(document, i37, messageObject2, t1Var2, tL_messages_stickerSet, 1));
                                    z15 = true;
                                } else {
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    i9 = i34;
                                    t1Var = t1Var2;
                                    rLottieNativeArr[i35] = RLottieNative.b(readRes, "dice", iArr2, null, null);
                                    fv0Var.c1[i35] = iArr2[0];
                                }
                                i35++;
                                t1Var2 = t1Var;
                                i34 = i9;
                                tL_messages_stickerSet2 = tL_messages_stickerSet;
                            }
                        }
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        i9 = i34;
                        t1Var = t1Var2;
                        i35++;
                        t1Var2 = t1Var;
                        i34 = i9;
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                    }
                    int i38 = i34;
                    org.telegram.ui.Cells.t1 t1Var3 = t1Var2;
                    if (z15) {
                        AndroidUtilities.runOnUIThread(new dv0(fv0Var, i12));
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new rl(fv0Var, i38, t1Var3, 18));
                        break;
                    }
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i39 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f;
                Pattern pattern = LaunchActivity.x1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject4 == null || launchActivity.m0 == null) {
                        if (launchActivity.S == null) {
                            launchActivity.S = new ArrayList();
                        }
                        launchActivity.S.add(0, launchActivity.T);
                        launchActivity.T = null;
                        launchActivity.i0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject4;
                        Bundle i40 = aa.d.i("onlySelect", true);
                        i40.putString("importTitle", tL_messages_historyImportParsed.title);
                        i40.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i40.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i40.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i39).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                } else if (uri2.contains(it.next())) {
                                    i40.putInt("dialogsType", 12);
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i39).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i40.putInt("dialogsType", 11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (!z11) {
                                    i40.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().F0(false, true);
                        } else if (org.telegram.ui.l4.I() && org.telegram.ui.l4.x().R) {
                            org.telegram.ui.l4.x().o(false, true);
                        }
                        wb.x();
                        o50 o50Var = o50.z3;
                        if (o50Var != null) {
                            o50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.m0.U(true, true);
                            launchActivity.o0.U(true, true);
                        }
                        dy dyVar = new dy(i40);
                        dyVar.y2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(dyVar, !AndroidUtilities.isTablet() ? launchActivity.m0.getFragmentStack().size() <= 1 || !(launchActivity.m0.getFragmentStack().get(launchActivity.m0.getFragmentStack().size() - 1) instanceof ng0) : launchActivity.n0.getFragmentStack().isEmpty() || !(launchActivity.n0.getFragmentStack().get(launchActivity.n0.getFragmentStack().size() + (-1)) instanceof ng0), false);
                    }
                    try {
                        c2Var3.dismiss();
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                break;
            case 24:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                int i41 = this.b;
                String str3 = (String) this.e;
                x20 x20Var = (x20) this.f;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, launchActivity2.Z);
                try {
                    if (tLObject5 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject5;
                        boolean z16 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z16) {
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
                        MessagesController.getInstance(i41).putChats(arrayList2, false);
                        MessagesController.getInstance(i41).putUsers(arrayList, false);
                        if (!z16 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            n00 n00Var = new n00(o2Var4, false);
                            n00Var.U = -1;
                            n00Var.Y = "";
                            n00Var.Z = new ArrayList();
                            n00Var.b0 = "";
                            n00Var.d0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            n00Var.e0 = arrayList16;
                            n00Var.v0 = -1;
                            n00Var.y0 = -5;
                            n00Var.T = str3;
                            n00Var.V = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z16) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                n00Var.Y = tL_textWithEntities.text;
                                n00Var.Z = tL_textWithEntities.entities;
                                n00Var.a0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                n00Var.c0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                n00Var.c0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                n00Var.f0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                n00Var.U = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = o2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i14 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i14);
                                            if (dialogFilter.id == n00Var.U) {
                                                n00Var.Y = dialogFilter.name;
                                                n00Var.Z = dialogFilter.entities;
                                                n00Var.a0 = dialogFilter.title_noanimate;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                            }
                            n00Var.R();
                            o2Var4.showDialog(n00Var);
                            x20Var.run();
                            break;
                        } else {
                            a02 = oc.a0(o2Var4);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = oc.a0(o2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    x20Var.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                ll.p(i10, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                x20 x20Var2 = (x20) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i42 = this.b;
                ArrayList arrayList18 = launchActivity3.Z;
                if (!launchActivity3.isFinishing()) {
                    try {
                        x20Var2.run();
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity3);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity3.B0(alertDialog$Builder);
                        break;
                    } else if (launchActivity3.m0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat5 = updates2.chats.get(0);
                        chat5.left = false;
                        chat5.kicked = false;
                        MessagesController.getInstance(i42).putUsers(updates2.users, false);
                        MessagesController.getInstance(i42).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat5.id);
                        if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList18))) {
                            qn qnVar2 = new qn(bundle2);
                            NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(qnVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 26:
                of0 of0Var = (of0) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                int i43 = this.b;
                ArrayList arrayList19 = new ArrayList();
                b9.c cVar = new b9.c();
                cVar.c = "inapp";
                cVar.b = str4;
                arrayList19.add(cVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new z2(of0Var, str4, str5, str6, i43));
                break;
            case 27:
                int[] iArr3 = (int[]) this.c;
                int i44 = this.b;
                z8 z8Var5 = (z8) this.d;
                TLRPC.User user4 = (TLRPC.User) this.e;
                o9 o9Var3 = (o9) this.f;
                iArr3[0] = i44;
                z8Var5.r(user4);
                o9Var3.e(user4, z8Var5);
                break;
            case 28:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                int i45 = this.b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.y0.u(i45, v0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        return;
                    }
                } else if (tL_error3 != null) {
                    y0Var.S(tL_error3.text);
                    break;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(y0Var.getContext());
                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new ei1(i13, y0Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new fk0(i11));
                    y0Var.R(3, alertDialog$Builder2.a, new org.telegram.ui.web.w(strArr, i45, v0Var, 1));
                    break;
                }
            default:
                yf.m2 m2Var = (yf.m2) this.c;
                int i46 = this.b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                mq0 mq0Var = (mq0) this.f;
                if (m2Var.E != null && !m2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / m2Var.E.getWidth(), 1.0f / m2Var.E.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i46);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i46 / 90) % 2 != 0) {
                        matrix.postScale(m2Var.E.getHeight(), m2Var.E.getWidth());
                    } else {
                        matrix.postScale(m2Var.E.getWidth(), m2Var.E.getHeight());
                    }
                    if (list.isEmpty()) {
                        yf.j2 j2Var = new yf.j2(m2Var);
                        j2Var.h.set(0.0f, 0.0f, m2Var.E.getWidth(), m2Var.E.getHeight());
                        j2Var.i.set(j2Var.h);
                        matrix.mapRect(j2Var.i);
                        j2Var.c = i46;
                        Bitmap d = m2Var.d(m2Var.E, 0, 0, false);
                        j2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            j2Var.f = j2Var.c();
                            yf.m2.c(j2Var, m2Var.P, m2Var.Q);
                            m2Var.K = j2Var.j;
                            m2Var.L = j2Var.k;
                            arrayList20.add(j2Var);
                            AndroidUtilities.runOnUIThread(new ir0(m2Var, arrayList20, mq0Var, j2Var, 25));
                            m2Var.A = j2Var;
                            m2Var.y = true;
                            m2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i47 = 0; i47 < list.size(); i47++) {
                            yf.l2 l2Var = (yf.l2) list.get(i47);
                            yf.j2 j2Var2 = new yf.j2(m2Var);
                            j2Var2.h.set(l2Var.b, l2Var.c, r11 + l2Var.d, r15 + l2Var.e);
                            j2Var2.i.set(j2Var2.h);
                            matrix.mapRect(j2Var2.i);
                            j2Var2.c = i46;
                            Bitmap d9 = m2Var.d(l2Var.a, l2Var.b, l2Var.c, false);
                            j2Var2.d = d9;
                            if (d9 != null) {
                                j2Var2.f = j2Var2.c();
                                yf.m2.c(j2Var2, m2Var.P, m2Var.Q);
                                m2Var.K = j2Var2.j;
                                m2Var.L = j2Var2.k;
                                arrayList20.add(j2Var2);
                            }
                        }
                        m2Var.A = null;
                        m2Var.y = true;
                        m2Var.x = false;
                        AndroidUtilities.runOnUIThread(new xf.o0(6, m2Var, arrayList20));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g1(Object obj, int i9, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, int i9, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, int i9, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i9;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, Object obj4, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i9;
    }

    public /* synthetic */ g1(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i9, TL_account.updateEmojiStatus updateemojistatus) {
        this.a = 3;
        this.c = tLObject;
        this.d = zArr;
        this.f = callback;
        this.b = i9;
        this.e = updateemojistatus;
    }
}
