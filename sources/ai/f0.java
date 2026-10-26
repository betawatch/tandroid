package ai;

import a8.me;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.h2;
import bi.h7;
import bi.i2;
import bi.r3;
import bi.y2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import di.h4;
import di.o4;
import di.q4;
import di.s8;
import di.y9;
import fi.g9;
import fi.l9;
import fi.n9;
import fi.p8;
import fi.p9;
import fi.r8;
import fi.u8;
import fi.x8;
import fi.z8;
import hi.d4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import li.b3;
import li.h6;
import li.i4;
import li.p5;
import li.s3;
import li.s5;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.dc0;
import org.telegram.ui.kc0;
import org.telegram.ui.pc0;
import org.telegram.ui.qf1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements CameraView.CameraViewDelegate, c51, qf1, b2, OnFailureListener, jh.i, OnCompleteListener, Continuation, r8, s9.d, am0, bm0, e2.p, e2.o, Utilities.Callback3Return, kc0, li.n0, hu, i4, m4.o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // li.n0
    public k80 a(li.g1 g1Var) {
        rf.b bVar = (rf.b) this.b;
        u6 u6Var = (u6) this.c;
        li.q qVar = (li.q) bVar.c;
        k80 k80Var = new k80(qVar, u6Var, g1Var, false, false, true);
        qVar.H = k80Var;
        return k80Var;
    }

    @Override // fi.r8
    public void b(l9 l9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, e2.q0 q0Var, s8 s8Var) {
        switch (this.a) {
            case 10:
                q4 q4Var = (q4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(q4Var.r2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = l9Var.b;
                ConnectionsManager.getInstance(q4Var.r2).sendRequest(tL_stories_editStory, new i2(q4Var, q0Var, storyItem, l9Var, 5));
                break;
            default:
                h4 h4Var = (h4) this.b;
                n9 n9Var = (n9) this.c;
                q4 q4Var2 = h4Var.l;
                o4 o4Var = q4Var2.D1;
                TL_stories.StoryItem storyItem2 = o4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(q4Var2.r2).getStoriesController().o0(q4Var2.q1, q4Var2.k1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = o4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(q4Var2.r2).sendRequest(togglegroupcallsettings, new bi.j(9, h4Var, n9Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        return d4.A0((d4) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.x = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.x = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.c = true;
        r1.setText(r2.x);
        r1 = r2.e;
        r1.setSelection(r1.getText().length());
        r2.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.Z();
        r2.a.g3.O(true);
        r2.V(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.y != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.R : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.y = true;
        r1 = r3.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.kc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        jg.d1 d1Var = (jg.d1) this.b;
        pc0 pc0Var = (pc0) this.c;
        d1Var.w = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(d1Var.x)) {
            dc0 dc0Var = pc0Var.T;
        }
    }

    @Override // s9.d
    public Object d1(me meVar) {
        String str = (String) this.b;
        s9.a aVar = (s9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.d1(meVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        u6 u6Var;
        int i11;
        int i12;
        long clientUserId;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        u6 u6Var7;
        int i13;
        int i14;
        u6 u6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        u6 u6Var9;
        g9 g9Var = (g9) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = g9Var.L;
        a0.h hVar = g9Var.b;
        z8 z8Var = g9Var.x;
        ArrayList arrayList3 = g9Var.c;
        HashMap hashMap = g9Var.d;
        n9 n9Var = g9Var.W;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        u8 u8Var = (u8) arrayList2.get(i10);
        int i17 = u8Var.a;
        int i18 = 0;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i19 = u8Var.q;
                    if (i19 == 0) {
                        p9 p9Var = n9Var.c0;
                        if (p9Var != null) {
                            p9Var.run();
                            return;
                        }
                        return;
                    }
                    if (i19 == 1) {
                        TLRPC.InputPeer inputPeer = n9Var.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((k3) n9Var).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        u6Var2 = ((k3) n9Var).resourcesProvider;
                        k80 F = k80.F(g9Var, u6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new r3(g9Var, clientUserId, 7), false);
                        F.k();
                        k80.f(F, n9Var.j1().B(clientUserId, true), n9Var.v, false, null, new n1(12, g9Var, F));
                        F.Z();
                        return;
                    }
                    if (i19 != 5) {
                        if (i19 == 6) {
                            n9Var.G = false;
                            g9Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = g9Var.getContext();
                    u6Var = ((k3) n9Var).resourcesProvider;
                    e2 e2Var = new e2(context2, 3, u6Var);
                    e2Var.r(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = n9Var.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((k3) n9Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new h2(g9Var, e2Var, getgroupcallstreamrtmpurl));
                    return;
                }
                return;
            }
            if (view instanceof v8) {
                v8 v8Var = (v8) view;
                v8Var.setChecked(!v8Var.d());
                u8Var.k = v8Var.d();
                int i20 = u8Var.c;
                if (i20 == 0) {
                    boolean d = v8Var.d();
                    n9Var.x = d;
                    boolean z10 = n9Var.N == 4;
                    if (d) {
                        h3 h3Var = n9Var.container;
                        u6Var6 = ((k3) n9Var).resourcesProvider;
                        qc G = new wc(h3Var, u6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    h3 h3Var2 = n9Var.container;
                    u6Var5 = ((k3) n9Var).resourcesProvider;
                    qc G2 = new wc(h3Var2, u6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i20 != 1) {
                    if (i20 == 2) {
                        n9Var.w = v8Var.d();
                        g9Var.g(true);
                        return;
                    }
                    return;
                }
                boolean d10 = v8Var.d();
                n9Var.y = d10;
                boolean z11 = n9Var.c instanceof TLRPC.TL_inputPeerChannel;
                if (d10) {
                    h3 h3Var3 = n9Var.container;
                    u6Var4 = ((k3) n9Var).resourcesProvider;
                    qc G3 = new wc(h3Var3, u6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    h3 h3Var4 = n9Var.container;
                    u6Var3 = ((k3) n9Var).resourcesProvider;
                    qc G4 = new wc(h3Var4, u6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                g9Var.g(true);
                return;
            }
            return;
        }
        if (u8Var.n && n9Var.F) {
            i16 = ((k3) n9Var).currentAccount;
            boolean z12 = n9Var.K;
            TLRPC.InputPeer inputPeer3 = n9Var.c;
            x8 x8Var = new x8(g9Var, 0);
            u6Var9 = ((k3) n9Var).resourcesProvider;
            new p8(context, i16, z12, inputPeer3, x8Var, u6Var9).show();
            return;
        }
        int i21 = u8Var.i;
        if (i21 == 1) {
            if (n9Var.N == 1 || n9.K0(n9Var).isEmpty()) {
                n9Var.M = 1;
                n9Var.b.E(1);
            }
            n9Var.N = 1;
            g9Var.f(true);
            return;
        }
        if (i21 == 3) {
            if (n9Var.N == 3 || (n9Var.n.isEmpty() && n9Var.r.isEmpty())) {
                n9Var.M = 3;
                n9Var.b.E(1);
            }
            n9Var.N = 3;
            g9Var.f(true);
            return;
        }
        if (i21 == 2) {
            if (n9Var.N == 2) {
                n9Var.M = 2;
                n9Var.b.E(1);
            }
            n9Var.N = 2;
            g9Var.f(true);
            return;
        }
        if (i21 == 4) {
            if (n9Var.N == 4) {
                n9Var.M = 4;
                n9Var.b.E(1);
            }
            n9Var.N = 4;
            g9Var.f(true);
            return;
        }
        if (i21 > 0) {
            arrayList3.clear();
            hashMap.clear();
            n9Var.N = u8Var.i;
            z8Var.d.a();
        } else {
            TLRPC.Chat chat = u8Var.h;
            if (chat != null) {
                long j10 = chat.id;
                if (n9.e1(n9Var, chat) > 200) {
                    try {
                        g9Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = g9Var.getContext();
                    u6Var7 = ((k3) n9Var).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, u6Var7);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
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
                    g9Var.i(true);
                } else {
                    i13 = ((k3) n9Var).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                    i14 = ((k3) n9Var).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        e2 e2Var2 = g9Var.G;
                        if (e2Var2 != null) {
                            e2Var2.dismiss();
                            g9Var.G = null;
                        }
                        g9Var.H = j10;
                        Context context4 = g9Var.getContext();
                        u6Var8 = ((k3) n9Var).resourcesProvider;
                        e2 e2Var3 = new e2(context4, 3, u6Var8);
                        g9Var.G = e2Var3;
                        e2Var3.r(50L);
                        i15 = ((k3) n9Var).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new y2(g9Var, chat2, messagesStorage, j10, 12));
                    } else {
                        g9Var.d(j10, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(g9Var.I)) {
                        z8Var.setText("");
                        g9Var.I = null;
                        g9Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = u8Var.g;
                if (user != null) {
                    if (g9Var.a == 0) {
                        n9Var.N = 0;
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
                        if (!TextUtils.isEmpty(g9Var.I)) {
                            z8Var.setText("");
                            g9Var.I = null;
                            g9Var.g(false);
                        }
                        hVar.k(Boolean.TRUE, j11);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    g9Var.i(true);
                }
            }
        }
        g9Var.f(true);
        g9Var.e(true);
        z8Var.L = true;
    }

    @Override // e2.p
    public void f(Object obj, b2.v vVar) {
        j2.b bVar = (j2.b) obj;
        bVar.e((b2.g1) this.c, new n4.s(vVar, ((j2.e) this.b).e));
    }

    @Override // org.telegram.ui.Components.hu
    public void g() {
        switch (this.a) {
            case 25:
                li.j0 j0Var = (li.j0) this.b;
                li.i0 i0Var = (li.i0) this.c;
                j0Var.i();
                i0Var.a0();
                break;
            default:
                p5 p5Var = (p5) this.b;
                s5 s5Var = (s5) this.c;
                TL_iv.pageTableCell pagetablecell = s5Var.b;
                if (pagetablecell != null) {
                    h6.d(pagetablecell, s5Var.a.getText());
                }
                b3 b3Var = p5Var.E;
                if (b3Var != null && p5Var.a != null) {
                    v3.U1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 4:
                h7.J0((h7) this.b, (vg.n1) this.c, e2Var, i10);
                break;
            case 12:
                h4 h4Var = (h4) this.b;
                di.h1 h1Var = ((y9) this.c).A0;
                if (h1Var == null) {
                    q4.d0(h4Var.l);
                    break;
                } else if (!h1Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = h1Var.f;
                    ConnectionsManager.getInstance(h1Var.e).sendRequest(discardgroupcall, new di.z0(h1Var, 4));
                    h1Var.e();
                    break;
                }
                break;
            case 15:
                d4.x0((d4) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 17:
                ig.j1 j1Var = (ig.j1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                j1Var.getClass();
                zArr[0] = true;
                j1Var.Q();
                break;
            default:
                jg.z.d(r4.currentAccount).a((jg.w) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // m4.o0
    public void i(m4.w wVar) {
        switch (this.a) {
            case 28:
                ((m4.e) this.c).f(((m4.p0) this.b).g.t);
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
                    m4.n1 n1Var = p0Var.g.t;
                    if (n1Var.o0(17)) {
                        b2.p1 y02 = n1Var.y0();
                        b2.o1 o1Var = new b2.o1();
                        for (int i10 = 0; i10 < y02.o(); i10++) {
                            if (TextUtils.equals(y02.m(i10, o1Var, 0L).c.a, str)) {
                                n1Var.Q(i10);
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

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 19:
                ((j2.b) obj).d((j2.a) this.b, (u2.c0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.qf1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bi.y) this.b).q0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // jh.i
    public void k(RectF rectF, View view) {
        eh.d dVar = (eh.d) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        dVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        o0 o0Var = (o0) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (o0Var.V || o0Var.h0 || o0Var.l0) {
            return;
        }
        o0Var.h0 = true;
        o0Var.g0.postDelayed(o0Var.y0, 150L);
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

    @Override // li.i4
    public void run(long j10) {
        s3 s3Var = (s3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        s3Var.a(str, tL_inlineButtonTypeUserProfile);
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

    public /* synthetic */ f0(j2.a aVar, Object obj, long j10) {
        this.a = 20;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        jg.n nVar = (jg.n) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        nVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.e);
        jg.j jVar = nVar.n;
        nVar.x = document;
        jVar.setSticker(document);
        ((v8) view).setValueSticker(document);
        nVar.f0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
