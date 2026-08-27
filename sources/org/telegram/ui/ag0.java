package org.telegram.ui;

import android.app.Dialog;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ ag0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
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
                hg0 hg0Var = (hg0) notificationCenterDelegate;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.p80 p80Var = hg0Var.n;
                ig0 ig0Var = hg0Var.R;
                hg0Var.Q = null;
                hg0Var.P = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l10.longValue() != 0 && (ig0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            UserConfig userConfig = UserConfig.getInstance(i13);
                            if (userConfig.isClientActivated() && userConfig.getClientUserId() == l10.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == ig0Var.A) {
                                if (UserConfig.selectedAccount != i13) {
                                    ((LaunchActivity) ig0Var.getParentActivity()).K0(i13);
                                }
                                ig0Var.finishFragment();
                                ig0Var.k1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            if (BuildVars.DEBUG_VERSION) {
                                org.telegram.ui.Components.mc.a0(ig0Var).c0(str2, false);
                                break;
                            }
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i10 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bg0(hg0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        ig0Var.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (p80Var != null && "CANCELLED".equals(str2)) {
                    p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new xf0(hg0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) notificationCenterDelegate;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(photoViewer.y, photoViewer.r2, false, false);
                    e3Var.setBackgroundColor(-14933463);
                    e3Var.fixNavigationBar(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i11 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            str = url.substring(7);
                            z10 = false;
                        } else if (!url.startsWith("tel:")) {
                            if (i11 < 0 || (messageObject = photoViewer.P4) == null || messageObject.scheduled) {
                                c10 = 1;
                            } else {
                                if (!messageObject.isVideo() && !photoViewer.P4.isRoundVideo() && !photoViewer.P4.isVoice() && !photoViewer.P4.isMusic() && (messageObject2 = photoViewer.P4.replyMessageObject) != null) {
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
                                    String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-dialogId)));
                                    if (publicUsername != null) {
                                        url = "https://t.me/" + publicUsername + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i11);
                                    }
                                } else {
                                    TLRPC.User user = MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(dialogId));
                                    String publicUsername2 = UserObject.getPublicUsername(user);
                                    if (user != null && publicUsername2 != null) {
                                        url = "https://t.me/" + publicUsername2 + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i11);
                                    }
                                }
                            }
                            str = url;
                            z10 = false;
                            e3Var.title = str;
                            e3Var.bigTitle = false;
                            String string = LocaleController.getString(R.string.Open);
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            CharSequence[] charSequenceArr = new CharSequence[2];
                            charSequenceArr[0] = string;
                            charSequenceArr[c10] = string2;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.qq0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    Drawable[] drawableArr2 = PhotoViewer.P8;
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
                                            new org.telegram.ui.Components.mc(photoViewer2.a0, photoViewer2.r2).Q(R.raw.voip_invite, 36, string3).j();
                                        }
                                    }
                                }
                            };
                            e3Var.items = charSequenceArr;
                            e3Var.onClickListener = onClickListener;
                            e3Var.setOnHideListener(new s5(runnable, 12));
                            e3Var.scrollNavBar = true;
                            e3Var.show();
                            photoViewer.a0.performHapticFeedback(0, 2);
                            e3Var.setItemColor(0, -1, -1);
                            e3Var.setItemColor(1, -1, -1);
                            e3Var.setBackgroundColor(-14933463);
                            e3Var.setTitleColor(-7697782);
                            e3Var.setCalcMandatoryInsets(true);
                            AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -14933463, false);
                            AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
                            e3Var.scrollNavBar = true;
                            break;
                        } else {
                            str = url.substring(4);
                            z10 = true;
                        }
                        c10 = 1;
                        e3Var.title = str;
                        e3Var.bigTitle = false;
                        String string3 = LocaleController.getString(R.string.Open);
                        String string22 = LocaleController.getString(R.string.CopyLink);
                        CharSequence[] charSequenceArr2 = new CharSequence[2];
                        charSequenceArr2[0] = string3;
                        charSequenceArr2[c10] = string22;
                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.qq0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                Drawable[] drawableArr2 = PhotoViewer.P8;
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
                                        new org.telegram.ui.Components.mc(photoViewer2.a0, photoViewer2.r2).Q(R.raw.voip_invite, 36, string32).j();
                                    }
                                }
                            }
                        };
                        e3Var.items = charSequenceArr2;
                        e3Var.onClickListener = onClickListener2;
                        e3Var.setOnHideListener(new s5(runnable, 12));
                        e3Var.scrollNavBar = true;
                        e3Var.show();
                        photoViewer.a0.performHapticFeedback(0, 2);
                        e3Var.setItemColor(0, -1, -1);
                        e3Var.setItemColor(1, -1, -1);
                        e3Var.setBackgroundColor(-14933463);
                        e3Var.setTitleColor(-7697782);
                        e3Var.setCalcMandatoryInsets(true);
                        AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -14933463, false);
                        AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
                        e3Var.scrollNavBar = true;
                    }
                    i11 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    c10 = 1;
                    e3Var.title = str;
                    e3Var.bigTitle = false;
                    String string32 = LocaleController.getString(R.string.Open);
                    String string222 = LocaleController.getString(R.string.CopyLink);
                    CharSequence[] charSequenceArr22 = new CharSequence[2];
                    charSequenceArr22[0] = string32;
                    charSequenceArr22[c10] = string222;
                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.qq0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            Drawable[] drawableArr2 = PhotoViewer.P8;
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
                                    new org.telegram.ui.Components.mc(photoViewer2.a0, photoViewer2.r2).Q(R.raw.voip_invite, 36, string322).j();
                                }
                            }
                        }
                    };
                    e3Var.items = charSequenceArr22;
                    e3Var.onClickListener = onClickListener22;
                    e3Var.setOnHideListener(new s5(runnable, 12));
                    e3Var.scrollNavBar = true;
                    e3Var.show();
                    photoViewer.a0.performHapticFeedback(0, 2);
                    e3Var.setItemColor(0, -1, -1);
                    e3Var.setItemColor(1, -1, -1);
                    e3Var.setBackgroundColor(-14933463);
                    e3Var.setTitleColor(-7697782);
                    e3Var.setCalcMandatoryInsets(true);
                    AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -14933463, false);
                    AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
                    e3Var.scrollNavBar = true;
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
