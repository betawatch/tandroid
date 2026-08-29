package bg;

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
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import jh.s7;
import nh.gb;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.xg;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.fi1;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.m4;
import org.telegram.ui.mq0;
import org.telegram.ui.ng0;
import org.telegram.ui.of0;
import org.telegram.ui.qm;
import org.telegram.ui.qx;
import org.telegram.ui.r50;
import org.telegram.ui.ri;
import org.telegram.ui.tn;
import org.telegram.ui.x60;
import org.telegram.ui.xx0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 16;
        this.b = i10;
        this.c = chat;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        m4 m4Var;
        int i10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.o2 R;
        boolean z10;
        tc a02;
        int i11;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z11;
        long j10;
        final long j11;
        int i12 = 13;
        int i13 = 3;
        int i14 = 2;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.c;
                int i15 = this.b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                mq0 mq0Var = (mq0) this.f;
                if (u3Var.E != null && !u3Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / u3Var.E.getWidth(), 1.0f / u3Var.E.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i15);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i15 / 90) % 2 != 0) {
                        matrix.postScale(u3Var.E.getHeight(), u3Var.E.getWidth());
                    } else {
                        matrix.postScale(u3Var.E.getWidth(), u3Var.E.getHeight());
                    }
                    if (list.isEmpty()) {
                        r3 r3Var = new r3(u3Var);
                        r3Var.h.set(0.0f, 0.0f, u3Var.E.getWidth(), u3Var.E.getHeight());
                        r3Var.i.set(r3Var.h);
                        matrix.mapRect(r3Var.i);
                        r3Var.c = i15;
                        Bitmap d = u3Var.d(u3Var.E, 0, 0, false);
                        r3Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            r3Var.f = r3Var.c();
                            u3.c(r3Var, u3Var.P, u3Var.Q);
                            u3Var.K = r3Var.j;
                            u3Var.L = r3Var.k;
                            arrayList3.add(r3Var);
                            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(u3Var, arrayList3, mq0Var, r3Var, 1));
                            u3Var.A = r3Var;
                            u3Var.y = true;
                            u3Var.x = false;
                            break;
                        }
                    } else {
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            t3 t3Var = (t3) list.get(i16);
                            r3 r3Var2 = new r3(u3Var);
                            r3Var2.h.set(t3Var.b, t3Var.c, r11 + t3Var.d, r13 + t3Var.e);
                            r3Var2.i.set(r3Var2.h);
                            matrix.mapRect(r3Var2.i);
                            r3Var2.c = i15;
                            Bitmap d10 = u3Var.d(t3Var.a, t3Var.b, t3Var.c, false);
                            r3Var2.d = d10;
                            if (d10 != null) {
                                r3Var2.f = r3Var2.c();
                                u3.c(r3Var2, u3Var.P, u3Var.Q);
                                u3Var.K = r3Var2.j;
                                u3Var.L = r3Var2.k;
                                arrayList3.add(r3Var2);
                            }
                        }
                        u3Var.A = null;
                        u3Var.y = true;
                        u3Var.x = false;
                        AndroidUtilities.runOnUIThread(new a1.e(i12, u3Var, arrayList3));
                        break;
                    }
                }
                break;
            case 1:
                ih.h2 h2Var = (ih.h2) this.c;
                Context context = (Context) this.d;
                int i17 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j12 = h2Var.Y;
                ih.y0 y0Var = new ih.y0(h2Var, callback, 2);
                boolean z13 = starGift.limited;
                new ih.j1(h2Var, context, i17, starGift, j12, y0Var, z13 && (disallowedGiftsSettings2 = h2Var.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z13 && (disallowedGiftsSettings = h2Var.X) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 2:
                nh.d dVar = (nh.d) this.c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                int i18 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                s7.y(i18, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    tc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                    break;
                }
                break;
            case 3:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.c, (Location) this.d, this.b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f);
                break;
            case 4:
                ((MediaDataController) this.c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.b, (int[]) this.f);
                break;
            case 5:
                ((MessagesController) this.c).lambda$processUpdateArray$403((jf.t) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                break;
            case 6:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                break;
            case 7:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                break;
            case 8:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (xg) this.f, this.b);
                break;
            case 9:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 10:
                m4 m4Var2 = (m4) this.c;
                ArrayList arrayList4 = (ArrayList) this.e;
                HashMap hashMap = (HashMap) this.d;
                String str2 = (String) this.f;
                int i19 = this.b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj2 = arrayList4.get(i20);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj2);
                    if (obj2 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj2;
                        TLRPC.WebPage webPage = m4Var2.q0[0].c.A;
                        int i21 = i20;
                        m4Var = m4Var2;
                        i10 = i21;
                        obj = obj2;
                        CharSequence C = m4.C(m4Var, webPage, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i22 = i20;
                        m4Var = m4Var2;
                        i10 = i22;
                        obj = obj2;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i23 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i23);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.v3 v3Var = new org.telegram.ui.v3();
                                    v3Var.a = indexOf;
                                    v3Var.c = pageBlock;
                                    v3Var.b = obj;
                                    arrayList5.add(v3Var);
                                }
                                i23 = length;
                            }
                        }
                    }
                    m4 m4Var3 = m4Var;
                    i20 = i10 + 1;
                    m4Var2 = m4Var3;
                }
                AndroidUtilities.runOnUIThread(new ag.z1((Object) m4Var2, i19, arrayList5, (Serializable) str2, 9));
                break;
            case 11:
                TLObject tLObject2 = (TLObject) this.c;
                int i24 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i24).putUsers(updates.users, false);
                    MessagesController.getInstance(i24).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    int i25 = 0;
                    while (i25 < size2) {
                        Object obj3 = findUpdatesAndRemove.get(i25);
                        i25++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj3).call;
                    }
                    if (LaunchActivity.C1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i24, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i24).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i24).putChats(groupcall.chats, false);
                    if (LaunchActivity.C1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i24, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    tc.a0(o2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 12:
                tn.N0((tn) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 13:
                fn fnVar = (fn) this.c;
                ri riVar = (ri) this.d;
                riVar.b = fnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new an(fnVar, riVar, (tn) this.f));
                break;
            case 14:
                fn fnVar2 = (fn) this.c;
                int i26 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                tn tnVar = fnVar2.a;
                tnVar.Xa(i26, messageObject.getId(), true, messageObject.getDialogId() == tnVar.H6 ? 1 : 0, true, 0, num, bArr, new qm(fnVar2, messageObject, 1));
                break;
            case 15:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i27 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new org.telegram.ui.Components.b2(iArr, runnable, i27));
                    o2Var2.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            case 16:
                int i28 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (LaunchActivity.y1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    cg.v0 v0Var = new cg.v0(11, i28, R.getParentActivity(), R, null);
                    v0Var.I1(chat, arrayList6, arrayList7, arrayList8, null);
                    v0Var.show();
                    break;
                }
                break;
            case 17:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                int i29 = this.b;
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
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                MessagesStorage.getInstance(i29).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i29).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                o2Var3.presentFragment(new tn(bundle));
                break;
            case 18:
                as.P((as) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 19:
                pv0 pv0Var = (pv0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i30 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f;
                int[] iArr2 = pv0Var.e;
                RLottieNative[] rLottieNativeArr = pv0Var.b1;
                if (pv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new nv0(pv0Var, i14));
                    break;
                } else {
                    int i31 = 0;
                    boolean z14 = false;
                    while (i31 < rLottieNativeArr.length) {
                        if (rLottieNativeArr[i31] == null) {
                            int i32 = i31 == 0 ? 1 : i31 == 1 ? 8 : i31 == 2 ? 14 : i31 == 3 ? 20 : 2;
                            if (i32 < tL_messages_stickerSet.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i32);
                                String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                if (TextUtils.isEmpty(readRes)) {
                                    AndroidUtilities.runOnUIThread(new ov0(document, i30, messageObject2, s1Var, tL_messages_stickerSet, 1));
                                    z14 = true;
                                } else {
                                    rLottieNativeArr[i31] = RLottieNative.b(readRes, "dice", iArr2, null, null);
                                    pv0Var.c1[i31] = iArr2[0];
                                }
                            }
                        }
                        i31++;
                    }
                    if (z14) {
                        AndroidUtilities.runOnUIThread(new nv0(pv0Var, i13));
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new rm(pv0Var, i30, s1Var, 17));
                        break;
                    }
                }
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i33 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f;
                Pattern pattern = LaunchActivity.x1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 == null || launchActivity.m0 == null) {
                        if (launchActivity.S == null) {
                            launchActivity.S = new ArrayList();
                        }
                        launchActivity.S.add(0, launchActivity.T);
                        launchActivity.T = null;
                        launchActivity.i0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i34 = a4.w.i("onlySelect", true);
                        i34.putString("importTitle", tL_messages_historyImportParsed.title);
                        i34.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i34.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i34.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i33).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z10 = false;
                                } else if (uri2.contains(it.next())) {
                                    i34.putInt("dialogsType", 12);
                                    z10 = true;
                                }
                            }
                            if (!z10) {
                                Iterator<String> it2 = MessagesController.getInstance(i33).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i34.putInt("dialogsType", 11);
                                            z10 = true;
                                        }
                                    }
                                }
                                if (!z10) {
                                    i34.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (m4.I() && m4.x().R) {
                            m4.x().o(false, true);
                        }
                        gb.x();
                        r50 r50Var = r50.z3;
                        if (r50Var != null) {
                            r50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.m0.U(true, true);
                            launchActivity.o0.U(true, true);
                        }
                        fy fyVar = new fy(i34);
                        fyVar.y2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(fyVar, !AndroidUtilities.isTablet() ? launchActivity.m0.getFragmentStack().size() <= 1 || !(launchActivity.m0.getFragmentStack().get(launchActivity.m0.getFragmentStack().size() - 1) instanceof ng0) : launchActivity.n0.getFragmentStack().isEmpty() || !(launchActivity.n0.getFragmentStack().get(launchActivity.n0.getFragmentStack().size() + (-1)) instanceof ng0), false);
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
            case 21:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i35 = this.b;
                String str3 = (String) this.e;
                x60 x60Var = (x60) this.f;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, launchActivity2.Z);
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
                        MessagesController.getInstance(i35).putChats(arrayList2, false);
                        MessagesController.getInstance(i35).putUsers(arrayList, false);
                        if (!z15 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            y00 y00Var = new y00(o2Var4, false);
                            y00Var.U = -1;
                            y00Var.Y = "";
                            y00Var.Z = new ArrayList();
                            y00Var.b0 = "";
                            y00Var.d0 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            y00Var.e0 = arrayList10;
                            y00Var.v0 = -1;
                            y00Var.y0 = -5;
                            y00Var.T = str3;
                            y00Var.V = chatlist_chatlistinvite;
                            arrayList10.clear();
                            if (z15) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                y00Var.Y = tL_textWithEntities.text;
                                y00Var.Z = tL_textWithEntities.entities;
                                y00Var.a0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                y00Var.c0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                y00Var.c0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                y00Var.f0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                y00Var.U = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList11 = o2Var4.getMessagesController().dialogFilters;
                                if (arrayList11 != null) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < arrayList11.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList11.get(i36);
                                            if (dialogFilter.id == y00Var.U) {
                                                y00Var.Y = dialogFilter.name;
                                                y00Var.Z = dialogFilter.entities;
                                                y00Var.a0 = dialogFilter.title_noanimate;
                                            } else {
                                                i36++;
                                            }
                                        }
                                    }
                                }
                            }
                            y00Var.S();
                            o2Var4.showDialog(y00Var);
                            x60Var.run();
                            break;
                        } else {
                            a02 = tc.a0(o2Var4);
                            i11 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = tc.a0(o2Var4);
                        i11 = R.string.NoFolderFound;
                    }
                    x60Var.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                org.telegram.messenger.x3.s(i11, a02, null);
                break;
            case 22:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                x60 x60Var2 = (x60) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i37 = this.b;
                ArrayList arrayList12 = launchActivity3.Z;
                if (!launchActivity3.isFinishing()) {
                    try {
                        x60Var2.run();
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
                        TLRPC.Chat chat2 = updates2.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        MessagesController.getInstance(i37).putUsers(updates2.users, false);
                        MessagesController.getInstance(i37).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat2.id);
                        if (arrayList12.isEmpty() || MessagesController.getInstance(i37).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList12))) {
                            tn tnVar2 = new tn(bundle2);
                            NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(tnVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 23:
                of0 of0Var = (of0) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                int i38 = this.b;
                ArrayList arrayList13 = new ArrayList();
                d9.c cVar = new d9.c();
                cVar.c = "inapp";
                cVar.b = str4;
                arrayList13.add(cVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList13, new p3(of0Var, str4, str5, str6, i38));
                break;
            case 24:
                int[] iArr3 = (int[]) this.c;
                int i39 = this.b;
                e9 e9Var = (e9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                t9 t9Var = (t9) this.f;
                iArr3[0] = i39;
                e9Var.r(user);
                t9Var.e(user, e9Var);
                break;
            case 25:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                int i40 = this.b;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.z0.u(i40, w0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e14) {
                        FileLog.e(e14);
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
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new fi1(i14, z0Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new xx0(6));
                    z0Var.R(3, alertDialog$Builder2.a, new org.telegram.ui.web.x(strArr, i40, w0Var, 1));
                    break;
                }
            case 26:
                long[] jArr = (long[]) this.c;
                int i41 = this.b;
                t9 t9Var2 = (t9) this.d;
                t9 t9Var3 = (t9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    e9 e9Var2 = new e9((c6) null);
                    e9Var2.r(user2);
                    t9Var2.e(user2, e9Var2);
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                    e9 e9Var3 = new e9((c6) null);
                    e9Var3.q(chat3);
                    t9Var2.e(chat3, e9Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    if (t9Var3 != null) {
                        e9 e9Var4 = new e9((c6) null);
                        e9Var4.r(user3);
                        t9Var3.e(user3, e9Var4);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user3));
                        break;
                    }
                } else {
                    TLRPC.Chat chat4 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                    if (t9Var3 != null) {
                        e9 e9Var5 = new e9((c6) null);
                        e9Var5.q(chat4);
                        t9Var3.e(chat4, e9Var5);
                    }
                    if (textView != null) {
                        textView.setText(chat4 != null ? chat4.title : "");
                        break;
                    }
                }
                break;
            case 27:
                TLObject tLObject6 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                int i42 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i42).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z11 = true;
                        NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i42).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                    } else {
                        z11 = true;
                    }
                    if (!zArr[0]) {
                        zArr[0] = z11;
                        callback2.run(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    callback2.run("SERVER_ERROR");
                    break;
                }
                break;
            case 28:
                final rf.a0 a0Var = (rf.a0) this.c;
                int i43 = this.b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.f;
                rf.t tVar = a0Var.f0;
                ArrayList arrayList17 = a0Var.r0;
                int i44 = a0Var.o0;
                a0Var.z0--;
                if (i43 == a0Var.Z) {
                    a0Var.b0 = i43;
                    if (a0Var.a0 != i43) {
                        tVar.b();
                    }
                    if (a0Var.c0 != i43) {
                        a0Var.E.clear();
                    }
                    a0Var.J = true;
                    int i45 = 0;
                    while (i45 < arrayList14.size()) {
                        if (!a0Var.F(arrayList14.get(i45))) {
                            arrayList14.remove(i45);
                            i45--;
                        }
                        i45++;
                    }
                    int size3 = arrayList17.size();
                    int i46 = 0;
                    while (i46 < arrayList14.size()) {
                        final Object obj4 = arrayList14.get(i46);
                        if (obj4 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj4;
                            j10 = 0;
                            MessagesController.getInstance(i44).putUser(user4, z12);
                            j11 = user4.id;
                        } else {
                            j10 = 0;
                            if (obj4 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj4;
                                MessagesController.getInstance(i44).putChat(chat5, z12);
                                j11 = -chat5.id;
                            } else {
                                if (obj4 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i44).putEncryptedChat((TLRPC.EncryptedChat) obj4, z12);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i44).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i44).getDialogFolderId(j11, new MessagesStorage.IntCallback() { // from class: rf.r
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i47) {
                                    int i48 = a0.this.o0;
                                    if (i47 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.id = j13;
                                        if (i47 != 0) {
                                            tL_dialog.folder_id = i47;
                                        }
                                        Object obj5 = obj4;
                                        if (obj5 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj5) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i48).dialogs_dict.k(tL_dialog, j13);
                                        MessagesController.getInstance(i48).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i48).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (a0Var.S() && !(obj4 instanceof TLRPC.EncryptedChat)) {
                            qx qxVar = a0Var.Q;
                            boolean z16 = qxVar != null && qxVar.a() == j11;
                            for (int i47 = 0; !z16 && i47 < size3; i47++) {
                                rf.z zVar = (rf.z) arrayList17.get(i47);
                                z16 = (zVar == null || zVar.c != j11) ? z16 : true;
                            }
                            if (z16) {
                                arrayList14.remove(i46);
                                arrayList15.remove(i46);
                                i46--;
                            }
                        }
                        i46++;
                        z12 = true;
                    }
                    MessagesController.getInstance(i44).putUsers(arrayList16, true);
                    a0Var.s = arrayList14;
                    a0Var.C = arrayList15;
                    tVar.f(arrayList14, arrayList17);
                    a0Var.l();
                    qx qxVar2 = a0Var.Q;
                    if (qxVar2 != null) {
                        qxVar2.d(a0Var.z0 > 0, true);
                        a0Var.Q.c();
                        break;
                    }
                }
                break;
            default:
                rf.d1 d1Var = (rf.d1) this.c;
                int i48 = this.b;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.d;
                ArrayList arrayList20 = (ArrayList) this.f;
                if (i48 == d1Var.A) {
                    d1Var.d = arrayList18;
                    d1Var.e = arrayList19;
                    d1Var.D = arrayList20;
                    d1Var.f.f(arrayList18, null);
                    d1Var.y = false;
                    d1Var.l();
                    d1Var.F();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ j3(m4 m4Var, ArrayList arrayList, HashMap hashMap, String str, int i10) {
        this.a = 10;
        this.c = m4Var;
        this.e = arrayList;
        this.d = hashMap;
        this.f = str;
        this.b = i10;
    }

    public /* synthetic */ j3(il0 il0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11) {
        this.a = i11;
        this.c = il0Var;
        this.b = i10;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }
}
