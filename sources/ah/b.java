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
import b2.l1;
import b2.m1;
import b2.p1;
import b2.q;
import b2.q1;
import ci.da;
import ci.f9;
import ci.fa;
import ci.h9;
import ci.ha;
import ci.k9;
import ci.n9;
import ci.r9;
import ci.y8;
import ci.y9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import e9.k0;
import e9.o1;
import ei.e4;
import gg.k1;
import hg.f1;
import hg.x;
import i9.w;
import ii.d3;
import ii.i1;
import ii.i6;
import ii.j4;
import ii.l0;
import ii.p0;
import ii.p5;
import ii.r;
import ii.u3;
import ii.x3;
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
import org.telegram.messenger.f0;
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
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.cd0;
import org.telegram.ui.qc0;
import org.telegram.ui.xc0;
import u2.b0;
import v7.m8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements hh.i, h9, z1, OnFailureListener, q9.d, ll0, OnCompleteListener, Continuation, ml0, Utilities.Callback3Return, xc0, p0, au, j4, e2.n, e2.m, j0, e2.h, z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        String str = (String) this.b;
        q9.a aVar = (q9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.G(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // ii.p0
    public y70 a(i1 i1Var) {
        of.b bVar = (of.b) this.b;
        d6 d6Var = (d6) this.c;
        r rVar = (r) bVar.c;
        y70 y70Var = new y70(rVar, d6Var, i1Var, false, false, true);
        rVar.H = y70Var;
        return y70Var;
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
    @Override // org.telegram.ui.xc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        f1 f1Var = (f1) this.b;
        cd0 cd0Var = (cd0) this.c;
        f1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(f1Var.y)) {
            qc0 qc0Var = cd0Var.T;
        }
    }

    @Override // org.telegram.ui.Components.ll0
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
        y9 y9Var = (y9) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = y9Var.L;
        a0.i iVar = y9Var.b;
        r9 r9Var = y9Var.x;
        ArrayList arrayList3 = y9Var.c;
        HashMap hashMap = y9Var.d;
        fa faVar = y9Var.W;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        k9 k9Var = (k9) arrayList2.get(i10);
        int i17 = k9Var.a;
        int i18 = 0;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i19 = k9Var.q;
                    if (i19 == 0) {
                        ha haVar = faVar.c0;
                        if (haVar != null) {
                            haVar.run();
                            return;
                        }
                        return;
                    }
                    if (i19 == 1) {
                        TLRPC.InputPeer inputPeer = faVar.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((e3) faVar).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        d6Var2 = ((e3) faVar).resourcesProvider;
                        y70 F = y70.F(y9Var, d6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(y9Var, clientUserId, 5), false);
                        F.k();
                        y70.f(F, faVar.i1().B(clientUserId, true), faVar.v, false, null, new g3(5, y9Var, F));
                        F.Z();
                        return;
                    }
                    if (i19 != 5) {
                        if (i19 == 6) {
                            faVar.G = false;
                            y9Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = y9Var.getContext();
                    d6Var = ((e3) faVar).resourcesProvider;
                    a2 a2Var = new a2(context2, 3, d6Var);
                    a2Var.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = faVar.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((e3) faVar).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new s5(y9Var, a2Var, getgroupcallstreamrtmpurl, 1));
                    return;
                }
                return;
            }
            if (view instanceof r8) {
                r8 r8Var = (r8) view;
                r8Var.setChecked(!r8Var.b());
                k9Var.k = r8Var.b();
                int i20 = k9Var.c;
                if (i20 == 0) {
                    boolean b10 = r8Var.b();
                    faVar.x = b10;
                    boolean z10 = faVar.N == 4;
                    if (b10) {
                        c3 c3Var = faVar.container;
                        d6Var6 = ((e3) faVar).resourcesProvider;
                        qc G = new xc(c3Var, d6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    c3 c3Var2 = faVar.container;
                    d6Var5 = ((e3) faVar).resourcesProvider;
                    qc G2 = new xc(c3Var2, d6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i20 != 1) {
                    if (i20 == 2) {
                        faVar.w = r8Var.b();
                        y9Var.g(true);
                        return;
                    }
                    return;
                }
                boolean b11 = r8Var.b();
                faVar.y = b11;
                boolean z11 = faVar.c instanceof TLRPC.TL_inputPeerChannel;
                if (b11) {
                    c3 c3Var3 = faVar.container;
                    d6Var4 = ((e3) faVar).resourcesProvider;
                    qc G3 = new xc(c3Var3, d6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    c3 c3Var4 = faVar.container;
                    d6Var3 = ((e3) faVar).resourcesProvider;
                    qc G4 = new xc(c3Var4, d6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                y9Var.g(true);
                return;
            }
            return;
        }
        if (k9Var.n && faVar.F) {
            i16 = ((e3) faVar).currentAccount;
            boolean z12 = faVar.K;
            TLRPC.InputPeer inputPeer3 = faVar.c;
            n9 n9Var = new n9(y9Var, 0);
            d6Var9 = ((e3) faVar).resourcesProvider;
            new f9(context, i16, z12, inputPeer3, n9Var, d6Var9).show();
            return;
        }
        int i21 = k9Var.i;
        if (i21 == 1) {
            if (faVar.N == 1 || fa.J0(faVar).isEmpty()) {
                faVar.M = 1;
                faVar.b.D(1);
            }
            faVar.N = 1;
            y9Var.f(true);
            return;
        }
        if (i21 == 3) {
            if (faVar.N == 3 || (faVar.n.isEmpty() && faVar.r.isEmpty())) {
                faVar.M = 3;
                faVar.b.D(1);
            }
            faVar.N = 3;
            y9Var.f(true);
            return;
        }
        if (i21 == 2) {
            if (faVar.N == 2) {
                faVar.M = 2;
                faVar.b.D(1);
            }
            faVar.N = 2;
            y9Var.f(true);
            return;
        }
        if (i21 == 4) {
            if (faVar.N == 4) {
                faVar.M = 4;
                faVar.b.D(1);
            }
            faVar.N = 4;
            y9Var.f(true);
            return;
        }
        if (i21 > 0) {
            arrayList3.clear();
            hashMap.clear();
            faVar.N = k9Var.i;
            r9Var.c.a();
        } else {
            TLRPC.Chat chat = k9Var.h;
            if (chat != null) {
                long j3 = chat.id;
                if (fa.d1(faVar, chat) > 200) {
                    try {
                        y9Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = y9Var.getContext();
                    d6Var7 = ((e3) faVar).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, d6Var7);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                    f0.o(R.string.OK, alertDialog$Builder, null);
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
                    y9Var.i(true);
                } else {
                    i13 = ((e3) faVar).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                    i14 = ((e3) faVar).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j3);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        a2 a2Var2 = y9Var.G;
                        if (a2Var2 != null) {
                            a2Var2.dismiss();
                            y9Var.G = null;
                        }
                        y9Var.H = j3;
                        Context context4 = y9Var.getContext();
                        d6Var8 = ((e3) faVar).resourcesProvider;
                        a2 a2Var3 = new a2(context4, 3, d6Var8);
                        y9Var.G = a2Var3;
                        a2Var3.q(50L);
                        i15 = ((e3) faVar).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new q8(y9Var, chat2, messagesStorage, j3, 4));
                    } else {
                        y9Var.d(j3, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(y9Var.I)) {
                        r9Var.setText("");
                        y9Var.I = null;
                        y9Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = k9Var.g;
                if (user != null) {
                    if (y9Var.a == 0) {
                        faVar.N = 0;
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
                        if (!TextUtils.isEmpty(y9Var.I)) {
                            r9Var.setText("");
                            y9Var.I = null;
                            y9Var.g(false);
                        }
                        iVar.k(Boolean.TRUE, j10);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    y9Var.i(true);
                }
            }
        }
        y9Var.f(true);
        y9Var.e(true);
        r9Var.K = true;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        return e4.B0((e4) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // e2.n
    public void e(Object obj, q qVar) {
        j2.b bVar = (j2.b) obj;
        bVar.d((b1) this.c, new of.b(qVar, ((j2.f) this.b).e));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
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
                e4.y0((e4) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 12:
                k1 k1Var = (k1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                k1Var.getClass();
                zArr[0] = true;
                k1Var.Q();
                break;
            default:
                hg.a0.d(r4.currentAccount).a((x) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // m4.j0
    public void g(m4.r rVar) {
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
                        b2.k1 w02 = e1Var.w0();
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

    @Override // m4.z0
    public Object h(a0 a0Var, m4.r rVar, int i10) {
        switch (this.a) {
            case 28:
                return a0Var.j() ? m8.b(new m4.k1(-100)) : d0.d0((w) ((z0) this.b).h(a0Var, rVar, i10), new q5(a0Var, rVar, (o0) this.c, 14));
            default:
                return a0Var.j() ? m8.b(new m4.k1(-100)) : d0.d0((w) ((z0) this.b).h(a0Var, rVar, i10), new q5(a0Var, rVar, (y0) this.c, 15));
        }
    }

    @Override // hh.i
    public void i(RectF rectF, View view) {
        ch.d dVar = (ch.d) this.b;
        View view2 = (View) this.c;
        dVar.t(rectF.left, rectF.top);
        view2.invalidate();
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

    @Override // org.telegram.ui.Components.au
    public void j() {
        switch (this.a) {
            case 17:
                l0 l0Var = (l0) this.b;
                ii.k0 k0Var = (ii.k0) this.c;
                l0Var.i();
                k0Var.k0();
                break;
            default:
                p5 p5Var = (p5) this.b;
                ii.s5 s5Var = (ii.s5) this.c;
                TL_iv.pageTableCell pagetablecell = s5Var.b;
                if (pagetablecell != null) {
                    i6.d(pagetablecell, s5Var.a.getText());
                }
                d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.a != null) {
                    x3.O1(d3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ci.h9
    public void k(da daVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, y8 y8Var, androidx.fragment.app.a0 a0Var) {
        switch (this.a) {
            case 1:
                e6 e6Var = (e6) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(e6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = daVar.b;
                ConnectionsManager.getInstance(e6Var.C2).sendRequest(tL_stories_editStory, new p3(e6Var, y8Var, storyItem, daVar, 0));
                break;
            default:
                v5 v5Var = (v5) this.b;
                fa faVar = (fa) this.c;
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
                        ConnectionsManager.getInstance(e6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, v5Var, faVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        w0.i gVar;
        switch (this.a) {
            case 4:
                c1.e eVar = (c1.e) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e, "e");
                String str = ((e instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e.getMessage();
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
                kotlin.jvm.internal.i.e(e, "e");
                String str3 = ((e instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
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
        nVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        hg.j jVar = nVar.n;
        nVar.x = document;
        jVar.setSticker(document);
        ((r8) view).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
