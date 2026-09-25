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
import org.telegram.messenger.ChatObject;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements org.telegram.ui.Cells.v, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.z1, ky, v4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 7:
                wn wnVar = (wn) this.b;
                Uri uri = (Uri) this.c;
                wnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), null, uri, wnVar.T5, wnVar.n5, wnVar.X3, wnVar.l5, null, null, null, null, 0, wnVar.p5, z10, i10, wnVar.R3, wnVar.C8());
                break;
            case 8:
            default:
                in inVar = (in) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    inVar.getClass();
                    break;
                } else {
                    inVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 9:
                wn wnVar2 = (wn) this.b;
                wnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, wnVar2.T5, wnVar2.n5, wnVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                wnVar2.Y.setFieldText("");
                wnVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.zj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        ei eiVar = (ei) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        wn wnVar = eiVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", wnVar.T5);
        wnVar.presentFragment(new ProfileActivity(bundle, null));
        wnVar.A7(true);
    }

    @Override // org.telegram.ui.v4
    public void b(d5 d5Var) {
        lb lbVar = (lb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = d5Var.ordinal();
        if (ordinal == 0) {
            lbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        qb qbVar = lbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.m2 m2Var = qbVar.n;
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                m2Var.presentFragment(new wn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        i4 i4Var = (i4) this.b;
        m3 m3Var = (m3) this.c;
        if (i4Var.K == null || i10 - 1 >= 0) {
            org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
            if (q9Var != null) {
                if (q9Var.y()) {
                    i4Var.O0.f(false);
                    return;
                }
                i4Var.O0.f(false);
            }
            g4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (i4Var.G0 == 0) {
                    if ((!p3Var.c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.id;
                        i4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.ce(i4Var, i11, j3));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 < 0 || i10 >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
            TL_iv.PageBlock z10 = i4.z(pageBlock);
            if (z10 instanceof w3) {
                z10 = ((w3) z10).b;
            }
            if (z10 instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                i4Var.o(false, true);
                return;
            }
            if (z10 instanceof c4) {
                c4 c4Var = (c4) z10;
                i4Var.Q(c4Var.a.articles.get(c4Var.b).url, null, null);
                return;
            }
            if (z10 instanceof TL_iv.pageBlockDetails) {
                View y3 = i4.y(view);
                if (y3 instanceof m1) {
                    i4Var.d = null;
                    i4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int h = adapter.h();
                    adapter.M();
                    int abs = Math.abs(adapter.h() - h);
                    m1 m1Var = (m1) y3;
                    m1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    m1Var.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.s(i10 + 1, abs);
                        } else {
                            adapter.t(i10 + 1, abs);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.mg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((kq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        String str;
        switch (this.a) {
            case 2:
                p4 p4Var = (p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                a2Var.dismiss();
                p4Var.W(view, true);
                break;
            case 4:
                nf.f.o(((ub) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 6:
                ld.V((ld) this.b, (TLRPC.Chat) this.c);
                break;
            case 16:
                fp fpVar = (fp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                fpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new so(fpVar, 0), 64);
                break;
            case 20:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, a2Var);
                break;
            case 21:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 22:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 23:
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
            case 24:
                oc ocVar = (oc) this.b;
                EditText editText = (EditText) this.c;
                a2Var.dismiss();
                ocVar.run(editText.getText().toString());
                break;
            case 25:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = f4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : org.telegram.ui.Components.e5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(f4Var);
                    break;
                } else {
                    callback.run(trim);
                    a2Var.dismiss();
                    break;
                }
            case 26:
                String str2 = (String) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(m2Var.getCurrentAccount()).getInviteText(1));
                    m2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                org.telegram.ui.Components.ed0 ed0Var = (org.telegram.ui.Components.ed0) this.c;
                int i12 = encryptedChat.ttl;
                int value = ed0Var.getValue();
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
            case 28:
                ((da) this.b).run(((boolean[]) this.c)[0]);
                break;
            default:
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
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        un unVar = (un) this.b;
        org.telegram.ui.Components.mc0 mc0Var = (org.telegram.ui.Components.mc0) this.c;
        Pair pair = (Pair) obj;
        unVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.b4 b4Var = unVar.f;
        if (b4Var == null || longValue != b4Var.i(unVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        mc0Var.x = bitmap;
        mc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        wn.e0((wn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        a6 a6Var = (a6) this.b;
        qy qyVar2 = (qy) this.c;
        ArrayList arrayList2 = a6Var.c;
        qyVar2.finishFragment();
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
            a6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(7, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ o(lb lbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.a = 5;
        this.b = lbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 15:
                ro roVar = (ro) this.b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.c;
                roVar.getClass();
                a2Var.dismiss();
                roVar.N0 = false;
                if (j3 != 0) {
                    roVar.w0 = j3;
                    TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(j3));
                    roVar.x0 = chat;
                    TLRPC.ChatFull chatFull = roVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != roVar.H0;
                    roVar.getMessagesController().toggleChannelForum(roVar.w0, roVar.F0, roVar.H0);
                    TLRPC.Chat chat2 = roVar.x0;
                    chat2.forum = roVar.F0;
                    chat2.forum_tabs = roVar.H0;
                    if (z10) {
                        roVar.q0();
                        break;
                    }
                }
                break;
            case 16:
            default:
                np npVar = (np) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    npVar.getClass();
                    break;
                } else {
                    rp rpVar = npVar.x.d;
                    if (rpVar.s) {
                        rpVar.v.set(0, rpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        rpVar.E = j3;
                        rpVar.f = rpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
            case 17:
                rp rpVar2 = (rp) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                if (j3 == 0) {
                    rpVar2.getClass();
                    break;
                } else {
                    rpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    rpVar2.Y(rpVar2.getMessagesController().getChat(Long.valueOf(j3)), m2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        kj kjVar = (kj) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        wn wnVar = kjVar.b;
        long j10 = wnVar.d4;
        if (j3 != j10) {
            return;
        }
        wnVar.qa(j10, false);
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

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
