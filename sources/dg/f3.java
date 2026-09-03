package dg;

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
import lh.t7;
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
import org.telegram.messenger.ah;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cy;
import org.telegram.ui.e60;
import org.telegram.ui.gn;
import org.telegram.ui.ln;
import org.telegram.ui.n4;
import org.telegram.ui.qy;
import org.telegram.ui.w10;
import org.telegram.ui.xg0;
import org.telegram.ui.xm;
import org.telegram.ui.yf0;
import org.telegram.ui.yi;
import org.telegram.ui.zn;
import org.telegram.ui.zq0;
import ph.da;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.p2 R;
        boolean z4;
        qc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z10;
        long j10;
        final long j11;
        int i11 = 2;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.c;
                int i12 = this.b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                zq0 zq0Var = (zq0) this.f;
                if (q3Var.F != null && !q3Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / q3Var.F.getWidth(), 1.0f / q3Var.F.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i12);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i12 / 90) % 2 != 0) {
                        matrix.postScale(q3Var.F.getHeight(), q3Var.F.getWidth());
                    } else {
                        matrix.postScale(q3Var.F.getWidth(), q3Var.F.getHeight());
                    }
                    if (list.isEmpty()) {
                        n3 n3Var = new n3(q3Var);
                        n3Var.h.set(0.0f, 0.0f, q3Var.F.getWidth(), q3Var.F.getHeight());
                        n3Var.i.set(n3Var.h);
                        matrix.mapRect(n3Var.i);
                        n3Var.c = i12;
                        Bitmap d = q3Var.d(q3Var.F, 0, 0, false);
                        n3Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            n3Var.f = n3Var.c();
                            q3.c(n3Var, q3Var.Q, q3Var.R);
                            q3Var.L = n3Var.j;
                            q3Var.M = n3Var.k;
                            arrayList3.add(n3Var);
                            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(q3Var, arrayList3, zq0Var, n3Var, 2));
                            q3Var.B = n3Var;
                            q3Var.y = true;
                            q3Var.x = false;
                            break;
                        }
                    } else {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            p3 p3Var = (p3) list.get(i13);
                            n3 n3Var2 = new n3(q3Var);
                            n3Var2.h.set(p3Var.b, p3Var.c, r10 + p3Var.d, r12 + p3Var.e);
                            n3Var2.i.set(n3Var2.h);
                            matrix.mapRect(n3Var2.i);
                            n3Var2.c = i12;
                            Bitmap d10 = q3Var.d(p3Var.a, p3Var.b, p3Var.c, false);
                            n3Var2.d = d10;
                            if (d10 != null) {
                                n3Var2.f = n3Var2.c();
                                q3.c(n3Var2, q3Var.Q, q3Var.R);
                                q3Var.L = n3Var2.j;
                                q3Var.M = n3Var2.k;
                                arrayList3.add(n3Var2);
                            }
                        }
                        q3Var.B = null;
                        q3Var.y = true;
                        q3Var.x = false;
                        AndroidUtilities.runOnUIThread(new a1.e(19, q3Var, arrayList3));
                        break;
                    }
                }
                break;
            case 1:
                kh.g2 g2Var = (kh.g2) this.c;
                Context context = (Context) this.d;
                int i14 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j12 = g2Var.Z;
                kh.x0 x0Var = new kh.x0(g2Var, callback, 2);
                boolean z12 = starGift.limited;
                new kh.i1(g2Var, context, i14, starGift, j12, x0Var, z12 && (disallowedGiftsSettings2 = g2Var.Y) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z12 && (disallowedGiftsSettings = g2Var.Y) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 2:
                ph.d dVar = (ph.d) this.c;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.d;
                int i15 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                t7.y(i15, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
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
                ((MessagesController) this.c).lambda$processUpdateArray$403((kf.t) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f, this.b);
                break;
            case 6:
                ((MessagesStorage) this.c).lambda$getSentFile$164((String) this.d, this.b, (Object[]) this.e, (CountDownLatch) this.f);
                break;
            case 7:
                ((MessagesStorage) this.c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.b, (String) this.f);
                break;
            case 8:
                ((NotificationCenter) this.c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (ah) this.f, this.b);
                break;
            case 9:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 10:
                n4 n4Var = (n4) this.c;
                ArrayList arrayList4 = (ArrayList) this.e;
                HashMap hashMap = (HashMap) this.d;
                String str2 = (String) this.f;
                int i16 = this.b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                for (int i17 = 0; i17 < size; i17++) {
                    Object obj2 = arrayList4.get(i17);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj2);
                    if (obj2 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj2;
                        obj = obj2;
                        CharSequence C = n4.C(n4Var, n4Var.r0[0].c.B, null, richText, richText, pageBlock, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj = obj2;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i18 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i18);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.w3 w3Var = new org.telegram.ui.w3();
                                    w3Var.a = indexOf;
                                    w3Var.c = pageBlock;
                                    w3Var.b = obj;
                                    arrayList5.add(w3Var);
                                }
                                i18 = length;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new cg.v1((Object) n4Var, i16, arrayList5, (Serializable) str2, 9));
                break;
            case 11:
                TLObject tLObject2 = (TLObject) this.c;
                int i19 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i19).putUsers(updates.users, false);
                    MessagesController.getInstance(i19).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj3 = findUpdatesAndRemove.get(i20);
                        i20++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj3).call;
                    }
                    if (LaunchActivity.D1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.D1, i19, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i19).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i19).putChats(groupcall.chats, false);
                    if (LaunchActivity.D1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.D1, i19, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    qc.a0(p2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 12:
                zn.N0((zn) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 13:
                ln lnVar = (ln) this.c;
                yi yiVar = (yi) this.d;
                yiVar.b = lnVar.a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).id, this.b, new gn(lnVar, yiVar, (zn) this.f));
                break;
            case 14:
                ln lnVar2 = (ln) this.c;
                int i21 = this.b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                zn znVar = lnVar2.a;
                znVar.Xa(i21, messageObject.getId(), true, messageObject.getDialogId() == znVar.I6 ? 1 : 0, true, 0, num, bArr, new xm(lnVar2, messageObject, 1));
                break;
            case 15:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.c;
                int[] iArr = (int[]) this.d;
                int i22 = this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i22));
                    p2Var2.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            case 16:
                int i23 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (LaunchActivity.z1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    eg.v0 v0Var = new eg.v0(11, i23, R.getParentActivity(), R, null);
                    v0Var.I1(chat, arrayList6, arrayList7, arrayList8, null);
                    v0Var.show();
                    break;
                }
                break;
            case 17:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                int i24 = this.b;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                MessagesStorage.getInstance(i24).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i24).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                p2Var3.presentFragment(new zn(bundle));
                break;
            case 18:
                ds.P((ds) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 19:
                yv0 yv0Var = (yv0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i25 = this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f;
                int[] iArr2 = yv0Var.e;
                RLottieNative[] rLottieNativeArr = yv0Var.c1;
                if (yv0Var.T0) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, i11));
                    break;
                } else {
                    int i26 = 0;
                    boolean z13 = false;
                    while (true) {
                        int i27 = 3;
                        if (i26 < rLottieNativeArr.length) {
                            if (rLottieNativeArr[i26] == null) {
                                int i28 = i26 == 0 ? 1 : i26 == 1 ? 8 : i26 == 2 ? 14 : i26 == 3 ? 20 : 2;
                                if (i28 < tL_messages_stickerSet.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i28);
                                    String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                    if (TextUtils.isEmpty(readRes)) {
                                        AndroidUtilities.runOnUIThread(new xv0(document, i25, messageObject2, s1Var, tL_messages_stickerSet, 1));
                                        z13 = true;
                                    } else {
                                        rLottieNativeArr[i26] = RLottieNative.b(readRes, iArr2, null, null);
                                        yv0Var.d1[i26] = iArr2[0];
                                    }
                                }
                            }
                            i26++;
                        } else if (z13) {
                            AndroidUtilities.runOnUIThread(new wv0(yv0Var, i27));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new ey(yv0Var, i25, s1Var, 15));
                            break;
                        }
                    }
                }
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i29 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f;
                Pattern pattern = LaunchActivity.y1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 == null || launchActivity.n0 == null) {
                        if (launchActivity.T == null) {
                            launchActivity.T = new ArrayList();
                        }
                        launchActivity.T.add(0, launchActivity.U);
                        launchActivity.U = null;
                        launchActivity.i0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i30 = android.support.v4.media.a.i("onlySelect", true);
                        i30.putString("importTitle", tL_messages_historyImportParsed.title);
                        i30.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i30.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i30.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i29).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z4 = false;
                                } else if (uri2.contains(it.next())) {
                                    i30.putInt("dialogsType", 12);
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                Iterator<String> it2 = MessagesController.getInstance(i29).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i30.putInt("dialogsType", 11);
                                            z4 = true;
                                        }
                                    }
                                }
                                if (!z4) {
                                    i30.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (n4.I() && n4.x().S) {
                            n4.x().o(false, true);
                        }
                        da.x();
                        e60 e60Var = e60.A3;
                        if (e60Var != null) {
                            e60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.n0.U(true, true);
                            launchActivity.p0.U(true, true);
                        }
                        qy qyVar = new qy(i30);
                        qyVar.z2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(qyVar, !AndroidUtilities.isTablet() ? launchActivity.n0.getFragmentStack().size() <= 1 || !(launchActivity.n0.getFragmentStack().get(launchActivity.n0.getFragmentStack().size() - 1) instanceof xg0) : launchActivity.o0.getFragmentStack().isEmpty() || !(launchActivity.o0.getFragmentStack().get(launchActivity.o0.getFragmentStack().size() + (-1)) instanceof xg0), false);
                    }
                    try {
                        d2Var3.dismiss();
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                break;
            case 21:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i31 = this.b;
                String str3 = (String) this.e;
                w10 w10Var = (w10) this.f;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) kf.k0.i(1, launchActivity2.a0);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
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
                            d10 d10Var = new d10(p2Var4, false);
                            d10Var.V = -1;
                            d10Var.Z = "";
                            d10Var.a0 = new ArrayList();
                            d10Var.c0 = "";
                            d10Var.e0 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            d10Var.f0 = arrayList10;
                            d10Var.w0 = -1;
                            d10Var.z0 = -5;
                            d10Var.U = str3;
                            d10Var.W = chatlist_chatlistinvite;
                            arrayList10.clear();
                            if (z14) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                d10Var.Z = tL_textWithEntities.text;
                                d10Var.a0 = tL_textWithEntities.entities;
                                d10Var.b0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                d10Var.d0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                d10Var.d0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                d10Var.g0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                d10Var.V = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList11 = p2Var4.getMessagesController().dialogFilters;
                                if (arrayList11 != null) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < arrayList11.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList11.get(i32);
                                            if (dialogFilter.id == d10Var.V) {
                                                d10Var.Z = dialogFilter.name;
                                                d10Var.a0 = dialogFilter.entities;
                                                d10Var.b0 = dialogFilter.title_noanimate;
                                            } else {
                                                i32++;
                                            }
                                        }
                                    }
                                }
                            }
                            d10Var.S();
                            p2Var4.showDialog(d10Var);
                            w10Var.run();
                            break;
                        } else {
                            a02 = qc.a0(p2Var4);
                            i10 = R.string.NoFolderFound;
                        }
                    } else {
                        a02 = qc.a0(p2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    w10Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                org.telegram.messenger.y3.s(i10, a02, null);
                break;
            case 22:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                w10 w10Var2 = (w10) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i33 = this.b;
                ArrayList arrayList12 = launchActivity3.a0;
                if (!launchActivity3.isFinishing()) {
                    try {
                        w10Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity3);
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity3.B0(alertDialog$Builder);
                        break;
                    } else if (launchActivity3.n0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat2 = updates2.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        MessagesController.getInstance(i33).putUsers(updates2.users, false);
                        MessagesController.getInstance(i33).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat2.id);
                        if (arrayList12.isEmpty() || MessagesController.getInstance(i33).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList12))) {
                            zn znVar2 = new zn(bundle2);
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(znVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 23:
                yf0 yf0Var = (yf0) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                int i34 = this.b;
                ArrayList arrayList13 = new ArrayList();
                b6.h hVar = new b6.h();
                hVar.c = "inapp";
                hVar.b = str4;
                arrayList13.add(hVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList13, new l3(yf0Var, str4, str5, str6, i34));
                break;
            case 24:
                int[] iArr3 = (int[]) this.c;
                int i35 = this.b;
                z8 z8Var = (z8) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                p9 p9Var = (p9) this.f;
                iArr3[0] = i35;
                z8Var.r(user);
                p9Var.e(user, z8Var);
                break;
            case 25:
                long[] jArr = (long[]) this.c;
                int i36 = this.b;
                p9 p9Var2 = (p9) this.d;
                p9 p9Var3 = (p9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i36).getUser(Long.valueOf(jArr[0]));
                    z8 z8Var2 = new z8((f6) null);
                    z8Var2.r(user2);
                    p9Var2.e(user2, z8Var2);
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i36).getChat(Long.valueOf(-jArr[0]));
                    z8 z8Var3 = new z8((f6) null);
                    z8Var3.q(chat3);
                    p9Var2.e(chat3, z8Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i36).getUser(Long.valueOf(jArr[0]));
                    if (p9Var3 != null) {
                        z8 z8Var4 = new z8((f6) null);
                        z8Var4.r(user3);
                        p9Var3.e(user3, z8Var4);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user3));
                        break;
                    }
                } else {
                    TLRPC.Chat chat4 = MessagesController.getInstance(i36).getChat(Long.valueOf(-jArr[0]));
                    if (p9Var3 != null) {
                        z8 z8Var5 = new z8((f6) null);
                        z8Var5.q(chat4);
                        p9Var3.e(chat4, z8Var5);
                    }
                    if (textView != null) {
                        textView.setText(chat4 != null ? chat4.title : "");
                        break;
                    }
                }
                break;
            case 26:
                TLObject tLObject5 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                int i37 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i37).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i37).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                    } else {
                        z10 = true;
                    }
                    if (!zArr[0]) {
                        zArr[0] = z10;
                        callback2.run(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    callback2.run("SERVER_ERROR");
                    break;
                }
                break;
            case 27:
                final tf.z zVar = (tf.z) this.c;
                int i38 = this.b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.f;
                tf.s sVar = zVar.g0;
                ArrayList arrayList17 = zVar.s0;
                int i39 = zVar.p0;
                zVar.A0--;
                if (i38 == zVar.a0) {
                    zVar.c0 = i38;
                    if (zVar.b0 != i38) {
                        sVar.b();
                    }
                    if (zVar.d0 != i38) {
                        zVar.F.clear();
                    }
                    zVar.K = true;
                    int i40 = 0;
                    while (i40 < arrayList14.size()) {
                        if (!zVar.F(arrayList14.get(i40))) {
                            arrayList14.remove(i40);
                            i40--;
                        }
                        i40++;
                    }
                    int size3 = arrayList17.size();
                    int i41 = 0;
                    while (i41 < arrayList14.size()) {
                        final Object obj4 = arrayList14.get(i41);
                        if (obj4 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj4;
                            j10 = 0;
                            MessagesController.getInstance(i39).putUser(user4, z11);
                            j11 = user4.id;
                        } else {
                            j10 = 0;
                            if (obj4 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj4;
                                MessagesController.getInstance(i39).putChat(chat5, z11);
                                j11 = -chat5.id;
                            } else {
                                if (obj4 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i39).putEncryptedChat((TLRPC.EncryptedChat) obj4, z11);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i39).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i39).getDialogFolderId(j11, new MessagesStorage.IntCallback() { // from class: tf.q
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i42) {
                                    int i43 = z.this.p0;
                                    if (i42 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.id = j13;
                                        if (i42 != 0) {
                                            tL_dialog.folder_id = i42;
                                        }
                                        Object obj5 = obj4;
                                        if (obj5 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj5) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i43).dialogs_dict.k(tL_dialog, j13);
                                        MessagesController.getInstance(i43).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i43).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (zVar.S() && !(obj4 instanceof TLRPC.EncryptedChat)) {
                            cy cyVar = zVar.R;
                            boolean z15 = cyVar != null && cyVar.a() == j11;
                            for (int i42 = 0; !z15 && i42 < size3; i42++) {
                                tf.y yVar = (tf.y) arrayList17.get(i42);
                                z15 = (yVar == null || yVar.c != j11) ? z15 : true;
                            }
                            if (z15) {
                                arrayList14.remove(i41);
                                arrayList15.remove(i41);
                                i41--;
                            }
                        }
                        i41++;
                        z11 = true;
                    }
                    MessagesController.getInstance(i39).putUsers(arrayList16, true);
                    zVar.s = arrayList14;
                    zVar.D = arrayList15;
                    sVar.f(arrayList14, arrayList17);
                    zVar.l();
                    cy cyVar2 = zVar.R;
                    if (cyVar2 != null) {
                        cyVar2.d(zVar.A0 > 0, true);
                        zVar.R.c();
                        break;
                    }
                }
                break;
            default:
                tf.c1 c1Var = (tf.c1) this.c;
                int i43 = this.b;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.d;
                ArrayList arrayList20 = (ArrayList) this.f;
                if (i43 == c1Var.B) {
                    c1Var.d = arrayList18;
                    c1Var.e = arrayList19;
                    c1Var.E = arrayList20;
                    c1Var.f.f(arrayList18, null);
                    c1Var.y = false;
                    c1Var.l();
                    c1Var.F();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ f3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ f3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ f3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ f3(n4 n4Var, ArrayList arrayList, HashMap hashMap, String str, int i10) {
        this.a = 10;
        this.c = n4Var;
        this.e = arrayList;
        this.d = hashMap;
        this.f = str;
        this.b = i10;
    }

    public /* synthetic */ f3(ql0 ql0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11) {
        this.a = i11;
        this.c = ql0Var;
        this.b = i10;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }
}
