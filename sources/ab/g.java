package ab;

import a8.r7;
import ai.f1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.e4;
import bi.f2;
import bi.g2;
import bi.k7;
import bi.r3;
import bi.w2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.i4;
import di.p9;
import di.s7;
import di.y0;
import di.z3;
import e2.c1;
import fi.b8;
import fi.e8;
import fi.g8;
import fi.n8;
import fi.q8;
import fi.s8;
import fi.u8;
import fi.w7;
import fi.y7;
import hi.q3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import jg.i1;
import kg.a1;
import l2.z0;
import li.a3;
import li.e6;
import li.g1;
import li.g4;
import li.p5;
import li.t3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.y10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ws;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d10;
import org.telegram.ui.ha0;
import org.telegram.ui.la1;
import org.telegram.ui.ma0;
import org.telegram.ui.pa0;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener, Continuation, CameraView.CameraViewDelegate, la1, r1, OnFailureListener, u9.d, r01, jh.i, y7, cj0, dj0, y10, ma0, li.m0, ws, g4, h2.p, h2.o, ni.p {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // li.m0
    public k60 a(g1 g1Var) {
        wf.b bVar = (wf.b) this.b;
        f6 f6Var = (f6) this.c;
        li.p pVar = (li.p) bVar.c;
        k60 k60Var = new k60(pVar, f6Var, g1Var, false, false, true);
        pVar.H = k60Var;
        return k60Var;
    }

    @Override // jh.i
    public void b(RectF rectF, View view) {
        fh.g gVar = (fh.g) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        gVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        return q3.E0((q3) this.b, (Context) this.c, view, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.I;
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
        r2.a.f3.O(true);
        r2.Z(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.D != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.I : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.D = true;
        r1 = r3.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.ma0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        a1 a1Var = (a1) this.b;
        pa0 pa0Var = (pa0) this.c;
        a1Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(a1Var.y)) {
            ha0 ha0Var = pa0Var.P;
        }
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        String valueOf;
        switch (this.a) {
            case 7:
                String str = (String) this.b;
                ni.a aVar = (ni.a) this.c;
                Context context = (Context) r7Var.a(Context.class);
                switch (aVar.a) {
                    case 4:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 5:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 6:
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
                u9.a aVar2 = (u9.a) this.c;
                try {
                    Trace.beginSection(str2);
                    return aVar2.f.e(r7Var);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z9;
        String str;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        n8 n8Var = (n8) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = n8Var.L;
        a0.h hVar = n8Var.b;
        g8 g8Var = n8Var.y;
        ArrayList arrayList3 = n8Var.c;
        HashMap hashMap = n8Var.d;
        s8 s8Var = n8Var.W;
        l2 l2Var = s8Var.c;
        if (i7 < 0 || i7 >= arrayList2.size()) {
            return;
        }
        b8 b8Var = (b8) arrayList2.get(i7);
        int i10 = b8Var.a;
        if (i10 != 3) {
            int i11 = 7;
            if (i10 != 7) {
                if (i10 == 9) {
                    int i12 = b8Var.q;
                    if (i12 == 0) {
                        u8 u8Var = s8Var.T1;
                        if (u8Var != null) {
                            u8Var.run();
                            return;
                        }
                        return;
                    }
                    if (i12 == 1) {
                        TLRPC.InputPeer inputPeer = s8Var.j1;
                        long n10 = inputPeer != null ? m5.n(inputPeer) : p10.i(s8Var.a).e();
                        k60 F = k60.F(n8Var, s8Var.I0, view);
                        F.c(R.drawable.msg_addfolder, hd.M0(2131744786, null), new r3(n8Var, n10, i11), false);
                        F.k();
                        k60.f(F, qp.s1(s8Var.a).P1().B(n10, true), s8Var.r1, false, null, new f1(12, n8Var, F));
                        F.Z();
                        return;
                    }
                    if (i12 != 5) {
                        if (i12 == 6) {
                            s8Var.x1 = false;
                            n8Var.h(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = n8Var.getContext();
                    int i13 = s8.U1;
                    u1 u1Var = new u1(3, context2, s8Var.I0);
                    u1Var.r(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = s8Var.j1;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    ConnectionsManager.getInstance(s8Var.a).sendRequest(getgroupcallstreamrtmpurl, new f2(n8Var, u1Var, getgroupcallstreamrtmpurl));
                    return;
                }
                return;
            }
            if (view instanceof m8) {
                m8 m8Var = (m8) view;
                m8Var.setChecked(!m8Var.d());
                b8Var.k = m8Var.d();
                int i14 = b8Var.c;
                if (i14 == 0) {
                    boolean d = m8Var.d();
                    s8Var.t1 = d;
                    r13 = s8Var.E1 == 4 ? 1 : 0;
                    if (d) {
                        cc G = new hc(l2Var, s8Var.I0).G(R.raw.ic_save_to_gallery, 4, hd.M0(r13 != 0 ? 2131744670 : 2131744671, null));
                        G.j = 5000;
                        G.k(true);
                        return;
                    } else {
                        cc G2 = new hc(l2Var, s8Var.I0).G(R.raw.passcode_lock_close, 4, hd.M0(r13 != 0 ? 2131744684 : 2131744685, null));
                        G2.j = 5000;
                        G2.k(true);
                        return;
                    }
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        s8Var.s1 = m8Var.d();
                        n8Var.h(true);
                        return;
                    }
                    return;
                }
                boolean d2 = m8Var.d();
                s8Var.u1 = d2;
                boolean z10 = s8Var.j1 instanceof TLRPC.TL_inputPeerChannel;
                if (d2) {
                    cc G3 = new hc(l2Var, s8Var.I0).G(R.raw.msg_story_keep, 4, hd.M0(z10 ? 2131744708 : 2131744672, null));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    cc G4 = new hc(l2Var, s8Var.I0).G(R.raw.fire_on, 4, hd.M0(z10 ? 2131744709 : 2131744686, null));
                    G4.j = 5000;
                    G4.k(true);
                }
                n8Var.h(true);
                return;
            }
            return;
        }
        if (b8Var.n && s8Var.w1) {
            new w7(context, s8Var.a, s8Var.B1, s8Var.j1, new e8(n8Var, r13), s8Var.I0).show();
            return;
        }
        int i15 = b8Var.i;
        if (i15 == 1) {
            if (s8Var.E1 == 1 || s8.J0(s8Var).isEmpty()) {
                s8Var.D1 = 1;
                s8Var.i1.E(1);
            }
            s8Var.E1 = 1;
            n8Var.g(true);
            return;
        }
        if (i15 == 3) {
            if (s8Var.E1 == 3 || (s8Var.o1.isEmpty() && s8Var.p1.isEmpty())) {
                s8Var.D1 = 3;
                s8Var.i1.E(1);
            }
            s8Var.E1 = 3;
            n8Var.g(true);
            return;
        }
        if (i15 == 2) {
            if (s8Var.E1 == 2) {
                s8Var.D1 = 2;
                s8Var.i1.E(1);
            }
            s8Var.E1 = 2;
            n8Var.g(true);
            return;
        }
        if (i15 == 4) {
            if (s8Var.E1 == 4) {
                s8Var.D1 = 4;
                s8Var.i1.E(1);
            }
            s8Var.E1 = 4;
            n8Var.g(true);
            return;
        }
        if (i15 <= 0) {
            TLRPC.Chat chat = b8Var.h;
            if (chat != null) {
                long j3 = chat.id;
                if (s8.K0(s8Var, chat) > 200) {
                    try {
                        n8Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getContext(), s8Var.I0);
                    String M0 = hd.M0(2131749393, null);
                    u1 u1Var2 = alertDialog$Builder.a;
                    u1Var2.R = M0;
                    u1Var2.T = hd.M0(2131749392, null);
                    jg.g.C(null, 2131747830, alertDialog$Builder, null);
                } else if (hashMap.containsKey(Long.valueOf(j3))) {
                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (r13 < size) {
                            Object obj = arrayList4.get(r13);
                            r13++;
                            hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                        }
                    }
                    hashMap.remove(Long.valueOf(j3));
                    n8Var.j(true);
                } else {
                    TLRPC.Chat M02 = qp.s1(s8Var.a).M0(Long.valueOf(j3));
                    TLRPC.ChatFull N0 = qp.s1(s8Var.a).N0(j3);
                    if (N0 == null || (chatParticipants = N0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || N0.participants.participants.size() < N0.participants_count - 1) {
                        u1 u1Var3 = n8Var.G;
                        if (u1Var3 != null) {
                            u1Var3.dismiss();
                            str = null;
                            n8Var.G = null;
                        } else {
                            str = null;
                        }
                        n8Var.H = j3;
                        u1 u1Var4 = new u1(3, n8Var.getContext(), s8Var.I0);
                        n8Var.G = u1Var4;
                        u1Var4.r(50L);
                        yr a02 = yr.a0(s8Var.a);
                        z9 = true;
                        a02.a.c(new w2(n8Var, M02, a02, j3, 12));
                    } else {
                        n8Var.e(j3, N0.participants);
                        z9 = true;
                        str = null;
                    }
                    if (!TextUtils.isEmpty(n8Var.I)) {
                        g8Var.setText("");
                        n8Var.I = str;
                        n8Var.h(false);
                    }
                }
            } else {
                z9 = true;
                TLRPC.User user = b8Var.g;
                if (user != null) {
                    if (n8Var.a == 0) {
                        s8Var.E1 = 0;
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
                        if (!TextUtils.isEmpty(n8Var.I)) {
                            g8Var.setText("");
                            n8Var.I = null;
                            n8Var.h(false);
                        }
                        hVar.k(Boolean.TRUE, j10);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    n8Var.j(true);
                }
            }
            n8Var.g(z9);
            n8Var.f(z9);
            g8Var.L = z9;
        }
        arrayList3.clear();
        hashMap.clear();
        s8Var.E1 = b8Var.i;
        g8Var.d.a();
        z9 = true;
        n8Var.g(z9);
        n8Var.f(z9);
        g8Var.L = z9;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 5:
                k7 k7Var = (k7) this.b;
                wg.f1 f1Var = (wg.f1) this.c;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                int i10 = k7Var.a;
                e4 e4Var = new e4(k7Var, h, f1Var, 1);
                org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i10);
                x10.m0(new d10(i10, e4Var, x10));
                break;
            case 13:
                z3 z3Var = (z3) this.b;
                di.g1 g1Var = ((p9) this.c).A0;
                if (g1Var == null) {
                    i4.d0(z3Var.x);
                    break;
                } else if (!g1Var.x) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = g1Var.f;
                    ConnectionsManager.getInstance(g1Var.e).sendRequest(discardgroupcall, new y0(g1Var, 4));
                    g1Var.e();
                    break;
                }
                break;
            case 15:
                q3.B0((q3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 17:
                i1 i1Var = (i1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                i1Var.getClass();
                zArr[0] = true;
                i1Var.Q();
                break;
            default:
                kg.y.d(r5.currentAccount).a((kg.v) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // h2.p
    public void h(Object obj, e2.s sVar) {
        m2.b bVar = (m2.b) obj;
        bVar.E((c1) this.c, new wf.b(sVar, ((m2.e) this.b).e));
    }

    @Override // ni.p
    public void i(j2.n nVar) {
        org.telegram.messenger.g0.h3(new z0((SpannableString) this.b, nVar, (org.telegram.ui.ActionBar.p) this.c, 11));
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 27:
                ((m2.b) obj).r((m2.a) this.b, (x2.c0) this.c);
                break;
            default:
                ((m2.b) obj).onRenderedFirstFrame((m2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.la1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bi.z) this.b).u0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.messenger.y10
    public void k(Object obj, TLRPC.Document document, Boolean bool) {
        kg.m mVar = (kg.m) this.b;
        View view = (View) this.c;
        mVar.x = false;
        org.telegram.messenger.g0.r(mVar.e);
        kg.i iVar = mVar.n;
        mVar.y = document;
        iVar.setSticker(document);
        ((m8) view).setValueSticker(document);
        mVar.j0(true);
    }

    @Override // fi.y7
    public void l(q8 q8Var, boolean z9, boolean z10, boolean z11, boolean z12, TLRPC.InputPeer inputPeer, int i7, f2.h hVar, s7 s7Var) {
        switch (this.a) {
            case 11:
                i4 i4Var = (i4) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = qp.s1(i4Var.l2).j1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = q8Var.b;
                ConnectionsManager.getInstance(i4Var.l2).sendRequest(tL_stories_editStory, new g2(i4Var, hVar, storyItem, q8Var, 5));
                break;
            default:
                z3 z3Var = (z3) this.b;
                s8 s8Var = (s8) this.c;
                i4 i4Var2 = z3Var.x;
                di.g4 g4Var = i4Var2.x1;
                TL_stories.StoryItem storyItem2 = g4Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z11) {
                    qp.s1(i4Var2.l2).P1().r0(i4Var2.k1, i4Var2.e1, z11, null);
                }
                TL_stories.StoryItem storyItem3 = g4Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z9);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i4Var2.l2).sendRequest(togglegroupcallsettings, new bi.j(8, z3Var, s8Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ws
    public void m() {
        switch (this.a) {
            case 23:
                li.j0 j0Var = (li.j0) this.b;
                li.i0 i0Var = (li.i0) this.c;
                j0Var.i();
                i0Var.L1();
                break;
            default:
                li.m5 m5Var = (li.m5) this.b;
                p5 p5Var = (p5) this.c;
                TL_iv.pageTableCell pagetablecell = p5Var.b;
                if (pagetablecell != null) {
                    e6.d(pagetablecell, p5Var.a.getText());
                }
                a3 a3Var = m5Var.E;
                if (a3Var != null && m5Var.a != null) {
                    t3.S1(a3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ai.i0 i0Var = (ai.i0) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (i0Var.V || i0Var.h0 || i0Var.l0) {
            return;
        }
        i0Var.h0 = true;
        i0Var.g0.postDelayed(i0Var.y0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((h) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i gVar;
        switch (this.a) {
            case 6:
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
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                eVar.g().execute(new c1.a(eVar, gVar, 0));
                return;
            default:
                d1.e eVar2 = (d1.e) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.j.e(e10, "e");
                String str3 = ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(2, str4);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
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

    @Override // li.g4
    public void run(long j3) {
        li.q3 q3Var = (li.q3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        q3Var.a(str, tL_inlineButtonTypeUserProfile);
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

    public /* synthetic */ g(m2.a aVar, Object obj, long j3) {
        this.a = 28;
        this.b = aVar;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
