package ih;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
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
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.yd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bj;
import org.telegram.ui.bq;
import org.telegram.ui.cn;
import org.telegram.ui.dp;
import org.telegram.ui.dy;
import org.telegram.ui.gb;
import org.telegram.ui.ho;
import org.telegram.ui.hp;
import org.telegram.ui.id;
import org.telegram.ui.io;
import org.telegram.ui.lb;
import org.telegram.ui.nf1;
import org.telegram.ui.on;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
import org.telegram.ui.vh;
import org.telegram.ui.vo;
import org.telegram.ui.we1;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements kh.w8, org.telegram.ui.ActionBar.b2, y8.d, nk0, ok0, org.telegram.ui.Cells.v, wx, org.telegram.ui.u4, org.telegram.ui.Components.x4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, dj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, nf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v3(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 14:
                qn qnVar = (qn) this.b;
                Uri uri = (Uri) this.c;
                qnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), null, uri, qnVar.P5, qnVar.j5, qnVar.T3, qnVar.h5, null, null, null, null, 0, qnVar.l5, z10, i9, qnVar.N3, qnVar.C8());
                break;
            case 15:
            default:
                cn cnVar = (cn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                if (!z10) {
                    cnVar.getClass();
                    break;
                } else {
                    cnVar.a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i9);
                    break;
                }
            case 16:
                qn qnVar2 = (qn) this.b;
                qnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.c, qnVar2.P5, qnVar2.j5, qnVar2.T3, null, false, null, null, null, z10, i9, 0, null, false));
                qnVar2.U.setFieldText("");
                qnVar2.e9(false);
                break;
        }
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        String str = (String) this.b;
        y8.a aVar = (y8.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.H1(bVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        return mh.u3.A0((mh.u3) this.b, (Context) this.c, view, i9);
    }

    @Override // org.telegram.ui.u4
    public void b(org.telegram.ui.c5 c5Var) {
        gb gbVar = (gb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = c5Var.ordinal();
        if (ordinal == 0) {
            gbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        lb lbVar = gbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.o2 o2Var = lbVar.n;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                o2Var.presentFragment(new qn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        int i11;
        long clientUserId;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        org.telegram.ui.ActionBar.b6 b6Var6;
        org.telegram.ui.ActionBar.b6 b6Var7;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.b6 b6Var8;
        int i14;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i15;
        org.telegram.ui.ActionBar.b6 b6Var9;
        int i16 = i9;
        switch (this.a) {
            case 3:
                kh.n9 n9Var = (kh.n9) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList2 = n9Var.H;
                a0.h hVar = n9Var.b;
                kh.f9 f9Var = n9Var.x;
                ArrayList arrayList3 = n9Var.c;
                HashMap hashMap = n9Var.d;
                kh.t9 t9Var = n9Var.S;
                if (i16 >= 0 && i16 < arrayList2.size()) {
                    kh.a9 a9Var = (kh.a9) arrayList2.get(i16);
                    int i17 = a9Var.a;
                    int i18 = 0;
                    if (i17 != 3) {
                        if (i17 != 7) {
                            if (i17 == 9) {
                                int i19 = a9Var.q;
                                if (i19 != 0) {
                                    if (i19 != 1) {
                                        if (i19 != 5) {
                                            if (i19 == 6) {
                                                t9Var.C = false;
                                                n9Var.g(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = n9Var.getContext();
                                            b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, b6Var);
                                            c2Var.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = t9Var.c;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            i10 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamrtmpurl, new bg.b0(n9Var, c2Var, getgroupcallstreamrtmpurl, 12));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = t9Var.c;
                                        if (inputPeer2 != null) {
                                            clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                                        } else {
                                            i11 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                            clientUserId = UserConfig.getInstance(i11).getClientUserId();
                                        }
                                        b6Var2 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                        x60 F = x60.F(n9Var, b6Var2, view);
                                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bg.i2(n9Var, clientUserId, 9), false);
                                        F.k();
                                        x60.f(F, t9Var.i1().B(clientUserId, true), t9Var.v, false, null, new fh.f1(13, n9Var, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    kh.v9 v9Var = t9Var.Y;
                                    if (v9Var != null) {
                                        v9Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof org.telegram.ui.Cells.p8) {
                            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                            p8Var.setChecked(!p8Var.b());
                            a9Var.k = p8Var.b();
                            int i20 = a9Var.c;
                            if (i20 != 0) {
                                if (i20 != 1) {
                                    if (i20 == 2) {
                                        t9Var.w = p8Var.b();
                                        n9Var.g(true);
                                        break;
                                    }
                                } else {
                                    boolean b10 = p8Var.b();
                                    t9Var.y = b10;
                                    boolean z10 = t9Var.c instanceof TLRPC.TL_inputPeerChannel;
                                    if (b10) {
                                        org.telegram.ui.ActionBar.d3 d3Var = t9Var.container;
                                        b6Var4 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                        gc G = new oc(d3Var, b6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z10 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                        G.j = 5000;
                                        G.k(true);
                                    } else {
                                        org.telegram.ui.ActionBar.d3 d3Var2 = t9Var.container;
                                        b6Var3 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                        gc G2 = new oc(d3Var2, b6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z10 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                        G2.j = 5000;
                                        G2.k(true);
                                    }
                                    n9Var.g(true);
                                    break;
                                }
                            } else {
                                boolean b11 = p8Var.b();
                                t9Var.x = b11;
                                boolean z11 = t9Var.J == 4;
                                if (!b11) {
                                    org.telegram.ui.ActionBar.d3 d3Var3 = t9Var.container;
                                    b6Var5 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                    gc G3 = new oc(d3Var3, b6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z11 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                    G3.j = 5000;
                                    G3.k(true);
                                    break;
                                } else {
                                    org.telegram.ui.ActionBar.d3 d3Var4 = t9Var.container;
                                    b6Var6 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                    gc G4 = new oc(d3Var4, b6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z11 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!a9Var.n || !t9Var.B) {
                        int i21 = a9Var.i;
                        if (i21 != 1) {
                            if (i21 != 3) {
                                if (i21 != 2) {
                                    if (i21 != 4) {
                                        if (i21 > 0) {
                                            arrayList3.clear();
                                            hashMap.clear();
                                            t9Var.J = a9Var.i;
                                            f9Var.c.a();
                                        } else {
                                            TLRPC.Chat chat = a9Var.h;
                                            if (chat != null) {
                                                long j10 = chat.id;
                                                if (kh.t9.d1(t9Var, chat) > 200) {
                                                    try {
                                                        n9Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    Context context3 = n9Var.getContext();
                                                    b6Var7 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, b6Var7);
                                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.GroupTooLarge);
                                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GroupTooLargeMessage);
                                                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        while (i18 < size) {
                                                            Object obj = arrayList4.get(i18);
                                                            i18++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j10));
                                                    n9Var.i(true);
                                                } else {
                                                    i12 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                                                    i13 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i13).getChatFull(j10);
                                                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                        org.telegram.ui.ActionBar.c2 c2Var2 = n9Var.C;
                                                        if (c2Var2 != null) {
                                                            c2Var2.dismiss();
                                                            n9Var.C = null;
                                                        }
                                                        n9Var.D = j10;
                                                        Context context4 = n9Var.getContext();
                                                        b6Var8 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                                                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(context4, 3, b6Var8);
                                                        n9Var.C = c2Var3;
                                                        c2Var3.q(50L);
                                                        i14 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                                        messagesStorage.getStorageQueue().postRunnable(new gh.e2(n9Var, chat2, messagesStorage, j10, 12));
                                                    } else {
                                                        n9Var.d(j10, chatFull.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(n9Var.E)) {
                                                        f9Var.setText("");
                                                        n9Var.E = null;
                                                        n9Var.g(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = a9Var.g;
                                                if (user != null) {
                                                    if (n9Var.a == 0) {
                                                        t9Var.J = 0;
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
                                                        if (!TextUtils.isEmpty(n9Var.E)) {
                                                            f9Var.setText("");
                                                            n9Var.E = null;
                                                            n9Var.g(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j11);
                                                    }
                                                    arrayList3.clear();
                                                    arrayList3.addAll(hashSet);
                                                    n9Var.i(true);
                                                }
                                            }
                                        }
                                        n9Var.f(true);
                                        n9Var.e(true);
                                        f9Var.G = true;
                                        break;
                                    } else {
                                        if (t9Var.J == 4) {
                                            t9Var.I = 4;
                                            t9Var.b.D(1);
                                        }
                                        t9Var.J = 4;
                                        n9Var.f(true);
                                        break;
                                    }
                                } else {
                                    if (t9Var.J == 2) {
                                        t9Var.I = 2;
                                        t9Var.b.D(1);
                                    }
                                    t9Var.J = 2;
                                    n9Var.f(true);
                                    break;
                                }
                            } else {
                                if (t9Var.J == 3 || (t9Var.n.isEmpty() && t9Var.r.isEmpty())) {
                                    t9Var.I = 3;
                                    t9Var.b.D(1);
                                }
                                t9Var.J = 3;
                                n9Var.f(true);
                                break;
                            }
                        } else {
                            if (t9Var.J == 1 || kh.t9.I0(t9Var).isEmpty()) {
                                t9Var.I = 1;
                                t9Var.b.D(1);
                            }
                            t9Var.J = 1;
                            n9Var.f(true);
                            break;
                        }
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        boolean z12 = t9Var.G;
                        TLRPC.InputPeer inputPeer3 = t9Var.c;
                        kh.d9 d9Var = new kh.d9(n9Var, 0);
                        b6Var9 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                        new kh.u8(context, i15, z12, inputPeer3, d9Var, b6Var9).show();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.b;
                org.telegram.ui.p3 p3Var = (org.telegram.ui.p3) this.c;
                if (l4Var.G == null || i16 - 1 >= 0) {
                    org.telegram.ui.Cells.n9 n9Var2 = l4Var.K0;
                    if (n9Var2 != null) {
                        if (n9Var2.y()) {
                            l4Var.K0.f(false);
                            break;
                        } else {
                            l4Var.K0.f(false);
                        }
                    }
                    org.telegram.ui.j4 adapter = p3Var.getAdapter();
                    if ((view instanceof org.telegram.ui.s3) && adapter.A != null) {
                        org.telegram.ui.s3 s3Var = (org.telegram.ui.s3) view;
                        if (l4Var.C0 == 0) {
                            if ((!s3Var.c || f10 >= view.getMeasuredWidth() / 2) && !s3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(l4Var.T).getUserOrChat("previews");
                                if (!(userOrChat instanceof TLRPC.TL_user)) {
                                    int i22 = UserConfig.selectedAccount;
                                    long j12 = adapter.A.id;
                                    l4Var.b0(true);
                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                    tL_contacts_resolveUsername.username = "previews";
                                    l4Var.C0 = ConnectionsManager.getInstance(i22).sendRequest(tL_contacts_resolveUsername, new yd(l4Var, i22, j12));
                                    break;
                                } else {
                                    l4Var.P(adapter.A.id, (TLRPC.User) userOrChat);
                                    break;
                                }
                            }
                        }
                    } else if (i16 >= 0 && i16 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i16);
                        TL_iv.PageBlock z13 = org.telegram.ui.l4.z(pageBlock);
                        if (z13 instanceof org.telegram.ui.z3) {
                            z13 = ((org.telegram.ui.z3) z13).b;
                        }
                        if (!(z13 instanceof TL_iv.pageBlockChannel)) {
                            if (!(z13 instanceof org.telegram.ui.f4)) {
                                if (z13 instanceof TL_iv.pageBlockDetails) {
                                    View y10 = org.telegram.ui.l4.y(view);
                                    if (y10 instanceof org.telegram.ui.o1) {
                                        l4Var.d = null;
                                        l4Var.f = null;
                                        if (adapter.e.indexOf(pageBlock) >= 0) {
                                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                            pageblockdetails.open = !pageblockdetails.open;
                                            int h = adapter.h();
                                            adapter.M();
                                            int abs = Math.abs(adapter.h() - h);
                                            org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) y10;
                                            o1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                            o1Var.invalidate();
                                            if (abs != 0) {
                                                if (!pageblockdetails.open) {
                                                    adapter.t(i16 + 1, abs);
                                                    break;
                                                } else {
                                                    adapter.s(i16 + 1, abs);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                org.telegram.ui.f4 f4Var = (org.telegram.ui.f4) z13;
                                l4Var.Q(f4Var.a.articles.get(f4Var.b).url, null, null);
                                break;
                            }
                        } else {
                            MessagesController.getInstance(l4Var.T).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), l4Var.I, 2);
                            l4Var.o(false, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // kh.w8
    public void d(kh.r9 r9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i9, kh.o8 o8Var, kh.f1 f1Var) {
        b4 b4Var = (b4) this.b;
        kh.t9 t9Var = (kh.t9) this.c;
        i4 i4Var = b4Var.l;
        g4 g4Var = i4Var.K1;
        TL_stories.StoryItem storyItem = g4Var.a;
        if ((storyItem != null && storyItem.pinned) != z12) {
            MessagesController.getInstance(i4Var.y2).getStoriesController().o0(i4Var.x1, i4Var.r1, z12, null);
        }
        TL_stories.StoryItem storyItem2 = g4Var.a;
        if (storyItem2 != null) {
            TLRPC.MessageMedia messageMedia = storyItem2.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i9);
                ConnectionsManager.getInstance(i4Var.y2).sendRequest(togglegroupcallsettings, new bg.j0(11, b4Var, t9Var));
            }
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        vh vhVar = (vh) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        qn qnVar = vhVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", qnVar.P5);
        qnVar.presentFragment(new ProfileActivity(bundle, null));
        qnVar.A7(true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                b4 b4Var = (b4) this.b;
                f1 f1Var = ((m9) this.c).w0;
                if (f1Var == null) {
                    i4.f0(b4Var.l);
                    break;
                } else if (!f1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = f1Var.f;
                    ConnectionsManager.getInstance(f1Var.e).sendRequest(discardgroupcall, new y0(f1Var, 4));
                    f1Var.e();
                    break;
                }
                break;
            case 4:
                mh.u3.x0((mh.u3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 6:
                of.f1 f1Var2 = (of.f1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f1Var2.getClass();
                zArr[0] = true;
                f1Var2.Q();
                break;
            case 9:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                c2Var.dismiss();
                p4Var.V(view, true);
                break;
            case 11:
                ve.e.o(((pb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 13:
                id.U((id) this.b, (TLRPC.Chat) this.c);
                break;
            case 23:
                vo voVar = (vo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                voVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new io(voVar, 0), 64);
                break;
            case 27:
                org.telegram.ui.Components.e0.O((org.telegram.ui.Components.e0) this.b, (TL_aicompose.TL_aiComposeTone) this.c, c2Var);
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
                int i10 = iArr[0];
                intCallback.run(i10 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i10 == 1 ? 3600 : i10 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.nf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bq) this.b).o0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        on onVar = (on) this.b;
        jb0 jb0Var = (jb0) this.c;
        Pair pair = (Pair) obj;
        onVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.b4 b4Var = onVar.f;
        if (b4Var == null || longValue != b4Var.i(onVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        jb0Var.x = bitmap;
        jb0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        qn.f0((qn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        org.telegram.ui.z5 z5Var = (org.telegram.ui.z5) this.b;
        dy dyVar2 = (dy) this.c;
        ArrayList arrayList2 = z5Var.c;
        dyVar2.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= z5Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) z5Var.d.get(i13)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) z5Var.d.get(i13);
                    break;
                }
                i13++;
            }
            if (!z12) {
                int i14 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (z5Var.getMessagesController().getCacheByChatsController().getKeepMedia(z5Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i14 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = z5Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, i14);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i12++;
        }
        z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.e, z5Var.d);
        z5Var.T();
        if (keepMediaException != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.y5) arrayList2.get(i15)).c != null && ((org.telegram.ui.y5) arrayList2.get(i15)).c.dialogId == keepMediaException.dialogId) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            z5Var.b.u0(i11);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(14, z5Var, keepMediaException), 150L);
        }
        return true;
    }

    public /* synthetic */ v3(gb gbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.a = 12;
        this.b = gbVar;
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
                ho hoVar = (ho) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                hoVar.getClass();
                c2Var.dismiss();
                hoVar.J0 = false;
                if (j10 != 0) {
                    hoVar.s0 = j10;
                    TLRPC.Chat chat = hoVar.getMessagesController().getChat(Long.valueOf(j10));
                    hoVar.t0 = chat;
                    TLRPC.ChatFull chatFull = hoVar.u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != hoVar.D0;
                    hoVar.getMessagesController().toggleChannelForum(hoVar.s0, hoVar.B0, hoVar.D0);
                    TLRPC.Chat chat2 = hoVar.t0;
                    chat2.forum = hoVar.B0;
                    chat2.forum_tabs = hoVar.D0;
                    if (z10) {
                        hoVar.p0();
                        break;
                    }
                }
                break;
            case 23:
            default:
                dp dpVar = (dp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j10 == 0) {
                    dpVar.getClass();
                    break;
                } else {
                    hp hpVar = dpVar.x.d;
                    if (hpVar.s) {
                        hpVar.v.set(0, hpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        hpVar.A = j10;
                        hpVar.f = hpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 24:
                hp hpVar2 = (hp) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                if (j10 == 0) {
                    hpVar2.getClass();
                    break;
                } else {
                    hpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    hpVar2.X(hpVar2.getMessagesController().getChat(Long.valueOf(j10)), o2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        bj bjVar = (bj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        qn qnVar = bjVar.b;
        long j11 = qnVar.Z3;
        if (j10 != j11) {
            return;
        }
        qnVar.qa(j11, false);
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

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }

    private final /* synthetic */ void i(View view, float f10, float f11) {
    }
}
