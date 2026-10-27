package m4;

import a8.qd;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import bi.ua;
import f9.g2;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.je;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b6;
import org.telegram.ui.c4;
import org.telegram.ui.c6;
import org.telegram.ui.cf1;
import org.telegram.ui.ci;
import org.telegram.ui.cp;
import org.telegram.ui.ey;
import org.telegram.ui.g5;
import org.telegram.ui.h4;
import org.telegram.ui.hn;
import org.telegram.ui.iq;
import org.telegram.ui.j4;
import org.telegram.ui.jj;
import org.telegram.ui.lp;
import org.telegram.ui.m3;
import org.telegram.ui.nb;
import org.telegram.ui.nd;
import org.telegram.ui.oo;
import org.telegram.ui.p3;
import org.telegram.ui.po;
import org.telegram.ui.pp;
import org.telegram.ui.sb;
import org.telegram.ui.sf1;
import org.telegram.ui.t4;
import org.telegram.ui.un;
import org.telegram.ui.w3;
import org.telegram.ui.wb;
import org.telegram.ui.wn;
import org.telegram.ui.xx;
import org.telegram.ui.y4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements e2.j, h1, ni.n, org.telegram.ui.Cells.u, bm0, b2, xx, y4, e5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, pl0, pk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, sf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 13:
                wn wnVar = (wn) this.b;
                Uri uri = (Uri) this.c;
                wnVar.v8();
                SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), null, uri, wnVar.j6, wnVar.D5, wnVar.j4, wnVar.B5, null, null, null, null, 0, wnVar.F5, z10, i10, wnVar.d4, wnVar.O8());
                break;
            case 14:
            default:
                hn hnVar = (hn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    hnVar.getClass();
                    break;
                } else {
                    hnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 15:
                wn wnVar2 = (wn) this.b;
                wnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, wnVar2.j6, wnVar2.D5, wnVar2.j4, null, false, null, null, null, z10, i10, 0, null, false));
                wnVar2.Y.setFieldText("");
                wnVar2.r9(false);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // ni.n
    public void a(c cVar) {
        AndroidUtilities.runOnUIThread(new jg.f1((SpannableString) this.b, cVar, (ua) this.c, 14));
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                j1 j1Var = (j1) this.b;
                b2.u1 u1Var = (b2.u1) this.c;
                n1 n1Var = (n1) obj;
                j1Var.getClass();
                f9.l0 l0Var = u1Var.H;
                if (!l0Var.isEmpty()) {
                    b2.t1 c10 = u1Var.a().c();
                    g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.r1 r1Var = (b2.r1) it.next();
                        b2.q1 q1Var = (b2.q1) j1Var.d.n.get(r1Var.a.b);
                        if (q1Var == null || r1Var.a.a != q1Var.a) {
                            c10.a(r1Var);
                        } else {
                            c10.a(new b2.r1(q1Var, r1Var.b));
                        }
                    }
                    u1Var = c10.b();
                }
                n1Var.p(u1Var);
                break;
            case 1:
                j1 j1Var2 = (j1) this.b;
                w wVar = (w) this.c;
                f0 f0Var = (f0) j1Var2.a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(wVar, false);
                    break;
                }
                break;
            default:
                j1 j1Var3 = (j1) this.b;
                Surface surface = (Surface) this.c;
                n1 n1Var2 = (n1) obj;
                ((f0) j1Var3.a.get()).getClass();
                if (surface != null) {
                    i1 i1Var = new i1(surface);
                    j1Var3.i = i1Var;
                    n1Var2.T(i1Var);
                    break;
                } else {
                    n1Var2.T(null);
                    j1Var3.i = null;
                    break;
                }
        }
    }

    @Override // org.telegram.ui.y4
    public void b(g5 g5Var) {
        nb nbVar = (nb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = g5Var.ordinal();
        if (ordinal == 0) {
            nbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        sb sbVar = nbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            r2 r2Var = sbVar.n;
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                r2Var.presentFragment(new wn(bundle));
            }
        }
    }

    @Override // m4.h1
    public Object c(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 3:
                return f0Var.j() ? qd.b(new t1(-100)) : e2.n0.g0((k9.y) ((h1) this.b).c(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, (x0) this.c, 15));
            default:
                return f0Var.j() ? qd.b(new t1(-100)) : e2.n0.g0((k9.y) ((h1) this.b).c(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, (g1) this.c, 16));
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.pl0
    public void d() {
        wn wnVar = (wn) this.b;
        oi.q qVar = (oi.q) this.c;
        wnVar.getClass();
        qVar.g();
        wnVar.C9();
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        j4 j4Var = (j4) this.b;
        m3 m3Var = (m3) this.c;
        if (j4Var.K == null || i10 - 1 >= 0) {
            s9 s9Var = j4Var.P0;
            if (s9Var != null) {
                if (s9Var.x()) {
                    j4Var.P0.f(false);
                    return;
                }
                j4Var.P0.f(false);
            }
            h4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (j4Var.H0 == 0) {
                    if ((!p3Var.c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(j4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            j4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.id;
                        j4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        j4Var.H0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new je(j4Var, i11, j10));
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
            TL_iv.PageBlock z10 = j4.z(pageBlock);
            if (z10 instanceof w3) {
                z10 = ((w3) z10).b;
            }
            if (z10 instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(j4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), j4Var.M, 2);
                j4Var.o(false, true);
                return;
            }
            if (z10 instanceof c4) {
                c4 c4Var = (c4) z10;
                j4Var.Q(c4Var.a.articles.get(c4Var.b).url, null, null);
                return;
            }
            if (z10 instanceof TL_iv.pageBlockDetails) {
                View y3 = j4.y(view);
                if (y3 instanceof org.telegram.ui.l1) {
                    j4Var.d = null;
                    j4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int h = adapter.h();
                    adapter.M();
                    int abs = Math.abs(adapter.h() - h);
                    org.telegram.ui.l1 l1Var = (org.telegram.ui.l1) y3;
                    l1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    l1Var.invalidate();
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

    @Override // org.telegram.ui.Components.pk0
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        ci ciVar = (ci) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        wn wnVar = ciVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", wnVar.j6);
        wnVar.presentFragment(new ProfileActivity(bundle, null));
        wnVar.J7(true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        String str;
        switch (this.a) {
            case 8:
                t4 t4Var = (t4) this.b;
                View view = (View) this.c;
                t4Var.getClass();
                e2Var.dismiss();
                t4Var.X(view, true);
                break;
            case 10:
                qf.d.n(((wb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 12:
                nd.W((nd) this.b, (TLRPC.Chat) this.c);
                break;
            case 23:
                cp cpVar = (cp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                cpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new po(cpVar, 0), 64);
                break;
            case 27:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, e2Var);
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            default:
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
                launchActivity.z0(true);
                break;
        }
    }

    @Override // org.telegram.ui.sf1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((iq) this.b).q0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        un unVar = (un) this.b;
        vc0 vc0Var = (vc0) this.c;
        Pair pair = (Pair) obj;
        unVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.h4 h4Var = unVar.f;
        if (h4Var == null || longValue != h4Var.h(unVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        vc0Var.x = bitmap;
        vc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        wn.N0((wn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        c6 c6Var = (c6) this.b;
        ey eyVar2 = (ey) this.c;
        ArrayList arrayList2 = c6Var.c;
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
                if (i14 >= c6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) c6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) c6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (c6Var.getMessagesController().getCacheByChatsController().getKeepMedia(c6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = c6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
        c6Var.V();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((b6) arrayList2.get(i16)).c != null && ((b6) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            c6Var.b.v0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(15, c6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ s0(nb nbVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        this.a = 11;
        this.b = nbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 22:
                oo ooVar = (oo) this.b;
                e2 e2Var = (e2) this.c;
                ooVar.getClass();
                e2Var.dismiss();
                ooVar.M0 = false;
                if (j10 != 0) {
                    ooVar.v0 = j10;
                    TLRPC.Chat chat = ooVar.getMessagesController().getChat(Long.valueOf(j10));
                    ooVar.w0 = chat;
                    TLRPC.ChatFull chatFull = ooVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != ooVar.G0;
                    ooVar.getMessagesController().toggleChannelForum(ooVar.v0, ooVar.E0, ooVar.G0);
                    TLRPC.Chat chat2 = ooVar.w0;
                    chat2.forum = ooVar.E0;
                    chat2.forum_tabs = ooVar.G0;
                    if (z10) {
                        ooVar.r0();
                        break;
                    }
                }
                break;
            case 23:
            default:
                lp lpVar = (lp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j10 == 0) {
                    lpVar.getClass();
                    break;
                } else {
                    pp ppVar = lpVar.x.d;
                    if (ppVar.s) {
                        ppVar.v.set(0, ppVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        ppVar.E = j10;
                        ppVar.f = ppVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 24:
                pp ppVar2 = (pp) this.b;
                r2 r2Var = (r2) this.c;
                if (j10 == 0) {
                    ppVar2.getClass();
                    break;
                } else {
                    ppVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    ppVar2.Z(ppVar2.getMessagesController().getChat(Long.valueOf(j10)), r2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        jj jjVar = (jj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        wn wnVar = jjVar.b;
        long j11 = wnVar.p4;
        if (j10 != j11) {
            return;
        }
        wnVar.Da(j11, false);
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

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
