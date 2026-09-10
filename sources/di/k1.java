package di;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.fy0;
import org.telegram.ui.m6;
import org.telegram.ui.mu0;
import org.telegram.ui.s5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k1(int i10, org.telegram.ui.ActionBar.p2 p2Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = 7;
        this.b = i10;
        this.c = p2Var;
        this.d = eVar;
        this.e = d2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.c;
                i1 i1Var = (i1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.e;
                iArr[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage.id;
                                int i10 = this.b;
                                l1 l1Var = new l1(j3, notificationCenterDelegateArr, i10, i1Var);
                                notificationCenterDelegateArr[0] = l1Var;
                                NotificationCenter.getInstance(i10).addObserver(l1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                break;
                            } else {
                                i1Var.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            i1Var.run(null);
                            break;
                        }
                    }
                }
                i1Var.run(null);
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                    d2VarArr[0] = null;
                }
                if (tL_error != null) {
                    wc.a0(p2Var).d0(tL_error, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.a2.o(R.string.CommunityNoChatsToAdd, wc.a0(p2Var), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        wc.a0(p2Var).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        p2Var.showDialog(new ei.k0(p2Var, 0L, arrayList, new v4(p2Var, chat, this.b, 1)));
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = this.b;
                if (tL_error2 != null) {
                    AndroidUtilities.runOnUIThread(new q(e1Var, i11, tL_error2, tL_channels_joinChannel, 9));
                    break;
                } else {
                    boolean z11 = false;
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i12 = 0;
                        while (true) {
                            if (i12 < updates.updates.size()) {
                                TLRPC.Update update = updates.updates.get(i12);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z10 = true;
                                } else {
                                    i12++;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        MessagesController.getInstance(i11).processUpdates(updates, false);
                        z11 = z10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new bi.g3(i11, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 22));
                        z11 = true;
                    }
                    if (!z11) {
                        MessagesController.getInstance(i11).generateJoinMessage(chat2.id, true);
                    }
                    AndroidUtilities.runOnUIThread(new mu0(e1Var, 5));
                    AndroidUtilities.runOnUIThread(new bi.s(i11, chat2, 14), 1000L);
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    long j10 = chat2.id;
                    messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                    break;
                }
            case 3:
                org.telegram.ui.Components.g0.Z((org.telegram.ui.Components.g0) this.c, (l5) this.d, this.b, (TLRPC.TL_messages_composeMessageWithAI) this.e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                org.telegram.ui.Components.g0.V((org.telegram.ui.Components.g0) this.c, (l5) this.d, this.b, (TLRPC.TL_messages_composeRichMessageWithAI) this.e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList2.set(this.b, str);
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (arrayList2.get(i13) == null) {
                                break;
                            }
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList2), Boolean.FALSE);
                        break;
                    } else {
                        zArr[0] = true;
                        callback2.run(null, bool);
                        break;
                    }
                }
                break;
            case 6:
                bi.d dVar = (bi.d) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                dVar.setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.a.setOnDismissListener(new s5(h3Var, 10));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            if (str2 != null) {
                                new wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(str2, false);
                                break;
                            } else if (passkey != null) {
                                int i14 = this.b;
                                MessagesController.getInstance(i14).removeSuggestion(0L, "SETUP_PASSKEY");
                                if (U instanceof PasskeysActivity) {
                                    h3Var.dismiss();
                                    ((PasskeysActivity) U).Y(passkey);
                                    break;
                                } else if (U instanceof PrivacySettingsActivity) {
                                    h3Var.dismiss();
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
                                    ConnectionsManager.getInstance(i14).sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new m6(h3Var, passkey, str2, 3));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                nf.e eVar = (nf.e) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error3 == null) {
                    MessagesController.getInstance(this.b).processUpdates(updates2, false);
                }
                AndroidUtilities.runOnUIThread(new fy0((Object) p2Var2, (TLObject) tL_error3, (Object) eVar, d2Var2, 23));
                break;
        }
    }

    public /* synthetic */ k1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ k1(org.telegram.ui.e1 e1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.a = 2;
        this.c = e1Var;
        this.b = i10;
        this.d = tL_channels_joinChannel;
        this.e = chat;
    }
}
