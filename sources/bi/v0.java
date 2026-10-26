package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.vj0;
import org.telegram.ui.xj0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v0(int i10, org.telegram.ui.ActionBar.r2 r2Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = 0;
        this.b = i10;
        this.c = r2Var;
        this.d = cVar;
        this.e = e2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11 = this.a;
        int i12 = 3;
        int i13 = this.b;
        int i14 = 0;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj5;
                qf.c cVar = (qf.c) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(i13).lambda$processUpdates$379(updates, false);
                }
                AndroidUtilities.runOnUIThread(new ai.e0(r2Var, tL_error, cVar, e2Var, 4));
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj3;
                Long l4 = (Long) obj;
                String str = (String) obj2;
                if (l4 != null && l4.longValue() != 0) {
                    int i15 = this.b;
                    GiftAuctionController.getInstance(i15).requestAuctionUpgrades(l4.longValue(), new y4(zArr, context, u6Var, i15, str, 0));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
                break;
            case 2:
                hi.j1 j1Var = (hi.j1) obj4;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) obj3;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j10 = webPage.id;
                                int i16 = this.b;
                                hi.l1 l1Var = new hi.l1(j10, notificationCenterDelegateArr, i16, j1Var);
                                notificationCenterDelegateArr[0] = l1Var;
                                NotificationCenter.getInstance(i16).addObserver(l1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                break;
                            } else {
                                j1Var.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            j1Var.run(null);
                            break;
                        }
                    }
                }
                j1Var.run(null);
                break;
            case 3:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj4;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr[0];
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    e2VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    org.telegram.ui.Components.wc.b0(r2Var2).g0(tL_error2, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.t.q(R.string.CommunityNoChatsToAdd, org.telegram.ui.Components.wc.b0(r2Var2), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        org.telegram.ui.Components.wc.b0(r2Var2).R(R.raw.info, 36, "").j();
                        break;
                    } else {
                        r2Var2.showDialog(new ii.j0(r2Var2, 0L, arrayList, new hi.p4(r2Var2, chat, i13, 1)));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i17 = this.b;
                if (tL_error3 != null) {
                    AndroidUtilities.runOnUIThread(new ai.h1(c1Var, i17, tL_error3, tL_channels_joinChannel, 13));
                    break;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i18 = 0;
                        while (true) {
                            if (i18 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i18);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    i10 = 1;
                                } else {
                                    i18++;
                                }
                            } else {
                                i10 = 0;
                            }
                        }
                        MessagesController.getInstance(i17).lambda$processUpdates$379(updates2, false);
                        i14 = i10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new ai.h0(i17, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 29));
                        i14 = 1;
                    }
                    if (i14 == 0) {
                        MessagesController.getInstance(i17).generateJoinMessage(chat2.id, true);
                    }
                    AndroidUtilities.runOnUIThread(new zt0(c1Var, 5));
                    AndroidUtilities.runOnUIThread(new ag.r0(i17, chat2, 18), 1000L);
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i17);
                    long j11 = chat2.id;
                    messagesStorage.updateDialogsWithDeletedMessages(-j11, j11, new ArrayList<>(), null);
                    break;
                }
            case 5:
                org.telegram.ui.Components.e0.Z((org.telegram.ui.Components.e0) obj5, (org.telegram.ui.ActionBar.b6) obj4, this.b, (TLRPC.TL_messages_composeMessageWithAI) obj3, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                org.telegram.ui.Components.e0.V((org.telegram.ui.Components.e0) obj5, (org.telegram.ui.ActionBar.b6) obj4, this.b, (TLRPC.TL_messages_composeRichMessageWithAI) obj3, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList2.set(i13, str2);
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            if (arrayList2.get(i19) == null) {
                                break;
                            }
                        }
                        zArr2[0] = true;
                        callback2.run(TextUtils.join("", arrayList2), Boolean.FALSE);
                        break;
                    } else {
                        zArr2[0] = true;
                        callback2.run(null, bool);
                        break;
                    }
                }
                break;
            case 8:
                xj0 xj0Var = (xj0) obj5;
                vj0 vj0Var = (vj0) obj4;
                Context context2 = (Context) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = xj0Var.c;
                if (i13 != 2 || !TextUtils.isEmpty(xj0Var.N)) {
                    ArrayList arrayList5 = vj0Var.a;
                    int size = arrayList5.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj6 = arrayList5.get(i20);
                        i20++;
                        if (obj6 instanceof MessageObject) {
                            MessageObject messageObject = (MessageObject) obj6;
                            ArrayList arrayList6 = (ArrayList) vj0Var.c.get(messageObject);
                            int i21 = org.telegram.ui.Cells.v3.a;
                            t61 K = t61.K(org.telegram.ui.Cells.v3.class);
                            K.G = messageObject;
                            K.H = arrayList6 == null ? null : new ArrayList(arrayList6);
                            K.d = messageObject.getId();
                            K.B = messageObject.getDialogId();
                            arrayList3.add(K);
                        } else if (!arrayList4.isEmpty()) {
                            HashSet hashSet = xj0Var.d;
                            org.telegram.ui.t3 t3Var = new org.telegram.ui.t3(xj0Var, 14);
                            int i22 = org.telegram.ui.Cells.r3.a;
                            t61 K2 = t61.K(org.telegram.ui.Cells.r3.class);
                            K2.G = new org.telegram.ui.Cells.s3(arrayList4, hashSet, t3Var);
                            arrayList3.add(K2);
                        } else if (xj0Var.r) {
                            arrayList3.add(t61.e(-2, LocaleController.getString(R.string.Retry)));
                        }
                    }
                    if ((i13 == 2 || !vj0Var.m) && (vj0Var.h || !vj0Var.i)) {
                        while (true) {
                            if (i14 < (vj0Var.a.isEmpty() ? 3 : 1)) {
                                arrayList3.add(t61.q((-10) - i14, 39));
                                i14++;
                            }
                        }
                    } else if (vj0Var.k) {
                        if (vj0Var.f == null) {
                            vj0Var.f = i13 == 2 ? xj0Var.g0(context2) : xj0Var.f0(context2, vj0Var.g);
                        }
                        ViewGroup viewGroup = vj0Var.f;
                        t61 t61Var = new t61(-3);
                        t61Var.c = viewGroup;
                        t61Var.z = 0;
                        t61Var.y = 1;
                        arrayList3.add(t61Var);
                    } else if (!vj0Var.h && vj0Var.i && (arrayList3.isEmpty() || (vj0Var.j && i13 != 2))) {
                        if (vj0Var.f == null) {
                            vj0Var.f = i13 == 2 ? xj0Var.g0(context2) : xj0Var.f0(context2, vj0Var.g);
                        }
                        if (arrayList3.isEmpty()) {
                            ViewGroup viewGroup2 = vj0Var.f;
                            t61 t61Var2 = new t61(-3);
                            t61Var2.c = viewGroup2;
                            t61Var2.z = 0;
                            t61Var2.y = 1;
                            arrayList3.add(t61Var2);
                        } else {
                            ((t61) ic.a.g(1, arrayList3)).j = true;
                            ViewGroup viewGroup3 = vj0Var.f;
                            t61 t61Var3 = new t61(-1);
                            t61Var3.c = viewGroup3;
                            t61Var3.z = -2;
                            arrayList3.add(t61Var3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        ((t61) ic.a.g(1, arrayList3)).j = true;
                        break;
                    }
                }
                break;
            case 9:
                Context context3 = (Context) obj4;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((fi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3);
                        String string = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder.a;
                        e2Var3.R = string;
                        e2Var3.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        e2Var3.setOnDismissListener(new org.telegram.ui.u5(k3Var, 9));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            if (str3 != null) {
                                new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0(str3, false);
                                break;
                            } else if (passkey != null) {
                                MessagesController.getInstance(i13).removeSuggestion(0L, "SETUP_PASSKEY");
                                if (U instanceof PasskeysActivity) {
                                    k3Var.dismiss();
                                    ((PasskeysActivity) U).Z(passkey);
                                    break;
                                } else if (U instanceof PrivacySettingsActivity) {
                                    k3Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                    ArrayList arrayList7 = privacySettingsActivity.e;
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(passkey);
                                    privacySettingsActivity.B0(true);
                                    U.presentFragment(new PasskeysActivity(arrayList7));
                                    break;
                                } else {
                                    ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new org.telegram.ui.q6(k3Var, passkey, str3, i12));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j12 = wallettransaction.fee;
                    if (j12 > 0) {
                        textView.setText(org.telegram.ui.Wallet.m5.s0(i13, j12, u6Var2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ v0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ v0(org.telegram.ui.ActionBar.e2[] e2VarArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Chat chat) {
        this.a = 3;
        this.d = e2VarArr;
        this.c = r2Var;
        this.b = i10;
        this.e = chat;
    }
}
