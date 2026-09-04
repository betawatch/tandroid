package ah;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c3;
import bi.c5;
import bi.f5;
import bi.m5;
import bi.o5;
import bi.oa;
import bi.pb;
import bi.t1;
import bi.x7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import di.b7;
import di.ba;
import di.ga;
import di.h9;
import di.ia;
import di.j9;
import di.ka;
import di.m2;
import di.m9;
import di.p9;
import di.t9;
import fi.e4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import ji.b3;
import ji.i4;
import ji.k6;
import ji.s3;
import ji.s5;
import ji.v3;
import ji.v5;
import m4.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.de;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.yc;
import org.telegram.ui.c4;
import org.telegram.ui.dd0;
import org.telegram.ui.g4;
import org.telegram.ui.id0;
import org.telegram.ui.j61;
import org.telegram.ui.m3;
import org.telegram.ui.p3;
import org.telegram.ui.w3;
import org.telegram.ui.wc0;
import v7.l8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements j61, ih.i, j9, a2, OnFailureListener, q9.d, OnCompleteListener, Continuation, al0, bl0, Utilities.Callback3Return, dd0, e2.n, e2.m, ji.o0, xt, i4, m4.j0, m4.e1, org.telegram.ui.Cells.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        String str = (String) this.b;
        q9.a aVar = (q9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.D(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        return e4.B0((e4) this.b, (Context) this.c, view, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.d = true;
        r1.setText(r2.y);
        r1 = r2.f;
        r1.setSelection(r1.getText().length());
        r2.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.Y();
        r2.a.Y2.N(true);
        r2.U(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.E != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.R : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.E = true;
        r1 = r3.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.dd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        ig.e1 e1Var = (ig.e1) this.b;
        id0 id0Var = (id0) this.c;
        e1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(e1Var.y)) {
            wc0 wc0Var = id0Var.T;
        }
    }

    @Override // e2.n
    public void c(Object obj, b2.q qVar) {
        j2.b bVar = (j2.b) obj;
        bVar.b((b2.b1) this.c, new pf.b(qVar, ((j2.f) this.b).e));
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        f6 f6Var;
        int i11;
        int i12;
        long clientUserId;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        f6 f6Var7;
        int i13;
        int i14;
        f6 f6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        f6 f6Var9;
        int i17 = i10;
        switch (this.a) {
            case 10:
                ba baVar = (ba) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList2 = baVar.L;
                a0.i iVar = baVar.b;
                t9 t9Var = baVar.x;
                ArrayList arrayList3 = baVar.c;
                HashMap hashMap = baVar.d;
                ia iaVar = baVar.W;
                if (i17 >= 0 && i17 < arrayList2.size()) {
                    m9 m9Var = (m9) arrayList2.get(i17);
                    int i18 = m9Var.a;
                    int i19 = 0;
                    if (i18 != 3) {
                        if (i18 != 7) {
                            if (i18 == 9) {
                                int i20 = m9Var.q;
                                if (i20 != 0) {
                                    if (i20 != 1) {
                                        if (i20 != 5) {
                                            if (i20 == 6) {
                                                iaVar.G = false;
                                                baVar.g(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = baVar.getContext();
                                            f6Var = ((f3) iaVar).resourcesProvider;
                                            b2 b2Var = new b2(context2, 3, f6Var);
                                            b2Var.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = iaVar.c;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            i11 = ((f3) iaVar).currentAccount;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new c5(baVar, b2Var, getgroupcallstreamrtmpurl, 1));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = iaVar.c;
                                        if (inputPeer2 != null) {
                                            clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                                        } else {
                                            i12 = ((f3) iaVar).currentAccount;
                                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                                        }
                                        f6Var2 = ((f3) iaVar).resourcesProvider;
                                        n70 F = n70.F(baVar, f6Var2, view);
                                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bi.g(baVar, clientUserId, 5), false);
                                        F.k();
                                        n70.f(F, iaVar.i1().B(clientUserId, true), iaVar.v, false, null, new m2(4, baVar, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    ka kaVar = iaVar.c0;
                                    if (kaVar != null) {
                                        kaVar.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof r8) {
                            r8 r8Var = (r8) view;
                            r8Var.setChecked(!r8Var.b());
                            m9Var.k = r8Var.b();
                            int i21 = m9Var.c;
                            if (i21 != 0) {
                                if (i21 != 1) {
                                    if (i21 == 2) {
                                        iaVar.w = r8Var.b();
                                        baVar.g(true);
                                        break;
                                    }
                                } else {
                                    boolean b10 = r8Var.b();
                                    iaVar.y = b10;
                                    boolean z10 = iaVar.c instanceof TLRPC.TL_inputPeerChannel;
                                    if (b10) {
                                        d3 d3Var = iaVar.container;
                                        f6Var4 = ((f3) iaVar).resourcesProvider;
                                        qc G = new yc(d3Var, f6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z10 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                        G.j = 5000;
                                        G.k(true);
                                    } else {
                                        d3 d3Var2 = iaVar.container;
                                        f6Var3 = ((f3) iaVar).resourcesProvider;
                                        qc G2 = new yc(d3Var2, f6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z10 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                        G2.j = 5000;
                                        G2.k(true);
                                    }
                                    baVar.g(true);
                                    break;
                                }
                            } else {
                                boolean b11 = r8Var.b();
                                iaVar.x = b11;
                                boolean z11 = iaVar.N == 4;
                                if (!b11) {
                                    d3 d3Var3 = iaVar.container;
                                    f6Var5 = ((f3) iaVar).resourcesProvider;
                                    qc G3 = new yc(d3Var3, f6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z11 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                    G3.j = 5000;
                                    G3.k(true);
                                    break;
                                } else {
                                    d3 d3Var4 = iaVar.container;
                                    f6Var6 = ((f3) iaVar).resourcesProvider;
                                    qc G4 = new yc(d3Var4, f6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z11 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!m9Var.n || !iaVar.F) {
                        int i22 = m9Var.i;
                        if (i22 != 1) {
                            if (i22 != 3) {
                                if (i22 != 2) {
                                    if (i22 != 4) {
                                        if (i22 > 0) {
                                            arrayList3.clear();
                                            hashMap.clear();
                                            iaVar.N = m9Var.i;
                                            t9Var.c.a();
                                        } else {
                                            TLRPC.Chat chat = m9Var.h;
                                            if (chat != null) {
                                                long j3 = chat.id;
                                                if (ia.d1(iaVar, chat) > 200) {
                                                    try {
                                                        baVar.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    Context context3 = baVar.getContext();
                                                    f6Var7 = ((f3) iaVar).resourcesProvider;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, f6Var7);
                                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                                    i2.g.B(R.string.OK, alertDialog$Builder, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        while (i19 < size) {
                                                            Object obj = arrayList4.get(i19);
                                                            i19++;
                                                            iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j3));
                                                    baVar.i(true);
                                                } else {
                                                    i13 = ((f3) iaVar).currentAccount;
                                                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                                                    i14 = ((f3) iaVar).currentAccount;
                                                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j3);
                                                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                        b2 b2Var2 = baVar.G;
                                                        if (b2Var2 != null) {
                                                            b2Var2.dismiss();
                                                            baVar.G = null;
                                                        }
                                                        baVar.H = j3;
                                                        Context context4 = baVar.getContext();
                                                        f6Var8 = ((f3) iaVar).resourcesProvider;
                                                        b2 b2Var3 = new b2(context4, 3, f6Var8);
                                                        baVar.G = b2Var3;
                                                        b2Var3.q(50L);
                                                        i15 = ((f3) iaVar).currentAccount;
                                                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                                                        messagesStorage.getStorageQueue().postRunnable(new x7(baVar, chat2, messagesStorage, j3, 4));
                                                    } else {
                                                        baVar.d(j3, chatFull.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(baVar.I)) {
                                                        t9Var.setText("");
                                                        baVar.I = null;
                                                        baVar.g(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = m9Var.g;
                                                if (user != null) {
                                                    if (baVar.a == 0) {
                                                        iaVar.N = 0;
                                                    }
                                                    long j10 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList3);
                                                    if (arrayList3.contains(Long.valueOf(j10))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j10));
                                                        iVar.k(Boolean.FALSE, j10);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j10))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j10));
                                                        if (!TextUtils.isEmpty(baVar.I)) {
                                                            t9Var.setText("");
                                                            baVar.I = null;
                                                            baVar.g(false);
                                                        }
                                                        iVar.k(Boolean.TRUE, j10);
                                                    }
                                                    arrayList3.clear();
                                                    arrayList3.addAll(hashSet);
                                                    baVar.i(true);
                                                }
                                            }
                                        }
                                        baVar.f(true);
                                        baVar.e(true);
                                        t9Var.K = true;
                                        break;
                                    } else {
                                        if (iaVar.N == 4) {
                                            iaVar.M = 4;
                                            iaVar.b.D(1);
                                        }
                                        iaVar.N = 4;
                                        baVar.f(true);
                                        break;
                                    }
                                } else {
                                    if (iaVar.N == 2) {
                                        iaVar.M = 2;
                                        iaVar.b.D(1);
                                    }
                                    iaVar.N = 2;
                                    baVar.f(true);
                                    break;
                                }
                            } else {
                                if (iaVar.N == 3 || (iaVar.n.isEmpty() && iaVar.r.isEmpty())) {
                                    iaVar.M = 3;
                                    iaVar.b.D(1);
                                }
                                iaVar.N = 3;
                                baVar.f(true);
                                break;
                            }
                        } else {
                            if (iaVar.N == 1 || ia.J0(iaVar).isEmpty()) {
                                iaVar.M = 1;
                                iaVar.b.D(1);
                            }
                            iaVar.N = 1;
                            baVar.f(true);
                            break;
                        }
                    } else {
                        i16 = ((f3) iaVar).currentAccount;
                        boolean z12 = iaVar.K;
                        TLRPC.InputPeer inputPeer3 = iaVar.c;
                        p9 p9Var = new p9(baVar, 0);
                        f6Var9 = ((f3) iaVar).resourcesProvider;
                        new h9(context, i16, z12, inputPeer3, p9Var, f6Var9).show();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.b;
                m3 m3Var = (m3) this.c;
                if (i4Var.K == null || i17 - 1 >= 0) {
                    q9 q9Var = i4Var.O0;
                    if (q9Var != null) {
                        if (q9Var.y()) {
                            i4Var.O0.f(false);
                            break;
                        } else {
                            i4Var.O0.f(false);
                        }
                    }
                    g4 adapter = m3Var.getAdapter();
                    if ((view instanceof p3) && adapter.E != null) {
                        p3 p3Var = (p3) view;
                        if (i4Var.G0 == 0) {
                            if ((!p3Var.c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                                if (!(userOrChat instanceof TLRPC.TL_user)) {
                                    int i23 = UserConfig.selectedAccount;
                                    long j11 = adapter.E.id;
                                    i4Var.b0(true);
                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                    tL_contacts_resolveUsername.username = "previews";
                                    i4Var.G0 = ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_resolveUsername, new de(i4Var, i23, j11));
                                    break;
                                } else {
                                    i4Var.P(adapter.E.id, (TLRPC.User) userOrChat);
                                    break;
                                }
                            }
                        }
                    } else if (i17 >= 0 && i17 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i17);
                        TL_iv.PageBlock z13 = org.telegram.ui.i4.z(pageBlock);
                        if (z13 instanceof w3) {
                            z13 = ((w3) z13).b;
                        }
                        if (!(z13 instanceof TL_iv.pageBlockChannel)) {
                            if (!(z13 instanceof c4)) {
                                if (z13 instanceof TL_iv.pageBlockDetails) {
                                    View y3 = org.telegram.ui.i4.y(view);
                                    if (y3 instanceof org.telegram.ui.m1) {
                                        i4Var.d = null;
                                        i4Var.f = null;
                                        if (adapter.e.indexOf(pageBlock) >= 0) {
                                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                            pageblockdetails.open = !pageblockdetails.open;
                                            int h = adapter.h();
                                            adapter.M();
                                            int abs = Math.abs(adapter.h() - h);
                                            org.telegram.ui.m1 m1Var = (org.telegram.ui.m1) y3;
                                            m1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                            m1Var.invalidate();
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
                                c4 c4Var = (c4) z13;
                                i4Var.Q(c4Var.a.articles.get(c4Var.b).url, null, null);
                                break;
                            }
                        } else {
                            MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), i4Var.M, 2);
                            i4Var.o(false, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // di.j9
    public void e(ga gaVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, b7 b7Var, oa oaVar) {
        switch (this.a) {
            case 2:
                o5 o5Var = (o5) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(o5Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = gaVar.b;
                ConnectionsManager.getInstance(o5Var.C2).sendRequest(tL_stories_editStory, new c3(o5Var, b7Var, storyItem, gaVar, 0));
                break;
            default:
                f5 f5Var = (f5) this.b;
                ia iaVar = (ia) this.c;
                o5 o5Var2 = f5Var.l;
                m5 m5Var = o5Var2.O1;
                TL_stories.StoryItem storyItem2 = m5Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(o5Var2.C2).getStoriesController().o0(o5Var2.B1, o5Var2.v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = m5Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(o5Var2.C2).sendRequest(togglegroupcallsettings, new bi.m1(1, f5Var, iaVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // m4.j0
    public void f(m4.r rVar) {
        switch (this.a) {
            case 24:
                m4.k0 k0Var = (m4.k0) this.b;
                Bundle bundle = (Bundle) this.c;
                m4.a0 a0Var = k0Var.g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                a0Var.n(rVar);
                break;
            default:
                m4.k0 k0Var2 = (m4.k0) this.b;
                n4.l lVar = (n4.l) this.c;
                k0Var2.getClass();
                String str = lVar.a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    m4.j1 j1Var = k0Var2.g.t;
                    if (j1Var.m0(17)) {
                        b2.k1 w02 = j1Var.w0();
                        b2.j1 j1Var2 = new b2.j1();
                        for (int i10 = 0; i10 < w02.o(); i10++) {
                            if (TextUtils.equals(w02.m(i10, j1Var2, 0L).c.a, str)) {
                                j1Var.R(i10);
                                break;
                            }
                        }
                        break;
                    } else {
                        e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                f5 f5Var = (f5) this.b;
                t1 t1Var = ((pb) this.c).A0;
                if (t1Var == null) {
                    o5.f0(f5Var.l);
                    break;
                } else if (!t1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = t1Var.f;
                    ConnectionsManager.getInstance(t1Var.e).sendRequest(discardgroupcall, new bi.i1(t1Var, 4));
                    t1Var.e();
                    break;
                }
                break;
            case 11:
                e4.y0((e4) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 13:
                hg.k1 k1Var = (hg.k1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                k1Var.getClass();
                zArr[0] = true;
                k1Var.Q();
                break;
            default:
                ig.y.d(r4.currentAccount).a((ig.v) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // m4.e1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.a) {
            case 26:
                return a0Var.j() ? l8.b(new p1(-100)) : e2.d0.d0((i9.w) ((m4.e1) this.b).h(a0Var, rVar, i10), new androidx.car.app.utils.a(a0Var, rVar, (m4.t0) this.c, 14));
            default:
                return a0Var.j() ? l8.b(new p1(-100)) : e2.d0.d0((i9.w) ((m4.e1) this.b).h(a0Var, rVar, i10), new androidx.car.app.utils.a(a0Var, rVar, (m4.d1) this.c, 15));
        }
    }

    @Override // ji.o0
    public n70 i(ji.h1 h1Var) {
        n4.y yVar = (n4.y) this.b;
        f6 f6Var = (f6) this.c;
        ji.r rVar = (ji.r) yVar.c;
        n70 n70Var = new n70(rVar, f6Var, h1Var, false, false, true);
        rVar.H = n70Var;
        return n70Var;
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 18:
                ((j2.b) obj).e((j2.a) this.b, (u2.b0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.xt
    public void j() {
        switch (this.a) {
            case 21:
                ji.k0 k0Var = (ji.k0) this.b;
                ji.j0 j0Var = (ji.j0) this.c;
                k0Var.i();
                j0Var.c0();
                break;
            default:
                s5 s5Var = (s5) this.b;
                v5 v5Var = (v5) this.c;
                TL_iv.pageTableCell pagetablecell = v5Var.b;
                if (pagetablecell != null) {
                    k6.d(pagetablecell, v5Var.a.getText());
                }
                b3 b3Var = s5Var.E;
                if (b3Var != null && s5Var.a != null) {
                    v3.N1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ih.i
    public void k(RectF rectF, View view) {
        dh.d dVar = (dh.d) this.b;
        View view2 = (View) this.c;
        dVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e7) {
        w0.i gVar;
        switch (this.a) {
            case 5:
                c1.e eVar = (c1.e) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e7, "e");
                String str = ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e7.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str2);
                    }
                    gVar = new w0.h(str2, 2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        gVar = new w0.k(str2);
                    }
                    gVar = new w0.h(str2, 2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    }
                    gVar = new w0.h(str2, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                eVar.f().execute(new c1.a(eVar, gVar, 0));
                return;
            default:
                d1.e eVar2 = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e7, "e");
                String str3 = ((e7 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e7).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e7.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(str4, 2);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar2.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // ji.i4
    public void run(long j3) {
        s3 s3Var = (s3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        s3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.b;
        String str = (String) this.c;
        synchronized (jVar) {
            ((a0.f) jVar.b).remove(str);
        }
        return task;
    }

    public /* synthetic */ i0(j2.a aVar, Object obj, long j3) {
        this.a = 19;
        this.b = aVar;
        this.c = obj;
    }

    public /* synthetic */ i0(m4.k0 k0Var, m4.l1 l1Var, Bundle bundle) {
        this.a = 24;
        this.b = k0Var;
        this.c = bundle;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        ig.m mVar = (ig.m) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        mVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        ig.i iVar = mVar.n;
        mVar.x = document;
        iVar.setSticker(document);
        ((r8) view).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    private final /* synthetic */ void l(View view, float f7, float f10) {
    }

    private final /* synthetic */ void m(View view, float f7, float f10) {
    }
}
