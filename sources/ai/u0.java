package ai;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ut0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u0(int i10, org.telegram.ui.ActionBar.n2 n2Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = 0;
        this.b = i10;
        this.c = n2Var;
        this.d = cVar;
        this.e = b2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                pf.c cVar = (pf.c) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.b).lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new y0(n2Var, tL_error, cVar, b2Var, 0));
                break;
            case 1:
                boolean[] zArr = (boolean[]) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                Long l4 = (Long) obj;
                String str = (String) obj2;
                if (l4 != null && l4.longValue() != 0) {
                    int i10 = this.b;
                    GiftAuctionController.getInstance(i10).requestAuctionUpgrades(l4.longValue(), new c5(zArr, context, d6Var, i10, str, 0));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                gi.c1 c1Var = (gi.c1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.e;
                iArr[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j10 = webPage.id;
                                int i11 = this.b;
                                gi.e1 e1Var = new gi.e1(j10, notificationCenterDelegateArr, i11, c1Var);
                                notificationCenterDelegateArr[0] = e1Var;
                                NotificationCenter.getInstance(i11).addObserver(e1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                break;
                            } else {
                                c1Var.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            c1Var.run(null);
                            break;
                        }
                    }
                }
                c1Var.run(null);
                break;
            case 3:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    b2VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    org.telegram.ui.Components.xc.a0(n2Var2).f0(tL_error2, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.g0.q(R.string.CommunityNoChatsToAdd, org.telegram.ui.Components.xc.a0(n2Var2), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        org.telegram.ui.Components.xc.a0(n2Var2).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        n2Var2.showDialog(new hi.k0(n2Var2, 0L, arrayList, new gi.g4(n2Var2, chat, this.b, 1)));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i12 = this.b;
                if (tL_error3 != null) {
                    AndroidUtilities.runOnUIThread(new cb(f1Var, i12, tL_error3, tL_channels_joinChannel, 10));
                    break;
                } else {
                    boolean z11 = false;
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i13 = 0;
                        while (true) {
                            if (i13 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i13);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        MessagesController.getInstance(i12).lambda$processUpdates$377(updates2, false);
                        z11 = z10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new ah.o(i12, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 29));
                        z11 = true;
                    }
                    if (!z11) {
                        MessagesController.getInstance(i12).generateJoinMessage(chat2.id, true);
                    }
                    AndroidUtilities.runOnUIThread(new ut0(f1Var, 5));
                    AndroidUtilities.runOnUIThread(new ah.g(i12, chat2, 18), 1000L);
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    long j11 = chat2.id;
                    messagesStorage.updateDialogsWithDeletedMessages(-j11, j11, new ArrayList<>(), null);
                    break;
                }
            case 5:
                org.telegram.ui.Components.e0.a0((org.telegram.ui.Components.e0) this.c, (org.telegram.ui.ActionBar.j5) this.d, this.b, (TLRPC.TL_messages_composeMessageWithAI) this.e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                org.telegram.ui.Components.e0.W((org.telegram.ui.Components.e0) this.c, (org.telegram.ui.ActionBar.j5) this.d, this.b, (TLRPC.TL_messages_composeRichMessageWithAI) this.e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 7:
                boolean[] zArr2 = (boolean[]) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList2.set(this.b, str2);
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) == null) {
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
                ei.d dVar = (ei.d) this.c;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                dVar.setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.a.setOnDismissListener(new org.telegram.ui.w5(f3Var, 9));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            if (str3 != null) {
                                new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0(str3, false);
                                break;
                            } else if (passkey != null) {
                                int i15 = this.b;
                                MessagesController.getInstance(i15).removeSuggestion(0L, "SETUP_PASSKEY");
                                if (U instanceof PasskeysActivity) {
                                    f3Var.dismiss();
                                    ((PasskeysActivity) U).Y(passkey);
                                    break;
                                } else if (U instanceof PrivacySettingsActivity) {
                                    f3Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                    ArrayList arrayList3 = privacySettingsActivity.e;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(passkey);
                                    privacySettingsActivity.A0(true);
                                    U.presentFragment(new PasskeysActivity(arrayList3));
                                    break;
                                } else {
                                    ConnectionsManager.getInstance(i15).sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new org.telegram.ui.p6(f3Var, passkey, str3, 3));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                Runnable[] runnableArr = (Runnable[]) this.c;
                TextView[] textViewArr = (TextView[]) this.d;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                runnableArr[0] = null;
                TextView textView = textViewArr[0];
                if (textView != null && wallettransaction != null) {
                    long j12 = wallettransaction.fee;
                    if (j12 > 0) {
                        textView.setText(org.telegram.ui.Wallet.n5.s0(this.b, j12, d6Var2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ u0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ u0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ u0(org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Chat chat) {
        this.a = 3;
        this.d = b2VarArr;
        this.c = n2Var;
        this.b = i10;
        this.e = chat;
    }
}
