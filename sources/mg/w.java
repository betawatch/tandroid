package mg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.View;
import dg.d3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh.b1;
import nh.d4;
import nh.e1;
import nh.i9;
import nh.w3;
import nh.x0;
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
import org.telegram.messenger.he;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b4;
import org.telegram.ui.f6;
import org.telegram.ui.fi;
import org.telegram.ui.fp;
import org.telegram.ui.h4;
import org.telegram.ui.h5;
import org.telegram.ui.ig1;
import org.telegram.ui.ky;
import org.telegram.ui.l4;
import org.telegram.ui.lb;
import org.telegram.ui.lj;
import org.telegram.ui.ln;
import org.telegram.ui.lq;
import org.telegram.ui.n4;
import org.telegram.ui.op;
import org.telegram.ui.p1;
import org.telegram.ui.pd;
import org.telegram.ui.qb;
import org.telegram.ui.qy;
import org.telegram.ui.r3;
import org.telegram.ui.ro;
import org.telegram.ui.sf1;
import org.telegram.ui.so;
import org.telegram.ui.sp;
import org.telegram.ui.u3;
import org.telegram.ui.u4;
import org.telegram.ui.ub;
import org.telegram.ui.w51;
import org.telegram.ui.xn;
import org.telegram.ui.z4;
import org.telegram.ui.zn;
import ph.c8;
import ph.e6;
import ph.e8;
import ph.m7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements w51, ug.g, m7, c2, c9.f, org.telegram.ui.Cells.v, il0, ky, z4, y4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, xj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, ig1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean I(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 13:
                zn znVar = (zn) this.b;
                Uri uri = (Uri) this.c;
                znVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), null, uri, znVar.Q5, znVar.k5, znVar.U3, znVar.i5, null, null, null, null, 0, znVar.m5, z4, i10, znVar.O3, znVar.C8());
                break;
            case 14:
            default:
                ln lnVar = (ln) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z4) {
                    lnVar.getClass();
                    break;
                } else {
                    lnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 15:
                zn znVar2 = (zn) this.b;
                znVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, znVar2.Q5, znVar2.k5, znVar2.U3, null, false, null, null, null, z4, i10, 0, null, false));
                znVar2.V.setFieldText("");
                znVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xj0
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        fi fiVar = (fi) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        zn znVar = fiVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", znVar.Q5);
        znVar.presentFragment(new ProfileActivity(bundle, null));
        znVar.A7(true);
    }

    @Override // org.telegram.ui.z4
    public void b(h5 h5Var) {
        lb lbVar = (lb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = h5Var.ordinal();
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
            p2 p2Var = qbVar.n;
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                p2Var.presentFragment(new zn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        n4 n4Var = (n4) this.b;
        r3 r3Var = (r3) this.c;
        if (n4Var.H == null || i10 - 1 >= 0) {
            l9 l9Var = n4Var.L0;
            if (l9Var != null) {
                if (l9Var.y()) {
                    n4Var.L0.f(false);
                    return;
                }
                n4Var.L0.f(false);
            }
            l4 adapter = r3Var.getAdapter();
            if ((view instanceof u3) && adapter.B != null) {
                u3 u3Var = (u3) view;
                if (n4Var.D0 == 0) {
                    if ((!u3Var.c || f10 >= view.getMeasuredWidth() / 2) && !u3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(n4Var.U).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            n4Var.P(adapter.B.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.B.id;
                        n4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        n4Var.D0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new he(n4Var, i11, j10));
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
            TL_iv.PageBlock z4 = n4.z(pageBlock);
            if (z4 instanceof b4) {
                z4 = ((b4) z4).b;
            }
            if (z4 instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(n4Var.U).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z4).channel), n4Var.J, 2);
                n4Var.o(false, true);
                return;
            }
            if (z4 instanceof h4) {
                h4 h4Var = (h4) z4;
                n4Var.Q(h4Var.a.articles.get(h4Var.b).url, null, null);
                return;
            }
            if (z4 instanceof TL_iv.pageBlockDetails) {
                View y10 = n4.y(view);
                if (y10 instanceof p1) {
                    n4Var.d = null;
                    n4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z4;
                    pageblockdetails.open = !pageblockdetails.open;
                    int h = adapter.h();
                    adapter.M();
                    int abs = Math.abs(adapter.h() - h);
                    p1 p1Var = (p1) y10;
                    p1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    p1Var.invalidate();
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

    @Override // ph.m7
    public void d(c8 c8Var, boolean z4, boolean z10, boolean z11, boolean z12, TLRPC.InputPeer inputPeer, int i10, e6 e6Var, org.telegram.ui.web.q0 q0Var) {
        switch (this.a) {
            case 2:
                d4 d4Var = (d4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(d4Var.z2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = c8Var.b;
                ConnectionsManager.getInstance(d4Var.z2).sendRequest(tL_stories_editStory, new b1(d4Var, e6Var, storyItem, c8Var, 6));
                break;
            default:
                w3 w3Var = (w3) this.b;
                e8 e8Var = (e8) this.c;
                d4 d4Var2 = w3Var.l;
                nh.b4 b4Var = d4Var2.L1;
                TL_stories.StoryItem storyItem2 = b4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z11) {
                    MessagesController.getInstance(d4Var2.z2).getStoriesController().o0(d4Var2.y1, d4Var2.s1, z11, null);
                }
                TL_stories.StoryItem storyItem3 = b4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z4);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(d4Var2.z2).sendRequest(togglegroupcallsettings, new d3(12, w3Var, e8Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // c9.f
    public Object d0(c5.j jVar) {
        String str = (String) this.b;
        c9.b bVar = (c9.b) this.c;
        try {
            Trace.beginSection(str);
            return bVar.f.d0(jVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // ug.g
    public void e(RectF rectF, View view) {
        pg.b bVar = (pg.b) this.b;
        View view2 = (View) this.c;
        bVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override // org.telegram.ui.ig1
    public void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((lq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
        String str;
        switch (this.a) {
            case 4:
                w3 w3Var = (w3) this.b;
                e1 e1Var = ((i9) this.c).x0;
                if (e1Var == null) {
                    d4.f0(w3Var.l);
                    break;
                } else if (!e1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = e1Var.f;
                    ConnectionsManager.getInstance(e1Var.e).sendRequest(discardgroupcall, new x0(e1Var, 4));
                    e1Var.e();
                    break;
                }
                break;
            case 8:
                u4 u4Var = (u4) this.b;
                View view = (View) this.c;
                u4Var.getClass();
                d2Var.dismiss();
                u4Var.W(view, true);
                break;
            case 10:
                ze.d.o(((ub) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 12:
                pd.V((pd) this.b, (TLRPC.Chat) this.c);
                break;
            case 22:
                fp fpVar = (fp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                fpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new so(fpVar, 0), 64);
                break;
            case 26:
                org.telegram.ui.Components.f0.P((org.telegram.ui.Components.f0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, d2Var);
                break;
            case 27:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 28:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
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
                launchActivity.u0(true);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.b;
        ec0 ec0Var = (ec0) this.c;
        Pair pair = (Pair) obj;
        xnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        e4 e4Var = xnVar.f;
        if (e4Var == null || longValue != e4Var.i(xnVar.D ? 1 : 0) || bitmap == null) {
            return;
        }
        ec0Var.x = bitmap;
        ec0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        zn.g0((zn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.ky
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        f6 f6Var = (f6) this.b;
        qy qyVar2 = (qy) this.c;
        ArrayList arrayList2 = f6Var.c;
        qyVar2.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= f6Var.d.size()) {
                    z11 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) f6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) f6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z11) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (f6Var.getMessagesController().getCacheByChatsController().getKeepMedia(f6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = f6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        f6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(f6Var.e, f6Var.d);
        f6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((org.telegram.ui.e6) arrayList2.get(i16)).c != null && ((org.telegram.ui.e6) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            f6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(19, f6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ w(lb lbVar, s1 s1Var, TLRPC.User user) {
        this.a = 11;
        this.b = lbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 21:
                ro roVar = (ro) this.b;
                d2 d2Var = (d2) this.c;
                roVar.getClass();
                d2Var.dismiss();
                roVar.K0 = false;
                if (j10 != 0) {
                    roVar.t0 = j10;
                    TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(j10));
                    roVar.u0 = chat;
                    TLRPC.ChatFull chatFull = roVar.v0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z4 = chat.forum_tabs != roVar.E0;
                    roVar.getMessagesController().toggleChannelForum(roVar.t0, roVar.C0, roVar.E0);
                    TLRPC.Chat chat2 = roVar.u0;
                    chat2.forum = roVar.C0;
                    chat2.forum_tabs = roVar.E0;
                    if (z4) {
                        roVar.q0();
                        break;
                    }
                }
                break;
            case 22:
            default:
                op opVar = (op) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j10 == 0) {
                    opVar.getClass();
                    break;
                } else {
                    sp spVar = opVar.x.d;
                    if (spVar.s) {
                        spVar.v.set(0, spVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        spVar.B = j10;
                        spVar.f = spVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 23:
                sp spVar2 = (sp) this.b;
                p2 p2Var = (p2) this.c;
                if (j10 == 0) {
                    spVar2.getClass();
                    break;
                } else {
                    spVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    spVar2.Y(spVar2.getMessagesController().getChat(Long.valueOf(j10)), p2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        lj ljVar = (lj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        zn znVar = ljVar.b;
        long j11 = znVar.a4;
        if (j10 != j11) {
            return;
        }
        znVar.qa(j11, false);
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

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
