package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class og0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ og0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(10:14|15|16|17|(1:19)(2:28|(1:30)(6:(1:65)(6:36|(1:46)|47|(2:49|(1:51)(2:52|(1:54)))|55|(2:57|(1:59))(2:61|(1:64)))|60|21|22|23|24))|20|21|22|23|24)|68|17|(0)(0)|20|21|22|23|24) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    @Override // org.telegram.messenger.Utilities.Callback3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        char c10;
        final String str;
        final boolean z10;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i12 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i12) {
            case 0:
                vg0 vg0Var = (vg0) notificationCenterDelegate;
                Long l4 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.d90 d90Var = vg0Var.n;
                wg0 wg0Var = vg0Var.V;
                vg0Var.U = null;
                vg0Var.T = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l4.longValue() != 0 && (wg0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            UserConfig userConfig = UserConfig.getInstance(i13);
                            if (userConfig.isClientActivated() && userConfig.getClientUserId() == l4.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == wg0Var.E) {
                                if (UserConfig.selectedAccount != i13) {
                                    ((LaunchActivity) wg0Var.getParentActivity()).K0(i13);
                                }
                                wg0Var.finishFragment();
                                wg0Var.k1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            if (BuildVars.DEBUG_VERSION) {
                                org.telegram.ui.Components.yc.a0(wg0Var).c0(str2, false);
                                break;
                            }
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new pg0(vg0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        wg0Var.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (d90Var != null && "CANCELLED".equals(str2)) {
                    d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new lg0(vg0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) notificationCenterDelegate;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) photoViewer.y, photoViewer.v2, false);
                    f3Var.setBackgroundColor(-14933463);
                    f3Var.fixNavigationBar(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i11 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            str = url.substring(7);
                            z10 = false;
                        } else if (!url.startsWith("tel:")) {
                            if (i11 < 0 || (messageObject = photoViewer.T4) == null || messageObject.scheduled) {
                                c10 = 1;
                            } else {
                                if (!messageObject.isVideo() && !photoViewer.T4.isRoundVideo() && !photoViewer.T4.isVoice() && !photoViewer.T4.isMusic() && (messageObject2 = photoViewer.T4.replyMessageObject) != null) {
                                    messageObject = messageObject2;
                                }
                                long dialogId = messageObject.getDialogId();
                                int id2 = messageObject.getId();
                                TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        dialogId = MessageObject.getPeerId(peer);
                                        id2 = messageObject.messageOwner.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            dialogId = MessageObject.getPeerId(peer2);
                                            id2 = messageObject.messageOwner.fwd_from.channel_post;
                                        }
                                    }
                                }
                                c10 = 1;
                                if (DialogObject.isChatDialog(dialogId)) {
                                    String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.T).getChat(Long.valueOf(-dialogId)));
                                    if (publicUsername != null) {
                                        url = "https://t.me/" + publicUsername + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i11);
                                    }
                                } else {
                                    TLRPC.User user = MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(dialogId));
                                    String publicUsername2 = UserObject.getPublicUsername(user);
                                    if (user != null && publicUsername2 != null) {
                                        url = "https://t.me/" + publicUsername2 + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i11);
                                    }
                                }
                            }
                            str = url;
                            z10 = false;
                            f3Var.title = str;
                            f3Var.bigTitle = false;
                            String string = LocaleController.getString(R.string.Open);
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            CharSequence[] charSequenceArr = new CharSequence[2];
                            charSequenceArr[0] = string;
                            charSequenceArr[c10] = string2;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.rr0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    Drawable[] drawableArr2 = PhotoViewer.T8;
                                    PhotoViewer photoViewer2 = PhotoViewer.this;
                                    if (i14 == 0) {
                                        photoViewer2.W1(clickableSpan, textView);
                                        return;
                                    }
                                    if (i14 == 1) {
                                        String str3 = str;
                                        AndroidUtilities.addToClipboard(str3);
                                        String string3 = z10 ? LocaleController.getString("PhoneCopied", R.string.PhoneCopied) : str3.startsWith("#") ? LocaleController.getString("HashtagCopied", R.string.HashtagCopied) : str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                        if (AndroidUtilities.shouldShowClipboardToast()) {
                                            new org.telegram.ui.Components.yc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, string3).j();
                                        }
                                    }
                                }
                            };
                            f3Var.items = charSequenceArr;
                            f3Var.onClickListener = onClickListener;
                            f3Var.setOnHideListener(new r5(runnable, 12));
                            f3Var.scrollNavBar = true;
                            f3Var.show();
                            photoViewer.e0.performHapticFeedback(0, 2);
                            f3Var.setItemColor(0, -1, -1);
                            f3Var.setItemColor(1, -1, -1);
                            f3Var.setBackgroundColor(-14933463);
                            f3Var.setTitleColor(-7697782);
                            f3Var.setCalcMandatoryInsets(true);
                            AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -14933463, false);
                            AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
                            f3Var.scrollNavBar = true;
                            break;
                        } else {
                            str = url.substring(4);
                            z10 = true;
                        }
                        c10 = 1;
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        String string3 = LocaleController.getString(R.string.Open);
                        String string22 = LocaleController.getString(R.string.CopyLink);
                        CharSequence[] charSequenceArr2 = new CharSequence[2];
                        charSequenceArr2[0] = string3;
                        charSequenceArr2[c10] = string22;
                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.rr0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                Drawable[] drawableArr2 = PhotoViewer.T8;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i14 == 0) {
                                    photoViewer2.W1(clickableSpan, textView);
                                    return;
                                }
                                if (i14 == 1) {
                                    String str3 = str;
                                    AndroidUtilities.addToClipboard(str3);
                                    String string32 = z10 ? LocaleController.getString("PhoneCopied", R.string.PhoneCopied) : str3.startsWith("#") ? LocaleController.getString("HashtagCopied", R.string.HashtagCopied) : str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                    if (AndroidUtilities.shouldShowClipboardToast()) {
                                        new org.telegram.ui.Components.yc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, string32).j();
                                    }
                                }
                            }
                        };
                        f3Var.items = charSequenceArr2;
                        f3Var.onClickListener = onClickListener2;
                        f3Var.setOnHideListener(new r5(runnable, 12));
                        f3Var.scrollNavBar = true;
                        f3Var.show();
                        photoViewer.e0.performHapticFeedback(0, 2);
                        f3Var.setItemColor(0, -1, -1);
                        f3Var.setItemColor(1, -1, -1);
                        f3Var.setBackgroundColor(-14933463);
                        f3Var.setTitleColor(-7697782);
                        f3Var.setCalcMandatoryInsets(true);
                        AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -14933463, false);
                        AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
                        f3Var.scrollNavBar = true;
                    }
                    i11 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    c10 = 1;
                    f3Var.title = str;
                    f3Var.bigTitle = false;
                    String string32 = LocaleController.getString(R.string.Open);
                    String string222 = LocaleController.getString(R.string.CopyLink);
                    CharSequence[] charSequenceArr22 = new CharSequence[2];
                    charSequenceArr22[0] = string32;
                    charSequenceArr22[c10] = string222;
                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.rr0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            Drawable[] drawableArr2 = PhotoViewer.T8;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i14 == 0) {
                                photoViewer2.W1(clickableSpan, textView);
                                return;
                            }
                            if (i14 == 1) {
                                String str3 = str;
                                AndroidUtilities.addToClipboard(str3);
                                String string322 = z10 ? LocaleController.getString("PhoneCopied", R.string.PhoneCopied) : str3.startsWith("#") ? LocaleController.getString("HashtagCopied", R.string.HashtagCopied) : str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                if (AndroidUtilities.shouldShowClipboardToast()) {
                                    new org.telegram.ui.Components.yc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, string322).j();
                                }
                            }
                        }
                    };
                    f3Var.items = charSequenceArr22;
                    f3Var.onClickListener = onClickListener22;
                    f3Var.setOnHideListener(new r5(runnable, 12));
                    f3Var.scrollNavBar = true;
                    f3Var.show();
                    photoViewer.e0.performHapticFeedback(0, 2);
                    f3Var.setItemColor(0, -1, -1);
                    f3Var.setItemColor(1, -1, -1);
                    f3Var.setBackgroundColor(-14933463);
                    f3Var.setTitleColor(-7697782);
                    f3Var.setCalcMandatoryInsets(true);
                    AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -14933463, false);
                    AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
                    f3Var.scrollNavBar = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) notificationCenterDelegate).getClass();
                break;
        }
    }
}
