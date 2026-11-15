package ab;

import a8.r7;
import ai.u1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c4;
import bi.j3;
import bi.j6;
import bi.l1;
import bi.u5;
import bi.v2;
import bi.y5;
import bi.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.c6;
import di.f2;
import di.g3;
import di.j4;
import di.v8;
import di.x2;
import e2.c1;
import fi.b4;
import fi.i9;
import fi.t3;
import fi.y0;
import fi.z3;
import hi.c8;
import hi.e1;
import hi.e8;
import hi.h4;
import hi.l8;
import hi.o8;
import hi.q8;
import hi.s8;
import hi.u7;
import hi.w7;
import hi.z7;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import jg.h1;
import kg.a1;
import ki.n3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.v10;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ha0;
import org.telegram.ui.ka1;
import org.telegram.ui.ma0;
import org.telegram.ui.o01;
import org.telegram.ui.pa0;
import org.telegram.ui.rl0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener, Continuation, ai.g, q1, j4, x10, hj0, OnFailureListener, u9.d, o01, CameraView.CameraViewDelegate, jh.i, ka1, w7, v10, ma0, ij0, h2.p, h2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // hi.w7
    public void a(o8 o8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i7, h4 h4Var, e1 e1Var) {
        switch (this.a) {
            case 17:
                b4 b4Var = (b4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = np.s1(b4Var.m2).j1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = o8Var.b;
                ConnectionsManager.getInstance(b4Var.m2).sendRequest(tL_stories_editStory, new l1(b4Var, h4Var, storyItem, o8Var, 6));
                break;
            default:
                t3 t3Var = (t3) this.b;
                q8 q8Var = (q8) this.c;
                b4 b4Var2 = t3Var.x;
                z3 z3Var = b4Var2.y1;
                TL_stories.StoryItem storyItem2 = z3Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    np.s1(b4Var2.m2).P1().r0(b4Var2.l1, b4Var2.f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = z3Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(b4Var2.m2).sendRequest(togglegroupcallsettings, new v2(10, t3Var, q8Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        return n3.E0((n3) this.b, (Context) this.c, view, i7);
    }

    @Override // di.j4
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        c4 c4Var = (c4) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        wp0 wp0Var = c4Var.a;
        c4Var.e.l.remove(savedStarGift);
        c4Var.f(true);
        int i7 = c4Var.b;
        if (j3 == m10.i(i7).e()) {
            cc a02 = cc.a0(wp0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = hd.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            xb O = a02.O(document, M0, hd.a0(null, null, 2131752888, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            xb O2 = cc.a0(wp0Var.a).O(tL_starGiftUnique.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(i7, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.w0.c(true);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.J;
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
    
        r1 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.c = true;
        r1.setText(r2.y);
        r1 = r2.e;
        r1.setSelection(r1.getText().length());
        r2.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.d0();
        r2.a.g3.O(true);
        r2.Z(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.E != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.J : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.E = true;
        r1 = r3.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.ma0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        a1 a1Var = (a1) this.b;
        pa0 pa0Var = (pa0) this.c;
        a1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(a1Var.y)) {
            ha0 ha0Var = pa0Var.Q;
        }
    }

    @Override // h2.p
    public void e(Object obj, e2.s sVar) {
        m2.b bVar = (m2.b) obj;
        bVar.A((c1) this.c, new ji.j(sVar, ((m2.e) this.b).e));
    }

    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String, org.telegram.ui.ActionBar.q1] */
    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 7:
                z5 z5Var = (z5) obj2;
                y5 y5Var = (y5) obj;
                b41 G = z5Var.e2.G(i7 - 1);
                if (G != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.r;
                        if (!TextUtils.isEmpty(starGift.gift_address) && z5Var.d2) {
                            alertDialog$Builder = new AlertDialog$Builder(0, z5Var.getContext(), z5Var.J0);
                            r42 = 0;
                            String M0 = hd.M0(2131749792, null);
                            t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131749793, null);
                        } else if (!z10 || !(starGift instanceof TL_stars.TL_starGiftUnique)) {
                            if (!z10) {
                                ArrayList arrayList2 = y5Var.b.l;
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        Object obj4 = arrayList2.get(i11);
                                        i11++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj4;
                                        if (savedStarGift2.gift == starGift) {
                                            savedStarGift = savedStarGift2;
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(z5Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(z5Var.getContext());
                                    r42 = 0;
                                    String M02 = hd.M0(2131749755, null);
                                    t1 t1Var2 = alertDialog$Builder.a;
                                    t1Var2.S = M02;
                                    t1Var2.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749756, hd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            z5Var.b2.a(starGift);
                            z5Var.dismiss();
                            break;
                        } else {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                            t1 t1Var3 = new t1(3, z5Var.getContext(), null);
                            t1Var3.r(400L);
                            long e10 = m10.i(z5Var.a).e();
                            cg.b bVar = tL_starGiftUnique.resale_ton_only ? cg.b.b : cg.b.a;
                            v8.x(z5Var.a, bVar).H(tL_starGiftUnique, e10, null, true, new u5(z5Var, t1Var3, bVar, tL_starGiftUnique, e10));
                            break;
                        }
                        i5.c.C(r42, 2131747831, alertDialog$Builder, r42);
                        break;
                    }
                }
                break;
            default:
                l8 l8Var = (l8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = l8Var.M;
                a0.h hVar = l8Var.b;
                e8 e8Var = l8Var.y;
                ArrayList arrayList4 = l8Var.c;
                HashMap hashMap = l8Var.d;
                q8 q8Var = l8Var.a0;
                k2 k2Var = q8Var.c;
                if (i7 >= 0 && i7 < arrayList3.size()) {
                    z7 z7Var = (z7) arrayList3.get(i7);
                    int i12 = z7Var.a;
                    if (i12 != 3) {
                        int i13 = 7;
                        if (i12 != 7) {
                            if (i12 == 9) {
                                int i14 = z7Var.q;
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 5) {
                                            if (i14 == 6) {
                                                q8Var.B1 = false;
                                                l8Var.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = l8Var.getContext();
                                            int i15 = q8.Y1;
                                            t1 t1Var4 = new t1(3, context2, q8Var.J0);
                                            t1Var4.r(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = q8Var.n1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(q8Var.a).sendRequest(getgroupcallstreamrtmpurl, new j6(l8Var, t1Var4, getgroupcallstreamrtmpurl, i13));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = q8Var.n1;
                                        long n10 = inputPeer2 != null ? m5.n(inputPeer2) : m10.i(q8Var.a).e();
                                        m60 F = m60.F(l8Var, q8Var.J0, view);
                                        F.c(R.drawable.msg_addfolder, hd.M0(2131744785, null), new x2(l8Var, n10, i13), false);
                                        F.k();
                                        m60.f(F, np.s1(q8Var.a).P1().B(n10, true), q8Var.v1, false, null, new u1(17, l8Var, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    s8 s8Var = q8Var.X1;
                                    if (s8Var != null) {
                                        s8Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof org.telegram.ui.Cells.l8) {
                            org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                            l8Var2.setChecked(!l8Var2.d());
                            z7Var.k = l8Var2.d();
                            int i16 = z7Var.c;
                            if (i16 != 0) {
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        q8Var.w1 = l8Var2.d();
                                        l8Var.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = l8Var2.d();
                                    q8Var.y1 = d;
                                    boolean z11 = q8Var.n1 instanceof TLRPC.TL_inputPeerChannel;
                                    if (d) {
                                        xb G2 = new cc(k2Var, q8Var.J0).G(R.raw.msg_story_keep, 4, hd.M0(z11 ? 2131744707 : 2131744671, null));
                                        G2.j = 5000;
                                        G2.k(true);
                                    } else {
                                        xb G3 = new cc(k2Var, q8Var.J0).G(R.raw.fire_on, 4, hd.M0(z11 ? 2131744708 : 2131744685, null));
                                        G3.j = 5000;
                                        G3.k(true);
                                    }
                                    l8Var.h(true);
                                    break;
                                }
                            } else {
                                boolean d2 = l8Var2.d();
                                q8Var.x1 = d2;
                                r10 = q8Var.I1 == 4 ? 1 : 0;
                                if (!d2) {
                                    xb G4 = new cc(k2Var, q8Var.J0).G(R.raw.passcode_lock_close, 4, hd.M0(r10 != 0 ? 2131744683 : 2131744684, null));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                } else {
                                    xb G5 = new cc(k2Var, q8Var.J0).G(R.raw.ic_save_to_gallery, 4, hd.M0(r10 != 0 ? 2131744669 : 2131744670, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!z7Var.n || !q8Var.A1) {
                        int i17 = z7Var.i;
                        if (i17 != 1) {
                            if (i17 != 3) {
                                if (i17 != 2) {
                                    if (i17 != 4) {
                                        if (i17 > 0) {
                                            arrayList4.clear();
                                            hashMap.clear();
                                            q8Var.I1 = z7Var.i;
                                            e8Var.d.a();
                                        } else {
                                            TLRPC.Chat chat = z7Var.h;
                                            if (chat != null) {
                                                long j3 = chat.id;
                                                if (q8.K0(q8Var, chat) > 200) {
                                                    try {
                                                        l8Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, l8Var.getContext(), q8Var.J0);
                                                    String M03 = hd.M0(2131749394, null);
                                                    t1 t1Var5 = alertDialog$Builder2.a;
                                                    t1Var5.S = M03;
                                                    t1Var5.U = hd.M0(2131749393, null);
                                                    i5.c.C(null, 2131747831, alertDialog$Builder2, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                                    if (arrayList5 != null) {
                                                        int size2 = arrayList5.size();
                                                        while (r10 < size2) {
                                                            Object obj5 = arrayList5.get(r10);
                                                            r10++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j3));
                                                    l8Var.j(true);
                                                } else {
                                                    TLRPC.Chat M04 = np.s1(q8Var.a).M0(Long.valueOf(j3));
                                                    TLRPC.ChatFull N0 = np.s1(q8Var.a).N0(j3);
                                                    if (N0 == null || (chatParticipants = N0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || N0.participants.participants.size() < N0.participants_count - 1) {
                                                        t1 t1Var6 = l8Var.H;
                                                        if (t1Var6 != null) {
                                                            t1Var6.dismiss();
                                                            l8Var.H = null;
                                                        }
                                                        l8Var.I = j3;
                                                        t1 t1Var7 = new t1(3, l8Var.getContext(), q8Var.J0);
                                                        l8Var.H = t1Var7;
                                                        t1Var7.r(50L);
                                                        vr a02 = vr.a0(q8Var.a);
                                                        a02.a.c(new f2(l8Var, M04, a02, j3, 12));
                                                    } else {
                                                        l8Var.e(j3, N0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(l8Var.J)) {
                                                        e8Var.setText("");
                                                        l8Var.J = null;
                                                        l8Var.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = z7Var.g;
                                                if (user != null) {
                                                    if (l8Var.a == 0) {
                                                        q8Var.I1 = 0;
                                                    }
                                                    long j10 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList4);
                                                    if (arrayList4.contains(Long.valueOf(j10))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j10));
                                                        hVar.k(Boolean.FALSE, j10);
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
                                                        if (!TextUtils.isEmpty(l8Var.J)) {
                                                            e8Var.setText("");
                                                            l8Var.J = null;
                                                            l8Var.h(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j10);
                                                    }
                                                    arrayList4.clear();
                                                    arrayList4.addAll(hashSet);
                                                    l8Var.j(true);
                                                }
                                            }
                                        }
                                        l8Var.g(true);
                                        l8Var.f(true);
                                        e8Var.M = true;
                                        break;
                                    } else {
                                        if (q8Var.I1 == 4) {
                                            q8Var.H1 = 4;
                                            q8Var.m1.C(1);
                                        }
                                        q8Var.I1 = 4;
                                        l8Var.g(true);
                                        break;
                                    }
                                } else {
                                    if (q8Var.I1 == 2) {
                                        q8Var.H1 = 2;
                                        q8Var.m1.C(1);
                                    }
                                    q8Var.I1 = 2;
                                    l8Var.g(true);
                                    break;
                                }
                            } else {
                                if (q8Var.I1 == 3 || (q8Var.s1.isEmpty() && q8Var.t1.isEmpty())) {
                                    q8Var.H1 = 3;
                                    q8Var.m1.C(1);
                                }
                                q8Var.I1 = 3;
                                l8Var.g(true);
                                break;
                            }
                        } else {
                            if (q8Var.I1 == 1 || q8.J0(q8Var).isEmpty()) {
                                q8Var.H1 = 1;
                                q8Var.m1.C(1);
                            }
                            q8Var.I1 = 1;
                            l8Var.g(true);
                            break;
                        }
                    } else {
                        new u7(context, q8Var.a, q8Var.F1, q8Var.n1, new c8(l8Var, r10), q8Var.J0).show();
                        break;
                    }
                }
                break;
        }
    }

    @Override // ai.g
    public void g(String str) {
        ai.m0 m0Var = (ai.m0) this.b;
        ai.h hVar = (ai.h) this.c;
        if (m0Var.r != 4) {
            return;
        }
        org.telegram.messenger.g0.i3(new aa.r(m0Var, str, hVar, 2), Math.max(0L, (m0Var.V + 1200) - SystemClock.uptimeMillis()));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                bi.y yVar = (bi.y) this.b;
                bi.u uVar = (bi.u) this.c;
                try {
                    int parseInt = Integer.parseInt(uVar.getText().toString().trim());
                    yVar.g1(parseInt);
                    yVar.Y1.setValue(parseInt);
                    t1Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.E3(uVar);
                    a8.g(th2, true);
                    return;
                }
            case 4:
                j3 j3Var = (j3) this.b;
                z10 z10Var = (z10) this.c;
                String obj = j3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    z10Var.a(obj);
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.E3(j3Var);
                    break;
                }
                break;
            case 16:
                c6 c6Var = (c6) this.b;
                wg.c1 c1Var = (wg.c1) this.c;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                int i10 = c6Var.a;
                g3 g3Var = new g3(c6Var, h, c1Var, 1);
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i10);
                x10.m0(new u11(i10, g3Var, x10));
                break;
            case 19:
                t3 t3Var = (t3) this.b;
                fi.e1 e1Var = ((i9) this.c).B0;
                if (e1Var == null) {
                    b4.d0(t3Var.x);
                    break;
                } else if (!e1Var.x) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = e1Var.f;
                    ConnectionsManager.getInstance(e1Var.e).sendRequest(discardgroupcall, new y0(e1Var, 4));
                    e1Var.e();
                    break;
                }
                break;
            case 21:
                h1 h1Var = (h1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h1Var.getClass();
                zArr[0] = true;
                h1Var.Q();
                break;
            case 24:
                kg.y.d(r5.currentAccount).a((kg.v) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            default:
                n3.B0((n3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
        }
    }

    @Override // u9.d
    public Object i(r7 r7Var) {
        String valueOf;
        switch (this.a) {
            case 9:
                String str = (String) this.b;
                n2.a0 a0Var = (n2.a0) this.c;
                Context context = (Context) r7Var.a(Context.class);
                switch (a0Var.a) {
                    case 8:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 9:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 10:
                        int i7 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new cb.a(str, valueOf);
            default:
                String str2 = (String) this.b;
                u9.a aVar = (u9.a) this.c;
                try {
                    Trace.beginSection(str2);
                    return aVar.f.i(r7Var);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        ((m2.b) obj).r((m2.a) this.b, (x2.b0) this.c);
    }

    @Override // jh.i
    public void j(RectF rectF, View view) {
        fh.g gVar = (fh.g) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        gVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // org.telegram.ui.ka1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((di.t) this.b).u0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        kg.n nVar = (kg.n) this.b;
        View view = (View) this.c;
        nVar.x = false;
        org.telegram.messenger.g0.r(nVar.e);
        kg.i iVar = nVar.n;
        nVar.y = document;
        iVar.setSticker(document);
        ((org.telegram.ui.Cells.l8) view).setValueSticker(document);
        nVar.j0(true);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        bi.h4 h4Var = (bi.h4) this.b;
        hi.d dVar = (hi.d) this.c;
        View view = (View) obj2;
        long j3 = ((TL_stars.SavedStarGift) ((b41) obj).G).gift.id;
        if (h4Var.m1 == j3) {
            h4Var.m1 = 0L;
        } else {
            h4Var.m1 = j3;
        }
        dVar.setEnabled(h4Var.m1 != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof rl0) {
                    rl0 rl0Var = (rl0) childAt;
                    rl0Var.b(h4Var.m1 == rl0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ci.a0 a0Var = (ci.a0) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (a0Var.W || a0Var.i0 || a0Var.m0) {
            return;
        }
        a0Var.i0 = true;
        a0Var.h0.postDelayed(a0Var.z0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((h) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i gVar;
        switch (this.a) {
            case 8:
                c1.f fVar = (c1.f) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e10.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str2);
                    }
                    gVar = new w0.h(2, str2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        gVar = new w0.k(str2);
                    }
                    gVar = new w0.h(2, str2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    }
                    gVar = new w0.h(2, str2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                fVar.g().execute(new c1.a(fVar, gVar, 0));
                return;
            default:
                d1.e eVar = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str3 = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(2, str4);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.j.h("executor");
                    throw null;
                }
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        k kVar = (k) this.b;
        String str = (String) this.c;
        synchronized (kVar) {
            ((a0.f) kVar.b).remove(str);
        }
        return task;
    }

    private final /* synthetic */ void n(View view, float f10, float f11) {
    }

    private final /* synthetic */ void o(View view, float f10, float f11) {
    }
}
