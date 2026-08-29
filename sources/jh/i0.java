package jh;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(int i10, org.telegram.ui.ActionBar.o2 o2Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = 0;
        this.b = i10;
        this.c = o2Var;
        this.d = cVar;
        this.e = c2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                ye.c cVar = (ye.c) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.b).processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(o2Var, tL_error, cVar, c2Var, 6));
                break;
            case 1:
                org.telegram.ui.g1 g1Var = (org.telegram.ui.g1) this.c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = this.b;
                if (tL_error2 != null) {
                    AndroidUtilities.runOnUIThread(new ag.z1(g1Var, i10, tL_error2, tL_channels_joinChannel, 8));
                    break;
                } else {
                    boolean z11 = false;
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i11 = 0;
                        while (true) {
                            if (i11 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i11);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z10 = true;
                                } else {
                                    i11++;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        MessagesController.getInstance(i10).processUpdates(updates2, false);
                        z11 = z10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new ag.v0(i10, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, 24));
                        z11 = true;
                    }
                    if (!z11) {
                        MessagesController.getInstance(i10).generateJoinMessage(chat.id, true);
                    }
                    AndroidUtilities.runOnUIThread(new it0(g1Var, 5));
                    AndroidUtilities.runOnUIThread(new bg.f(i10, chat, 16), 1000L);
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    long j10 = chat.id;
                    messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                    break;
                }
            case 2:
                org.telegram.ui.Components.g0.Z((org.telegram.ui.Components.g0) this.c, (org.telegram.ui.ActionBar.h5) this.d, this.b, (TLRPC.TL_messages_composeMessageWithAI) this.e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                org.telegram.ui.Components.g0.V((org.telegram.ui.Components.g0) this.c, (org.telegram.ui.ActionBar.h5) this.d, this.b, (TLRPC.TL_messages_composeRichMessageWithAI) this.e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList.set(this.b, str);
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == null) {
                                break;
                            }
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList), Boolean.FALSE);
                        break;
                    } else {
                        zArr[0] = true;
                        callback2.run(null, bool);
                        break;
                    }
                }
                break;
            case 5:
                nh.d dVar = (nh.d) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                dVar.setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.a.setOnDismissListener(new org.telegram.ui.s5(f3Var, 10));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            if (str2 != null) {
                                new tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str2, false);
                                break;
                            } else if (passkey != null) {
                                int i13 = this.b;
                                MessagesController.getInstance(i13).removeSuggestion(0L, "SETUP_PASSKEY");
                                if (U instanceof PasskeysActivity) {
                                    f3Var.dismiss();
                                    ((PasskeysActivity) U).Y(passkey);
                                    break;
                                } else if (U instanceof PrivacySettingsActivity) {
                                    f3Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                    ArrayList arrayList2 = privacySettingsActivity.e;
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(passkey);
                                    privacySettingsActivity.A0(true);
                                    U.presentFragment(new PasskeysActivity(arrayList2));
                                    break;
                                } else {
                                    ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new org.telegram.ui.l6(f3Var, passkey, str2, 3));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                int[] iArr = (int[]) this.c;
                ph.w0 w0Var = (ph.w0) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.e;
                iArr[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j11 = webPage.id;
                                int i14 = this.b;
                                ph.x0 x0Var = new ph.x0(j11, notificationCenterDelegateArr, i14, w0Var);
                                notificationCenterDelegateArr[0] = x0Var;
                                NotificationCenter.getInstance(i14).addObserver(x0Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                break;
                            } else {
                                w0Var.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            w0Var.run(null);
                            break;
                        }
                    }
                }
                w0Var.run(null);
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    c2VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    tc.a0(o2Var2).d0(tL_error3, false);
                    break;
                } else if (arrayList3 != null) {
                    if (arrayList3.isEmpty()) {
                        j7.l1.v(R.string.CommunityNoChatsToAdd, tc.a0(o2Var2), R.raw.info, 36);
                        break;
                    } else if (arrayList3.isEmpty()) {
                        tc.a0(o2Var2).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        o2Var2.showDialog(new qh.i0(o2Var2, 0L, arrayList3, new bg.n3(o2Var2, chat2, this.b, 5)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ i0(org.telegram.ui.g1 g1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.a = 1;
        this.c = g1Var;
        this.b = i10;
        this.d = tL_channels_joinChannel;
        this.e = chat;
    }

    public /* synthetic */ i0(org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Chat chat) {
        this.a = 7;
        this.d = c2VarArr;
        this.c = o2Var;
        this.b = i10;
        this.e = chat;
    }
}
