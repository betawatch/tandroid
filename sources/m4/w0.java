package m4;

import ai.u2;
import ai.va;
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
import ig.d2;
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
import org.telegram.messenger.ee;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c6;
import org.telegram.ui.d4;
import org.telegram.ui.d6;
import org.telegram.ui.dn;
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.fj;
import org.telegram.ui.gp;
import org.telegram.ui.h5;
import org.telegram.ui.i4;
import org.telegram.ui.k4;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.lo;
import org.telegram.ui.mb;
import org.telegram.ui.md;
import org.telegram.ui.n3;
import org.telegram.ui.of1;
import org.telegram.ui.q3;
import org.telegram.ui.qn;
import org.telegram.ui.rb;
import org.telegram.ui.sn;
import org.telegram.ui.u4;
import org.telegram.ui.vb;
import org.telegram.ui.x3;
import org.telegram.ui.xx;
import org.telegram.ui.ye1;
import org.telegram.ui.yh;
import org.telegram.ui.yo;
import org.telegram.ui.z4;
import v7.q8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements e2.j, g1, mi.n, org.telegram.ui.Cells.u, bm0, z1, xx, z4, d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, pk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, of1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 11:
                sn snVar = (sn) this.b;
                Uri uri = (Uri) this.c;
                snVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), null, uri, snVar.f6, snVar.z5, snVar.j4, snVar.x5, null, null, null, null, 0, snVar.B5, z10, i10, snVar.d4, snVar.H8());
                break;
            case 12:
                sn snVar2 = (sn) this.b;
                snVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, snVar2.f6, snVar2.z5, snVar2.j4, null, false, null, null, null, z10, i10, 0, null, false));
                snVar2.Y.setFieldText("");
                snVar2.j9(false);
                break;
            default:
                dn dnVar = (dn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    dnVar.getClass();
                    break;
                } else {
                    dnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // m4.g1
    public Object a(f0 f0Var, v vVar, int i10) {
        switch (this.a) {
            case 1:
                return f0Var.j() ? q8.b(new s1(-100)) : e2.m0.g0((j9.y) ((g1) this.b).a(f0Var, vVar, i10), new u2(f0Var, vVar, (v0) this.c, 15));
            default:
                return f0Var.j() ? q8.b(new s1(-100)) : e2.m0.g0((j9.y) ((g1) this.b).a(f0Var, vVar, i10), new u2(f0Var, vVar, (f1) this.c, 16));
        }
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

    @Override // org.telegram.ui.z4
    public void b(h5 h5Var) {
        mb mbVar = (mb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = h5Var.ordinal();
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
            o2 o2Var = rbVar.n;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                o2Var.presentFragment(new sn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        k4 k4Var = (k4) this.b;
        n3 n3Var = (n3) this.c;
        if (k4Var.K == null || i10 - 1 >= 0) {
            o9 o9Var = k4Var.P0;
            if (o9Var != null) {
                if (o9Var.x()) {
                    k4Var.P0.f(false);
                    return;
                }
                k4Var.P0.f(false);
            }
            i4 adapter = n3Var.getAdapter();
            if ((view instanceof q3) && adapter.E != null) {
                q3 q3Var = (q3) view;
                if (k4Var.H0 == 0) {
                    if ((!q3Var.c || f7 >= view.getMeasuredWidth() / 2) && !q3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(k4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            k4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.id;
                        k4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        k4Var.H0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ee(k4Var, i11, j10));
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
            TL_iv.PageBlock z10 = k4.z(pageBlock);
            if (z10 instanceof x3) {
                z10 = ((x3) z10).b;
            }
            if (z10 instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(k4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), k4Var.M, 2);
                k4Var.o(false, true);
                return;
            }
            if (z10 instanceof d4) {
                d4 d4Var = (d4) z10;
                k4Var.Q(d4Var.a.articles.get(d4Var.b).url, null, null);
                return;
            }
            if (z10 instanceof TL_iv.pageBlockDetails) {
                View y3 = k4.y(view);
                if (y3 instanceof org.telegram.ui.n1) {
                    k4Var.d = null;
                    k4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int h = adapter.h();
                    adapter.M();
                    int abs = Math.abs(adapter.h() - h);
                    org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) y3;
                    n1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    n1Var.invalidate();
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

    @Override // mi.n
    public void d(mi.q qVar) {
        AndroidUtilities.runOnUIThread(new d2((SpannableString) this.b, qVar, (va) this.c, 11));
    }

    @Override // org.telegram.ui.Components.pk0
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        yh yhVar = (yh) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        sn snVar = yhVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", snVar.f6);
        snVar.presentFragment(new ProfileActivity(bundle, null));
        snVar.D7(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        String str;
        switch (this.a) {
            case 6:
                u4 u4Var = (u4) this.b;
                View view = (View) this.c;
                u4Var.getClass();
                c2Var.dismiss();
                u4Var.W(view, true);
                break;
            case 8:
                pf.d.n(((vb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 10:
                md.V((md) this.b, (TLRPC.Chat) this.c);
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
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, c2Var);
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
                launchActivity.z0(true);
                break;
            case 28:
                m3 m3Var = (m3) this.b;
                EditText editText = (EditText) this.c;
                c2Var.dismiss();
                m3Var.run(editText.getText().toString());
                break;
            default:
                f4 f4Var = (f4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = f4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : f5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(f4Var);
                    break;
                } else {
                    callback.run(trim);
                    c2Var.dismiss();
                    break;
                }
        }
    }

    @Override // org.telegram.ui.of1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.b;
        yc0 yc0Var = (yc0) this.c;
        Pair pair = (Pair) obj;
        qnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.f4 f4Var = qnVar.f;
        if (f4Var == null || longValue != f4Var.h(qnVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        yc0Var.x = bitmap;
        yc0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        sn.L0((sn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        d6 d6Var = (d6) this.b;
        ey eyVar2 = (ey) this.c;
        ArrayList arrayList2 = d6Var.c;
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
                if (i14 >= d6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) d6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) d6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (d6Var.getMessagesController().getCacheByChatsController().getKeepMedia(d6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = d6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.e, d6Var.d);
        d6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((c6) arrayList2.get(i16)).c != null && ((c6) arrayList2.get(i16)).c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            d6Var.b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.h0(4, d6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ w0(mb mbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.a = 9;
        this.b = mbVar;
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
                c2 c2Var = (c2) this.c;
                koVar.getClass();
                c2Var.dismiss();
                koVar.M0 = false;
                if (j10 != 0) {
                    koVar.v0 = j10;
                    TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(j10));
                    koVar.w0 = chat;
                    TLRPC.ChatFull chatFull = koVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != koVar.G0;
                    koVar.getMessagesController().toggleChannelForum(koVar.v0, koVar.E0, koVar.G0);
                    TLRPC.Chat chat2 = koVar.w0;
                    chat2.forum = koVar.E0;
                    chat2.forum_tabs = koVar.G0;
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
                o2 o2Var = (o2) this.c;
                if (j10 == 0) {
                    kpVar2.getClass();
                    break;
                } else {
                    kpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    kpVar2.Y(kpVar2.getMessagesController().getChat(Long.valueOf(j10)), o2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        fj fjVar = (fj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        sn snVar = fjVar.b;
        long j11 = snVar.p4;
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

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
