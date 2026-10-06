package ah;

import ai.c6;
import ai.d2;
import ai.e6;
import ai.g3;
import ai.jc;
import ai.p3;
import ai.q5;
import ai.q8;
import ai.s5;
import ai.v1;
import ai.v5;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.b1;
import b2.j1;
import b2.k1;
import b2.l1;
import b2.m1;
import b2.p1;
import b2.q1;
import ci.ca;
import ci.e9;
import ci.ea;
import ci.g9;
import ci.ga;
import ci.j9;
import ci.m9;
import ci.q9;
import ci.x8;
import ci.x9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import e9.k0;
import e9.o1;
import ei.f4;
import hg.w;
import hg.z;
import ii.i1;
import ii.j4;
import ii.j6;
import ii.l0;
import ii.p0;
import ii.r;
import ii.t5;
import ii.u3;
import ii.x3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import m4.a0;
import m4.a1;
import m4.e1;
import m4.g1;
import m4.j0;
import m4.o0;
import m4.y0;
import m4.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q;
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.bd0;
import org.telegram.ui.gd0;
import org.telegram.ui.uc0;
import u2.b0;
import v7.l8;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements hh.i, g9, a2, OnFailureListener, q9.d, nl0, OnCompleteListener, Continuation, ol0, Utilities.Callback3Return, bd0, p0, cu, j4, e2.n, e2.m, j0, e2.h, z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q9.d
    public Object E(cf.c cVar) {
        String str = (String) this.b;
        q9.a aVar = (q9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.E(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // ii.p0
    public b80 a(i1 i1Var) {
        of.b bVar = (of.b) this.b;
        d6 d6Var = (d6) this.c;
        r rVar = (r) bVar.c;
        b80 b80Var = new b80(rVar, d6Var, i1Var, false, false, true);
        rVar.H = b80Var;
        return b80Var;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 26:
                a1 a1Var = (a1) this.b;
                q1 q1Var = (q1) this.c;
                e1 e1Var = (e1) obj;
                a1Var.getClass();
                k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    p1 c10 = q1Var.a().c();
                    o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        m1 m1Var = (m1) it.next();
                        l1 l1Var = (l1) a1Var.d.n.get(m1Var.a.b);
                        if (l1Var == null || m1Var.a.a != l1Var.a) {
                            c10.a(m1Var);
                        } else {
                            c10.a(new m1(l1Var, m1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                e1Var.q(q1Var);
                break;
            default:
                a1 a1Var2 = (a1) this.b;
                m4.r rVar = (m4.r) this.c;
                a0 a0Var = (a0) a1Var2.a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    break;
                }
                break;
        }
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
    
        r2.X();
        r2.a.f3.N(true);
        r2.S(true);
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
    @Override // org.telegram.ui.bd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        hg.e1 e1Var = (hg.e1) this.b;
        gd0 gd0Var = (gd0) this.c;
        e1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(e1Var.y)) {
            uc0 uc0Var = gd0Var.T;
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        d6 d6Var;
        int i11;
        int i12;
        long clientUserId;
        d6 d6Var2;
        d6 d6Var3;
        d6 d6Var4;
        d6 d6Var5;
        d6 d6Var6;
        d6 d6Var7;
        int i13;
        int i14;
        d6 d6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        d6 d6Var9;
        x9 x9Var = (x9) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = x9Var.L;
        a0.i iVar = x9Var.b;
        q9 q9Var = x9Var.x;
        ArrayList arrayList3 = x9Var.c;
        HashMap hashMap = x9Var.d;
        ea eaVar = x9Var.W;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        j9 j9Var = (j9) arrayList2.get(i10);
        int i17 = j9Var.a;
        int i18 = 0;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i19 = j9Var.q;
                    if (i19 == 0) {
                        ga gaVar = eaVar.c0;
                        if (gaVar != null) {
                            gaVar.run();
                            return;
                        }
                        return;
                    }
                    if (i19 == 1) {
                        TLRPC.InputPeer inputPeer = eaVar.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((f3) eaVar).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        d6Var2 = ((f3) eaVar).resourcesProvider;
                        b80 F = b80.F(x9Var, d6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(x9Var, clientUserId, 5), false);
                        F.k();
                        b80.f(F, eaVar.i1().B(clientUserId, true), eaVar.v, false, null, new g3(5, x9Var, F));
                        F.Z();
                        return;
                    }
                    if (i19 != 5) {
                        if (i19 == 6) {
                            eaVar.G = false;
                            x9Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = x9Var.getContext();
                    d6Var = ((f3) eaVar).resourcesProvider;
                    b2 b2Var = new b2(context2, 3, d6Var);
                    b2Var.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = eaVar.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((f3) eaVar).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new s5(x9Var, b2Var, getgroupcallstreamrtmpurl, 1));
                    return;
                }
                return;
            }
            if (view instanceof r8) {
                r8 r8Var = (r8) view;
                r8Var.setChecked(!r8Var.b());
                j9Var.k = r8Var.b();
                int i20 = j9Var.c;
                if (i20 == 0) {
                    boolean b10 = r8Var.b();
                    eaVar.x = b10;
                    boolean z10 = eaVar.N == 4;
                    if (b10) {
                        d3 d3Var = eaVar.container;
                        d6Var6 = ((f3) eaVar).resourcesProvider;
                        rc G = new yc(d3Var, d6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    d3 d3Var2 = eaVar.container;
                    d6Var5 = ((f3) eaVar).resourcesProvider;
                    rc G2 = new yc(d3Var2, d6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i20 != 1) {
                    if (i20 == 2) {
                        eaVar.w = r8Var.b();
                        x9Var.g(true);
                        return;
                    }
                    return;
                }
                boolean b11 = r8Var.b();
                eaVar.y = b11;
                boolean z11 = eaVar.c instanceof TLRPC.TL_inputPeerChannel;
                if (b11) {
                    d3 d3Var3 = eaVar.container;
                    d6Var4 = ((f3) eaVar).resourcesProvider;
                    rc G3 = new yc(d3Var3, d6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    d3 d3Var4 = eaVar.container;
                    d6Var3 = ((f3) eaVar).resourcesProvider;
                    rc G4 = new yc(d3Var4, d6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                x9Var.g(true);
                return;
            }
            return;
        }
        if (j9Var.n && eaVar.F) {
            i16 = ((f3) eaVar).currentAccount;
            boolean z12 = eaVar.K;
            TLRPC.InputPeer inputPeer3 = eaVar.c;
            m9 m9Var = new m9(x9Var, 0);
            d6Var9 = ((f3) eaVar).resourcesProvider;
            new e9(context, i16, z12, inputPeer3, m9Var, d6Var9).show();
            return;
        }
        int i21 = j9Var.i;
        if (i21 == 1) {
            if (eaVar.N == 1 || ea.J0(eaVar).isEmpty()) {
                eaVar.M = 1;
                eaVar.b.E(1);
            }
            eaVar.N = 1;
            x9Var.f(true);
            return;
        }
        if (i21 == 3) {
            if (eaVar.N == 3 || (eaVar.n.isEmpty() && eaVar.r.isEmpty())) {
                eaVar.M = 3;
                eaVar.b.E(1);
            }
            eaVar.N = 3;
            x9Var.f(true);
            return;
        }
        if (i21 == 2) {
            if (eaVar.N == 2) {
                eaVar.M = 2;
                eaVar.b.E(1);
            }
            eaVar.N = 2;
            x9Var.f(true);
            return;
        }
        if (i21 == 4) {
            if (eaVar.N == 4) {
                eaVar.M = 4;
                eaVar.b.E(1);
            }
            eaVar.N = 4;
            x9Var.f(true);
            return;
        }
        if (i21 > 0) {
            arrayList3.clear();
            hashMap.clear();
            eaVar.N = j9Var.i;
            q9Var.c.a();
        } else {
            TLRPC.Chat chat = j9Var.h;
            if (chat != null) {
                long j3 = chat.id;
                if (ea.d1(eaVar, chat) > 200) {
                    try {
                        x9Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = x9Var.getContext();
                    d6Var7 = ((f3) eaVar).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, d6Var7);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                    q.o(R.string.OK, alertDialog$Builder, null);
                } else if (hashMap.containsKey(Long.valueOf(j3))) {
                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (i18 < size) {
                            Object obj = arrayList4.get(i18);
                            i18++;
                            iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                        }
                    }
                    hashMap.remove(Long.valueOf(j3));
                    x9Var.i(true);
                } else {
                    i13 = ((f3) eaVar).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                    i14 = ((f3) eaVar).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j3);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        b2 b2Var2 = x9Var.G;
                        if (b2Var2 != null) {
                            b2Var2.dismiss();
                            x9Var.G = null;
                        }
                        x9Var.H = j3;
                        Context context4 = x9Var.getContext();
                        d6Var8 = ((f3) eaVar).resourcesProvider;
                        b2 b2Var3 = new b2(context4, 3, d6Var8);
                        x9Var.G = b2Var3;
                        b2Var3.q(50L);
                        i15 = ((f3) eaVar).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new q8(x9Var, chat2, messagesStorage, j3, 4));
                    } else {
                        x9Var.d(j3, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(x9Var.I)) {
                        q9Var.setText("");
                        x9Var.I = null;
                        x9Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = j9Var.g;
                if (user != null) {
                    if (x9Var.a == 0) {
                        eaVar.N = 0;
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
                        if (!TextUtils.isEmpty(x9Var.I)) {
                            q9Var.setText("");
                            x9Var.I = null;
                            x9Var.g(false);
                        }
                        iVar.k(Boolean.TRUE, j10);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    x9Var.i(true);
                }
            }
        }
        x9Var.f(true);
        x9Var.e(true);
        q9Var.K = true;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        return f4.G0((f4) this.b, (Context) this.c, view, i10);
    }

    @Override // e2.n
    public void e(Object obj, b2.q qVar) {
        j2.b bVar = (j2.b) obj;
        bVar.d((b1) this.c, new of.b(qVar, ((j2.f) this.b).e));
    }

    @Override // m4.j0
    public void f(m4.r rVar) {
        switch (this.a) {
            case 24:
                m4.k0 k0Var = (m4.k0) this.b;
                Bundle bundle = (Bundle) this.c;
                a0 a0Var = k0Var.g;
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
                    e1 e1Var = k0Var2.g.t;
                    if (e1Var.m0(17)) {
                        k1 w02 = e1Var.w0();
                        j1 j1Var = new j1();
                        for (int i10 = 0; i10 < w02.o(); i10++) {
                            if (TextUtils.equals(w02.m(i10, j1Var, 0L).c.a, str)) {
                                e1Var.R(i10);
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

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                v5 v5Var = (v5) this.b;
                d2 d2Var = ((jc) this.c).A0;
                if (d2Var == null) {
                    e6.f0(v5Var.l);
                    break;
                } else if (!d2Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = d2Var.f;
                    ConnectionsManager.getInstance(d2Var.e).sendRequest(discardgroupcall, new ai.q1(d2Var, 4));
                    d2Var.e();
                    break;
                }
                break;
            case 10:
                f4.D0((f4) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 12:
                gg.k1 k1Var = (gg.k1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                k1Var.getClass();
                zArr[0] = true;
                k1Var.Q();
                break;
            default:
                z.d(r4.currentAccount).a((w) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // m4.z0
    public Object h(a0 a0Var, m4.r rVar, int i10) {
        switch (this.a) {
            case 28:
                return a0Var.j() ? l8.b(new m4.k1(-100)) : d0.d0((i9.w) ((z0) this.b).h(a0Var, rVar, i10), new q5(a0Var, rVar, (o0) this.c, 14));
            default:
                return a0Var.j() ? l8.b(new m4.k1(-100)) : d0.d0((i9.w) ((z0) this.b).h(a0Var, rVar, i10), new q5(a0Var, rVar, (y0) this.c, 15));
        }
    }

    @Override // ci.g9
    public void i(ca caVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, x8 x8Var, androidx.fragment.app.a0 a0Var) {
        switch (this.a) {
            case 1:
                e6 e6Var = (e6) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(e6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = caVar.b;
                ConnectionsManager.getInstance(e6Var.C2).sendRequest(tL_stories_editStory, new p3(e6Var, x8Var, storyItem, caVar, 0));
                break;
            default:
                v5 v5Var = (v5) this.b;
                ea eaVar = (ea) this.c;
                e6 e6Var2 = v5Var.l;
                c6 c6Var = e6Var2.O1;
                TL_stories.StoryItem storyItem2 = c6Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(e6Var2.C2).getStoriesController().o0(e6Var2.B1, e6Var2.v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = c6Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(e6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, v5Var, eaVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 21:
                ((j2.b) obj).e((j2.a) this.b, (b0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cu
    public void j() {
        switch (this.a) {
            case 17:
                l0 l0Var = (l0) this.b;
                ii.k0 k0Var = (ii.k0) this.c;
                l0Var.i();
                k0Var.v0();
                break;
            default:
                ii.q5 q5Var = (ii.q5) this.b;
                t5 t5Var = (t5) this.c;
                TL_iv.pageTableCell pagetablecell = t5Var.b;
                if (pagetablecell != null) {
                    j6.d(pagetablecell, t5Var.a.getText());
                }
                ii.d3 d3Var = q5Var.E;
                if (d3Var != null && q5Var.a != null) {
                    x3.P1(d3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // hh.i
    public void k(RectF rectF, View view) {
        ch.d dVar = (ch.d) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        dVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e7) {
        w0.i gVar;
        switch (this.a) {
            case 4:
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

    @Override // ii.j4
    public void run(long j3) {
        u3 u3Var = (u3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        u3Var.a(str, tL_inlineButtonTypeUserProfile);
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

    public /* synthetic */ b(j2.a aVar, Object obj, long j3) {
        this.a = 22;
        this.b = aVar;
        this.c = obj;
    }

    public /* synthetic */ b(m4.k0 k0Var, g1 g1Var, Bundle bundle) {
        this.a = 24;
        this.b = k0Var;
        this.c = bundle;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.n nVar = (hg.n) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        nVar.x = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.e);
        hg.j jVar = nVar.r;
        nVar.y = document;
        jVar.setSticker(document);
        ((r8) view).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
