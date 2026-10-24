package ah;

import ai.c3;
import ai.j2;
import ai.k2;
import ai.l7;
import ai.o2;
import ai.v3;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.n1;
import b2.o1;
import b2.p1;
import b2.q1;
import b2.s1;
import b2.t1;
import ci.g4;
import ci.n4;
import ci.p4;
import ci.z9;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e9.m2;
import ei.b9;
import ei.d9;
import ei.k9;
import ei.p6;
import ei.p9;
import ei.r9;
import ei.t8;
import ei.t9;
import ei.v8;
import ei.y8;
import gi.u3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import ki.i4;
import ki.o5;
import ki.r5;
import ki.t3;
import ki.w3;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.gc0;
import org.telegram.ui.nc0;
import org.telegram.ui.of1;
import org.telegram.ui.sc0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements b51, of1, z1, ih.i, OnFailureListener, v8, OnCompleteListener, Continuation, r9.d, bm0, cm0, Utilities.Callback3Return, nc0, e2.p, e2.o, ki.o0, gu, i4, m4.o0, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // e2.p
    public void a(Object obj, b2.u uVar) {
        j2.b bVar = (j2.b) obj;
        bVar.d((b2.f1) this.c, new qf.b(uVar, ((j2.e) this.b).e));
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 28:
                m4.i1 i1Var = (m4.i1) this.b;
                t1 t1Var = (t1) this.c;
                m4.m1 m1Var = (m4.m1) obj;
                i1Var.getClass();
                e9.q0 q0Var = t1Var.H;
                if (!q0Var.isEmpty()) {
                    s1 c10 = t1Var.a().c();
                    m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        q1 q1Var = (q1) it.next();
                        p1 p1Var = (p1) i1Var.d.n.get(q1Var.a.b);
                        if (p1Var == null || q1Var.a.a != p1Var.a) {
                            c10.a(q1Var);
                        } else {
                            c10.a(new q1(p1Var, q1Var.b));
                        }
                    }
                    t1Var = c10.b();
                }
                m1Var.p(t1Var);
                break;
            default:
                m4.i1 i1Var2 = (m4.i1) this.b;
                m4.v vVar = (m4.v) this.c;
                m4.f0 f0Var = (m4.f0) i1Var2.a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(vVar, false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.E = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.E = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.e = true;
        r1.setText(r2.E);
        r1 = r2.h;
        r1.setSelection(r1.getText().length());
        r2.e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.Y();
        r2.a.Z2.N(true);
        r2.U(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.F != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.R : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.F = true;
        r1 = r3.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.nc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        ig.c1 c1Var = (ig.c1) this.b;
        sc0 sc0Var = (sc0) this.c;
        c1Var.y = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(c1Var.E)) {
            gc0 gc0Var = sc0Var.T;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        g6 g6Var;
        int i11;
        int i12;
        long clientUserId;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        int i13;
        int i14;
        g6 g6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        g6 g6Var9;
        k9 k9Var = (k9) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = k9Var.L;
        a0.h hVar = k9Var.b;
        d9 d9Var = k9Var.x;
        ArrayList arrayList3 = k9Var.c;
        HashMap hashMap = k9Var.d;
        r9 r9Var = k9Var.W;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        y8 y8Var = (y8) arrayList2.get(i10);
        int i17 = y8Var.a;
        int i18 = 0;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i19 = y8Var.q;
                    if (i19 == 0) {
                        t9 t9Var = r9Var.c0;
                        if (t9Var != null) {
                            t9Var.run();
                            return;
                        }
                        return;
                    }
                    if (i19 == 1) {
                        TLRPC.InputPeer inputPeer = r9Var.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((h3) r9Var).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        g6Var2 = ((h3) r9Var).resourcesProvider;
                        j80 F = j80.F(k9Var, g6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new v3(k9Var, clientUserId, 7), false);
                        F.k();
                        j80.f(F, r9Var.j1().B(clientUserId, true), r9Var.v, false, null, new o2(11, k9Var, F));
                        F.Z();
                        return;
                    }
                    if (i19 != 5) {
                        if (i19 == 6) {
                            r9Var.G = false;
                            k9Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = k9Var.getContext();
                    g6Var = ((h3) r9Var).resourcesProvider;
                    c2 c2Var = new c2(context2, 3, g6Var);
                    c2Var.r(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = r9Var.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((h3) r9Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new j2(k9Var, c2Var, getgroupcallstreamrtmpurl));
                    return;
                }
                return;
            }
            if (view instanceof r8) {
                r8 r8Var = (r8) view;
                r8Var.setChecked(!r8Var.d());
                y8Var.k = r8Var.d();
                int i20 = y8Var.c;
                if (i20 == 0) {
                    boolean d = r8Var.d();
                    r9Var.x = d;
                    boolean z10 = r9Var.N == 4;
                    if (d) {
                        e3 e3Var = r9Var.container;
                        g6Var6 = ((h3) r9Var).resourcesProvider;
                        qc G = new xc(e3Var, g6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    e3 e3Var2 = r9Var.container;
                    g6Var5 = ((h3) r9Var).resourcesProvider;
                    qc G2 = new xc(e3Var2, g6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i20 != 1) {
                    if (i20 == 2) {
                        r9Var.w = r8Var.d();
                        k9Var.g(true);
                        return;
                    }
                    return;
                }
                boolean d10 = r8Var.d();
                r9Var.y = d10;
                boolean z11 = r9Var.c instanceof TLRPC.TL_inputPeerChannel;
                if (d10) {
                    e3 e3Var3 = r9Var.container;
                    g6Var4 = ((h3) r9Var).resourcesProvider;
                    qc G3 = new xc(e3Var3, g6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    e3 e3Var4 = r9Var.container;
                    g6Var3 = ((h3) r9Var).resourcesProvider;
                    qc G4 = new xc(e3Var4, g6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                k9Var.g(true);
                return;
            }
            return;
        }
        if (y8Var.n && r9Var.F) {
            i16 = ((h3) r9Var).currentAccount;
            boolean z12 = r9Var.K;
            TLRPC.InputPeer inputPeer3 = r9Var.c;
            b9 b9Var = new b9(k9Var, 0);
            g6Var9 = ((h3) r9Var).resourcesProvider;
            new t8(context, i16, z12, inputPeer3, b9Var, g6Var9).show();
            return;
        }
        int i21 = y8Var.i;
        if (i21 == 1) {
            if (r9Var.N == 1 || r9.K0(r9Var).isEmpty()) {
                r9Var.M = 1;
                r9Var.b.D(1);
            }
            r9Var.N = 1;
            k9Var.f(true);
            return;
        }
        if (i21 == 3) {
            if (r9Var.N == 3 || (r9Var.n.isEmpty() && r9Var.r.isEmpty())) {
                r9Var.M = 3;
                r9Var.b.D(1);
            }
            r9Var.N = 3;
            k9Var.f(true);
            return;
        }
        if (i21 == 2) {
            if (r9Var.N == 2) {
                r9Var.M = 2;
                r9Var.b.D(1);
            }
            r9Var.N = 2;
            k9Var.f(true);
            return;
        }
        if (i21 == 4) {
            if (r9Var.N == 4) {
                r9Var.M = 4;
                r9Var.b.D(1);
            }
            r9Var.N = 4;
            k9Var.f(true);
            return;
        }
        if (i21 > 0) {
            arrayList3.clear();
            hashMap.clear();
            r9Var.N = y8Var.i;
            d9Var.d.a();
        } else {
            TLRPC.Chat chat = y8Var.h;
            if (chat != null) {
                long j10 = chat.id;
                if (r9.e1(r9Var, chat) > 200) {
                    try {
                        k9Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = k9Var.getContext();
                    g6Var7 = ((h3) r9Var).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, g6Var7);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                    org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
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
                    k9Var.i(true);
                } else {
                    i13 = ((h3) r9Var).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                    i14 = ((h3) r9Var).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        c2 c2Var2 = k9Var.G;
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                            k9Var.G = null;
                        }
                        k9Var.H = j10;
                        Context context4 = k9Var.getContext();
                        g6Var8 = ((h3) r9Var).resourcesProvider;
                        c2 c2Var3 = new c2(context4, 3, g6Var8);
                        k9Var.G = c2Var3;
                        c2Var3.r(50L);
                        i15 = ((h3) r9Var).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new c3(k9Var, chat2, messagesStorage, j10, 12));
                    } else {
                        k9Var.d(j10, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(k9Var.I)) {
                        d9Var.setText("");
                        k9Var.I = null;
                        k9Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = y8Var.g;
                if (user != null) {
                    if (k9Var.a == 0) {
                        r9Var.N = 0;
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
                        if (!TextUtils.isEmpty(k9Var.I)) {
                            d9Var.setText("");
                            k9Var.I = null;
                            k9Var.g(false);
                        }
                        hVar.k(Boolean.TRUE, j11);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    k9Var.i(true);
                }
            }
        }
        k9Var.f(true);
        k9Var.e(true);
        d9Var.L = true;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        return u3.C0((u3) this.b, (Context) this.c, view, i10);
    }

    @Override // ei.v8
    public void e(p9 p9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, p6 p6Var, com.google.firebase.messaging.s sVar) {
        switch (this.a) {
            case 5:
                p4 p4Var = (p4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(p4Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = p9Var.b;
                ConnectionsManager.getInstance(p4Var.C2).sendRequest(tL_stories_editStory, new k2(p4Var, p6Var, storyItem, p9Var, 5));
                break;
            default:
                g4 g4Var = (g4) this.b;
                r9 r9Var = (r9) this.c;
                p4 p4Var2 = g4Var.l;
                n4 n4Var = p4Var2.O1;
                TL_stories.StoryItem storyItem2 = n4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(p4Var2.C2).getStoriesController().o0(p4Var2.B1, p4Var2.v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = n4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(p4Var2.C2).sendRequest(togglegroupcallsettings, new ai.g(8, g4Var, r9Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // m4.o0
    public void f(m4.v vVar) {
        switch (this.a) {
            case 26:
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
                        o1 y02 = m1Var.y0();
                        n1 n1Var = new n1();
                        for (int i10 = 0; i10 < y02.o(); i10++) {
                            if (TextUtils.equals(y02.m(i10, n1Var, 0L).c.a, str)) {
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

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                l7.J0((l7) this.b, (ug.l1) this.c, c2Var, i10);
                break;
            case 7:
                g4 g4Var = (g4) this.b;
                ci.h1 h1Var = ((z9) this.c).A0;
                if (h1Var == null) {
                    p4.e0(g4Var.l);
                    break;
                } else if (!h1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = h1Var.f;
                    ConnectionsManager.getInstance(h1Var.e).sendRequest(discardgroupcall, new ci.z0(h1Var, 4));
                    h1Var.e();
                    break;
                }
                break;
            case 13:
                u3.z0((u3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 15:
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

    @Override // org.telegram.ui.Components.gu
    public void h() {
        switch (this.a) {
            case 23:
                ki.k0 k0Var = (ki.k0) this.b;
                ki.j0 j0Var = (ki.j0) this.c;
                k0Var.i();
                j0Var.X();
                break;
            default:
                o5 o5Var = (o5) this.b;
                r5 r5Var = (r5) this.c;
                TL_iv.pageTableCell pagetablecell = r5Var.b;
                if (pagetablecell != null) {
                    ki.g6.d(pagetablecell, r5Var.a.getText());
                }
                ki.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.a != null) {
                    w3.U1(c3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ki.o0
    public j80 i(ki.h1 h1Var) {
        n4.s sVar = (n4.s) this.b;
        g6 g6Var = (g6) this.c;
        ki.q qVar = (ki.q) sVar.c;
        j80 j80Var = new j80(qVar, g6Var, h1Var, false, false, true);
        qVar.H = j80Var;
        return j80Var;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 20:
                ((j2.b) obj).e((j2.a) this.b, (u2.d0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // ih.i
    public void j(RectF rectF, View view) {
        dh.d dVar = (dh.d) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        dVar.t(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        String str = (String) this.b;
        r9.a aVar = (r9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.j2(z5Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.telegram.ui.of1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ai.x) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
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

    @Override // ki.i4
    public void run(long j10) {
        t3 t3Var = (t3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        t3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.b;
        String str = (String) this.c;
        synchronized (iVar) {
            ((a0.f) iVar.b).remove(str);
        }
        return task;
    }

    public /* synthetic */ h0(j2.a aVar, Object obj, long j10) {
        this.a = 21;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        ig.m mVar = (ig.m) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        mVar.E = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        ig.i iVar = mVar.v;
        mVar.F = document;
        iVar.setSticker(document);
        ((r8) view).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
