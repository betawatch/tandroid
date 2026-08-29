package kg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import bg.h3;
import eg.z1;
import ih.b1;
import ih.c1;
import j7.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lh.b4;
import lh.d1;
import lh.d4;
import lh.i9;
import lh.w0;
import lh.w3;
import nh.b6;
import nh.c9;
import nh.e9;
import nh.g9;
import nh.h8;
import nh.j8;
import nh.m6;
import nh.m8;
import nh.p8;
import nh.r8;
import nh.y8;
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
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.fe;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a4;
import org.telegram.ui.a6;
import org.telegram.ui.d5;
import org.telegram.ui.d51;
import org.telegram.ui.dq;
import org.telegram.ui.ej;
import org.telegram.ui.fb;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.g4;
import org.telegram.ui.gp;
import org.telegram.ui.hd;
import org.telegram.ui.k4;
import org.telegram.ui.kb;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.lo;
import org.telegram.ui.m4;
import org.telegram.ui.ob;
import org.telegram.ui.p1;
import org.telegram.ui.pf1;
import org.telegram.ui.q3;
import org.telegram.ui.q4;
import org.telegram.ui.rn;
import org.telegram.ui.t3;
import org.telegram.ui.tn;
import org.telegram.ui.v4;
import org.telegram.ui.yh;
import org.telegram.ui.yo;
import org.telegram.ui.yx;
import org.telegram.ui.z5;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements d51, sg.g, j8, b2, a9.e, al0, org.telegram.ui.Cells.v, yx, v4, b5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, oj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, pf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 14:
                tn tnVar = (tn) this.b;
                Uri uri = (Uri) this.c;
                tnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(tnVar.getAccountInstance(), null, uri, tnVar.P5, tnVar.j5, tnVar.T3, tnVar.h5, null, null, null, null, 0, tnVar.l5, z10, i10, tnVar.N3, tnVar.C8());
                break;
            case 15:
            default:
                fn fnVar = (fn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    fnVar.getClass();
                    break;
                } else {
                    fnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i10);
                    break;
                }
            case 16:
                tn tnVar2 = (tn) this.b;
                tnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, tnVar2.P5, tnVar2.j5, tnVar2.T3, null, false, null, null, null, z10, i10, 0, null, false));
                tnVar2.U.setFieldText("");
                tnVar2.e9(false);
                break;
        }
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        String str = (String) this.b;
        a9.b bVar = (a9.b) this.c;
        try {
            Trace.beginSection(str);
            return bVar.f.I0(jVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.oj0
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        yh yhVar = (yh) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        tn tnVar = yhVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", tnVar.P5);
        tnVar.presentFragment(new ProfileActivity(bundle, null));
        tnVar.A7(true);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        c6 c6Var;
        int i11;
        int i12;
        long clientUserId;
        c6 c6Var2;
        c6 c6Var3;
        c6 c6Var4;
        c6 c6Var5;
        c6 c6Var6;
        c6 c6Var7;
        int i13;
        int i14;
        c6 c6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        c6 c6Var9;
        int i17 = i10;
        switch (this.a) {
            case 6:
                y8 y8Var = (y8) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList2 = y8Var.H;
                a0.h hVar = y8Var.b;
                r8 r8Var = y8Var.x;
                ArrayList arrayList3 = y8Var.c;
                HashMap hashMap = y8Var.d;
                e9 e9Var = y8Var.S;
                if (i17 >= 0 && i17 < arrayList2.size()) {
                    m8 m8Var = (m8) arrayList2.get(i17);
                    int i18 = m8Var.a;
                    int i19 = 0;
                    if (i18 != 3) {
                        if (i18 != 7) {
                            if (i18 == 9) {
                                int i20 = m8Var.q;
                                if (i20 != 0) {
                                    if (i20 != 1) {
                                        if (i20 != 5) {
                                            if (i20 == 6) {
                                                e9Var.C = false;
                                                y8Var.g(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = y8Var.getContext();
                                            c6Var = ((f3) e9Var).resourcesProvider;
                                            c2 c2Var = new c2(context2, 3, c6Var);
                                            c2Var.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = e9Var.c;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            i11 = ((f3) e9Var).currentAccount;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new eg.z(y8Var, c2Var, getgroupcallstreamrtmpurl, 12));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = e9Var.c;
                                        if (inputPeer2 != null) {
                                            clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                                        } else {
                                            i12 = ((f3) e9Var).currentAccount;
                                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                                        }
                                        c6Var2 = ((f3) e9Var).resourcesProvider;
                                        j70 F = j70.F(y8Var, c6Var2, view);
                                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new z1(y8Var, clientUserId, 9), false);
                                        F.k();
                                        j70.f(F, e9Var.i1().B(clientUserId, true), e9Var.v, false, null, new b1(13, y8Var, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    g9 g9Var = e9Var.Y;
                                    if (g9Var != null) {
                                        g9Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof org.telegram.ui.Cells.m8) {
                            org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                            m8Var2.setChecked(!m8Var2.b());
                            m8Var.k = m8Var2.b();
                            int i21 = m8Var.c;
                            if (i21 != 0) {
                                if (i21 != 1) {
                                    if (i21 == 2) {
                                        e9Var.w = m8Var2.b();
                                        y8Var.g(true);
                                        break;
                                    }
                                } else {
                                    boolean b10 = m8Var2.b();
                                    e9Var.y = b10;
                                    boolean z10 = e9Var.c instanceof TLRPC.TL_inputPeerChannel;
                                    if (b10) {
                                        d3 d3Var = e9Var.container;
                                        c6Var4 = ((f3) e9Var).resourcesProvider;
                                        mc G = new tc(d3Var, c6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z10 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                        G.j = 5000;
                                        G.k(true);
                                    } else {
                                        d3 d3Var2 = e9Var.container;
                                        c6Var3 = ((f3) e9Var).resourcesProvider;
                                        mc G2 = new tc(d3Var2, c6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z10 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                        G2.j = 5000;
                                        G2.k(true);
                                    }
                                    y8Var.g(true);
                                    break;
                                }
                            } else {
                                boolean b11 = m8Var2.b();
                                e9Var.x = b11;
                                boolean z11 = e9Var.J == 4;
                                if (!b11) {
                                    d3 d3Var3 = e9Var.container;
                                    c6Var5 = ((f3) e9Var).resourcesProvider;
                                    mc G3 = new tc(d3Var3, c6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z11 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                    G3.j = 5000;
                                    G3.k(true);
                                    break;
                                } else {
                                    d3 d3Var4 = e9Var.container;
                                    c6Var6 = ((f3) e9Var).resourcesProvider;
                                    mc G4 = new tc(d3Var4, c6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z11 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!m8Var.n || !e9Var.B) {
                        int i22 = m8Var.i;
                        if (i22 != 1) {
                            if (i22 != 3) {
                                if (i22 != 2) {
                                    if (i22 != 4) {
                                        if (i22 > 0) {
                                            arrayList3.clear();
                                            hashMap.clear();
                                            e9Var.J = m8Var.i;
                                            r8Var.c.a();
                                        } else {
                                            TLRPC.Chat chat = m8Var.h;
                                            if (chat != null) {
                                                long j10 = chat.id;
                                                if (e9.d1(e9Var, chat) > 200) {
                                                    try {
                                                        y8Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    Context context3 = y8Var.getContext();
                                                    c6Var7 = ((f3) e9Var).resourcesProvider;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, c6Var7);
                                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.GroupTooLarge);
                                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GroupTooLargeMessage);
                                                    l1.C(R.string.OK, alertDialog$Builder, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        while (i19 < size) {
                                                            Object obj = arrayList4.get(i19);
                                                            i19++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j10));
                                                    y8Var.i(true);
                                                } else {
                                                    i13 = ((f3) e9Var).currentAccount;
                                                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                                                    i14 = ((f3) e9Var).currentAccount;
                                                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                                                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                        c2 c2Var2 = y8Var.C;
                                                        if (c2Var2 != null) {
                                                            c2Var2.dismiss();
                                                            y8Var.C = null;
                                                        }
                                                        y8Var.D = j10;
                                                        Context context4 = y8Var.getContext();
                                                        c6Var8 = ((f3) e9Var).resourcesProvider;
                                                        c2 c2Var3 = new c2(context4, 3, c6Var8);
                                                        y8Var.C = c2Var3;
                                                        c2Var3.q(50L);
                                                        i15 = ((f3) e9Var).currentAccount;
                                                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                                                        messagesStorage.getStorageQueue().postRunnable(new jh.c2(y8Var, chat2, messagesStorage, j10, 12));
                                                    } else {
                                                        y8Var.d(j10, chatFull.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(y8Var.E)) {
                                                        r8Var.setText("");
                                                        y8Var.E = null;
                                                        y8Var.g(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = m8Var.g;
                                                if (user != null) {
                                                    if (y8Var.a == 0) {
                                                        e9Var.J = 0;
                                                    }
                                                    long j11 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList3);
                                                    if (arrayList3.contains(Long.valueOf(j11))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j11));
                                                        hVar.k(Boolean.FALSE, j11);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j11));
                                                        if (!TextUtils.isEmpty(y8Var.E)) {
                                                            r8Var.setText("");
                                                            y8Var.E = null;
                                                            y8Var.g(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j11);
                                                    }
                                                    arrayList3.clear();
                                                    arrayList3.addAll(hashSet);
                                                    y8Var.i(true);
                                                }
                                            }
                                        }
                                        y8Var.f(true);
                                        y8Var.e(true);
                                        r8Var.G = true;
                                        break;
                                    } else {
                                        if (e9Var.J == 4) {
                                            e9Var.I = 4;
                                            e9Var.b.D(1);
                                        }
                                        e9Var.J = 4;
                                        y8Var.f(true);
                                        break;
                                    }
                                } else {
                                    if (e9Var.J == 2) {
                                        e9Var.I = 2;
                                        e9Var.b.D(1);
                                    }
                                    e9Var.J = 2;
                                    y8Var.f(true);
                                    break;
                                }
                            } else {
                                if (e9Var.J == 3 || (e9Var.n.isEmpty() && e9Var.r.isEmpty())) {
                                    e9Var.I = 3;
                                    e9Var.b.D(1);
                                }
                                e9Var.J = 3;
                                y8Var.f(true);
                                break;
                            }
                        } else {
                            if (e9Var.J == 1 || e9.J0(e9Var).isEmpty()) {
                                e9Var.I = 1;
                                e9Var.b.D(1);
                            }
                            e9Var.J = 1;
                            y8Var.f(true);
                            break;
                        }
                    } else {
                        i16 = ((f3) e9Var).currentAccount;
                        boolean z12 = e9Var.G;
                        TLRPC.InputPeer inputPeer3 = e9Var.c;
                        p8 p8Var = new p8(y8Var, 0);
                        c6Var9 = ((f3) e9Var).resourcesProvider;
                        new h8(context, i16, z12, inputPeer3, p8Var, c6Var9).show();
                        break;
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                q3 q3Var = (q3) this.c;
                if (m4Var.G == null || i17 - 1 >= 0) {
                    k9 k9Var = m4Var.K0;
                    if (k9Var != null) {
                        if (k9Var.y()) {
                            m4Var.K0.f(false);
                            break;
                        } else {
                            m4Var.K0.f(false);
                        }
                    }
                    k4 adapter = q3Var.getAdapter();
                    if ((view instanceof t3) && adapter.A != null) {
                        t3 t3Var = (t3) view;
                        if (m4Var.C0 == 0) {
                            if ((!t3Var.c || f9 >= view.getMeasuredWidth() / 2) && !t3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(m4Var.T).getUserOrChat("previews");
                                if (!(userOrChat instanceof TLRPC.TL_user)) {
                                    int i23 = UserConfig.selectedAccount;
                                    long j12 = adapter.A.id;
                                    m4Var.b0(true);
                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                    tL_contacts_resolveUsername.username = "previews";
                                    m4Var.C0 = ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_resolveUsername, new fe(m4Var, i23, j12));
                                    break;
                                } else {
                                    m4Var.P(adapter.A.id, (TLRPC.User) userOrChat);
                                    break;
                                }
                            }
                        }
                    } else if (i17 >= 0 && i17 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i17);
                        TL_iv.PageBlock z13 = m4.z(pageBlock);
                        if (z13 instanceof a4) {
                            z13 = ((a4) z13).b;
                        }
                        if (!(z13 instanceof TL_iv.pageBlockChannel)) {
                            if (!(z13 instanceof g4)) {
                                if (z13 instanceof TL_iv.pageBlockDetails) {
                                    View y8 = m4.y(view);
                                    if (y8 instanceof p1) {
                                        m4Var.d = null;
                                        m4Var.f = null;
                                        if (adapter.e.indexOf(pageBlock) >= 0) {
                                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                            pageblockdetails.open = !pageblockdetails.open;
                                            int h = adapter.h();
                                            adapter.M();
                                            int abs = Math.abs(adapter.h() - h);
                                            p1 p1Var = (p1) y8;
                                            p1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                            p1Var.invalidate();
                                            if (abs != 0) {
                                                if (!pageblockdetails.open) {
                                                    adapter.t(i17 + 1, abs);
                                                    break;
                                                } else {
                                                    adapter.s(i17 + 1, abs);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                g4 g4Var = (g4) z13;
                                m4Var.Q(g4Var.a.articles.get(g4Var.b).url, null, null);
                                break;
                            }
                        } else {
                            MessagesController.getInstance(m4Var.T).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), m4Var.I, 2);
                            m4Var.o(false, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.v4
    public void c(d5 d5Var) {
        fb fbVar = (fb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = d5Var.ordinal();
        if (ordinal == 0) {
            fbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        kb kbVar = fbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            o2 o2Var = kbVar.n;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                o2Var.presentFragment(new tn(bundle));
            }
        }
    }

    @Override // sg.g
    public void d(RectF rectF, View view) {
        ng.d dVar = (ng.d) this.b;
        View view2 = (View) this.c;
        dVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override // nh.j8
    public void e(c9 c9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, b6 b6Var, m6 m6Var) {
        switch (this.a) {
            case 2:
                d4 d4Var = (d4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(d4Var.y2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = c9Var.b;
                ConnectionsManager.getInstance(d4Var.y2).sendRequest(tL_stories_editStory, new c1(d4Var, b6Var, storyItem, c9Var, 6));
                break;
            default:
                w3 w3Var = (w3) this.b;
                e9 e9Var = (e9) this.c;
                d4 d4Var2 = w3Var.l;
                b4 b4Var = d4Var2.K1;
                TL_stories.StoryItem storyItem2 = b4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(d4Var2.y2).getStoriesController().o0(d4Var2.x1, d4Var2.r1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = b4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(d4Var2.y2).sendRequest(togglegroupcallsettings, new h3(12, w3Var, e9Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 4:
                w3 w3Var = (w3) this.b;
                d1 d1Var = ((i9) this.c).w0;
                if (d1Var == null) {
                    d4.f0(w3Var.l);
                    break;
                } else if (!d1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = d1Var.f;
                    ConnectionsManager.getInstance(d1Var.e).sendRequest(discardgroupcall, new w0(d1Var, 4));
                    d1Var.e();
                    break;
                }
                break;
            case 9:
                q4 q4Var = (q4) this.b;
                View view = (View) this.c;
                q4Var.getClass();
                c2Var.dismiss();
                q4Var.W(view, true);
                break;
            case 11:
                ye.d.o(((ob) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 13:
                hd.V((hd) this.b, (TLRPC.Chat) this.c);
                break;
            case 23:
                yo yoVar = (yo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                yoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new lo(yoVar, 0), 64);
                break;
            case 27:
                org.telegram.ui.Components.g0.P((org.telegram.ui.Components.g0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, c2Var);
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            default:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
    }

    @Override // org.telegram.ui.pf1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        rn rnVar = (rn) this.b;
        yb0 yb0Var = (yb0) this.c;
        Pair pair = (Pair) obj;
        rnVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.b4 b4Var = rnVar.f;
        if (b4Var == null || longValue != b4Var.i(rnVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        yb0Var.x = bitmap;
        yb0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        tn.g0((tn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        a6 a6Var = (a6) this.b;
        fy fyVar2 = (fy) this.c;
        ArrayList arrayList2 = a6Var.c;
        fyVar2.finishFragment();
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
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(11, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ w(fb fbVar, s1 s1Var, TLRPC.User user) {
        this.a = 12;
        this.b = fbVar;
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
                ko koVar = (ko) this.b;
                c2 c2Var = (c2) this.c;
                koVar.getClass();
                c2Var.dismiss();
                koVar.J0 = false;
                if (j10 != 0) {
                    koVar.s0 = j10;
                    TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(j10));
                    koVar.t0 = chat;
                    TLRPC.ChatFull chatFull = koVar.u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != koVar.D0;
                    koVar.getMessagesController().toggleChannelForum(koVar.s0, koVar.B0, koVar.D0);
                    TLRPC.Chat chat2 = koVar.t0;
                    chat2.forum = koVar.B0;
                    chat2.forum_tabs = koVar.D0;
                    if (z10) {
                        koVar.q0();
                        break;
                    }
                }
                break;
            case 23:
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
                        kpVar.A = j10;
                        kpVar.f = kpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 24:
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
        ej ejVar = (ej) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        tn tnVar = ejVar.b;
        long j11 = tnVar.Z3;
        if (j10 != j11) {
            return;
        }
        tnVar.qa(j11, false);
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

    private final /* synthetic */ void f(View view, float f9, float f10) {
    }

    private final /* synthetic */ void h(View view, float f9, float f10) {
    }
}
