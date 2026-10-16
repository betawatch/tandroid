package ah;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.o1;
import b2.p1;
import b2.q1;
import b2.r1;
import b2.t1;
import b2.u1;
import bi.b8;
import bi.e5;
import bi.f3;
import bi.h5;
import bi.o5;
import bi.q5;
import bi.sb;
import bi.v2;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import di.ca;
import di.e9;
import di.ea;
import di.g9;
import di.ga;
import di.j9;
import di.m9;
import di.q9;
import di.x8;
import di.x9;
import di.y6;
import e9.m2;
import fi.f4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import ji.d3;
import ji.k4;
import ji.m6;
import ji.u3;
import ji.u5;
import ji.x3;
import ji.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.gd0;
import org.telegram.ui.ld0;
import org.telegram.ui.r61;
import org.telegram.ui.zc0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements r61, ih.h, g9, z1, OnFailureListener, OnCompleteListener, Continuation, r9.d, bm0, cm0, Utilities.Callback3Return, gd0, e2.p, e2.o, ji.o0, lu, k4, li.n, m4.o0, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        return f4.C0((f4) this.b, (Context) this.c, view, i10);
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 27:
                m4.i1 i1Var = (m4.i1) this.b;
                u1 u1Var = (u1) this.c;
                m4.m1 m1Var = (m4.m1) obj;
                i1Var.getClass();
                e9.q0 q0Var = u1Var.H;
                if (!q0Var.isEmpty()) {
                    t1 c10 = u1Var.a().c();
                    m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        r1 r1Var = (r1) it.next();
                        q1 q1Var = (q1) i1Var.d.n.get(r1Var.a.b);
                        if (q1Var == null || r1Var.a.a != q1Var.a) {
                            c10.a(r1Var);
                        } else {
                            c10.a(new r1(q1Var, r1Var.b));
                        }
                    }
                    u1Var = c10.b();
                }
                m1Var.p(u1Var);
                break;
            case 28:
                m4.i1 i1Var2 = (m4.i1) this.b;
                m4.v vVar = (m4.v) this.c;
                m4.e0 e0Var = (m4.e0) i1Var2.a.get();
                if (e0Var != null && !e0Var.j()) {
                    e0Var.g(vVar, false);
                    break;
                }
                break;
            default:
                m4.i1 i1Var3 = (m4.i1) this.b;
                Surface surface = (Surface) this.c;
                m4.m1 m1Var2 = (m4.m1) obj;
                ((m4.e0) i1Var3.a.get()).getClass();
                if (surface != null) {
                    m4.h1 h1Var = new m4.h1(surface);
                    i1Var3.i = h1Var;
                    m1Var2.T(h1Var);
                    break;
                } else {
                    m1Var2.T(null);
                    i1Var3.i = null;
                    break;
                }
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
        r2.a.W2.N(true);
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
    @Override // org.telegram.ui.gd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        ig.e1 e1Var = (ig.e1) this.b;
        ld0 ld0Var = (ld0) this.c;
        e1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(e1Var.y)) {
            zc0 zc0Var = ld0Var.T;
        }
    }

    @Override // e2.p
    public void c(Object obj, b2.v vVar) {
        j2.b bVar = (j2.b) obj;
        bVar.d((b2.g1) this.c, new qf.b(vVar, ((j2.f) this.b).e));
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
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
        x9 x9Var = (x9) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = x9Var.L;
        a0.h hVar = x9Var.b;
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
                            i12 = ((e3) eaVar).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        c6Var2 = ((e3) eaVar).resourcesProvider;
                        l80 F = l80.F(x9Var, c6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new bi.g(x9Var, clientUserId, 5), false);
                        F.k();
                        l80.f(F, eaVar.j1().B(clientUserId, true), eaVar.v, false, null, new v2(5, x9Var, F));
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
                    c6Var = ((e3) eaVar).resourcesProvider;
                    a2 a2Var = new a2(context2, 3, c6Var);
                    a2Var.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = eaVar.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((e3) eaVar).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new e5(x9Var, a2Var, getgroupcallstreamrtmpurl, 1));
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
                        c3 c3Var = eaVar.container;
                        c6Var6 = ((e3) eaVar).resourcesProvider;
                        sc G = new zc(c3Var, c6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    c3 c3Var2 = eaVar.container;
                    c6Var5 = ((e3) eaVar).resourcesProvider;
                    sc G2 = new zc(c3Var2, c6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
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
                    c3 c3Var3 = eaVar.container;
                    c6Var4 = ((e3) eaVar).resourcesProvider;
                    sc G3 = new zc(c3Var3, c6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    c3 c3Var4 = eaVar.container;
                    c6Var3 = ((e3) eaVar).resourcesProvider;
                    sc G4 = new zc(c3Var4, c6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                x9Var.g(true);
                return;
            }
            return;
        }
        if (j9Var.n && eaVar.F) {
            i16 = ((e3) eaVar).currentAccount;
            boolean z12 = eaVar.K;
            TLRPC.InputPeer inputPeer3 = eaVar.c;
            m9 m9Var = new m9(x9Var, 0);
            c6Var9 = ((e3) eaVar).resourcesProvider;
            new e9(context, i16, z12, inputPeer3, m9Var, c6Var9).show();
            return;
        }
        int i21 = j9Var.i;
        if (i21 == 1) {
            if (eaVar.N == 1 || ea.K0(eaVar).isEmpty()) {
                eaVar.M = 1;
                eaVar.b.D(1);
            }
            eaVar.N = 1;
            x9Var.f(true);
            return;
        }
        if (i21 == 3) {
            if (eaVar.N == 3 || (eaVar.n.isEmpty() && eaVar.r.isEmpty())) {
                eaVar.M = 3;
                eaVar.b.D(1);
            }
            eaVar.N = 3;
            x9Var.f(true);
            return;
        }
        if (i21 == 2) {
            if (eaVar.N == 2) {
                eaVar.M = 2;
                eaVar.b.D(1);
            }
            eaVar.N = 2;
            x9Var.f(true);
            return;
        }
        if (i21 == 4) {
            if (eaVar.N == 4) {
                eaVar.M = 4;
                eaVar.b.D(1);
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
                long j10 = chat.id;
                if (ea.e1(eaVar, chat) > 200) {
                    try {
                        x9Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = x9Var.getContext();
                    c6Var7 = ((e3) eaVar).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, c6Var7);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
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
                    x9Var.i(true);
                } else {
                    i13 = ((e3) eaVar).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                    i14 = ((e3) eaVar).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        a2 a2Var2 = x9Var.G;
                        if (a2Var2 != null) {
                            a2Var2.dismiss();
                            x9Var.G = null;
                        }
                        x9Var.H = j10;
                        Context context4 = x9Var.getContext();
                        c6Var8 = ((e3) eaVar).resourcesProvider;
                        a2 a2Var3 = new a2(context4, 3, c6Var8);
                        x9Var.G = a2Var3;
                        a2Var3.q(50L);
                        i15 = ((e3) eaVar).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new b8(x9Var, chat2, messagesStorage, j10, 4));
                    } else {
                        x9Var.d(j10, chatFull.participants);
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
                        if (!TextUtils.isEmpty(x9Var.I)) {
                            q9Var.setText("");
                            x9Var.I = null;
                            x9Var.g(false);
                        }
                        hVar.k(Boolean.TRUE, j11);
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

    @Override // m4.o0
    public void e(m4.v vVar) {
        switch (this.a) {
            case 25:
                ((m4.d) this.c).f(((m4.p0) this.b).g.t);
                break;
            default:
                m4.p0 p0Var = (m4.p0) this.b;
                n4.h hVar = (n4.h) this.c;
                p0Var.getClass();
                String str = hVar.a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    m4.m1 m1Var = p0Var.g.t;
                    if (m1Var.o0(17)) {
                        p1 y02 = m1Var.y0();
                        o1 o1Var = new o1();
                        for (int i10 = 0; i10 < y02.o(); i10++) {
                            if (TextUtils.equals(y02.m(i10, o1Var, 0L).c.a, str)) {
                                m1Var.Q(i10);
                                break;
                            }
                        }
                        break;
                    } else {
                        e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // ih.h
    public void f(RectF rectF, View view) {
        dh.d dVar = (dh.d) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        dVar.t(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 4:
                h5 h5Var = (h5) this.b;
                bi.t1 t1Var = ((sb) this.c).A0;
                if (t1Var == null) {
                    q5.f0(h5Var.l);
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
                f4.z0((f4) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 13:
                hg.j1 j1Var = (hg.j1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                j1Var.getClass();
                zArr[0] = true;
                j1Var.Q();
                break;
            default:
                ig.y.d(r4.currentAccount).a((ig.v) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // ji.o0
    public l80 h(ji.h1 h1Var) {
        qf.b bVar = (qf.b) this.b;
        c6 c6Var = (c6) this.c;
        ji.r rVar = (ji.r) bVar.c;
        l80 l80Var = new l80(rVar, c6Var, h1Var, false, false, true);
        rVar.H = l80Var;
        return l80Var;
    }

    @Override // li.n
    public void i(n4.s sVar) {
        AndroidUtilities.runOnUIThread(new hg.t((SpannableString) this.b, sVar, (gi.m0) this.c, 24));
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 18:
                ((j2.b) obj).e((j2.a) this.b, (u2.c0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // di.g9
    public void j(ca caVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, y6 y6Var, x8 x8Var) {
        switch (this.a) {
            case 2:
                q5 q5Var = (q5) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(q5Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = caVar.b;
                ConnectionsManager.getInstance(q5Var.C2).sendRequest(tL_stories_editStory, new f3(q5Var, y6Var, storyItem, caVar, 0));
                break;
            default:
                h5 h5Var = (h5) this.b;
                ea eaVar = (ea) this.c;
                q5 q5Var2 = h5Var.l;
                o5 o5Var = q5Var2.O1;
                TL_stories.StoryItem storyItem2 = o5Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(q5Var2.C2).getStoriesController().o0(q5Var2.B1, q5Var2.v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = o5Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(q5Var2.C2).sendRequest(togglegroupcallsettings, new bi.m1(1, h5Var, eaVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // r9.d
    public Object n2(z5 z5Var) {
        String str = (String) this.b;
        r9.a aVar = (r9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.n2(z5Var);
        } finally {
            Trace.endSection();
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
            case 5:
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
                if (a1.h.a(cancellationSignal)) {
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
                if (a1.h.a(cancellationSignal2)) {
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

    @Override // org.telegram.ui.Components.lu
    public void p() {
        switch (this.a) {
            case 21:
                ji.k0 k0Var = (ji.k0) this.b;
                ji.j0 j0Var = (ji.j0) this.c;
                k0Var.i();
                j0Var.R0();
                break;
            default:
                u5 u5Var = (u5) this.b;
                x5 x5Var = (x5) this.c;
                TL_iv.pageTableCell pagetablecell = x5Var.b;
                if (pagetablecell != null) {
                    m6.d(pagetablecell, x5Var.a.getText());
                }
                d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.a != null) {
                    x3.P1(d3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ji.k4
    public void run(long j10) {
        u3 u3Var = (u3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
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

    public /* synthetic */ h0(j2.a aVar, Object obj, long j10) {
        this.a = 19;
        this.b = aVar;
        this.c = obj;
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

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
