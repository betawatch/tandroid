package org.telegram.messenger;

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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.fz0;
import org.telegram.ui.il0;
import org.telegram.ui.js0;
import org.telegram.ui.kl0;
import org.telegram.ui.nj0;
import org.telegram.ui.nx0;
import org.telegram.ui.ri0;
import org.telegram.ui.t70;
import org.telegram.ui.ts;
import org.telegram.ui.u60;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ w0(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i11;
        this.d = tLObject;
        this.b = i10;
        this.c = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                ((ChatObject.Call) this.c).lambda$loadUnknownParticipants$5(this.b, (TLObject) this.d, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f, (HashSet) this.h);
                break;
            case 1:
                ((LocaleController) this.c).lambda$saveRemoteLocaleStrings$10(this.b, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f, (Runnable) this.h);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.f, (Context) this.e, (org.telegram.ui.ActionBar.p2) this.h, this.b);
                break;
            case 3:
                t70 t70Var = (t70) this.c;
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.h;
                t70Var.r = false;
                if (!h4Var.e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            e1Var.a(4, false);
                            break;
                        } else {
                            int i10 = this.b;
                            MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i10).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            t70Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                e1Var.a(4, false);
                                break;
                            } else {
                                e1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        e1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 4:
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
                u60 u60Var = (u60) this.h;
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
                    d2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.k9.o0(context, i11, tL_inputGroupCall, groupCall.invite_link, f6Var, true, true);
                        AndroidUtilities.runOnUIThread(u60Var);
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
                    ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new qi(d2Var, context, i11, exportgroupcallinvite, f6Var, u60Var));
                    break;
                } else {
                    d2Var.dismiss();
                    AndroidUtilities.runOnUIThread(u60Var);
                    break;
                }
                break;
            case 5:
                Context context2 = (Context) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                new v71(context2, chat2, user, new bi.s(this.b, booleanCallback, 26), (org.telegram.ui.ActionBar.f6) this.h).show();
                break;
            case 6:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.c, (Runnable[]) this.d, (Bitmap) this.e, (h60) this.f, this.b, (w7.x5[]) this.h);
                break;
            case 7:
                zg0.m((zg0) this.c, (Integer[]) this.e, this.b, (TLObject) this.d, (ArrayList) this.f, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 8:
                ts.Y((ts) this.c, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f, (TLObject) this.d, (TLRPC.FileLocation) this.h, this.b);
                break;
            case 9:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.c;
                String[] strArr = (String[]) this.d;
                Context context3 = (Context) this.e;
                il0 il0Var = (il0) this.f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    il0Var.run();
                    break;
                } else {
                    kl0.c(context3, this.b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new nj0(3, strArr, il0Var), true, new bi.f0(13), p2Var.getResourceProvider());
                    break;
                }
                break;
            case 10:
                c5.h hVar = (c5.h) this.c;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                List<Purchase> list = (List) this.e;
                c5.f fVar = (c5.f) this.f;
                nx0 nx0Var = (nx0) this.h;
                if (hVar.a == 0) {
                    ri0 ri0Var = new ri0(1, p2Var2);
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
                                ConnectionsManager.getInstance(i13).sendRequest(tL_payments_assignPlayMarketTransaction, new di.c5(i13, ri0Var, p2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new org.telegram.ui.i3(ri0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_payments_canPurchaseStore, new qi(i13, 5, p2Var2, nx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.e;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = tLObject3 instanceof TLRPC.TL_boolTrue;
                int i14 = this.b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.c1.x(i14, y0Var, a1Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                } else if (tL_error2 != null) {
                    c1Var.Z(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new fz0(18, c1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new js0(8));
                    c1Var.Y(3, alertDialog$Builder.a, new org.telegram.ui.web.x(strArr2, i14, y0Var, a1Var, 1));
                    break;
                }
            case 12:
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                org.telegram.ui.fj fjVar = (org.telegram.ui.fj) this.f;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.h;
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
                        xf.e0.a(tL_photos_photo.photo, user2, false);
                        UserConfig.getInstance(i15).setCurrentUser(user2);
                        UserConfig.getInstance(i15).saveConfig(true);
                        fjVar.run();
                        org.telegram.ui.Components.wc.a0(f5Var.getLastFragment()).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new pg.f2(i15, f5Var)), null).j();
                        break;
                    }
                }
                break;
            case 13:
                bi.d dVar = (bi.d) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject5 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject5;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new org.telegram.ui.Components.wc(h3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        break;
                    } else {
                        final long j3 = tL_starsSubscriptionPricing.amount;
                        final int i16 = this.b;
                        xh.v5.y(i16, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: xh.s6
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                Long l4 = (Long) obj3;
                                if (!"paid".equals((String) obj2) || l4.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.t5(l4, i16, j3, 7));
                            }
                        });
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.wc(h3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                    break;
                }
            default:
                zh.r6.a((zh.r6) this.c, (TLObject) this.d, this.e, (ArrayList) this.f, (boolean[]) this.h, this.b);
                break;
        }
    }

    public /* synthetic */ w0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
        this.h = obj5;
    }

    public /* synthetic */ w0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = zArr;
        this.f = arrayList;
        this.e = context;
        this.h = p2Var;
        this.b = i10;
    }

    public /* synthetic */ w0(zg0 zg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 7;
        this.c = zg0Var;
        this.e = numArr;
        this.b = i10;
        this.d = tLObject;
        this.f = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ w0(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.a = 8;
        this.c = tsVar;
        this.e = fileLocation;
        this.f = inputFile;
        this.d = tLObject;
        this.h = fileLocation2;
        this.b = i10;
    }

    public /* synthetic */ w0(t70 t70Var, org.telegram.ui.h4 h4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.e1 e1Var) {
        this.a = 3;
        this.c = t70Var;
        this.e = h4Var;
        this.f = tL_error;
        this.d = tLObject;
        this.b = i10;
        this.h = e1Var;
    }

    public /* synthetic */ w0(org.telegram.ui.web.c1 c1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, org.telegram.ui.web.a1 a1Var, TLRPC.TL_error tL_error) {
        this.a = 11;
        this.c = c1Var;
        this.d = tLObject;
        this.b = i10;
        this.e = y0Var;
        this.f = a1Var;
        this.h = tL_error;
    }

    public /* synthetic */ w0(zh.r6 r6Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.a = 14;
        this.c = r6Var;
        this.d = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.b = i10;
    }
}
