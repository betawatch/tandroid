package ai;

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
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z50;
import org.telegram.ui.aj;
import org.telegram.ui.al0;
import org.telegram.ui.cl0;
import org.telegram.ui.dt;
import org.telegram.ui.ex0;
import org.telegram.ui.j71;
import org.telegram.ui.kv0;
import org.telegram.ui.li0;
import org.telegram.ui.ns;
import org.telegram.ui.r60;
import org.telegram.ui.r70;
import org.telegram.ui.rs;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class cb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ cb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
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
                db.a((db) this.e, (TLObject) this.c, this.f, (ArrayList) this.d, (boolean[]) this.h, this.b);
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
                r70 r70Var = (r70) this.e;
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.h;
                r70Var.r = false;
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
                            r70Var.n = chat;
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
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                r60 r60Var = (r60) this.h;
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
                        org.telegram.ui.k9.o0(context, i11, tL_inputGroupCall, groupCall.invite_link, d6Var, true, true);
                        AndroidUtilities.runOnUIThread(r60Var);
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
                    ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new hi(b2Var, context, i11, exportgroupcallinvite, d6Var, r60Var));
                    break;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(r60Var);
                    break;
                }
                break;
            case 6:
                Context context2 = (Context) this.e;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                TLRPC.User user = (TLRPC.User) this.f;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.d;
                new j71(context2, chat2, user, new o8(this.b, booleanCallback, 27), (org.telegram.ui.ActionBar.d6) this.h).show();
                break;
            case 7:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.e, (Runnable[]) this.c, (Bitmap) this.f, (z50) this.d, this.b, (w7.i0[]) this.h);
                break;
            case 8:
                qg0.m((qg0) this.e, (Integer[]) this.f, this.b, (TLObject) this.c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 9:
                ns.Y((ns) this.e, (TLRPC.FileLocation) this.f, (TLRPC.InputFile) this.d, (TLObject) this.c, (TLRPC.FileLocation) this.h, this.b);
                break;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String[] strArr = (String[]) this.c;
                Context context3 = (Context) this.f;
                al0 al0Var = (al0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    al0Var.run();
                    break;
                } else {
                    cl0.c(context3, this.b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new dt(10, strArr, al0Var), true, new f(18), n2Var.getResourceProvider());
                    break;
                }
                break;
            case 11:
                c5.h hVar = (c5.h) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                List<Purchase> list = (List) this.f;
                c5.f fVar = (c5.f) this.d;
                ex0 ex0Var = (ex0) this.h;
                if (hVar.a == 0) {
                    li0 li0Var = new li0(1, n2Var2);
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
                                ConnectionsManager.getInstance(i13).sendRequest(tL_payments_assignPlayMarketTransaction, new za(i13, li0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new org.telegram.ui.h3(li0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_payments_canPurchaseStore, new hi(i13, 5, n2Var2, ex0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.e;
                TLObject tLObject3 = (TLObject) this.c;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f;
                da daVar = (da) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = tLObject3 instanceof TLRPC.TL_boolTrue;
                int i14 = this.b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.b1.x(i14, y0Var, daVar, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                } else if (tL_error2 != null) {
                    b1Var.Z(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new kv0(22, b1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new rs(23));
                    b1Var.Y(3, alertDialog$Builder.a, new org.telegram.ui.web.w(strArr2, i14, y0Var, daVar, 1));
                    break;
                }
            case 13:
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f;
                aj ajVar = (aj) this.d;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) this.h;
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
                            String o9 = a4.a.o(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i15, user2, 1), false);
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i15).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i15).getPathToAttach(photoSize, true));
                        }
                        yf.d0.a(tL_photos_photo.photo, user2, false);
                        UserConfig.getInstance(i15).setCurrentUser(user2);
                        UserConfig.getInstance(i15).saveConfig(true);
                        ajVar.run();
                        xc.a0(c5Var.getLastFragment()).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new qg.v(i15, c5Var)), null).j();
                        break;
                    }
                }
                break;
            default:
                ci.d dVar = (ci.d) this.e;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject5 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject5;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new xc(f3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        break;
                    } else {
                        final long j3 = tL_starsSubscriptionPricing.amount;
                        final int i16 = this.b;
                        yh.t5.y(i16, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: yh.q6
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                Long l4 = (Long) obj3;
                                if (!"paid".equals((String) obj2) || l4.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new ai.a8(l4, i16, j3, 8));
                            }
                        });
                        break;
                    }
                } else {
                    new xc(f3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                    break;
                }
        }
    }

    public /* synthetic */ cb(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.a = 0;
        this.e = dbVar;
        this.c = tLObject;
        this.f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.b = i10;
    }

    public /* synthetic */ cb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i10;
        this.c = obj2;
        this.f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public /* synthetic */ cb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public /* synthetic */ cb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.a = i11;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = obj4;
        this.b = i10;
        this.h = obj5;
    }

    public /* synthetic */ cb(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.a = 3;
        this.e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.c = context;
        this.f = n2Var;
        this.b = i10;
    }

    public /* synthetic */ cb(qg0 qg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 8;
        this.e = qg0Var;
        this.f = numArr;
        this.b = i10;
        this.c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ cb(ns nsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.a = 9;
        this.e = nsVar;
        this.f = fileLocation;
        this.d = inputFile;
        this.c = tLObject;
        this.h = fileLocation2;
        this.b = i10;
    }

    public /* synthetic */ cb(r70 r70Var, org.telegram.ui.g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.d1 d1Var) {
        this.a = 4;
        this.e = r70Var;
        this.f = g4Var;
        this.d = tL_error;
        this.c = tLObject;
        this.b = i10;
        this.h = d1Var;
    }

    public /* synthetic */ cb(org.telegram.ui.web.b1 b1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, da daVar, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.e = b1Var;
        this.c = tLObject;
        this.b = i10;
        this.f = y0Var;
        this.d = daVar;
        this.h = tL_error;
    }
}
