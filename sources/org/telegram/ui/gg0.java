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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ gg0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
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
        char c3;
        final String str;
        final boolean z4;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i12 = this.a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.b;
        switch (i12) {
            case 0:
                ng0 ng0Var = (ng0) notificationCenterDelegate;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.g90 g90Var = ng0Var.n;
                og0 og0Var = ng0Var.S;
                ng0Var.R = null;
                ng0Var.Q = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l10.longValue() != 0 && (og0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            UserConfig userConfig = UserConfig.getInstance(i13);
                            if (userConfig.isClientActivated() && userConfig.getClientUserId() == l10.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == og0Var.B) {
                                if (UserConfig.selectedAccount != i13) {
                                    ((LaunchActivity) og0Var.getParentActivity()).K0(i13);
                                }
                                og0Var.finishFragment();
                                og0Var.k1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            if (BuildVars.DEBUG_VERSION) {
                                org.telegram.ui.Components.qc.a0(og0Var).c0(str2, false);
                                break;
                            }
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new hg0(ng0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        og0Var.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (g90Var != null && "CANCELLED".equals(str2)) {
                    g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new dg0(ng0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) notificationCenterDelegate;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(photoViewer.y, photoViewer.s2, false, false);
                    h3Var.setBackgroundColor(-14933463);
                    h3Var.fixNavigationBar(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i11 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            str = url.substring(7);
                            z4 = false;
                        } else if (!url.startsWith("tel:")) {
                            if (i11 < 0 || (messageObject = photoViewer.Q4) == null || messageObject.scheduled) {
                                c3 = 1;
                            } else {
                                if (!messageObject.isVideo() && !photoViewer.Q4.isRoundVideo() && !photoViewer.Q4.isVoice() && !photoViewer.Q4.isMusic() && (messageObject2 = photoViewer.Q4.replyMessageObject) != null) {
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
                                c3 = 1;
                                if (DialogObject.isChatDialog(dialogId)) {
                                    String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.Q).getChat(Long.valueOf(-dialogId)));
                                    if (publicUsername != null) {
                                        url = "https://t.me/" + publicUsername + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i11);
                                    }
                                } else {
                                    TLRPC.User user = MessagesController.getInstance(photoViewer.Q).getUser(Long.valueOf(dialogId));
                                    String publicUsername2 = UserObject.getPublicUsername(user);
                                    if (user != null && publicUsername2 != null) {
                                        url = "https://t.me/" + publicUsername2 + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i11);
                                    }
                                }
                            }
                            str = url;
                            z4 = false;
                            h3Var.title = str;
                            h3Var.bigTitle = false;
                            String string = LocaleController.getString(R.string.Open);
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            CharSequence[] charSequenceArr = new CharSequence[2];
                            charSequenceArr[0] = string;
                            charSequenceArr[c3] = string2;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.yq0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    Drawable[] drawableArr2 = PhotoViewer.Q8;
                                    PhotoViewer photoViewer2 = PhotoViewer.this;
                                    if (i14 == 0) {
                                        photoViewer2.W1(clickableSpan, textView);
                                        return;
                                    }
                                    if (i14 == 1) {
                                        String str3 = str;
                                        AndroidUtilities.addToClipboard(str3);
                                        String string3 = z4 ? LocaleController.getString("PhoneCopied", R.string.PhoneCopied) : str3.startsWith("#") ? LocaleController.getString("HashtagCopied", R.string.HashtagCopied) : str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                        if (AndroidUtilities.shouldShowClipboardToast()) {
                                            new org.telegram.ui.Components.qc(photoViewer2.b0, photoViewer2.s2).Q(R.raw.voip_invite, 36, string3).j();
                                        }
                                    }
                                }
                            };
                            h3Var.items = charSequenceArr;
                            h3Var.onClickListener = onClickListener;
                            h3Var.setOnHideListener(new v5(runnable, 12));
                            h3Var.scrollNavBar = true;
                            h3Var.show();
                            photoViewer.b0.performHapticFeedback(0, 2);
                            h3Var.setItemColor(0, -1, -1);
                            h3Var.setItemColor(1, -1, -1);
                            h3Var.setBackgroundColor(-14933463);
                            h3Var.setTitleColor(-7697782);
                            h3Var.setCalcMandatoryInsets(true);
                            AndroidUtilities.setNavigationBarColor((Dialog) h3Var, -14933463, false);
                            AndroidUtilities.setLightNavigationBar((Dialog) h3Var, false);
                            h3Var.scrollNavBar = true;
                            break;
                        } else {
                            str = url.substring(4);
                            z4 = true;
                        }
                        c3 = 1;
                        h3Var.title = str;
                        h3Var.bigTitle = false;
                        String string3 = LocaleController.getString(R.string.Open);
                        String string22 = LocaleController.getString(R.string.CopyLink);
                        CharSequence[] charSequenceArr2 = new CharSequence[2];
                        charSequenceArr2[0] = string3;
                        charSequenceArr2[c3] = string22;
                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.yq0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) {
                                Drawable[] drawableArr2 = PhotoViewer.Q8;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i14 == 0) {
                                    photoViewer2.W1(clickableSpan, textView);
                                    return;
                                }
                                if (i14 == 1) {
                                    String str3 = str;
                                    AndroidUtilities.addToClipboard(str3);
                                    String string32 = z4 ? LocaleController.getString("PhoneCopied", R.string.PhoneCopied) : str3.startsWith("#") ? LocaleController.getString("HashtagCopied", R.string.HashtagCopied) : str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                    if (AndroidUtilities.shouldShowClipboardToast()) {
                                        new org.telegram.ui.Components.qc(photoViewer2.b0, photoViewer2.s2).Q(R.raw.voip_invite, 36, string32).j();
                                    }
                                }
                            }
                        };
                        h3Var.items = charSequenceArr2;
                        h3Var.onClickListener = onClickListener2;
                        h3Var.setOnHideListener(new v5(runnable, 12));
                        h3Var.scrollNavBar = true;
                        h3Var.show();
                        photoViewer.b0.performHapticFeedback(0, 2);
                        h3Var.setItemColor(0, -1, -1);
                        h3Var.setItemColor(1, -1, -1);
                        h3Var.setBackgroundColor(-14933463);
                        h3Var.setTitleColor(-7697782);
                        h3Var.setCalcMandatoryInsets(true);
                        AndroidUtilities.setNavigationBarColor((Dialog) h3Var, -14933463, false);
                        AndroidUtilities.setLightNavigationBar((Dialog) h3Var, false);
                        h3Var.scrollNavBar = true;
                    }
                    i11 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    c3 = 1;
                    h3Var.title = str;
                    h3Var.bigTitle = false;
                    String string32 = LocaleController.getString(R.string.Open);
                    String string222 = LocaleController.getString(R.string.CopyLink);
                    CharSequence[] charSequenceArr22 = new CharSequence[2];
                    charSequenceArr22[0] = string32;
                    charSequenceArr22[c3] = string222;
                    DialogInterface.OnClickListener onClickListener22 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.yq0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            Drawable[] drawableArr2 = PhotoViewer.Q8;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i14 == 0) {
                                photoViewer2.W1(clickableSpan, textView);
                                return;
                            }
                            if (i14 == 1) {
                                String str3 = str;
                                AndroidUtilities.addToClipboard(str3);
                                String string322 = z4 ? LocaleController.getString("PhoneCopied", R.string.PhoneCopied) : str3.startsWith("#") ? LocaleController.getString("HashtagCopied", R.string.HashtagCopied) : str3.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                if (AndroidUtilities.shouldShowClipboardToast()) {
                                    new org.telegram.ui.Components.qc(photoViewer2.b0, photoViewer2.s2).Q(R.raw.voip_invite, 36, string322).j();
                                }
                            }
                        }
                    };
                    h3Var.items = charSequenceArr22;
                    h3Var.onClickListener = onClickListener22;
                    h3Var.setOnHideListener(new v5(runnable, 12));
                    h3Var.scrollNavBar = true;
                    h3Var.show();
                    photoViewer.b0.performHapticFeedback(0, 2);
                    h3Var.setItemColor(0, -1, -1);
                    h3Var.setItemColor(1, -1, -1);
                    h3Var.setBackgroundColor(-14933463);
                    h3Var.setTitleColor(-7697782);
                    h3Var.setCalcMandatoryInsets(true);
                    AndroidUtilities.setNavigationBarColor((Dialog) h3Var, -14933463, false);
                    AndroidUtilities.setLightNavigationBar((Dialog) h3Var, false);
                    h3Var.scrollNavBar = true;
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
