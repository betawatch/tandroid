package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements org.telegram.ui.Components.c5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.yj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, zg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oe(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 0:
                eo eoVar = (eo) this.b;
                Uri uri = (Uri) this.c;
                eoVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), null, uri, eoVar.T5, eoVar.n5, eoVar.X3, eoVar.l5, null, null, null, null, 0, eoVar.p5, z10, i10, eoVar.R3, eoVar.C8());
                break;
            case 2:
                eo eoVar2 = (eo) this.b;
                eoVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, eoVar2.T5, eoVar2.n5, eoVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                eoVar2.Y.setFieldText("");
                eoVar2.e9(false);
                break;
            case 6:
                pn pnVar = (pn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    pnVar.getClass();
                    break;
                } else {
                    pnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 26:
                org.telegram.ui.Components.qf qfVar = (org.telegram.ui.Components.qf) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject2 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject2, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                eo eoVar3 = chatActivityEnterView.O2;
                of2.sendMessageChatArguments = eoVar3 != null ? eoVar3.C8() : null;
                of2.effect_id = chatActivityEnterView.R4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                yeVar.setEffect(0L);
                break;
            case 27:
                ((org.telegram.ui.Components.pg) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            default:
                org.telegram.ui.Components.il ilVar = (org.telegram.ui.Components.il) this.b;
                org.telegram.ui.Components.kl klVar = (org.telegram.ui.Components.kl) this.c;
                org.telegram.ui.Components.ll llVar = ilVar.b;
                llVar.x0.b(klVar.c, llVar.y0, z10, i10, 0L);
                llVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        ji jiVar = (ji) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        eo eoVar = jiVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", eoVar.T5);
        eoVar.presentFragment(new ProfileActivity(bundle, null));
        eoVar.A7(true);
    }

    @Override // org.telegram.ui.zg1
    public void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((rq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 9:
                mp mpVar = (mp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                mpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new zo(mpVar, 0), 64);
                break;
            case 10:
            case 11:
            case 12:
            default:
                org.telegram.ui.Components.km kmVar = (org.telegram.ui.Components.km) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                wy wyVar = (wy) kmVar.b;
                ArrayList arrayList = (ArrayList) kmVar.c;
                wyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        wyVar.getMessagesController().reportSpam(longValue, wyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        wyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    wyVar.getMessagesController().blockPeer(longValue);
                }
                wyVar.b4(false);
                break;
            case 13:
                org.telegram.ui.Components.g0.P((org.telegram.ui.Components.g0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, d2Var);
                break;
            case 14:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 15:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i12 = iArr[0];
                intCallback.run(i12 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i12 == 1 ? 3600 : i12 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 16:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
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
            case 17:
                pf pfVar = (pf) this.b;
                EditText editText = (EditText) this.c;
                d2Var.dismiss();
                pfVar.run(editText.getText().toString());
                break;
            case 18:
                org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = e4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : org.telegram.ui.Components.d5.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    d2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(e4Var);
                    break;
                }
            case 19:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(p2Var.getCurrentAccount()).getInviteText(1));
                    p2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 20:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                org.telegram.ui.Components.dd0 dd0Var = (org.telegram.ui.Components.dd0) this.c;
                int i13 = encryptedChat.ttl;
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
                if (i13 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 21:
                ((ea) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 22:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 23:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 24:
                ((Utilities.Callback) this.b).run(Boolean.valueOf(((boolean[]) this.c)[0]));
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        bo boVar = (bo) this.b;
        org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) this.c;
        Pair pair = (Pair) obj;
        boVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.f4 f4Var = boVar.f;
        if (f4Var == null || longValue != f4Var.i(boVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        lc0Var.x = bitmap;
        lc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        eo.g0((eo) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 8:
                yo yoVar = (yo) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                yoVar.getClass();
                d2Var.dismiss();
                yoVar.N0 = false;
                if (j3 != 0) {
                    yoVar.w0 = j3;
                    TLRPC.Chat chat = yoVar.getMessagesController().getChat(Long.valueOf(j3));
                    yoVar.x0 = chat;
                    TLRPC.ChatFull chatFull = yoVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != yoVar.H0;
                    yoVar.getMessagesController().toggleChannelForum(yoVar.w0, yoVar.F0, yoVar.H0);
                    TLRPC.Chat chat2 = yoVar.x0;
                    chat2.forum = yoVar.F0;
                    chat2.forum_tabs = yoVar.H0;
                    if (z10) {
                        yoVar.q0();
                        break;
                    }
                }
                break;
            case 9:
            default:
                up upVar = (up) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    upVar.getClass();
                    break;
                } else {
                    yp ypVar = upVar.x.d;
                    if (ypVar.s) {
                        ypVar.v.set(0, ypVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        ypVar.E = j3;
                        ypVar.f = ypVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
            case 10:
                yp ypVar2 = (yp) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                if (j3 == 0) {
                    ypVar2.getClass();
                    break;
                } else {
                    ypVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    ypVar2.Y(ypVar2.getMessagesController().getChat(Long.valueOf(j3)), p2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        pj pjVar = (pj) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        eo eoVar = pjVar.b;
        long j10 = eoVar.d4;
        if (j3 != j10) {
            return;
        }
        eoVar.qa(j10, false);
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
