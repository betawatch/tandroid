package gh;

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
import hh.u7;
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
import lh.sb;
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
import org.telegram.messenger.ug;
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
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.y8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a30;
import org.telegram.ui.di1;
import org.telegram.ui.dn;
import org.telegram.ui.ex0;
import org.telegram.ui.gy;
import org.telegram.ui.j70;
import org.telegram.ui.nq0;
import org.telegram.ui.pm;
import org.telegram.ui.qg0;
import org.telegram.ui.qi;
import org.telegram.ui.qs;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.rx;
import org.telegram.ui.s50;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e1(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 17;
        this.b = i10;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    private final void a() {
        pf.c1 c1Var = (pf.c1) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (this.b == c1Var.A) {
            c1Var.d = arrayList;
            c1Var.e = arrayList2;
            c1Var.D = arrayList3;
            c1Var.f.f(arrayList, null);
            c1Var.y = false;
            c1Var.l();
            qs qsVar = (qs) c1Var;
            if (qsVar.y || qsVar.f.e() || qsVar.h() != 0) {
                return;
            }
            qsVar.G.e.e(false, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        boolean z10;
        char c10;
        String lowerCase;
        org.telegram.ui.ActionBar.n2 R;
        boolean z11;
        mc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        long j10;
        final long j11;
        int i11 = 17;
        int i12 = 3;
        int i13 = 2;
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.c;
                Context context = (Context) this.d;
                int i14 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j12 = k2Var.Y;
                a1 a1Var = new a1(k2Var, callback, 2);
                boolean z12 = starGift.limited;
                new m1(k2Var, context, i14, starGift, j12, a1Var, z12 && (disallowedGiftsSettings2 = k2Var.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z12 && (disallowedGiftsSettings = k2Var.X) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 1:
                lh.d dVar = (lh.d) this.c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.d;
                int i15 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                u7.y(i15, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    mc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            case 2:
                long[] jArr = (long[]) this.c;
                int i16 = this.b;
                n9 n9Var = (n9) this.d;
                n9 n9Var2 = (n9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(jArr[0]));
                    y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var.r(user);
                    n9Var.e(user, y8Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-jArr[0]));
                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var2.q(chat);
                    n9Var.e(chat, y8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(jArr[0]));
                    if (n9Var2 != null) {
                        y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var3.r(user2);
                        n9Var2.e(user2, y8Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        break;
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i16).getChat(Long.valueOf(-jArr[0]));
                    if (n9Var2 != null) {
                        y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var4.q(chat2);
                        n9Var2.e(chat2, y8Var4);
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
                int i17 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.e;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i17).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        c10 = 0;
                        NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i17).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
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
                LocationController.lambda$fetchLocationAddress$29((Locale) this.c, (Location) this.d, this.b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f);
                break;
            case 5:
                ((MediaDataController) this.c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.b, (int[]) this.f);
                break;
            case 6:
                ((MessagesController) this.c).lambda$processUpdateArray$403((gf.u) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                break;
            case 7:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                break;
            case 8:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                break;
            case 9:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (ug) this.f, this.b);
                break;
            case 10:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 11:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str2 = (String) this.f;
                int i18 = this.b;
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                for (int i19 = 0; i19 < size; i19++) {
                    Object obj = arrayList3.get(i19);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj);
                    if (obj instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj;
                        CharSequence C = org.telegram.ui.m4.C(m4Var, m4Var.q0[0].c.A, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i20 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i20);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.v3 v3Var = new org.telegram.ui.v3();
                                    v3Var.a = indexOf;
                                    v3Var.c = pageBlock;
                                    v3Var.b = obj;
                                    arrayList4.add(v3Var);
                                }
                                i20 = length;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ag.k0(m4Var, i18, arrayList4, str2, 9));
                break;
            case 12:
                TLObject tLObject3 = (TLObject) this.c;
                int i21 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i21).putUsers(updates.users, false);
                    MessagesController.getInstance(i21).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    int i22 = 0;
                    while (i22 < size2) {
                        Object obj2 = findUpdatesAndRemove.get(i22);
                        i22++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    if (LaunchActivity.C1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i21, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    MessagesController.getInstance(i21).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i21).putChats(groupcall.chats, false);
                    if (LaunchActivity.C1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i21, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    mc.a0(n2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 13:
                rn.N0((rn) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 14:
                dn dnVar = (dn) this.c;
                qi qiVar = (qi) this.d;
                qiVar.b = dnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new ym(dnVar, qiVar, (rn) this.f));
                break;
            case 15:
                dn dnVar2 = (dn) this.c;
                int i23 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                rn rnVar = dnVar2.a;
                rnVar.Xa(i23, messageObject.getId(), true, messageObject.getDialogId() == rnVar.H6 ? 1 : 0, true, 0, num, bArr, new pm(dnVar2, messageObject, 1));
                break;
            case 16:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i24 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.x1(iArr, runnable, i24));
                    n2Var2.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 17:
                int i25 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                if (LaunchActivity.y1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    ag.i1 i1Var = new ag.i1(11, i25, R.getParentActivity(), R, null);
                    i1Var.I1(chat3, arrayList5, arrayList6, arrayList7, null);
                    i1Var.show();
                    break;
                }
                break;
            case 18:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                int i26 = this.b;
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(tL_help_support.user);
                MessagesStorage.getInstance(i26).putUsersAndChats(arrayList8, null, true, true);
                MessagesController.getInstance(i26).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                n2Var3.presentFragment(new rn(bundle));
                break;
            case 19:
                ur.P((ur) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 20:
                hv0 hv0Var = (hv0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i27 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f;
                int[] iArr2 = hv0Var.e;
                RLottieNative[] rLottieNativeArr = hv0Var.b1;
                if (hv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new fv0(hv0Var, i13));
                    break;
                } else {
                    boolean z13 = false;
                    int i28 = 0;
                    while (i28 < rLottieNativeArr.length) {
                        if (rLottieNativeArr[i28] == null) {
                            int i29 = i28 == 0 ? 1 : i28 == 1 ? 8 : i28 == 2 ? 14 : i28 == 3 ? 20 : 2;
                            if (i29 < tL_messages_stickerSet.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i29);
                                String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                if (TextUtils.isEmpty(readRes)) {
                                    AndroidUtilities.runOnUIThread(new gv0(document, i27, messageObject2, s1Var, tL_messages_stickerSet, 1));
                                    z13 = true;
                                } else {
                                    rLottieNativeArr[i28] = RLottieNative.b(readRes, "dice", iArr2, null, null);
                                    hv0Var.c1[i28] = iArr2[0];
                                }
                            }
                        }
                        i28++;
                    }
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new fv0(hv0Var, i12));
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new km(hv0Var, i27, s1Var, i11));
                        break;
                    }
                }
            case 21:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i30 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f;
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
                        Bundle h = a9.p.h("onlySelect", true);
                        h.putString("importTitle", tL_messages_historyImportParsed.title);
                        h.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            h.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            h.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i30).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                } else if (uri2.contains(it.next())) {
                                    h.putInt("dialogsType", 12);
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i30).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            h.putInt("dialogsType", 11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (!z11) {
                                    h.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.m4.I() && org.telegram.ui.m4.x().R) {
                            org.telegram.ui.m4.x().o(false, true);
                        }
                        sb.x();
                        s50 s50Var = s50.z3;
                        if (s50Var != null) {
                            s50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.m0.U(true, true);
                            launchActivity.o0.U(true, true);
                        }
                        gy gyVar = new gy(h);
                        gyVar.y2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(gyVar, !AndroidUtilities.isTablet() ? launchActivity.m0.getFragmentStack().size() <= 1 || !(launchActivity.m0.getFragmentStack().get(launchActivity.m0.getFragmentStack().size() - 1) instanceof qg0) : launchActivity.n0.getFragmentStack().isEmpty() || !(launchActivity.n0.getFragmentStack().get(launchActivity.n0.getFragmentStack().size() + (-1)) instanceof qg0), false);
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
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                int i31 = this.b;
                String str3 = (String) this.e;
                a30 a30Var = (a30) this.f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity2.Z);
                try {
                    if (tLObject5 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject5;
                        boolean z14 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z14) {
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
                        MessagesController.getInstance(i31).putChats(arrayList2, false);
                        MessagesController.getInstance(i31).putUsers(arrayList, false);
                        if (!z14 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            q00 q00Var = new q00(n2Var4, false);
                            q00Var.U = -1;
                            q00Var.Y = "";
                            q00Var.Z = new ArrayList();
                            q00Var.b0 = "";
                            q00Var.d0 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            q00Var.e0 = arrayList9;
                            q00Var.v0 = -1;
                            q00Var.y0 = -5;
                            q00Var.T = str3;
                            q00Var.V = chatlist_chatlistinvite;
                            arrayList9.clear();
                            if (z14) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                q00Var.Y = tL_textWithEntities.text;
                                q00Var.Z = tL_textWithEntities.entities;
                                q00Var.a0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                q00Var.c0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                q00Var.c0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                q00Var.f0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                q00Var.U = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList10 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList10 != null) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < arrayList10.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList10.get(i32);
                                            if (dialogFilter.id == q00Var.U) {
                                                q00Var.Y = dialogFilter.name;
                                                q00Var.Z = dialogFilter.entities;
                                                q00Var.a0 = dialogFilter.title_noanimate;
                                            } else {
                                                i32++;
                                            }
                                        }
                                    }
                                }
                            }
                            q00Var.S();
                            n2Var4.showDialog(q00Var);
                            a30Var.run();
                            break;
                        } else {
                            a02 = mc.a0(n2Var4);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = mc.a0(n2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    a30Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.y1.r(i10, a02, null);
                break;
            case 23:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                a30 a30Var2 = (a30) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i33 = this.b;
                ArrayList arrayList11 = launchActivity3.Z;
                if (!launchActivity3.isFinishing()) {
                    try {
                        a30Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
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
                        TLRPC.Chat chat4 = updates2.chats.get(0);
                        chat4.left = false;
                        chat4.kicked = false;
                        MessagesController.getInstance(i33).putUsers(updates2.users, false);
                        MessagesController.getInstance(i33).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat4.id);
                        if (arrayList11.isEmpty() || MessagesController.getInstance(i33).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList11))) {
                            rn rnVar2 = new rn(bundle2);
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(rnVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 24:
                rf0 rf0Var = (rf0) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                int i34 = this.b;
                ArrayList arrayList12 = new ArrayList();
                c9.b bVar = new c9.b();
                bVar.c = "inapp";
                bVar.b = str4;
                arrayList12.add(bVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList12, new u2(rf0Var, str4, str5, str6, i34));
                break;
            case 25:
                int[] iArr3 = (int[]) this.c;
                int i35 = this.b;
                y8 y8Var5 = (y8) this.d;
                TLRPC.User user3 = (TLRPC.User) this.e;
                n9 n9Var3 = (n9) this.f;
                iArr3[0] = i35;
                y8Var5.r(user3);
                n9Var3.e(user3, y8Var5);
                break;
            case 26:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                int i36 = this.b;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.z0.u(i36, w0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e13) {
                        FileLog.e(e13);
                        return;
                    }
                } else if (tL_error3 != null) {
                    z0Var.S(tL_error3.text);
                    break;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z0Var.getContext());
                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new di1(i13, z0Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new j70(i11));
                    z0Var.R(3, alertDialog$Builder2.a, new org.telegram.ui.web.x(strArr, i36, w0Var, 1));
                    break;
                }
            case 27:
                final pf.z zVar = (pf.z) this.c;
                int i37 = this.b;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList15 = (ArrayList) this.f;
                pf.s sVar = zVar.f0;
                ArrayList arrayList16 = zVar.r0;
                int i38 = zVar.o0;
                zVar.z0--;
                if (i37 == zVar.Z) {
                    zVar.b0 = i37;
                    if (zVar.a0 != i37) {
                        sVar.b();
                    }
                    if (zVar.c0 != i37) {
                        zVar.E.clear();
                    }
                    zVar.J = true;
                    int i39 = 0;
                    while (i39 < arrayList13.size()) {
                        if (!zVar.F(arrayList13.get(i39))) {
                            arrayList13.remove(i39);
                            i39--;
                        }
                        i39++;
                    }
                    boolean z15 = true;
                    int size3 = arrayList16.size();
                    int i40 = 0;
                    while (i40 < arrayList13.size()) {
                        final Object obj3 = arrayList13.get(i40);
                        if (obj3 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj3;
                            j10 = 0;
                            MessagesController.getInstance(i38).putUser(user4, z15);
                            j11 = user4.id;
                        } else {
                            j10 = 0;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj3;
                                MessagesController.getInstance(i38).putChat(chat5, z15);
                                j11 = -chat5.id;
                            } else {
                                if (obj3 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i38).putEncryptedChat((TLRPC.EncryptedChat) obj3, z15);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i38).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i38).getDialogFolderId(j11, new MessagesStorage.IntCallback() { // from class: pf.q
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i41) {
                                    int i42 = z.this.o0;
                                    if (i41 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.id = j13;
                                        if (i41 != 0) {
                                            tL_dialog.folder_id = i41;
                                        }
                                        Object obj4 = obj3;
                                        if (obj4 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj4) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i42).dialogs_dict.k(tL_dialog, j13);
                                        MessagesController.getInstance(i42).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i42).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (zVar.S() && !(obj3 instanceof TLRPC.EncryptedChat)) {
                            rx rxVar = zVar.Q;
                            boolean z16 = rxVar != null && rxVar.a() == j11;
                            for (int i41 = 0; !z16 && i41 < size3; i41++) {
                                pf.y yVar = (pf.y) arrayList16.get(i41);
                                z16 = (yVar == null || yVar.c != j11) ? z16 : true;
                            }
                            if (z16) {
                                arrayList13.remove(i40);
                                arrayList14.remove(i40);
                                i40--;
                            }
                        }
                        z15 = true;
                        i40++;
                    }
                    MessagesController.getInstance(i38).putUsers(arrayList15, z15);
                    zVar.s = arrayList13;
                    zVar.C = arrayList14;
                    sVar.f(arrayList13, arrayList16);
                    zVar.l();
                    rx rxVar2 = zVar.Q;
                    if (rxVar2 != null) {
                        rxVar2.d(zVar.z0 > 0, z15);
                        zVar.Q.c();
                        break;
                    }
                }
                break;
            case 28:
                a();
                break;
            default:
                zf.n2 n2Var5 = (zf.n2) this.c;
                int i42 = this.b;
                List list = (List) this.d;
                ArrayList arrayList17 = (ArrayList) this.e;
                nq0 nq0Var = (nq0) this.f;
                if (n2Var5.E != null && !n2Var5.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var5.E.getWidth(), 1.0f / n2Var5.E.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i42);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i42 / 90) % 2 != 0) {
                        matrix.postScale(n2Var5.E.getHeight(), n2Var5.E.getWidth());
                    } else {
                        matrix.postScale(n2Var5.E.getWidth(), n2Var5.E.getHeight());
                    }
                    if (list.isEmpty()) {
                        zf.k2 k2Var2 = new zf.k2(n2Var5);
                        k2Var2.h.set(0.0f, 0.0f, n2Var5.E.getWidth(), n2Var5.E.getHeight());
                        k2Var2.i.set(k2Var2.h);
                        matrix.mapRect(k2Var2.i);
                        k2Var2.c = i42;
                        Bitmap d = n2Var5.d(n2Var5.E, 0, 0, false);
                        k2Var2.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            k2Var2.f = k2Var2.c();
                            zf.n2.c(k2Var2, n2Var5.P, n2Var5.Q);
                            n2Var5.K = k2Var2.j;
                            n2Var5.L = k2Var2.k;
                            arrayList17.add(k2Var2);
                            AndroidUtilities.runOnUIThread(new ex0(n2Var5, arrayList17, nq0Var, k2Var2, 25));
                            n2Var5.A = k2Var2;
                            n2Var5.y = true;
                            n2Var5.x = false;
                            break;
                        }
                    } else {
                        for (int i43 = 0; i43 < list.size(); i43++) {
                            zf.m2 m2Var = (zf.m2) list.get(i43);
                            zf.k2 k2Var3 = new zf.k2(n2Var5);
                            k2Var3.h.set(m2Var.b, m2Var.c, r12 + m2Var.d, r6 + m2Var.e);
                            k2Var3.i.set(k2Var3.h);
                            matrix.mapRect(k2Var3.i);
                            k2Var3.c = i42;
                            Bitmap d10 = n2Var5.d(m2Var.a, m2Var.b, m2Var.c, false);
                            k2Var3.d = d10;
                            if (d10 != null) {
                                k2Var3.f = k2Var3.c();
                                zf.n2.c(k2Var3, n2Var5.P, n2Var5.Q);
                                n2Var5.K = k2Var3.j;
                                n2Var5.L = k2Var3.k;
                                arrayList17.add(k2Var3);
                            }
                        }
                        n2Var5.A = null;
                        n2Var5.y = true;
                        n2Var5.x = false;
                        AndroidUtilities.runOnUIThread(new rh.o2(12, n2Var5, arrayList17));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e1(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ e1(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i10, TL_account.updateEmojiStatus updateemojistatus) {
        this.a = 3;
        this.c = tLObject;
        this.d = zArr;
        this.f = callback;
        this.b = i10;
        this.e = updateemojistatus;
    }
}
