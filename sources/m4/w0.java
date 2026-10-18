package m4;

import ai.r2;
import ai.ua;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import ig.e2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.be;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a5;
import org.telegram.ui.ai;
import org.telegram.ui.d6;
import org.telegram.ui.dq;
import org.telegram.ui.e4;
import org.telegram.ui.e6;
import org.telegram.ui.en;
import org.telegram.ui.ey;
import org.telegram.ui.gp;
import org.telegram.ui.hj;
import org.telegram.ui.i5;
import org.telegram.ui.j4;
import org.telegram.ui.jf1;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.l4;
import org.telegram.ui.lo;
import org.telegram.ui.o3;
import org.telegram.ui.ob;
import org.telegram.ui.od;
import org.telegram.ui.qn;
import org.telegram.ui.r3;
import org.telegram.ui.sn;
import org.telegram.ui.tb;
import org.telegram.ui.te1;
import org.telegram.ui.v4;
import org.telegram.ui.xb;
import org.telegram.ui.xx;
import org.telegram.ui.y3;
import org.telegram.ui.yo;
import v7.q8;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements e2.j, g1, mi.n, org.telegram.ui.Cells.v, xl0, a2, xx, a5, e5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, lk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, jf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 11:
                sn snVar = (sn) this.b;
                Uri uri = (Uri) this.c;
                snVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), null, uri, snVar.T5, snVar.n5, snVar.X3, snVar.l5, null, null, null, null, 0, snVar.p5, z10, i10, snVar.R3, snVar.H8());
                break;
            case 12:
                sn snVar2 = (sn) this.b;
                snVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, snVar2.T5, snVar2.n5, snVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                snVar2.Y.setFieldText("");
                snVar2.j9(false);
                break;
            default:
                en enVar = (en) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    enVar.getClass();
                    break;
                } else {
                    enVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // mi.n
    public void a(mi.q qVar) {
        AndroidUtilities.runOnUIThread(new e2((SpannableString) this.b, qVar, (ua) this.c, 11));
    }

    @Override // e2.j
    public void accept(Object obj) {
        i1 i1Var = (i1) this.b;
        Surface surface = (Surface) this.c;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.i = null;
        } else {
            h1 h1Var = new h1(surface);
            i1Var.i = h1Var;
            m1Var.T(h1Var);
        }
    }

    @Override // org.telegram.ui.a5
    public void b(i5 i5Var) {
        ob obVar = (ob) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = i5Var.ordinal();
        if (ordinal == 0) {
            obVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        tb tbVar = obVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            n2 n2Var = tbVar.n;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                n2Var.presentFragment(new sn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.lk0
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        ai aiVar = (ai) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        sn snVar = aiVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", snVar.T5);
        snVar.presentFragment(new ProfileActivity(bundle, null));
        snVar.D7(true);
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        l4 l4Var = (l4) this.b;
        o3 o3Var = (o3) this.c;
        if (l4Var.K == null || i10 - 1 >= 0) {
            n9 n9Var = l4Var.O0;
            if (n9Var != null) {
                if (n9Var.x()) {
                    l4Var.O0.f(false);
                    return;
                }
                l4Var.O0.f(false);
            }
            j4 adapter = o3Var.getAdapter();
            if ((view instanceof r3) && adapter.E != null) {
                r3 r3Var = (r3) view;
                if (l4Var.G0 == 0) {
                    if ((!r3Var.c || f7 >= view.getMeasuredWidth() / 2) && !r3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(l4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            l4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.id;
                        l4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        l4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new be(l4Var, i11, j10));
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
            TL_iv.PageBlock z10 = l4.z(pageBlock);
            if (z10 instanceof y3) {
                z10 = ((y3) z10).b;
            }
            if (z10 instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(l4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), l4Var.M, 2);
                l4Var.o(false, true);
                return;
            }
            if (z10 instanceof e4) {
                e4 e4Var = (e4) z10;
                l4Var.Q(e4Var.a.articles.get(e4Var.b).url, null, null);
                return;
            }
            if (z10 instanceof TL_iv.pageBlockDetails) {
                View y3 = l4.y(view);
                if (y3 instanceof org.telegram.ui.o1) {
                    l4Var.d = null;
                    l4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int h = adapter.h();
                    adapter.M();
                    int abs = Math.abs(adapter.h() - h);
                    org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) y3;
                    o1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    o1Var.invalidate();
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

    @Override // m4.g1
    public Object e(f0 f0Var, v vVar, int i10) {
        switch (this.a) {
            case 1:
                return f0Var.j() ? q8.b(new s1(-100)) : e2.m0.g0((j9.y) ((g1) this.b).e(f0Var, vVar, i10), new r2(f0Var, vVar, (v0) this.c, 15));
            default:
                return f0Var.j() ? q8.b(new s1(-100)) : e2.m0.g0((j9.y) ((g1) this.b).e(f0Var, vVar, i10), new r2(f0Var, vVar, (f1) this.c, 16));
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        String str;
        switch (this.a) {
            case 6:
                v4 v4Var = (v4) this.b;
                View view = (View) this.c;
                v4Var.getClass();
                b2Var.dismiss();
                v4Var.W(view, true);
                break;
            case 8:
                pf.d.n(((xb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 10:
                od.V((od) this.b, (TLRPC.Chat) this.c);
                break;
            case 20:
                yo yoVar = (yo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                yoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new lo(yoVar, 0), 64);
                break;
            case 24:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, b2Var);
                break;
            case 25:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 26:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 27:
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
                launchActivity.y0(true);
                break;
            case 28:
                j3 j3Var = (j3) this.b;
                EditText editText = (EditText) this.c;
                b2Var.dismiss();
                j3Var.run(editText.getText().toString());
                break;
            default:
                g4 g4Var = (g4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = g4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : f5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(g4Var);
                    break;
                } else {
                    callback.run(trim);
                    b2Var.dismiss();
                    break;
                }
        }
    }

    @Override // org.telegram.ui.jf1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.b;
        wc0 wc0Var = (wc0) this.c;
        Pair pair = (Pair) obj;
        qnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        c4 c4Var = qnVar.f;
        if (c4Var == null || longValue != c4Var.h(qnVar.G ? 1 : 0) || bitmap == null) {
            return;
        }
        wc0Var.x = bitmap;
        wc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        sn.H0((sn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        e6 e6Var = (e6) this.b;
        ey eyVar2 = (ey) this.c;
        ArrayList arrayList2 = e6Var.c;
        eyVar2.finishFragment();
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
                if (i14 >= e6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) e6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) e6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (e6Var.getMessagesController().getCacheByChatsController().getKeepMedia(e6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = e6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        e6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var.e, e6Var.d);
        e6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((d6) arrayList2.get(i16)).c != null && ((d6) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            e6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.i0(4, e6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ w0(ob obVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.a = 9;
        this.b = obVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 19:
                ko koVar = (ko) this.b;
                b2 b2Var = (b2) this.c;
                koVar.getClass();
                b2Var.dismiss();
                koVar.N0 = false;
                if (j10 != 0) {
                    koVar.w0 = j10;
                    TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(j10));
                    koVar.x0 = chat;
                    TLRPC.ChatFull chatFull = koVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != koVar.H0;
                    koVar.getMessagesController().toggleChannelForum(koVar.w0, koVar.F0, koVar.H0);
                    TLRPC.Chat chat2 = koVar.x0;
                    chat2.forum = koVar.F0;
                    chat2.forum_tabs = koVar.H0;
                    if (z10) {
                        koVar.q0();
                        break;
                    }
                }
                break;
            case 20:
            default:
                gp gpVar = (gp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j10 == 0) {
                    gpVar.getClass();
                    break;
                } else {
                    kp kpVar = gpVar.x.d;
                    if (kpVar.s) {
                        kpVar.v.set(0, kpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        kpVar.E = j10;
                        kpVar.f = kpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 21:
                kp kpVar2 = (kp) this.b;
                n2 n2Var = (n2) this.c;
                if (j10 == 0) {
                    kpVar2.getClass();
                    break;
                } else {
                    kpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    kpVar2.Y(kpVar2.getMessagesController().getChat(Long.valueOf(j10)), n2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        hj hjVar = (hj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        sn snVar = hjVar.b;
        long j11 = snVar.d4;
        if (j10 != j11) {
            return;
        }
        snVar.va(j11, false);
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

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
