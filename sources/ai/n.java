package ai;

import android.content.Context;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b8.ke;
import ci.e9;
import com.google.android.gms.tasks.OnFailureListener;
import ei.r9;
import gi.a8;
import gi.d8;
import gi.f8;
import gi.o8;
import gi.r8;
import gi.t8;
import gi.v7;
import gi.v8;
import gi.x7;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.q10;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.da0;
import org.telegram.ui.h01;
import org.telegram.ui.ia0;
import org.telegram.ui.la0;
import org.telegram.ui.ll0;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements org.telegram.ui.ActionBar.p1, ci.s4, s10, gj0, t9.d, CameraView.CameraViewDelegate, OnFailureListener, ca1, h01, kh.i, x7, hj0, g2.q, g2.p, q10, ia0, mi.n0, vs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ci.s4
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        o4 o4Var = (o4) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        vp0 vp0Var = o4Var.a;
        o4Var.e.l.remove(savedStarGift);
        o4Var.f(true);
        int i3 = o4Var.b;
        if (j10 == h10.i(i3).e()) {
            fc a02 = fc.a0(vp0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = bd.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            ac O = a02.O(document, M0, bd.a0(null, null, 2131752888, k2.p1.l(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            ac O2 = fc.a0(vp0Var.a).O(tL_starGiftUnique.getDocument(), bd.M0(2131752885, null), bd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(i3, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.y0.c(true);
        }
    }

    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String, org.telegram.ui.ActionBar.p1] */
    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 4:
                h6 h6Var = (h6) obj2;
                g6 g6Var = (g6) obj;
                r31 G = h6Var.b2.G(i3 - 1);
                if (G != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.r;
                        if (!TextUtils.isEmpty(starGift.gift_address) && h6Var.a2) {
                            alertDialog$Builder = new AlertDialog$Builder(0, h6Var.getContext(), h6Var.J0);
                            r42 = 0;
                            String M0 = bd.M0(2131749800, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131749801, null);
                        } else if (!z10 || !(starGift instanceof TL_stars.TL_starGiftUnique)) {
                            if (!z10) {
                                ArrayList arrayList2 = g6Var.b.l;
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
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(h6Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(h6Var.getContext());
                                    r42 = 0;
                                    String M02 = bd.M0(2131749763, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                                    s1Var2.S = M02;
                                    s1Var2.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749764, bd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            h6Var.Y1.a(starGift);
                            h6Var.dismiss();
                            break;
                        } else {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                            org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, h6Var.getContext(), null);
                            s1Var3.r(400L);
                            long e10 = h10.i(h6Var.a).e();
                            dg.b bVar = tL_starGiftUnique.resale_ton_only ? dg.b.b : dg.b.a;
                            e9.x(h6Var.a, bVar).H(tL_starGiftUnique, e10, null, true, new c6(h6Var, s1Var3, bVar, tL_starGiftUnique, e10));
                            break;
                        }
                        k2.p1.B(r42, 2131747839, alertDialog$Builder, r42);
                        break;
                    }
                }
                break;
            default:
                o8 o8Var = (o8) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = o8Var.M;
                a0.h hVar = o8Var.b;
                f8 f8Var = o8Var.y;
                ArrayList arrayList4 = o8Var.c;
                HashMap hashMap = o8Var.d;
                t8 t8Var = o8Var.a0;
                org.telegram.ui.ActionBar.j2 j2Var = t8Var.c;
                if (i3 >= 0 && i3 < arrayList3.size()) {
                    a8 a8Var = (a8) arrayList3.get(i3);
                    int i12 = a8Var.a;
                    if (i12 != 3) {
                        int i13 = 7;
                        if (i12 != 7) {
                            if (i12 == 9) {
                                int i14 = a8Var.q;
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 5) {
                                            if (i14 == 6) {
                                                t8Var.y1 = false;
                                                o8Var.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = o8Var.getContext();
                                            int i15 = t8.V1;
                                            org.telegram.ui.ActionBar.s1 s1Var4 = new org.telegram.ui.ActionBar.s1(3, context2, t8Var.J0);
                                            s1Var4.r(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = t8Var.k1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(t8Var.a).sendRequest(getgroupcallstreamrtmpurl, new r6(o8Var, s1Var4, getgroupcallstreamrtmpurl, i13));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = t8Var.k1;
                                        long n4 = inputPeer2 != null ? org.telegram.messenger.m5.n(inputPeer2) : h10.i(t8Var.a).e();
                                        f60 F = f60.F(o8Var, t8Var.J0, view);
                                        F.c(R.drawable.msg_addfolder, bd.M0(2131744795, null), new ci.e3(o8Var, n4, i13), false);
                                        F.k();
                                        f60.f(F, hp.s1(t8Var.a).P1().B(n4, true), t8Var.s1, false, null, new o1(16, o8Var, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    v8 v8Var = t8Var.U1;
                                    if (v8Var != null) {
                                        v8Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof l8) {
                            l8 l8Var = (l8) view;
                            l8Var.setChecked(!l8Var.d());
                            a8Var.k = l8Var.d();
                            int i16 = a8Var.c;
                            if (i16 != 0) {
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        t8Var.t1 = l8Var.d();
                                        o8Var.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = l8Var.d();
                                    t8Var.v1 = d;
                                    boolean z11 = t8Var.k1 instanceof TLRPC.TL_inputPeerChannel;
                                    if (d) {
                                        ac G2 = new fc(j2Var, t8Var.J0).G(R.raw.msg_story_keep, 4, bd.M0(z11 ? 2131744717 : 2131744681, null));
                                        G2.j = 5000;
                                        G2.k(true);
                                    } else {
                                        ac G3 = new fc(j2Var, t8Var.J0).G(R.raw.fire_on, 4, bd.M0(z11 ? 2131744718 : 2131744695, null));
                                        G3.j = 5000;
                                        G3.k(true);
                                    }
                                    o8Var.h(true);
                                    break;
                                }
                            } else {
                                boolean d10 = l8Var.d();
                                t8Var.u1 = d10;
                                r10 = t8Var.F1 == 4 ? 1 : 0;
                                if (!d10) {
                                    ac G4 = new fc(j2Var, t8Var.J0).G(R.raw.passcode_lock_close, 4, bd.M0(r10 != 0 ? 2131744693 : 2131744694, null));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                } else {
                                    ac G5 = new fc(j2Var, t8Var.J0).G(R.raw.ic_save_to_gallery, 4, bd.M0(r10 != 0 ? 2131744679 : 2131744680, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!a8Var.n || !t8Var.x1) {
                        int i17 = a8Var.i;
                        if (i17 != 1) {
                            if (i17 != 3) {
                                if (i17 != 2) {
                                    if (i17 != 4) {
                                        if (i17 > 0) {
                                            arrayList4.clear();
                                            hashMap.clear();
                                            t8Var.F1 = a8Var.i;
                                            f8Var.d.a();
                                        } else {
                                            TLRPC.Chat chat = a8Var.h;
                                            if (chat != null) {
                                                long j10 = chat.id;
                                                if (t8.K0(t8Var, chat) > 200) {
                                                    try {
                                                        o8Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, o8Var.getContext(), t8Var.J0);
                                                    String M03 = bd.M0(2131749402, null);
                                                    org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder2.a;
                                                    s1Var5.S = M03;
                                                    s1Var5.U = bd.M0(2131749401, null);
                                                    k2.p1.B(null, 2131747839, alertDialog$Builder2, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                                    if (arrayList5 != null) {
                                                        int size2 = arrayList5.size();
                                                        while (r10 < size2) {
                                                            Object obj5 = arrayList5.get(r10);
                                                            r10++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j10));
                                                    o8Var.j(true);
                                                } else {
                                                    TLRPC.Chat M04 = hp.s1(t8Var.a).M0(Long.valueOf(j10));
                                                    TLRPC.ChatFull N0 = hp.s1(t8Var.a).N0(j10);
                                                    if (N0 == null || (chatParticipants = N0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || N0.participants.participants.size() < N0.participants_count - 1) {
                                                        org.telegram.ui.ActionBar.s1 s1Var6 = o8Var.H;
                                                        if (s1Var6 != null) {
                                                            s1Var6.dismiss();
                                                            o8Var.H = null;
                                                        }
                                                        o8Var.I = j10;
                                                        org.telegram.ui.ActionBar.s1 s1Var7 = new org.telegram.ui.ActionBar.s1(3, o8Var.getContext(), t8Var.J0);
                                                        o8Var.H = s1Var7;
                                                        s1Var7.r(50L);
                                                        qr a02 = qr.a0(t8Var.a);
                                                        a02.a.c(new ci.l2(o8Var, M04, a02, j10, 12));
                                                    } else {
                                                        o8Var.e(j10, N0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(o8Var.J)) {
                                                        f8Var.setText("");
                                                        o8Var.J = null;
                                                        o8Var.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = a8Var.g;
                                                if (user != null) {
                                                    if (o8Var.a == 0) {
                                                        t8Var.F1 = 0;
                                                    }
                                                    long j11 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList4);
                                                    if (arrayList4.contains(Long.valueOf(j11))) {
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
                                                        if (!TextUtils.isEmpty(o8Var.J)) {
                                                            f8Var.setText("");
                                                            o8Var.J = null;
                                                            o8Var.h(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j11);
                                                    }
                                                    arrayList4.clear();
                                                    arrayList4.addAll(hashSet);
                                                    o8Var.j(true);
                                                }
                                            }
                                        }
                                        o8Var.g(true);
                                        o8Var.f(true);
                                        f8Var.M = true;
                                        break;
                                    } else {
                                        if (t8Var.F1 == 4) {
                                            t8Var.E1 = 4;
                                            t8Var.j1.D(1);
                                        }
                                        t8Var.F1 = 4;
                                        o8Var.g(true);
                                        break;
                                    }
                                } else {
                                    if (t8Var.F1 == 2) {
                                        t8Var.E1 = 2;
                                        t8Var.j1.D(1);
                                    }
                                    t8Var.F1 = 2;
                                    o8Var.g(true);
                                    break;
                                }
                            } else {
                                if (t8Var.F1 == 3 || (t8Var.p1.isEmpty() && t8Var.q1.isEmpty())) {
                                    t8Var.E1 = 3;
                                    t8Var.j1.D(1);
                                }
                                t8Var.F1 = 3;
                                o8Var.g(true);
                                break;
                            }
                        } else {
                            if (t8Var.F1 == 1 || t8.J0(t8Var).isEmpty()) {
                                t8Var.E1 = 1;
                                t8Var.j1.D(1);
                            }
                            t8Var.F1 = 1;
                            o8Var.g(true);
                            break;
                        }
                    } else {
                        new v7(context, t8Var.a, t8Var.C1, t8Var.k1, new d8(o8Var, r10), t8Var.J0).show();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // gi.x7
    public void c(r8 r8Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i3, g2.c cVar, gi.f6 f6Var) {
        switch (this.a) {
            case 14:
                ei.j4 j4Var = (ei.j4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = hp.s1(j4Var.m2).j1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = r8Var.b;
                ConnectionsManager.getInstance(j4Var.m2).sendRequest(tL_stories_editStory, new q1(j4Var, cVar, storyItem, r8Var, 6));
                break;
            default:
                ei.b4 b4Var = (ei.b4) this.b;
                t8 t8Var = (t8) this.c;
                ei.j4 j4Var2 = b4Var.x;
                ei.h4 h4Var = j4Var2.y1;
                TL_stories.StoryItem storyItem2 = h4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    hp.s1(j4Var2.m2).P1().r0(j4Var2.l1, j4Var2.f1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = h4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i3);
                        ConnectionsManager.getInstance(j4Var2.m2).sendRequest(togglegroupcallsettings, new f3(11, b4Var, t8Var));
                        break;
                    }
                }
                break;
        }
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
    @Override // org.telegram.ui.ia0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        lg.b1 b1Var = (lg.b1) this.b;
        la0 la0Var = (la0) this.c;
        b1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(b1Var.y)) {
            da0 da0Var = la0Var.Q;
        }
    }

    @Override // g2.q
    public void e(Object obj, d2.t tVar) {
        l2.f fVar = (l2.f) this.b;
        d2.e1 e1Var = (d2.e1) this.c;
        l2.b bVar = (l2.b) obj;
        SparseArray sparseArray = fVar.e;
        tf.b bVar2 = new tf.b();
        bVar2.a = tVar;
        SparseBooleanArray sparseBooleanArray = tVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            int a10 = tVar.a(i3);
            l2.a aVar = (l2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        bVar2.b = sparseArray2;
        bVar.b(e1Var, bVar2);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        return ii.q3.E0((ii.q3) this.b, (Context) this.c, view, i3);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                z zVar = (z) this.c;
                try {
                    int parseInt = Integer.parseInt(zVar.getText().toString().trim());
                    e0Var.g1(parseInt);
                    e0Var.V1.setValue(parseInt);
                    s1Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.F3(zVar);
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 1:
                u3 u3Var = (u3) this.b;
                u10 u10Var = (u10) this.c;
                String obj = u3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    u10Var.a(obj);
                    s1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.F3(u3Var);
                    break;
                }
                break;
            case 10:
                ci.l6 l6Var = (ci.l6) this.b;
                xg.e1 e1Var = (xg.e1) this.c;
                sf.b h = s1Var.h(i3, true, true);
                h.d();
                int i10 = l6Var.a;
                ci.p3 p3Var = new ci.p3(l6Var, h, e1Var, 1);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                x10.m0(new rw(i10, p3Var, x10));
                break;
            case 16:
                ei.b4 b4Var = (ei.b4) this.b;
                ei.g1 g1Var = ((r9) this.c).B0;
                if (g1Var == null) {
                    ei.j4.d0(b4Var.x);
                    break;
                } else if (!g1Var.x) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = g1Var.f;
                    ConnectionsManager.getInstance(g1Var.e).sendRequest(discardgroupcall, new ei.y0(g1Var, 4));
                    g1Var.e();
                    break;
                }
                break;
            case 19:
                ii.q3.B0((ii.q3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 21:
                kg.e1 e1Var2 = (kg.e1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                e1Var2.getClass();
                zArr[0] = true;
                e1Var2.Q();
                break;
            default:
                lg.z.d(r5.currentAccount).a((lg.v) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // mi.n0
    public f60 h(mi.h1 h1Var) {
        m2.t tVar = (m2.t) this.b;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
        mi.p pVar = (mi.p) tVar.c;
        f60 f60Var = new f60(pVar, e6Var, h1Var, false, false, true);
        pVar.I = f60Var;
        return f60Var;
    }

    @Override // org.telegram.messenger.q10
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        lg.m mVar = (lg.m) this.b;
        View view = (View) this.c;
        mVar.x = false;
        org.telegram.messenger.g0.r(mVar.e);
        lg.i iVar = mVar.n;
        mVar.y = document;
        iVar.setSticker(document);
        ((l8) view).setValueSticker(document);
        mVar.j0(true);
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 23:
                ((l2.b) obj).D((l2.a) this.b, (w2.c0) this.c);
                break;
            default:
                ((l2.b) obj).onRenderedFirstFrame((l2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t4 t4Var = (t4) this.b;
        gi.d dVar = (gi.d) this.c;
        View view = (View) obj2;
        long j10 = ((TL_stars.SavedStarGift) ((r31) obj).G).gift.id;
        if (t4Var.j1 == j10) {
            t4Var.j1 = 0L;
        } else {
            t4Var.j1 = j10;
        }
        dVar.setEnabled(t4Var.j1 != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof ll0) {
                    ll0 ll0Var = (ll0) childAt;
                    ll0Var.b(t4Var.j1 == ll0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // kh.i
    public void k(RectF rectF, View view) {
        gh.g gVar = (gh.g) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        gVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // org.telegram.ui.ca1
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ci.v) this.b).u0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.ui.Components.vs
    public void m() {
        mi.k0 k0Var = (mi.k0) this.b;
        mi.j0 j0Var = (mi.j0) this.c;
        k0Var.i();
        j0Var.c2();
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        bi.a0 a0Var = (bi.a0) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (a0Var.W || a0Var.i0 || a0Var.m0) {
            return;
        }
        a0Var.i0 = true;
        a0Var.h0.postDelayed(a0Var.z0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i gVar;
        switch (this.a) {
            case 8:
                c1.e eVar = (c1.e) this.b;
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
                if (a1.h.a(cancellationSignal)) {
                    return;
                }
                eVar.f().execute(new c1.a(eVar, gVar, 0));
                return;
            default:
                d1.e eVar2 = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str3 = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(2, str4);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.h.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar2.g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar2, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.j.h("executor");
                    throw null;
                }
        }
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        switch (this.a) {
            case 5:
                return new bb.a((String) this.b, ((bb.d) this.c).a((Context) keVar.a(Context.class)));
            default:
                String str = (String) this.b;
                t9.a aVar = (t9.a) this.c;
                try {
                    Trace.beginSection(str);
                    return aVar.f.q1(keVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i3 = this.a;
    }

    public /* synthetic */ n(l2.a aVar, Object obj, long j10) {
        this.a = 24;
        this.b = aVar;
        this.c = obj;
    }

    private final /* synthetic */ void n(View view, float f10, float f11) {
    }

    private final /* synthetic */ void o(View view, float f10, float f11) {
    }
}
