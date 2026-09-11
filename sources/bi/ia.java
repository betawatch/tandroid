package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yc;
import org.telegram.ui.dj;
import org.telegram.ui.jl0;
import org.telegram.ui.ll0;
import org.telegram.ui.lx0;
import org.telegram.ui.oj0;
import org.telegram.ui.qv0;
import org.telegram.ui.ri0;
import org.telegram.ui.ss;
import org.telegram.ui.sw0;
import org.telegram.ui.t71;
import org.telegram.ui.v60;
import org.telegram.ui.v70;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ia(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i11;
        this.c = tLObject;
        this.b = i10;
        this.e = obj;
        this.f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                ja.a((ja) this.e, (TLObject) this.c, this.f, (ArrayList) this.d, (boolean[]) this.h, this.b);
                break;
            case 1:
                ((ChatObject.Call) this.e).lambda$loadUnknownParticipants$5(this.b, (TLObject) this.c, (ChatObject.Call.OnParticipantsLoad) this.f, (ArrayList) this.d, (HashSet) this.h);
                break;
            case 2:
                ((LocaleController) this.e).lambda$saveRemoteLocaleStrings$10(this.b, (LocaleController.LocaleInfo) this.c, (TLRPC.TL_langPackDifference) this.f, (HashMap) this.d, (Runnable) this.h);
                break;
            case 3:
                ((MediaDataController) this.e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.c, (org.telegram.ui.ActionBar.n2) this.f, this.b);
                break;
            case 4:
                v70 v70Var = (v70) this.e;
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.h;
                v70Var.r = false;
                if (!g4Var.e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            d1Var.a(4, false);
                            break;
                        } else {
                            int i10 = this.b;
                            MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i10).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            v70Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                d1Var.a(4, false);
                                break;
                            } else {
                                d1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        d1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 5:
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                Context context = (Context) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                v60 v60Var = (v60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i11 = this.b;
                int i12 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size) {
                        Object obj = findUpdatesAndRemove.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    b2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.k9.o0(context, i11, tL_inputGroupCall, groupCall.invite_link, f6Var, true, true);
                        AndroidUtilities.runOnUIThread(v60Var);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i11).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i11).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new hi(b2Var, context, i11, exportgroupcallinvite, f6Var, v60Var));
                    break;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(v60Var);
                    break;
                }
                break;
            case 6:
                Context context2 = (Context) this.e;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                TLRPC.User user = (TLRPC.User) this.f;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.d;
                new t71(context2, chat2, user, new ah.g(this.b, booleanCallback, 28), (org.telegram.ui.ActionBar.f6) this.h).show();
                break;
            case 7:
                org.telegram.ui.Components.w9.a((org.telegram.ui.Components.w9) this.e, (Runnable[]) this.c, (Bitmap) this.f, (y50) this.d, this.b, (w7.i0[]) this.h);
                break;
            case 8:
                pg0.m((pg0) this.e, (Integer[]) this.f, this.b, (TLObject) this.c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 9:
                ss.Y((ss) this.e, (TLRPC.FileLocation) this.f, (TLRPC.InputFile) this.d, (TLObject) this.c, (TLRPC.FileLocation) this.h, this.b);
                break;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String[] strArr = (String[]) this.c;
                Context context3 = (Context) this.f;
                jl0 jl0Var = (jl0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    jl0Var.run();
                    break;
                } else {
                    ll0.c(context3, this.b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new oj0(3, strArr, jl0Var), true, new ah.j(19), n2Var.getResourceProvider());
                    break;
                }
                break;
            case 11:
                c5.h hVar = (c5.h) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                List<Purchase> list = (List) this.f;
                c5.f fVar = (c5.f) this.d;
                lx0 lx0Var = (lx0) this.h;
                if (hVar.a == 0) {
                    ri0 ri0Var = new ri0(1, n2Var2);
                    int i13 = this.b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i13).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains(BillingController.PREMIUM_PRODUCT_ID)) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i13).sendRequest(tL_payments_assignPlayMarketTransaction, new ga(i13, ri0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new org.telegram.ui.h3(ri0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_payments_canPurchaseStore, new hi(i13, 5, n2Var2, lx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) this.e;
                TLObject tLObject3 = (TLObject) this.c;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f;
                k9 k9Var = (k9) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = tLObject3 instanceof TLRPC.TL_boolTrue;
                int i14 = this.b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.d1.x(i14, z0Var, k9Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } else if (tL_error2 != null) {
                    d1Var2.Z(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var2.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new qv0(23, d1Var2, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new sw0(7));
                    d1Var2.Y(3, alertDialog$Builder.a, new org.telegram.ui.web.y(strArr2, i14, z0Var, k9Var, 1));
                    break;
                }
            case 13:
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f;
                dj djVar = (dj) this.d;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.h;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    int i15 = this.b;
                    MessagesController.getInstance(i15).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(UserConfig.getInstance(i15).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (closestPhotoSizeWithSize == null || photoSize2 == null || photoSize2.location == null) {
                            photoSize = closestPhotoSizeWithSize2;
                        } else {
                            FileLoader.getInstance(i15).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a4.a.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i15, user2, 1), false);
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i15).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i15).getPathToAttach(photoSize, true));
                        }
                        yf.e0.a(tL_photos_photo.photo, user2, false);
                        UserConfig.getInstance(i15).setCurrentUser(user2);
                        UserConfig.getInstance(i15).saveConfig(true);
                        djVar.run();
                        yc.a0(d5Var.getLastFragment()).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new rg.f(i15, d5Var)), null).j();
                        break;
                    }
                }
                break;
            default:
                di.d dVar = (di.d) this.e;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject5 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject5;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new yc(f3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        break;
                    } else {
                        final long j3 = tL_starsSubscriptionPricing.amount;
                        final int i16 = this.b;
                        zh.s5.y(i16, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: zh.p6
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                Long l4 = (Long) obj3;
                                if (!"paid".equals((String) obj2) || l4.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new bi.h7(l4, i16, j3, 8));
                            }
                        });
                        break;
                    }
                } else {
                    new yc(f3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                    break;
                }
        }
    }

    public /* synthetic */ ia(ja jaVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.a = 0;
        this.e = jaVar;
        this.c = tLObject;
        this.f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.b = i10;
    }

    public /* synthetic */ ia(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i10;
        this.c = obj2;
        this.f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public /* synthetic */ ia(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public /* synthetic */ ia(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.a = i11;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = obj4;
        this.b = i10;
        this.h = obj5;
    }

    public /* synthetic */ ia(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.a = 3;
        this.e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.c = context;
        this.f = n2Var;
        this.b = i10;
    }

    public /* synthetic */ ia(pg0 pg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 8;
        this.e = pg0Var;
        this.f = numArr;
        this.b = i10;
        this.c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ ia(ss ssVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.a = 9;
        this.e = ssVar;
        this.f = fileLocation;
        this.d = inputFile;
        this.c = tLObject;
        this.h = fileLocation2;
        this.b = i10;
    }

    public /* synthetic */ ia(v70 v70Var, org.telegram.ui.g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.d1 d1Var) {
        this.a = 4;
        this.e = v70Var;
        this.f = g4Var;
        this.d = tL_error;
        this.c = tLObject;
        this.b = i10;
        this.h = d1Var;
    }

    public /* synthetic */ ia(org.telegram.ui.web.d1 d1Var, TLObject tLObject, int i10, org.telegram.ui.web.z0 z0Var, k9 k9Var, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.e = d1Var;
        this.c = tLObject;
        this.b = i10;
        this.f = z0Var;
        this.d = k9Var;
        this.h = tL_error;
    }
}
