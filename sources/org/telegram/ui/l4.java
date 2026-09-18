package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements org.telegram.ui.ActionBar.a2, oy, v4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, tg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 5:
                zn znVar = (zn) this.b;
                Uri uri = (Uri) this.c;
                znVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), null, uri, znVar.T5, znVar.n5, znVar.X3, znVar.l5, null, null, null, null, 0, znVar.p5, z10, i10, znVar.R3, znVar.C8());
                break;
            case 6:
            default:
                ln lnVar = (ln) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    lnVar.getClass();
                    break;
                } else {
                    lnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 7:
                zn znVar2 = (zn) this.b;
                znVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, znVar2.T5, znVar2.n5, znVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                znVar2.Y.setFieldText("");
                znVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.zj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        gi giVar = (gi) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        zn znVar = giVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", znVar.T5);
        znVar.presentFragment(new ProfileActivity(bundle, null));
        znVar.A7(true);
    }

    @Override // org.telegram.ui.v4
    public void b(d5 d5Var) {
        mb mbVar = (mb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = d5Var.ordinal();
        if (ordinal == 0) {
            mbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        rb rbVar = mbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.n2 n2Var = rbVar.n;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                n2Var.presentFragment(new zn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.tg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((nq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String str;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                b2Var.dismiss();
                p4Var.W(view, true);
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            default:
                ((Utilities.Callback) this.b).run(Boolean.valueOf(((boolean[]) this.c)[0]));
                break;
            case 2:
                nf.f.o(((vb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 4:
                md.V((md) this.b, (TLRPC.Chat) this.c);
                break;
            case 14:
                ip ipVar = (ip) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                ipVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new vo(ipVar, 0), 64);
                break;
            case 18:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, b2Var);
                break;
            case 19:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 20:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 21:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                launchActivity.u0(true);
                break;
            case 22:
                of ofVar = (of) this.b;
                EditText editText = (EditText) this.c;
                b2Var.dismiss();
                ofVar.run(editText.getText().toString());
                break;
            case 23:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = f4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : org.telegram.ui.Components.e5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(f4Var);
                    break;
                } else {
                    callback.run(trim);
                    b2Var.dismiss();
                    break;
                }
            case 24:
                String str2 = (String) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 25:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                org.telegram.ui.Components.dd0 dd0Var = (org.telegram.ui.Components.dd0) this.c;
                int i12 = encryptedChat.ttl;
                int value = dd0Var.getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i12 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 26:
                ((ea) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 27:
                String str3 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str3);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 28:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.b;
        org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) this.c;
        Pair pair = (Pair) obj;
        xnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.d4 d4Var = xnVar.f;
        if (d4Var == null || longValue != d4Var.i(xnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        lc0Var.x = bitmap;
        lc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        zn.f0((zn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, dg1 dg1Var) {
        a6 a6Var = (a6) this.b;
        uy uyVar2 = (uy) this.c;
        ArrayList arrayList2 = a6Var.c;
        uyVar2.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= a6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) a6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) a6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((z5) arrayList2.get(i16)).c != null && ((z5) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.b.v0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.h6(6, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ l4(mb mbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.a = 3;
        this.b = mbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 13:
                uo uoVar = (uo) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                uoVar.getClass();
                b2Var.dismiss();
                uoVar.N0 = false;
                if (j3 != 0) {
                    uoVar.w0 = j3;
                    TLRPC.Chat chat = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                    uoVar.x0 = chat;
                    TLRPC.ChatFull chatFull = uoVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != uoVar.H0;
                    uoVar.getMessagesController().toggleChannelForum(uoVar.w0, uoVar.F0, uoVar.H0);
                    TLRPC.Chat chat2 = uoVar.x0;
                    chat2.forum = uoVar.F0;
                    chat2.forum_tabs = uoVar.H0;
                    if (z10) {
                        uoVar.q0();
                        break;
                    }
                }
                break;
            case 14:
            default:
                qp qpVar = (qp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    qpVar.getClass();
                    break;
                } else {
                    up upVar = qpVar.x.d;
                    if (upVar.s) {
                        upVar.v.set(0, upVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        upVar.E = j3;
                        upVar.f = upVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
            case 15:
                up upVar2 = (up) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                if (j3 == 0) {
                    upVar2.getClass();
                    break;
                } else {
                    upVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    upVar2.Y(upVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        mj mjVar = (mj) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        zn znVar = mjVar.b;
        long j10 = znVar.d4;
        if (j3 != j10) {
            return;
        }
        znVar.qa(j10, false);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        FileLog.e("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }
}
