package ff;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import bg.c2;
import bg.d2;
import com.android.billingclient.api.Purchase;
import gh.v7;
import ih.f8;
import ih.h8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
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
import org.telegram.messenger.zh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.a60;
import org.telegram.ui.a70;
import org.telegram.ui.ai0;
import org.telegram.ui.eb0;
import org.telegram.ui.f1;
import org.telegram.ui.hw0;
import org.telegram.ui.i9;
import org.telegram.ui.is;
import org.telegram.ui.j4;
import org.telegram.ui.k3;
import org.telegram.ui.l61;
import org.telegram.ui.ri;
import org.telegram.ui.rk0;
import org.telegram.ui.tk0;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.y0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k0(h8 h8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i9) {
        this.a = 2;
        this.d = h8Var;
        this.b = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                ri riVar = (ri) this.f;
                b5 b5Var = (b5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i9 = this.c;
                    MessagesController.getInstance(i9).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(UserConfig.getInstance(i9).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (closestPhotoSizeWithSize == null || photoSize2 == null || photoSize2.location == null) {
                            photoSize = closestPhotoSizeWithSize2;
                        } else {
                            FileLoader.getInstance(i9).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String l10 = aa.d.l(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i9, user, 1), false);
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i9).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i9).getPathToAttach(photoSize, true));
                        }
                        l0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i9).setCurrentUser(user);
                        UserConfig.getInstance(i9).saveConfig(true);
                        riVar.run();
                        oc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new c2(i9, b5Var, 1)), null).j();
                        break;
                    }
                }
                break;
            case 1:
                kh.d dVar = (kh.d) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                f3[] f3VarArr = (f3[]) this.e;
                b6 b6Var = (b6) this.f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new oc(f3VarArr[0].topBulletinContainer, b6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        break;
                    } else {
                        final long j10 = tL_starsSubscriptionPricing.amount;
                        final int i10 = this.c;
                        v7.y(i10, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: gh.d9
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Long l11 = (Long) obj2;
                                if (!"paid".equals((String) obj) || l11.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new e9(l11, i10, j10, 0));
                            }
                        });
                        break;
                    }
                } else {
                    new oc(f3VarArr[0].topBulletinContainer, b6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                    break;
                }
            case 2:
                h8.a((h8) this.d, (TLObject) this.b, this.e, (ArrayList) this.f, (boolean[]) this.h, this.c);
                break;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.c, (TLObject) this.b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f, (HashSet) this.h);
                break;
            case 4:
                ((LocaleController) this.b).lambda$saveRemoteLocaleStrings$10(this.c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f, (Runnable) this.h);
                break;
            case 5:
                ((MediaDataController) this.b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.e, (Context) this.f, (o2) this.h, this.c);
                break;
            case 6:
                a70 a70Var = (a70) this.d;
                j4 j4Var = (j4) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject3 = (TLObject) this.b;
                f1 f1Var = (f1) this.h;
                a70Var.r = false;
                if (!j4Var.e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            f1Var.a(4, false);
                            break;
                        } else {
                            int i11 = this.c;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            a70Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                f1Var.a(4, false);
                                break;
                            } else {
                                f1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        f1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 7:
                TLObject tLObject4 = (TLObject) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.d;
                Context context = (Context) this.e;
                b6 b6Var2 = (b6) this.f;
                a60 a60Var = (a60) this.h;
                boolean z10 = tLObject4 instanceof TLRPC.Updates;
                int i12 = this.c;
                int i13 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    MessagesController.getInstance(i12).putUsers(updates.users, false);
                    MessagesController.getInstance(i12).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size) {
                        Object obj = findUpdatesAndRemove.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    c2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i9.n0(context, i12, tL_inputGroupCall, groupCall.invite_link, b6Var2, true, true);
                        AndroidUtilities.runOnUIThread(a60Var);
                        break;
                    }
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    MessagesController.getInstance(i12).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i12).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new zh(c2Var, context, i12, exportgroupcallinvite, b6Var2, a60Var));
                    break;
                } else {
                    c2Var.dismiss();
                    AndroidUtilities.runOnUIThread(a60Var);
                    break;
                }
                break;
            case 8:
                Context context2 = (Context) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                new l61(context2, chat2, user2, new c2(this.c, booleanCallback, 26), (b6) this.h).show();
                break;
            case 9:
                n9.a((n9) this.b, (Runnable[]) this.d, (Bitmap) this.e, (h50) this.f, this.c, (g7.b6[]) this.h);
                break;
            case 10:
                ag0.m((ag0) this.d, (Integer[]) this.e, this.c, (TLObject) this.b, (ArrayList) this.f, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 11:
                is.X((is) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f, (TLObject) this.b, (TLRPC.FileLocation) this.h, this.c);
                break;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.b;
                String[] strArr = (String[]) this.d;
                Context context3 = (Context) this.e;
                rk0 rk0Var = (rk0) this.f;
                o2 o2Var = (o2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    rk0Var.run();
                    break;
                } else {
                    tk0.c(context3, this.c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new eb0(5, strArr, rk0Var), true, new d2(23), o2Var.getResourceProvider());
                    break;
                }
                break;
            case 13:
                n2.g gVar = (n2.g) this.b;
                o2 o2Var2 = (o2) this.d;
                List<Purchase> list = (List) this.e;
                n2.e eVar = (n2.e) this.f;
                hw0 hw0Var = (hw0) this.h;
                if (gVar.a == 0) {
                    ai0 ai0Var = new ai0(1, o2Var2);
                    int i14 = this.c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains(BillingController.PREMIUM_PRODUCT_ID)) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (eVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new f8(i14, ai0Var, o2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new k3(ai0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new zh(o2Var2, tL_inputStorePaymentPremiumSubscription2, hw0Var, eVar, i14, tL_payments_canPurchaseStore, 5));
                    break;
                }
                break;
            default:
                y0 y0Var = (y0) this.d;
                String str = (String) this.e;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                int i15 = this.c;
                v0 v0Var = (v0) this.h;
                y0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str);
                    if (tLObject5 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject5).data).nextValue());
                    } else if (tL_error2 != null) {
                        jSONObject.put("error", tL_error2.text);
                    }
                    y0.u(i15, v0Var, "custom_method_invoked", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    y0Var.S(null);
                }
        }
    }

    public /* synthetic */ k0(Object obj, int i9, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i9;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i9, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i9;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ k0(kh.d dVar, TLObject tLObject, f3[] f3VarArr, b6 b6Var, int i9, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = 1;
        this.d = dVar;
        this.b = tLObject;
        this.e = f3VarArr;
        this.f = b6Var;
        this.c = i9;
        this.h = tL_messages_checkChatInvite;
    }

    public /* synthetic */ k0(ChatObject.Call call, int i9, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.a = 3;
        this.d = call;
        this.c = i9;
        this.b = tLObject;
        this.e = onParticipantsLoad;
        this.f = arrayList;
        this.h = hashSet;
    }

    public /* synthetic */ k0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, o2 o2Var, int i9) {
        this.a = 5;
        this.b = mediaDataController;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = o2Var;
        this.c = i9;
    }

    public /* synthetic */ k0(n9 n9Var, Runnable[] runnableArr, Bitmap bitmap, h50 h50Var, int i9, g7.b6[] b6VarArr) {
        this.a = 9;
        this.b = n9Var;
        this.d = runnableArr;
        this.e = bitmap;
        this.f = h50Var;
        this.c = i9;
        this.h = b6VarArr;
    }

    public /* synthetic */ k0(ag0 ag0Var, Integer[] numArr, int i9, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 10;
        this.d = ag0Var;
        this.e = numArr;
        this.c = i9;
        this.b = tLObject;
        this.f = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ k0(is isVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i9) {
        this.a = 11;
        this.d = isVar;
        this.e = fileLocation;
        this.f = inputFile;
        this.b = tLObject;
        this.h = fileLocation2;
        this.c = i9;
    }

    public /* synthetic */ k0(a70 a70Var, j4 j4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9, f1 f1Var) {
        this.a = 6;
        this.d = a70Var;
        this.e = j4Var;
        this.f = tL_error;
        this.b = tLObject;
        this.c = i9;
        this.h = f1Var;
    }

    public /* synthetic */ k0(y0 y0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i9, v0 v0Var) {
        this.a = 14;
        this.d = y0Var;
        this.e = str;
        this.b = tLObject;
        this.f = tL_error;
        this.c = i9;
        this.h = v0Var;
    }
}
