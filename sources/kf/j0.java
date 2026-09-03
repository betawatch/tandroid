package kf;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k7.y5;
import lh.t7;
import nh.b8;
import nh.d8;
import nh.j7;
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
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.bj;
import org.telegram.ui.cl0;
import org.telegram.ui.g1;
import org.telegram.ui.i71;
import org.telegram.ui.ji0;
import org.telegram.ui.l3;
import org.telegram.ui.l4;
import org.telegram.ui.n9;
import org.telegram.ui.p70;
import org.telegram.ui.ps;
import org.telegram.ui.q60;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.y0;
import org.telegram.ui.xk0;
import org.telegram.ui.xw0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ j0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                bj bjVar = (bj) this.f;
                e5 e5Var = (e5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i10 = this.c;
                    MessagesController.getInstance(i10).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (closestPhotoSizeWithSize == null || photoSize2 == null || photoSize2.location == null) {
                            photoSize = closestPhotoSizeWithSize2;
                        } else {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize2.location.volume_id);
                            sb.append("_");
                            String m9 = android.support.v4.media.a.m(photoSize2.location.local_id, "@50_50", sb);
                            StringBuilder sb2 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb2.append(closestPhotoSizeWithSize.location.volume_id);
                            sb2.append("_");
                            ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(i10, user, 1), false);
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(photoSize, true));
                        }
                        l0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i10).setCurrentUser(user);
                        UserConfig.getInstance(i10).saveConfig(true);
                        bjVar.run();
                        qc.a0(e5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ah.b(i10, e5Var, 6)), null).j();
                        break;
                    }
                }
                break;
            case 1:
                ph.d dVar = (ph.d) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                g3[] g3VarArr = (g3[]) this.e;
                f6 f6Var = (f6) this.f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new qc(g3VarArr[0].topBulletinContainer, f6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        break;
                    } else {
                        final long j10 = tL_starsSubscriptionPricing.amount;
                        final int i11 = this.c;
                        t7.y(i11, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: lh.z8
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Long l10 = (Long) obj2;
                                if (!"paid".equals((String) obj) || l10.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new a9(l10, i11, j10, 0));
                            }
                        });
                        break;
                    }
                } else {
                    new qc(g3VarArr[0].topBulletinContainer, f6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                    break;
                }
            case 2:
                d8.a((d8) this.d, (TLObject) this.b, this.e, (ArrayList) this.f, (boolean[]) this.h, this.c);
                break;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.c, (TLObject) this.b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f, (HashSet) this.h);
                break;
            case 4:
                ((LocaleController) this.b).lambda$saveRemoteLocaleStrings$10(this.c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f, (Runnable) this.h);
                break;
            case 5:
                ((MediaDataController) this.b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.e, (Context) this.f, (p2) this.h, this.c);
                break;
            case 6:
                p70 p70Var = (p70) this.d;
                l4 l4Var = (l4) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject3 = (TLObject) this.b;
                g1 g1Var = (g1) this.h;
                p70Var.r = false;
                if (!l4Var.e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            g1Var.a(4, false);
                            break;
                        } else {
                            int i12 = this.c;
                            MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            p70Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                g1Var.a(4, false);
                                break;
                            } else {
                                g1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        g1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 7:
                TLObject tLObject4 = (TLObject) this.b;
                d2 d2Var = (d2) this.d;
                Context context = (Context) this.e;
                f6 f6Var2 = (f6) this.f;
                q60 q60Var = (q60) this.h;
                boolean z4 = tLObject4 instanceof TLRPC.Updates;
                int i13 = this.c;
                int i14 = 0;
                if (z4) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    MessagesController.getInstance(i13).putUsers(updates.users, false);
                    MessagesController.getInstance(i13).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i14 < size) {
                        Object obj = findUpdatesAndRemove.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    d2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        n9.o0(context, i13, tL_inputGroupCall, groupCall.invite_link, f6Var2, true, true);
                        AndroidUtilities.runOnUIThread(q60Var);
                        break;
                    }
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    MessagesController.getInstance(i13).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i13).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i13).sendRequest(exportgroupcallinvite, new li(d2Var, context, i13, exportgroupcallinvite, f6Var2, q60Var));
                    break;
                } else {
                    d2Var.dismiss();
                    AndroidUtilities.runOnUIThread(q60Var);
                    break;
                }
                break;
            case 8:
                Context context2 = (Context) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                new i71(context2, chat2, user2, new ah.b(this.c, booleanCallback, 24), (f6) this.h).show();
                break;
            case 9:
                o9.a((o9) this.b, (Runnable[]) this.d, (Bitmap) this.e, (a60) this.f, this.c, (y5[]) this.h);
                break;
            case 10:
                wg0.m((wg0) this.d, (Integer[]) this.e, this.c, (TLObject) this.b, (ArrayList) this.f, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 11:
                ps.Y((ps) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f, (TLObject) this.b, (TLRPC.FileLocation) this.h, this.c);
                break;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.b;
                String[] strArr = (String[]) this.d;
                Context context3 = (Context) this.e;
                xk0 xk0Var = (xk0) this.f;
                p2 p2Var = (p2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    xk0Var.run();
                    break;
                } else {
                    zk0.c(context3, this.c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new vk(20, strArr, xk0Var), true, new cg.n0(21), p2Var.getResourceProvider());
                    break;
                }
            case 13:
                p2.h hVar = (p2.h) this.b;
                p2 p2Var2 = (p2) this.d;
                List<Purchase> list = (List) this.e;
                p2.e eVar = (p2.e) this.f;
                xw0 xw0Var = (xw0) this.h;
                if (hVar.a == 0) {
                    ji0 ji0Var = new ji0(1, p2Var2);
                    int i15 = this.c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i15).isPremium()) {
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
                                ConnectionsManager.getInstance(i15).sendRequest(tL_payments_assignPlayMarketTransaction, new b8(i15, ji0Var, p2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new l3(ji0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_payments_canPurchaseStore, new li(p2Var2, tL_inputStorePaymentPremiumSubscription2, xw0Var, eVar, i15, tL_payments_canPurchaseStore, 5));
                    break;
                }
                break;
            default:
                c1 c1Var = (c1) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                y0 y0Var = (y0) this.e;
                j7 j7Var = (j7) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z10 = tLObject5 instanceof TLRPC.TL_boolTrue;
                int i16 = this.c;
                if (z10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        c1.x(i16, y0Var, j7Var, "write_access_requested", jSONObject);
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
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.web.m(1, c1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new cl0(11));
                    c1Var.Y(3, alertDialog$Builder.a, new org.telegram.ui.web.x(strArr2, i16, y0Var, j7Var, 1));
                    break;
                }
        }
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i10;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ j0(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.a = 2;
        this.d = d8Var;
        this.b = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.c = i10;
    }

    public /* synthetic */ j0(ChatObject.Call call, int i10, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.a = 3;
        this.d = call;
        this.c = i10;
        this.b = tLObject;
        this.e = onParticipantsLoad;
        this.f = arrayList;
        this.h = hashSet;
    }

    public /* synthetic */ j0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, p2 p2Var, int i10) {
        this.a = 5;
        this.b = mediaDataController;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = p2Var;
        this.c = i10;
    }

    public /* synthetic */ j0(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, a60 a60Var, int i10, y5[] y5VarArr) {
        this.a = 9;
        this.b = o9Var;
        this.d = runnableArr;
        this.e = bitmap;
        this.f = a60Var;
        this.c = i10;
        this.h = y5VarArr;
    }

    public /* synthetic */ j0(wg0 wg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 10;
        this.d = wg0Var;
        this.e = numArr;
        this.c = i10;
        this.b = tLObject;
        this.f = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ j0(ps psVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.a = 11;
        this.d = psVar;
        this.e = fileLocation;
        this.f = inputFile;
        this.b = tLObject;
        this.h = fileLocation2;
        this.c = i10;
    }

    public /* synthetic */ j0(p70 p70Var, l4 l4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, g1 g1Var) {
        this.a = 6;
        this.d = p70Var;
        this.e = l4Var;
        this.f = tL_error;
        this.b = tLObject;
        this.c = i10;
        this.h = g1Var;
    }

    public /* synthetic */ j0(c1 c1Var, TLObject tLObject, int i10, y0 y0Var, j7 j7Var, TLRPC.TL_error tL_error) {
        this.a = 14;
        this.d = c1Var;
        this.b = tLObject;
        this.c = i10;
        this.e = y0Var;
        this.f = j7Var;
        this.h = tL_error;
    }

    public /* synthetic */ j0(ph.d dVar, TLObject tLObject, g3[] g3VarArr, f6 f6Var, int i10, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = 1;
        this.d = dVar;
        this.b = tLObject;
        this.e = g3VarArr;
        this.f = f6Var;
        this.c = i10;
        this.h = tL_messages_checkChatInvite;
    }
}
