package ag;

import a8.yb;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import bi.ca;
import com.android.billingclient.api.Purchase;
import di.q8;
import di.t8;
import di.x7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m4.d1;
import m4.j1;
import m4.n1;
import m4.p1;
import m4.t1;
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
import org.telegram.messenger.mi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x9;
import org.telegram.ui.bh1;
import org.telegram.ui.cl0;
import org.telegram.ui.ei0;
import org.telegram.ui.fl0;
import org.telegram.ui.h3;
import org.telegram.ui.h4;
import org.telegram.ui.j60;
import org.telegram.ui.j70;
import org.telegram.ui.li1;
import org.telegram.ui.ls;
import org.telegram.ui.o9;
import org.telegram.ui.p61;
import org.telegram.ui.xi;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q0(t8 t8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.a = 2;
        this.d = t8Var;
        this.b = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                xi xiVar = (xi) this.f;
                j5 j5Var = (j5) this.h;
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
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a1.g.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i10, user, 1), false);
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(photoSize, true));
                        }
                        s0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i10).setCurrentUser(user);
                        UserConfig.getInstance(i10).saveConfig(true);
                        xiVar.run();
                        wc.b0(j5Var.getLastFragment()).W(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new r0(i10, j5Var, 0)), null).j();
                        break;
                    }
                }
                break;
            case 1:
                fi.d dVar = (fi.d) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                k3[] k3VarArr = (k3[]) this.e;
                u6 u6Var = (u6) this.f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new wc(k3VarArr[0].topBulletinContainer, u6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        break;
                    } else {
                        final long j10 = tL_starsSubscriptionPricing.amount;
                        final int i11 = this.c;
                        ca.y(i11, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: bi.fa
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Long l4 = (Long) obj2;
                                if (!"paid".equals((String) obj) || l4.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new ga(l4, i11, j10, 0));
                            }
                        });
                        break;
                    }
                } else {
                    new wc(k3VarArr[0].topBulletinContainer, u6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                    break;
                }
            case 2:
                t8.a((t8) this.d, (TLObject) this.b, this.e, (ArrayList) this.f, (boolean[]) this.h, this.c);
                break;
            case 3:
                j1 j1Var = (j1) this.b;
                m4.w wVar = (m4.w) this.d;
                p1 p1Var = (p1) this.e;
                String str = p1Var.b;
                m4.f0 f0Var = (m4.f0) this.f;
                int i12 = this.c;
                m4.m mVar = (m4.m) this.h;
                com.google.firebase.messaging.q qVar = j1Var.b;
                if (qVar.u(wVar)) {
                    try {
                        m4.e d = m4.e.d(p1Var);
                        Object obj = d.g;
                        int i13 = d.b;
                        if (d.b()) {
                            p1 p1Var2 = d.a;
                            boolean z10 = true;
                            if (p1Var2 != null) {
                                yb.p(p1Var2.a == 40010);
                                j1Var.H0(mVar, i12, null, 40010, new m4.a1(new d1(d), 1));
                                break;
                            } else {
                                n1 n1Var = f0Var.t;
                                if (i13 == 1) {
                                    if (obj != null) {
                                        r8 = ((Boolean) obj).booleanValue();
                                    } else if (!n1Var.t()) {
                                        r8 = true;
                                    }
                                }
                                if (r8) {
                                    j1Var.M0(wVar, i12);
                                } else if (i13 == 31) {
                                    obj.getClass();
                                    j1Var.O0(wVar, i12, 31, new m4.a1(new m4.s0(3, new di.f(2, (b2.p0) obj, z10), new m4.x0(9)), 1));
                                } else {
                                    j1Var.O0(wVar, i12, i13, j1.Q0(new d1(d)));
                                }
                                qVar.i(wVar);
                                break;
                            }
                        } else {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            j1.P0(f0Var, wVar, i12, new t1(-6));
                            break;
                        }
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                        j1.P0(f0Var, wVar, i12, new t1(-3));
                        return;
                    }
                }
                break;
            case 4:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.c, (TLObject) this.b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f, (HashSet) this.h);
                break;
            case 5:
                ((LocaleController) this.b).lambda$saveRemoteLocaleStrings$10(this.c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f, (Runnable) this.h);
                break;
            case 6:
                ((MediaDataController) this.b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.e, (Context) this.f, (r2) this.h, this.c);
                break;
            case 7:
                j70 j70Var = (j70) this.d;
                h4 h4Var = (h4) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject3 = (TLObject) this.b;
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.h;
                j70Var.r = false;
                if (!h4Var.e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            c1Var.a(4, false);
                            break;
                        } else {
                            int i14 = this.c;
                            MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            j70Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                c1Var.a(4, false);
                                break;
                            } else {
                                c1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        c1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 8:
                TLObject tLObject4 = (TLObject) this.b;
                e2 e2Var = (e2) this.d;
                Context context = (Context) this.e;
                u6 u6Var2 = (u6) this.f;
                j60 j60Var = (j60) this.h;
                boolean z11 = tLObject4 instanceof TLRPC.Updates;
                int i15 = this.c;
                int i16 = 0;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    MessagesController.getInstance(i15).putUsers(updates.users, false);
                    MessagesController.getInstance(i15).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i16 < size) {
                        Object obj2 = findUpdatesAndRemove.get(i16);
                        i16++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    e2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        o9.i0(context, i15, tL_inputGroupCall, groupCall.invite_link, u6Var2, true, true);
                        AndroidUtilities.runOnUIThread(j60Var);
                        break;
                    }
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    MessagesController.getInstance(i15).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i15).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i15).sendRequest(exportgroupcallinvite, new mi(e2Var, context, i15, exportgroupcallinvite, u6Var2, j60Var));
                    break;
                } else {
                    e2Var.dismiss();
                    AndroidUtilities.runOnUIThread(j60Var);
                    break;
                }
                break;
            case 9:
                new p61((Context) this.b, (TLRPC.Chat) this.d, (TLRPC.User) this.e, new h2(this.c, (MessagesStorage.BooleanCallback) this.f, 0), (u6) this.h).show();
                break;
            case 10:
                x9.a((x9) this.b, (Runnable[]) this.d, (Bitmap) this.e, (w60) this.f, this.c, (kb1[]) this.h);
                break;
            case 11:
                oh0.m((oh0) this.d, (Integer[]) this.e, this.c, (TLObject) this.b, (ArrayList) this.f, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 12:
                ls.Y((ls) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f, (TLObject) this.b, (TLRPC.FileLocation) this.h, this.c);
                break;
            case 13:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.b;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.e;
                cl0 cl0Var = (cl0) this.f;
                r2 r2Var = (r2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    cl0Var.run();
                    break;
                } else {
                    fl0.c(context2, this.c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new oy(18, strArr, cl0Var), true, new c(25), r2Var.getResourceProvider());
                    break;
                }
            case 14:
                d5.i iVar = (d5.i) this.b;
                r2 r2Var2 = (r2) this.d;
                List<Purchase> list = (List) this.e;
                d5.g gVar = (d5.g) this.f;
                zw0 zw0Var = (zw0) this.h;
                if (iVar.a == 0) {
                    ei0 ei0Var = new ei0(1, r2Var2);
                    int i17 = this.c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i17).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains(BillingController.PREMIUM_PRODUCT_ID)) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (gVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i17).sendRequest(tL_payments_assignPlayMarketTransaction, new q8(i17, ei0Var, r2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new h3(ei0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (gVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_payments_canPurchaseStore, new mi(r2Var2, tL_inputStorePaymentPremiumSubscription2, zw0Var, gVar, i17, tL_payments_canPurchaseStore, 5));
                    break;
                }
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.e;
                x7 x7Var = (x7) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z12 = tLObject5 instanceof TLRPC.TL_boolTrue;
                int i18 = this.c;
                if (z12) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.a1.w(i18, x0Var, x7Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                } else if (tL_error2 != null) {
                    a1Var.Y(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a1Var.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new bh1(7, a1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new li1(2));
                    a1Var.X(3, alertDialog$Builder.a, new org.telegram.ui.web.x(strArr2, i18, x0Var, x7Var, 1));
                    break;
                }
        }
    }

    public /* synthetic */ q0(fi.d dVar, TLObject tLObject, k3[] k3VarArr, u6 u6Var, int i10, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = 1;
        this.d = dVar;
        this.b = tLObject;
        this.e = k3VarArr;
        this.f = u6Var;
        this.c = i10;
        this.h = tL_messages_checkChatInvite;
    }

    public /* synthetic */ q0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i10;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = i10;
        this.h = obj5;
    }

    public /* synthetic */ q0(ChatObject.Call call, int i10, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.a = 4;
        this.d = call;
        this.c = i10;
        this.b = tLObject;
        this.e = onParticipantsLoad;
        this.f = arrayList;
        this.h = hashSet;
    }

    public /* synthetic */ q0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, r2 r2Var, int i10) {
        this.a = 6;
        this.b = mediaDataController;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = r2Var;
        this.c = i10;
    }

    public /* synthetic */ q0(oh0 oh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 11;
        this.d = oh0Var;
        this.e = numArr;
        this.c = i10;
        this.b = tLObject;
        this.f = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ q0(ls lsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.a = 12;
        this.d = lsVar;
        this.e = fileLocation;
        this.f = inputFile;
        this.b = tLObject;
        this.h = fileLocation2;
        this.c = i10;
    }

    public /* synthetic */ q0(j70 j70Var, h4 h4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.c1 c1Var) {
        this.a = 7;
        this.d = j70Var;
        this.e = h4Var;
        this.f = tL_error;
        this.b = tLObject;
        this.c = i10;
        this.h = c1Var;
    }

    public /* synthetic */ q0(org.telegram.ui.web.a1 a1Var, TLObject tLObject, int i10, org.telegram.ui.web.x0 x0Var, x7 x7Var, TLRPC.TL_error tL_error) {
        this.a = 15;
        this.d = a1Var;
        this.b = tLObject;
        this.c = i10;
        this.e = x0Var;
        this.f = x7Var;
        this.h = tL_error;
    }
}
